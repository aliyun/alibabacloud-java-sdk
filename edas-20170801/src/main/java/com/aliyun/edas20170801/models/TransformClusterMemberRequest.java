// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class TransformClusterMemberRequest extends TeaModel {
    @NameInMap("InstanceIds")
    public String instanceIds;

    @NameInMap("TargetClusterId")
    public String targetClusterId;

    @NameInMap("Password")
    public String password;

    public static TransformClusterMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        TransformClusterMemberRequest self = new TransformClusterMemberRequest();
        return TeaModel.build(map, self);
    }

    public TransformClusterMemberRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public TransformClusterMemberRequest setTargetClusterId(String targetClusterId) {
        this.targetClusterId = targetClusterId;
        return this;
    }
    public String getTargetClusterId() {
        return this.targetClusterId;
    }

    public TransformClusterMemberRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

}
