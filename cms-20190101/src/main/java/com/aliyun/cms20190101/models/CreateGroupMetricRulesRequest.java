// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateGroupMetricRulesRequest extends TeaModel {
    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("GroupMetricRules")
    public java.util.List<CreateGroupMetricRulesRequestGroupMetricRules> groupMetricRules;

    @NameInMap("RegionId")
    public String regionId;

    public static CreateGroupMetricRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupMetricRulesRequest self = new CreateGroupMetricRulesRequest();
        return TeaModel.build(map, self);
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

    public CreateGroupMetricRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class CreateGroupMetricRulesRequestGroupMetricRulesEscalationsCritical extends TeaModel {
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Times")
        public Integer times;

        public static CreateGroupMetricRulesRequestGroupMetricRulesEscalationsCritical build(java.util.Map<String, ?> map) throws Exception {
            CreateGroupMetricRulesRequestGroupMetricRulesEscalationsCritical self = new CreateGroupMetricRulesRequestGroupMetricRulesEscalationsCritical();
            return TeaModel.build(map, self);
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsCritical setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsCritical setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsCritical setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsCritical setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class CreateGroupMetricRulesRequestGroupMetricRulesEscalationsInfo extends TeaModel {
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Times")
        public Integer times;

        public static CreateGroupMetricRulesRequestGroupMetricRulesEscalationsInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateGroupMetricRulesRequestGroupMetricRulesEscalationsInfo self = new CreateGroupMetricRulesRequestGroupMetricRulesEscalationsInfo();
            return TeaModel.build(map, self);
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsInfo setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsInfo setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
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

    }

    public static class CreateGroupMetricRulesRequestGroupMetricRulesEscalationsWarn extends TeaModel {
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Times")
        public Integer times;

        public static CreateGroupMetricRulesRequestGroupMetricRulesEscalationsWarn build(java.util.Map<String, ?> map) throws Exception {
            CreateGroupMetricRulesRequestGroupMetricRulesEscalationsWarn self = new CreateGroupMetricRulesRequestGroupMetricRulesEscalationsWarn();
            return TeaModel.build(map, self);
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsWarn setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsWarn setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsWarn setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsWarn setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class CreateGroupMetricRulesRequestGroupMetricRulesEscalations extends TeaModel {
        @NameInMap("Critical")
        @Validation(required = true)
        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsCritical critical;

        @NameInMap("Info")
        @Validation(required = true)
        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsInfo info;

        @NameInMap("Warn")
        @Validation(required = true)
        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsWarn warn;

        public static CreateGroupMetricRulesRequestGroupMetricRulesEscalations build(java.util.Map<String, ?> map) throws Exception {
            CreateGroupMetricRulesRequestGroupMetricRulesEscalations self = new CreateGroupMetricRulesRequestGroupMetricRulesEscalations();
            return TeaModel.build(map, self);
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalations setCritical(CreateGroupMetricRulesRequestGroupMetricRulesEscalationsCritical critical) {
            this.critical = critical;
            return this;
        }
        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsCritical getCritical() {
            return this.critical;
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

    }

    public static class CreateGroupMetricRulesRequestGroupMetricRules extends TeaModel {
        @NameInMap("Escalations")
        @Validation(required = true)
        public CreateGroupMetricRulesRequestGroupMetricRulesEscalations escalations;

        @NameInMap("Category")
        public String category;

        @NameInMap("Dimensions")
        public String dimensions;

        @NameInMap("EffectiveInterval")
        public String effectiveInterval;

        @NameInMap("EmailSubject")
        public String emailSubject;

        @NameInMap("Interval")
        public String interval;

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

        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("SilenceTime")
        public Integer silenceTime;

        @NameInMap("Webhook")
        public String webhook;

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

        public CreateGroupMetricRulesRequestGroupMetricRules setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public CreateGroupMetricRulesRequestGroupMetricRules setDimensions(String dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public String getDimensions() {
            return this.dimensions;
        }

        public CreateGroupMetricRulesRequestGroupMetricRules setEffectiveInterval(String effectiveInterval) {
            this.effectiveInterval = effectiveInterval;
            return this;
        }
        public String getEffectiveInterval() {
            return this.effectiveInterval;
        }

        public CreateGroupMetricRulesRequestGroupMetricRules setEmailSubject(String emailSubject) {
            this.emailSubject = emailSubject;
            return this;
        }
        public String getEmailSubject() {
            return this.emailSubject;
        }

        public CreateGroupMetricRulesRequestGroupMetricRules setInterval(String interval) {
            this.interval = interval;
            return this;
        }
        public String getInterval() {
            return this.interval;
        }

        public CreateGroupMetricRulesRequestGroupMetricRules setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public CreateGroupMetricRulesRequestGroupMetricRules setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public CreateGroupMetricRulesRequestGroupMetricRules setNoDataPolicy(String noDataPolicy) {
            this.noDataPolicy = noDataPolicy;
            return this;
        }
        public String getNoDataPolicy() {
            return this.noDataPolicy;
        }

        public CreateGroupMetricRulesRequestGroupMetricRules setNoEffectiveInterval(String noEffectiveInterval) {
            this.noEffectiveInterval = noEffectiveInterval;
            return this;
        }
        public String getNoEffectiveInterval() {
            return this.noEffectiveInterval;
        }

        public CreateGroupMetricRulesRequestGroupMetricRules setPeriod(String period) {
            this.period = period;
            return this;
        }
        public String getPeriod() {
            return this.period;
        }

        public CreateGroupMetricRulesRequestGroupMetricRules setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public CreateGroupMetricRulesRequestGroupMetricRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
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

    }

}
