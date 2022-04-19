// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutResourceMetricRulesRequest extends TeaModel {
    @NameInMap("Rules")
    public java.util.List<PutResourceMetricRulesRequestRules> rules;

    public static PutResourceMetricRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        PutResourceMetricRulesRequest self = new PutResourceMetricRulesRequest();
        return TeaModel.build(map, self);
    }

    public PutResourceMetricRulesRequest setRules(java.util.List<PutResourceMetricRulesRequestRules> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<PutResourceMetricRulesRequestRules> getRules() {
        return this.rules;
    }

    public static class PutResourceMetricRulesRequestRulesEscalationsCritical extends TeaModel {
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("PreCondition")
        public String preCondition;

        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Times")
        public Integer times;

        public static PutResourceMetricRulesRequestRulesEscalationsCritical build(java.util.Map<String, ?> map) throws Exception {
            PutResourceMetricRulesRequestRulesEscalationsCritical self = new PutResourceMetricRulesRequestRulesEscalationsCritical();
            return TeaModel.build(map, self);
        }

        public PutResourceMetricRulesRequestRulesEscalationsCritical setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public PutResourceMetricRulesRequestRulesEscalationsCritical setPreCondition(String preCondition) {
            this.preCondition = preCondition;
            return this;
        }
        public String getPreCondition() {
            return this.preCondition;
        }

        public PutResourceMetricRulesRequestRulesEscalationsCritical setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public PutResourceMetricRulesRequestRulesEscalationsCritical setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public PutResourceMetricRulesRequestRulesEscalationsCritical setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class PutResourceMetricRulesRequestRulesEscalationsInfo extends TeaModel {
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("PreCondition")
        public String preCondition;

        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Times")
        public Integer times;

        public static PutResourceMetricRulesRequestRulesEscalationsInfo build(java.util.Map<String, ?> map) throws Exception {
            PutResourceMetricRulesRequestRulesEscalationsInfo self = new PutResourceMetricRulesRequestRulesEscalationsInfo();
            return TeaModel.build(map, self);
        }

        public PutResourceMetricRulesRequestRulesEscalationsInfo setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public PutResourceMetricRulesRequestRulesEscalationsInfo setPreCondition(String preCondition) {
            this.preCondition = preCondition;
            return this;
        }
        public String getPreCondition() {
            return this.preCondition;
        }

        public PutResourceMetricRulesRequestRulesEscalationsInfo setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public PutResourceMetricRulesRequestRulesEscalationsInfo setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public PutResourceMetricRulesRequestRulesEscalationsInfo setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class PutResourceMetricRulesRequestRulesEscalationsWarn extends TeaModel {
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("PreCondition")
        public String preCondition;

        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Times")
        public Integer times;

        public static PutResourceMetricRulesRequestRulesEscalationsWarn build(java.util.Map<String, ?> map) throws Exception {
            PutResourceMetricRulesRequestRulesEscalationsWarn self = new PutResourceMetricRulesRequestRulesEscalationsWarn();
            return TeaModel.build(map, self);
        }

        public PutResourceMetricRulesRequestRulesEscalationsWarn setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public PutResourceMetricRulesRequestRulesEscalationsWarn setPreCondition(String preCondition) {
            this.preCondition = preCondition;
            return this;
        }
        public String getPreCondition() {
            return this.preCondition;
        }

        public PutResourceMetricRulesRequestRulesEscalationsWarn setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public PutResourceMetricRulesRequestRulesEscalationsWarn setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public PutResourceMetricRulesRequestRulesEscalationsWarn setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class PutResourceMetricRulesRequestRulesEscalations extends TeaModel {
        @NameInMap("Critical")
        @Validation(required = true)
        public PutResourceMetricRulesRequestRulesEscalationsCritical critical;

        @NameInMap("Info")
        @Validation(required = true)
        public PutResourceMetricRulesRequestRulesEscalationsInfo info;

        @NameInMap("Warn")
        @Validation(required = true)
        public PutResourceMetricRulesRequestRulesEscalationsWarn warn;

        public static PutResourceMetricRulesRequestRulesEscalations build(java.util.Map<String, ?> map) throws Exception {
            PutResourceMetricRulesRequestRulesEscalations self = new PutResourceMetricRulesRequestRulesEscalations();
            return TeaModel.build(map, self);
        }

        public PutResourceMetricRulesRequestRulesEscalations setCritical(PutResourceMetricRulesRequestRulesEscalationsCritical critical) {
            this.critical = critical;
            return this;
        }
        public PutResourceMetricRulesRequestRulesEscalationsCritical getCritical() {
            return this.critical;
        }

        public PutResourceMetricRulesRequestRulesEscalations setInfo(PutResourceMetricRulesRequestRulesEscalationsInfo info) {
            this.info = info;
            return this;
        }
        public PutResourceMetricRulesRequestRulesEscalationsInfo getInfo() {
            return this.info;
        }

        public PutResourceMetricRulesRequestRulesEscalations setWarn(PutResourceMetricRulesRequestRulesEscalationsWarn warn) {
            this.warn = warn;
            return this;
        }
        public PutResourceMetricRulesRequestRulesEscalationsWarn getWarn() {
            return this.warn;
        }

    }

    public static class PutResourceMetricRulesRequestRulesLabels extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static PutResourceMetricRulesRequestRulesLabels build(java.util.Map<String, ?> map) throws Exception {
            PutResourceMetricRulesRequestRulesLabels self = new PutResourceMetricRulesRequestRulesLabels();
            return TeaModel.build(map, self);
        }

        public PutResourceMetricRulesRequestRulesLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public PutResourceMetricRulesRequestRulesLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class PutResourceMetricRulesRequestRules extends TeaModel {
        @NameInMap("Escalations")
        @Validation(required = true)
        public PutResourceMetricRulesRequestRulesEscalations escalations;

        @NameInMap("ContactGroups")
        public String contactGroups;

        @NameInMap("EffectiveInterval")
        public String effectiveInterval;

        @NameInMap("EmailSubject")
        public String emailSubject;

        @NameInMap("Interval")
        public String interval;

        @NameInMap("Labels")
        public java.util.List<PutResourceMetricRulesRequestRulesLabels> labels;

        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("NoDataPolicy")
        public String noDataPolicy;

        @NameInMap("NoEffectiveInterval")
        public String noEffectiveInterval;

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

        @NameInMap("Webhook")
        public String webhook;

        public static PutResourceMetricRulesRequestRules build(java.util.Map<String, ?> map) throws Exception {
            PutResourceMetricRulesRequestRules self = new PutResourceMetricRulesRequestRules();
            return TeaModel.build(map, self);
        }

        public PutResourceMetricRulesRequestRules setEscalations(PutResourceMetricRulesRequestRulesEscalations escalations) {
            this.escalations = escalations;
            return this;
        }
        public PutResourceMetricRulesRequestRulesEscalations getEscalations() {
            return this.escalations;
        }

        public PutResourceMetricRulesRequestRules setContactGroups(String contactGroups) {
            this.contactGroups = contactGroups;
            return this;
        }
        public String getContactGroups() {
            return this.contactGroups;
        }

        public PutResourceMetricRulesRequestRules setEffectiveInterval(String effectiveInterval) {
            this.effectiveInterval = effectiveInterval;
            return this;
        }
        public String getEffectiveInterval() {
            return this.effectiveInterval;
        }

        public PutResourceMetricRulesRequestRules setEmailSubject(String emailSubject) {
            this.emailSubject = emailSubject;
            return this;
        }
        public String getEmailSubject() {
            return this.emailSubject;
        }

        public PutResourceMetricRulesRequestRules setInterval(String interval) {
            this.interval = interval;
            return this;
        }
        public String getInterval() {
            return this.interval;
        }

        public PutResourceMetricRulesRequestRules setLabels(java.util.List<PutResourceMetricRulesRequestRulesLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<PutResourceMetricRulesRequestRulesLabels> getLabels() {
            return this.labels;
        }

        public PutResourceMetricRulesRequestRules setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public PutResourceMetricRulesRequestRules setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public PutResourceMetricRulesRequestRules setNoDataPolicy(String noDataPolicy) {
            this.noDataPolicy = noDataPolicy;
            return this;
        }
        public String getNoDataPolicy() {
            return this.noDataPolicy;
        }

        public PutResourceMetricRulesRequestRules setNoEffectiveInterval(String noEffectiveInterval) {
            this.noEffectiveInterval = noEffectiveInterval;
            return this;
        }
        public String getNoEffectiveInterval() {
            return this.noEffectiveInterval;
        }

        public PutResourceMetricRulesRequestRules setPeriod(String period) {
            this.period = period;
            return this;
        }
        public String getPeriod() {
            return this.period;
        }

        public PutResourceMetricRulesRequestRules setResources(String resources) {
            this.resources = resources;
            return this;
        }
        public String getResources() {
            return this.resources;
        }

        public PutResourceMetricRulesRequestRules setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public PutResourceMetricRulesRequestRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public PutResourceMetricRulesRequestRules setSilenceTime(Integer silenceTime) {
            this.silenceTime = silenceTime;
            return this;
        }
        public Integer getSilenceTime() {
            return this.silenceTime;
        }

        public PutResourceMetricRulesRequestRules setWebhook(String webhook) {
            this.webhook = webhook;
            return this;
        }
        public String getWebhook() {
            return this.webhook;
        }

    }

}
