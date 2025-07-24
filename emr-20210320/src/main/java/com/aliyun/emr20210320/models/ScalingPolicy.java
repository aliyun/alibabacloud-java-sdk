// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ScalingPolicy extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Constraints")
    public ManagedScalingConstraints constraints;

    @NameInMap("Disabled")
    public Boolean disabled;

    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    @NameInMap("NodeGroupName")
    public String nodeGroupName;

    @NameInMap("ScalingPolicyId")
    public String scalingPolicyId;

    /**
     * <strong>example:</strong>
     * <p>AUTO / MANAGED</p>
     */
    @NameInMap("ScalingPolicyType")
    public String scalingPolicyType;

    @NameInMap("ScalingRules")
    public java.util.List<ScalingRule> scalingRules;

    public static ScalingPolicy build(java.util.Map<String, ?> map) throws Exception {
        ScalingPolicy self = new ScalingPolicy();
        return TeaModel.build(map, self);
    }

    public ScalingPolicy setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ScalingPolicy setConstraints(ManagedScalingConstraints constraints) {
        this.constraints = constraints;
        return this;
    }
    public ManagedScalingConstraints getConstraints() {
        return this.constraints;
    }

    public ScalingPolicy setDisabled(Boolean disabled) {
        this.disabled = disabled;
        return this;
    }
    public Boolean getDisabled() {
        return this.disabled;
    }

    public ScalingPolicy setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    public ScalingPolicy setNodeGroupName(String nodeGroupName) {
        this.nodeGroupName = nodeGroupName;
        return this;
    }
    public String getNodeGroupName() {
        return this.nodeGroupName;
    }

    public ScalingPolicy setScalingPolicyId(String scalingPolicyId) {
        this.scalingPolicyId = scalingPolicyId;
        return this;
    }
    public String getScalingPolicyId() {
        return this.scalingPolicyId;
    }

    public ScalingPolicy setScalingPolicyType(String scalingPolicyType) {
        this.scalingPolicyType = scalingPolicyType;
        return this;
    }
    public String getScalingPolicyType() {
        return this.scalingPolicyType;
    }

    public ScalingPolicy setScalingRules(java.util.List<ScalingRule> scalingRules) {
        this.scalingRules = scalingRules;
        return this;
    }
    public java.util.List<ScalingRule> getScalingRules() {
        return this.scalingRules;
    }

}
