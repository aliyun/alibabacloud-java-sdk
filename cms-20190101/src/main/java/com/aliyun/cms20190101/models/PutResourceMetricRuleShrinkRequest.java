// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutResourceMetricRuleShrinkRequest extends TeaModel {
    @NameInMap("Escalations")
    public PutResourceMetricRuleShrinkRequestEscalations escalations;

    /**
     * <p>The alert conditions for multiple metrics.</p>
     * <blockquote>
     * <p>Single-metric and multi-metric alert conditions are mutually exclusive and cannot be configured at the same time.</p>
     * </blockquote>
     */
    @NameInMap("CompositeExpression")
    public String compositeExpressionShrink;

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
    public java.util.List<PutResourceMetricRuleShrinkRequestLabels> labels;

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
    public String prometheusShrink;

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

    public static PutResourceMetricRuleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        PutResourceMetricRuleShrinkRequest self = new PutResourceMetricRuleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public PutResourceMetricRuleShrinkRequest setEscalations(PutResourceMetricRuleShrinkRequestEscalations escalations) {
        this.escalations = escalations;
        return this;
    }
    public PutResourceMetricRuleShrinkRequestEscalations getEscalations() {
        return this.escalations;
    }

    public PutResourceMetricRuleShrinkRequest setCompositeExpressionShrink(String compositeExpressionShrink) {
        this.compositeExpressionShrink = compositeExpressionShrink;
        return this;
    }
    public String getCompositeExpressionShrink() {
        return this.compositeExpressionShrink;
    }

    public PutResourceMetricRuleShrinkRequest setContactGroups(String contactGroups) {
        this.contactGroups = contactGroups;
        return this;
    }
    public String getContactGroups() {
        return this.contactGroups;
    }

    public PutResourceMetricRuleShrinkRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public PutResourceMetricRuleShrinkRequest setEffectiveInterval(String effectiveInterval) {
        this.effectiveInterval = effectiveInterval;
        return this;
    }
    public String getEffectiveInterval() {
        return this.effectiveInterval;
    }

    public PutResourceMetricRuleShrinkRequest setEmailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
        return this;
    }
    public String getEmailSubject() {
        return this.emailSubject;
    }

    public PutResourceMetricRuleShrinkRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public PutResourceMetricRuleShrinkRequest setLabels(java.util.List<PutResourceMetricRuleShrinkRequestLabels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<PutResourceMetricRuleShrinkRequestLabels> getLabels() {
        return this.labels;
    }

    public PutResourceMetricRuleShrinkRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public PutResourceMetricRuleShrinkRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public PutResourceMetricRuleShrinkRequest setNoDataPolicy(String noDataPolicy) {
        this.noDataPolicy = noDataPolicy;
        return this;
    }
    public String getNoDataPolicy() {
        return this.noDataPolicy;
    }

    public PutResourceMetricRuleShrinkRequest setNoEffectiveInterval(String noEffectiveInterval) {
        this.noEffectiveInterval = noEffectiveInterval;
        return this;
    }
    public String getNoEffectiveInterval() {
        return this.noEffectiveInterval;
    }

    public PutResourceMetricRuleShrinkRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public PutResourceMetricRuleShrinkRequest setPrometheusShrink(String prometheusShrink) {
        this.prometheusShrink = prometheusShrink;
        return this;
    }
    public String getPrometheusShrink() {
        return this.prometheusShrink;
    }

    public PutResourceMetricRuleShrinkRequest setResources(String resources) {
        this.resources = resources;
        return this;
    }
    public String getResources() {
        return this.resources;
    }

    public PutResourceMetricRuleShrinkRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public PutResourceMetricRuleShrinkRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public PutResourceMetricRuleShrinkRequest setSendOK(Boolean sendOK) {
        this.sendOK = sendOK;
        return this;
    }
    public Boolean getSendOK() {
        return this.sendOK;
    }

    public PutResourceMetricRuleShrinkRequest setSilenceTime(Integer silenceTime) {
        this.silenceTime = silenceTime;
        return this;
    }
    public Integer getSilenceTime() {
        return this.silenceTime;
    }

    public PutResourceMetricRuleShrinkRequest setWebhook(String webhook) {
        this.webhook = webhook;
        return this;
    }
    public String getWebhook() {
        return this.webhook;
    }

    public static class PutResourceMetricRuleShrinkRequestEscalationsCritical extends TeaModel {
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

        public static PutResourceMetricRuleShrinkRequestEscalationsCritical build(java.util.Map<String, ?> map) throws Exception {
            PutResourceMetricRuleShrinkRequestEscalationsCritical self = new PutResourceMetricRuleShrinkRequestEscalationsCritical();
            return TeaModel.build(map, self);
        }

        public PutResourceMetricRuleShrinkRequestEscalationsCritical setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public PutResourceMetricRuleShrinkRequestEscalationsCritical setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public PutResourceMetricRuleShrinkRequestEscalationsCritical setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public PutResourceMetricRuleShrinkRequestEscalationsCritical setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class PutResourceMetricRuleShrinkRequestEscalationsInfo extends TeaModel {
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

        public static PutResourceMetricRuleShrinkRequestEscalationsInfo build(java.util.Map<String, ?> map) throws Exception {
            PutResourceMetricRuleShrinkRequestEscalationsInfo self = new PutResourceMetricRuleShrinkRequestEscalationsInfo();
            return TeaModel.build(map, self);
        }

        public PutResourceMetricRuleShrinkRequestEscalationsInfo setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public PutResourceMetricRuleShrinkRequestEscalationsInfo setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public PutResourceMetricRuleShrinkRequestEscalationsInfo setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public PutResourceMetricRuleShrinkRequestEscalationsInfo setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class PutResourceMetricRuleShrinkRequestEscalationsWarn extends TeaModel {
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

        public static PutResourceMetricRuleShrinkRequestEscalationsWarn build(java.util.Map<String, ?> map) throws Exception {
            PutResourceMetricRuleShrinkRequestEscalationsWarn self = new PutResourceMetricRuleShrinkRequestEscalationsWarn();
            return TeaModel.build(map, self);
        }

        public PutResourceMetricRuleShrinkRequestEscalationsWarn setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public PutResourceMetricRuleShrinkRequestEscalationsWarn setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public PutResourceMetricRuleShrinkRequestEscalationsWarn setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public PutResourceMetricRuleShrinkRequestEscalationsWarn setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class PutResourceMetricRuleShrinkRequestEscalations extends TeaModel {
        @NameInMap("Critical")
        public PutResourceMetricRuleShrinkRequestEscalationsCritical critical;

        @NameInMap("Info")
        public PutResourceMetricRuleShrinkRequestEscalationsInfo info;

        @NameInMap("Warn")
        public PutResourceMetricRuleShrinkRequestEscalationsWarn warn;

        public static PutResourceMetricRuleShrinkRequestEscalations build(java.util.Map<String, ?> map) throws Exception {
            PutResourceMetricRuleShrinkRequestEscalations self = new PutResourceMetricRuleShrinkRequestEscalations();
            return TeaModel.build(map, self);
        }

        public PutResourceMetricRuleShrinkRequestEscalations setCritical(PutResourceMetricRuleShrinkRequestEscalationsCritical critical) {
            this.critical = critical;
            return this;
        }
        public PutResourceMetricRuleShrinkRequestEscalationsCritical getCritical() {
            return this.critical;
        }

        public PutResourceMetricRuleShrinkRequestEscalations setInfo(PutResourceMetricRuleShrinkRequestEscalationsInfo info) {
            this.info = info;
            return this;
        }
        public PutResourceMetricRuleShrinkRequestEscalationsInfo getInfo() {
            return this.info;
        }

        public PutResourceMetricRuleShrinkRequestEscalations setWarn(PutResourceMetricRuleShrinkRequestEscalationsWarn warn) {
            this.warn = warn;
            return this;
        }
        public PutResourceMetricRuleShrinkRequestEscalationsWarn getWarn() {
            return this.warn;
        }

    }

    public static class PutResourceMetricRuleShrinkRequestLabels extends TeaModel {
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

        public static PutResourceMetricRuleShrinkRequestLabels build(java.util.Map<String, ?> map) throws Exception {
            PutResourceMetricRuleShrinkRequestLabels self = new PutResourceMetricRuleShrinkRequestLabels();
            return TeaModel.build(map, self);
        }

        public PutResourceMetricRuleShrinkRequestLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public PutResourceMetricRuleShrinkRequestLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
