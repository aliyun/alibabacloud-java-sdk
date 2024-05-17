// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class TransformClusterMemberRequest extends TeaModel {
    /**
     * <p>The ID of the instance that you want to import or migrate. Separate multiple IDs with commas (,).</p>
     * <br>
     * <p>*   An instance may not belong to a cluster, but an instance can belong to only one cluster at most.</p>
     * <p>*   The ECS instances and the destination cluster must be in the same virtual private cloud (VPC).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    /**
     * <p>The logon password of the ECS instance that you want to import or migrate to the cluster.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The ID of the destination cluster.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TargetClusterId")
    public String targetClusterId;

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

    public TransformClusterMemberRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public TransformClusterMemberRequest setTargetClusterId(String targetClusterId) {
        this.targetClusterId = targetClusterId;
        return this;
    }
    public String getTargetClusterId() {
        return this.targetClusterId;
    }

}
