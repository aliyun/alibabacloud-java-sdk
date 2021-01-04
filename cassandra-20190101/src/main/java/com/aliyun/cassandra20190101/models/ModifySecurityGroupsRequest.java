// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class ModifySecurityGroupsRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("SecurityGroupIds")
    public String securityGroupIds;

    public static ModifySecurityGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySecurityGroupsRequest self = new ModifySecurityGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ModifySecurityGroupsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ModifySecurityGroupsRequest setSecurityGroupIds(String securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }
    public String getSecurityGroupIds() {
        return this.securityGroupIds;
    }

}
