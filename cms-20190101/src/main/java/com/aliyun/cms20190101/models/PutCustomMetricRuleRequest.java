// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutCustomMetricRuleRequest extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * <br>
     * <p>>  The value 200 indicates that the call was successful.</p>
     */
    @NameInMap("ComparisonOperator")
    public String comparisonOperator;

    /**
     * <p>The callback URL to which a POST request is sent when an alert is triggered based on the alert rule.</p>
     */
    @NameInMap("ContactGroups")
    public String contactGroups;

    /**
     * <p>The mute period during which notifications are not repeatedly sent for an alert. Unit: seconds. Default value: 86400. The default value indicates one day.</p>
     * <br>
     * <p>>  Only one alert notification is sent during each mute period even if the metric value consecutively exceeds the alert threshold several times.</p>
     */
    @NameInMap("EffectiveInterval")
    public String effectiveInterval;

    /**
     * <p>The threshold of the metric value.</p>
     */
    @NameInMap("EmailSubject")
    public String emailSubject;

    /**
     * <p>The method that is used to calculate the metric values that trigger alerts.</p>
     */
    @NameInMap("EvaluationCount")
    public Integer evaluationCount;

    /**
     * <p>The ID of the alert rule.</p>
     * <br>
     * <p>>  You can specify an existing ID to modify the corresponding alert rule or specify a new ID to create an alert rule.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The consecutive number of times for which the metric value is measured before an alert is triggered.</p>
     */
    @NameInMap("Level")
    public String level;

    /**
     * <p>The custom monitoring data to which the alert rule applies. The value includes the application group ID to which the custom monitoring data belongs and the dimension to which the metric belongs.</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>The subject of the alert notification email.</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The alert group that receives alert notifications. Separate multiple alert groups with commas (,).</p>
     */
    @NameInMap("Resources")
    public String resources;

    /**
     * <p>The name of the alert rule.</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    /**
     * <p>The name of the metric.</p>
     * <br>
     * <p>>  For more information about how to obtain the metric name, see [DescribeCustomMetricList](~~115005~~).</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The cycle that is used to aggregate custom monitoring data. Unit: seconds. Set the value to an integral multiple of 60. The original reporting cycle of custom monitoring data is used by default.</p>
     */
    @NameInMap("SilenceTime")
    public Integer silenceTime;

    /**
     * <p>The comparison operator before the threshold. Valid values:</p>
     * <br>
     * <p>*   `>=`</p>
     * <p>*   `=`</p>
     * <p>*   `<=`</p>
     * <p>*   `>`</p>
     * <p>*   `<`</p>
     * <p>*   `!=`</p>
     */
    @NameInMap("Statistics")
    public String statistics;

    /**
     * <p>The level of the alert. Valid values:</p>
     * <br>
     * <p>*   CRITICAL</p>
     * <p>*   WARN</p>
     * <p>*   INFO</p>
     */
    @NameInMap("Threshold")
    public String threshold;

    /**
     * <p>The time period during which the alert rule is effective. Valid values: 00:00 to 23:59.</p>
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
