// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricRuleTemplateAttributeResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Resource")
    public DescribeMetricRuleTemplateAttributeResponseBodyResource resource;

    public static DescribeMetricRuleTemplateAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricRuleTemplateAttributeResponseBody self = new DescribeMetricRuleTemplateAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMetricRuleTemplateAttributeResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeMetricRuleTemplateAttributeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeMetricRuleTemplateAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMetricRuleTemplateAttributeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeMetricRuleTemplateAttributeResponseBody setResource(DescribeMetricRuleTemplateAttributeResponseBodyResource resource) {
        this.resource = resource;
        return this;
    }
    public DescribeMetricRuleTemplateAttributeResponseBodyResource getResource() {
        return this.resource;
    }

    public static class DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalationsInfo extends TeaModel {
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("Times")
        public Integer times;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Statistics")
        public String statistics;

        public static DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalationsInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalationsInfo self = new DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalationsInfo();
            return TeaModel.build(map, self);
        }

        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalationsInfo setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalationsInfo setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalationsInfo setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalationsInfo setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

    }

    public static class DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalationsWarn extends TeaModel {
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("Times")
        public Integer times;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Statistics")
        public String statistics;

        public static DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalationsWarn build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalationsWarn self = new DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalationsWarn();
            return TeaModel.build(map, self);
        }

        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalationsWarn setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalationsWarn setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalationsWarn setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalationsWarn setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

    }

    public static class DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalationsCritical extends TeaModel {
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("Times")
        public Integer times;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Statistics")
        public String statistics;

        public static DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalationsCritical build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalationsCritical self = new DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalationsCritical();
            return TeaModel.build(map, self);
        }

        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalationsCritical setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalationsCritical setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalationsCritical setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalationsCritical setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

    }

    public static class DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalations extends TeaModel {
        @NameInMap("Info")
        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalationsInfo info;

        @NameInMap("Warn")
        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalationsWarn warn;

        @NameInMap("Critical")
        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalationsCritical critical;

        public static DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalations build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalations self = new DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalations();
            return TeaModel.build(map, self);
        }

        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalations setInfo(DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalationsInfo info) {
            this.info = info;
            return this;
        }
        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalationsInfo getInfo() {
            return this.info;
        }

        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalations setWarn(DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalationsWarn warn) {
            this.warn = warn;
            return this;
        }
        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalationsWarn getWarn() {
            return this.warn;
        }

        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalations setCritical(DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalationsCritical critical) {
            this.critical = critical;
            return this;
        }
        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalationsCritical getCritical() {
            return this.critical;
        }

    }

    public static class DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplate extends TeaModel {
        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("Selector")
        public String selector;

        @NameInMap("Webhook")
        public String webhook;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("Category")
        public String category;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("Escalations")
        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalations escalations;

        public static DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplate build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplate self = new DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplate();
            return TeaModel.build(map, self);
        }

        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplate setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplate setSelector(String selector) {
            this.selector = selector;
            return this;
        }
        public String getSelector() {
            return this.selector;
        }

        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplate setWebhook(String webhook) {
            this.webhook = webhook;
            return this;
        }
        public String getWebhook() {
            return this.webhook;
        }

        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplate setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplate setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplate setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplate setEscalations(DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalations escalations) {
            this.escalations = escalations;
            return this;
        }
        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalations getEscalations() {
            return this.escalations;
        }

    }

    public static class DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplates extends TeaModel {
        @NameInMap("AlertTemplate")
        public java.util.List<DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplate> alertTemplate;

        public static DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplates build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplates self = new DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplates();
            return TeaModel.build(map, self);
        }

        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplates setAlertTemplate(java.util.List<DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplate> alertTemplate) {
            this.alertTemplate = alertTemplate;
            return this;
        }
        public java.util.List<DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplate> getAlertTemplate() {
            return this.alertTemplate;
        }

    }

    public static class DescribeMetricRuleTemplateAttributeResponseBodyResource extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("RestVersion")
        public String restVersion;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("AlertTemplates")
        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplates alertTemplates;

        public static DescribeMetricRuleTemplateAttributeResponseBodyResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleTemplateAttributeResponseBodyResource self = new DescribeMetricRuleTemplateAttributeResponseBodyResource();
            return TeaModel.build(map, self);
        }

        public DescribeMetricRuleTemplateAttributeResponseBodyResource setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeMetricRuleTemplateAttributeResponseBodyResource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeMetricRuleTemplateAttributeResponseBodyResource setRestVersion(String restVersion) {
            this.restVersion = restVersion;
            return this;
        }
        public String getRestVersion() {
            return this.restVersion;
        }

        public DescribeMetricRuleTemplateAttributeResponseBodyResource setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public DescribeMetricRuleTemplateAttributeResponseBodyResource setAlertTemplates(DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplates alertTemplates) {
            this.alertTemplates = alertTemplates;
            return this;
        }
        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplates getAlertTemplates() {
            return this.alertTemplates;
        }

    }

}
