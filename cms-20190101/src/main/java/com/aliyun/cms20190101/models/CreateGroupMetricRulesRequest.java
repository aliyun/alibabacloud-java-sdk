// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateGroupMetricRulesRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("GroupMetricRules")
    public java.util.List<CreateGroupMetricRulesRequestGroupMetricRules> groupMetricRules;

    public static CreateGroupMetricRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupMetricRulesRequest self = new CreateGroupMetricRulesRequest();
        return TeaModel.build(map, self);
    }

    public CreateGroupMetricRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateGroupMetricRulesRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public CreateGroupMetricRulesRequest setGroupMetricRules(java.util.List<CreateGroupMetricRulesRequestGroupMetricRules> groupMetricRules) {
        this.groupMetricRules = groupMetricRules;
        return this;
    }
    public java.util.List<CreateGroupMetricRulesRequestGroupMetricRules> getGroupMetricRules() {
        return this.groupMetricRules;
    }

    public static class CreateGroupMetricRulesRequestGroupMetricRulesEscalationsInfo extends TeaModel {
        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Times")
        public Integer times;

        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        public static CreateGroupMetricRulesRequestGroupMetricRulesEscalationsInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateGroupMetricRulesRequestGroupMetricRulesEscalationsInfo self = new CreateGroupMetricRulesRequestGroupMetricRulesEscalationsInfo();
            return TeaModel.build(map, self);
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsInfo setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsInfo setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsInfo setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsInfo setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

    }

    public static class CreateGroupMetricRulesRequestGroupMetricRulesEscalationsWarn extends TeaModel {
        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("Times")
        public Integer times;

        @NameInMap("Statistics")
        public String statistics;

        public static CreateGroupMetricRulesRequestGroupMetricRulesEscalationsWarn build(java.util.Map<String, ?> map) throws Exception {
            CreateGroupMetricRulesRequestGroupMetricRulesEscalationsWarn self = new CreateGroupMetricRulesRequestGroupMetricRulesEscalationsWarn();
            return TeaModel.build(map, self);
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsWarn setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsWarn setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsWarn setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsWarn setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

    }

    public static class CreateGroupMetricRulesRequestGroupMetricRulesEscalationsCritical extends TeaModel {
        @NameInMap("Times")
        public Integer times;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        public static CreateGroupMetricRulesRequestGroupMetricRulesEscalationsCritical build(java.util.Map<String, ?> map) throws Exception {
            CreateGroupMetricRulesRequestGroupMetricRulesEscalationsCritical self = new CreateGroupMetricRulesRequestGroupMetricRulesEscalationsCritical();
            return TeaModel.build(map, self);
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsCritical setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsCritical setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsCritical setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsCritical setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

    }

    public static class CreateGroupMetricRulesRequestGroupMetricRulesEscalations extends TeaModel {
        @NameInMap("Info")
        @Validation(required = true)
        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsInfo info;

        @NameInMap("Warn")
        @Validation(required = true)
        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsWarn warn;

        @NameInMap("Critical")
        @Validation(required = true)
        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsCritical critical;

        public static CreateGroupMetricRulesRequestGroupMetricRulesEscalations build(java.util.Map<String, ?> map) throws Exception {
            CreateGroupMetricRulesRequestGroupMetricRulesEscalations self = new CreateGroupMetricRulesRequestGroupMetricRulesEscalations();
            return TeaModel.build(map, self);
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalations setInfo(CreateGroupMetricRulesRequestGroupMetricRulesEscalationsInfo info) {
            this.info = info;
            return this;
        }
        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsInfo getInfo() {
            return this.info;
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalations setWarn(CreateGroupMetricRulesRequestGroupMetricRulesEscalationsWarn warn) {
            this.warn = warn;
            return this;
        }
        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsWarn getWarn() {
            return this.warn;
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalations setCritical(CreateGroupMetricRulesRequestGroupMetricRulesEscalationsCritical critical) {
            this.critical = critical;
            return this;
        }
        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsCritical getCritical() {
            return this.critical;
        }

    }

    public static class CreateGroupMetricRulesRequestGroupMetricRules extends TeaModel {
        @NameInMap("Escalations")
        @Validation(required = true)
        public CreateGroupMetricRulesRequestGroupMetricRulesEscalations escalations;

        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("EffectiveInterval")
        public String effectiveInterval;

        @NameInMap("NoEffectiveInterval")
        public String noEffectiveInterval;

        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("Dimensions")
        public String dimensions;

        @NameInMap("SilenceTime")
        public Integer silenceTime;

        @NameInMap("Webhook")
        public String webhook;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("EmailSubject")
        public String emailSubject;

        @NameInMap("Period")
        public String period;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("Interval")
        public String interval;

        @NameInMap("Category")
        public String category;

        public static CreateGroupMetricRulesRequestGroupMetricRules build(java.util.Map<String, ?> map) throws Exception {
            CreateGroupMetricRulesRequestGroupMetricRules self = new CreateGroupMetricRulesRequestGroupMetricRules();
            return TeaModel.build(map, self);
        }

        public CreateGroupMetricRulesRequestGroupMetricRules setEscalations(CreateGroupMetricRulesRequestGroupMetricRulesEscalations escalations) {
            this.escalations = escalations;
            return this;
        }
        public CreateGroupMetricRulesRequestGroupMetricRulesEscalations getEscalations() {
            return this.escalations;
        }

        public CreateGroupMetricRulesRequestGroupMetricRules setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public CreateGroupMetricRulesRequestGroupMetricRules setEffectiveInterval(String effectiveInterval) {
            this.effectiveInterval = effectiveInterval;
            return this;
        }
        public String getEffectiveInterval() {
            return this.effectiveInterval;
        }

        public CreateGroupMetricRulesRequestGroupMetricRules setNoEffectiveInterval(String noEffectiveInterval) {
            this.noEffectiveInterval = noEffectiveInterval;
            return this;
        }
        public String getNoEffectiveInterval() {
            return this.noEffectiveInterval;
        }

        public CreateGroupMetricRulesRequestGroupMetricRules setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public CreateGroupMetricRulesRequestGroupMetricRules setDimensions(String dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public String getDimensions() {
            return this.dimensions;
        }

        public CreateGroupMetricRulesRequestGroupMetricRules setSilenceTime(Integer silenceTime) {
            this.silenceTime = silenceTime;
            return this;
        }
        public Integer getSilenceTime() {
            return this.silenceTime;
        }

        public CreateGroupMetricRulesRequestGroupMetricRules setWebhook(String webhook) {
            this.webhook = webhook;
            return this;
        }
        public String getWebhook() {
            return this.webhook;
        }

        public CreateGroupMetricRulesRequestGroupMetricRules setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public CreateGroupMetricRulesRequestGroupMetricRules setEmailSubject(String emailSubject) {
            this.emailSubject = emailSubject;
            return this;
        }
        public String getEmailSubject() {
            return this.emailSubject;
        }

        public CreateGroupMetricRulesRequestGroupMetricRules setPeriod(String period) {
            this.period = period;
            return this;
        }
        public String getPeriod() {
            return this.period;
        }

        public CreateGroupMetricRulesRequestGroupMetricRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public CreateGroupMetricRulesRequestGroupMetricRules setInterval(String interval) {
            this.interval = interval;
            return this;
        }
        public String getInterval() {
            return this.interval;
        }

        public CreateGroupMetricRulesRequestGroupMetricRules setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

    }

}
