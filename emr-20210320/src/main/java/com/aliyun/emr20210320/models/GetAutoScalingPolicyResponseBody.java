// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class GetAutoScalingPolicyResponseBody extends TeaModel {
    /**
     * <p>请求ID。</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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
         * <p>最大值</p>
         */
        @NameInMap("MaxCapacity")
        public Integer maxCapacity;

        /**
         * <p>最小值</p>
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
         * <p>伸缩类型。取值范围：</p>
         * <p>- SCALE_OUT：扩容</p>
         * <p>- SCALE_IN：缩容</p>
         */
        @NameInMap("ActivityType")
        public String activityType;

        /**
         * <p>调整类型。CHANGE_IN_CAPACITY/EXACT_CAPACITY。</p>
         */
        @NameInMap("AdjustmentType")
        public String adjustmentType;

        /**
         * <p>调整值。需要为正数，代表需要扩容或者缩容的实例数量。</p>
         */
        @NameInMap("AdjustmentValue")
        public Integer adjustmentValue;

        /**
         * <p>按照负载伸缩描述。</p>
         */
        @NameInMap("MetricsTrigger")
        public MetricsTrigger metricsTrigger;

        /**
         * <p>弹性伸缩规则名称。</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>按照时间伸缩描述。</p>
         */
        @NameInMap("TimeTrigger")
        public TimeTrigger timeTrigger;

        /**
         * <p>伸缩规则类型。取值范围：</p>
         * <p>- TIME_TRIGGER: 按时间伸缩。</p>
         * <p>- METRICS_TRIGGER: 按负载伸缩。</p>
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
         * <p>集群ID。</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>最大最小值约束</p>
         */
        @NameInMap("Constraints")
        public Constraints constraints;

        /**
         * <p>节点组ID。</p>
         */
        @NameInMap("NodeGroupId")
        public String nodeGroupId;

        /**
         * <p>伸缩策略ID。</p>
         */
        @NameInMap("ScalingPolicyId")
        public String scalingPolicyId;

        /**
         * <p>伸缩规则列表</p>
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
