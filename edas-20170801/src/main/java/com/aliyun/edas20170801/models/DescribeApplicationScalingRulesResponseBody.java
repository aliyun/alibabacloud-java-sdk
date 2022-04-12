// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DescribeApplicationScalingRulesResponseBody extends TeaModel {
    @NameInMap("AppScalingRules")
    public DescribeApplicationScalingRulesResponseBodyAppScalingRules appScalingRules;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeApplicationScalingRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationScalingRulesResponseBody self = new DescribeApplicationScalingRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationScalingRulesResponseBody setAppScalingRules(DescribeApplicationScalingRulesResponseBodyAppScalingRules appScalingRules) {
        this.appScalingRules = appScalingRules;
        return this;
    }
    public DescribeApplicationScalingRulesResponseBodyAppScalingRules getAppScalingRules() {
        return this.appScalingRules;
    }

    public DescribeApplicationScalingRulesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeApplicationScalingRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeApplicationScalingRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultMetricMetrics extends TeaModel {
        @NameInMap("MetricTargetAverageUtilization")
        public Integer metricTargetAverageUtilization;

        @NameInMap("MetricType")
        public String metricType;

        public static DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultMetricMetrics build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultMetricMetrics self = new DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultMetricMetrics();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultMetricMetrics setMetricTargetAverageUtilization(Integer metricTargetAverageUtilization) {
            this.metricTargetAverageUtilization = metricTargetAverageUtilization;
            return this;
        }
        public Integer getMetricTargetAverageUtilization() {
            return this.metricTargetAverageUtilization;
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultMetricMetrics setMetricType(String metricType) {
            this.metricType = metricType;
            return this;
        }
        public String getMetricType() {
            return this.metricType;
        }

    }

    public static class DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultMetric extends TeaModel {
        @NameInMap("MaxReplicas")
        public Integer maxReplicas;

        @NameInMap("Metrics")
        public java.util.List<DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultMetricMetrics> metrics;

        @NameInMap("MinReplicas")
        public Integer minReplicas;

        public static DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultMetric build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultMetric self = new DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultMetric();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultMetric setMaxReplicas(Integer maxReplicas) {
            this.maxReplicas = maxReplicas;
            return this;
        }
        public Integer getMaxReplicas() {
            return this.maxReplicas;
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultMetric setMetrics(java.util.List<DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultMetricMetrics> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultMetricMetrics> getMetrics() {
            return this.metrics;
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultMetric setMinReplicas(Integer minReplicas) {
            this.minReplicas = minReplicas;
            return this;
        }
        public Integer getMinReplicas() {
            return this.minReplicas;
        }

    }

    public static class DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultTriggerTriggers extends TeaModel {
        @NameInMap("MetaData")
        public String metaData;

        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        public static DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultTriggerTriggers build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultTriggerTriggers self = new DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultTriggerTriggers();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultTriggerTriggers setMetaData(String metaData) {
            this.metaData = metaData;
            return this;
        }
        public String getMetaData() {
            return this.metaData;
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultTriggerTriggers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultTriggerTriggers setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultTrigger extends TeaModel {
        @NameInMap("MaxReplicas")
        public Integer maxReplicas;

        @NameInMap("MinReplicas")
        public Integer minReplicas;

        @NameInMap("Triggers")
        public java.util.List<DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultTriggerTriggers> triggers;

        public static DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultTrigger build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultTrigger self = new DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultTrigger();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultTrigger setMaxReplicas(Integer maxReplicas) {
            this.maxReplicas = maxReplicas;
            return this;
        }
        public Integer getMaxReplicas() {
            return this.maxReplicas;
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultTrigger setMinReplicas(Integer minReplicas) {
            this.minReplicas = minReplicas;
            return this;
        }
        public Integer getMinReplicas() {
            return this.minReplicas;
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultTrigger setTriggers(java.util.List<DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultTriggerTriggers> triggers) {
            this.triggers = triggers;
            return this;
        }
        public java.util.List<DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultTriggerTriggers> getTriggers() {
            return this.triggers;
        }

    }

    public static class DescribeApplicationScalingRulesResponseBodyAppScalingRulesResult extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("LastDisableTime")
        public Long lastDisableTime;

        @NameInMap("MaxReplicas")
        public Integer maxReplicas;

        @NameInMap("Metric")
        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultMetric metric;

        @NameInMap("MinReplicas")
        public Integer minReplicas;

        @NameInMap("ScaleRuleEnabled")
        public Boolean scaleRuleEnabled;

        @NameInMap("ScaleRuleName")
        public String scaleRuleName;

        @NameInMap("ScaleRuleType")
        public String scaleRuleType;

        @NameInMap("Trigger")
        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultTrigger trigger;

        @NameInMap("UpdateTime")
        public Long updateTime;

        public static DescribeApplicationScalingRulesResponseBodyAppScalingRulesResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationScalingRulesResponseBodyAppScalingRulesResult self = new DescribeApplicationScalingRulesResponseBodyAppScalingRulesResult();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResult setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResult setLastDisableTime(Long lastDisableTime) {
            this.lastDisableTime = lastDisableTime;
            return this;
        }
        public Long getLastDisableTime() {
            return this.lastDisableTime;
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResult setMaxReplicas(Integer maxReplicas) {
            this.maxReplicas = maxReplicas;
            return this;
        }
        public Integer getMaxReplicas() {
            return this.maxReplicas;
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResult setMetric(DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultMetric metric) {
            this.metric = metric;
            return this;
        }
        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultMetric getMetric() {
            return this.metric;
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResult setMinReplicas(Integer minReplicas) {
            this.minReplicas = minReplicas;
            return this;
        }
        public Integer getMinReplicas() {
            return this.minReplicas;
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResult setScaleRuleEnabled(Boolean scaleRuleEnabled) {
            this.scaleRuleEnabled = scaleRuleEnabled;
            return this;
        }
        public Boolean getScaleRuleEnabled() {
            return this.scaleRuleEnabled;
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResult setScaleRuleName(String scaleRuleName) {
            this.scaleRuleName = scaleRuleName;
            return this;
        }
        public String getScaleRuleName() {
            return this.scaleRuleName;
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResult setScaleRuleType(String scaleRuleType) {
            this.scaleRuleType = scaleRuleType;
            return this;
        }
        public String getScaleRuleType() {
            return this.scaleRuleType;
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResult setTrigger(DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultTrigger trigger) {
            this.trigger = trigger;
            return this;
        }
        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultTrigger getTrigger() {
            return this.trigger;
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResult setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class DescribeApplicationScalingRulesResponseBodyAppScalingRules extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Result")
        public java.util.List<DescribeApplicationScalingRulesResponseBodyAppScalingRulesResult> result;

        @NameInMap("TotalSize")
        public Long totalSize;

        public static DescribeApplicationScalingRulesResponseBodyAppScalingRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationScalingRulesResponseBodyAppScalingRules self = new DescribeApplicationScalingRulesResponseBodyAppScalingRules();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRules setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRules setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRules setResult(java.util.List<DescribeApplicationScalingRulesResponseBodyAppScalingRulesResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<DescribeApplicationScalingRulesResponseBodyAppScalingRulesResult> getResult() {
            return this.result;
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRules setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

    }

}
