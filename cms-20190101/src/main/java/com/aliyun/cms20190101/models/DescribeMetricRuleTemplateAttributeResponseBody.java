// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricRuleTemplateAttributeResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * <blockquote>
     * <p> The status code 200 indicates that the request was successful.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The error message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>The specified resource is not found.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8F3A82AD-DA92-52B0-8EC6-C059D1C3839F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the alert template.</p>
     */
    @NameInMap("Resource")
    public DescribeMetricRuleTemplateAttributeResponseBodyResource resource;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

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

    public DescribeMetricRuleTemplateAttributeResponseBody setResource(DescribeMetricRuleTemplateAttributeResponseBodyResource resource) {
        this.resource = resource;
        return this;
    }
    public DescribeMetricRuleTemplateAttributeResponseBodyResource getResource() {
        return this.resource;
    }

    public DescribeMetricRuleTemplateAttributeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalationsCritical extends TeaModel {
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Times")
        public Integer times;

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

        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalationsCritical setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalationsCritical setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalationsCritical setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalationsInfo extends TeaModel {
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Times")
        public Integer times;

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

        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalationsInfo setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalationsInfo setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalationsInfo setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalationsWarn extends TeaModel {
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Times")
        public Integer times;

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

        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalationsWarn setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalationsWarn setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalationsWarn setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalations extends TeaModel {
        @NameInMap("Critical")
        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalationsCritical critical;

        @NameInMap("Info")
        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalationsInfo info;

        @NameInMap("Warn")
        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalationsWarn warn;

        public static DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalations build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalations self = new DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalations();
            return TeaModel.build(map, self);
        }

        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalations setCritical(DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalationsCritical critical) {
            this.critical = critical;
            return this;
        }
        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalationsCritical getCritical() {
            return this.critical;
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

    }

    public static class DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateLabelsLabels extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateLabelsLabels build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateLabelsLabels self = new DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateLabelsLabels();
            return TeaModel.build(map, self);
        }

        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateLabelsLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateLabelsLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateLabels extends TeaModel {
        @NameInMap("Labels")
        public java.util.List<DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateLabelsLabels> labels;

        public static DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateLabels build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateLabels self = new DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateLabels();
            return TeaModel.build(map, self);
        }

        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateLabels setLabels(java.util.List<DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateLabelsLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateLabelsLabels> getLabels() {
            return this.labels;
        }

    }

    public static class DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplate extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("Escalations")
        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalations escalations;

        @NameInMap("Labels")
        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateLabels labels;

        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("NoDataPolicy")
        public String noDataPolicy;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("Selector")
        public String selector;

        @NameInMap("SilenceTime")
        public Integer silenceTime;

        @NameInMap("Webhook")
        public String webhook;

        public static DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplate build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplate self = new DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplate();
            return TeaModel.build(map, self);
        }

        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplate setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplate setEscalations(DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalations escalations) {
            this.escalations = escalations;
            return this;
        }
        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalations getEscalations() {
            return this.escalations;
        }

        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplate setLabels(DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateLabels labels) {
            this.labels = labels;
            return this;
        }
        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateLabels getLabels() {
            return this.labels;
        }

        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplate setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplate setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplate setNoDataPolicy(String noDataPolicy) {
            this.noDataPolicy = noDataPolicy;
            return this;
        }
        public String getNoDataPolicy() {
            return this.noDataPolicy;
        }

        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplate setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplate setSelector(String selector) {
            this.selector = selector;
            return this;
        }
        public String getSelector() {
            return this.selector;
        }

        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplate setSilenceTime(Integer silenceTime) {
            this.silenceTime = silenceTime;
            return this;
        }
        public Integer getSilenceTime() {
            return this.silenceTime;
        }

        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplate setWebhook(String webhook) {
            this.webhook = webhook;
            return this;
        }
        public String getWebhook() {
            return this.webhook;
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
        @NameInMap("AlertTemplates")
        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplates alertTemplates;

        /**
         * <p>The description of the alert template.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the alert template.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS_Template1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The version of the alert template.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RestVersion")
        public String restVersion;

        /**
         * <p>The ID of the alert template.</p>
         * 
         * <strong>example:</strong>
         * <p>70****</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        public static DescribeMetricRuleTemplateAttributeResponseBodyResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleTemplateAttributeResponseBodyResource self = new DescribeMetricRuleTemplateAttributeResponseBodyResource();
            return TeaModel.build(map, self);
        }

        public DescribeMetricRuleTemplateAttributeResponseBodyResource setAlertTemplates(DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplates alertTemplates) {
            this.alertTemplates = alertTemplates;
            return this;
        }
        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplates getAlertTemplates() {
            return this.alertTemplates;
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

    }

}
