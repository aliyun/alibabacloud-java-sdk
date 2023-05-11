// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeAlertingMetricRuleResourcesResponseBody extends TeaModel {
    /**
     * <p>The ID of the application group.</p>
     * <br>
     * <p>>  If the alert rule is associated with an application group, the ID of the application group is returned in this parameter.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The relationship between multiple metrics. Valid values:</p>
     * <br>
     * <p>*   &&: If all metrics meet the alert conditions, CloudMonitor sends alert notifications.</p>
     * <p>*   ||: If one of the metrics meets the alert conditions, CloudMonitor sends alert notifications.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The error message.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The dimensions that specify the resources whose monitoring data you want to query.</p>
     */
    @NameInMap("Resources")
    public DescribeAlertingMetricRuleResourcesResponseBodyResources resources;

    /**
     * <p>The tags of the instance.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The name of the metric.</p>
     */
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

    public static class DescribeAlertingMetricRuleResourcesResponseBodyResourcesResourceEscalationResourceExpressionListExpressionList extends TeaModel {
        /**
         * <p>The statistical method of the alert level. Valid values:</p>
         * <br>
         * <p>*   Maximum: the maximum value</p>
         * <p>*   Minimum: the minimum value</p>
         * <p>*   Average: the average value</p>
         */
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        /**
         * <p>For more information about common request parameters, see [Common parameters](~~199331~~).</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>Queries the resources for which active alerts are triggered based on an alert rule.</p>
         */
        @NameInMap("Period")
        public String period;

        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("Threshold")
        public String threshold;

        public static DescribeAlertingMetricRuleResourcesResponseBodyResourcesResourceEscalationResourceExpressionListExpressionList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertingMetricRuleResourcesResponseBodyResourcesResourceEscalationResourceExpressionListExpressionList self = new DescribeAlertingMetricRuleResourcesResponseBodyResourcesResourceEscalationResourceExpressionListExpressionList();
            return TeaModel.build(map, self);
        }

        public DescribeAlertingMetricRuleResourcesResponseBodyResourcesResourceEscalationResourceExpressionListExpressionList setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public DescribeAlertingMetricRuleResourcesResponseBodyResourcesResourceEscalationResourceExpressionListExpressionList setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeAlertingMetricRuleResourcesResponseBodyResourcesResourceEscalationResourceExpressionListExpressionList setPeriod(String period) {
            this.period = period;
            return this;
        }
        public String getPeriod() {
            return this.period;
        }

        public DescribeAlertingMetricRuleResourcesResponseBodyResourcesResourceEscalationResourceExpressionListExpressionList setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public DescribeAlertingMetricRuleResourcesResponseBodyResourcesResourceEscalationResourceExpressionListExpressionList setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

    }

    public static class DescribeAlertingMetricRuleResourcesResponseBodyResourcesResourceEscalationResourceExpressionList extends TeaModel {
        @NameInMap("ExpressionList")
        public java.util.List<DescribeAlertingMetricRuleResourcesResponseBodyResourcesResourceEscalationResourceExpressionListExpressionList> expressionList;

        public static DescribeAlertingMetricRuleResourcesResponseBodyResourcesResourceEscalationResourceExpressionList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertingMetricRuleResourcesResponseBodyResourcesResourceEscalationResourceExpressionList self = new DescribeAlertingMetricRuleResourcesResponseBodyResourcesResourceEscalationResourceExpressionList();
            return TeaModel.build(map, self);
        }

        public DescribeAlertingMetricRuleResourcesResponseBodyResourcesResourceEscalationResourceExpressionList setExpressionList(java.util.List<DescribeAlertingMetricRuleResourcesResponseBodyResourcesResourceEscalationResourceExpressionListExpressionList> expressionList) {
            this.expressionList = expressionList;
            return this;
        }
        public java.util.List<DescribeAlertingMetricRuleResourcesResponseBodyResourcesResourceEscalationResourceExpressionListExpressionList> getExpressionList() {
            return this.expressionList;
        }

    }

    public static class DescribeAlertingMetricRuleResourcesResponseBodyResourcesResourceEscalationResource extends TeaModel {
        /**
         * <p>The operator that is used to compare the metric value with the threshold. Valid values:</p>
         * <br>
         * <p>*   GreaterThanOrEqualToThreshold: greater than or equal to the threshold</p>
         * <p>*   GreaterThanThreshold: greater than the threshold</p>
         * <p>*   LessThanOrEqualToThreshold: less than or equal to the threshold</p>
         * <p>*   LessThanThreshold: less than the threshold</p>
         * <p>*   NotEqualToThreshold: not equal to the threshold</p>
         * <p>*   GreaterThanYesterday: greater than the metric value at the same time yesterday</p>
         * <p>*   LessThanYesterday: less than the metric value at the same time yesterday</p>
         * <p>*   GreaterThanLastWeek: greater than the metric value at the same time last week</p>
         * <p>*   LessThanLastWeek: less than the metric value at the same time last week</p>
         * <p>*   GreaterThanLastPeriod: greater than the metric value in the last monitoring cycle</p>
         * <p>*   LessThanLastPeriod: less than the metric value in the last monitoring cycle</p>
         */
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        /**
         * <p>The time when the resource was associated with the alert rule.</p>
         * <br>
         * <p>Unit: milliseconds.</p>
         */
        @NameInMap("Expression")
        public String expression;

        /**
         * <p>The alert threshold.</p>
         */
        @NameInMap("ExpressionList")
        public DescribeAlertingMetricRuleResourcesResponseBodyResourcesResourceEscalationResourceExpressionList expressionList;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("ExpressionListJoin")
        public String expressionListJoin;

        @NameInMap("ExpressionRaw")
        public String expressionRaw;

        /**
         * <p>The statistical period of the metric. Unit: seconds. The default value is the interval at which the monitoring data of the metric is collected.</p>
         */
        @NameInMap("Level")
        public Integer level;

        /**
         * <p>The resources to which the alert rule is applied.</p>
         */
        @NameInMap("PreCondition")
        public String preCondition;

        /**
         * <p>The number of entries to return on each page.</p>
         * <br>
         * <p>Default value: 10.</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The severity level and notification method of the alert. Valid values:</p>
         * <br>
         * <p>*   4: Alert notifications are sent by using emails and DingTalk chatbots.</p>
         * <br>
         * <p><!----></p>
         * <br>
         * <p>*   OK: No alert is generated.</p>
         */
        @NameInMap("Threshold")
        public String threshold;

        /**
         * <p>The type of the cloud service.</p>
         */
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

        public DescribeAlertingMetricRuleResourcesResponseBodyResourcesResourceEscalationResource setExpressionList(DescribeAlertingMetricRuleResourcesResponseBodyResourcesResourceEscalationResourceExpressionList expressionList) {
            this.expressionList = expressionList;
            return this;
        }
        public DescribeAlertingMetricRuleResourcesResponseBodyResourcesResourceEscalationResourceExpressionList getExpressionList() {
            return this.expressionList;
        }

        public DescribeAlertingMetricRuleResourcesResponseBodyResourcesResourceEscalationResource setExpressionListJoin(String expressionListJoin) {
            this.expressionListJoin = expressionListJoin;
            return this;
        }
        public String getExpressionListJoin() {
            return this.expressionListJoin;
        }

        public DescribeAlertingMetricRuleResourcesResponseBodyResourcesResourceEscalationResource setExpressionRaw(String expressionRaw) {
            this.expressionRaw = expressionRaw;
            return this;
        }
        public String getExpressionRaw() {
            return this.expressionRaw;
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
        /**
         * <p>The alert threshold.</p>
         */
        @NameInMap("Dimensions")
        public String dimensions;

        /**
         * <p>The name of the alert rule.</p>
         */
        @NameInMap("Enable")
        public String enable;

        /**
         * <p>The ID of the alert rule.</p>
         */
        @NameInMap("Escalation")
        public DescribeAlertingMetricRuleResourcesResponseBodyResourcesResourceEscalation escalation;

        /**
         * <p>The total number of returned entries.</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The method used to calculate metric values that trigger alerts.</p>
         */
        @NameInMap("LastAlertTime")
        public String lastAlertTime;

        /**
         * <p>The name of the metric.</p>
         */
        @NameInMap("LastModifyTime")
        public String lastModifyTime;

        /**
         * <p>The ID of the application group. For information about how to obtain the ID of an application group, see [DescribeMonitorGroups](~~115032~~).</p>
         */
        @NameInMap("Level")
        public Integer level;

        /**
         * <p>The ID of the alert rule. For information about how to obtain the ID of an alert rule, see [DescribeMetricRuleList](~~114941~~).</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The description of the multi-metric alert rule.</p>
         */
        @NameInMap("MetricValues")
        public String metricValues;

        /**
         * <p>The alert rule based on which the alert is triggered.</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The dimensions that specify the resources whose monitoring data you want to query.</p>
         */
        @NameInMap("ProductCategory")
        public String productCategory;

        /**
         * <p>The consecutive number of times for which the metric value meets the alert condition before an alert is triggered.</p>
         */
        @NameInMap("Resource")
        public String resource;

        /**
         * <p>The operator that is used to compare the metric value with the threshold. Valid values:</p>
         * <br>
         * <p>*   GreaterThanOrEqualToThreshold: greater than or equal to the threshold</p>
         * <p>*   GreaterThanThreshold: greater than the threshold</p>
         * <p>*   LessThanOrEqualToThreshold: less than or equal to the threshold</p>
         * <p>*   LessThanThreshold: less than the threshold</p>
         * <p>*   NotEqualToThreshold: not equal to the threshold</p>
         * <p>*   GreaterThanYesterday: greater than the metric value at the same time yesterday</p>
         * <p>*   LessThanYesterday: less than the metric value at the same time yesterday</p>
         * <p>*   GreaterThanLastWeek: greater than the metric value at the same time last week</p>
         * <p>*   LessThanLastWeek: less than the metric value at the same time last week</p>
         * <p>*   GreaterThanLastPeriod: greater than the metric value in the last monitoring cycle</p>
         * <p>*   LessThanLastPeriod: less than the metric value in the last monitoring cycle</p>
         */
        @NameInMap("RetryTimes")
        public String retryTimes;

        /**
         * <p>The description of the alert rule.</p>
         * <br>
         * <p>>  This parameter is the content of the alert rule. If the metric value meets the alert condition, an alert is triggered.</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The alert threshold.</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The severity level and notification method of the alert. Valid values:</p>
         * <br>
         * <p>*   4: Alert notifications are sent by using emails and DingTalk chatbots.</p>
         * <br>
         * <p><!----></p>
         * <br>
         * <p>*   OK: No alert is generated.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>Indicates whether the alert rule is enabled. Valid values:</p>
         * <br>
         * <p>*   true: The alert rule is enabled.</p>
         * <p>*   false: The alert rule is disabled.</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>The number of the page to return.</p>
         * <br>
         * <p>Default value: 1.</p>
         */
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
