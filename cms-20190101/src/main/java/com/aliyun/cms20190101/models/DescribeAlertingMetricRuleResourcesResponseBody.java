// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeAlertingMetricRuleResourcesResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * <blockquote>
     * <p>The status code 200 indicates that the request was successful.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The request processing has failed due to some unknown error.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0724011B-D9E0-4B2F-8C51-F17A894CC42C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The resources that are associated with the alert rule.</p>
     */
    @NameInMap("Resources")
    public DescribeAlertingMetricRuleResourcesResponseBodyResources resources;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
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
         * <p>The operator that is used to compare the metric value with the threshold. Valid values:</p>
         * <ul>
         * <li>GreaterThanOrEqualToThreshold: greater than or equal to the threshold</li>
         * <li>GreaterThanThreshold: greater than the threshold</li>
         * <li>LessThanOrEqualToThreshold: less than or equal to the threshold</li>
         * <li>LessThanThreshold: less than the threshold</li>
         * <li>NotEqualToThreshold: not equal to the threshold</li>
         * <li>GreaterThanYesterday: greater than the metric value at the same time yesterday</li>
         * <li>LessThanYesterday: less than the metric value at the same time yesterday</li>
         * <li>GreaterThanLastWeek: greater than the metric value at the same time last week</li>
         * <li>LessThanLastWeek: less than the metric value at the same time last week</li>
         * <li>GreaterThanLastPeriod: greater than the metric value in the last monitoring cycle</li>
         * <li>LessThanLastPeriod: less than the metric value in the last monitoring cycle</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GreaterThanOrEqualToThreshold</p>
         */
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        /**
         * <p>The metric name.</p>
         * 
         * <strong>example:</strong>
         * <p>cpu_total</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The statistical period of the metric. Unit: seconds. The default value is the interval at which the monitoring data of the metric is collected.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Period")
        public String period;

        /**
         * <p>The statistical method of the alert level. Valid values:</p>
         * <ul>
         * <li>Maximum</li>
         * <li>Minimum</li>
         * <li>Average</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Average</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>The alert threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
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
         * <ul>
         * <li>GreaterThanOrEqualToThreshold: greater than or equal to the threshold</li>
         * <li>GreaterThanThreshold: greater than the threshold</li>
         * <li>LessThanOrEqualToThreshold: less than or equal to the threshold</li>
         * <li>LessThanThreshold: less than the threshold</li>
         * <li>NotEqualToThreshold: not equal to the threshold</li>
         * <li>GreaterThanYesterday: greater than the metric value at the same time yesterday</li>
         * <li>LessThanYesterday: less than the metric value at the same time yesterday</li>
         * <li>GreaterThanLastWeek: greater than the metric value at the same time last week</li>
         * <li>LessThanLastWeek: less than the metric value at the same time last week</li>
         * <li>GreaterThanLastPeriod: greater than the metric value in the last monitoring cycle</li>
         * <li>LessThanLastPeriod: less than the metric value in the last monitoring cycle</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GreaterThanOrEqualToThreshold</p>
         */
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        /**
         * <p>The description of the alert rule.</p>
         * <blockquote>
         * <p> This parameter indicates the content of the alert rule. If the metric value meets the alert condition, an alert is triggered.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>$Average&gt;=10</p>
         */
        @NameInMap("Expression")
        public String expression;

        /**
         * <p>The description of the multi-metric alert rule.</p>
         */
        @NameInMap("ExpressionList")
        public DescribeAlertingMetricRuleResourcesResponseBodyResourcesResourceEscalationResourceExpressionList expressionList;

        /**
         * <p>The relationship between multiple metrics. Valid values:</p>
         * <ul>
         * <li>&amp;&amp;: If all metrics meet the alert conditions, CloudMonitor sends alert notifications.</li>
         * <li>||: If one of the metrics meets the alert conditions, CloudMonitor sends alert notifications.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>&amp;&amp;</p>
         */
        @NameInMap("ExpressionListJoin")
        public String expressionListJoin;

        /**
         * <p>The trigger conditions that are created by using expressions. You can use expressions to create trigger conditions in the following scenarios:</p>
         * <ul>
         * <li>Set an alert blacklist for specific resources. For example, if you specify <code>$instanceId != \\&quot;i-io8kfvcpp7x5****\\&quot; ``&amp;&amp;`` $Average &gt; 50</code>, no alert is triggered when the <code>average metric value</code> of the <code>i-io8kfvcpp7x5****</code> instance exceeds 50.</li>
         * <li>Set a special alert threshold for a specified instance in the rule. For example, if you specify <code>$Average &gt; ($instanceId == \\&quot;i-io8kfvcpp7x5****\\&quot;? 80: 50)</code>, an alert is triggered when the <code>average metric value</code> of the <code>i-io8kfvcpp7x5****</code> instance exceeds 80 or the <code>average metric value</code> of other instances exceeds 50.</li>
         * <li>Limit the number of instances whose metric values exceed the threshold. For example, if you specify <code>count($Average &gt; 20) &gt; 3</code>, an alert is triggered only when the <code>average metric value</code> of more than three instances exceeds 20.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>$Average &gt; ($instanceId == \&quot;i-io8kfvcpp7x5****\&quot;? 80: 50)</p>
         */
        @NameInMap("ExpressionRaw")
        public String expressionRaw;

        /**
         * <p>The severity level and notification methods of the alert. Valid values:</p>
         * <ul>
         * <li>4: Alert notifications are sent by using emails and DingTalk chatbots.</li>
         * <li>OK: No alert is generated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Level")
        public Integer level;

        /**
         * <p>The operator that is used to compare the metric value with the threshold. Valid values:</p>
         * <ul>
         * <li><code>&gt;=</code></li>
         * <li><code>=</code></li>
         * <li><code>&lt;=</code></li>
         * <li><code>&gt;</code></li>
         * <li><code>&lt;</code></li>
         * <li><code>!=</code></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <blockquote>
         * <p>=</p>
         * </blockquote>
         */
        @NameInMap("PreCondition")
        public String preCondition;

        /**
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>mns</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The alert threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Threshold")
        public String threshold;

        /**
         * <p>The consecutive number of times for which the metric value meets the alert condition before an alert is triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>The dimensions based on which the resources are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;region\&quot;:\&quot;cn-huhehaote\&quot;,\&quot;queue\&quot;:\&quot;test-0128\&quot;,\&quot;userId\&quot;:\&quot;120886317861****\&quot;}</p>
         */
        @NameInMap("Dimensions")
        public String dimensions;

        /**
         * <p>Indicates whether the alert rule is enabled. Valid values:</p>
         * <ul>
         * <li>true: The alert rule is enabled.</li>
         * <li>false: The alert rule is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enable")
        public String enable;

        /**
         * <p>The alert rule based on which the alert is triggered.</p>
         */
        @NameInMap("Escalation")
        public DescribeAlertingMetricRuleResourcesResponseBodyResourcesResourceEscalation escalation;

        /**
         * <p>The ID of the application group.</p>
         * <blockquote>
         * <p> If the alert rule is associated with an application group, the ID of the application group is returned in this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>7671****</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The time when the last alert was triggered for the resource based on the alert rule. The value is a timestamp.</p>
         * <p>Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1622427900000</p>
         */
        @NameInMap("LastAlertTime")
        public String lastAlertTime;

        /**
         * <p>The time when the alert rule was last modified. The value is a timestamp.</p>
         * <p>Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1622827900000</p>
         */
        @NameInMap("LastModifyTime")
        public String lastModifyTime;

        /**
         * <p>The severity level and notification methods of the alert. Valid values:</p>
         * <ul>
         * <li>4: Alert notifications are sent by using emails and DingTalk chatbots.</li>
         * <li>OK: No alert is generated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Level")
        public Integer level;

        /**
         * <p>The metric name.</p>
         * 
         * <strong>example:</strong>
         * <p>ActiveMessages</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The metric value that triggered the alert based on the alert rule. The value is a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;timestamp\&quot;:1623727500000,\&quot;Sum\&quot;:926,\&quot;value\&quot;:463,\&quot;Maximum\&quot;:463,\&quot;Minimum\&quot;:463,\&quot;Average\&quot;:463,\&quot;SampleCount\&quot;:2,\&quot;userId\&quot;:\&quot;120886317861****\&quot;,\&quot;region\&quot;:\&quot;cn-huhehaote\&quot;,\&quot;queue\&quot;:\&quot;test-0128\&quot;}</p>
         */
        @NameInMap("MetricValues")
        public String metricValues;

        /**
         * <p>The namespace of the cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>acs_mns_new</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The type of the cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>mns</p>
         */
        @NameInMap("ProductCategory")
        public String productCategory;

        /**
         * <p>The resources that are monitored.</p>
         * 
         * <strong>example:</strong>
         * <p>userId=120886317861****,region=cn-huhehaote,queue=test-0128</p>
         */
        @NameInMap("Resource")
        public String resource;

        /**
         * <p>The consecutive number of times for which the metric value meets the alert condition before an alert is triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("RetryTimes")
        public String retryTimes;

        /**
         * <p>The ID of the alert rule.</p>
         * 
         * <strong>example:</strong>
         * <p>putNewAlarm_user_7e78d765-0e3e-4671-ba6d-7ce39108****</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The name of the alert rule.</p>
         * 
         * <strong>example:</strong>
         * <p>test123456789</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The time when the resource was associated with the alert rule. The value is a timestamp.</p>
         * <p>Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1622427900000</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The method used to calculate the metric values that trigger alerts.</p>
         * 
         * <strong>example:</strong>
         * <p>Average</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>The alert threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
