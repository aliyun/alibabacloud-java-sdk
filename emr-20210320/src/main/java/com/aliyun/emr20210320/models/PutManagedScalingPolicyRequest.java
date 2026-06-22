// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class PutManagedScalingPolicyRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-b933c5aac8fe****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The maximum and minimum value constraints for the cluster.</p>
     */
    @NameInMap("Constraints")
    public ManagedScalingConstraints constraints;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static PutManagedScalingPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        PutManagedScalingPolicyRequest self = new PutManagedScalingPolicyRequest();
        return TeaModel.build(map, self);
    }

    public PutManagedScalingPolicyRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public PutManagedScalingPolicyRequest setConstraints(ManagedScalingConstraints constraints) {
        this.constraints = constraints;
        return this;
    }
    public ManagedScalingConstraints getConstraints() {
        return this.constraints;
    }

    public PutManagedScalingPolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
