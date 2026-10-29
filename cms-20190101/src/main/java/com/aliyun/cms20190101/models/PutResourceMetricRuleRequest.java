// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutResourceMetricRuleRequest extends TeaModel {
    @NameInMap("Escalations")
    public PutResourceMetricRuleRequestEscalations escalations;

    /**
     * <p>The alert conditions for multiple metrics.</p>
     * <blockquote>
     * <p>Single-metric and multi-metric alert conditions are mutually exclusive and cannot be configured at the same time.</p>
     * </blockquote>
     */
    @NameInMap("CompositeExpression")
    public PutResourceMetricRuleRequestCompositeExpression compositeExpression;

    /**
     * <p>The alert contact group. Alert notifications are sent to the alert contacts in this alert contact group.</p>
     * <blockquote>
     * <p>An alert contact group contains one or more alert contacts. For more information about how to create alert contacts and alert contact groups, see <a href="https://help.aliyun.com/document_detail/114923.html">PutContact</a> and <a href="https://help.aliyun.com/document_detail/114929.html">PutContactGroup</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS_Group</p>
     */
    @NameInMap("ContactGroups")
    public String contactGroups;

    /**
     * <p>Specifies whether to only precheck the request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request is prechecked but not executed. The system checks whether the required parameters are specified, the request format is valid, and the service limits are met. If the request fails the precheck, the corresponding error is returned. If the request passes the precheck, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): The request is sent and executed. If the request passes the precheck, an HTTP 2xx status code is returned and the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The effective period of the alert rule.</p>
     * 
     * <strong>example:</strong>
     * <p>00:00-23:59</p>
     */
    @NameInMap("EffectiveInterval")
    public String effectiveInterval;

    /**
     * <p>The subject of the alert email.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS instance alert</p>
     */
    @NameInMap("EmailSubject")
    public String emailSubject;

    /**
     * <p>The trigger epoch of the alert rule. Unit: seconds.</p>
     * <blockquote>
     * <p>For more information about how to query the statistical epoch of a metric, see <a href="https://help.aliyun.com/document_detail/163515.html">Alibaba Cloud service metrics</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>The labels that are added to the metric and displayed in the alert notification when the metric meets the alert condition and an alert is triggered.</p>
     * <blockquote>
     * <p>This feature is the same as the Label feature in Prometheus alerts.</p>
     * </blockquote>
     */
    @NameInMap("Labels")
    public java.util.List<PutResourceMetricRuleRequestLabels> labels;

    /**
     * <p>The name of the metric. For more information about how to query the name of a metric, see <a href="https://help.aliyun.com/document_detail/163515.html">Alibaba Cloud service metrics</a>.</p>
     * <blockquote>
     * <p>When you create a Prometheus alert rule for CloudMonitor, this parameter specifies the name of the metric repository. For more information about how to obtain the name of a metric repository, see <a href="https://help.aliyun.com/document_detail/428880.html">DescribeHybridMonitorNamespaceList</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cpu_total</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>The data namespace of the Alibaba Cloud service. For more information about how to query the data namespace of an Alibaba Cloud service, see <a href="https://help.aliyun.com/document_detail/163515.html">Alibaba Cloud service metrics</a>.</p>
     * <blockquote>
     * <p>When you create a Prometheus alert rule for CloudMonitor, you must configure this parameter to <code>acs_prometheus</code>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acs_ecs_dashboard</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The action to take when no monitoring data is found. Valid values:</p>
     * <ul>
     * <li>KEEP_LAST_STATE (default): No action is taken.</li>
     * <li>INSUFFICIENT_DATA: The alert content indicates that no data is found.</li>
     * <li>OK: The status is normal.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>KEEP_LAST_STATE</p>
     */
    @NameInMap("NoDataPolicy")
    public String noDataPolicy;

    /**
     * <p>The time range during which the alert rule is inactive.</p>
     * 
     * <strong>example:</strong>
     * <p>00:00-06:00</p>
     */
    @NameInMap("NoEffectiveInterval")
    public String noEffectiveInterval;

    /**
     * <p>The statistical epoch of the metric. Unit: seconds. The default value is the original reporting epoch of the metric.</p>
     * <blockquote>
     * <p>For more information about how to query the statistical epoch of a metric, see <a href="https://help.aliyun.com/document_detail/163515.html">Alibaba Cloud service metrics</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The Prometheus alert.</p>
     * <blockquote>
     * <p>You need to configure this parameter only when you create a Prometheus alert rule for Hybrid Cloud Monitoring.</p>
     * </blockquote>
     */
    @NameInMap("Prometheus")
    public PutResourceMetricRuleRequestPrometheus prometheus;

    /**
     * <p>The resource information. Examples: <code>[{&quot;instanceId&quot;:&quot;i-uf6j91r34rnwawoo****&quot;}]</code> and <code>[{&quot;userId&quot;:&quot;100931896542****&quot;}]</code>.</p>
     * <p>For more information about the dimensions supported by resource information, see <a href="https://help.aliyun.com/document_detail/163515.html">Alibaba Cloud service metrics</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;instanceId&quot;:&quot;i-uf6j91r34rnwawoo****&quot;}]</p>
     */
    @NameInMap("Resources")
    public String resources;

    /**
     * <p>The ID of the alert rule.</p>
     * <p>You can enter a new alert rule ID or use an existing alert rule ID in CloudMonitor. For more information about how to query the ID of an alert rule, see <a href="https://help.aliyun.com/document_detail/114941.html">DescribeMetricRuleList</a>.</p>
     * <blockquote>
     * <p>Entering a new alert rule ID indicates that a threshold-based alert rule is created.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a151cd6023eacee2f0978e03863cc1697c89508****</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    /**
     * <p>The name of the alert rule.</p>
     * <p>You can enter a new alert rule name or use an existing alert rule name in CloudMonitor. For more information about how to query the name of an alert rule, see <a href="https://help.aliyun.com/document_detail/114941.html">DescribeMetricRuleList</a>.</p>
     * <blockquote>
     * <p>Entering a new alert rule name indicates that a threshold-based alert rule is created.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test123</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>Specifies whether to send a recovery notification.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SendOK")
    public Boolean sendOK;

    /**
     * <p>The mute epoch. Unit: seconds. Default value: 86400.</p>
     * <blockquote>
     * <p>The mute epoch refers to the interval at which to send an alert notification again if the alert does not recover to Normal after it is triggered.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>86400</p>
     */
    @NameInMap("SilenceTime")
    public Integer silenceTime;

    /**
     * <p>The webhook URL to which a POST request is sent when an alert is triggered.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://alert.aliyun.com.com:8080/callback">https://alert.aliyun.com.com:8080/callback</a></p>
     */
    @NameInMap("Webhook")
    public String webhook;

    public static PutResourceMetricRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        PutResourceMetricRuleRequest self = new PutResourceMetricRuleRequest();
        return TeaModel.build(map, self);
    }

    public PutResourceMetricRuleRequest setEscalations(PutResourceMetricRuleRequestEscalations escalations) {
        this.escalations = escalations;
        return this;
    }
    public PutResourceMetricRuleRequestEscalations getEscalations() {
        return this.escalations;
    }

    public PutResourceMetricRuleRequest setCompositeExpression(PutResourceMetricRuleRequestCompositeExpression compositeExpression) {
        this.compositeExpression = compositeExpression;
        return this;
    }
    public PutResourceMetricRuleRequestCompositeExpression getCompositeExpression() {
        return this.compositeExpression;
    }

    public PutResourceMetricRuleRequest setContactGroups(String contactGroups) {
        this.contactGroups = contactGroups;
        return this;
    }
    public String getContactGroups() {
        return this.contactGroups;
    }

    public PutResourceMetricRuleRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public PutResourceMetricRuleRequest setEffectiveInterval(String effectiveInterval) {
        this.effectiveInterval = effectiveInterval;
        return this;
    }
    public String getEffectiveInterval() {
        return this.effectiveInterval;
    }

    public PutResourceMetricRuleRequest setEmailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
        return this;
    }
    public String getEmailSubject() {
        return this.emailSubject;
    }

    public PutResourceMetricRuleRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public PutResourceMetricRuleRequest setLabels(java.util.List<PutResourceMetricRuleRequestLabels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<PutResourceMetricRuleRequestLabels> getLabels() {
        return this.labels;
    }

    public PutResourceMetricRuleRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public PutResourceMetricRuleRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public PutResourceMetricRuleRequest setNoDataPolicy(String noDataPolicy) {
        this.noDataPolicy = noDataPolicy;
        return this;
    }
    public String getNoDataPolicy() {
        return this.noDataPolicy;
    }

    public PutResourceMetricRuleRequest setNoEffectiveInterval(String noEffectiveInterval) {
        this.noEffectiveInterval = noEffectiveInterval;
        return this;
    }
    public String getNoEffectiveInterval() {
        return this.noEffectiveInterval;
    }

    public PutResourceMetricRuleRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public PutResourceMetricRuleRequest setPrometheus(PutResourceMetricRuleRequestPrometheus prometheus) {
        this.prometheus = prometheus;
        return this;
    }
    public PutResourceMetricRuleRequestPrometheus getPrometheus() {
        return this.prometheus;
    }

    public PutResourceMetricRuleRequest setResources(String resources) {
        this.resources = resources;
        return this;
    }
    public String getResources() {
        return this.resources;
    }

    public PutResourceMetricRuleRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public PutResourceMetricRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public PutResourceMetricRuleRequest setSendOK(Boolean sendOK) {
        this.sendOK = sendOK;
        return this;
    }
    public Boolean getSendOK() {
        return this.sendOK;
    }

    public PutResourceMetricRuleRequest setSilenceTime(Integer silenceTime) {
        this.silenceTime = silenceTime;
        return this;
    }
    public Integer getSilenceTime() {
        return this.silenceTime;
    }

    public PutResourceMetricRuleRequest setWebhook(String webhook) {
        this.webhook = webhook;
        return this;
    }
    public String getWebhook() {
        return this.webhook;
    }

    public static class PutResourceMetricRuleRequestEscalationsCritical extends TeaModel {
        /**
         * <p>The comparison operator for the Critical-level threshold. Valid values:</p>
         * <ul>
         * <li>GreaterThanOrEqualToThreshold: greater than or equal to the threshold.</li>
         * <li>GreaterThanThreshold: greater than the threshold.</li>
         * <li>LessThanOrEqualToThreshold: less than or equal to the threshold.</li>
         * <li>LessThanThreshold: less than the threshold.</li>
         * <li>NotEqualToThreshold: not equal to the threshold.</li>
         * <li>EqualToThreshold: equal to the threshold.</li>
         * <li>GreaterThanYesterday: greater than the value at the same time yesterday.</li>
         * <li>LessThanYesterday: less than the value at the same time yesterday.</li>
         * <li>GreaterThanLastWeek: greater than the value at the same time last week.</li>
         * <li>LessThanLastWeek: less than the value at the same time last week.</li>
         * <li>GreaterThanLastPeriod: greater than the value in the previous period.</li>
         * <li>LessThanLastPeriod: less than the value in the previous period.</li>
         * </ul>
         * <blockquote>
         * <p>You must configure at least one of the following alert levels: Critical, Warn, and Info. For the configured alert level, you must specify the Statistics, ComparisonOperator, Threshold, and Times parameters at the same time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>GreaterThanOrEqualToThreshold</p>
         */
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        /**
         * <p>The statistical method for the Critical-level alert.</p>
         * <p>The valid values of this parameter are determined by the <code>Statistics</code> column corresponding to the <code>MetricName</code> of the specified Alibaba Cloud service. Examples: Maximum, Minimum, and Average. For more information about how to obtain the valid values for this parameter, see <a href="https://help.aliyun.com/document_detail/163515.html">Alibaba Cloud service metrics</a>.</p>
         * <blockquote>
         * <p>You must configure at least one of the following alert levels: Critical, Warn, and Info. For the configured alert level, you must specify the Statistics, ComparisonOperator, Threshold, and Times parameters at the same time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Average</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>The threshold for the Critical-level alert.</p>
         * <blockquote>
         * <p>You must configure at least one of the following alert levels: Critical, Warn, and Info. For the configured alert level, you must specify the Statistics, ComparisonOperator, Threshold, and Times parameters at the same time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("Threshold")
        public String threshold;

        /**
         * <p>The number of retries for the Critical-level alert.</p>
         * <blockquote>
         * <p>You must configure at least one of the following alert levels: Critical, Warn, and Info. For the configured alert level, you must specify the Statistics, ComparisonOperator, Threshold, and Times parameters at the same time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Times")
        public Integer times;

        public static PutResourceMetricRuleRequestEscalationsCritical build(java.util.Map<String, ?> map) throws Exception {
            PutResourceMetricRuleRequestEscalationsCritical self = new PutResourceMetricRuleRequestEscalationsCritical();
            return TeaModel.build(map, self);
        }

        public PutResourceMetricRuleRequestEscalationsCritical setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public PutResourceMetricRuleRequestEscalationsCritical setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public PutResourceMetricRuleRequestEscalationsCritical setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public PutResourceMetricRuleRequestEscalationsCritical setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class PutResourceMetricRuleRequestEscalationsInfo extends TeaModel {
        /**
         * <p>The comparison operator for the Info-level threshold. Valid values:</p>
         * <ul>
         * <li>GreaterThanOrEqualToThreshold: greater than or equal to the threshold.</li>
         * <li>GreaterThanThreshold: greater than the threshold.</li>
         * <li>LessThanOrEqualToThreshold: less than or equal to the threshold.</li>
         * <li>LessThanThreshold: less than the threshold.</li>
         * <li>NotEqualToThreshold: not equal to the threshold.</li>
         * <li>EqualToThreshold: equal to the threshold.</li>
         * <li>GreaterThanYesterday: greater than the value at the same time yesterday.</li>
         * <li>LessThanYesterday: less than the value at the same time yesterday.</li>
         * <li>GreaterThanLastWeek: greater than the value at the same time last week.</li>
         * <li>LessThanLastWeek: less than the value at the same time last week.</li>
         * <li>GreaterThanLastPeriod: greater than the value in the previous period.</li>
         * <li>LessThanLastPeriod: less than the value in the previous period.</li>
         * </ul>
         * <blockquote>
         * <p>You must configure at least one of the following alert levels: Critical, Warn, and Info. For the configured alert level, you must specify the Statistics, ComparisonOperator, Threshold, and Times parameters at the same time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>GreaterThanOrEqualToThreshold</p>
         */
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        /**
         * <p>The statistical method for the Info-level alert.</p>
         * <p>The valid values of this parameter are determined by the <code>Statistics</code> column corresponding to the <code>MetricName</code> of the specified Alibaba Cloud service. Examples: Maximum, Minimum, and Average. For more information about how to obtain the valid values for this parameter, see <a href="https://help.aliyun.com/document_detail/163515.html">Alibaba Cloud service metrics</a>.</p>
         * <blockquote>
         * <p>You must configure at least one of the following alert levels: Critical, Warn, and Info. For the configured alert level, you must specify the Statistics, ComparisonOperator, Threshold, and Times parameters at the same time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Average</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>The threshold for the Info-level alert.</p>
         * <blockquote>
         * <p>You must configure at least one of the following alert levels: Critical, Warn, and Info. For the configured alert level, you must specify the Statistics, ComparisonOperator, Threshold, and Times parameters at the same time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("Threshold")
        public String threshold;

        /**
         * <p>The number of retries for the Info-level alert.</p>
         * <blockquote>
         * <p>You must configure at least one of the following alert levels: Critical, Warn, and Info. For the configured alert level, you must specify the Statistics, ComparisonOperator, Threshold, and Times parameters at the same time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Times")
        public Integer times;

        public static PutResourceMetricRuleRequestEscalationsInfo build(java.util.Map<String, ?> map) throws Exception {
            PutResourceMetricRuleRequestEscalationsInfo self = new PutResourceMetricRuleRequestEscalationsInfo();
            return TeaModel.build(map, self);
        }

        public PutResourceMetricRuleRequestEscalationsInfo setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public PutResourceMetricRuleRequestEscalationsInfo setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public PutResourceMetricRuleRequestEscalationsInfo setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public PutResourceMetricRuleRequestEscalationsInfo setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class PutResourceMetricRuleRequestEscalationsWarn extends TeaModel {
        /**
         * <p>The comparison operator for the Warn-level threshold. Valid values:</p>
         * <ul>
         * <li>GreaterThanOrEqualToThreshold: greater than or equal to the threshold.</li>
         * <li>GreaterThanThreshold: greater than the threshold.</li>
         * <li>LessThanOrEqualToThreshold: less than or equal to the threshold.</li>
         * <li>LessThanThreshold: less than the threshold.</li>
         * <li>NotEqualToThreshold: not equal to the threshold.</li>
         * <li>EqualToThreshold: equal to the threshold.</li>
         * <li>GreaterThanYesterday: greater than the value at the same time yesterday.</li>
         * <li>LessThanYesterday: less than the value at the same time yesterday.</li>
         * <li>GreaterThanLastWeek: greater than the value at the same time last week.</li>
         * <li>LessThanLastWeek: less than the value at the same time last week.</li>
         * <li>GreaterThanLastPeriod: greater than the value in the previous period.</li>
         * <li>LessThanLastPeriod: less than the value in the previous period.</li>
         * </ul>
         * <blockquote>
         * <p>You must configure at least one of the following alert levels: Critical, Warn, and Info. For the configured alert level, you must specify the Statistics, ComparisonOperator, Threshold, and Times parameters at the same time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>GreaterThanOrEqualToThreshold</p>
         */
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        /**
         * <p>The statistical method for the Warn-level alert.</p>
         * <p>The valid values of this parameter are determined by the <code>Statistics</code> column corresponding to the <code>MetricName</code> of the specified Alibaba Cloud service. Examples: Maximum, Minimum, and Average. For more information about how to obtain the valid values for this parameter, see <a href="https://help.aliyun.com/document_detail/163515.html">Alibaba Cloud service metrics</a>.</p>
         * <blockquote>
         * <p>You must configure at least one of the following alert levels: Critical, Warn, and Info. For the configured alert level, you must specify the Statistics, ComparisonOperator, Threshold, and Times parameters at the same time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Average</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>The threshold for the Warn-level alert.</p>
         * <blockquote>
         * <p>You must configure at least one of the following alert levels: Critical, Warn, and Info. For the configured alert level, you must specify the Statistics, ComparisonOperator, Threshold, and Times parameters at the same time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("Threshold")
        public String threshold;

        /**
         * <p>The number of retries for the Warn-level alert.</p>
         * <blockquote>
         * <p>You must configure at least one of the following alert levels: Critical, Warn, and Info. For the configured alert level, you must specify the Statistics, ComparisonOperator, Threshold, and Times parameters at the same time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Times")
        public Integer times;

        public static PutResourceMetricRuleRequestEscalationsWarn build(java.util.Map<String, ?> map) throws Exception {
            PutResourceMetricRuleRequestEscalationsWarn self = new PutResourceMetricRuleRequestEscalationsWarn();
            return TeaModel.build(map, self);
        }

        public PutResourceMetricRuleRequestEscalationsWarn setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public PutResourceMetricRuleRequestEscalationsWarn setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public PutResourceMetricRuleRequestEscalationsWarn setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public PutResourceMetricRuleRequestEscalationsWarn setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class PutResourceMetricRuleRequestEscalations extends TeaModel {
        @NameInMap("Critical")
        public PutResourceMetricRuleRequestEscalationsCritical critical;

        @NameInMap("Info")
        public PutResourceMetricRuleRequestEscalationsInfo info;

        @NameInMap("Warn")
        public PutResourceMetricRuleRequestEscalationsWarn warn;

        public static PutResourceMetricRuleRequestEscalations build(java.util.Map<String, ?> map) throws Exception {
            PutResourceMetricRuleRequestEscalations self = new PutResourceMetricRuleRequestEscalations();
            return TeaModel.build(map, self);
        }

        public PutResourceMetricRuleRequestEscalations setCritical(PutResourceMetricRuleRequestEscalationsCritical critical) {
            this.critical = critical;
            return this;
        }
        public PutResourceMetricRuleRequestEscalationsCritical getCritical() {
            return this.critical;
        }

        public PutResourceMetricRuleRequestEscalations setInfo(PutResourceMetricRuleRequestEscalationsInfo info) {
            this.info = info;
            return this;
        }
        public PutResourceMetricRuleRequestEscalationsInfo getInfo() {
            return this.info;
        }

        public PutResourceMetricRuleRequestEscalations setWarn(PutResourceMetricRuleRequestEscalationsWarn warn) {
            this.warn = warn;
            return this;
        }
        public PutResourceMetricRuleRequestEscalationsWarn getWarn() {
            return this.warn;
        }

    }

    public static class PutResourceMetricRuleRequestCompositeExpressionExpressionList extends TeaModel {
        /**
         * <p>The comparison operator for the threshold. Valid values:</p>
         * <ul>
         * <li>GreaterThanOrEqualToThreshold: greater than or equal to the threshold.</li>
         * <li>GreaterThanThreshold: greater than the threshold.</li>
         * <li>LessThanOrEqualToThreshold: less than or equal to the threshold.</li>
         * <li>LessThanThreshold: less than the threshold.</li>
         * <li>NotEqualToThreshold: not equal to the threshold.</li>
         * <li>EqualToThreshold: equal to the threshold.</li>
         * <li>GreaterThanYesterday: greater than the value at the same time yesterday.</li>
         * <li>LessThanYesterday: less than the value at the same time yesterday.</li>
         * <li>GreaterThanLastWeek: greater than the value at the same time last week.</li>
         * <li>LessThanLastWeek: less than the value at the same time last week.</li>
         * <li>GreaterThanLastPeriod: greater than the value in the previous period.</li>
         * <li>LessThanLastPeriod: less than the value in the previous period.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GreaterThanOrEqualToThreshold</p>
         */
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        /**
         * <p>The name of the metric for the Alibaba Cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>cpu_total</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The aggregation period of the metric.</p>
         * <p>Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Period")
        public Long period;

        /**
         * <p>The statistical method of the metric. Valid values:</p>
         * <ul>
         * <li>$Maximum: the maximum value.</li>
         * <li>$Minimum: the minimum value.</li>
         * <li>$Average: the average value.</li>
         * <li>$Availability: the active rate. This is typically used for site monitoring.</li>
         * </ul>
         * <blockquote>
         * <p><code>$</code> is the unified prefix for metrics. For more information about supported Alibaba Cloud services, see <a href="https://help.aliyun.com/document_detail/163515.html">Alibaba Cloud service metrics</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>$Maximum</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>The alert threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("Threshold")
        public String threshold;

        public static PutResourceMetricRuleRequestCompositeExpressionExpressionList build(java.util.Map<String, ?> map) throws Exception {
            PutResourceMetricRuleRequestCompositeExpressionExpressionList self = new PutResourceMetricRuleRequestCompositeExpressionExpressionList();
            return TeaModel.build(map, self);
        }

        public PutResourceMetricRuleRequestCompositeExpressionExpressionList setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public PutResourceMetricRuleRequestCompositeExpressionExpressionList setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public PutResourceMetricRuleRequestCompositeExpressionExpressionList setPeriod(Long period) {
            this.period = period;
            return this;
        }
        public Long getPeriod() {
            return this.period;
        }

        public PutResourceMetricRuleRequestCompositeExpressionExpressionList setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public PutResourceMetricRuleRequestCompositeExpressionExpressionList setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

    }

    public static class PutResourceMetricRuleRequestCompositeExpression extends TeaModel {
        /**
         * <p>The list of standard alert conditions.</p>
         */
        @NameInMap("ExpressionList")
        public java.util.List<PutResourceMetricRuleRequestCompositeExpressionExpressionList> expressionList;

        /**
         * <p>The logical relationship between multi-metric alert conditions. Valid values: </p>
         * <ul>
         * <li><p><code>&amp;&amp;</code>: An alert is triggered only when all metrics meet the alert conditions. An alert is triggered only when all expressions in ExpressionList evaluate to <code>true</code>.</p>
         * </li>
         * <li><p><code>||</code>: An alert is triggered when any metric meets the alert condition.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>||</p>
         */
        @NameInMap("ExpressionListJoin")
        public String expressionListJoin;

        /**
         * <p>The alert conditions created by using expressions. This includes but is not limited to the following scenarios:</p>
         * <ul>
         * <li>Configure an alert blacklist for specific resources. Example: <code>$instanceId != \\&quot;i-io8kfvcpp7x5****\\&quot; ``&amp;&amp;`` $Average &gt; 50</code>. This indicates that no alert is triggered even if the <code>Average</code> value of the instance <code>i-io8kfvcpp7x5****</code> in the alert rule is greater than 50.</li>
         * <li>Configure a special alert threshold for a specific instance in the rule. Example: <code>$Average &gt; ($instanceId == \\&quot;i-io8kfvcpp7x5****\\&quot;? 80: 50)</code>. This indicates that an alert is triggered only when the <code>Average</code> value of the instance <code>i-io8kfvcpp7x5****</code> in the alert rule is greater than 80. For other instances, an alert is triggered when the <code>Average</code> value is greater than 50.</li>
         * <li>Limit the number of instances that exceed the threshold in the rule. Example: <code>count($Average &gt; 20) &gt; 3</code>. This indicates that an alert is triggered only when the number of instances whose <code>Average</code> value is greater than 20 exceeds 3.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>$Average &gt; ($instanceId == \&quot;i-io8kfvcpp7x5****\&quot;? 80: 50)</p>
         */
        @NameInMap("ExpressionRaw")
        public String expressionRaw;

        /**
         * <p>The alert level. Valid values:</p>
         * <ul>
         * <li>CRITICAL: critical.</li>
         * <li>WARN: warning.</li>
         * <li>INFO: info.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CRITICAL</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The number of times that the alert condition must be met before an alert notification is sent.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Times")
        public Integer times;

        public static PutResourceMetricRuleRequestCompositeExpression build(java.util.Map<String, ?> map) throws Exception {
            PutResourceMetricRuleRequestCompositeExpression self = new PutResourceMetricRuleRequestCompositeExpression();
            return TeaModel.build(map, self);
        }

        public PutResourceMetricRuleRequestCompositeExpression setExpressionList(java.util.List<PutResourceMetricRuleRequestCompositeExpressionExpressionList> expressionList) {
            this.expressionList = expressionList;
            return this;
        }
        public java.util.List<PutResourceMetricRuleRequestCompositeExpressionExpressionList> getExpressionList() {
            return this.expressionList;
        }

        public PutResourceMetricRuleRequestCompositeExpression setExpressionListJoin(String expressionListJoin) {
            this.expressionListJoin = expressionListJoin;
            return this;
        }
        public String getExpressionListJoin() {
            return this.expressionListJoin;
        }

        public PutResourceMetricRuleRequestCompositeExpression setExpressionRaw(String expressionRaw) {
            this.expressionRaw = expressionRaw;
            return this;
        }
        public String getExpressionRaw() {
            return this.expressionRaw;
        }

        public PutResourceMetricRuleRequestCompositeExpression setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public PutResourceMetricRuleRequestCompositeExpression setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class PutResourceMetricRuleRequestLabels extends TeaModel {
        /**
         * <p>The label key.</p>
         * 
         * <strong>example:</strong>
         * <p>tagKey1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The label value.</p>
         * <blockquote>
         * <p>The label value supports template parameters. The template parameters are replaced with the actual label values.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        @NameInMap("Value")
        public String value;

        public static PutResourceMetricRuleRequestLabels build(java.util.Map<String, ?> map) throws Exception {
            PutResourceMetricRuleRequestLabels self = new PutResourceMetricRuleRequestLabels();
            return TeaModel.build(map, self);
        }

        public PutResourceMetricRuleRequestLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public PutResourceMetricRuleRequestLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class PutResourceMetricRuleRequestPrometheusAnnotations extends TeaModel {
        /**
         * <p>The annotation key.</p>
         * 
         * <strong>example:</strong>
         * <p>summary</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The annotation value.</p>
         * 
         * <strong>example:</strong>
         * <p>{{ $labels.instance }} CPU usage above 10% {current value: {{ humanizePercentage $value }} }</p>
         */
        @NameInMap("Value")
        public String value;

        public static PutResourceMetricRuleRequestPrometheusAnnotations build(java.util.Map<String, ?> map) throws Exception {
            PutResourceMetricRuleRequestPrometheusAnnotations self = new PutResourceMetricRuleRequestPrometheusAnnotations();
            return TeaModel.build(map, self);
        }

        public PutResourceMetricRuleRequestPrometheusAnnotations setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public PutResourceMetricRuleRequestPrometheusAnnotations setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class PutResourceMetricRuleRequestPrometheus extends TeaModel {
        /**
         * <p>The annotations that are rendered with their keys and values during a Prometheus alert to help you understand the metric or alert rule.</p>
         * <blockquote>
         * <p>This feature is equivalent to the Annotation feature in Prometheus.</p>
         * </blockquote>
         */
        @NameInMap("Annotations")
        public java.util.List<PutResourceMetricRuleRequestPrometheusAnnotations> annotations;

        /**
         * <p>The alert level. Valid values:</p>
         * <ul>
         * <li>CRITICAL: critical.</li>
         * <li>WARN: warning.</li>
         * <li>INFO: info.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CRITICAL</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The PromQL query statement.</p>
         * <blockquote>
         * <p>The data obtained by using the PromQL query statement is used as the alert data. You must include the alert threshold in this statement.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cpuUsage{instanceId=&quot;xxxx&quot;}[1m]&gt;90</p>
         */
        @NameInMap("PromQL")
        public String promQL;

        /**
         * <p>The number of times that the alert condition must be met before an alert notification is sent.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Times")
        public Integer times;

        public static PutResourceMetricRuleRequestPrometheus build(java.util.Map<String, ?> map) throws Exception {
            PutResourceMetricRuleRequestPrometheus self = new PutResourceMetricRuleRequestPrometheus();
            return TeaModel.build(map, self);
        }

        public PutResourceMetricRuleRequestPrometheus setAnnotations(java.util.List<PutResourceMetricRuleRequestPrometheusAnnotations> annotations) {
            this.annotations = annotations;
            return this;
        }
        public java.util.List<PutResourceMetricRuleRequestPrometheusAnnotations> getAnnotations() {
            return this.annotations;
        }

        public PutResourceMetricRuleRequestPrometheus setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public PutResourceMetricRuleRequestPrometheus setPromQL(String promQL) {
            this.promQL = promQL;
            return this;
        }
        public String getPromQL() {
            return this.promQL;
        }

        public PutResourceMetricRuleRequestPrometheus setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

}
