// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutResourceMetricRuleShrinkRequest extends TeaModel {
    @NameInMap("Escalations")
    public PutResourceMetricRuleShrinkRequestEscalations escalations;

    /**
     * <p>The trigger conditions for multiple metrics.</p>
     * <br>
     * <p>>  The trigger conditions for a single metric and multiple metrics are mutually exclusive. You cannot specify trigger conditions for a single metric and multiple metrics at the same time.</p>
     */
    @NameInMap("CompositeExpression")
    public String compositeExpressionShrink;

    /**
     * <p>The alert contact group. The alert notifications are sent to the contacts that belong to the alert contact group.</p>
     * <br>
     * <p>>  An alert contact group can contain one or more alert contacts. For information about how to create alert contacts and alert contact groups, see [PutContact](~~114923~~) and [PutContactGroup](~~114929~~).</p>
     */
    @NameInMap("ContactGroups")
    public String contactGroups;

    /**
     * <p>The time period during which the alert rule is effective.</p>
     */
    @NameInMap("EffectiveInterval")
    public String effectiveInterval;

    /**
     * <p>The subject of the alert notification email.</p>
     */
    @NameInMap("EmailSubject")
    public String emailSubject;

    /**
     * <p>The interval at which the alert is triggered. Unit: seconds.</p>
     * <br>
     * <p>>  For information about how to query the statistical period of a metric, see [Appendix 1: Metrics](~~163515~~).</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Labels")
    public java.util.List<PutResourceMetricRuleShrinkRequestLabels> labels;

    /**
     * <p>The name of the metric. For information about how to query the name of a metric, see [Appendix 1: Metrics](~~163515~~).</p>
     * <br>
     * <p>>  If you create a Prometheus alert rule for Hybrid Cloud Monitoring, you must set this parameter to the name of the namespace. For information about how to obtain the name of a namespace, see [DescribeHybridMonitorNamespaceList](~~428880~~).</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>The namespace of the cloud service. For information about how to query the namespace of a cloud service, see [Appendix 1: Metrics](~~163515~~).</p>
     * <br>
     * <p>>  If you create a Prometheus alert rule for Hybrid Cloud Monitoring, you must set this parameter to `acs_prometheus`.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The processing method of alerts when no monitoring data is found. Valid values:</p>
     * <br>
     * <p>*   KEEP_LAST_STATE (default value): No operation is performed.</p>
     * <p>*   INSUFFICIENT_DATA: An alert whose content is "Insufficient data" is triggered.</p>
     * <p>*   OK: The status is considered normal.</p>
     */
    @NameInMap("NoDataPolicy")
    public String noDataPolicy;

    /**
     * <p>The time period during which the alert rule is ineffective.</p>
     */
    @NameInMap("NoEffectiveInterval")
    public String noEffectiveInterval;

    /**
     * <p>The statistical period of the metric. Unit: seconds. The default value is the interval at which the monitoring data of the metric is collected.</p>
     * <br>
     * <p>>  For information about how to query the statistical period of a metric, see [Appendix 1: Metrics](~~163515~~).</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The Prometheus alert rule.</p>
     * <br>
     * <p>>  This parameter is required only when you create a Prometheus alert rule for Hybrid Cloud Monitoring.</p>
     */
    @NameInMap("Prometheus")
    public String prometheusShrink;

    /**
     * <p>The information about the resource. Examples: `[{"instanceId":"i-uf6j91r34rnwawoo****"}]` and `[{"userId":"100931896542****"}]`.</p>
     * <br>
     * <p>For information about the supported dimensions that are used to query resources, see [Appendix 1: Metrics](~~163515~~).</p>
     */
    @NameInMap("Resources")
    public String resources;

    /**
     * <p>The ID of the alert rule.</p>
     * <br>
     * <p>You can specify a new ID or the ID of an existing alert rule. For information about how to query the ID of an alert rule, see [DescribeMetricRuleList](~~114941~~).</p>
     * <br>
     * <p>>  If you specify a new ID, a threshold-triggered alert rule is created.</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    /**
     * <p>The name of the alert rule.</p>
     * <br>
     * <p>You can specify a new name or the name of an existing alert rule. For information about how to query the name of an alert rule, see [DescribeMetricRuleList](~~114941~~).</p>
     * <br>
     * <p>>  If you specify a new name, a threshold-triggered alert rule is created.</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The mute period during which new alerts are not sent even if the trigger conditions are met. Unit: seconds. Default value: 86400.</p>
     * <br>
     * <p>>  If an alert is not cleared within the mute period, a new alert notification is sent when the mute period ends.</p>
     */
    @NameInMap("SilenceTime")
    public Integer silenceTime;

    /**
     * <p>The callback URL to which a POST request is sent when an alert is triggered based on the alert rule.</p>
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
         * <p>The operator that is used to compare the metric value with the threshold. Valid values:</p>
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
         * <br>
         * <p>>  You must select at least one of the Critical, Warn, and Info alert levels and specify the Statistics, ComparisonOperator, Threshold, and Times parameters for the selected alert level.</p>
         */
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        /**
         * <p>The statistical methods for Critical-level alerts. Valid values:</p>
         * <br>
         * <p>*   Maximum: the maximum value</p>
         * <p>*   Minimum: the minimum value</p>
         * <p>*   Average: the average value</p>
         * <p>*   Availability: the availability rate</p>
         * <br>
         * <p>>  You must select at least one of the Critical, Warn, and Info alert levels and specify the Statistics, ComparisonOperator, Threshold, and Times parameters for the selected alert level.</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>The threshold for Critical-level alerts.</p>
         * <br>
         * <p>>  You must select at least one of the Critical, Warn, and Info alert levels and specify the Statistics, ComparisonOperator, Threshold, and Times parameters for the selected alert level.</p>
         */
        @NameInMap("Threshold")
        public String threshold;

        /**
         * <p>The consecutive number of times for which the metric value meets the trigger condition before a Critical-level alert is triggered.</p>
         * <br>
         * <p>>  You must select at least one of the Critical, Warn, and Info alert levels and specify the Statistics, ComparisonOperator, Threshold, and Times parameters for the selected alert level.</p>
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
         * <p>The operator that is used to compare the metric value with the threshold. Valid values:</p>
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
         * <br>
         * <p>>  You must select at least one of the Critical, Warn, and Info alert levels and specify the Statistics, ComparisonOperator, Threshold, and Times parameters for the selected alert level.</p>
         */
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        /**
         * <p>The statistical methods for Info-level alerts. Valid values:</p>
         * <br>
         * <p>*   Maximum: the maximum value</p>
         * <p>*   Minimum: the minimum value</p>
         * <p>*   Average: the average value</p>
         * <p>*   Availability: the availability rate</p>
         * <br>
         * <p>>  You must select at least one of the Critical, Warn, and Info alert levels and specify the Statistics, ComparisonOperator, Threshold, and Times parameters for the selected alert level.</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>The threshold for Info-level alerts.</p>
         * <br>
         * <p>>  You must select at least one of the Critical, Warn, and Info alert levels and specify the Statistics, ComparisonOperator, Threshold, and Times parameters for the selected alert level.</p>
         */
        @NameInMap("Threshold")
        public String threshold;

        /**
         * <p>The consecutive number of times for which the metric value meets the trigger condition before an Info-level alert is triggered.</p>
         * <br>
         * <p>>  You must select at least one of the Critical, Warn, and Info alert levels and specify the Statistics, ComparisonOperator, Threshold, and Times parameters for the selected alert level.</p>
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
         * <p>The operator that is used to compare the metric value with the threshold. Valid values:</p>
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
         * <br>
         * <p>>  You must select at least one of the Critical, Warn, and Info alert levels and specify the Statistics, ComparisonOperator, Threshold, and Times parameters for the selected alert level.</p>
         */
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        /**
         * <p>The statistical methods for Warn-level alerts. Valid values:</p>
         * <br>
         * <p>*   Maximum: the maximum value</p>
         * <p>*   Minimum: the minimum value</p>
         * <p>*   Average: the average value</p>
         * <p>*   Availability: the availability rate</p>
         * <br>
         * <p>>  You must select at least one of the Critical, Warn, and Info alert levels and specify the Statistics, ComparisonOperator, Threshold, and Times parameters for the selected alert level.</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>The threshold for Warn-level alerts.</p>
         * <br>
         * <p>>  You must select at least one of the Critical, Warn, and Info alert levels and specify the Statistics, ComparisonOperator, Threshold, and Times parameters for the selected alert level.</p>
         */
        @NameInMap("Threshold")
        public String threshold;

        /**
         * <p>The consecutive number of times for which the metric value meets the trigger condition before a Warn-level alert is triggered.</p>
         * <br>
         * <p>>  You must select at least one of the Critical, Warn, and Info alert levels and specify the Statistics, ComparisonOperator, Threshold, and Times parameters for the selected alert level.</p>
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
         * <p>The key of the tag.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * <br>
         * <p>>  You can use a template parameter to specify a tag value. CloudMonitor replaces the value of the template parameter with an actual tag value.</p>
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
