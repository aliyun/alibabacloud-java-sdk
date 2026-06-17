// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutCustomMetricRuleRequest extends TeaModel {
    /**
     * <p>The comparison operator for the threshold. Valid values:</p>
     * <ul>
     * <li><p><code>&gt;=</code></p>
     * </li>
     * <li><p><code>=</code></p>
     * </li>
     * <li><p><code>&lt;=</code></p>
     * </li>
     * <li><p><code>&gt;</code></p>
     * </li>
     * <li><p><code>&lt;</code></p>
     * </li>
     * <li><p><code>!=</code>.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <blockquote>
     * <p>=</p>
     * </blockquote>
     */
    @NameInMap("ComparisonOperator")
    public String comparisonOperator;

    /**
     * <p>The alert contact group. Separate multiple alert contact groups with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS_Group</p>
     */
    @NameInMap("ContactGroups")
    public String contactGroups;

    /**
     * <p>The effective time range of the alert rule. Valid values: 00:00-23:59.</p>
     * 
     * <strong>example:</strong>
     * <p>00:00-23:59</p>
     */
    @NameInMap("EffectiveInterval")
    public String effectiveInterval;

    /**
     * <p>The subject of the alert email.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS instance</p>
     */
    @NameInMap("EmailSubject")
    public String emailSubject;

    /**
     * <p>The number of alert retries.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("EvaluationCount")
    public Integer evaluationCount;

    /**
     * <p>The ID of the application group to which the custom monitoring data belongs.</p>
     * <blockquote>
     * <p>A value of 0 indicates that the reported custom monitoring data does not belong to any application group.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>7378****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The alert level. Valid values:</p>
     * <ul>
     * <li>CRITICAL: critical.</li>
     * <li>WARN: warning.</li>
     * <li>INFO: information.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CRITICAL</p>
     */
    @NameInMap("Level")
    public String level;

    /**
     * <p>The metric name.</p>
     * <blockquote>
     * <p>For more information about how to obtain the metric name, see <a href="https://help.aliyun.com/document_detail/115005.html">DescribeCustomMetricList</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cpu_total</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>The aggregation period of the custom monitoring data. Unit: seconds. Set the value to 60 or a multiple of 60. Default value: the original reporting period of the custom monitoring data.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The custom monitoring data to which the alert rule applies. The value consists of the application group ID to which the custom monitoring data belongs and the dimensions of the metric.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;groupId&quot;:7378****,&quot;dimension&quot;:&quot;instanceId=i-hp3543t5e4sudb3s****&quot;}]</p>
     */
    @NameInMap("Resources")
    public String resources;

    /**
     * <p>The ID of the alert rule.</p>
     * <blockquote>
     * <p>If the alert rule ID already exists, the alert rule is modified. If the alert rule ID does not exist, an alert rule is created.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MyRuleId1</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    /**
     * <p>The name of the alert rule.</p>
     * 
     * <strong>example:</strong>
     * <p>CpuUsage</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The mute for period. Unit: seconds. Default value: 86400 (1 day).</p>
     * <blockquote>
     * <p>If the monitoring data continuously exceeds the alert threshold, only one alert notification is sent within each mute for period.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>86400</p>
     */
    @NameInMap("SilenceTime")
    public Integer silenceTime;

    /**
     * <p>The statistical method for alerts.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Average</p>
     */
    @NameInMap("Statistics")
    public String statistics;

    /**
     * <p>The alert threshold.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>90</p>
     */
    @NameInMap("Threshold")
    public String threshold;

    /**
     * <p>The alert callback URL. An HTTP POST request is sent to the specified URL when an alert is triggered.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://www.aliyun.com">https://www.aliyun.com</a></p>
     */
    @NameInMap("Webhook")
    public String webhook;

    public static PutCustomMetricRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        PutCustomMetricRuleRequest self = new PutCustomMetricRuleRequest();
        return TeaModel.build(map, self);
    }

    public PutCustomMetricRuleRequest setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
        return this;
    }
    public String getComparisonOperator() {
        return this.comparisonOperator;
    }

    public PutCustomMetricRuleRequest setContactGroups(String contactGroups) {
        this.contactGroups = contactGroups;
        return this;
    }
    public String getContactGroups() {
        return this.contactGroups;
    }

    public PutCustomMetricRuleRequest setEffectiveInterval(String effectiveInterval) {
        this.effectiveInterval = effectiveInterval;
        return this;
    }
    public String getEffectiveInterval() {
        return this.effectiveInterval;
    }

    public PutCustomMetricRuleRequest setEmailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
        return this;
    }
    public String getEmailSubject() {
        return this.emailSubject;
    }

    public PutCustomMetricRuleRequest setEvaluationCount(Integer evaluationCount) {
        this.evaluationCount = evaluationCount;
        return this;
    }
    public Integer getEvaluationCount() {
        return this.evaluationCount;
    }

    public PutCustomMetricRuleRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public PutCustomMetricRuleRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public PutCustomMetricRuleRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public PutCustomMetricRuleRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public PutCustomMetricRuleRequest setResources(String resources) {
        this.resources = resources;
        return this;
    }
    public String getResources() {
        return this.resources;
    }

    public PutCustomMetricRuleRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public PutCustomMetricRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public PutCustomMetricRuleRequest setSilenceTime(Integer silenceTime) {
        this.silenceTime = silenceTime;
        return this;
    }
    public Integer getSilenceTime() {
        return this.silenceTime;
    }

    public PutCustomMetricRuleRequest setStatistics(String statistics) {
        this.statistics = statistics;
        return this;
    }
    public String getStatistics() {
        return this.statistics;
    }

    public PutCustomMetricRuleRequest setThreshold(String threshold) {
        this.threshold = threshold;
        return this;
    }
    public String getThreshold() {
        return this.threshold;
    }

    public PutCustomMetricRuleRequest setWebhook(String webhook) {
        this.webhook = webhook;
        return this;
    }
    public String getWebhook() {
        return this.webhook;
    }

}
