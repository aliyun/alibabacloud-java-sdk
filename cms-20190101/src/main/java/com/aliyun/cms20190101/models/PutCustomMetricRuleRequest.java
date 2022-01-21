// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutCustomMetricRuleRequest extends TeaModel {
    @NameInMap("ComparisonOperator")
    public String comparisonOperator;

    @NameInMap("ContactGroups")
    public String contactGroups;

    @NameInMap("EffectiveInterval")
    public String effectiveInterval;

    @NameInMap("EmailSubject")
    public String emailSubject;

    @NameInMap("EvaluationCount")
    public Integer evaluationCount;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("Level")
    public String level;

    @NameInMap("MetricName")
    public String metricName;

    @NameInMap("Period")
    public String period;

    @NameInMap("Resources")
    public String resources;

    @NameInMap("RuleId")
    public String ruleId;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("SilenceTime")
    public Integer silenceTime;

    @NameInMap("Statistics")
    public String statistics;

    @NameInMap("Threshold")
    public String threshold;

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
