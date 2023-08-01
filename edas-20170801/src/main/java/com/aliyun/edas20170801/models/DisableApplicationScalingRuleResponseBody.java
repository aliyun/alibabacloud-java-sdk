// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DisableApplicationScalingRuleResponseBody extends TeaModel {
    /**
     * <p>The information about the auto scaling policy.</p>
     */
    @NameInMap("AppScalingRule")
    public DisableApplicationScalingRuleResponseBodyAppScalingRule appScalingRule;

    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DisableApplicationScalingRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableApplicationScalingRuleResponseBody self = new DisableApplicationScalingRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableApplicationScalingRuleResponseBody setAppScalingRule(DisableApplicationScalingRuleResponseBodyAppScalingRule appScalingRule) {
        this.appScalingRule = appScalingRule;
        return this;
    }
    public DisableApplicationScalingRuleResponseBodyAppScalingRule getAppScalingRule() {
        return this.appScalingRule;
    }

    public DisableApplicationScalingRuleResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DisableApplicationScalingRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DisableApplicationScalingRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DisableApplicationScalingRuleResponseBodyAppScalingRuleMetricMetrics extends TeaModel {
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

        public static DisableApplicationScalingRuleResponseBodyAppScalingRuleMetricMetrics build(java.util.Map<String, ?> map) throws Exception {
            DisableApplicationScalingRuleResponseBodyAppScalingRuleMetricMetrics self = new DisableApplicationScalingRuleResponseBodyAppScalingRuleMetricMetrics();
            return TeaModel.build(map, self);
        }

        public DisableApplicationScalingRuleResponseBodyAppScalingRuleMetricMetrics setMetricTargetAverageUtilization(Integer metricTargetAverageUtilization) {
            this.metricTargetAverageUtilization = metricTargetAverageUtilization;
            return this;
        }
        public Integer getMetricTargetAverageUtilization() {
            return this.metricTargetAverageUtilization;
        }

        public DisableApplicationScalingRuleResponseBodyAppScalingRuleMetricMetrics setMetricType(String metricType) {
            this.metricType = metricType;
            return this;
        }
        public String getMetricType() {
            return this.metricType;
        }

    }

    public static class DisableApplicationScalingRuleResponseBodyAppScalingRuleMetric extends TeaModel {
        /**
         * <p>This parameter is deprecated.</p>
         */
        @NameInMap("MaxReplicas")
        public Integer maxReplicas;

        /**
         * <p>This parameter is deprecated.</p>
         */
        @NameInMap("Metrics")
        public java.util.List<DisableApplicationScalingRuleResponseBodyAppScalingRuleMetricMetrics> metrics;

        /**
         * <p>This parameter is deprecated.</p>
         */
        @NameInMap("MinReplicas")
        public Integer minReplicas;

        public static DisableApplicationScalingRuleResponseBodyAppScalingRuleMetric build(java.util.Map<String, ?> map) throws Exception {
            DisableApplicationScalingRuleResponseBodyAppScalingRuleMetric self = new DisableApplicationScalingRuleResponseBodyAppScalingRuleMetric();
            return TeaModel.build(map, self);
        }

        public DisableApplicationScalingRuleResponseBodyAppScalingRuleMetric setMaxReplicas(Integer maxReplicas) {
            this.maxReplicas = maxReplicas;
            return this;
        }
        public Integer getMaxReplicas() {
            return this.maxReplicas;
        }

        public DisableApplicationScalingRuleResponseBodyAppScalingRuleMetric setMetrics(java.util.List<DisableApplicationScalingRuleResponseBodyAppScalingRuleMetricMetrics> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<DisableApplicationScalingRuleResponseBodyAppScalingRuleMetricMetrics> getMetrics() {
            return this.metrics;
        }

        public DisableApplicationScalingRuleResponseBodyAppScalingRuleMetric setMinReplicas(Integer minReplicas) {
            this.minReplicas = minReplicas;
            return this;
        }
        public Integer getMinReplicas() {
            return this.minReplicas;
        }

    }

    public static class DisableApplicationScalingRuleResponseBodyAppScalingRuleTriggerTriggers extends TeaModel {
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

        public static DisableApplicationScalingRuleResponseBodyAppScalingRuleTriggerTriggers build(java.util.Map<String, ?> map) throws Exception {
            DisableApplicationScalingRuleResponseBodyAppScalingRuleTriggerTriggers self = new DisableApplicationScalingRuleResponseBodyAppScalingRuleTriggerTriggers();
            return TeaModel.build(map, self);
        }

        public DisableApplicationScalingRuleResponseBodyAppScalingRuleTriggerTriggers setMetaData(String metaData) {
            this.metaData = metaData;
            return this;
        }
        public String getMetaData() {
            return this.metaData;
        }

        public DisableApplicationScalingRuleResponseBodyAppScalingRuleTriggerTriggers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DisableApplicationScalingRuleResponseBodyAppScalingRuleTriggerTriggers setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DisableApplicationScalingRuleResponseBodyAppScalingRuleTrigger extends TeaModel {
        /**
         * <p>The maximum number of replicas. The upper limit is 1000.</p>
         */
        @NameInMap("MaxReplicas")
        public Integer maxReplicas;

        /**
         * <p>The minimum number of replicas. The lower limit is 0.</p>
         */
        @NameInMap("MinReplicas")
        public Integer minReplicas;

        /**
         * <p>The information about the trigger.</p>
         */
        @NameInMap("Triggers")
        public java.util.List<DisableApplicationScalingRuleResponseBodyAppScalingRuleTriggerTriggers> triggers;

        public static DisableApplicationScalingRuleResponseBodyAppScalingRuleTrigger build(java.util.Map<String, ?> map) throws Exception {
            DisableApplicationScalingRuleResponseBodyAppScalingRuleTrigger self = new DisableApplicationScalingRuleResponseBodyAppScalingRuleTrigger();
            return TeaModel.build(map, self);
        }

        public DisableApplicationScalingRuleResponseBodyAppScalingRuleTrigger setMaxReplicas(Integer maxReplicas) {
            this.maxReplicas = maxReplicas;
            return this;
        }
        public Integer getMaxReplicas() {
            return this.maxReplicas;
        }

        public DisableApplicationScalingRuleResponseBodyAppScalingRuleTrigger setMinReplicas(Integer minReplicas) {
            this.minReplicas = minReplicas;
            return this;
        }
        public Integer getMinReplicas() {
            return this.minReplicas;
        }

        public DisableApplicationScalingRuleResponseBodyAppScalingRuleTrigger setTriggers(java.util.List<DisableApplicationScalingRuleResponseBodyAppScalingRuleTriggerTriggers> triggers) {
            this.triggers = triggers;
            return this;
        }
        public java.util.List<DisableApplicationScalingRuleResponseBodyAppScalingRuleTriggerTriggers> getTriggers() {
            return this.triggers;
        }

    }

    public static class DisableApplicationScalingRuleResponseBodyAppScalingRule extends TeaModel {
        /**
         * <p>The ID of the application to which the auto scaling policy belongs.</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The time when the auto scaling policy was created.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The time when the auto scaling policy was last disabled.</p>
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
        public DisableApplicationScalingRuleResponseBodyAppScalingRuleMetric metric;

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
        public DisableApplicationScalingRuleResponseBodyAppScalingRuleTrigger trigger;

        /**
         * <p>The time when the auto scaling policy was last modified.</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static DisableApplicationScalingRuleResponseBodyAppScalingRule build(java.util.Map<String, ?> map) throws Exception {
            DisableApplicationScalingRuleResponseBodyAppScalingRule self = new DisableApplicationScalingRuleResponseBodyAppScalingRule();
            return TeaModel.build(map, self);
        }

        public DisableApplicationScalingRuleResponseBodyAppScalingRule setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DisableApplicationScalingRuleResponseBodyAppScalingRule setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DisableApplicationScalingRuleResponseBodyAppScalingRule setLastDisableTime(Long lastDisableTime) {
            this.lastDisableTime = lastDisableTime;
            return this;
        }
        public Long getLastDisableTime() {
            return this.lastDisableTime;
        }

        public DisableApplicationScalingRuleResponseBodyAppScalingRule setMaxReplicas(Integer maxReplicas) {
            this.maxReplicas = maxReplicas;
            return this;
        }
        public Integer getMaxReplicas() {
            return this.maxReplicas;
        }

        public DisableApplicationScalingRuleResponseBodyAppScalingRule setMetric(DisableApplicationScalingRuleResponseBodyAppScalingRuleMetric metric) {
            this.metric = metric;
            return this;
        }
        public DisableApplicationScalingRuleResponseBodyAppScalingRuleMetric getMetric() {
            return this.metric;
        }

        public DisableApplicationScalingRuleResponseBodyAppScalingRule setMinReplicas(Integer minReplicas) {
            this.minReplicas = minReplicas;
            return this;
        }
        public Integer getMinReplicas() {
            return this.minReplicas;
        }

        public DisableApplicationScalingRuleResponseBodyAppScalingRule setScaleRuleEnabled(Boolean scaleRuleEnabled) {
            this.scaleRuleEnabled = scaleRuleEnabled;
            return this;
        }
        public Boolean getScaleRuleEnabled() {
            return this.scaleRuleEnabled;
        }

        public DisableApplicationScalingRuleResponseBodyAppScalingRule setScaleRuleName(String scaleRuleName) {
            this.scaleRuleName = scaleRuleName;
            return this;
        }
        public String getScaleRuleName() {
            return this.scaleRuleName;
        }

        public DisableApplicationScalingRuleResponseBodyAppScalingRule setScaleRuleType(String scaleRuleType) {
            this.scaleRuleType = scaleRuleType;
            return this;
        }
        public String getScaleRuleType() {
            return this.scaleRuleType;
        }

        public DisableApplicationScalingRuleResponseBodyAppScalingRule setTrigger(DisableApplicationScalingRuleResponseBodyAppScalingRuleTrigger trigger) {
            this.trigger = trigger;
            return this;
        }
        public DisableApplicationScalingRuleResponseBodyAppScalingRuleTrigger getTrigger() {
            return this.trigger;
        }

        public DisableApplicationScalingRuleResponseBodyAppScalingRule setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
