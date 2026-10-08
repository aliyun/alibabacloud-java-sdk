// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class TransformClusterMemberRequest extends TeaModel {
    /**
     * <p>The IDs of the ECS instances. Separate multiple IDs with a comma (,).</p>
     * <ul>
     * <li><p>The instances must be in the same VPC as the target cluster.</p>
     * </li>
     * <li><p>An instance can belong to only one cluster at a time.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-2ze7s2v0b789k60p****</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    /**
     * <p>The logon password to set for the instances.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Hello****</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The ID of the target cluster.</p>
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
