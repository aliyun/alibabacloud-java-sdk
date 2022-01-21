// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeAlertingMetricRuleResourcesResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Resources")
    public DescribeAlertingMetricRuleResourcesResponseBodyResources resources;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Total")
    public Integer total;

    public static DescribeAlertingMetricRuleResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertingMetricRuleResourcesResponseBody self = new DescribeAlertingMetricRuleResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAlertingMetricRuleResourcesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
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

    public DescribeAlertingMetricRuleResourcesResponseBody setResources(DescribeAlertingMetricRuleResourcesResponseBodyResources resources) {
        this.resources = resources;
        return this;
    }
    public DescribeAlertingMetricRuleResourcesResponseBodyResources getResources() {
        return this.resources;
    }

    public DescribeAlertingMetricRuleResourcesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeAlertingMetricRuleResourcesResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class DescribeAlertingMetricRuleResourcesResponseBodyResourcesResourceEscalationResource extends TeaModel {
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("Expression")
        public String expression;

        @NameInMap("Level")
        public Integer level;

        @NameInMap("PreCondition")
        public String preCondition;

        @NameInMap("Tag")
        public String tag;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Times")
        public Integer times;

        public static DescribeAlertingMetricRuleResourcesResponseBodyResourcesResourceEscalationResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertingMetricRuleResourcesResponseBodyResourcesResourceEscalationResource self = new DescribeAlertingMetricRuleResourcesResponseBodyResourcesResourceEscalationResource();
            return TeaModel.build(map, self);
        }

        public DescribeAlertingMetricRuleResourcesResponseBodyResourcesResourceEscalationResource setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public DescribeAlertingMetricRuleResourcesResponseBodyResourcesResourceEscalationResource setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public DescribeAlertingMetricRuleResourcesResponseBodyResourcesResourceEscalationResource setLevel(Integer level) {
            this.level = level;
            return this;
        }
        public Integer getLevel() {
            return this.level;
        }

        public DescribeAlertingMetricRuleResourcesResponseBodyResourcesResourceEscalationResource setPreCondition(String preCondition) {
            this.preCondition = preCondition;
            return this;
        }
        public String getPreCondition() {
            return this.preCondition;
        }

        public DescribeAlertingMetricRuleResourcesResponseBodyResourcesResourceEscalationResource setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public DescribeAlertingMetricRuleResourcesResponseBodyResourcesResourceEscalationResource setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public DescribeAlertingMetricRuleResourcesResponseBodyResourcesResourceEscalationResource setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class DescribeAlertingMetricRuleResourcesResponseBodyResourcesResourceEscalation extends TeaModel {
        @NameInMap("Resource")
        public java.util.List<DescribeAlertingMetricRuleResourcesResponseBodyResourcesResourceEscalationResource> resource;

        public static DescribeAlertingMetricRuleResourcesResponseBodyResourcesResourceEscalation build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertingMetricRuleResourcesResponseBodyResourcesResourceEscalation self = new DescribeAlertingMetricRuleResourcesResponseBodyResourcesResourceEscalation();
            return TeaModel.build(map, self);
        }

        public DescribeAlertingMetricRuleResourcesResponseBodyResourcesResourceEscalation setResource(java.util.List<DescribeAlertingMetricRuleResourcesResponseBodyResourcesResourceEscalationResource> resource) {
            this.resource = resource;
            return this;
        }
        public java.util.List<DescribeAlertingMetricRuleResourcesResponseBodyResourcesResourceEscalationResource> getResource() {
            return this.resource;
        }

    }

    public static class DescribeAlertingMetricRuleResourcesResponseBodyResourcesResource extends TeaModel {
        @NameInMap("Dimensions")
        public String dimensions;

        @NameInMap("Enable")
        public String enable;

        @NameInMap("Escalation")
        public DescribeAlertingMetricRuleResourcesResponseBodyResourcesResourceEscalation escalation;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("LastAlertTime")
        public String lastAlertTime;

        @NameInMap("LastModifyTime")
        public String lastModifyTime;

        @NameInMap("Level")
        public Integer level;

        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("MetricValues")
        public String metricValues;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("ProductCategory")
        public String productCategory;

        @NameInMap("Resource")
        public String resource;

        @NameInMap("RetryTimes")
        public String retryTimes;

        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("Threshold")
        public String threshold;

        public static DescribeAlertingMetricRuleResourcesResponseBodyResourcesResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertingMetricRuleResourcesResponseBodyResourcesResource self = new DescribeAlertingMetricRuleResourcesResponseBodyResourcesResource();
            return TeaModel.build(map, self);
        }

        public DescribeAlertingMetricRuleResourcesResponseBodyResourcesResource setDimensions(String dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public String getDimensions() {
            return this.dimensions;
        }

        public DescribeAlertingMetricRuleResourcesResponseBodyResourcesResource setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
        }

        public DescribeAlertingMetricRuleResourcesResponseBodyResourcesResource setEscalation(DescribeAlertingMetricRuleResourcesResponseBodyResourcesResourceEscalation escalation) {
            this.escalation = escalation;
            return this;
        }
        public DescribeAlertingMetricRuleResourcesResponseBodyResourcesResourceEscalation getEscalation() {
            return this.escalation;
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

        public DescribeAlertingMetricRuleResourcesResponseBodyResourcesResource setLastModifyTime(String lastModifyTime) {
            this.lastModifyTime = lastModifyTime;
            return this;
        }
        public String getLastModifyTime() {
            return this.lastModifyTime;
        }

        public DescribeAlertingMetricRuleResourcesResponseBodyResourcesResource setLevel(Integer level) {
            this.level = level;
            return this;
        }
        public Integer getLevel() {
            return this.level;
        }

        public DescribeAlertingMetricRuleResourcesResponseBodyResourcesResource setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
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

        public DescribeAlertingMetricRuleResourcesResponseBodyResourcesResource setProductCategory(String productCategory) {
            this.productCategory = productCategory;
            return this;
        }
        public String getProductCategory() {
            return this.productCategory;
        }

        public DescribeAlertingMetricRuleResourcesResponseBodyResourcesResource setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public DescribeAlertingMetricRuleResourcesResponseBodyResourcesResource setRetryTimes(String retryTimes) {
            this.retryTimes = retryTimes;
            return this;
        }
        public String getRetryTimes() {
            return this.retryTimes;
        }

        public DescribeAlertingMetricRuleResourcesResponseBodyResourcesResource setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeAlertingMetricRuleResourcesResponseBodyResourcesResource setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeAlertingMetricRuleResourcesResponseBodyResourcesResource setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeAlertingMetricRuleResourcesResponseBodyResourcesResource setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public DescribeAlertingMetricRuleResourcesResponseBodyResourcesResource setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
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
