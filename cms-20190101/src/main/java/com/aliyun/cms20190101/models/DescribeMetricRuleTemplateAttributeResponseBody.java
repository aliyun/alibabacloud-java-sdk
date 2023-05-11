// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricRuleTemplateAttributeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <br>
     * <p>*   true: The call is successful.</p>
     * <p>*   false: The call fails.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The details of the alert template.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The version of the alert template.</p>
     */
    @NameInMap("Resource")
    public DescribeMetricRuleTemplateAttributeResponseBodyResource resource;

    /**
     * <p>The name of the alert template.</p>
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
        /**
         * <p>The threshold for Critical-level alerts.</p>
         */
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        /**
         * <p>For more information about common request parameters, see [Common parameters](~~199331~~).</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>This topic provides an example to show how to query the details of an alert template whose ID is `70****`.</p>
         */
        @NameInMap("Threshold")
        public String threshold;

        /**
         * <p>The statistical method for Critical-level alerts.</p>
         * <br>
         * <p>The value of the `Statistics` parameter varies with the cloud service. For more information, see [Appendix 1: Metrics](~~163515~~).</p>
         */
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
        /**
         * <p>The threshold for Info-level alerts.</p>
         */
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        /**
         * <p>The comparison operator that is used to compare the metric value with the threshold. Valid values:</p>
         * <br>
         * <p>*   GreaterThanOrEqualToThreshold: greater than or equal to the threshold</p>
         * <p>*   GreaterThanThreshold: greater than the threshold</p>
         * <p>*   LessThanOrEqualToThreshold: less than or equal to the threshold</p>
         * <p>*   LessThanThreshold: less than the threshold</p>
         * <p>*   NotEqualToThreshold: not equal to the threshold</p>
         * <p>*   GreaterThanYesterday: greater than the metric value at the same time yesterday</p>
         * <p>*   LessThanYesterday: less than the metric value at the same time yesterday</p>
         * <p>*   GreaterThanLastWeek: greater than the metric value at the same time last week</p>
         * <p>*   LessThanLastWeek: less than the metric value at the same time last week</p>
         * <p>*   GreaterThanLastPeriod: greater than the metric value in the last monitoring cycle</p>
         * <p>*   LessThanLastPeriod: less than the metric value in the last monitoring cycle</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>The conditions for triggering Warn-level alerts.</p>
         */
        @NameInMap("Threshold")
        public String threshold;

        /**
         * <p>The statistical method for Info-level alerts.</p>
         * <br>
         * <p>The value of the `Statistics` parameter varies with the cloud service. For more information, see [Appendix 1: Metrics](~~163515~~).</p>
         */
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
        /**
         * <p>The threshold for Warn-level alerts.</p>
         */
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        /**
         * <p>The comparison operator that is used to compare the metric value with the threshold. Valid values:</p>
         * <br>
         * <p>*   GreaterThanOrEqualToThreshold: greater than or equal to the threshold</p>
         * <p>*   GreaterThanThreshold: greater than the threshold</p>
         * <p>*   LessThanOrEqualToThreshold: less than or equal to the threshold</p>
         * <p>*   LessThanThreshold: less than the threshold</p>
         * <p>*   NotEqualToThreshold: not equal to the threshold</p>
         * <p>*   GreaterThanYesterday: greater than the metric value at the same time yesterday</p>
         * <p>*   LessThanYesterday: less than the metric value at the same time yesterday</p>
         * <p>*   GreaterThanLastWeek: greater than the metric value at the same time last week</p>
         * <p>*   LessThanLastWeek: less than the metric value at the same time last week</p>
         * <p>*   GreaterThanLastPeriod: greater than the metric value in the last monitoring cycle</p>
         * <p>*   LessThanLastPeriod: less than the metric value in the last monitoring cycle</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>The conditions for triggering Critical-level alerts.</p>
         */
        @NameInMap("Threshold")
        public String threshold;

        /**
         * <p>The statistical method for Warn-level alerts.</p>
         * <br>
         * <p>The value of the `Statistics` parameter varies with the cloud service. For more information, see [Appendix 1: Metrics](~~163515~~).</p>
         */
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
        /**
         * <p>The consecutive number of times for which the metric value meets the alert condition before a Critical-level alert is triggered.</p>
         */
        @NameInMap("Critical")
        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalationsCritical critical;

        /**
         * <p>The consecutive number of times for which the metric value meets the alert condition before an Info-level alert is triggered.</p>
         */
        @NameInMap("Info")
        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalationsInfo info;

        /**
         * <p>The consecutive number of times for which the metric value meets the alert condition before a Warn-level alert is triggered.</p>
         */
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
        /**
         * <p>The name of the alert rule.</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The comparison operator that is used to compare the metric value with the threshold. Valid values:</p>
         * <br>
         * <p>*   GreaterThanOrEqualToThreshold: greater than or equal to the threshold</p>
         * <p>*   GreaterThanThreshold: greater than the threshold</p>
         * <p>*   LessThanOrEqualToThreshold: less than or equal to the threshold</p>
         * <p>*   LessThanThreshold: less than the threshold</p>
         * <p>*   NotEqualToThreshold: not equal to the threshold</p>
         * <p>*   GreaterThanYesterday: greater than the metric value at the same time yesterday</p>
         * <p>*   LessThanYesterday: less than the metric value at the same time yesterday</p>
         * <p>*   GreaterThanLastWeek: greater than the metric value at the same time last week</p>
         * <p>*   LessThanLastWeek: less than the metric value at the same time last week</p>
         * <p>*   GreaterThanLastPeriod: greater than the metric value in the last monitoring cycle</p>
         * <p>*   LessThanLastPeriod: less than the metric value in the last monitoring cycle</p>
         */
        @NameInMap("Escalations")
        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateEscalations escalations;

        @NameInMap("Labels")
        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplatesAlertTemplateLabels labels;

        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The processing method of alerts when no monitoring data is found. Valid values:</p>
         * <br>
         * <p>*   KEEP_LAST_STATE (default value): No operation is performed.</p>
         * <p>*   INSUFFICIENT_DATA: An alert whose content is "Insufficient data" is triggered.</p>
         * <p>*   OK: The alert rule has no active alerts.</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The threshold and the alert level.</p>
         */
        @NameInMap("NoDataPolicy")
        public String noDataPolicy;

        /**
         * <p>The conditions for triggering Info-level alerts.</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The namespace of the cloud service.</p>
         */
        @NameInMap("Selector")
        public String selector;

        /**
         * <p>The abbreviation of the cloud service name.</p>
         */
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
        /**
         * <p>The callback URL to which a request is sent when an alert is triggered.</p>
         */
        @NameInMap("AlertTemplates")
        public DescribeMetricRuleTemplateAttributeResponseBodyResourceAlertTemplates alertTemplates;

        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the alert template.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The list of alert templates.</p>
         */
        @NameInMap("RestVersion")
        public String restVersion;

        /**
         * <p>The dimension of the alert. It is an extended field.</p>
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
