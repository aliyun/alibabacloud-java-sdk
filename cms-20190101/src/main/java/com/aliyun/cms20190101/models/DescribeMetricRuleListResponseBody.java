// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricRuleListResponseBody extends TeaModel {
    @NameInMap("Alarms")
    public DescribeMetricRuleListResponseBodyAlarms alarms;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Total")
    public String total;

    public static DescribeMetricRuleListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricRuleListResponseBody self = new DescribeMetricRuleListResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeMetricRuleListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeMetricRuleListResponseBody setTotal(String total) {
        this.total = total;
        return this;
    }
    public String getTotal() {
        return this.total;
    }

    public static class DescribeMetricRuleListResponseBodyAlarmsAlarmCompositeExpressionExpressionListExpressionList extends TeaModel {
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("Period")
        public Integer period;

        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("Threshold")
        public String threshold;

        public static DescribeMetricRuleListResponseBodyAlarmsAlarmCompositeExpressionExpressionListExpressionList build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleListResponseBodyAlarmsAlarmCompositeExpressionExpressionListExpressionList self = new DescribeMetricRuleListResponseBodyAlarmsAlarmCompositeExpressionExpressionListExpressionList();
            return TeaModel.build(map, self);
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmCompositeExpressionExpressionListExpressionList setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmCompositeExpressionExpressionListExpressionList setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmCompositeExpressionExpressionListExpressionList setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmCompositeExpressionExpressionListExpressionList setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmCompositeExpressionExpressionListExpressionList setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

    }

    public static class DescribeMetricRuleListResponseBodyAlarmsAlarmCompositeExpressionExpressionList extends TeaModel {
        @NameInMap("ExpressionList")
        public java.util.List<DescribeMetricRuleListResponseBodyAlarmsAlarmCompositeExpressionExpressionListExpressionList> expressionList;

        public static DescribeMetricRuleListResponseBodyAlarmsAlarmCompositeExpressionExpressionList build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleListResponseBodyAlarmsAlarmCompositeExpressionExpressionList self = new DescribeMetricRuleListResponseBodyAlarmsAlarmCompositeExpressionExpressionList();
            return TeaModel.build(map, self);
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmCompositeExpressionExpressionList setExpressionList(java.util.List<DescribeMetricRuleListResponseBodyAlarmsAlarmCompositeExpressionExpressionListExpressionList> expressionList) {
            this.expressionList = expressionList;
            return this;
        }
        public java.util.List<DescribeMetricRuleListResponseBodyAlarmsAlarmCompositeExpressionExpressionListExpressionList> getExpressionList() {
            return this.expressionList;
        }

    }

    public static class DescribeMetricRuleListResponseBodyAlarmsAlarmCompositeExpression extends TeaModel {
        @NameInMap("ExpressionList")
        public DescribeMetricRuleListResponseBodyAlarmsAlarmCompositeExpressionExpressionList expressionList;

        @NameInMap("ExpressionListJoin")
        public String expressionListJoin;

        @NameInMap("ExpressionRaw")
        public String expressionRaw;

        @NameInMap("Level")
        public String level;

        @NameInMap("Times")
        public Integer times;

        public static DescribeMetricRuleListResponseBodyAlarmsAlarmCompositeExpression build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleListResponseBodyAlarmsAlarmCompositeExpression self = new DescribeMetricRuleListResponseBodyAlarmsAlarmCompositeExpression();
            return TeaModel.build(map, self);
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmCompositeExpression setExpressionList(DescribeMetricRuleListResponseBodyAlarmsAlarmCompositeExpressionExpressionList expressionList) {
            this.expressionList = expressionList;
            return this;
        }
        public DescribeMetricRuleListResponseBodyAlarmsAlarmCompositeExpressionExpressionList getExpressionList() {
            return this.expressionList;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmCompositeExpression setExpressionListJoin(String expressionListJoin) {
            this.expressionListJoin = expressionListJoin;
            return this;
        }
        public String getExpressionListJoin() {
            return this.expressionListJoin;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmCompositeExpression setExpressionRaw(String expressionRaw) {
            this.expressionRaw = expressionRaw;
            return this;
        }
        public String getExpressionRaw() {
            return this.expressionRaw;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmCompositeExpression setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmCompositeExpression setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsCritical extends TeaModel {
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("PreCondition")
        public String preCondition;

        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Times")
        public Integer times;

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

        public DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsCritical setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsCritical setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsCritical setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsInfo extends TeaModel {
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("PreCondition")
        public String preCondition;

        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Times")
        public Integer times;

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

        public DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsInfo setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsInfo setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsInfo setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsWarn extends TeaModel {
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("PreCondition")
        public String preCondition;

        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Times")
        public Integer times;

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

        public DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsWarn setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsWarn setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsWarn setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
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

    public static class DescribeMetricRuleListResponseBodyAlarmsAlarmLabelsLabels extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeMetricRuleListResponseBodyAlarmsAlarmLabelsLabels build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleListResponseBodyAlarmsAlarmLabelsLabels self = new DescribeMetricRuleListResponseBodyAlarmsAlarmLabelsLabels();
            return TeaModel.build(map, self);
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmLabelsLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmLabelsLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeMetricRuleListResponseBodyAlarmsAlarmLabels extends TeaModel {
        @NameInMap("Labels")
        public java.util.List<DescribeMetricRuleListResponseBodyAlarmsAlarmLabelsLabels> labels;

        public static DescribeMetricRuleListResponseBodyAlarmsAlarmLabels build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleListResponseBodyAlarmsAlarmLabels self = new DescribeMetricRuleListResponseBodyAlarmsAlarmLabels();
            return TeaModel.build(map, self);
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmLabels setLabels(java.util.List<DescribeMetricRuleListResponseBodyAlarmsAlarmLabelsLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<DescribeMetricRuleListResponseBodyAlarmsAlarmLabelsLabels> getLabels() {
            return this.labels;
        }

    }

    public static class DescribeMetricRuleListResponseBodyAlarmsAlarm extends TeaModel {
        @NameInMap("AlertState")
        public String alertState;

        @NameInMap("CompositeExpression")
        public DescribeMetricRuleListResponseBodyAlarmsAlarmCompositeExpression compositeExpression;

        @NameInMap("ContactGroups")
        public String contactGroups;

        @NameInMap("Dimensions")
        public String dimensions;

        @NameInMap("EffectiveInterval")
        public String effectiveInterval;

        @NameInMap("EnableState")
        public Boolean enableState;

        @NameInMap("Escalations")
        public DescribeMetricRuleListResponseBodyAlarmsAlarmEscalations escalations;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("Labels")
        public DescribeMetricRuleListResponseBodyAlarmsAlarmLabels labels;

        @NameInMap("MailSubject")
        public String mailSubject;

        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("NoDataPolicy")
        public String noDataPolicy;

        @NameInMap("NoEffectiveInterval")
        public String noEffectiveInterval;

        @NameInMap("Period")
        public String period;

        @NameInMap("Resources")
        public String resources;

        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("SilenceTime")
        public Integer silenceTime;

        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("Webhook")
        public String webhook;

        public static DescribeMetricRuleListResponseBodyAlarmsAlarm build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleListResponseBodyAlarmsAlarm self = new DescribeMetricRuleListResponseBodyAlarmsAlarm();
            return TeaModel.build(map, self);
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarm setAlertState(String alertState) {
            this.alertState = alertState;
            return this;
        }
        public String getAlertState() {
            return this.alertState;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarm setCompositeExpression(DescribeMetricRuleListResponseBodyAlarmsAlarmCompositeExpression compositeExpression) {
            this.compositeExpression = compositeExpression;
            return this;
        }
        public DescribeMetricRuleListResponseBodyAlarmsAlarmCompositeExpression getCompositeExpression() {
            return this.compositeExpression;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarm setContactGroups(String contactGroups) {
            this.contactGroups = contactGroups;
            return this;
        }
        public String getContactGroups() {
            return this.contactGroups;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarm setDimensions(String dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public String getDimensions() {
            return this.dimensions;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarm setEffectiveInterval(String effectiveInterval) {
            this.effectiveInterval = effectiveInterval;
            return this;
        }
        public String getEffectiveInterval() {
            return this.effectiveInterval;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarm setEnableState(Boolean enableState) {
            this.enableState = enableState;
            return this;
        }
        public Boolean getEnableState() {
            return this.enableState;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarm setEscalations(DescribeMetricRuleListResponseBodyAlarmsAlarmEscalations escalations) {
            this.escalations = escalations;
            return this;
        }
        public DescribeMetricRuleListResponseBodyAlarmsAlarmEscalations getEscalations() {
            return this.escalations;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarm setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarm setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarm setLabels(DescribeMetricRuleListResponseBodyAlarmsAlarmLabels labels) {
            this.labels = labels;
            return this;
        }
        public DescribeMetricRuleListResponseBodyAlarmsAlarmLabels getLabels() {
            return this.labels;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarm setMailSubject(String mailSubject) {
            this.mailSubject = mailSubject;
            return this;
        }
        public String getMailSubject() {
            return this.mailSubject;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarm setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarm setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarm setNoDataPolicy(String noDataPolicy) {
            this.noDataPolicy = noDataPolicy;
            return this;
        }
        public String getNoDataPolicy() {
            return this.noDataPolicy;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarm setNoEffectiveInterval(String noEffectiveInterval) {
            this.noEffectiveInterval = noEffectiveInterval;
            return this;
        }
        public String getNoEffectiveInterval() {
            return this.noEffectiveInterval;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarm setPeriod(String period) {
            this.period = period;
            return this;
        }
        public String getPeriod() {
            return this.period;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarm setResources(String resources) {
            this.resources = resources;
            return this;
        }
        public String getResources() {
            return this.resources;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarm setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarm setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarm setSilenceTime(Integer silenceTime) {
            this.silenceTime = silenceTime;
            return this;
        }
        public Integer getSilenceTime() {
            return this.silenceTime;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarm setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarm setWebhook(String webhook) {
            this.webhook = webhook;
            return this;
        }
        public String getWebhook() {
            return this.webhook;
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
