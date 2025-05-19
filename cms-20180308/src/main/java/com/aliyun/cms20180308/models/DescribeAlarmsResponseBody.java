// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class DescribeAlarmsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Datapoints")
    public DescribeAlarmsResponseBodyDatapoints datapoints;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Total")
    public String total;

    @NameInMap("TraceId")
    public String traceId;

    public static DescribeAlarmsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlarmsResponseBody self = new DescribeAlarmsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAlarmsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeAlarmsResponseBody setDatapoints(DescribeAlarmsResponseBodyDatapoints datapoints) {
        this.datapoints = datapoints;
        return this;
    }
    public DescribeAlarmsResponseBodyDatapoints getDatapoints() {
        return this.datapoints;
    }

    public DescribeAlarmsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAlarmsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAlarmsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeAlarmsResponseBody setTotal(String total) {
        this.total = total;
        return this;
    }
    public String getTotal() {
        return this.total;
    }

    public DescribeAlarmsResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class DescribeAlarmsResponseBodyDatapointsAlarmEscalationsCritical extends TeaModel {
        @NameInMap("AlertSensitivity")
        public String alertSensitivity;

        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("HistoryDataRange")
        public String historyDataRange;

        @NameInMap("PreCondition")
        public String preCondition;

        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Times")
        public String times;

        public static DescribeAlarmsResponseBodyDatapointsAlarmEscalationsCritical build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlarmsResponseBodyDatapointsAlarmEscalationsCritical self = new DescribeAlarmsResponseBodyDatapointsAlarmEscalationsCritical();
            return TeaModel.build(map, self);
        }

        public DescribeAlarmsResponseBodyDatapointsAlarmEscalationsCritical setAlertSensitivity(String alertSensitivity) {
            this.alertSensitivity = alertSensitivity;
            return this;
        }
        public String getAlertSensitivity() {
            return this.alertSensitivity;
        }

        public DescribeAlarmsResponseBodyDatapointsAlarmEscalationsCritical setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public DescribeAlarmsResponseBodyDatapointsAlarmEscalationsCritical setHistoryDataRange(String historyDataRange) {
            this.historyDataRange = historyDataRange;
            return this;
        }
        public String getHistoryDataRange() {
            return this.historyDataRange;
        }

        public DescribeAlarmsResponseBodyDatapointsAlarmEscalationsCritical setPreCondition(String preCondition) {
            this.preCondition = preCondition;
            return this;
        }
        public String getPreCondition() {
            return this.preCondition;
        }

        public DescribeAlarmsResponseBodyDatapointsAlarmEscalationsCritical setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public DescribeAlarmsResponseBodyDatapointsAlarmEscalationsCritical setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public DescribeAlarmsResponseBodyDatapointsAlarmEscalationsCritical setTimes(String times) {
            this.times = times;
            return this;
        }
        public String getTimes() {
            return this.times;
        }

    }

    public static class DescribeAlarmsResponseBodyDatapointsAlarmEscalationsInfo extends TeaModel {
        @NameInMap("AlertSensitivity")
        public String alertSensitivity;

        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("HistoryDataRange")
        public String historyDataRange;

        @NameInMap("PreCondition")
        public String preCondition;

        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Times")
        public String times;

        public static DescribeAlarmsResponseBodyDatapointsAlarmEscalationsInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlarmsResponseBodyDatapointsAlarmEscalationsInfo self = new DescribeAlarmsResponseBodyDatapointsAlarmEscalationsInfo();
            return TeaModel.build(map, self);
        }

        public DescribeAlarmsResponseBodyDatapointsAlarmEscalationsInfo setAlertSensitivity(String alertSensitivity) {
            this.alertSensitivity = alertSensitivity;
            return this;
        }
        public String getAlertSensitivity() {
            return this.alertSensitivity;
        }

        public DescribeAlarmsResponseBodyDatapointsAlarmEscalationsInfo setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public DescribeAlarmsResponseBodyDatapointsAlarmEscalationsInfo setHistoryDataRange(String historyDataRange) {
            this.historyDataRange = historyDataRange;
            return this;
        }
        public String getHistoryDataRange() {
            return this.historyDataRange;
        }

        public DescribeAlarmsResponseBodyDatapointsAlarmEscalationsInfo setPreCondition(String preCondition) {
            this.preCondition = preCondition;
            return this;
        }
        public String getPreCondition() {
            return this.preCondition;
        }

        public DescribeAlarmsResponseBodyDatapointsAlarmEscalationsInfo setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public DescribeAlarmsResponseBodyDatapointsAlarmEscalationsInfo setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public DescribeAlarmsResponseBodyDatapointsAlarmEscalationsInfo setTimes(String times) {
            this.times = times;
            return this;
        }
        public String getTimes() {
            return this.times;
        }

    }

    public static class DescribeAlarmsResponseBodyDatapointsAlarmEscalationsWarn extends TeaModel {
        @NameInMap("AlertSensitivity")
        public String alertSensitivity;

        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("HistoryDataRange")
        public String historyDataRange;

        @NameInMap("PreCondition")
        public String preCondition;

        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Times")
        public String times;

        public static DescribeAlarmsResponseBodyDatapointsAlarmEscalationsWarn build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlarmsResponseBodyDatapointsAlarmEscalationsWarn self = new DescribeAlarmsResponseBodyDatapointsAlarmEscalationsWarn();
            return TeaModel.build(map, self);
        }

        public DescribeAlarmsResponseBodyDatapointsAlarmEscalationsWarn setAlertSensitivity(String alertSensitivity) {
            this.alertSensitivity = alertSensitivity;
            return this;
        }
        public String getAlertSensitivity() {
            return this.alertSensitivity;
        }

        public DescribeAlarmsResponseBodyDatapointsAlarmEscalationsWarn setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public DescribeAlarmsResponseBodyDatapointsAlarmEscalationsWarn setHistoryDataRange(String historyDataRange) {
            this.historyDataRange = historyDataRange;
            return this;
        }
        public String getHistoryDataRange() {
            return this.historyDataRange;
        }

        public DescribeAlarmsResponseBodyDatapointsAlarmEscalationsWarn setPreCondition(String preCondition) {
            this.preCondition = preCondition;
            return this;
        }
        public String getPreCondition() {
            return this.preCondition;
        }

        public DescribeAlarmsResponseBodyDatapointsAlarmEscalationsWarn setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public DescribeAlarmsResponseBodyDatapointsAlarmEscalationsWarn setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public DescribeAlarmsResponseBodyDatapointsAlarmEscalationsWarn setTimes(String times) {
            this.times = times;
            return this;
        }
        public String getTimes() {
            return this.times;
        }

    }

    public static class DescribeAlarmsResponseBodyDatapointsAlarmEscalations extends TeaModel {
        @NameInMap("Critical")
        public DescribeAlarmsResponseBodyDatapointsAlarmEscalationsCritical critical;

        @NameInMap("Info")
        public DescribeAlarmsResponseBodyDatapointsAlarmEscalationsInfo info;

        @NameInMap("Warn")
        public DescribeAlarmsResponseBodyDatapointsAlarmEscalationsWarn warn;

        public static DescribeAlarmsResponseBodyDatapointsAlarmEscalations build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlarmsResponseBodyDatapointsAlarmEscalations self = new DescribeAlarmsResponseBodyDatapointsAlarmEscalations();
            return TeaModel.build(map, self);
        }

        public DescribeAlarmsResponseBodyDatapointsAlarmEscalations setCritical(DescribeAlarmsResponseBodyDatapointsAlarmEscalationsCritical critical) {
            this.critical = critical;
            return this;
        }
        public DescribeAlarmsResponseBodyDatapointsAlarmEscalationsCritical getCritical() {
            return this.critical;
        }

        public DescribeAlarmsResponseBodyDatapointsAlarmEscalations setInfo(DescribeAlarmsResponseBodyDatapointsAlarmEscalationsInfo info) {
            this.info = info;
            return this;
        }
        public DescribeAlarmsResponseBodyDatapointsAlarmEscalationsInfo getInfo() {
            return this.info;
        }

        public DescribeAlarmsResponseBodyDatapointsAlarmEscalations setWarn(DescribeAlarmsResponseBodyDatapointsAlarmEscalationsWarn warn) {
            this.warn = warn;
            return this;
        }
        public DescribeAlarmsResponseBodyDatapointsAlarmEscalationsWarn getWarn() {
            return this.warn;
        }

    }

    public static class DescribeAlarmsResponseBodyDatapointsAlarm extends TeaModel {
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("ContactGroups")
        public String contactGroups;

        @NameInMap("Dimensions")
        public String dimensions;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("EffectiveInterval")
        public String effectiveInterval;

        @NameInMap("Enable")
        public Boolean enable;

        @NameInMap("Escalations")
        public DescribeAlarmsResponseBodyDatapointsAlarmEscalations escalations;

        @NameInMap("EvaluationCount")
        public String evaluationCount;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("Level")
        public String level;

        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("Name")
        public String name;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("NoEffectiveInterval")
        public String noEffectiveInterval;

        @NameInMap("Period")
        public String period;

        @NameInMap("Resources")
        public String resources;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("RuleType")
        public String ruleType;

        @NameInMap("SilenceTime")
        public String silenceTime;

        @NameInMap("State")
        public String state;

        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("Subject")
        public String subject;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Uuid")
        public String uuid;

        @NameInMap("Webhook")
        public String webhook;

        public static DescribeAlarmsResponseBodyDatapointsAlarm build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlarmsResponseBodyDatapointsAlarm self = new DescribeAlarmsResponseBodyDatapointsAlarm();
            return TeaModel.build(map, self);
        }

        public DescribeAlarmsResponseBodyDatapointsAlarm setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public DescribeAlarmsResponseBodyDatapointsAlarm setContactGroups(String contactGroups) {
            this.contactGroups = contactGroups;
            return this;
        }
        public String getContactGroups() {
            return this.contactGroups;
        }

        public DescribeAlarmsResponseBodyDatapointsAlarm setDimensions(String dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public String getDimensions() {
            return this.dimensions;
        }

        public DescribeAlarmsResponseBodyDatapointsAlarm setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public DescribeAlarmsResponseBodyDatapointsAlarm setEffectiveInterval(String effectiveInterval) {
            this.effectiveInterval = effectiveInterval;
            return this;
        }
        public String getEffectiveInterval() {
            return this.effectiveInterval;
        }

        public DescribeAlarmsResponseBodyDatapointsAlarm setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public DescribeAlarmsResponseBodyDatapointsAlarm setEscalations(DescribeAlarmsResponseBodyDatapointsAlarmEscalations escalations) {
            this.escalations = escalations;
            return this;
        }
        public DescribeAlarmsResponseBodyDatapointsAlarmEscalations getEscalations() {
            return this.escalations;
        }

        public DescribeAlarmsResponseBodyDatapointsAlarm setEvaluationCount(String evaluationCount) {
            this.evaluationCount = evaluationCount;
            return this;
        }
        public String getEvaluationCount() {
            return this.evaluationCount;
        }

        public DescribeAlarmsResponseBodyDatapointsAlarm setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeAlarmsResponseBodyDatapointsAlarm setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeAlarmsResponseBodyDatapointsAlarm setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeAlarmsResponseBodyDatapointsAlarm setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeAlarmsResponseBodyDatapointsAlarm setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAlarmsResponseBodyDatapointsAlarm setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeAlarmsResponseBodyDatapointsAlarm setNoEffectiveInterval(String noEffectiveInterval) {
            this.noEffectiveInterval = noEffectiveInterval;
            return this;
        }
        public String getNoEffectiveInterval() {
            return this.noEffectiveInterval;
        }

        public DescribeAlarmsResponseBodyDatapointsAlarm setPeriod(String period) {
            this.period = period;
            return this;
        }
        public String getPeriod() {
            return this.period;
        }

        public DescribeAlarmsResponseBodyDatapointsAlarm setResources(String resources) {
            this.resources = resources;
            return this;
        }
        public String getResources() {
            return this.resources;
        }

        public DescribeAlarmsResponseBodyDatapointsAlarm setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeAlarmsResponseBodyDatapointsAlarm setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public DescribeAlarmsResponseBodyDatapointsAlarm setSilenceTime(String silenceTime) {
            this.silenceTime = silenceTime;
            return this;
        }
        public String getSilenceTime() {
            return this.silenceTime;
        }

        public DescribeAlarmsResponseBodyDatapointsAlarm setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeAlarmsResponseBodyDatapointsAlarm setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public DescribeAlarmsResponseBodyDatapointsAlarm setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

        public DescribeAlarmsResponseBodyDatapointsAlarm setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public DescribeAlarmsResponseBodyDatapointsAlarm setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public DescribeAlarmsResponseBodyDatapointsAlarm setWebhook(String webhook) {
            this.webhook = webhook;
            return this;
        }
        public String getWebhook() {
            return this.webhook;
        }

    }

    public static class DescribeAlarmsResponseBodyDatapoints extends TeaModel {
        @NameInMap("Alarm")
        public java.util.List<DescribeAlarmsResponseBodyDatapointsAlarm> alarm;

        public static DescribeAlarmsResponseBodyDatapoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlarmsResponseBodyDatapoints self = new DescribeAlarmsResponseBodyDatapoints();
            return TeaModel.build(map, self);
        }

        public DescribeAlarmsResponseBodyDatapoints setAlarm(java.util.List<DescribeAlarmsResponseBodyDatapointsAlarm> alarm) {
            this.alarm = alarm;
            return this;
        }
        public java.util.List<DescribeAlarmsResponseBodyDatapointsAlarm> getAlarm() {
            return this.alarm;
        }

    }

}
