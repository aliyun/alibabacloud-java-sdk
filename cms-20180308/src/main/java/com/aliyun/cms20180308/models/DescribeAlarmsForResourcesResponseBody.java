// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class DescribeAlarmsForResourcesResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Datapoints")
    public DescribeAlarmsForResourcesResponseBodyDatapoints datapoints;

    @NameInMap("Dimensions")
    public String dimensions;

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

    public static DescribeAlarmsForResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlarmsForResourcesResponseBody self = new DescribeAlarmsForResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAlarmsForResourcesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeAlarmsForResourcesResponseBody setDatapoints(DescribeAlarmsForResourcesResponseBodyDatapoints datapoints) {
        this.datapoints = datapoints;
        return this;
    }
    public DescribeAlarmsForResourcesResponseBodyDatapoints getDatapoints() {
        return this.datapoints;
    }

    public DescribeAlarmsForResourcesResponseBody setDimensions(String dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public String getDimensions() {
        return this.dimensions;
    }

    public DescribeAlarmsForResourcesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAlarmsForResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAlarmsForResourcesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeAlarmsForResourcesResponseBody setTotal(String total) {
        this.total = total;
        return this;
    }
    public String getTotal() {
        return this.total;
    }

    public DescribeAlarmsForResourcesResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class DescribeAlarmsForResourcesResponseBodyDatapointsAlarmEscalationsCritical extends TeaModel {
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Times")
        public String times;

        public static DescribeAlarmsForResourcesResponseBodyDatapointsAlarmEscalationsCritical build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlarmsForResourcesResponseBodyDatapointsAlarmEscalationsCritical self = new DescribeAlarmsForResourcesResponseBodyDatapointsAlarmEscalationsCritical();
            return TeaModel.build(map, self);
        }

        public DescribeAlarmsForResourcesResponseBodyDatapointsAlarmEscalationsCritical setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public DescribeAlarmsForResourcesResponseBodyDatapointsAlarmEscalationsCritical setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public DescribeAlarmsForResourcesResponseBodyDatapointsAlarmEscalationsCritical setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public DescribeAlarmsForResourcesResponseBodyDatapointsAlarmEscalationsCritical setTimes(String times) {
            this.times = times;
            return this;
        }
        public String getTimes() {
            return this.times;
        }

    }

    public static class DescribeAlarmsForResourcesResponseBodyDatapointsAlarmEscalationsInfo extends TeaModel {
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Times")
        public String times;

        public static DescribeAlarmsForResourcesResponseBodyDatapointsAlarmEscalationsInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlarmsForResourcesResponseBodyDatapointsAlarmEscalationsInfo self = new DescribeAlarmsForResourcesResponseBodyDatapointsAlarmEscalationsInfo();
            return TeaModel.build(map, self);
        }

        public DescribeAlarmsForResourcesResponseBodyDatapointsAlarmEscalationsInfo setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public DescribeAlarmsForResourcesResponseBodyDatapointsAlarmEscalationsInfo setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public DescribeAlarmsForResourcesResponseBodyDatapointsAlarmEscalationsInfo setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public DescribeAlarmsForResourcesResponseBodyDatapointsAlarmEscalationsInfo setTimes(String times) {
            this.times = times;
            return this;
        }
        public String getTimes() {
            return this.times;
        }

    }

    public static class DescribeAlarmsForResourcesResponseBodyDatapointsAlarmEscalationsWarn extends TeaModel {
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Times")
        public String times;

        public static DescribeAlarmsForResourcesResponseBodyDatapointsAlarmEscalationsWarn build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlarmsForResourcesResponseBodyDatapointsAlarmEscalationsWarn self = new DescribeAlarmsForResourcesResponseBodyDatapointsAlarmEscalationsWarn();
            return TeaModel.build(map, self);
        }

        public DescribeAlarmsForResourcesResponseBodyDatapointsAlarmEscalationsWarn setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public DescribeAlarmsForResourcesResponseBodyDatapointsAlarmEscalationsWarn setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public DescribeAlarmsForResourcesResponseBodyDatapointsAlarmEscalationsWarn setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public DescribeAlarmsForResourcesResponseBodyDatapointsAlarmEscalationsWarn setTimes(String times) {
            this.times = times;
            return this;
        }
        public String getTimes() {
            return this.times;
        }

    }

    public static class DescribeAlarmsForResourcesResponseBodyDatapointsAlarmEscalations extends TeaModel {
        @NameInMap("Critical")
        public DescribeAlarmsForResourcesResponseBodyDatapointsAlarmEscalationsCritical critical;

        @NameInMap("Info")
        public DescribeAlarmsForResourcesResponseBodyDatapointsAlarmEscalationsInfo info;

        @NameInMap("Warn")
        public DescribeAlarmsForResourcesResponseBodyDatapointsAlarmEscalationsWarn warn;

        public static DescribeAlarmsForResourcesResponseBodyDatapointsAlarmEscalations build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlarmsForResourcesResponseBodyDatapointsAlarmEscalations self = new DescribeAlarmsForResourcesResponseBodyDatapointsAlarmEscalations();
            return TeaModel.build(map, self);
        }

        public DescribeAlarmsForResourcesResponseBodyDatapointsAlarmEscalations setCritical(DescribeAlarmsForResourcesResponseBodyDatapointsAlarmEscalationsCritical critical) {
            this.critical = critical;
            return this;
        }
        public DescribeAlarmsForResourcesResponseBodyDatapointsAlarmEscalationsCritical getCritical() {
            return this.critical;
        }

        public DescribeAlarmsForResourcesResponseBodyDatapointsAlarmEscalations setInfo(DescribeAlarmsForResourcesResponseBodyDatapointsAlarmEscalationsInfo info) {
            this.info = info;
            return this;
        }
        public DescribeAlarmsForResourcesResponseBodyDatapointsAlarmEscalationsInfo getInfo() {
            return this.info;
        }

        public DescribeAlarmsForResourcesResponseBodyDatapointsAlarmEscalations setWarn(DescribeAlarmsForResourcesResponseBodyDatapointsAlarmEscalationsWarn warn) {
            this.warn = warn;
            return this;
        }
        public DescribeAlarmsForResourcesResponseBodyDatapointsAlarmEscalationsWarn getWarn() {
            return this.warn;
        }

    }

    public static class DescribeAlarmsForResourcesResponseBodyDatapointsAlarm extends TeaModel {
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("ContactGroups")
        public String contactGroups;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("EffectiveInterval")
        public String effectiveInterval;

        @NameInMap("Enable")
        public Boolean enable;

        @NameInMap("Escalations")
        public DescribeAlarmsForResourcesResponseBodyDatapointsAlarmEscalations escalations;

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

        public static DescribeAlarmsForResourcesResponseBodyDatapointsAlarm build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlarmsForResourcesResponseBodyDatapointsAlarm self = new DescribeAlarmsForResourcesResponseBodyDatapointsAlarm();
            return TeaModel.build(map, self);
        }

        public DescribeAlarmsForResourcesResponseBodyDatapointsAlarm setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public DescribeAlarmsForResourcesResponseBodyDatapointsAlarm setContactGroups(String contactGroups) {
            this.contactGroups = contactGroups;
            return this;
        }
        public String getContactGroups() {
            return this.contactGroups;
        }

        public DescribeAlarmsForResourcesResponseBodyDatapointsAlarm setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public DescribeAlarmsForResourcesResponseBodyDatapointsAlarm setEffectiveInterval(String effectiveInterval) {
            this.effectiveInterval = effectiveInterval;
            return this;
        }
        public String getEffectiveInterval() {
            return this.effectiveInterval;
        }

        public DescribeAlarmsForResourcesResponseBodyDatapointsAlarm setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public DescribeAlarmsForResourcesResponseBodyDatapointsAlarm setEscalations(DescribeAlarmsForResourcesResponseBodyDatapointsAlarmEscalations escalations) {
            this.escalations = escalations;
            return this;
        }
        public DescribeAlarmsForResourcesResponseBodyDatapointsAlarmEscalations getEscalations() {
            return this.escalations;
        }

        public DescribeAlarmsForResourcesResponseBodyDatapointsAlarm setEvaluationCount(String evaluationCount) {
            this.evaluationCount = evaluationCount;
            return this;
        }
        public String getEvaluationCount() {
            return this.evaluationCount;
        }

        public DescribeAlarmsForResourcesResponseBodyDatapointsAlarm setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeAlarmsForResourcesResponseBodyDatapointsAlarm setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeAlarmsForResourcesResponseBodyDatapointsAlarm setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeAlarmsForResourcesResponseBodyDatapointsAlarm setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeAlarmsForResourcesResponseBodyDatapointsAlarm setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAlarmsForResourcesResponseBodyDatapointsAlarm setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeAlarmsForResourcesResponseBodyDatapointsAlarm setNoEffectiveInterval(String noEffectiveInterval) {
            this.noEffectiveInterval = noEffectiveInterval;
            return this;
        }
        public String getNoEffectiveInterval() {
            return this.noEffectiveInterval;
        }

        public DescribeAlarmsForResourcesResponseBodyDatapointsAlarm setPeriod(String period) {
            this.period = period;
            return this;
        }
        public String getPeriod() {
            return this.period;
        }

        public DescribeAlarmsForResourcesResponseBodyDatapointsAlarm setResources(String resources) {
            this.resources = resources;
            return this;
        }
        public String getResources() {
            return this.resources;
        }

        public DescribeAlarmsForResourcesResponseBodyDatapointsAlarm setSilenceTime(String silenceTime) {
            this.silenceTime = silenceTime;
            return this;
        }
        public String getSilenceTime() {
            return this.silenceTime;
        }

        public DescribeAlarmsForResourcesResponseBodyDatapointsAlarm setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeAlarmsForResourcesResponseBodyDatapointsAlarm setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public DescribeAlarmsForResourcesResponseBodyDatapointsAlarm setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

        public DescribeAlarmsForResourcesResponseBodyDatapointsAlarm setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public DescribeAlarmsForResourcesResponseBodyDatapointsAlarm setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public DescribeAlarmsForResourcesResponseBodyDatapointsAlarm setWebhook(String webhook) {
            this.webhook = webhook;
            return this;
        }
        public String getWebhook() {
            return this.webhook;
        }

    }

    public static class DescribeAlarmsForResourcesResponseBodyDatapoints extends TeaModel {
        @NameInMap("Alarm")
        public java.util.List<DescribeAlarmsForResourcesResponseBodyDatapointsAlarm> alarm;

        public static DescribeAlarmsForResourcesResponseBodyDatapoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlarmsForResourcesResponseBodyDatapoints self = new DescribeAlarmsForResourcesResponseBodyDatapoints();
            return TeaModel.build(map, self);
        }

        public DescribeAlarmsForResourcesResponseBodyDatapoints setAlarm(java.util.List<DescribeAlarmsForResourcesResponseBodyDatapointsAlarm> alarm) {
            this.alarm = alarm;
            return this;
        }
        public java.util.List<DescribeAlarmsForResourcesResponseBodyDatapointsAlarm> getAlarm() {
            return this.alarm;
        }

    }

}
