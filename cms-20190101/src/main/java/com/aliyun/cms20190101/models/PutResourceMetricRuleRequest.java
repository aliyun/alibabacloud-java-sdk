// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutResourceMetricRuleRequest extends TeaModel {
    @NameInMap("Escalations")
    public PutResourceMetricRuleRequestEscalations escalations;

    /**
     * <p>The trigger conditions for multiple metrics.</p>
     * <blockquote>
     * <p> The trigger conditions for a single metric and multiple metrics are mutually exclusive. You cannot specify trigger conditions for a single metric and multiple metrics at the same time.</p>
     * </blockquote>
     */
    @NameInMap("CompositeExpression")
    public PutResourceMetricRuleRequestCompositeExpression compositeExpression;

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
    public java.util.List<PutResourceMetricRuleRequestLabels> labels;

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
    public PutResourceMetricRuleRequestPrometheus prometheus;

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
         * <p>The operator that is used to compare the metric value with the threshold for Critical-level alerts. Valid value:</p>
         * <ul>
         * <li>GreaterThanOrEqualToThreshold: greater than or equal to the threshold</li>
         * <li>GreaterThanThreshold: greater than the threshold</li>
         * <li>LessThanOrEqualToThreshold: less than or equal to the threshold</li>
         * <li>LessThanThreshold: less than the threshold</li>
         * <li>NotEqualToThreshold: not equal to the threshold</li>
         * <li>EqualToThreshold: equal to the threshold</li>
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
         * <p>The operator that is used to compare the metric value with the threshold for Info-level alerts. Valid value:</p>
         * <ul>
         * <li>GreaterThanOrEqualToThreshold: greater than or equal to the threshold</li>
         * <li>GreaterThanThreshold: greater than the threshold</li>
         * <li>LessThanOrEqualToThreshold: less than or equal to the threshold</li>
         * <li>LessThanThreshold: less than the threshold</li>
         * <li>NotEqualToThreshold: not equal to the threshold</li>
         * <li>EqualToThreshold: equal to the threshold</li>
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
         * <p>The operator that is used to compare the metric value with the threshold for Warn-level alerts. Valid value:</p>
         * <ul>
         * <li>GreaterThanOrEqualToThreshold: greater than or equal to the threshold</li>
         * <li>GreaterThanThreshold: greater than the threshold</li>
         * <li>LessThanOrEqualToThreshold: less than or equal to the threshold</li>
         * <li>LessThanThreshold: less than the threshold</li>
         * <li>NotEqualToThreshold: not equal to the threshold</li>
         * <li>EqualToThreshold: equal to the threshold</li>
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
         * <p>The operator that is used to compare the metric value with the threshold. Valid value:</p>
         * <ul>
         * <li>GreaterThanOrEqualToThreshold: greater than or equal to the threshold</li>
         * <li>GreaterThanThreshold: greater than the threshold</li>
         * <li>LessThanOrEqualToThreshold: less than or equal to the threshold</li>
         * <li>LessThanThreshold: less than the threshold</li>
         * <li>NotEqualToThreshold: not equal to the threshold</li>
         * <li>EqualToThreshold: equal to the threshold</li>
         * <li>GreaterThanYesterday: greater than the metric value at the same time yesterday</li>
         * <li>LessThanYesterday: less than the metric value at the same time yesterday</li>
         * <li>GreaterThanLastWeek: greater than the metric value at the same time last week</li>
         * <li>LessThanLastWeek: less than the metric value at the same time last week</li>
         * <li>GreaterThanLastPeriod: greater than the metric value in the last monitoring cycle</li>
         * <li>LessThanLastPeriod: less than the metric value in the last monitoring cycle</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GreaterThanOrEqualToThreshold</p>
         */
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        /**
         * <p>The metric that is used to monitor the cloud service.</p>
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
         * <p>The statistical method of the metric. Valid value:</p>
         * <ul>
         * <li>$Maximum: the maximum value</li>
         * <li>$Minimum: the minimum value</li>
         * <li>$Average: the average value</li>
         * <li>$Availability: the availability rate (usually used for site monitoring)</li>
         * </ul>
         * <blockquote>
         * <p> <code>$</code> is the prefix of the metric. For information about the Alibaba Cloud services that are supported by CloudMonitor, see <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
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
         * <p>The trigger conditions that are created in standard mode.</p>
         */
        @NameInMap("ExpressionList")
        public java.util.List<PutResourceMetricRuleRequestCompositeExpressionExpressionList> expressionList;

        /**
         * <p>The relationship between the trigger conditions for multiple metrics. Valid value:</p>
         * <ul>
         * <li><code>&amp;&amp;</code>: An alert is triggered only if all metrics meet the trigger conditions. An alert is triggered only if the results of all expressions specified in the ExpressionList parameter are <code>true</code>.</li>
         * <li><code>||</code>: An alert is triggered if one of the metrics meets the trigger conditions.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>||</p>
         */
        @NameInMap("ExpressionListJoin")
        public String expressionListJoin;

        /**
         * <p>The trigger conditions that are created by using expressions. You can use expressions to create trigger conditions in the following scenarios:</p>
         * <ul>
         * <li>Set an alert blacklist for specific resources. For example, if you specify <code>$instanceId != \\&quot;i-io8kfvcpp7x5****\\&quot; ``&amp;&amp;`` $Average &gt; 50</code>, no alert is triggered when the <code>average metric value</code> of the <code>i-io8kfvcpp7x5****</code> instance exceeds 50.</li>
         * <li>Set a special alert threshold for a specified instance in the rule. For example, if you specify <code>$Average &gt; ($instanceId == \\&quot;i-io8kfvcpp7x5****\\&quot;? 80: 50)</code>, an alert is triggered when the <code>average metric value</code> of the <code>i-io8kfvcpp7x5****</code> instance exceeds 80 or the <code>average metric value</code> of other instances exceeds 50.</li>
         * <li>Limit the number of instances whose metric values exceed the threshold. For example, if you specify <code>count($Average &gt; 20) &gt; 3</code>, an alert is triggered only when the <code>average metric value</code> of more than three instances exceeds 20.</li>
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
         * <li>Critical</li>
         * <li>Warn</li>
         * <li>Info</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Critical</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The number of consecutive triggers. If the number of times that the metric values meet the trigger conditions reaches the value of this parameter, CloudMonitor sends alert notifications.</p>
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
         * <p>The key of the annotation.</p>
         * 
         * <strong>example:</strong>
         * <p>summary</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the annotation.</p>
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
         * <p>The annotations of the Prometheus alert rule. When a Prometheus alert is triggered, the system renders the annotated keys and values to help you understand the metrics and alert rule.</p>
         * <blockquote>
         * <p> This parameter is equivalent to the annotations parameter of open source Prometheus.</p>
         * </blockquote>
         */
        @NameInMap("Annotations")
        public java.util.List<PutResourceMetricRuleRequestPrometheusAnnotations> annotations;

        /**
         * <p>The alert level. Valid values:</p>
         * <ul>
         * <li>Critical</li>
         * <li>Warn</li>
         * <li>Info</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Critical</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>PromQL statements are supported.</p>
         * <blockquote>
         * <p> The data obtained by using the PromQL query statement is the monitoring data. You must include the alert threshold in this statement.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cpuUsage{instanceId=&quot;xxxx&quot;}[1m]&gt;90</p>
         */
        @NameInMap("PromQL")
        public String promQL;

        /**
         * <p>The number of consecutive triggers. If the number of times that the metric values meet the trigger conditions reaches the value of this parameter, CloudMonitor sends alert notifications.</p>
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
