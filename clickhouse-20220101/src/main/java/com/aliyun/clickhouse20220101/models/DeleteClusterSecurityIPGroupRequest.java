// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class DeleteClusterSecurityIPGroupRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    // 安全组名称
    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteClusterSecurityIPGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteClusterSecurityIPGroupRequest self = new DeleteClusterSecurityIPGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteClusterSecurityIPGroupRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DeleteClusterSecurityIPGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public DeleteClusterSecurityIPGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
