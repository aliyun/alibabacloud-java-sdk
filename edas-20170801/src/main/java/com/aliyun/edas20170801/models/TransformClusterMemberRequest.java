// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class TransformClusterMemberRequest extends TeaModel {
    /**
     * <p>The ID of the instance that you want to import or migrate. Separate multiple IDs with commas (,).</p>
     * <ul>
     * <li>An instance may not belong to a cluster, but an instance can belong to only one cluster at most.</li>
     * <li>The ECS instances and the destination cluster must be in the same virtual private cloud (VPC).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-2ze7s2v0b789k60p****</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    /**
     * <p>The logon password of the ECS instance that you want to import or migrate to the cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Hello****</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The ID of the destination cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>b3e3f77b-462e-<strong><strong>-</strong></strong>-bec8727a****</p>
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
