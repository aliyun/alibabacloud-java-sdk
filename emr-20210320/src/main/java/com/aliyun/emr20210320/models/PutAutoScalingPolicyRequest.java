// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class PutAutoScalingPolicyRequest extends TeaModel {
    /**
     * <p>集群ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-b933c5aac8fe****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The maximum and minimum numbers of nodes in a node group.</p>
     */
    @NameInMap("Constraints")
    public ScalingConstraints constraints;

    /**
     * <p>节点组ID。节点组 Id-针对 ACK 集群，此字段为空。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ng-869471354ecd****</p>
     */
    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    /**
     * <p>区域ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The auto scaling rules. Number of elements in the array: 0 to 100.</p>
     */
    @NameInMap("ScalingRules")
    public java.util.List<ScalingRule> scalingRules;

    public static PutAutoScalingPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        PutAutoScalingPolicyRequest self = new PutAutoScalingPolicyRequest();
        return TeaModel.build(map, self);
    }

    public PutAutoScalingPolicyRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public PutAutoScalingPolicyRequest setConstraints(ScalingConstraints constraints) {
        this.constraints = constraints;
        return this;
    }
    public ScalingConstraints getConstraints() {
        return this.constraints;
    }

    public PutAutoScalingPolicyRequest setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    public PutAutoScalingPolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public PutAutoScalingPolicyRequest setScalingRules(java.util.List<ScalingRule> scalingRules) {
        this.scalingRules = scalingRules;
        return this;
    }
    public java.util.List<ScalingRule> getScalingRules() {
        return this.scalingRules;
    }

}
