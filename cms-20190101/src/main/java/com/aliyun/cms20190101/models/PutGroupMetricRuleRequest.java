// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutGroupMetricRuleRequest extends TeaModel {
    @NameInMap("Escalations")
    public PutGroupMetricRuleRequestEscalations escalations;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("RuleId")
    public String ruleId;

    @NameInMap("Category")
    public String category;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("MetricName")
    public String metricName;

    @NameInMap("Dimensions")
    public String dimensions;

    @NameInMap("EffectiveInterval")
    public String effectiveInterval;

    @NameInMap("NoEffectiveInterval")
    public String noEffectiveInterval;

    @NameInMap("SilenceTime")
    public Integer silenceTime;

    @NameInMap("Period")
    public String period;

    @NameInMap("Interval")
    public String interval;

    @NameInMap("Webhook")
    public String webhook;

    @NameInMap("EmailSubject")
    public String emailSubject;

    @NameInMap("ContactGroups")
    public String contactGroups;

    public static PutGroupMetricRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        PutGroupMetricRuleRequest self = new PutGroupMetricRuleRequest();
        return TeaModel.build(map, self);
    }

    public PutGroupMetricRuleRequest setEscalations(PutGroupMetricRuleRequestEscalations escalations) {
        this.escalations = escalations;
        return this;
    }
    public PutGroupMetricRuleRequestEscalations getEscalations() {
        return this.escalations;
    }

    public PutGroupMetricRuleRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public PutGroupMetricRuleRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public PutGroupMetricRuleRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public PutGroupMetricRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public PutGroupMetricRuleRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public PutGroupMetricRuleRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public PutGroupMetricRuleRequest setDimensions(String dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public String getDimensions() {
        return this.dimensions;
    }

    public PutGroupMetricRuleRequest setEffectiveInterval(String effectiveInterval) {
        this.effectiveInterval = effectiveInterval;
        return this;
    }
    public String getEffectiveInterval() {
        return this.effectiveInterval;
    }

    public PutGroupMetricRuleRequest setNoEffectiveInterval(String noEffectiveInterval) {
        this.noEffectiveInterval = noEffectiveInterval;
        return this;
    }
    public String getNoEffectiveInterval() {
        return this.noEffectiveInterval;
    }

    public PutGroupMetricRuleRequest setSilenceTime(Integer silenceTime) {
        this.silenceTime = silenceTime;
        return this;
    }
    public Integer getSilenceTime() {
        return this.silenceTime;
    }

    public PutGroupMetricRuleRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public PutGroupMetricRuleRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public PutGroupMetricRuleRequest setWebhook(String webhook) {
        this.webhook = webhook;
        return this;
    }
    public String getWebhook() {
        return this.webhook;
    }

    public PutGroupMetricRuleRequest setEmailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
        return this;
    }
    public String getEmailSubject() {
        return this.emailSubject;
    }

    public PutGroupMetricRuleRequest setContactGroups(String contactGroups) {
        this.contactGroups = contactGroups;
        return this;
    }
    public String getContactGroups() {
        return this.contactGroups;
    }

    public static class PutGroupMetricRuleRequestEscalationsCritical extends TeaModel {
        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Times")
        public Integer times;

        public static PutGroupMetricRuleRequestEscalationsCritical build(java.util.Map<String, ?> map) throws Exception {
            PutGroupMetricRuleRequestEscalationsCritical self = new PutGroupMetricRuleRequestEscalationsCritical();
            return TeaModel.build(map, self);
        }

        public PutGroupMetricRuleRequestEscalationsCritical setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public PutGroupMetricRuleRequestEscalationsCritical setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public PutGroupMetricRuleRequestEscalationsCritical setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public PutGroupMetricRuleRequestEscalationsCritical setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class PutGroupMetricRuleRequestEscalationsWarn extends TeaModel {
        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Times")
        public Integer times;

        public static PutGroupMetricRuleRequestEscalationsWarn build(java.util.Map<String, ?> map) throws Exception {
            PutGroupMetricRuleRequestEscalationsWarn self = new PutGroupMetricRuleRequestEscalationsWarn();
            return TeaModel.build(map, self);
        }

        public PutGroupMetricRuleRequestEscalationsWarn setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public PutGroupMetricRuleRequestEscalationsWarn setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public PutGroupMetricRuleRequestEscalationsWarn setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public PutGroupMetricRuleRequestEscalationsWarn setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class PutGroupMetricRuleRequestEscalationsInfo extends TeaModel {
        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Times")
        public Integer times;

        public static PutGroupMetricRuleRequestEscalationsInfo build(java.util.Map<String, ?> map) throws Exception {
            PutGroupMetricRuleRequestEscalationsInfo self = new PutGroupMetricRuleRequestEscalationsInfo();
            return TeaModel.build(map, self);
        }

        public PutGroupMetricRuleRequestEscalationsInfo setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public PutGroupMetricRuleRequestEscalationsInfo setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public PutGroupMetricRuleRequestEscalationsInfo setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public PutGroupMetricRuleRequestEscalationsInfo setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class PutGroupMetricRuleRequestEscalations extends TeaModel {
        @NameInMap("Critical")
        @Validation(required = true)
        public PutGroupMetricRuleRequestEscalationsCritical critical;

        @NameInMap("Warn")
        @Validation(required = true)
        public PutGroupMetricRuleRequestEscalationsWarn warn;

        @NameInMap("Info")
        @Validation(required = true)
        public PutGroupMetricRuleRequestEscalationsInfo info;

        public static PutGroupMetricRuleRequestEscalations build(java.util.Map<String, ?> map) throws Exception {
            PutGroupMetricRuleRequestEscalations self = new PutGroupMetricRuleRequestEscalations();
            return TeaModel.build(map, self);
        }

        public PutGroupMetricRuleRequestEscalations setCritical(PutGroupMetricRuleRequestEscalationsCritical critical) {
            this.critical = critical;
            return this;
        }
        public PutGroupMetricRuleRequestEscalationsCritical getCritical() {
            return this.critical;
        }

        public PutGroupMetricRuleRequestEscalations setWarn(PutGroupMetricRuleRequestEscalationsWarn warn) {
            this.warn = warn;
            return this;
        }
        public PutGroupMetricRuleRequestEscalationsWarn getWarn() {
            return this.warn;
        }

        public PutGroupMetricRuleRequestEscalations setInfo(PutGroupMetricRuleRequestEscalationsInfo info) {
            this.info = info;
            return this;
        }
        public PutGroupMetricRuleRequestEscalationsInfo getInfo() {
            return this.info;
        }

    }

}
