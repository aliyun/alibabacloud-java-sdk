// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutResourceMetricRuleRequest extends TeaModel {
    @NameInMap("Escalations")
    public PutResourceMetricRuleRequestEscalations escalations;

    /**
     * <p>The alert conditions for multiple metrics.</p>
     * <blockquote>
     * <p>Single-metric and multi-metric alert conditions are mutually exclusive and cannot be set at the same time.</p>
     * </blockquote>
     */
    @NameInMap("CompositeExpression")
    public PutResourceMetricRuleRequestCompositeExpression compositeExpression;

    /**
     * <p>The alert contact group. Alert notifications are sent to the alert contacts in this alert contact group.</p>
     * <blockquote>
     * <p>An alert contact group contains one or more alert contacts. For information about how to create alert contacts and alert contact groups, see <a href="https://help.aliyun.com/document_detail/114923.html">PutContact</a> and <a href="https://help.aliyun.com/document_detail/114929.html">PutContactGroup</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS_Group</p>
     */
    @NameInMap("ContactGroups")
    public String contactGroups;

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
     * <p>The trigger period of the alert rule. Unit: seconds.</p>
     * <blockquote>
     * <p>For information about how to query the statistical period of a metric, see <a href="https://help.aliyun.com/document_detail/163515.html">Alibaba Cloud service monitoring metrics</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>The labels that are written to the metric and displayed in alert notifications when the metric meets the alert condition.</p>
     * <blockquote>
     * <p>This feature is the same as the Label feature in Prometheus alerting.</p>
     * </blockquote>
     */
    @NameInMap("Labels")
    public java.util.List<PutResourceMetricRuleRequestLabels> labels;

    /**
     * <p>The name of the metric. For information about how to query metric names, see <a href="https://help.aliyun.com/document_detail/163515.html">Alibaba Cloud service monitoring metrics</a>.</p>
     * <blockquote>
     * <p>If you create a Prometheus alert rule for Hybrid Cloud Monitoring, this parameter specifies the name of the metric repository. For information about how to obtain the metric repository name, see <a href="https://help.aliyun.com/document_detail/428880.html">DescribeHybridMonitorNamespaceList</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cpu_total</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>The namespace of the Alibaba Cloud service. For information about how to query the namespace of an Alibaba Cloud service, see <a href="https://help.aliyun.com/document_detail/163515.html">Alibaba Cloud service monitoring metrics</a>.</p>
     * <blockquote>
     * <p>If you create a Prometheus alert rule for Hybrid Cloud Monitoring, set this parameter to <code>acs_prometheus</code>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acs_ecs_dashboard</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The processing method when no monitoring data is found. Valid values:</p>
     * <ul>
     * <li>KEEP_LAST_STATE (default): No action is taken.</li>
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
     * <p>The time range during which the alert rule is ineffective.</p>
     * 
     * <strong>example:</strong>
     * <p>00:00-06:00</p>
     */
    @NameInMap("NoEffectiveInterval")
    public String noEffectiveInterval;

    /**
     * <p>The statistical period of the metric. Unit: seconds. The default value is the original reporting period of the metric.</p>
     * <blockquote>
     * <p>For information about how to query the statistical period of a metric, see <a href="https://help.aliyun.com/document_detail/163515.html">Alibaba Cloud service monitoring metrics</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The Prometheus alert configuration.</p>
     * <blockquote>
     * <p>Set this parameter only when you create a Prometheus alert rule for Hybrid Cloud Monitoring.</p>
     * </blockquote>
     */
    @NameInMap("Prometheus")
    public PutResourceMetricRuleRequestPrometheus prometheus;

    /**
     * <p>The resource information, such as <code>[{&quot;instanceId&quot;:&quot;i-uf6j91r34rnwawoo****&quot;}]</code> or <code>[{&quot;userId&quot;:&quot;100931896542****&quot;}]</code>.</p>
     * <p>For information about the supported monitoring dimensions, see <a href="https://help.aliyun.com/document_detail/163515.html">Alibaba Cloud service monitoring metrics</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;instanceId&quot;:&quot;i-uf6j91r34rnwawoo****&quot;}]</p>
     */
    @NameInMap("Resources")
    public String resources;

    /**
     * <p>The ID of the alert rule.</p>
     * <p>You can enter a new alert rule ID or use the ID of an existing alert rule in CloudMonitor. For information about how to query alert rule IDs, see <a href="https://help.aliyun.com/document_detail/114941.html">DescribeMetricRuleList</a>.</p>
     * <blockquote>
     * <p>If you enter a new alert rule ID, a threshold alert rule is created.</p>
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
     * <p>You can enter a new alert rule name or use the name of an existing alert rule in CloudMonitor. For information about how to query alert rule names, see <a href="https://help.aliyun.com/document_detail/114941.html">DescribeMetricRuleList</a>.</p>
     * <blockquote>
     * <p>If you enter a new alert rule name, a threshold alert rule is created.</p>
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
     * <p>The mute period. Unit: seconds. Default value: 86400.</p>
     * <blockquote>
     * <p>The mute period specifies the interval at which an alert notification is re-sent if the alert does not recover to Normal.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>86400</p>
     */
    @NameInMap("SilenceTime")
    public Integer silenceTime;

    /**
     * <p>The callback URL to which a POST request is sent when an alert is triggered.</p>
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
         * <p>Critical级别阈值比较符。取值：</p>
         * <ul>
         * <li>GreaterThanOrEqualToThreshold：大于等于。</li>
         * <li>GreaterThanThreshold：大于。</li>
         * <li>LessThanOrEqualToThreshold：小于等于。</li>
         * <li>LessThanThreshold：小于。</li>
         * <li>NotEqualToThreshold：不等于。</li>
         * <li>EqualToThreshold：等于。</li>
         * <li>GreaterThanYesterday：同比昨天时间上涨。</li>
         * <li>LessThanYesterday：同比昨天时间下降。</li>
         * <li>GreaterThanLastWeek：同比上周同一时间上涨。</li>
         * <li>LessThanLastWeek：同比上周同一时间下降。</li>
         * <li>GreaterThanLastPeriod：环比上周期上涨。</li>
         * <li>LessThanLastPeriod：环比上周期下降。</li>
         * </ul>
         * <blockquote>
         * <p>报警级别Critical（严重）、Warn（警告）或Info（信息）至少设置一个，且该报警级别中的参数Statistics、ComparisonOperator、Threshold和Times必须同时设置。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>GreaterThanOrEqualToThreshold</p>
         */
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        /**
         * <p>Critical级别报警统计方法。</p>
         * <p>该参数的取值由指定云产品的<code>MetricName</code>对应的<code>Statistics</code>列决定，例如：Maximum、Minimum和Average。关于如何获取该参数的取值，请参见<a href="https://help.aliyun.com/document_detail/163515.html">云产品监控项</a>。</p>
         * <blockquote>
         * <p>报警级别Critical（严重）、Warn（警告）或Info（信息）至少设置一个，且该报警级别中的参数Statistics、ComparisonOperator、Threshold和Times必须同时设置。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Average</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>Critical级别报警阈值。</p>
         * <blockquote>
         * <p>报警级别Critical（严重）、Warn（警告）或Info（信息）至少设置一个，且该报警级别中的参数Statistics、ComparisonOperator、Threshold和Times必须同时设置。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("Threshold")
        public String threshold;

        /**
         * <p>Critical级别报警重试次数。</p>
         * <blockquote>
         * <p>报警级别Critical（严重）、Warn（警告）或Info（信息）至少设置一个，且该报警级别中的参数Statistics、ComparisonOperator、Threshold和Times必须同时设置。</p>
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
         * <p>Info级别阈值比较符。取值：</p>
         * <ul>
         * <li>GreaterThanOrEqualToThreshold：大于等于。</li>
         * <li>GreaterThanThreshold：大于。</li>
         * <li>LessThanOrEqualToThreshold：小于等于。</li>
         * <li>LessThanThreshold：小于。</li>
         * <li>NotEqualToThreshold：不等于。</li>
         * <li>EqualToThreshold：等于。</li>
         * <li>GreaterThanYesterday：同比昨天时间上涨。</li>
         * <li>LessThanYesterday：同比昨天时间下降。</li>
         * <li>GreaterThanLastWeek：同比上周同一时间上涨。</li>
         * <li>LessThanLastWeek：同比上周同一时间下降。</li>
         * <li>GreaterThanLastPeriod：环比上周期上涨。</li>
         * <li>LessThanLastPeriod：环比上周期下降。</li>
         * </ul>
         * <blockquote>
         * <p>报警级别Critical（严重）、Warn（警告）或Info（信息）至少设置一个，且该报警级别中的参数Statistics、ComparisonOperator、Threshold和Times必须同时设置。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>GreaterThanOrEqualToThreshold</p>
         */
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        /**
         * <p>Info级别报警统计方法。</p>
         * <p>该参数的取值由指定云产品的<code>MetricName</code>对应的<code>Statistics</code>列决定，例如：Maximum、Minimum和Average。关于如何获取该参数的取值，请参见<a href="https://help.aliyun.com/document_detail/163515.html">云产品监控项</a>。</p>
         * <blockquote>
         * <p>报警级别Critical（严重）、Warn（警告）或Info（信息）至少设置一个，且该报警级别中的参数Statistics、ComparisonOperator、Threshold和Times必须同时设置。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Average</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>Info级别报警阈值。</p>
         * <blockquote>
         * <p>报警级别Critical（严重）、Warn（警告）或Info（信息）至少设置一个，且该报警级别中的参数Statistics、ComparisonOperator、Threshold和Times必须同时设置。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("Threshold")
        public String threshold;

        /**
         * <p>Info级别报警重试次数。</p>
         * <blockquote>
         * <p>报警级别Critical（严重）、Warn（警告）或Info（信息）至少设置一个，且该报警级别中的参数Statistics、ComparisonOperator、Threshold和Times必须同时设置。</p>
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
         * <p>Warn级别阈值比较符。取值：</p>
         * <ul>
         * <li>GreaterThanOrEqualToThreshold：大于等于。</li>
         * <li>GreaterThanThreshold：大于。</li>
         * <li>LessThanOrEqualToThreshold：小于等于。</li>
         * <li>LessThanThreshold：小于。</li>
         * <li>NotEqualToThreshold：不等于。</li>
         * <li>EqualToThreshold：等于。</li>
         * <li>GreaterThanYesterday：同比昨天时间上涨。</li>
         * <li>LessThanYesterday：同比昨天时间下降。</li>
         * <li>GreaterThanLastWeek：同比上周同一时间上涨。</li>
         * <li>LessThanLastWeek：同比上周同一时间下降。</li>
         * <li>GreaterThanLastPeriod：环比上周期上涨。</li>
         * <li>LessThanLastPeriod：环比上周期下降。</li>
         * </ul>
         * <blockquote>
         * <p>报警级别Critical（严重）、Warn（警告）或Info（信息）至少设置一个，且该报警级别中的参数Statistics、ComparisonOperator、Threshold和Times必须同时设置。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>GreaterThanOrEqualToThreshold</p>
         */
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        /**
         * <p>Warn级别报警统计方法。</p>
         * <p>该参数的取值由指定云产品的<code>MetricName</code>对应的<code>Statistics</code>列决定，例如：Maximum、Minimum和Average。关于如何获取该参数的取值，请参见<a href="https://help.aliyun.com/document_detail/163515.html">云产品监控项</a>。</p>
         * <blockquote>
         * <p>报警级别Critical（严重）、Warn（警告）或Info（信息）至少设置一个，且该报警级别中的参数Statistics、ComparisonOperator、Threshold和Times必须同时设置。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Average</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>Warn级别报警阈值。</p>
         * <blockquote>
         * <p>报警级别Critical（严重）、Warn（警告）或Info（信息）至少设置一个，且该报警级别中的参数Statistics、ComparisonOperator、Threshold和Times必须同时设置。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("Threshold")
        public String threshold;

        /**
         * <p>Warn级别报警重试次数。</p>
         * <blockquote>
         * <p>报警级别Critical（严重）、Warn（警告）或Info（信息）至少设置一个，且该报警级别中的参数Statistics、ComparisonOperator、Threshold和Times必须同时设置。</p>
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
         * <li>GreaterThanLastPeriod: greater than the value in the last period.</li>
         * <li>LessThanLastPeriod: less than the value in the last period.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GreaterThanOrEqualToThreshold</p>
         */
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        /**
         * <p>The metric name of the Alibaba Cloud service.</p>
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
         * <li>$Maximum: maximum value.</li>
         * <li>$Minimum: minimum value.</li>
         * <li>$Average: average value.</li>
         * <li>$Availability: active rate (typically used for site monitoring).</li>
         * </ul>
         * <blockquote>
         * <p><code>$</code> is the unified prefix for metrics. For information about supported Alibaba Cloud services, see <a href="https://help.aliyun.com/document_detail/163515.html">Alibaba Cloud service monitoring metrics</a>.</p>
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
         * <p>The list of alert conditions created in standard mode.</p>
         */
        @NameInMap("ExpressionList")
        public java.util.List<PutResourceMetricRuleRequestCompositeExpressionExpressionList> expressionList;

        /**
         * <p>The relationship between multi-metric alert conditions. Valid values: </p>
         * <ul>
         * <li><p><code>&amp;&amp;</code>: An alert is triggered only when all metrics meet the alert conditions. An alert is triggered only when all expressions in ExpressionList evaluate to <code>true</code>.</p>
         * </li>
         * <li><p><code>||</code>: An alert is triggered when any metric meets the alert conditions.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>||</p>
         */
        @NameInMap("ExpressionListJoin")
        public String expressionListJoin;

        /**
         * <p>The alert condition created by using an expression. The following scenarios are supported:</p>
         * <ul>
         * <li>Set an alert blacklist for specific resources. For example, <code>$instanceId != \\&quot;i-io8kfvcpp7x5****\\&quot; ``&amp;&amp;`` $Average &gt; 50</code> specifies that no alert is triggered for instance <code>i-io8kfvcpp7x5****</code> even if its <code>Average</code> exceeds 50.</li>
         * <li>Set a special alert threshold for a specific instance in the rule. For example, <code>$Average &gt; ($instanceId == \\&quot;i-io8kfvcpp7x5****\\&quot;? 80: 50)</code> specifies that an alert is triggered for instance <code>i-io8kfvcpp7x5****</code> only when its <code>Average</code> exceeds 80, while an alert is triggered for other instances when their <code>Average</code> exceeds 50.</li>
         * <li>Limit the number of instances that exceed the threshold. For example, <code>count($Average &gt; 20) &gt; 3</code> specifies that an alert is triggered only when more than three instances have an <code>Average</code> greater than 20.</li>
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
         * <li>INFO: information.</li>
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
         * <p>The label value supports template parameters. Template parameters are replaced with actual label values.</p>
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
         * <p>The annotations for Prometheus alerting. The annotation keys and values are rendered to help you understand the metric or alert rule.</p>
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
         * <li>INFO: information.</li>
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
         * <p>The data obtained by the PromQL query statement is the alert data. Include the alert threshold in this statement.</p>
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
