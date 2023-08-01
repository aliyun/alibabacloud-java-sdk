// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateApplicationScalingRuleResponseBody extends TeaModel {
    /**
     * <p>The information about the auto scaling policy.</p>
     */
    @NameInMap("AppScalingRule")
    public UpdateApplicationScalingRuleResponseBodyAppScalingRule appScalingRule;

    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The message that is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateApplicationScalingRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationScalingRuleResponseBody self = new UpdateApplicationScalingRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationScalingRuleResponseBody setAppScalingRule(UpdateApplicationScalingRuleResponseBodyAppScalingRule appScalingRule) {
        this.appScalingRule = appScalingRule;
        return this;
    }
    public UpdateApplicationScalingRuleResponseBodyAppScalingRule getAppScalingRule() {
        return this.appScalingRule;
    }

    public UpdateApplicationScalingRuleResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UpdateApplicationScalingRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateApplicationScalingRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleDownPolicies extends TeaModel {
        /**
         * <p>The cycle of the policy check. Valid values: 0 to 1800. Unit: seconds.</p>
         */
        @NameInMap("PeriodSeconds")
        public Integer periodSeconds;

        /**
         * <p>The type of the policy. Valid values: Pods and Percent.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The policy value of auto scaling. Set the value to an integer greater than zero. If the policy type is Pods, the value of this parameter indicates the number of pods. If the policy type is Percent, the value of this parameter indicates a percentage, which can exceed 100%.</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleDownPolicies build(java.util.Map<String, ?> map) throws Exception {
            UpdateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleDownPolicies self = new UpdateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleDownPolicies();
            return TeaModel.build(map, self);
        }

        public UpdateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleDownPolicies setPeriodSeconds(Integer periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }
        public Integer getPeriodSeconds() {
            return this.periodSeconds;
        }

        public UpdateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleDownPolicies setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleDownPolicies setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleDown extends TeaModel {
        /**
         * <p>The configuration of the policy.</p>
         */
        @NameInMap("Policies")
        public java.util.List<UpdateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleDownPolicies> policies;

        /**
         * <p>The step size policy for the scale-in. Valid values: Max, Min, and Disable.</p>
         */
        @NameInMap("SelectPolicy")
        public String selectPolicy;

        /**
         * <p>The cooldown time of the scale-in. Valid values: 0 to 3600. Unit: seconds. Default value: 300.</p>
         */
        @NameInMap("StabilizationWindowSeconds")
        public Integer stabilizationWindowSeconds;

        public static UpdateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleDown build(java.util.Map<String, ?> map) throws Exception {
            UpdateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleDown self = new UpdateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleDown();
            return TeaModel.build(map, self);
        }

        public UpdateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleDown setPolicies(java.util.List<UpdateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleDownPolicies> policies) {
            this.policies = policies;
            return this;
        }
        public java.util.List<UpdateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleDownPolicies> getPolicies() {
            return this.policies;
        }

        public UpdateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleDown setSelectPolicy(String selectPolicy) {
            this.selectPolicy = selectPolicy;
            return this;
        }
        public String getSelectPolicy() {
            return this.selectPolicy;
        }

        public UpdateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleDown setStabilizationWindowSeconds(Integer stabilizationWindowSeconds) {
            this.stabilizationWindowSeconds = stabilizationWindowSeconds;
            return this;
        }
        public Integer getStabilizationWindowSeconds() {
            return this.stabilizationWindowSeconds;
        }

    }

    public static class UpdateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleUpPolicies extends TeaModel {
        /**
         * <p>The cycle of the policy check. Valid values: 0 to 1800. Unit: seconds.</p>
         */
        @NameInMap("PeriodSeconds")
        public Integer periodSeconds;

        /**
         * <p>The type of the policy. Valid values: Pods and Percent.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The policy value of auto scaling. Set the value to an integer greater than zero. If the policy type is Pods, the value of this parameter indicates the number of pods. If the policy type is Percent, the value of this parameter indicates a percentage, which can exceed 100%.</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleUpPolicies build(java.util.Map<String, ?> map) throws Exception {
            UpdateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleUpPolicies self = new UpdateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleUpPolicies();
            return TeaModel.build(map, self);
        }

        public UpdateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleUpPolicies setPeriodSeconds(Integer periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }
        public Integer getPeriodSeconds() {
            return this.periodSeconds;
        }

        public UpdateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleUpPolicies setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleUpPolicies setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleUp extends TeaModel {
        /**
         * <p>The configuration of the policy.</p>
         */
        @NameInMap("Policies")
        public java.util.List<UpdateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleUpPolicies> policies;

        /**
         * <p>The step size policy for the scale-out. Valid values: Max, Min, and Disable.</p>
         */
        @NameInMap("SelectPolicy")
        public String selectPolicy;

        /**
         * <p>The cooldown time of the scale-out. Valid values: 0 to 3600. Unit: seconds. Default value: 0.</p>
         */
        @NameInMap("StabilizationWindowSeconds")
        public Integer stabilizationWindowSeconds;

        public static UpdateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleUp build(java.util.Map<String, ?> map) throws Exception {
            UpdateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleUp self = new UpdateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleUp();
            return TeaModel.build(map, self);
        }

        public UpdateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleUp setPolicies(java.util.List<UpdateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleUpPolicies> policies) {
            this.policies = policies;
            return this;
        }
        public java.util.List<UpdateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleUpPolicies> getPolicies() {
            return this.policies;
        }

        public UpdateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleUp setSelectPolicy(String selectPolicy) {
            this.selectPolicy = selectPolicy;
            return this;
        }
        public String getSelectPolicy() {
            return this.selectPolicy;
        }

        public UpdateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleUp setStabilizationWindowSeconds(Integer stabilizationWindowSeconds) {
            this.stabilizationWindowSeconds = stabilizationWindowSeconds;
            return this;
        }
        public Integer getStabilizationWindowSeconds() {
            return this.stabilizationWindowSeconds;
        }

    }

    public static class UpdateApplicationScalingRuleResponseBodyAppScalingRuleBehaviour extends TeaModel {
        @NameInMap("ScaleDown")
        public UpdateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleDown scaleDown;

        @NameInMap("ScaleUp")
        public UpdateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleUp scaleUp;

        public static UpdateApplicationScalingRuleResponseBodyAppScalingRuleBehaviour build(java.util.Map<String, ?> map) throws Exception {
            UpdateApplicationScalingRuleResponseBodyAppScalingRuleBehaviour self = new UpdateApplicationScalingRuleResponseBodyAppScalingRuleBehaviour();
            return TeaModel.build(map, self);
        }

        public UpdateApplicationScalingRuleResponseBodyAppScalingRuleBehaviour setScaleDown(UpdateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleDown scaleDown) {
            this.scaleDown = scaleDown;
            return this;
        }
        public UpdateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleDown getScaleDown() {
            return this.scaleDown;
        }

        public UpdateApplicationScalingRuleResponseBodyAppScalingRuleBehaviour setScaleUp(UpdateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleUp scaleUp) {
            this.scaleUp = scaleUp;
            return this;
        }
        public UpdateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleUp getScaleUp() {
            return this.scaleUp;
        }

    }

    public static class UpdateApplicationScalingRuleResponseBodyAppScalingRuleMetricMetrics extends TeaModel {
        /**
         * <p>This parameter is deprecated.</p>
         */
        @NameInMap("MetricTargetAverageUtilization")
        public Integer metricTargetAverageUtilization;

        /**
         * <p>This parameter is deprecated.</p>
         */
        @NameInMap("MetricType")
        public String metricType;

        public static UpdateApplicationScalingRuleResponseBodyAppScalingRuleMetricMetrics build(java.util.Map<String, ?> map) throws Exception {
            UpdateApplicationScalingRuleResponseBodyAppScalingRuleMetricMetrics self = new UpdateApplicationScalingRuleResponseBodyAppScalingRuleMetricMetrics();
            return TeaModel.build(map, self);
        }

        public UpdateApplicationScalingRuleResponseBodyAppScalingRuleMetricMetrics setMetricTargetAverageUtilization(Integer metricTargetAverageUtilization) {
            this.metricTargetAverageUtilization = metricTargetAverageUtilization;
            return this;
        }
        public Integer getMetricTargetAverageUtilization() {
            return this.metricTargetAverageUtilization;
        }

        public UpdateApplicationScalingRuleResponseBodyAppScalingRuleMetricMetrics setMetricType(String metricType) {
            this.metricType = metricType;
            return this;
        }
        public String getMetricType() {
            return this.metricType;
        }

    }

    public static class UpdateApplicationScalingRuleResponseBodyAppScalingRuleMetric extends TeaModel {
        /**
         * <p>This parameter is deprecated.</p>
         */
        @NameInMap("MaxReplicas")
        public Integer maxReplicas;

        /**
         * <p>This parameter is deprecated.</p>
         */
        @NameInMap("Metrics")
        public java.util.List<UpdateApplicationScalingRuleResponseBodyAppScalingRuleMetricMetrics> metrics;

        /**
         * <p>This parameter is deprecated.</p>
         */
        @NameInMap("MinReplicas")
        public Integer minReplicas;

        public static UpdateApplicationScalingRuleResponseBodyAppScalingRuleMetric build(java.util.Map<String, ?> map) throws Exception {
            UpdateApplicationScalingRuleResponseBodyAppScalingRuleMetric self = new UpdateApplicationScalingRuleResponseBodyAppScalingRuleMetric();
            return TeaModel.build(map, self);
        }

        public UpdateApplicationScalingRuleResponseBodyAppScalingRuleMetric setMaxReplicas(Integer maxReplicas) {
            this.maxReplicas = maxReplicas;
            return this;
        }
        public Integer getMaxReplicas() {
            return this.maxReplicas;
        }

        public UpdateApplicationScalingRuleResponseBodyAppScalingRuleMetric setMetrics(java.util.List<UpdateApplicationScalingRuleResponseBodyAppScalingRuleMetricMetrics> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<UpdateApplicationScalingRuleResponseBodyAppScalingRuleMetricMetrics> getMetrics() {
            return this.metrics;
        }

        public UpdateApplicationScalingRuleResponseBodyAppScalingRuleMetric setMinReplicas(Integer minReplicas) {
            this.minReplicas = minReplicas;
            return this;
        }
        public Integer getMinReplicas() {
            return this.minReplicas;
        }

    }

    public static class UpdateApplicationScalingRuleResponseBodyAppScalingRuleTriggerTriggers extends TeaModel {
        /**
         * <p>The metadata of the trigger.</p>
         */
        @NameInMap("MetaData")
        public String metaData;

        /**
         * <p>The name of the trigger.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the trigger. Valid values: cron and app_metric.</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdateApplicationScalingRuleResponseBodyAppScalingRuleTriggerTriggers build(java.util.Map<String, ?> map) throws Exception {
            UpdateApplicationScalingRuleResponseBodyAppScalingRuleTriggerTriggers self = new UpdateApplicationScalingRuleResponseBodyAppScalingRuleTriggerTriggers();
            return TeaModel.build(map, self);
        }

        public UpdateApplicationScalingRuleResponseBodyAppScalingRuleTriggerTriggers setMetaData(String metaData) {
            this.metaData = metaData;
            return this;
        }
        public String getMetaData() {
            return this.metaData;
        }

        public UpdateApplicationScalingRuleResponseBodyAppScalingRuleTriggerTriggers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateApplicationScalingRuleResponseBodyAppScalingRuleTriggerTriggers setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateApplicationScalingRuleResponseBodyAppScalingRuleTrigger extends TeaModel {
        /**
         * <p>The maximum number of replicas. The maximum value is 1000.</p>
         */
        @NameInMap("MaxReplicas")
        public Integer maxReplicas;

        /**
         * <p>The minimum number of replicas. The minimum value is 0.</p>
         */
        @NameInMap("MinReplicas")
        public Integer minReplicas;

        /**
         * <p>The configurations of the trigger.</p>
         */
        @NameInMap("Triggers")
        public java.util.List<UpdateApplicationScalingRuleResponseBodyAppScalingRuleTriggerTriggers> triggers;

        public static UpdateApplicationScalingRuleResponseBodyAppScalingRuleTrigger build(java.util.Map<String, ?> map) throws Exception {
            UpdateApplicationScalingRuleResponseBodyAppScalingRuleTrigger self = new UpdateApplicationScalingRuleResponseBodyAppScalingRuleTrigger();
            return TeaModel.build(map, self);
        }

        public UpdateApplicationScalingRuleResponseBodyAppScalingRuleTrigger setMaxReplicas(Integer maxReplicas) {
            this.maxReplicas = maxReplicas;
            return this;
        }
        public Integer getMaxReplicas() {
            return this.maxReplicas;
        }

        public UpdateApplicationScalingRuleResponseBodyAppScalingRuleTrigger setMinReplicas(Integer minReplicas) {
            this.minReplicas = minReplicas;
            return this;
        }
        public Integer getMinReplicas() {
            return this.minReplicas;
        }

        public UpdateApplicationScalingRuleResponseBodyAppScalingRuleTrigger setTriggers(java.util.List<UpdateApplicationScalingRuleResponseBodyAppScalingRuleTriggerTriggers> triggers) {
            this.triggers = triggers;
            return this;
        }
        public java.util.List<UpdateApplicationScalingRuleResponseBodyAppScalingRuleTriggerTriggers> getTriggers() {
            return this.triggers;
        }

    }

    public static class UpdateApplicationScalingRuleResponseBodyAppScalingRule extends TeaModel {
        /**
         * <p>The ID of the application to which the auto scaling policy belongs.</p>
         */
        @NameInMap("AppId")
        public String appId;

        @NameInMap("Behaviour")
        public UpdateApplicationScalingRuleResponseBodyAppScalingRuleBehaviour behaviour;

        /**
         * <p>The time when the auto scaling policy was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The time when the auto scaling policy was last disabled. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("LastDisableTime")
        public Long lastDisableTime;

        /**
         * <p>This parameter is deprecated.</p>
         */
        @NameInMap("MaxReplicas")
        public Integer maxReplicas;

        /**
         * <p>This parameter is deprecated.</p>
         */
        @NameInMap("Metric")
        public UpdateApplicationScalingRuleResponseBodyAppScalingRuleMetric metric;

        /**
         * <p>This parameter is deprecated.</p>
         */
        @NameInMap("MinReplicas")
        public Integer minReplicas;

        /**
         * <p>Indicates whether the auto scaling policy is enabled. Valid values:</p>
         * <br>
         * <p>*   **true**: The auto scaling policy is enabled.</p>
         * <p>*   **false**: The auto scaling policy is disabled.</p>
         */
        @NameInMap("ScaleRuleEnabled")
        public Boolean scaleRuleEnabled;

        /**
         * <p>The name of the auto scaling policy.</p>
         */
        @NameInMap("ScaleRuleName")
        public String scaleRuleName;

        /**
         * <p>The type of the auto scaling policy. The value is fixed to trigger.</p>
         */
        @NameInMap("ScaleRuleType")
        public String scaleRuleType;

        /**
         * <p>The configurations of the trigger.</p>
         */
        @NameInMap("Trigger")
        public UpdateApplicationScalingRuleResponseBodyAppScalingRuleTrigger trigger;

        /**
         * <p>The time when the auto scaling policy was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static UpdateApplicationScalingRuleResponseBodyAppScalingRule build(java.util.Map<String, ?> map) throws Exception {
            UpdateApplicationScalingRuleResponseBodyAppScalingRule self = new UpdateApplicationScalingRuleResponseBodyAppScalingRule();
            return TeaModel.build(map, self);
        }

        public UpdateApplicationScalingRuleResponseBodyAppScalingRule setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public UpdateApplicationScalingRuleResponseBodyAppScalingRule setBehaviour(UpdateApplicationScalingRuleResponseBodyAppScalingRuleBehaviour behaviour) {
            this.behaviour = behaviour;
            return this;
        }
        public UpdateApplicationScalingRuleResponseBodyAppScalingRuleBehaviour getBehaviour() {
            return this.behaviour;
        }

        public UpdateApplicationScalingRuleResponseBodyAppScalingRule setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public UpdateApplicationScalingRuleResponseBodyAppScalingRule setLastDisableTime(Long lastDisableTime) {
            this.lastDisableTime = lastDisableTime;
            return this;
        }
        public Long getLastDisableTime() {
            return this.lastDisableTime;
        }

        public UpdateApplicationScalingRuleResponseBodyAppScalingRule setMaxReplicas(Integer maxReplicas) {
            this.maxReplicas = maxReplicas;
            return this;
        }
        public Integer getMaxReplicas() {
            return this.maxReplicas;
        }

        public UpdateApplicationScalingRuleResponseBodyAppScalingRule setMetric(UpdateApplicationScalingRuleResponseBodyAppScalingRuleMetric metric) {
            this.metric = metric;
            return this;
        }
        public UpdateApplicationScalingRuleResponseBodyAppScalingRuleMetric getMetric() {
            return this.metric;
        }

        public UpdateApplicationScalingRuleResponseBodyAppScalingRule setMinReplicas(Integer minReplicas) {
            this.minReplicas = minReplicas;
            return this;
        }
        public Integer getMinReplicas() {
            return this.minReplicas;
        }

        public UpdateApplicationScalingRuleResponseBodyAppScalingRule setScaleRuleEnabled(Boolean scaleRuleEnabled) {
            this.scaleRuleEnabled = scaleRuleEnabled;
            return this;
        }
        public Boolean getScaleRuleEnabled() {
            return this.scaleRuleEnabled;
        }

        public UpdateApplicationScalingRuleResponseBodyAppScalingRule setScaleRuleName(String scaleRuleName) {
            this.scaleRuleName = scaleRuleName;
            return this;
        }
        public String getScaleRuleName() {
            return this.scaleRuleName;
        }

        public UpdateApplicationScalingRuleResponseBodyAppScalingRule setScaleRuleType(String scaleRuleType) {
            this.scaleRuleType = scaleRuleType;
            return this;
        }
        public String getScaleRuleType() {
            return this.scaleRuleType;
        }

        public UpdateApplicationScalingRuleResponseBodyAppScalingRule setTrigger(UpdateApplicationScalingRuleResponseBodyAppScalingRuleTrigger trigger) {
            this.trigger = trigger;
            return this;
        }
        public UpdateApplicationScalingRuleResponseBodyAppScalingRuleTrigger getTrigger() {
            return this.trigger;
        }

        public UpdateApplicationScalingRuleResponseBodyAppScalingRule setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
