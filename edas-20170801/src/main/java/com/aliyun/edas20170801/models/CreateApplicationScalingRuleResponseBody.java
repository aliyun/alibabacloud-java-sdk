// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class CreateApplicationScalingRuleResponseBody extends TeaModel {
    @NameInMap("AppScalingRule")
    public CreateApplicationScalingRuleResponseBodyAppScalingRule appScalingRule;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

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

    public static class CreateApplicationScalingRuleResponseBodyAppScalingRuleMetricMetrics extends TeaModel {
        @NameInMap("MetricTargetAverageUtilization")
        public Integer metricTargetAverageUtilization;

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
        @NameInMap("MaxReplicas")
        public Integer maxReplicas;

        @NameInMap("Metrics")
        public java.util.List<CreateApplicationScalingRuleResponseBodyAppScalingRuleMetricMetrics> metrics;

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
        @NameInMap("MetaData")
        public String metaData;

        @NameInMap("Name")
        public String name;

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
        @NameInMap("MaxReplicas")
        public Integer maxReplicas;

        @NameInMap("MinReplicas")
        public Integer minReplicas;

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
        @NameInMap("AppId")
        public String appId;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("LastDisableTime")
        public Long lastDisableTime;

        @NameInMap("MaxReplicas")
        public Integer maxReplicas;

        @NameInMap("Metric")
        public CreateApplicationScalingRuleResponseBodyAppScalingRuleMetric metric;

        @NameInMap("MinReplicas")
        public Integer minReplicas;

        @NameInMap("ScaleRuleEnabled")
        public Boolean scaleRuleEnabled;

        @NameInMap("ScaleRuleName")
        public String scaleRuleName;

        @NameInMap("ScaleRuleType")
        public String scaleRuleType;

        @NameInMap("Trigger")
        public CreateApplicationScalingRuleResponseBodyAppScalingRuleTrigger trigger;

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
