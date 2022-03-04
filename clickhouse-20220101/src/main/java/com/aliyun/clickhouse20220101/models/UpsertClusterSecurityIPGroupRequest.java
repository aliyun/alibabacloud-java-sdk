// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class UpsertClusterSecurityIPGroupRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    // 安全组名称
    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("RegionId")
    public String regionId;

    // IP列表 英文逗号分隔
    @NameInMap("SecurityIps")
    public String securityIps;

    public static UpsertClusterSecurityIPGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpsertClusterSecurityIPGroupRequest self = new UpsertClusterSecurityIPGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpsertClusterSecurityIPGroupRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public UpsertClusterSecurityIPGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public UpsertClusterSecurityIPGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpsertClusterSecurityIPGroupRequest setSecurityIps(String securityIps) {
        this.securityIps = securityIps;
        return this;
    }
    public String getSecurityIps() {
        return this.securityIps;
    }

}
