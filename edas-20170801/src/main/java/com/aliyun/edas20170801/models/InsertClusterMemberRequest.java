// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertClusterMemberRequest extends TeaModel {
    @NameInMap("clusterId")
    public String clusterId;

    @NameInMap("instanceIds")
    public String instanceIds;

    @NameInMap("password")
    public String password;

    public static InsertClusterMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        InsertClusterMemberRequest self = new InsertClusterMemberRequest();
        return TeaModel.build(map, self);
    }

    public InsertClusterMemberRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public InsertClusterMemberRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public InsertClusterMemberRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

}
