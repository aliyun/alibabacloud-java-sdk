// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class ModifyAccountPrivilegeRequest extends TeaModel {
    // 账户名称
    @NameInMap("Account")
    public String account;

    @NameInMap("DBClusterId")
    public String DBClusterId;

    // 账户权限类型 Normal:普通账户 | Readonly:只读账户 | Dml:DML账户-禁止DDL | Super:超级账户
    @NameInMap("PrivilegeType")
    public String privilegeType;

    @NameInMap("RegionId")
    public String regionId;

    public static ModifyAccountPrivilegeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccountPrivilegeRequest self = new ModifyAccountPrivilegeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAccountPrivilegeRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public ModifyAccountPrivilegeRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyAccountPrivilegeRequest setPrivilegeType(String privilegeType) {
        this.privilegeType = privilegeType;
        return this;
    }
    public String getPrivilegeType() {
        return this.privilegeType;
    }

    public ModifyAccountPrivilegeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
