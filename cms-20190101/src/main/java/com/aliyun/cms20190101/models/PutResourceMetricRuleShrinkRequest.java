// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutResourceMetricRuleShrinkRequest extends TeaModel {
    @NameInMap("Escalations")
    public PutResourceMetricRuleShrinkRequestEscalations escalations;

    /**
     * <p>The alert conditions for multiple metrics.</p>
     * <blockquote>
     * <p>Single-metric and multi-metric alert conditions are mutually exclusive and cannot be set at the same time.</p>
     * </blockquote>
     */
    @NameInMap("CompositeExpression")
    public String compositeExpressionShrink;

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
    public java.util.List<PutResourceMetricRuleShrinkRequestLabels> labels;

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
    public String prometheusShrink;

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
         * <p>The label value supports template parameters. Template parameters are replaced with actual label values.</p>
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
