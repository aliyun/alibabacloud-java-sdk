// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class GetAutoScalingPolicyResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the auto scaling policy.</p>
     */
    @NameInMap("ScalingPolicy")
    public ScalingPolicy scalingPolicy;

    public static GetAutoScalingPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAutoScalingPolicyResponseBody self = new GetAutoScalingPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAutoScalingPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAutoScalingPolicyResponseBody setScalingPolicy(ScalingPolicy scalingPolicy) {
        this.scalingPolicy = scalingPolicy;
        return this;
    }
    public ScalingPolicy getScalingPolicy() {
        return this.scalingPolicy;
    }

    public static class Constraints extends TeaModel {
        /**
         * <p>The maximum number of nodes in the node group. Default value: 2000.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("MaxCapacity")
        public Integer maxCapacity;

        /**
         * <p>The minimum number of nodes in the node group. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MinCapacity")
        public Integer minCapacity;

        public static Constraints build(java.util.Map<String, ?> map) throws Exception {
            Constraints self = new Constraints();
            return TeaModel.build(map, self);
        }

        public Constraints setMaxCapacity(Integer maxCapacity) {
            this.maxCapacity = maxCapacity;
            return this;
        }
        public Integer getMaxCapacity() {
            return this.maxCapacity;
        }

        public Constraints setMinCapacity(Integer minCapacity) {
            this.minCapacity = minCapacity;
            return this;
        }
        public Integer getMinCapacity() {
            return this.minCapacity;
        }

    }

    public static class ScalingRules extends TeaModel {
        /**
         * <p>The scaling type. Valid values:</p>
         * <ul>
         * <li>SCALE_OUT</li>
         * <li>SCALE_IN</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SCALE_OUT</p>
         */
        @NameInMap("ActivityType")
        public String activityType;

        /**
         * <p>The adjustment type.</p>
         * 
         * <strong>example:</strong>
         * <p>CHANGE_IN_CAPACITY</p>
         */
        @NameInMap("AdjustmentType")
        public String adjustmentType;

        /**
         * <p>The adjustment value. The parameter value must be a positive integer, which indicates the number of instances that you want to add or remove.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("AdjustmentValue")
        public Integer adjustmentValue;

        /**
         * <p>The description of load-based scaling.</p>
         */
        @NameInMap("MetricsTrigger")
        public MetricsTrigger metricsTrigger;

        /**
         * <p>The name of the auto scaling rule.</p>
         * 
         * <strong>example:</strong>
         * <p>scaling-out-memory</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The description of time-based scaling.</p>
         */
        @NameInMap("TimeTrigger")
        public TimeTrigger timeTrigger;

        /**
         * <p>The type of the auto scaling rule. Valid values:</p>
         * <ul>
         * <li>TIME_TRIGGER: time-based scaling</li>
         * <li>METRICS_TRIGGER: load-based scaling</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TIME_TRIGGER</p>
         */
        @NameInMap("TriggerType")
        public String triggerType;

        public static ScalingRules build(java.util.Map<String, ?> map) throws Exception {
            ScalingRules self = new ScalingRules();
            return TeaModel.build(map, self);
        }

        public ScalingRules setActivityType(String activityType) {
            this.activityType = activityType;
            return this;
        }
        public String getActivityType() {
            return this.activityType;
        }

        public ScalingRules setAdjustmentType(String adjustmentType) {
            this.adjustmentType = adjustmentType;
            return this;
        }
        public String getAdjustmentType() {
            return this.adjustmentType;
        }

        public ScalingRules setAdjustmentValue(Integer adjustmentValue) {
            this.adjustmentValue = adjustmentValue;
            return this;
        }
        public Integer getAdjustmentValue() {
            return this.adjustmentValue;
        }

        public ScalingRules setMetricsTrigger(MetricsTrigger metricsTrigger) {
            this.metricsTrigger = metricsTrigger;
            return this;
        }
        public MetricsTrigger getMetricsTrigger() {
            return this.metricsTrigger;
        }

        public ScalingRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ScalingRules setTimeTrigger(TimeTrigger timeTrigger) {
            this.timeTrigger = timeTrigger;
            return this;
        }
        public TimeTrigger getTimeTrigger() {
            return this.timeTrigger;
        }

        public ScalingRules setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

    }

    public static class ScalingPolicy extends TeaModel {
        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c-b933c5aac8fe****</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The maximum and minimum numbers of node groups.</p>
         */
        @NameInMap("Constraints")
        public Constraints constraints;

        /**
         * <p>The ID of the node group.</p>
         * 
         * <strong>example:</strong>
         * <p>ng-869471354ecd****</p>
         */
        @NameInMap("NodeGroupId")
        public String nodeGroupId;

        /**
         * <p>The ID of the scaling policy.</p>
         * 
         * <strong>example:</strong>
         * <p>asp-asduwe23znl***</p>
         */
        @NameInMap("ScalingPolicyId")
        public String scalingPolicyId;

        /**
         * <p>The auto scaling rules.</p>
         */
        @NameInMap("ScalingRules")
        public java.util.List<ScalingRules> scalingRules;

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

        public ScalingPolicy setConstraints(Constraints constraints) {
            this.constraints = constraints;
            return this;
        }
        public Constraints getConstraints() {
            return this.constraints;
        }

        public ScalingPolicy setNodeGroupId(String nodeGroupId) {
            this.nodeGroupId = nodeGroupId;
            return this;
        }
        public String getNodeGroupId() {
            return this.nodeGroupId;
        }

        public ScalingPolicy setScalingPolicyId(String scalingPolicyId) {
            this.scalingPolicyId = scalingPolicyId;
            return this;
        }
        public String getScalingPolicyId() {
            return this.scalingPolicyId;
        }

        public ScalingPolicy setScalingRules(java.util.List<ScalingRules> scalingRules) {
            this.scalingRules = scalingRules;
            return this;
        }
        public java.util.List<ScalingRules> getScalingRules() {
            return this.scalingRules;
        }

    }

}
