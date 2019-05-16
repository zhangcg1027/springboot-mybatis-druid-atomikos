package com.wisesoft.plat.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wisesoft.plat.entity.TSysUserEntity;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * 用户表
 * 
 * @author flyCloud
 * @email 
 * @date 2018-08-31 15:01:21
 */
public interface TSysUserDao extends BaseMapper<TSysUserEntity> {
	
	/**
	 * 查询出所有用户的信息，用于IM服务器接口提供
	 * @return
	 */
	@Select("SELECT * FROM t_sys_user WHERE u.DELETED=0 AND u.state=0")
	List<Map<String,Object>> findAllUser();

}
