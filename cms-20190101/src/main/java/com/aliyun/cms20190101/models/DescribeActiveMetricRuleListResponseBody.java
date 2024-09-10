// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeActiveMetricRuleListResponseBody extends TeaModel {
    /**
     * <p>The details of the alert rules. The result is in the same structure as that returned by the DescribeMetricRuleList operation.</p>
     */
    @NameInMap("AlertList")
    public DescribeActiveMetricRuleListResponseBodyAlertList alertList;

    /**
     * <p>The HTTP status code.</p>
     * <blockquote>
     * <p> The status code 200 indicates that the request was successful.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
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
     * 
     * <strong>example:</strong>
     * <p>The Request is not authorization.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F82E6667-7811-4BA0-842F-5B2DC42BBAAD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * <p>The operator that is used to compare the metric value with the threshold for Critical-level alerts. Valid values:</p>
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
         * 
         * <strong>example:</strong>
         * <p>GreaterThanThreshold</p>
         */
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        /**
         * <p>The statistical methods for Critical-level alerts.</p>
         * 
         * <strong>example:</strong>
         * <p>Average</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>The threshold for Critical-level alerts.</p>
         * 
         * <strong>example:</strong>
         * <p>99</p>
         */
        @NameInMap("Threshold")
        public String threshold;

        /**
         * <p>The consecutive number of times for which the metric value meets the alert condition before a Critical-level alert is triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
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
         * <p>The operator that is used to compare the metric value with the threshold for Info-level alerts. Valid values:</p>
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
         * 
         * <strong>example:</strong>
         * <p>GreaterThanThreshold</p>
         */
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        /**
         * <p>The statistical methods for Info-level alerts.</p>
         * 
         * <strong>example:</strong>
         * <p>Average</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>The threshold for Info-level alerts.</p>
         * 
         * <strong>example:</strong>
         * <p>95</p>
         */
        @NameInMap("Threshold")
        public String threshold;

        /**
         * <p>The consecutive number of times</p>
         * <p>for which the metric value meets the alert condition before an Info-level alert is triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
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
         * <p>The operator that is used to compare the metric value with the threshold for Warn-level alerts. Valid values:</p>
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
         * 
         * <strong>example:</strong>
         * <p>GreaterThanThreshold</p>
         */
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        /**
         * <p>The statistical methods for Warn-level alerts.</p>
         * 
         * <strong>example:</strong>
         * <p>Average</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>The threshold for Warn-level alerts.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Threshold")
        public String threshold;

        /**
         * <p>The consecutive number of times</p>
         * <p>for which the metric value meets the alert condition before a Warn-level alert is triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
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
         * <p>The trigger condition for Critical-level alerts.</p>
         */
        @NameInMap("Critical")
        public DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalationsCritical critical;

        /**
         * <p>The conditions for triggering Info-level alerts.</p>
         */
        @NameInMap("Info")
        public DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalationsInfo info;

        /**
         * <p>The conditions for triggering Warn-level alerts.</p>
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
         * <ul>
         * <li>OK: The alert rule has no active alerts.</li>
         * <li>ALARM: The alert rule has active alerts.</li>
         * <li>INSUFFICIENT_DATA: No data is found.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("AlertState")
        public String alertState;

        /**
         * <p>The alert contact group.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS_Group</p>
         */
        @NameInMap("ContactGroups")
        public String contactGroups;

        /**
         * <p>The monitoring data of the specified resource.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Dimensions")
        public String dimensions;

        /**
         * <p>The time period during which the alert rule is effective.</p>
         * 
         * <strong>example:</strong>
         * <p>00:00-23:59</p>
         */
        @NameInMap("EffectiveInterval")
        public String effectiveInterval;

        /**
         * <p>Indicates whether the alert rule is enabled. Valid values:</p>
         * <ul>
         * <li>true: The alert rule is enabled.</li>
         * <li>false: The alert rule is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableState")
        public Boolean enableState;

        /**
         * <p>The conditions for triggering different levels of alerts.</p>
         */
        @NameInMap("Escalations")
        public DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalations escalations;

        /**
         * <p>The subject of the alert notification email.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS_Bucket</p>
         */
        @NameInMap("MailSubject")
        public String mailSubject;

        /**
         * <p>The name of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>cpu_total</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The namespace of the Alibaba Cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>acs_ecs_dashboard</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The time period during which the alert rule is ineffective.</p>
         * 
         * <strong>example:</strong>
         * <p>00:00-06:00</p>
         */
        @NameInMap("NoEffectiveInterval")
        public String noEffectiveInterval;

        /**
         * <p>The aggregation period of monitoring data.</p>
         * <p>Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Period")
        public String period;

        /**
         * <p>The resources that are associated with the alert rule.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;resource&quot;:&quot;_ALL&quot;}]</p>
         */
        @NameInMap("Resources")
        public String resources;

        /**
         * <p>The ID of the alert rule.</p>
         * 
         * <strong>example:</strong>
         * <p>ruleIdxxxx</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The name of the alert rule.</p>
         * 
         * <strong>example:</strong>
         * <p>myAlert</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The mute period during which new alerts are not sent even if the trigger conditions are met.</p>
         * <p>Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>86400</p>
         */
        @NameInMap("SilenceTime")
        public String silenceTime;

        /**
         * <p>The callback URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyun.com">http://www.aliyun.com</a></p>
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
         * <ul>
         * <li><code>&gt;</code></li>
         * <li><code>&lt;</code></li>
         * <li><code>&gt;=</code></li>
         * <li><code>&lt;=</code></li>
         * <li><code>=</code></li>
         * <li><code>=</code></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <blockquote>
         * </blockquote>
         */
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        /**
         * <p>The alert contact group.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS_Group</p>
         */
        @NameInMap("ContactGroups")
        public String contactGroups;

        /**
         * <p>Indicates whether the alert rule is enabled. Valid values:</p>
         * <ul>
         * <li>true: The alert rule is enabled.</li>
         * <li>false: The alert rule is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enable")
        public String enable;

        /**
         * <p>The end of the time period during which the alert rule is effective.</p>
         * <p>Unit: hours. For example, the value 23 indicates <code>23:59:59</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>24</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The consecutive number of times for which the metric value meets the alert condition before an alert is triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("EvaluationCount")
        public String evaluationCount;

        /**
         * <p>The metric name.</p>
         * 
         * <strong>example:</strong>
         * <p>cpu_total</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The namespace of the cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>acs_ecs_dashboard</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The aggregation period of monitoring data.</p>
         * <p>Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Period")
        public String period;

        /**
         * <p>The ID of the alert rule.</p>
         * 
         * <strong>example:</strong>
         * <p>a151cd6023eacee2f0978e03863cc1697c89508****</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The name of the alert rule.</p>
         * 
         * <strong>example:</strong>
         * <p>SystemDefault_acs_rds_dashboard_CpuUsage</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The mute period during which new alerts are not sent even if the trigger conditions are met.</p>
         * <p>Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>86400</p>
         */
        @NameInMap("SilenceTime")
        public String silenceTime;

        /**
         * <p>The beginning of the time period during which the alert rule is effective.</p>
         * <p>Unit: hours. For example, the value 00 indicates <code>00:00:00</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>Indicates whether the alert rule is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The statistical method.</p>
         * 
         * <strong>example:</strong>
         * <p>Average</p>
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

        /**
         * <p>The callback URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyun.com">http://www.aliyun.com</a></p>
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
