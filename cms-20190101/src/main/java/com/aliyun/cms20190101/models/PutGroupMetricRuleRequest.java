// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutGroupMetricRuleRequest extends TeaModel {
    @NameInMap("Escalations")
    public PutGroupMetricRuleRequestEscalations escalations;

    /**
     * <p>The abbreviation of the cloud service name.</p>
     * <br>
     * <p>For more information about how to obtain the abbreviation of a cloud service name, see `metricCategory` in the response parameter `Labels` of the [DescribeProjectMeta](~~114916~~) operation.</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The alert contact group.</p>
     */
    @NameInMap("ContactGroups")
    public String contactGroups;

    /**
     * <p>The first-level dimension of the alert rule in the application group.</p>
     * <br>
     * <p>Set the value to a set of key-value pairs, for example, `userId:120886317861****` or `instanceId:i-m5e1qg6uo38rztr4****`.</p>
     */
    @NameInMap("Dimensions")
    public String dimensions;

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
     * <p>The second-level or third-level dimension of the alert rule in the application group.</p>
     * <br>
     * <p>Set the value to a set of key-value pairs, for example, `port:80` or `/dev/xvda:d-m5e6yphgzn3aprwu****`.</p>
     * <br>
     * <p>If the first-level dimension of the alert rule is `instanceId:i-m5e1qg6uo38rztr4****`, its second-level dimension is the `/dev/xvda:d-m5e6yphgzn3aprwu****` disk in the instance.</p>
     */
    @NameInMap("ExtraDimensionJson")
    public String extraDimensionJson;

    /**
     * <p>The application group ID.</p>
     * <br>
     * <p>For more information about how to obtain the ID of an application group, see [DescribeMonitorGroups](~~115032~~).</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The interval at which CloudMonitor checks whether the alert rule is triggered. Unit: seconds.</p>
     * <br>
     * <p>>  We recommend that you set the interval to the data aggregation period. If the interval is shorter than the data aggregation period, alerts cannot be triggered due to insufficient data.</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>The tags of the alert rule.</p>
     * <br>
     * <p>The specified tag is contained in alert notifications.</p>
     */
    @NameInMap("Labels")
    public java.util.List<PutGroupMetricRuleRequestLabels> labels;

    /**
     * <p>The metric name.</p>
     * <br>
     * <p>For more information about how to obtain the name of a metric, see [DescribeMetricMetaList](~~98846~~) or [Appendix 1: Metrics](~~163515~~).</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>The namespace of the cloud service.</p>
     * <br>
     * <p>For more information about how to obtain the namespace of a cloud service, see [DescribeMetricMetaList](~~98846~~) or [Appendix 1: Metrics](~~163515~~).</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The method that is used to handle alerts when no monitoring data is found. Valid values:</p>
     * <br>
     * <p>*   KEEP_LAST_STATE (default): No operation is performed.</p>
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
     * <p>The aggregation period of the metric data.</p>
     * <br>
     * <p>Set the `Period` parameter to an integral multiple of 60. Unit: seconds. Default value: 300.</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The ID of the alert rule.</p>
     * <br>
     * <p>*   When you create an alert rule for the application group, enter the ID of the alert rule.</p>
     * <p>*   When you modify a specified alert rule in the application group, you must obtain the ID of the alert rule. For information about how to obtain the ID of an alert rule, see [DescribeMetricRuleList](~~114941~~).</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    /**
     * <p>The name of the alert rule.</p>
     * <br>
     * <p>*   When you create an alert rule for the application group, enter the name of the alert rule.</p>
     * <p>*   When you modify a specified alert rule in the application group, you must obtain the name of the alert rule. For more information about how to obtain the name of an alert rule, see [DescribeMetricRuleList](~~114941~~).</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The mute period during which new alerts are not sent even if the trigger conditions are met.</p>
     * <br>
     * <p>Unit: seconds. Default value: 86400.</p>
     */
    @NameInMap("SilenceTime")
    public Integer silenceTime;

    /**
     * <p>The callback URL.</p>
     * <br>
     * <p>The callback URL must be accessible over the Internet. CloudMonitor sends a POST request to push an alert notification to the callback URL that you specify. Only HTTP requests are supported.</p>
     */
    @NameInMap("Webhook")
    public String webhook;

    public static PutGroupMetricRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        PutGroupMetricRuleRequest self = new PutGroupMetricRuleRequest();
        return TeaModel.build(map, self);
    }

    public PutGroupMetricRuleRequest setEscalations(PutGroupMetricRuleRequestEscalations escalations) {
        this.escalations = escalations;
        return this;
    }
    public PutGroupMetricRuleRequestEscalations getEscalations() {
        return this.escalations;
    }

    public PutGroupMetricRuleRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public PutGroupMetricRuleRequest setContactGroups(String contactGroups) {
        this.contactGroups = contactGroups;
        return this;
    }
    public String getContactGroups() {
        return this.contactGroups;
    }

    public PutGroupMetricRuleRequest setDimensions(String dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public String getDimensions() {
        return this.dimensions;
    }

    public PutGroupMetricRuleRequest setEffectiveInterval(String effectiveInterval) {
        this.effectiveInterval = effectiveInterval;
        return this;
    }
    public String getEffectiveInterval() {
        return this.effectiveInterval;
    }

    public PutGroupMetricRuleRequest setEmailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
        return this;
    }
    public String getEmailSubject() {
        return this.emailSubject;
    }

    public PutGroupMetricRuleRequest setExtraDimensionJson(String extraDimensionJson) {
        this.extraDimensionJson = extraDimensionJson;
        return this;
    }
    public String getExtraDimensionJson() {
        return this.extraDimensionJson;
    }

    public PutGroupMetricRuleRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public PutGroupMetricRuleRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public PutGroupMetricRuleRequest setLabels(java.util.List<PutGroupMetricRuleRequestLabels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<PutGroupMetricRuleRequestLabels> getLabels() {
        return this.labels;
    }

    public PutGroupMetricRuleRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public PutGroupMetricRuleRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public PutGroupMetricRuleRequest setNoDataPolicy(String noDataPolicy) {
        this.noDataPolicy = noDataPolicy;
        return this;
    }
    public String getNoDataPolicy() {
        return this.noDataPolicy;
    }

    public PutGroupMetricRuleRequest setNoEffectiveInterval(String noEffectiveInterval) {
        this.noEffectiveInterval = noEffectiveInterval;
        return this;
    }
    public String getNoEffectiveInterval() {
        return this.noEffectiveInterval;
    }

    public PutGroupMetricRuleRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public PutGroupMetricRuleRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public PutGroupMetricRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public PutGroupMetricRuleRequest setSilenceTime(Integer silenceTime) {
        this.silenceTime = silenceTime;
        return this;
    }
    public Integer getSilenceTime() {
        return this.silenceTime;
    }

    public PutGroupMetricRuleRequest setWebhook(String webhook) {
        this.webhook = webhook;
        return this;
    }
    public String getWebhook() {
        return this.webhook;
    }

    public static class PutGroupMetricRuleRequestEscalationsCritical extends TeaModel {
        /**
         * <p>The operator that is used to compare the metric value with the threshold for Critical-level alerts. Valid values:</p>
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
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        /**
         * <p>The statistical methods for Critical-level alerts. Separate multiple statistical methods with commas (,).</p>
         * <br>
         * <p>The value of this parameter is determined by the `Statistics` column corresponding to the `MetricName` parameter of the specified cloud service. The value of this parameter can be Maximum, Minimum, or Average. For more information about how to obtain the value of this parameter, see [Appendix 1: Metrics](~~163515~~).</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>The threshold for Critical-level alerts.</p>
         */
        @NameInMap("Threshold")
        public String threshold;

        /**
         * <p>The consecutive number of times for which the metric value meets the alert condition before a Critical-level alert is triggered.</p>
         */
        @NameInMap("Times")
        public Integer times;

        public static PutGroupMetricRuleRequestEscalationsCritical build(java.util.Map<String, ?> map) throws Exception {
            PutGroupMetricRuleRequestEscalationsCritical self = new PutGroupMetricRuleRequestEscalationsCritical();
            return TeaModel.build(map, self);
        }

        public PutGroupMetricRuleRequestEscalationsCritical setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public PutGroupMetricRuleRequestEscalationsCritical setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public PutGroupMetricRuleRequestEscalationsCritical setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public PutGroupMetricRuleRequestEscalationsCritical setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class PutGroupMetricRuleRequestEscalationsInfo extends TeaModel {
        /**
         * <p>The operator that is used to compare the metric value with the threshold for Info-level alerts. Valid values:</p>
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
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        /**
         * <p>The statistical methods for Info-level alerts. Separate multiple statistical methods with commas (,).</p>
         * <br>
         * <p>The value of this parameter is determined by the `Statistics` column corresponding to the `MetricName` parameter of the specified cloud service. The value of this parameter can be Maximum, Minimum, or Average. For more information about how to obtain the value of this parameter, see [Appendix 1: Metrics](~~163515~~).</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>The threshold for Info-level alerts.</p>
         */
        @NameInMap("Threshold")
        public String threshold;

        /**
         * <p>The consecutive number of times for which the metric value meets the alert condition before an Info-level alert is triggered.</p>
         */
        @NameInMap("Times")
        public Integer times;

        public static PutGroupMetricRuleRequestEscalationsInfo build(java.util.Map<String, ?> map) throws Exception {
            PutGroupMetricRuleRequestEscalationsInfo self = new PutGroupMetricRuleRequestEscalationsInfo();
            return TeaModel.build(map, self);
        }

        public PutGroupMetricRuleRequestEscalationsInfo setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public PutGroupMetricRuleRequestEscalationsInfo setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public PutGroupMetricRuleRequestEscalationsInfo setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public PutGroupMetricRuleRequestEscalationsInfo setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class PutGroupMetricRuleRequestEscalationsWarn extends TeaModel {
        /**
         * <p>The operator that is used to compare the metric value with the threshold for Warn-level alerts. Valid values:</p>
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
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        /**
         * <p>The statistical methods for Warn-level alerts. Separate multiple statistical methods with commas (,).</p>
         * <br>
         * <p>The value of this parameter is determined by the `Statistics` column corresponding to the `MetricName` parameter of the specified cloud service. The value of this parameter can be Maximum, Minimum, or Average. For more information about how to obtain the value of this parameter, see [Appendix 1: Metrics](~~163515~~).</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>The threshold for Warn-level alerts.</p>
         */
        @NameInMap("Threshold")
        public String threshold;

        /**
         * <p>The consecutive number of times for which the metric value meets the alert condition before a Warn-level alert is triggered.</p>
         */
        @NameInMap("Times")
        public Integer times;

        public static PutGroupMetricRuleRequestEscalationsWarn build(java.util.Map<String, ?> map) throws Exception {
            PutGroupMetricRuleRequestEscalationsWarn self = new PutGroupMetricRuleRequestEscalationsWarn();
            return TeaModel.build(map, self);
        }

        public PutGroupMetricRuleRequestEscalationsWarn setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public PutGroupMetricRuleRequestEscalationsWarn setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public PutGroupMetricRuleRequestEscalationsWarn setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public PutGroupMetricRuleRequestEscalationsWarn setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class PutGroupMetricRuleRequestEscalations extends TeaModel {
        @NameInMap("Critical")
        public PutGroupMetricRuleRequestEscalationsCritical critical;

        @NameInMap("Info")
        public PutGroupMetricRuleRequestEscalationsInfo info;

        @NameInMap("Warn")
        public PutGroupMetricRuleRequestEscalationsWarn warn;

        public static PutGroupMetricRuleRequestEscalations build(java.util.Map<String, ?> map) throws Exception {
            PutGroupMetricRuleRequestEscalations self = new PutGroupMetricRuleRequestEscalations();
            return TeaModel.build(map, self);
        }

        public PutGroupMetricRuleRequestEscalations setCritical(PutGroupMetricRuleRequestEscalationsCritical critical) {
            this.critical = critical;
            return this;
        }
        public PutGroupMetricRuleRequestEscalationsCritical getCritical() {
            return this.critical;
        }

        public PutGroupMetricRuleRequestEscalations setInfo(PutGroupMetricRuleRequestEscalationsInfo info) {
            this.info = info;
            return this;
        }
        public PutGroupMetricRuleRequestEscalationsInfo getInfo() {
            return this.info;
        }

        public PutGroupMetricRuleRequestEscalations setWarn(PutGroupMetricRuleRequestEscalationsWarn warn) {
            this.warn = warn;
            return this;
        }
        public PutGroupMetricRuleRequestEscalationsWarn getWarn() {
            return this.warn;
        }

    }

    public static class PutGroupMetricRuleRequestLabels extends TeaModel {
        /**
         * <p>The tag key of the alert rule.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the alert rule.</p>
         */
        @NameInMap("Value")
        public String value;

        public static PutGroupMetricRuleRequestLabels build(java.util.Map<String, ?> map) throws Exception {
            PutGroupMetricRuleRequestLabels self = new PutGroupMetricRuleRequestLabels();
            return TeaModel.build(map, self);
        }

        public PutGroupMetricRuleRequestLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public PutGroupMetricRuleRequestLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
