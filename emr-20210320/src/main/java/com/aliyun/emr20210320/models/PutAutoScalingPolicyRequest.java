// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class PutAutoScalingPolicyRequest extends TeaModel {
    /**
     * <p>集群ID。</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>最大最小值约束。</p>
     */
    @NameInMap("Constraints")
    public ScalingConstraints constraints;

    /**
     * <p>节点组ID。节点组 Id-针对 ACK 集群，此字段为空。</p>
     */
    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    /**
     * <p>区域ID。</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>弹性伸缩规则描述列表。</p>
     * <p><p></p>
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
