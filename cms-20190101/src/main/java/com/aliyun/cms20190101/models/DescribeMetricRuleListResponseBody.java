// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricRuleListResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public String total;

    @NameInMap("Alarms")
    public DescribeMetricRuleListResponseBodyAlarms alarms;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeMetricRuleListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricRuleListResponseBody self = new DescribeMetricRuleListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMetricRuleListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeMetricRuleListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMetricRuleListResponseBody setTotal(String total) {
        this.total = total;
        return this;
    }
    public String getTotal() {
        return this.total;
    }

    public DescribeMetricRuleListResponseBody setAlarms(DescribeMetricRuleListResponseBodyAlarms alarms) {
        this.alarms = alarms;
        return this;
    }
    public DescribeMetricRuleListResponseBodyAlarms getAlarms() {
        return this.alarms;
    }

    public DescribeMetricRuleListResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeMetricRuleListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsCritical extends TeaModel {
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("PreCondition")
        public String preCondition;

        @NameInMap("Times")
        public Integer times;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Statistics")
        public String statistics;

        public static DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsCritical build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsCritical self = new DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsCritical();
            return TeaModel.build(map, self);
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsCritical setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsCritical setPreCondition(String preCondition) {
            this.preCondition = preCondition;
            return this;
        }
        public String getPreCondition() {
            return this.preCondition;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsCritical setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsCritical setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsCritical setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

    }

    public static class DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsInfo extends TeaModel {
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("PreCondition")
        public String preCondition;

        @NameInMap("Times")
        public Integer times;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Statistics")
        public String statistics;

        public static DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsInfo self = new DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsInfo();
            return TeaModel.build(map, self);
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsInfo setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsInfo setPreCondition(String preCondition) {
            this.preCondition = preCondition;
            return this;
        }
        public String getPreCondition() {
            return this.preCondition;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsInfo setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsInfo setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsInfo setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

    }

    public static class DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsWarn extends TeaModel {
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("PreCondition")
        public String preCondition;

        @NameInMap("Times")
        public Integer times;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Statistics")
        public String statistics;

        public static DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsWarn build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsWarn self = new DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsWarn();
            return TeaModel.build(map, self);
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsWarn setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsWarn setPreCondition(String preCondition) {
            this.preCondition = preCondition;
            return this;
        }
        public String getPreCondition() {
            return this.preCondition;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsWarn setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsWarn setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsWarn setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

    }

    public static class DescribeMetricRuleListResponseBodyAlarmsAlarmEscalations extends TeaModel {
        @NameInMap("Critical")
        public DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsCritical critical;

        @NameInMap("Info")
        public DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsInfo info;

        @NameInMap("Warn")
        public DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsWarn warn;

        public static DescribeMetricRuleListResponseBodyAlarmsAlarmEscalations build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleListResponseBodyAlarmsAlarmEscalations self = new DescribeMetricRuleListResponseBodyAlarmsAlarmEscalations();
            return TeaModel.build(map, self);
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmEscalations setCritical(DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsCritical critical) {
            this.critical = critical;
            return this;
        }
        public DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsCritical getCritical() {
            return this.critical;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmEscalations setInfo(DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsInfo info) {
            this.info = info;
            return this;
        }
        public DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsInfo getInfo() {
            return this.info;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmEscalations setWarn(DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsWarn warn) {
            this.warn = warn;
            return this;
        }
        public DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsWarn getWarn() {
            return this.warn;
        }

    }

    public static class DescribeMetricRuleListResponseBodyAlarmsAlarm extends TeaModel {
        @NameInMap("SilenceTime")
        public Integer silenceTime;

        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("Webhook")
        public String webhook;

        @NameInMap("Escalations")
        public DescribeMetricRuleListResponseBodyAlarmsAlarmEscalations escalations;

        @NameInMap("ContactGroups")
        public String contactGroups;

        @NameInMap("SourceType")
        public String sourceType;

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

        @NameInMap("AlertState")
        public String alertState;

        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("Period")
        public String period;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("Dimensions")
        public String dimensions;

        @NameInMap("EnableState")
        public Boolean enableState;

        @NameInMap("Resources")
        public String resources;

        public static DescribeMetricRuleListResponseBodyAlarmsAlarm build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleListResponseBodyAlarmsAlarm self = new DescribeMetricRuleListResponseBodyAlarmsAlarm();
            return TeaModel.build(map, self);
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarm setSilenceTime(Integer silenceTime) {
            this.silenceTime = silenceTime;
            return this;
        }
        public Integer getSilenceTime() {
            return this.silenceTime;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarm setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarm setWebhook(String webhook) {
            this.webhook = webhook;
            return this;
        }
        public String getWebhook() {
            return this.webhook;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarm setEscalations(DescribeMetricRuleListResponseBodyAlarmsAlarmEscalations escalations) {
            this.escalations = escalations;
            return this;
        }
        public DescribeMetricRuleListResponseBodyAlarmsAlarmEscalations getEscalations() {
            return this.escalations;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarm setContactGroups(String contactGroups) {
            this.contactGroups = contactGroups;
            return this;
        }
        public String getContactGroups() {
            return this.contactGroups;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarm setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarm setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarm setEffectiveInterval(String effectiveInterval) {
            this.effectiveInterval = effectiveInterval;
            return this;
        }
        public String getEffectiveInterval() {
            return this.effectiveInterval;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarm setNoEffectiveInterval(String noEffectiveInterval) {
            this.noEffectiveInterval = noEffectiveInterval;
            return this;
        }
        public String getNoEffectiveInterval() {
            return this.noEffectiveInterval;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarm setMailSubject(String mailSubject) {
            this.mailSubject = mailSubject;
            return this;
        }
        public String getMailSubject() {
            return this.mailSubject;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarm setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarm setAlertState(String alertState) {
            this.alertState = alertState;
            return this;
        }
        public String getAlertState() {
            return this.alertState;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarm setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarm setPeriod(String period) {
            this.period = period;
            return this;
        }
        public String getPeriod() {
            return this.period;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarm setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarm setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarm setDimensions(String dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public String getDimensions() {
            return this.dimensions;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarm setEnableState(Boolean enableState) {
            this.enableState = enableState;
            return this;
        }
        public Boolean getEnableState() {
            return this.enableState;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarm setResources(String resources) {
            this.resources = resources;
            return this;
        }
        public String getResources() {
            return this.resources;
        }

    }

    public static class DescribeMetricRuleListResponseBodyAlarms extends TeaModel {
        @NameInMap("Alarm")
        public java.util.List<DescribeMetricRuleListResponseBodyAlarmsAlarm> alarm;

        public static DescribeMetricRuleListResponseBodyAlarms build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleListResponseBodyAlarms self = new DescribeMetricRuleListResponseBodyAlarms();
            return TeaModel.build(map, self);
        }

        public DescribeMetricRuleListResponseBodyAlarms setAlarm(java.util.List<DescribeMetricRuleListResponseBodyAlarmsAlarm> alarm) {
            this.alarm = alarm;
            return this;
        }
        public java.util.List<DescribeMetricRuleListResponseBodyAlarmsAlarm> getAlarm() {
            return this.alarm;
        }

    }

}
