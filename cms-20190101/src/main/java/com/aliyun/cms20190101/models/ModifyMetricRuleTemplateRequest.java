// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ModifyMetricRuleTemplateRequest extends TeaModel {
    /**
     * <p>The details of the alert template.</p>
     */
    @NameInMap("AlertTemplates")
    public java.util.List<ModifyMetricRuleTemplateRequestAlertTemplates> alertTemplates;

    /**
     * <p>The description of the alert template.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS_template1</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the alert template.</p>
     * <p>For information about how to obtain the name of an alert template, see <a href="https://help.aliyun.com/document_detail/114982.html">DescribeMetricRuleTemplateList</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>test123</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The version of the alert template. The version changes with the number of times that the alert template is modified.</p>
     * <p>For information about how to obtain the version of an alert template, see <a href="https://help.aliyun.com/document_detail/114982.html">DescribeMetricRuleTemplateList</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RestVersion")
    public Long restVersion;

    /**
     * <p>The ID of the alert template.</p>
     * <p>For information about how to obtain the ID of an alert template, see <a href="https://help.aliyun.com/document_detail/114982.html">DescribeMetricRuleTemplateList</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    public static ModifyMetricRuleTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyMetricRuleTemplateRequest self = new ModifyMetricRuleTemplateRequest();
        return TeaModel.build(map, self);
    }

    public ModifyMetricRuleTemplateRequest setAlertTemplates(java.util.List<ModifyMetricRuleTemplateRequestAlertTemplates> alertTemplates) {
        this.alertTemplates = alertTemplates;
        return this;
    }
    public java.util.List<ModifyMetricRuleTemplateRequestAlertTemplates> getAlertTemplates() {
        return this.alertTemplates;
    }

    public ModifyMetricRuleTemplateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyMetricRuleTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyMetricRuleTemplateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyMetricRuleTemplateRequest setRestVersion(Long restVersion) {
        this.restVersion = restVersion;
        return this;
    }
    public Long getRestVersion() {
        return this.restVersion;
    }

    public ModifyMetricRuleTemplateRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public static class ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsCritical extends TeaModel {
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("N")
        public Integer n;

        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Times")
        public Integer times;

        public static ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsCritical build(java.util.Map<String, ?> map) throws Exception {
            ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsCritical self = new ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsCritical();
            return TeaModel.build(map, self);
        }

        public ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsCritical setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsCritical setN(Integer n) {
            this.n = n;
            return this;
        }
        public Integer getN() {
            return this.n;
        }

        public ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsCritical setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsCritical setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsCritical setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsInfo extends TeaModel {
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("N")
        public Integer n;

        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Times")
        public Integer times;

        public static ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsInfo build(java.util.Map<String, ?> map) throws Exception {
            ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsInfo self = new ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsInfo();
            return TeaModel.build(map, self);
        }

        public ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsInfo setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsInfo setN(Integer n) {
            this.n = n;
            return this;
        }
        public Integer getN() {
            return this.n;
        }

        public ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsInfo setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsInfo setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsInfo setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsWarn extends TeaModel {
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("N")
        public Integer n;

        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Times")
        public Integer times;

        public static ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsWarn build(java.util.Map<String, ?> map) throws Exception {
            ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsWarn self = new ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsWarn();
            return TeaModel.build(map, self);
        }

        public ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsWarn setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsWarn setN(Integer n) {
            this.n = n;
            return this;
        }
        public Integer getN() {
            return this.n;
        }

        public ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsWarn setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsWarn setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsWarn setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class ModifyMetricRuleTemplateRequestAlertTemplatesEscalations extends TeaModel {
        @NameInMap("Critical")
        public ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsCritical critical;

        @NameInMap("Info")
        public ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsInfo info;

        @NameInMap("Warn")
        public ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsWarn warn;

        public static ModifyMetricRuleTemplateRequestAlertTemplatesEscalations build(java.util.Map<String, ?> map) throws Exception {
            ModifyMetricRuleTemplateRequestAlertTemplatesEscalations self = new ModifyMetricRuleTemplateRequestAlertTemplatesEscalations();
            return TeaModel.build(map, self);
        }

        public ModifyMetricRuleTemplateRequestAlertTemplatesEscalations setCritical(ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsCritical critical) {
            this.critical = critical;
            return this;
        }
        public ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsCritical getCritical() {
            return this.critical;
        }

        public ModifyMetricRuleTemplateRequestAlertTemplatesEscalations setInfo(ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsInfo info) {
            this.info = info;
            return this;
        }
        public ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsInfo getInfo() {
            return this.info;
        }

        public ModifyMetricRuleTemplateRequestAlertTemplatesEscalations setWarn(ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsWarn warn) {
            this.warn = warn;
            return this;
        }
        public ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsWarn getWarn() {
            return this.warn;
        }

    }

    public static class ModifyMetricRuleTemplateRequestAlertTemplates extends TeaModel {
        @NameInMap("Escalations")
        public ModifyMetricRuleTemplateRequestAlertTemplatesEscalations escalations;

        /**
         * <p>The abbreviation of the cloud service name.</p>
         * <p>Valid values of N: 1 to 200.</p>
         * <p>For more information about how to obtain the abbreviation of a cloud service name, see <code>metricCategory</code> in the response parameter <code>Labels</code> of the <a href="https://help.aliyun.com/document_detail/114916.html">DescribeProjectMeta</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The metric name.</p>
         * <p>Valid values of N: 1 to 200.</p>
         * <p>For information about how to obtain metrics, see <a href="https://help.aliyun.com/document_detail/98846.html">DescribeMetricMetaList</a> or <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>cpu_total</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The namespace of the cloud service.</p>
         * <p>Valid values of N: 1 to 200.</p>
         * <p>For information about how to obtain the namespace of a cloud service, see <a href="https://help.aliyun.com/document_detail/98846.html">DescribeMetricMetaList</a> or <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>acs_ecs_dashboard</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The statistical period of the monitoring data.</p>
         * <p>Valid values of N: 1 to 200.</p>
         * <blockquote>
         * <p>If the value is set to 300 seconds, the monitoring data is collected every 300 seconds. If the monitoring data is reported every 1 minute, the alert system calculates the average, maximum, and minimum values of the monitoring data of 5 minutes and checks whether the aggregated values exceed the threshold. To prevent unexpected alerts, we recommend that you set this parameter together with other parameters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Period")
        public Integer period;

        /**
         * <p>The name of the alert rule.</p>
         * <p>Valid values of N: 1 to 200.</p>
         * 
         * <strong>example:</strong>
         * <p>rule1</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The dimension of the alert. It is an extended field.</p>
         * <p>Valid values of N: 1 to 200.</p>
         * <p>For example, an alert template is applied to an application group, this parameter is set to <code>{&quot;disk&quot;:&quot;/&quot;}</code>, and the MetricName parameter is set to <code>DiskUtilization</code>. In this case, the generated alert rule is applied to the root disk partition (<code>&quot;/&quot;</code>) of all instances in the application group to which the alert template is applied.</p>
         * <blockquote>
         * <p>For more information about the values of extended fields, see <a href="https://help.aliyun.com/document_detail/114979.html">DescribeMetricRuleTemplateAttribute</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;disk&quot;:&quot;/&quot;}</p>
         */
        @NameInMap("Selector")
        public String selector;

        /**
         * <p>The callback URL.</p>
         * <p>Valid values of N: 1 to 200.</p>
         * <p>The callback URL must be accessible over the Internet. CloudMonitor pushes an alert notification to the specified callback URL by sending an HTTP POST request. Only the HTTP protocol is supported.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://apiwebhook.hipac.cn/api/v1/alarm/aly/eregfeeferrtbnmkdszp">https://apiwebhook.hipac.cn/api/v1/alarm/aly/eregfeeferrtbnmkdszp</a></p>
         */
        @NameInMap("Webhook")
        public String webhook;

        public static ModifyMetricRuleTemplateRequestAlertTemplates build(java.util.Map<String, ?> map) throws Exception {
            ModifyMetricRuleTemplateRequestAlertTemplates self = new ModifyMetricRuleTemplateRequestAlertTemplates();
            return TeaModel.build(map, self);
        }

        public ModifyMetricRuleTemplateRequestAlertTemplates setEscalations(ModifyMetricRuleTemplateRequestAlertTemplatesEscalations escalations) {
            this.escalations = escalations;
            return this;
        }
        public ModifyMetricRuleTemplateRequestAlertTemplatesEscalations getEscalations() {
            return this.escalations;
        }

        public ModifyMetricRuleTemplateRequestAlertTemplates setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ModifyMetricRuleTemplateRequestAlertTemplates setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public ModifyMetricRuleTemplateRequestAlertTemplates setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ModifyMetricRuleTemplateRequestAlertTemplates setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public ModifyMetricRuleTemplateRequestAlertTemplates setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ModifyMetricRuleTemplateRequestAlertTemplates setSelector(String selector) {
            this.selector = selector;
            return this;
        }
        public String getSelector() {
            return this.selector;
        }

        public ModifyMetricRuleTemplateRequestAlertTemplates setWebhook(String webhook) {
            this.webhook = webhook;
            return this;
        }
        public String getWebhook() {
            return this.webhook;
        }

    }

}
