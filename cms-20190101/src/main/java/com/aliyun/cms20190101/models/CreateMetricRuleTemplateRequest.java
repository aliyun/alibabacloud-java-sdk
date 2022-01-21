// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateMetricRuleTemplateRequest extends TeaModel {
    @NameInMap("AlertTemplates")
    public java.util.List<CreateMetricRuleTemplateRequestAlertTemplates> alertTemplates;

    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    @NameInMap("RegionId")
    public String regionId;

    public static CreateMetricRuleTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMetricRuleTemplateRequest self = new CreateMetricRuleTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateMetricRuleTemplateRequest setAlertTemplates(java.util.List<CreateMetricRuleTemplateRequestAlertTemplates> alertTemplates) {
        this.alertTemplates = alertTemplates;
        return this;
    }
    public java.util.List<CreateMetricRuleTemplateRequestAlertTemplates> getAlertTemplates() {
        return this.alertTemplates;
    }

    public CreateMetricRuleTemplateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateMetricRuleTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateMetricRuleTemplateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class CreateMetricRuleTemplateRequestAlertTemplatesEscalationsCritical extends TeaModel {
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Times")
        public Integer times;

        public static CreateMetricRuleTemplateRequestAlertTemplatesEscalationsCritical build(java.util.Map<String, ?> map) throws Exception {
            CreateMetricRuleTemplateRequestAlertTemplatesEscalationsCritical self = new CreateMetricRuleTemplateRequestAlertTemplatesEscalationsCritical();
            return TeaModel.build(map, self);
        }

        public CreateMetricRuleTemplateRequestAlertTemplatesEscalationsCritical setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public CreateMetricRuleTemplateRequestAlertTemplatesEscalationsCritical setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public CreateMetricRuleTemplateRequestAlertTemplatesEscalationsCritical setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public CreateMetricRuleTemplateRequestAlertTemplatesEscalationsCritical setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class CreateMetricRuleTemplateRequestAlertTemplatesEscalationsInfo extends TeaModel {
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Times")
        public Integer times;

        public static CreateMetricRuleTemplateRequestAlertTemplatesEscalationsInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateMetricRuleTemplateRequestAlertTemplatesEscalationsInfo self = new CreateMetricRuleTemplateRequestAlertTemplatesEscalationsInfo();
            return TeaModel.build(map, self);
        }

        public CreateMetricRuleTemplateRequestAlertTemplatesEscalationsInfo setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public CreateMetricRuleTemplateRequestAlertTemplatesEscalationsInfo setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public CreateMetricRuleTemplateRequestAlertTemplatesEscalationsInfo setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public CreateMetricRuleTemplateRequestAlertTemplatesEscalationsInfo setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class CreateMetricRuleTemplateRequestAlertTemplatesEscalationsWarn extends TeaModel {
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Times")
        public Integer times;

        public static CreateMetricRuleTemplateRequestAlertTemplatesEscalationsWarn build(java.util.Map<String, ?> map) throws Exception {
            CreateMetricRuleTemplateRequestAlertTemplatesEscalationsWarn self = new CreateMetricRuleTemplateRequestAlertTemplatesEscalationsWarn();
            return TeaModel.build(map, self);
        }

        public CreateMetricRuleTemplateRequestAlertTemplatesEscalationsWarn setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public CreateMetricRuleTemplateRequestAlertTemplatesEscalationsWarn setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public CreateMetricRuleTemplateRequestAlertTemplatesEscalationsWarn setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public CreateMetricRuleTemplateRequestAlertTemplatesEscalationsWarn setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class CreateMetricRuleTemplateRequestAlertTemplatesEscalations extends TeaModel {
        @NameInMap("Critical")
        @Validation(required = true)
        public CreateMetricRuleTemplateRequestAlertTemplatesEscalationsCritical critical;

        @NameInMap("Info")
        @Validation(required = true)
        public CreateMetricRuleTemplateRequestAlertTemplatesEscalationsInfo info;

        @NameInMap("Warn")
        @Validation(required = true)
        public CreateMetricRuleTemplateRequestAlertTemplatesEscalationsWarn warn;

        public static CreateMetricRuleTemplateRequestAlertTemplatesEscalations build(java.util.Map<String, ?> map) throws Exception {
            CreateMetricRuleTemplateRequestAlertTemplatesEscalations self = new CreateMetricRuleTemplateRequestAlertTemplatesEscalations();
            return TeaModel.build(map, self);
        }

        public CreateMetricRuleTemplateRequestAlertTemplatesEscalations setCritical(CreateMetricRuleTemplateRequestAlertTemplatesEscalationsCritical critical) {
            this.critical = critical;
            return this;
        }
        public CreateMetricRuleTemplateRequestAlertTemplatesEscalationsCritical getCritical() {
            return this.critical;
        }

        public CreateMetricRuleTemplateRequestAlertTemplatesEscalations setInfo(CreateMetricRuleTemplateRequestAlertTemplatesEscalationsInfo info) {
            this.info = info;
            return this;
        }
        public CreateMetricRuleTemplateRequestAlertTemplatesEscalationsInfo getInfo() {
            return this.info;
        }

        public CreateMetricRuleTemplateRequestAlertTemplatesEscalations setWarn(CreateMetricRuleTemplateRequestAlertTemplatesEscalationsWarn warn) {
            this.warn = warn;
            return this;
        }
        public CreateMetricRuleTemplateRequestAlertTemplatesEscalationsWarn getWarn() {
            return this.warn;
        }

    }

    public static class CreateMetricRuleTemplateRequestAlertTemplates extends TeaModel {
        @NameInMap("Escalations")
        @Validation(required = true)
        public CreateMetricRuleTemplateRequestAlertTemplatesEscalations escalations;

        @NameInMap("Category")
        public String category;

        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("Period")
        public Integer period;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("Selector")
        public String selector;

        @NameInMap("Webhook")
        public String webhook;

        public static CreateMetricRuleTemplateRequestAlertTemplates build(java.util.Map<String, ?> map) throws Exception {
            CreateMetricRuleTemplateRequestAlertTemplates self = new CreateMetricRuleTemplateRequestAlertTemplates();
            return TeaModel.build(map, self);
        }

        public CreateMetricRuleTemplateRequestAlertTemplates setEscalations(CreateMetricRuleTemplateRequestAlertTemplatesEscalations escalations) {
            this.escalations = escalations;
            return this;
        }
        public CreateMetricRuleTemplateRequestAlertTemplatesEscalations getEscalations() {
            return this.escalations;
        }

        public CreateMetricRuleTemplateRequestAlertTemplates setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public CreateMetricRuleTemplateRequestAlertTemplates setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public CreateMetricRuleTemplateRequestAlertTemplates setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public CreateMetricRuleTemplateRequestAlertTemplates setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public CreateMetricRuleTemplateRequestAlertTemplates setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public CreateMetricRuleTemplateRequestAlertTemplates setSelector(String selector) {
            this.selector = selector;
            return this;
        }
        public String getSelector() {
            return this.selector;
        }

        public CreateMetricRuleTemplateRequestAlertTemplates setWebhook(String webhook) {
            this.webhook = webhook;
            return this;
        }
        public String getWebhook() {
            return this.webhook;
        }

    }

}
