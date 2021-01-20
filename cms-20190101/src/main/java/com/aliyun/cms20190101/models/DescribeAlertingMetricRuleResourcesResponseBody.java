// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeAlertingMetricRuleResourcesResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("Resources")
    public DescribeAlertingMetricRuleResourcesResponseBodyResources resources;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeAlertingMetricRuleResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertingMetricRuleResourcesResponseBody self = new DescribeAlertingMetricRuleResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAlertingMetricRuleResourcesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAlertingMetricRuleResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAlertingMetricRuleResourcesResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public DescribeAlertingMetricRuleResourcesResponseBody setResources(DescribeAlertingMetricRuleResourcesResponseBodyResources resources) {
        this.resources = resources;
        return this;
    }
    public DescribeAlertingMetricRuleResourcesResponseBodyResources getResources() {
        return this.resources;
    }

    public DescribeAlertingMetricRuleResourcesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeAlertingMetricRuleResourcesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAlertingMetricRuleResourcesResponseBodyResourcesResource extends TeaModel {
        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("RetryTimes")
        public String retryTimes;

        @NameInMap("MetricValues")
        public String metricValues;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Resource")
        public String resource;

        @NameInMap("LastModifyTime")
        public String lastModifyTime;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("LastAlertTime")
        public String lastAlertTime;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("Enable")
        public String enable;

        public static DescribeAlertingMetricRuleResourcesResponseBodyResourcesResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertingMetricRuleResourcesResponseBodyResourcesResource self = new DescribeAlertingMetricRuleResourcesResponseBodyResourcesResource();
            return TeaModel.build(map, self);
        }

        public DescribeAlertingMetricRuleResourcesResponseBodyResourcesResource setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeAlertingMetricRuleResourcesResponseBodyResourcesResource setRetryTimes(String retryTimes) {
            this.retryTimes = retryTimes;
            return this;
        }
        public String getRetryTimes() {
            return this.retryTimes;
        }

        public DescribeAlertingMetricRuleResourcesResponseBodyResourcesResource setMetricValues(String metricValues) {
            this.metricValues = metricValues;
            return this;
        }
        public String getMetricValues() {
            return this.metricValues;
        }

        public DescribeAlertingMetricRuleResourcesResponseBodyResourcesResource setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeAlertingMetricRuleResourcesResponseBodyResourcesResource setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeAlertingMetricRuleResourcesResponseBodyResourcesResource setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeAlertingMetricRuleResourcesResponseBodyResourcesResource setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeAlertingMetricRuleResourcesResponseBodyResourcesResource setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public DescribeAlertingMetricRuleResourcesResponseBodyResourcesResource setLastModifyTime(String lastModifyTime) {
            this.lastModifyTime = lastModifyTime;
            return this;
        }
        public String getLastModifyTime() {
            return this.lastModifyTime;
        }

        public DescribeAlertingMetricRuleResourcesResponseBodyResourcesResource setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeAlertingMetricRuleResourcesResponseBodyResourcesResource setLastAlertTime(String lastAlertTime) {
            this.lastAlertTime = lastAlertTime;
            return this;
        }
        public String getLastAlertTime() {
            return this.lastAlertTime;
        }

        public DescribeAlertingMetricRuleResourcesResponseBodyResourcesResource setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public DescribeAlertingMetricRuleResourcesResponseBodyResourcesResource setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public DescribeAlertingMetricRuleResourcesResponseBodyResourcesResource setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
        }

    }

    public static class DescribeAlertingMetricRuleResourcesResponseBodyResources extends TeaModel {
        @NameInMap("Resource")
        public java.util.List<DescribeAlertingMetricRuleResourcesResponseBodyResourcesResource> resource;

        public static DescribeAlertingMetricRuleResourcesResponseBodyResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertingMetricRuleResourcesResponseBodyResources self = new DescribeAlertingMetricRuleResourcesResponseBodyResources();
            return TeaModel.build(map, self);
        }

        public DescribeAlertingMetricRuleResourcesResponseBodyResources setResource(java.util.List<DescribeAlertingMetricRuleResourcesResponseBodyResourcesResource> resource) {
            this.resource = resource;
            return this;
        }
        public java.util.List<DescribeAlertingMetricRuleResourcesResponseBodyResourcesResource> getResource() {
            return this.resource;
        }

    }

}
