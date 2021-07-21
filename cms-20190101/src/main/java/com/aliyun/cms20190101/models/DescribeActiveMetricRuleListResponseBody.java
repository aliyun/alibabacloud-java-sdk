// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeActiveMetricRuleListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Datapoints")
    public DescribeActiveMetricRuleListResponseBodyDatapoints datapoints;

    @NameInMap("AlertList")
    public DescribeActiveMetricRuleListResponseBodyAlertList alertList;

    public static DescribeActiveMetricRuleListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeActiveMetricRuleListResponseBody self = new DescribeActiveMetricRuleListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeActiveMetricRuleListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
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

    public DescribeActiveMetricRuleListResponseBody setDatapoints(DescribeActiveMetricRuleListResponseBodyDatapoints datapoints) {
        this.datapoints = datapoints;
        return this;
    }
    public DescribeActiveMetricRuleListResponseBodyDatapoints getDatapoints() {
        return this.datapoints;
    }

    public DescribeActiveMetricRuleListResponseBody setAlertList(DescribeActiveMetricRuleListResponseBodyAlertList alertList) {
        this.alertList = alertList;
        return this;
    }
    public DescribeActiveMetricRuleListResponseBodyAlertList getAlertList() {
        return this.alertList;
    }

    public static class DescribeActiveMetricRuleListResponseBodyDatapointsAlarm extends TeaModel {
        @NameInMap("SilenceTime")
        public String silenceTime;

        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("EvaluationCount")
        public String evaluationCount;

        @NameInMap("Webhook")
        public String webhook;

        @NameInMap("State")
        public String state;

        @NameInMap("ContactGroups")
        public String contactGroups;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("Period")
        public String period;

        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("Enable")
        public String enable;

        public static DescribeActiveMetricRuleListResponseBodyDatapointsAlarm build(java.util.Map<String, ?> map) throws Exception {
            DescribeActiveMetricRuleListResponseBodyDatapointsAlarm self = new DescribeActiveMetricRuleListResponseBodyDatapointsAlarm();
            return TeaModel.build(map, self);
        }

        public DescribeActiveMetricRuleListResponseBodyDatapointsAlarm setSilenceTime(String silenceTime) {
            this.silenceTime = silenceTime;
            return this;
        }
        public String getSilenceTime() {
            return this.silenceTime;
        }

        public DescribeActiveMetricRuleListResponseBodyDatapointsAlarm setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeActiveMetricRuleListResponseBodyDatapointsAlarm setEvaluationCount(String evaluationCount) {
            this.evaluationCount = evaluationCount;
            return this;
        }
        public String getEvaluationCount() {
            return this.evaluationCount;
        }

        public DescribeActiveMetricRuleListResponseBodyDatapointsAlarm setWebhook(String webhook) {
            this.webhook = webhook;
            return this;
        }
        public String getWebhook() {
            return this.webhook;
        }

        public DescribeActiveMetricRuleListResponseBodyDatapointsAlarm setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeActiveMetricRuleListResponseBodyDatapointsAlarm setContactGroups(String contactGroups) {
            this.contactGroups = contactGroups;
            return this;
        }
        public String getContactGroups() {
            return this.contactGroups;
        }

        public DescribeActiveMetricRuleListResponseBodyDatapointsAlarm setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeActiveMetricRuleListResponseBodyDatapointsAlarm setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeActiveMetricRuleListResponseBodyDatapointsAlarm setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeActiveMetricRuleListResponseBodyDatapointsAlarm setPeriod(String period) {
            this.period = period;
            return this;
        }
        public String getPeriod() {
            return this.period;
        }

        public DescribeActiveMetricRuleListResponseBodyDatapointsAlarm setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public DescribeActiveMetricRuleListResponseBodyDatapointsAlarm setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeActiveMetricRuleListResponseBodyDatapointsAlarm setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeActiveMetricRuleListResponseBodyDatapointsAlarm setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public DescribeActiveMetricRuleListResponseBodyDatapointsAlarm setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public DescribeActiveMetricRuleListResponseBodyDatapointsAlarm setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
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

    public static class DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalationsInfo extends TeaModel {
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("Times")
        public String times;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Statistics")
        public String statistics;

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

        public DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalationsInfo setTimes(String times) {
            this.times = times;
            return this;
        }
        public String getTimes() {
            return this.times;
        }

        public DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalationsInfo setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalationsInfo setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

    }

    public static class DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalationsWarn extends TeaModel {
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("Times")
        public String times;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Statistics")
        public String statistics;

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

        public DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalationsWarn setTimes(String times) {
            this.times = times;
            return this;
        }
        public String getTimes() {
            return this.times;
        }

        public DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalationsWarn setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalationsWarn setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

    }

    public static class DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalationsCritical extends TeaModel {
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("Times")
        public String times;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Statistics")
        public String statistics;

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

        public DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalationsCritical setTimes(String times) {
            this.times = times;
            return this;
        }
        public String getTimes() {
            return this.times;
        }

        public DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalationsCritical setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalationsCritical setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

    }

    public static class DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalations extends TeaModel {
        @NameInMap("Info")
        public DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalationsInfo info;

        @NameInMap("Warn")
        public DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalationsWarn warn;

        @NameInMap("Critical")
        public DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalationsCritical critical;

        public static DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalations build(java.util.Map<String, ?> map) throws Exception {
            DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalations self = new DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalations();
            return TeaModel.build(map, self);
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

        public DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalations setCritical(DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalationsCritical critical) {
            this.critical = critical;
            return this;
        }
        public DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalationsCritical getCritical() {
            return this.critical;
        }

    }

    public static class DescribeActiveMetricRuleListResponseBodyAlertListAlert extends TeaModel {
        @NameInMap("SilenceTime")
        public String silenceTime;

        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("Webhook")
        public String webhook;

        @NameInMap("ContactGroups")
        public String contactGroups;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("EffectiveInterval")
        public String effectiveInterval;

        @NameInMap("NoEffectiveInterval")
        public String noEffectiveInterval;

        @NameInMap("MailSubject")
        public String mailSubject;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("Period")
        public String period;

        @NameInMap("AlertState")
        public String alertState;

        @NameInMap("Dimensions")
        public String dimensions;

        @NameInMap("EnableState")
        public Boolean enableState;

        @NameInMap("Resources")
        public String resources;

        @NameInMap("Escalations")
        public DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalations escalations;

        public static DescribeActiveMetricRuleListResponseBodyAlertListAlert build(java.util.Map<String, ?> map) throws Exception {
            DescribeActiveMetricRuleListResponseBodyAlertListAlert self = new DescribeActiveMetricRuleListResponseBodyAlertListAlert();
            return TeaModel.build(map, self);
        }

        public DescribeActiveMetricRuleListResponseBodyAlertListAlert setSilenceTime(String silenceTime) {
            this.silenceTime = silenceTime;
            return this;
        }
        public String getSilenceTime() {
            return this.silenceTime;
        }

        public DescribeActiveMetricRuleListResponseBodyAlertListAlert setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeActiveMetricRuleListResponseBodyAlertListAlert setWebhook(String webhook) {
            this.webhook = webhook;
            return this;
        }
        public String getWebhook() {
            return this.webhook;
        }

        public DescribeActiveMetricRuleListResponseBodyAlertListAlert setContactGroups(String contactGroups) {
            this.contactGroups = contactGroups;
            return this;
        }
        public String getContactGroups() {
            return this.contactGroups;
        }

        public DescribeActiveMetricRuleListResponseBodyAlertListAlert setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeActiveMetricRuleListResponseBodyAlertListAlert setEffectiveInterval(String effectiveInterval) {
            this.effectiveInterval = effectiveInterval;
            return this;
        }
        public String getEffectiveInterval() {
            return this.effectiveInterval;
        }

        public DescribeActiveMetricRuleListResponseBodyAlertListAlert setNoEffectiveInterval(String noEffectiveInterval) {
            this.noEffectiveInterval = noEffectiveInterval;
            return this;
        }
        public String getNoEffectiveInterval() {
            return this.noEffectiveInterval;
        }

        public DescribeActiveMetricRuleListResponseBodyAlertListAlert setMailSubject(String mailSubject) {
            this.mailSubject = mailSubject;
            return this;
        }
        public String getMailSubject() {
            return this.mailSubject;
        }

        public DescribeActiveMetricRuleListResponseBodyAlertListAlert setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeActiveMetricRuleListResponseBodyAlertListAlert setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeActiveMetricRuleListResponseBodyAlertListAlert setPeriod(String period) {
            this.period = period;
            return this;
        }
        public String getPeriod() {
            return this.period;
        }

        public DescribeActiveMetricRuleListResponseBodyAlertListAlert setAlertState(String alertState) {
            this.alertState = alertState;
            return this;
        }
        public String getAlertState() {
            return this.alertState;
        }

        public DescribeActiveMetricRuleListResponseBodyAlertListAlert setDimensions(String dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public String getDimensions() {
            return this.dimensions;
        }

        public DescribeActiveMetricRuleListResponseBodyAlertListAlert setEnableState(Boolean enableState) {
            this.enableState = enableState;
            return this;
        }
        public Boolean getEnableState() {
            return this.enableState;
        }

        public DescribeActiveMetricRuleListResponseBodyAlertListAlert setResources(String resources) {
            this.resources = resources;
            return this;
        }
        public String getResources() {
            return this.resources;
        }

        public DescribeActiveMetricRuleListResponseBodyAlertListAlert setEscalations(DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalations escalations) {
            this.escalations = escalations;
            return this;
        }
        public DescribeActiveMetricRuleListResponseBodyAlertListAlertEscalations getEscalations() {
            return this.escalations;
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

}
