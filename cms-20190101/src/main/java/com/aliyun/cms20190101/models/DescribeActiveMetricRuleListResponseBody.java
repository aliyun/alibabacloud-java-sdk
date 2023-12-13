// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeActiveMetricRuleListResponseBody extends TeaModel {
    /**
     * <p>The details of the alert rules.</p>
     */
    @NameInMap("AlertList")
    public DescribeActiveMetricRuleListResponseBodyAlertList alertList;

    /**
     * <p>The HTTP status code.</p>
     * <br>
     * <p>>  The status code 200 indicates that the call was successful.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The details of the alert rules.</p>
     */
    @NameInMap("Datapoints")
    public DescribeActiveMetricRuleListResponseBodyDatapoints datapoints;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <br>
     * <p>*   true: The call was successful.</p>
     * <p>*   false: The call failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeActiveMetricRuleListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeActiveMetricRuleListResponseBody self = new DescribeActiveMetricRuleListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeActiveMetricRuleListResponseBody setAlertList(DescribeActiveMetricRuleListResponseBodyAlertList alertList) {
        this.alertList = alertList;
        return this;
    }
    public DescribeActiveMetricRuleListResponseBodyAlertList getAlertList() {
        return this.alertList;
    }

    public DescribeActiveMetricRuleListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeActiveMetricRuleListResponseBody setDatapoints(DescribeActiveMetricRuleListResponseBodyDatapoints datapoints) {
        this.datapoints = datapoints;
        return this;
    }
    public DescribeActiveMetricRuleListResponseBodyDatapoints getDatapoints() {
        return this.datapoints;
    }

    public DescribeActiveMetricRuleListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeActiveMetricRuleListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeActiveMetricRuleListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalationsCritical extends TeaModel {
        /**
         * <p>The comparison operator of the threshold for critical-level alerts. Valid values:</p>
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
         * <p>The statistical aggregation method for critical-level alerts.</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>The threshold for critical-level alerts.</p>
         */
        @NameInMap("Threshold")
        public String threshold;

        /**
         * <p>The consecutive number of times for which the metric value meets the alert condition before a Critical-level alert is triggered.</p>
         */
        @NameInMap("Times")
        public String times;

        public static DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalationsCritical build(java.util.Map<String, ?> map) throws Exception {
            DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalationsCritical self = new DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalationsCritical();
            return TeaModel.build(map, self);
        }

        public DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalationsCritical setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalationsCritical setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalationsCritical setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalationsCritical setTimes(String times) {
            this.times = times;
            return this;
        }
        public String getTimes() {
            return this.times;
        }

    }

    public static class DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalationsInfo extends TeaModel {
        /**
         * <p>The comparison operator of the threshold for info-level alerts. Valid values:</p>
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
         * <p>The statistical aggregation method for info-level alerts.</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>The threshold for info-level alerts.</p>
         */
        @NameInMap("Threshold")
        public String threshold;

        /**
         * <p>The consecutive number of times for which the metric value meets the alert condition before an info-level alert is triggered.</p>
         */
        @NameInMap("Times")
        public String times;

        public static DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalationsInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalationsInfo self = new DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalationsInfo();
            return TeaModel.build(map, self);
        }

        public DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalationsInfo setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalationsInfo setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalationsInfo setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalationsInfo setTimes(String times) {
            this.times = times;
            return this;
        }
        public String getTimes() {
            return this.times;
        }

    }

    public static class DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalationsWarn extends TeaModel {
        /**
         * <p>The comparison operator of the threshold for critical-level alerts. Valid values:</p>
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
         * <p>The statistical aggregation method for warn-level alerts.</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>The threshold of warn-level alerts.</p>
         */
        @NameInMap("Threshold")
        public String threshold;

        /**
         * <p>The consecutive number of times for which the metric value meets the alert condition before a warn-level alert is triggered.</p>
         */
        @NameInMap("Times")
        public String times;

        public static DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalationsWarn build(java.util.Map<String, ?> map) throws Exception {
            DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalationsWarn self = new DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalationsWarn();
            return TeaModel.build(map, self);
        }

        public DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalationsWarn setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalationsWarn setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalationsWarn setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalationsWarn setTimes(String times) {
            this.times = times;
            return this;
        }
        public String getTimes() {
            return this.times;
        }

    }

    public static class DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalations extends TeaModel {
        /**
         * <p>The condition for triggering critical-level alerts.</p>
         */
        @NameInMap("Critical")
        public DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalationsCritical critical;

        /**
         * <p>The condition for triggering info-level alerts.</p>
         */
        @NameInMap("Info")
        public DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalationsInfo info;

        /**
         * <p>The condition for triggering warn-level alerts.</p>
         */
        @NameInMap("Warn")
        public DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalationsWarn warn;

        public static DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalations build(java.util.Map<String, ?> map) throws Exception {
            DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalations self = new DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalations();
            return TeaModel.build(map, self);
        }

        public DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalations setCritical(DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalationsCritical critical) {
            this.critical = critical;
            return this;
        }
        public DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalationsCritical getCritical() {
            return this.critical;
        }

        public DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalations setInfo(DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalationsInfo info) {
            this.info = info;
            return this;
        }
        public DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalationsInfo getInfo() {
            return this.info;
        }

        public DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalations setWarn(DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalationsWarn warn) {
            this.warn = warn;
            return this;
        }
        public DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalationsWarn getWarn() {
            return this.warn;
        }

    }

    public static class DescribeActiveMetricRuleListResponseBodyAlertListAlert extends TeaModel {
        /**
         * <p>The status of the alert rule. Valid values:</p>
         * <br>
         * <p>*   OK: The alert rule has no active alert.</p>
         * <p>*   ALARM: The alert rule has at least one active alert.</p>
         * <p>*   INSUFFICIENT_DATA: The alert rule has no data.</p>
         */
        @NameInMap("AlertState")
        public String alertState;

        /**
         * <p>The alert group that receives alert notifications.</p>
         */
        @NameInMap("ContactGroups")
        public String contactGroups;

        /**
         * <p>The dimensions that specify the resources for which you want to query monitoring data.</p>
         * <br>
         * <p>The value is a collection of key-value pairs. A typical key-value pair is `instanceId:XXXXXX`.</p>
         * <br>
         * <p>The key and value must be 1 to 64 bytes in length, respectively. Excessive bytes are truncated from the string.</p>
         * <br>
         * <p>The key and value can contain letters, digits, periods (.), hyphens (-), underscores (\_), forward slashes (/), and backslashes (\\).</p>
         * <br>
         * <p>>  Dimensions must be organized in a JSON string and follow the required order.</p>
         */
        @NameInMap("Dimensions")
        public String dimensions;

        /**
         * <p>The time period during which the alert rule is effective.</p>
         */
        @NameInMap("EffectiveInterval")
        public String effectiveInterval;

        /**
         * <p>Indicates whether the alert rule is enabled. Valid values:</p>
         * <br>
         * <p>*   true: The alert rule is enabled.</p>
         * <p>*   false: The alert rule is disabled.</p>
         */
        @NameInMap("EnableState")
        public Boolean enableState;

        /**
         * <p>The conditions for triggering different levels of alerts.</p>
         */
        @NameInMap("Escalations")
        public DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalations escalations;

        @NameInMap("MailSubject")
        public String mailSubject;

        /**
         * <p>The name of the metric.</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The namespace of the service. For more information, see [Appendix 1: Metrics](~~163515~~).</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The time period during which the alert rule is ineffective.</p>
         */
        @NameInMap("NoEffectiveInterval")
        public String noEffectiveInterval;

        /**
         * <p>The aggregation period of the monitoring data. Unit: seconds. The default value is the minimum aggregation period, indicating that the metric is polled at the highest frequency. Typically, you do not need to specify the minimum aggregation period.</p>
         */
        @NameInMap("Period")
        public String period;

        /**
         * <p>The resources that are associated with the alert rule. A one-click alert rule is associated with all resources. The return value is fixed.</p>
         */
        @NameInMap("Resources")
        public String resources;

        /**
         * <p>The ID of the alert rule.</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The name of the alert rule.</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The mute period during which new alerts are not sent even if the trigger conditions are met. Unit: seconds. Default value: 86400.</p>
         */
        @NameInMap("SilenceTime")
        public String silenceTime;

        /**
         * <p>The callback URL.</p>
         */
        @NameInMap("Webhook")
        public String webhook;

        public static DescribeActiveMetricRuleListResponseBodyAlertListAlert build(java.util.Map<String, ?> map) throws Exception {
            DescribeActiveMetricRuleListResponseBodyAlertListAlert self = new DescribeActiveMetricRuleListResponseBodyAlertListAlert();
            return TeaModel.build(map, self);
        }

        public DescribeActiveMetricRuleListResponseBodyAlertListAlert setAlertState(String alertState) {
            this.alertState = alertState;
            return this;
        }
        public String getAlertState() {
            return this.alertState;
        }

        public DescribeActiveMetricRuleListResponseBodyAlertListAlert setContactGroups(String contactGroups) {
            this.contactGroups = contactGroups;
            return this;
        }
        public String getContactGroups() {
            return this.contactGroups;
        }

        public DescribeActiveMetricRuleListResponseBodyAlertListAlert setDimensions(String dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public String getDimensions() {
            return this.dimensions;
        }

        public DescribeActiveMetricRuleListResponseBodyAlertListAlert setEffectiveInterval(String effectiveInterval) {
            this.effectiveInterval = effectiveInterval;
            return this;
        }
        public String getEffectiveInterval() {
            return this.effectiveInterval;
        }

        public DescribeActiveMetricRuleListResponseBodyAlertListAlert setEnableState(Boolean enableState) {
            this.enableState = enableState;
            return this;
        }
        public Boolean getEnableState() {
            return this.enableState;
        }

        public DescribeActiveMetricRuleListResponseBodyAlertListAlert setEscalations(DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalations escalations) {
            this.escalations = escalations;
            return this;
        }
        public DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalations getEscalations() {
            return this.escalations;
        }

        public DescribeActiveMetricRuleListResponseBodyAlertListAlert setMailSubject(String mailSubject) {
            this.mailSubject = mailSubject;
            return this;
        }
        public String getMailSubject() {
            return this.mailSubject;
        }

        public DescribeActiveMetricRuleListResponseBodyAlertListAlert setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeActiveMetricRuleListResponseBodyAlertListAlert setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeActiveMetricRuleListResponseBodyAlertListAlert setNoEffectiveInterval(String noEffectiveInterval) {
            this.noEffectiveInterval = noEffectiveInterval;
            return this;
        }
        public String getNoEffectiveInterval() {
            return this.noEffectiveInterval;
        }

        public DescribeActiveMetricRuleListResponseBodyAlertListAlert setPeriod(String period) {
            this.period = period;
            return this;
        }
        public String getPeriod() {
            return this.period;
        }

        public DescribeActiveMetricRuleListResponseBodyAlertListAlert setResources(String resources) {
            this.resources = resources;
            return this;
        }
        public String getResources() {
            return this.resources;
        }

        public DescribeActiveMetricRuleListResponseBodyAlertListAlert setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeActiveMetricRuleListResponseBodyAlertListAlert setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeActiveMetricRuleListResponseBodyAlertListAlert setSilenceTime(String silenceTime) {
            this.silenceTime = silenceTime;
            return this;
        }
        public String getSilenceTime() {
            return this.silenceTime;
        }

        public DescribeActiveMetricRuleListResponseBodyAlertListAlert setWebhook(String webhook) {
            this.webhook = webhook;
            return this;
        }
        public String getWebhook() {
            return this.webhook;
        }

    }

    public static class DescribeActiveMetricRuleListResponseBodyAlertList extends TeaModel {
        @NameInMap("Alert")
        public java.util.List<DescribeActiveMetricRuleListResponseBodyAlertListAlert> alert;

        public static DescribeActiveMetricRuleListResponseBodyAlertList build(java.util.Map<String, ?> map) throws Exception {
            DescribeActiveMetricRuleListResponseBodyAlertList self = new DescribeActiveMetricRuleListResponseBodyAlertList();
            return TeaModel.build(map, self);
        }

        public DescribeActiveMetricRuleListResponseBodyAlertList setAlert(java.util.List<DescribeActiveMetricRuleListResponseBodyAlertListAlert> alert) {
            this.alert = alert;
            return this;
        }
        public java.util.List<DescribeActiveMetricRuleListResponseBodyAlertListAlert> getAlert() {
            return this.alert;
        }

    }

    public static class DescribeActiveMetricRuleListResponseBodyDatapointsAlarm extends TeaModel {
        /**
         * <p>The comparison operator that is used in the alert rule. Valid values:</p>
         * <br>
         * <p>*   `>`</p>
         * <p>*   `<`</p>
         * <p>*   `>=`</p>
         * <p>*   `<=`</p>
         * <p>*   `=`</p>
         * <p>*   `=`</p>
         */
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        /**
         * <p>The alert group that receives alert notifications.</p>
         */
        @NameInMap("ContactGroups")
        public String contactGroups;

        /**
         * <p>Indicates whether the alert rule is enabled. Valid values:</p>
         * <br>
         * <p>*   true: The alert rule is enabled.</p>
         * <p>*   false: The alert rule is disabled.</p>
         */
        @NameInMap("Enable")
        public String enable;

        /**
         * <p>The beginning of the time period during which the alert rule is effective. Unit: hours. For example, the value 23 indicates `23:59:59`.</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The consecutive number of times for which the metric value meets the alert condition before an alert is triggered.</p>
         */
        @NameInMap("EvaluationCount")
        public String evaluationCount;

        /**
         * <p>The name of the metric.</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The namespace of the service. For more information, see [Appendix 1: Metrics](~~163515~~).</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The aggregation period of the monitoring data. Unit: seconds. The default value is the minimum aggregation period, indicating that the metric is polled at the highest frequency. Typically, you do not need to specify the minimum aggregation period.</p>
         */
        @NameInMap("Period")
        public String period;

        /**
         * <p>The ID of the alert rule.</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The name of the alert rule.</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The mute period during which new alerts are not sent even if the trigger conditions are met. Unit: seconds. Default value: 86400.</p>
         */
        @NameInMap("SilenceTime")
        public String silenceTime;

        /**
         * <p>The end of the time period during which the alert rule is effective. Unit: hours. For example, the value 00 indicates `00:00:00`.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>Indicates whether the alert rule is enabled.</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The statistical aggregation method.</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>The threshold of the metric value.</p>
         */
        @NameInMap("Threshold")
        public String threshold;

        /**
         * <p>The callback URL.</p>
         */
        @NameInMap("Webhook")
        public String webhook;

        public static DescribeActiveMetricRuleListResponseBodyDatapointsAlarm build(java.util.Map<String, ?> map) throws Exception {
            DescribeActiveMetricRuleListResponseBodyDatapointsAlarm self = new DescribeActiveMetricRuleListResponseBodyDatapointsAlarm();
            return TeaModel.build(map, self);
        }

        public DescribeActiveMetricRuleListResponseBodyDatapointsAlarm setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public DescribeActiveMetricRuleListResponseBodyDatapointsAlarm setContactGroups(String contactGroups) {
            this.contactGroups = contactGroups;
            return this;
        }
        public String getContactGroups() {
            return this.contactGroups;
        }

        public DescribeActiveMetricRuleListResponseBodyDatapointsAlarm setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
        }

        public DescribeActiveMetricRuleListResponseBodyDatapointsAlarm setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeActiveMetricRuleListResponseBodyDatapointsAlarm setEvaluationCount(String evaluationCount) {
            this.evaluationCount = evaluationCount;
            return this;
        }
        public String getEvaluationCount() {
            return this.evaluationCount;
        }

        public DescribeActiveMetricRuleListResponseBodyDatapointsAlarm setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeActiveMetricRuleListResponseBodyDatapointsAlarm setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeActiveMetricRuleListResponseBodyDatapointsAlarm setPeriod(String period) {
            this.period = period;
            return this;
        }
        public String getPeriod() {
            return this.period;
        }

        public DescribeActiveMetricRuleListResponseBodyDatapointsAlarm setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeActiveMetricRuleListResponseBodyDatapointsAlarm setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeActiveMetricRuleListResponseBodyDatapointsAlarm setSilenceTime(String silenceTime) {
            this.silenceTime = silenceTime;
            return this;
        }
        public String getSilenceTime() {
            return this.silenceTime;
        }

        public DescribeActiveMetricRuleListResponseBodyDatapointsAlarm setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeActiveMetricRuleListResponseBodyDatapointsAlarm setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeActiveMetricRuleListResponseBodyDatapointsAlarm setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public DescribeActiveMetricRuleListResponseBodyDatapointsAlarm setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public DescribeActiveMetricRuleListResponseBodyDatapointsAlarm setWebhook(String webhook) {
            this.webhook = webhook;
            return this;
        }
        public String getWebhook() {
            return this.webhook;
        }

    }

    public static class DescribeActiveMetricRuleListResponseBodyDatapoints extends TeaModel {
        @NameInMap("Alarm")
        public java.util.List<DescribeActiveMetricRuleListResponseBodyDatapointsAlarm> alarm;

        public static DescribeActiveMetricRuleListResponseBodyDatapoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeActiveMetricRuleListResponseBodyDatapoints self = new DescribeActiveMetricRuleListResponseBodyDatapoints();
            return TeaModel.build(map, self);
        }

        public DescribeActiveMetricRuleListResponseBodyDatapoints setAlarm(java.util.List<DescribeActiveMetricRuleListResponseBodyDatapointsAlarm> alarm) {
            this.alarm = alarm;
            return this;
        }
        public java.util.List<DescribeActiveMetricRuleListResponseBodyDatapointsAlarm> getAlarm() {
            return this.alarm;
        }

    }

}
