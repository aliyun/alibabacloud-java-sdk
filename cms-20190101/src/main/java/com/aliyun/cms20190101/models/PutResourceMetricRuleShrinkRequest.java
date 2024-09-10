// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutResourceMetricRuleShrinkRequest extends TeaModel {
    @NameInMap("Escalations")
    public PutResourceMetricRuleShrinkRequestEscalations escalations;

    /**
     * <p>The trigger conditions for multiple metrics.</p>
     * <blockquote>
     * <p> The trigger conditions for a single metric and multiple metrics are mutually exclusive. You cannot specify trigger conditions for a single metric and multiple metrics at the same time.</p>
     * </blockquote>
     */
    @NameInMap("CompositeExpression")
    public String compositeExpressionShrink;

    /**
     * <p>The alert contact groups. Alert notifications are sent to the alert contacts in the alert contact group.</p>
     * <blockquote>
     * <p> An alert contact group can contain one or more alert contacts. For information about how to create alert contacts and alert contact groups, see <a href="https://help.aliyun.com/document_detail/114923.html">PutContact</a> and <a href="https://help.aliyun.com/document_detail/114929.html">PutContactGroup</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS_Group</p>
     */
    @NameInMap("ContactGroups")
    public String contactGroups;

    /**
     * <p>The period of time during which the alert rule is effective.</p>
     * 
     * <strong>example:</strong>
     * <p>00:00-23:59</p>
     */
    @NameInMap("EffectiveInterval")
    public String effectiveInterval;

    /**
     * <p>The subject of the alert notification email.</p>
     */
    @NameInMap("EmailSubject")
    public String emailSubject;

    /**
     * <p>The interval at which alerts are triggered based on the alert rule. Unit: seconds.</p>
     * <blockquote>
     * <p> For more information about how to query the statistical periods of metrics, see <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>If the metric meets the specified condition in the alert rule and CloudMonitor sends an alert notification, the tag is also written to the metric and displayed in the alert notification.</p>
     * <blockquote>
     * <p> This parameter is equivalent to the Label parameter of Prometheus alerts.</p>
     * </blockquote>
     */
    @NameInMap("Labels")
    public java.util.List<PutResourceMetricRuleShrinkRequestLabels> labels;

    /**
     * <p>The metric name. For more information about how to query metric names, see <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
     * <blockquote>
     * <p> If you create a Prometheus alert rule for Hybrid Cloud Monitoring, you must set this parameter to the name of the namespace. For more information about how to query the names of namespaces, see <a href="https://help.aliyun.com/document_detail/428880.html">DescribeHybridMonitorNamespaceList</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cpu_total</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>The namespace of the cloud service. For more information about how to query the namespaces of cloud services, see <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
     * <blockquote>
     * <p> If you create a Prometheus alert rule for Hybrid Cloud Monitoring, you must set this parameter to <code>acs_prometheus</code>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acs_ecs_dashboard</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The method that is used to handle alerts when no monitoring data is found. Valid value:</p>
     * <ul>
     * <li>KEEP_LAST_STATE (default): No operation is performed.</li>
     * <li>INSUFFICIENT_DATA: An alert whose content is &quot;Insufficient data&quot; is triggered.</li>
     * <li>OK: The status is considered normal.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>KEEP_LAST_STATE</p>
     */
    @NameInMap("NoDataPolicy")
    public String noDataPolicy;

    /**
     * <p>The period of time during which the alert rule is ineffective.</p>
     * 
     * <strong>example:</strong>
     * <p>00:00-06:00</p>
     */
    @NameInMap("NoEffectiveInterval")
    public String noEffectiveInterval;

    /**
     * <p>The statistical period of the metric. Unit: seconds. The default value is the interval at which the monitoring data of the metric is collected.</p>
     * <blockquote>
     * <p> For more information about how to query the statistical periods of metrics, see <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>Prometheus alerts.</p>
     * <blockquote>
     * <p> This parameter is required only if you create a Prometheus alert rule for Hybrid Cloud Monitoring.</p>
     * </blockquote>
     */
    @NameInMap("Prometheus")
    public String prometheusShrink;

    /**
     * <p>The resource information. Examples: <code>[{&quot;instanceId&quot;:&quot;i-uf6j91r34rnwawoo****&quot;}]</code> and <code>[{&quot;userId&quot;:&quot;100931896542****&quot;}]</code>.</p>
     * <p>For more information about the supported dimensions that are used to query resources, see <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;instanceId&quot;:&quot;i-uf6j91r34rnwawoo****&quot;}]</p>
     */
    @NameInMap("Resources")
    public String resources;

    /**
     * <p>The ID of the alert rule.</p>
     * <p>You can specify a new ID or the ID of an existing alert rule. For more information about how to query the IDs of alert rules, see <a href="https://help.aliyun.com/document_detail/114941.html">DescribeMetricRuleList</a>.</p>
     * <blockquote>
     * <p> If you specify a new ID, a threshold-triggered alert rule is created.</p>
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
     * <p>You can specify a new name or the name of an existing alert rule. For more information about how to query the names of alert rules, see <a href="https://help.aliyun.com/document_detail/114941.html">DescribeMetricRuleList</a>.</p>
     * <blockquote>
     * <p> If you specify a new name, a threshold-triggered alert rule is created.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test123</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The mute period during which new alert notifications are not sent even if the trigger conditions are met. Unit: seconds. Default value: 86400.</p>
     * <blockquote>
     * <p> If an alert is not cleared after the mute period ends, CloudMonitor resends an alert notification.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>86400</p>
     */
    @NameInMap("SilenceTime")
    public Integer silenceTime;

    /**
     * <p>The callback URL to which a POST request is sent when an alert is triggered based on the alert rule.</p>
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
         * <p>The operator that is used to compare the metric value with the threshold for Critical-level alerts. Valid value:</p>
         * <ul>
         * <li>GreaterThanOrEqualToThreshold: greater than or equal to the threshold</li>
         * <li>GreaterThanThreshold: greater than the threshold</li>
         * <li>LessThanOrEqualToThreshold: less than or equal to the threshold</li>
         * <li>LessThanThreshold: less than the threshold</li>
         * <li>NotEqualToThreshold: not equal to the threshold</li>
         * <li>GreaterThanYesterday: greater than the metric value at the same time yesterday</li>
         * <li>LessThanYesterday: less than the metric value at the same time yesterday</li>
         * <li>GreaterThanLastWeek: greater than the metric value at the same time last week</li>
         * <li>LessThanLastWeek: less than the metric value at the same time last week</li>
         * <li>GreaterThanLastPeriod: greater than the metric value in the last monitoring cycle</li>
         * <li>LessThanLastPeriod: less than the metric value in the last monitoring cycle</li>
         * </ul>
         * <blockquote>
         * <p> You must select at least one of the Critical, Warn, and Info alert levels and specify the Statistics, ComparisonOperator, Threshold, and Times parameters for each alert level.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>GreaterThanOrEqualToThreshold</p>
         */
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        /**
         * <p>The statistical methods for Critical-level alerts.</p>
         * <p>The value of this parameter is determined by the <code>Statistics</code> column corresponding to the <code>MetricName</code> parameter of the specified cloud service. The value of this parameter can be Maximum, Minimum, or Average. For more information about how to obtain the value of this parameter, see <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
         * <blockquote>
         * <p> You must select at least one of the Critical, Warn, and Info alert levels and specify the Statistics, ComparisonOperator, Threshold, and Times parameters for each alert level.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Average</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>The threshold for Critical-level alerts.</p>
         * <blockquote>
         * <p> You must select at least one of the Critical, Warn, and Info alert levels and specify the Statistics, ComparisonOperator, Threshold, and Times parameters for each alert level.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("Threshold")
        public String threshold;

        /**
         * <p>The consecutive number of times for which the metric value meets the alert condition before a Critical-level alert is triggered.</p>
         * <blockquote>
         * <p> You must select at least one of the Critical, Warn, and Info alert levels and specify the Statistics, ComparisonOperator, Threshold, and Times parameters for each alert level.</p>
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
         * <p>The operator that is used to compare the metric value with the threshold for Info-level alerts. Valid value:</p>
         * <ul>
         * <li>GreaterThanOrEqualToThreshold: greater than or equal to the threshold</li>
         * <li>GreaterThanThreshold: greater than the threshold</li>
         * <li>LessThanOrEqualToThreshold: less than or equal to the threshold</li>
         * <li>LessThanThreshold: less than the threshold</li>
         * <li>NotEqualToThreshold: not equal to the threshold</li>
         * <li>GreaterThanYesterday: greater than the metric value at the same time yesterday</li>
         * <li>LessThanYesterday: less than the metric value at the same time yesterday</li>
         * <li>GreaterThanLastWeek: greater than the metric value at the same time last week</li>
         * <li>LessThanLastWeek: less than the metric value at the same time last week</li>
         * <li>GreaterThanLastPeriod: greater than the metric value in the last monitoring cycle</li>
         * <li>LessThanLastPeriod: less than the metric value in the last monitoring cycle</li>
         * </ul>
         * <blockquote>
         * <p> You must select at least one of the Critical, Warn, and Info alert levels and specify the Statistics, ComparisonOperator, Threshold, and Times parameters for each alert level.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>GreaterThanOrEqualToThreshold</p>
         */
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        /**
         * <p>The statistical methods for Info-level alerts.</p>
         * <p>The value of this parameter is determined by the <code>Statistics</code> column corresponding to the <code>MetricName</code> parameter of the specified cloud service. The value of this parameter can be Maximum, Minimum, or Average. For more information about how to obtain the value of this parameter, see <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
         * <blockquote>
         * <p> You must select at least one of the Critical, Warn, and Info alert levels and specify the Statistics, ComparisonOperator, Threshold, and Times parameters for each alert level.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Average</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>The threshold for Info-level alerts.</p>
         * <blockquote>
         * <p> You must select at least one of the Critical, Warn, and Info alert levels and specify the Statistics, ComparisonOperator, Threshold, and Times parameters for each alert level.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("Threshold")
        public String threshold;

        /**
         * <p>The consecutive number of times for which the metric value meets the alert condition before an Info-level alert is triggered.</p>
         * <blockquote>
         * <p> You must select at least one of the Critical, Warn, and Info alert levels and specify the Statistics, ComparisonOperator, Threshold, and Times parameters for each alert level.</p>
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
         * <p>The operator that is used to compare the metric value with the threshold for Warn-level alerts. Valid value:</p>
         * <ul>
         * <li>GreaterThanOrEqualToThreshold: greater than or equal to the threshold</li>
         * <li>GreaterThanThreshold: greater than the threshold</li>
         * <li>LessThanOrEqualToThreshold: less than or equal to the threshold</li>
         * <li>LessThanThreshold: less than the threshold</li>
         * <li>NotEqualToThreshold: not equal to the threshold</li>
         * <li>GreaterThanYesterday: greater than the metric value at the same time yesterday</li>
         * <li>LessThanYesterday: less than the metric value at the same time yesterday</li>
         * <li>GreaterThanLastWeek: greater than the metric value at the same time last week</li>
         * <li>LessThanLastWeek: less than the metric value at the same time last week</li>
         * <li>GreaterThanLastPeriod: greater than the metric value in the last monitoring cycle</li>
         * <li>LessThanLastPeriod: less than the metric value in the last monitoring cycle</li>
         * </ul>
         * <blockquote>
         * <p> You must select at least one of the Critical, Warn, and Info alert levels and specify the Statistics, ComparisonOperator, Threshold, and Times parameters for each alert level.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>GreaterThanOrEqualToThreshold</p>
         */
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        /**
         * <p>The statistical methods for Warn-level alerts.</p>
         * <p>The value of this parameter is determined by the <code>Statistics</code> column corresponding to the <code>MetricName</code> parameter of the specified cloud service. The value of this parameter can be Maximum, Minimum, or Average. For more information about how to obtain the value of this parameter, see <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
         * <blockquote>
         * <p> You must select at least one of the Critical, Warn, and Info alert levels and specify the Statistics, ComparisonOperator, Threshold, and Times parameters for each alert level.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Average</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>The threshold for Warn-level alerts.</p>
         * <blockquote>
         * <p> You must select at least one of the Critical, Warn, and Info alert levels and specify the Statistics, ComparisonOperator, Threshold, and Times parameters for each alert level.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("Threshold")
        public String threshold;

        /**
         * <p>The consecutive number of times for which the metric value meets the alert condition before a Warn-level alert is triggered.</p>
         * <blockquote>
         * <p> You must select at least one of the Critical, Warn, and Info alert levels and specify the Statistics, ComparisonOperator, Threshold, and Times parameters for each alert level.</p>
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
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>tagKey1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * <blockquote>
         * <p> You can use a template parameter to specify a tag value. CloudMonitor replaces the value of the template parameter with an actual tag value.</p>
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
