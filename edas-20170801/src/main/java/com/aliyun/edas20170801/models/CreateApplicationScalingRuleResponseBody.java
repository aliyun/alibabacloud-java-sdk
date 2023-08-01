// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class CreateApplicationScalingRuleResponseBody extends TeaModel {
    /**
     * <p>The information about the auto scaling policy.</p>
     */
    @NameInMap("AppScalingRule")
    public CreateApplicationScalingRuleResponseBodyAppScalingRule appScalingRule;

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

    public static CreateApplicationScalingRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationScalingRuleResponseBody self = new CreateApplicationScalingRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateApplicationScalingRuleResponseBody setAppScalingRule(CreateApplicationScalingRuleResponseBodyAppScalingRule appScalingRule) {
        this.appScalingRule = appScalingRule;
        return this;
    }
    public CreateApplicationScalingRuleResponseBodyAppScalingRule getAppScalingRule() {
        return this.appScalingRule;
    }

    public CreateApplicationScalingRuleResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateApplicationScalingRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateApplicationScalingRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleDownPolicies extends TeaModel {
        /**
         * <p>检查执行的周期，取值范围[0, 1800]，单位为秒。</p>
         */
        @NameInMap("PeriodSeconds")
        public Integer periodSeconds;

        /**
         * <p>策略类型，可为Pods或Percent。</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>弹性行为的策略值，大于零的整数。若策略类型为Pods，则该值表示Pods数量；若策略类型为Percent，则该值表示百分比，允许超过100%。</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleDownPolicies build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleDownPolicies self = new CreateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleDownPolicies();
            return TeaModel.build(map, self);
        }

        public CreateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleDownPolicies setPeriodSeconds(Integer periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }
        public Integer getPeriodSeconds() {
            return this.periodSeconds;
        }

        public CreateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleDownPolicies setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleDownPolicies setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleDown extends TeaModel {
        /**
         * <p>策略配置。</p>
         */
        @NameInMap("Policies")
        public java.util.List<CreateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleDownPolicies> policies;

        /**
         * <p>弹性缩容步长策略，可选值Max、Min、Disable。</p>
         */
        @NameInMap("SelectPolicy")
        public String selectPolicy;

        /**
         * <p>缩容冷却时间。取值范围[0, 3600]，单位为秒。默认为300秒。</p>
         */
        @NameInMap("StabilizationWindowSeconds")
        public Integer stabilizationWindowSeconds;

        public static CreateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleDown build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleDown self = new CreateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleDown();
            return TeaModel.build(map, self);
        }

        public CreateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleDown setPolicies(java.util.List<CreateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleDownPolicies> policies) {
            this.policies = policies;
            return this;
        }
        public java.util.List<CreateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleDownPolicies> getPolicies() {
            return this.policies;
        }

        public CreateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleDown setSelectPolicy(String selectPolicy) {
            this.selectPolicy = selectPolicy;
            return this;
        }
        public String getSelectPolicy() {
            return this.selectPolicy;
        }

        public CreateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleDown setStabilizationWindowSeconds(Integer stabilizationWindowSeconds) {
            this.stabilizationWindowSeconds = stabilizationWindowSeconds;
            return this;
        }
        public Integer getStabilizationWindowSeconds() {
            return this.stabilizationWindowSeconds;
        }

    }

    public static class CreateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleUpPolicies extends TeaModel {
        /**
         * <p>检查执行的周期，取值范围[0, 1800]，单位为秒。</p>
         */
        @NameInMap("PeriodSeconds")
        public Integer periodSeconds;

        /**
         * <p>策略类型，可为Pods或Percent。</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>弹性行为的策略值，大于零的整数。若策略类型为Pods，则该值表示Pods数量；若策略类型为Percent，则该值表示百分比，允许超过100%。</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleUpPolicies build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleUpPolicies self = new CreateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleUpPolicies();
            return TeaModel.build(map, self);
        }

        public CreateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleUpPolicies setPeriodSeconds(Integer periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }
        public Integer getPeriodSeconds() {
            return this.periodSeconds;
        }

        public CreateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleUpPolicies setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleUpPolicies setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleUp extends TeaModel {
        /**
         * <p>策略配置。</p>
         */
        @NameInMap("Policies")
        public java.util.List<CreateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleUpPolicies> policies;

        /**
         * <p>弹性扩容步长策略，可选值Max、Min、Disable。</p>
         */
        @NameInMap("SelectPolicy")
        public String selectPolicy;

        /**
         * <p>扩容冷却时间。取值范围[0, 3600]，单位为秒。默认为0秒。</p>
         */
        @NameInMap("StabilizationWindowSeconds")
        public Integer stabilizationWindowSeconds;

        public static CreateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleUp build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleUp self = new CreateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleUp();
            return TeaModel.build(map, self);
        }

        public CreateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleUp setPolicies(java.util.List<CreateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleUpPolicies> policies) {
            this.policies = policies;
            return this;
        }
        public java.util.List<CreateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleUpPolicies> getPolicies() {
            return this.policies;
        }

        public CreateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleUp setSelectPolicy(String selectPolicy) {
            this.selectPolicy = selectPolicy;
            return this;
        }
        public String getSelectPolicy() {
            return this.selectPolicy;
        }

        public CreateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleUp setStabilizationWindowSeconds(Integer stabilizationWindowSeconds) {
            this.stabilizationWindowSeconds = stabilizationWindowSeconds;
            return this;
        }
        public Integer getStabilizationWindowSeconds() {
            return this.stabilizationWindowSeconds;
        }

    }

    public static class CreateApplicationScalingRuleResponseBodyAppScalingRuleBehaviour extends TeaModel {
        /**
         * <p>弹性缩容行为配置。</p>
         */
        @NameInMap("ScaleDown")
        public CreateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleDown scaleDown;

        /**
         * <p>弹性扩容行为配置。</p>
         */
        @NameInMap("ScaleUp")
        public CreateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleUp scaleUp;

        public static CreateApplicationScalingRuleResponseBodyAppScalingRuleBehaviour build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationScalingRuleResponseBodyAppScalingRuleBehaviour self = new CreateApplicationScalingRuleResponseBodyAppScalingRuleBehaviour();
            return TeaModel.build(map, self);
        }

        public CreateApplicationScalingRuleResponseBodyAppScalingRuleBehaviour setScaleDown(CreateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleDown scaleDown) {
            this.scaleDown = scaleDown;
            return this;
        }
        public CreateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleDown getScaleDown() {
            return this.scaleDown;
        }

        public CreateApplicationScalingRuleResponseBodyAppScalingRuleBehaviour setScaleUp(CreateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleUp scaleUp) {
            this.scaleUp = scaleUp;
            return this;
        }
        public CreateApplicationScalingRuleResponseBodyAppScalingRuleBehaviourScaleUp getScaleUp() {
            return this.scaleUp;
        }

    }

    public static class CreateApplicationScalingRuleResponseBodyAppScalingRuleMetricMetrics extends TeaModel {
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

        public static CreateApplicationScalingRuleResponseBodyAppScalingRuleMetricMetrics build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationScalingRuleResponseBodyAppScalingRuleMetricMetrics self = new CreateApplicationScalingRuleResponseBodyAppScalingRuleMetricMetrics();
            return TeaModel.build(map, self);
        }

        public CreateApplicationScalingRuleResponseBodyAppScalingRuleMetricMetrics setMetricTargetAverageUtilization(Integer metricTargetAverageUtilization) {
            this.metricTargetAverageUtilization = metricTargetAverageUtilization;
            return this;
        }
        public Integer getMetricTargetAverageUtilization() {
            return this.metricTargetAverageUtilization;
        }

        public CreateApplicationScalingRuleResponseBodyAppScalingRuleMetricMetrics setMetricType(String metricType) {
            this.metricType = metricType;
            return this;
        }
        public String getMetricType() {
            return this.metricType;
        }

    }

    public static class CreateApplicationScalingRuleResponseBodyAppScalingRuleMetric extends TeaModel {
        /**
         * <p>This parameter is deprecated.</p>
         */
        @NameInMap("MaxReplicas")
        public Integer maxReplicas;

        /**
         * <p>This parameter is deprecated.</p>
         */
        @NameInMap("Metrics")
        public java.util.List<CreateApplicationScalingRuleResponseBodyAppScalingRuleMetricMetrics> metrics;

        /**
         * <p>This parameter is deprecated.</p>
         */
        @NameInMap("MinReplicas")
        public Integer minReplicas;

        public static CreateApplicationScalingRuleResponseBodyAppScalingRuleMetric build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationScalingRuleResponseBodyAppScalingRuleMetric self = new CreateApplicationScalingRuleResponseBodyAppScalingRuleMetric();
            return TeaModel.build(map, self);
        }

        public CreateApplicationScalingRuleResponseBodyAppScalingRuleMetric setMaxReplicas(Integer maxReplicas) {
            this.maxReplicas = maxReplicas;
            return this;
        }
        public Integer getMaxReplicas() {
            return this.maxReplicas;
        }

        public CreateApplicationScalingRuleResponseBodyAppScalingRuleMetric setMetrics(java.util.List<CreateApplicationScalingRuleResponseBodyAppScalingRuleMetricMetrics> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<CreateApplicationScalingRuleResponseBodyAppScalingRuleMetricMetrics> getMetrics() {
            return this.metrics;
        }

        public CreateApplicationScalingRuleResponseBodyAppScalingRuleMetric setMinReplicas(Integer minReplicas) {
            this.minReplicas = minReplicas;
            return this;
        }
        public Integer getMinReplicas() {
            return this.minReplicas;
        }

    }

    public static class CreateApplicationScalingRuleResponseBodyAppScalingRuleTriggerTriggers extends TeaModel {
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

        public static CreateApplicationScalingRuleResponseBodyAppScalingRuleTriggerTriggers build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationScalingRuleResponseBodyAppScalingRuleTriggerTriggers self = new CreateApplicationScalingRuleResponseBodyAppScalingRuleTriggerTriggers();
            return TeaModel.build(map, self);
        }

        public CreateApplicationScalingRuleResponseBodyAppScalingRuleTriggerTriggers setMetaData(String metaData) {
            this.metaData = metaData;
            return this;
        }
        public String getMetaData() {
            return this.metaData;
        }

        public CreateApplicationScalingRuleResponseBodyAppScalingRuleTriggerTriggers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateApplicationScalingRuleResponseBodyAppScalingRuleTriggerTriggers setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateApplicationScalingRuleResponseBodyAppScalingRuleTrigger extends TeaModel {
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
         * <p>The list of triggers.</p>
         */
        @NameInMap("Triggers")
        public java.util.List<CreateApplicationScalingRuleResponseBodyAppScalingRuleTriggerTriggers> triggers;

        public static CreateApplicationScalingRuleResponseBodyAppScalingRuleTrigger build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationScalingRuleResponseBodyAppScalingRuleTrigger self = new CreateApplicationScalingRuleResponseBodyAppScalingRuleTrigger();
            return TeaModel.build(map, self);
        }

        public CreateApplicationScalingRuleResponseBodyAppScalingRuleTrigger setMaxReplicas(Integer maxReplicas) {
            this.maxReplicas = maxReplicas;
            return this;
        }
        public Integer getMaxReplicas() {
            return this.maxReplicas;
        }

        public CreateApplicationScalingRuleResponseBodyAppScalingRuleTrigger setMinReplicas(Integer minReplicas) {
            this.minReplicas = minReplicas;
            return this;
        }
        public Integer getMinReplicas() {
            return this.minReplicas;
        }

        public CreateApplicationScalingRuleResponseBodyAppScalingRuleTrigger setTriggers(java.util.List<CreateApplicationScalingRuleResponseBodyAppScalingRuleTriggerTriggers> triggers) {
            this.triggers = triggers;
            return this;
        }
        public java.util.List<CreateApplicationScalingRuleResponseBodyAppScalingRuleTriggerTriggers> getTriggers() {
            return this.triggers;
        }

    }

    public static class CreateApplicationScalingRuleResponseBodyAppScalingRule extends TeaModel {
        /**
         * <p>The ID of the application to which the auto scaling policy belongs.</p>
         */
        @NameInMap("AppId")
        public String appId;

        @NameInMap("Behaviour")
        public CreateApplicationScalingRuleResponseBodyAppScalingRuleBehaviour behaviour;

        /**
         * <p>The timestamp when the auto scaling policy was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The timestamp when the auto scaling policy was last disabled. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
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
        public CreateApplicationScalingRuleResponseBodyAppScalingRuleMetric metric;

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
         * <p>The type of the auto scaling policy. The value is trigger.</p>
         */
        @NameInMap("ScaleRuleType")
        public String scaleRuleType;

        /**
         * <p>The configurations of the trigger.</p>
         */
        @NameInMap("Trigger")
        public CreateApplicationScalingRuleResponseBodyAppScalingRuleTrigger trigger;

        /**
         * <p>The timestamp when the auto scaling policy was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static CreateApplicationScalingRuleResponseBodyAppScalingRule build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationScalingRuleResponseBodyAppScalingRule self = new CreateApplicationScalingRuleResponseBodyAppScalingRule();
            return TeaModel.build(map, self);
        }

        public CreateApplicationScalingRuleResponseBodyAppScalingRule setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public CreateApplicationScalingRuleResponseBodyAppScalingRule setBehaviour(CreateApplicationScalingRuleResponseBodyAppScalingRuleBehaviour behaviour) {
            this.behaviour = behaviour;
            return this;
        }
        public CreateApplicationScalingRuleResponseBodyAppScalingRuleBehaviour getBehaviour() {
            return this.behaviour;
        }

        public CreateApplicationScalingRuleResponseBodyAppScalingRule setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public CreateApplicationScalingRuleResponseBodyAppScalingRule setLastDisableTime(Long lastDisableTime) {
            this.lastDisableTime = lastDisableTime;
            return this;
        }
        public Long getLastDisableTime() {
            return this.lastDisableTime;
        }

        public CreateApplicationScalingRuleResponseBodyAppScalingRule setMaxReplicas(Integer maxReplicas) {
            this.maxReplicas = maxReplicas;
            return this;
        }
        public Integer getMaxReplicas() {
            return this.maxReplicas;
        }

        public CreateApplicationScalingRuleResponseBodyAppScalingRule setMetric(CreateApplicationScalingRuleResponseBodyAppScalingRuleMetric metric) {
            this.metric = metric;
            return this;
        }
        public CreateApplicationScalingRuleResponseBodyAppScalingRuleMetric getMetric() {
            return this.metric;
        }

        public CreateApplicationScalingRuleResponseBodyAppScalingRule setMinReplicas(Integer minReplicas) {
            this.minReplicas = minReplicas;
            return this;
        }
        public Integer getMinReplicas() {
            return this.minReplicas;
        }

        public CreateApplicationScalingRuleResponseBodyAppScalingRule setScaleRuleEnabled(Boolean scaleRuleEnabled) {
            this.scaleRuleEnabled = scaleRuleEnabled;
            return this;
        }
        public Boolean getScaleRuleEnabled() {
            return this.scaleRuleEnabled;
        }

        public CreateApplicationScalingRuleResponseBodyAppScalingRule setScaleRuleName(String scaleRuleName) {
            this.scaleRuleName = scaleRuleName;
            return this;
        }
        public String getScaleRuleName() {
            return this.scaleRuleName;
        }

        public CreateApplicationScalingRuleResponseBodyAppScalingRule setScaleRuleType(String scaleRuleType) {
            this.scaleRuleType = scaleRuleType;
            return this;
        }
        public String getScaleRuleType() {
            return this.scaleRuleType;
        }

        public CreateApplicationScalingRuleResponseBodyAppScalingRule setTrigger(CreateApplicationScalingRuleResponseBodyAppScalingRuleTrigger trigger) {
            this.trigger = trigger;
            return this;
        }
        public CreateApplicationScalingRuleResponseBodyAppScalingRuleTrigger getTrigger() {
            return this.trigger;
        }

        public CreateApplicationScalingRuleResponseBodyAppScalingRule setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
