// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateMetricRuleTemplateRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    @NameInMap("AlertTemplates")
    public java.util.List<CreateMetricRuleTemplateRequestAlertTemplates> alertTemplates;

    public static CreateMetricRuleTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMetricRuleTemplateRequest self = new CreateMetricRuleTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateMetricRuleTemplateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateMetricRuleTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateMetricRuleTemplateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateMetricRuleTemplateRequest setAlertTemplates(java.util.List<CreateMetricRuleTemplateRequestAlertTemplates> alertTemplates) {
        this.alertTemplates = alertTemplates;
        return this;
    }
    public java.util.List<CreateMetricRuleTemplateRequestAlertTemplates> getAlertTemplates() {
        return this.alertTemplates;
    }

    public static class CreateMetricRuleTemplateRequestAlertTemplatesEscalationsInfo extends TeaModel {
        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("Times")
        public Integer times;

        public static CreateMetricRuleTemplateRequestAlertTemplatesEscalationsInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateMetricRuleTemplateRequestAlertTemplatesEscalationsInfo self = new CreateMetricRuleTemplateRequestAlertTemplatesEscalationsInfo();
            return TeaModel.build(map, self);
        }

        public CreateMetricRuleTemplateRequestAlertTemplatesEscalationsInfo setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public CreateMetricRuleTemplateRequestAlertTemplatesEscalationsInfo setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public CreateMetricRuleTemplateRequestAlertTemplatesEscalationsInfo setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
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
        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Times")
        public Integer times;

        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("Statistics")
        public String statistics;

        public static CreateMetricRuleTemplateRequestAlertTemplatesEscalationsWarn build(java.util.Map<String, ?> map) throws Exception {
            CreateMetricRuleTemplateRequestAlertTemplatesEscalationsWarn self = new CreateMetricRuleTemplateRequestAlertTemplatesEscalationsWarn();
            return TeaModel.build(map, self);
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

    }

    public static class CreateMetricRuleTemplateRequestAlertTemplatesEscalationsCritical extends TeaModel {
        @NameInMap("Times")
        public Integer times;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        public static CreateMetricRuleTemplateRequestAlertTemplatesEscalationsCritical build(java.util.Map<String, ?> map) throws Exception {
            CreateMetricRuleTemplateRequestAlertTemplatesEscalationsCritical self = new CreateMetricRuleTemplateRequestAlertTemplatesEscalationsCritical();
            return TeaModel.build(map, self);
        }

        public CreateMetricRuleTemplateRequestAlertTemplatesEscalationsCritical setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

        public CreateMetricRuleTemplateRequestAlertTemplatesEscalationsCritical setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public CreateMetricRuleTemplateRequestAlertTemplatesEscalationsCritical setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public CreateMetricRuleTemplateRequestAlertTemplatesEscalationsCritical setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

    }

    public static class CreateMetricRuleTemplateRequestAlertTemplatesEscalations extends TeaModel {
        @NameInMap("Info")
        @Validation(required = true)
        public CreateMetricRuleTemplateRequestAlertTemplatesEscalationsInfo info;

        @NameInMap("Warn")
        @Validation(required = true)
        public CreateMetricRuleTemplateRequestAlertTemplatesEscalationsWarn warn;

        @NameInMap("Critical")
        @Validation(required = true)
        public CreateMetricRuleTemplateRequestAlertTemplatesEscalationsCritical critical;

        public static CreateMetricRuleTemplateRequestAlertTemplatesEscalations build(java.util.Map<String, ?> map) throws Exception {
            CreateMetricRuleTemplateRequestAlertTemplatesEscalations self = new CreateMetricRuleTemplateRequestAlertTemplatesEscalations();
            return TeaModel.build(map, self);
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

        public CreateMetricRuleTemplateRequestAlertTemplatesEscalations setCritical(CreateMetricRuleTemplateRequestAlertTemplatesEscalationsCritical critical) {
            this.critical = critical;
            return this;
        }
        public CreateMetricRuleTemplateRequestAlertTemplatesEscalationsCritical getCritical() {
            return this.critical;
        }

    }

    public static class CreateMetricRuleTemplateRequestAlertTemplates extends TeaModel {
        @NameInMap("Escalations")
        @Validation(required = true)
        public CreateMetricRuleTemplateRequestAlertTemplatesEscalations escalations;

        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("Webhook")
        public String webhook;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("Period")
        public Integer period;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("Selector")
        public String selector;

        @NameInMap("Category")
        public String category;

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

        public CreateMetricRuleTemplateRequestAlertTemplates setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public CreateMetricRuleTemplateRequestAlertTemplates setWebhook(String webhook) {
            this.webhook = webhook;
            return this;
        }
        public String getWebhook() {
            return this.webhook;
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

        public CreateMetricRuleTemplateRequestAlertTemplates setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

    }

}
