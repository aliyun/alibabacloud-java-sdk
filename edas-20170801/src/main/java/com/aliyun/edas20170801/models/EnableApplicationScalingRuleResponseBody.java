// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class EnableApplicationScalingRuleResponseBody extends TeaModel {
    @NameInMap("AppScalingRule")
    public EnableApplicationScalingRuleResponseBodyAppScalingRule appScalingRule;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static EnableApplicationScalingRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableApplicationScalingRuleResponseBody self = new EnableApplicationScalingRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableApplicationScalingRuleResponseBody setAppScalingRule(EnableApplicationScalingRuleResponseBodyAppScalingRule appScalingRule) {
        this.appScalingRule = appScalingRule;
        return this;
    }
    public EnableApplicationScalingRuleResponseBodyAppScalingRule getAppScalingRule() {
        return this.appScalingRule;
    }

    public EnableApplicationScalingRuleResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public EnableApplicationScalingRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EnableApplicationScalingRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class EnableApplicationScalingRuleResponseBodyAppScalingRuleMetricMetrics extends TeaModel {
        @NameInMap("MetricTargetAverageUtilization")
        public Integer metricTargetAverageUtilization;

        @NameInMap("MetricType")
        public String metricType;

        public static EnableApplicationScalingRuleResponseBodyAppScalingRuleMetricMetrics build(java.util.Map<String, ?> map) throws Exception {
            EnableApplicationScalingRuleResponseBodyAppScalingRuleMetricMetrics self = new EnableApplicationScalingRuleResponseBodyAppScalingRuleMetricMetrics();
            return TeaModel.build(map, self);
        }

        public EnableApplicationScalingRuleResponseBodyAppScalingRuleMetricMetrics setMetricTargetAverageUtilization(Integer metricTargetAverageUtilization) {
            this.metricTargetAverageUtilization = metricTargetAverageUtilization;
            return this;
        }
        public Integer getMetricTargetAverageUtilization() {
            return this.metricTargetAverageUtilization;
        }

        public EnableApplicationScalingRuleResponseBodyAppScalingRuleMetricMetrics setMetricType(String metricType) {
            this.metricType = metricType;
            return this;
        }
        public String getMetricType() {
            return this.metricType;
        }

    }

    public static class EnableApplicationScalingRuleResponseBodyAppScalingRuleMetric extends TeaModel {
        @NameInMap("MaxReplicas")
        public Integer maxReplicas;

        @NameInMap("Metrics")
        public java.util.List<EnableApplicationScalingRuleResponseBodyAppScalingRuleMetricMetrics> metrics;

        @NameInMap("MinReplicas")
        public Integer minReplicas;

        public static EnableApplicationScalingRuleResponseBodyAppScalingRuleMetric build(java.util.Map<String, ?> map) throws Exception {
            EnableApplicationScalingRuleResponseBodyAppScalingRuleMetric self = new EnableApplicationScalingRuleResponseBodyAppScalingRuleMetric();
            return TeaModel.build(map, self);
        }

        public EnableApplicationScalingRuleResponseBodyAppScalingRuleMetric setMaxReplicas(Integer maxReplicas) {
            this.maxReplicas = maxReplicas;
            return this;
        }
        public Integer getMaxReplicas() {
            return this.maxReplicas;
        }

        public EnableApplicationScalingRuleResponseBodyAppScalingRuleMetric setMetrics(java.util.List<EnableApplicationScalingRuleResponseBodyAppScalingRuleMetricMetrics> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<EnableApplicationScalingRuleResponseBodyAppScalingRuleMetricMetrics> getMetrics() {
            return this.metrics;
        }

        public EnableApplicationScalingRuleResponseBodyAppScalingRuleMetric setMinReplicas(Integer minReplicas) {
            this.minReplicas = minReplicas;
            return this;
        }
        public Integer getMinReplicas() {
            return this.minReplicas;
        }

    }

    public static class EnableApplicationScalingRuleResponseBodyAppScalingRuleTriggerTriggers extends TeaModel {
        @NameInMap("MetaData")
        public String metaData;

        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        public static EnableApplicationScalingRuleResponseBodyAppScalingRuleTriggerTriggers build(java.util.Map<String, ?> map) throws Exception {
            EnableApplicationScalingRuleResponseBodyAppScalingRuleTriggerTriggers self = new EnableApplicationScalingRuleResponseBodyAppScalingRuleTriggerTriggers();
            return TeaModel.build(map, self);
        }

        public EnableApplicationScalingRuleResponseBodyAppScalingRuleTriggerTriggers setMetaData(String metaData) {
            this.metaData = metaData;
            return this;
        }
        public String getMetaData() {
            return this.metaData;
        }

        public EnableApplicationScalingRuleResponseBodyAppScalingRuleTriggerTriggers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public EnableApplicationScalingRuleResponseBodyAppScalingRuleTriggerTriggers setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class EnableApplicationScalingRuleResponseBodyAppScalingRuleTrigger extends TeaModel {
        @NameInMap("MaxReplicas")
        public Integer maxReplicas;

        @NameInMap("MinReplicas")
        public Integer minReplicas;

        @NameInMap("Triggers")
        public java.util.List<EnableApplicationScalingRuleResponseBodyAppScalingRuleTriggerTriggers> triggers;

        public static EnableApplicationScalingRuleResponseBodyAppScalingRuleTrigger build(java.util.Map<String, ?> map) throws Exception {
            EnableApplicationScalingRuleResponseBodyAppScalingRuleTrigger self = new EnableApplicationScalingRuleResponseBodyAppScalingRuleTrigger();
            return TeaModel.build(map, self);
        }

        public EnableApplicationScalingRuleResponseBodyAppScalingRuleTrigger setMaxReplicas(Integer maxReplicas) {
            this.maxReplicas = maxReplicas;
            return this;
        }
        public Integer getMaxReplicas() {
            return this.maxReplicas;
        }

        public EnableApplicationScalingRuleResponseBodyAppScalingRuleTrigger setMinReplicas(Integer minReplicas) {
            this.minReplicas = minReplicas;
            return this;
        }
        public Integer getMinReplicas() {
            return this.minReplicas;
        }

        public EnableApplicationScalingRuleResponseBodyAppScalingRuleTrigger setTriggers(java.util.List<EnableApplicationScalingRuleResponseBodyAppScalingRuleTriggerTriggers> triggers) {
            this.triggers = triggers;
            return this;
        }
        public java.util.List<EnableApplicationScalingRuleResponseBodyAppScalingRuleTriggerTriggers> getTriggers() {
            return this.triggers;
        }

    }

    public static class EnableApplicationScalingRuleResponseBodyAppScalingRule extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("LastDisableTime")
        public Long lastDisableTime;

        @NameInMap("MaxReplicas")
        public Integer maxReplicas;

        @NameInMap("Metric")
        public EnableApplicationScalingRuleResponseBodyAppScalingRuleMetric metric;

        @NameInMap("MinReplicas")
        public Integer minReplicas;

        @NameInMap("ScaleRuleEnabled")
        public Boolean scaleRuleEnabled;

        @NameInMap("ScaleRuleName")
        public String scaleRuleName;

        @NameInMap("ScaleRuleType")
        public String scaleRuleType;

        @NameInMap("Trigger")
        public EnableApplicationScalingRuleResponseBodyAppScalingRuleTrigger trigger;

        @NameInMap("UpdateTime")
        public Long updateTime;

        public static EnableApplicationScalingRuleResponseBodyAppScalingRule build(java.util.Map<String, ?> map) throws Exception {
            EnableApplicationScalingRuleResponseBodyAppScalingRule self = new EnableApplicationScalingRuleResponseBodyAppScalingRule();
            return TeaModel.build(map, self);
        }

        public EnableApplicationScalingRuleResponseBodyAppScalingRule setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public EnableApplicationScalingRuleResponseBodyAppScalingRule setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public EnableApplicationScalingRuleResponseBodyAppScalingRule setLastDisableTime(Long lastDisableTime) {
            this.lastDisableTime = lastDisableTime;
            return this;
        }
        public Long getLastDisableTime() {
            return this.lastDisableTime;
        }

        public EnableApplicationScalingRuleResponseBodyAppScalingRule setMaxReplicas(Integer maxReplicas) {
            this.maxReplicas = maxReplicas;
            return this;
        }
        public Integer getMaxReplicas() {
            return this.maxReplicas;
        }

        public EnableApplicationScalingRuleResponseBodyAppScalingRule setMetric(EnableApplicationScalingRuleResponseBodyAppScalingRuleMetric metric) {
            this.metric = metric;
            return this;
        }
        public EnableApplicationScalingRuleResponseBodyAppScalingRuleMetric getMetric() {
            return this.metric;
        }

        public EnableApplicationScalingRuleResponseBodyAppScalingRule setMinReplicas(Integer minReplicas) {
            this.minReplicas = minReplicas;
            return this;
        }
        public Integer getMinReplicas() {
            return this.minReplicas;
        }

        public EnableApplicationScalingRuleResponseBodyAppScalingRule setScaleRuleEnabled(Boolean scaleRuleEnabled) {
            this.scaleRuleEnabled = scaleRuleEnabled;
            return this;
        }
        public Boolean getScaleRuleEnabled() {
            return this.scaleRuleEnabled;
        }

        public EnableApplicationScalingRuleResponseBodyAppScalingRule setScaleRuleName(String scaleRuleName) {
            this.scaleRuleName = scaleRuleName;
            return this;
        }
        public String getScaleRuleName() {
            return this.scaleRuleName;
        }

        public EnableApplicationScalingRuleResponseBodyAppScalingRule setScaleRuleType(String scaleRuleType) {
            this.scaleRuleType = scaleRuleType;
            return this;
        }
        public String getScaleRuleType() {
            return this.scaleRuleType;
        }

        public EnableApplicationScalingRuleResponseBodyAppScalingRule setTrigger(EnableApplicationScalingRuleResponseBodyAppScalingRuleTrigger trigger) {
            this.trigger = trigger;
            return this;
        }
        public EnableApplicationScalingRuleResponseBodyAppScalingRuleTrigger getTrigger() {
            return this.trigger;
        }

        public EnableApplicationScalingRuleResponseBodyAppScalingRule setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
