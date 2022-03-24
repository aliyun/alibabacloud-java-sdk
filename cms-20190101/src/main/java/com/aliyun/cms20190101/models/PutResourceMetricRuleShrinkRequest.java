// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutResourceMetricRuleShrinkRequest extends TeaModel {
    @NameInMap("Escalations")
    public PutResourceMetricRuleShrinkRequestEscalations escalations;

    @NameInMap("CompositeExpression")
    public String compositeExpressionShrink;

    @NameInMap("ContactGroups")
    public String contactGroups;

    @NameInMap("EffectiveInterval")
    public String effectiveInterval;

    @NameInMap("EmailSubject")
    public String emailSubject;

    @NameInMap("Interval")
    public String interval;

    @NameInMap("Labels")
    public java.util.List<PutResourceMetricRuleShrinkRequestLabels> labels;

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

    public static PutResourceMetricRuleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        PutResourceMetricRuleShrinkRequest self = new PutResourceMetricRuleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public PutResourceMetricRuleShrinkRequest setEscalations(PutResourceMetricRuleShrinkRequestEscalations escalations) {
        this.escalations = escalations;
        return this;
    }
    public PutResourceMetricRuleShrinkRequestEscalations getEscalations() {
        return this.escalations;
    }

    public PutResourceMetricRuleShrinkRequest setCompositeExpressionShrink(String compositeExpressionShrink) {
        this.compositeExpressionShrink = compositeExpressionShrink;
        return this;
    }
    public String getCompositeExpressionShrink() {
        return this.compositeExpressionShrink;
    }

    public PutResourceMetricRuleShrinkRequest setContactGroups(String contactGroups) {
        this.contactGroups = contactGroups;
        return this;
    }
    public String getContactGroups() {
        return this.contactGroups;
    }

    public PutResourceMetricRuleShrinkRequest setEffectiveInterval(String effectiveInterval) {
        this.effectiveInterval = effectiveInterval;
        return this;
    }
    public String getEffectiveInterval() {
        return this.effectiveInterval;
    }

    public PutResourceMetricRuleShrinkRequest setEmailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
        return this;
    }
    public String getEmailSubject() {
        return this.emailSubject;
    }

    public PutResourceMetricRuleShrinkRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public PutResourceMetricRuleShrinkRequest setLabels(java.util.List<PutResourceMetricRuleShrinkRequestLabels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<PutResourceMetricRuleShrinkRequestLabels> getLabels() {
        return this.labels;
    }

    public PutResourceMetricRuleShrinkRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public PutResourceMetricRuleShrinkRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public PutResourceMetricRuleShrinkRequest setNoDataPolicy(String noDataPolicy) {
        this.noDataPolicy = noDataPolicy;
        return this;
    }
    public String getNoDataPolicy() {
        return this.noDataPolicy;
    }

    public PutResourceMetricRuleShrinkRequest setNoEffectiveInterval(String noEffectiveInterval) {
        this.noEffectiveInterval = noEffectiveInterval;
        return this;
    }
    public String getNoEffectiveInterval() {
        return this.noEffectiveInterval;
    }

    public PutResourceMetricRuleShrinkRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public PutResourceMetricRuleShrinkRequest setResources(String resources) {
        this.resources = resources;
        return this;
    }
    public String getResources() {
        return this.resources;
    }

    public PutResourceMetricRuleShrinkRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public PutResourceMetricRuleShrinkRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public PutResourceMetricRuleShrinkRequest setSilenceTime(Integer silenceTime) {
        this.silenceTime = silenceTime;
        return this;
    }
    public Integer getSilenceTime() {
        return this.silenceTime;
    }

    public PutResourceMetricRuleShrinkRequest setWebhook(String webhook) {
        this.webhook = webhook;
        return this;
    }
    public String getWebhook() {
        return this.webhook;
    }

    public static class PutResourceMetricRuleShrinkRequestEscalationsCritical extends TeaModel {
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Times")
        public Integer times;

        public static PutResourceMetricRuleShrinkRequestEscalationsCritical build(java.util.Map<String, ?> map) throws Exception {
            PutResourceMetricRuleShrinkRequestEscalationsCritical self = new PutResourceMetricRuleShrinkRequestEscalationsCritical();
            return TeaModel.build(map, self);
        }

        public PutResourceMetricRuleShrinkRequestEscalationsCritical setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public PutResourceMetricRuleShrinkRequestEscalationsCritical setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public PutResourceMetricRuleShrinkRequestEscalationsCritical setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public PutResourceMetricRuleShrinkRequestEscalationsCritical setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class PutResourceMetricRuleShrinkRequestEscalationsInfo extends TeaModel {
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Times")
        public Integer times;

        public static PutResourceMetricRuleShrinkRequestEscalationsInfo build(java.util.Map<String, ?> map) throws Exception {
            PutResourceMetricRuleShrinkRequestEscalationsInfo self = new PutResourceMetricRuleShrinkRequestEscalationsInfo();
            return TeaModel.build(map, self);
        }

        public PutResourceMetricRuleShrinkRequestEscalationsInfo setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public PutResourceMetricRuleShrinkRequestEscalationsInfo setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public PutResourceMetricRuleShrinkRequestEscalationsInfo setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public PutResourceMetricRuleShrinkRequestEscalationsInfo setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class PutResourceMetricRuleShrinkRequestEscalationsWarn extends TeaModel {
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Times")
        public Integer times;

        public static PutResourceMetricRuleShrinkRequestEscalationsWarn build(java.util.Map<String, ?> map) throws Exception {
            PutResourceMetricRuleShrinkRequestEscalationsWarn self = new PutResourceMetricRuleShrinkRequestEscalationsWarn();
            return TeaModel.build(map, self);
        }

        public PutResourceMetricRuleShrinkRequestEscalationsWarn setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public PutResourceMetricRuleShrinkRequestEscalationsWarn setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public PutResourceMetricRuleShrinkRequestEscalationsWarn setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public PutResourceMetricRuleShrinkRequestEscalationsWarn setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class PutResourceMetricRuleShrinkRequestEscalations extends TeaModel {
        @NameInMap("Critical")
        @Validation(required = true)
        public PutResourceMetricRuleShrinkRequestEscalationsCritical critical;

        @NameInMap("Info")
        @Validation(required = true)
        public PutResourceMetricRuleShrinkRequestEscalationsInfo info;

        @NameInMap("Warn")
        @Validation(required = true)
        public PutResourceMetricRuleShrinkRequestEscalationsWarn warn;

        public static PutResourceMetricRuleShrinkRequestEscalations build(java.util.Map<String, ?> map) throws Exception {
            PutResourceMetricRuleShrinkRequestEscalations self = new PutResourceMetricRuleShrinkRequestEscalations();
            return TeaModel.build(map, self);
        }

        public PutResourceMetricRuleShrinkRequestEscalations setCritical(PutResourceMetricRuleShrinkRequestEscalationsCritical critical) {
            this.critical = critical;
            return this;
        }
        public PutResourceMetricRuleShrinkRequestEscalationsCritical getCritical() {
            return this.critical;
        }

        public PutResourceMetricRuleShrinkRequestEscalations setInfo(PutResourceMetricRuleShrinkRequestEscalationsInfo info) {
            this.info = info;
            return this;
        }
        public PutResourceMetricRuleShrinkRequestEscalationsInfo getInfo() {
            return this.info;
        }

        public PutResourceMetricRuleShrinkRequestEscalations setWarn(PutResourceMetricRuleShrinkRequestEscalationsWarn warn) {
            this.warn = warn;
            return this;
        }
        public PutResourceMetricRuleShrinkRequestEscalationsWarn getWarn() {
            return this.warn;
        }

    }

    public static class PutResourceMetricRuleShrinkRequestLabels extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static PutResourceMetricRuleShrinkRequestLabels build(java.util.Map<String, ?> map) throws Exception {
            PutResourceMetricRuleShrinkRequestLabels self = new PutResourceMetricRuleShrinkRequestLabels();
            return TeaModel.build(map, self);
        }

        public PutResourceMetricRuleShrinkRequestLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public PutResourceMetricRuleShrinkRequestLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
