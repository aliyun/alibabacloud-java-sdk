// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricRuleListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Total")
    @Validation(required = true)
    public String total;

    @NameInMap("Alarms")
    @Validation(required = true)
    public DescribeMetricRuleListResponseAlarms alarms;

    public static DescribeMetricRuleListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricRuleListResponse self = new DescribeMetricRuleListResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeMetricRuleListResponseAlarmsAlarmEscalationsInfo extends TeaModel {
        @NameInMap("ComparisonOperator")
        @Validation(required = true)
        public String comparisonOperator;

        @NameInMap("Statistics")
        @Validation(required = true)
        public String statistics;

        @NameInMap("Threshold")
        @Validation(required = true)
        public String threshold;

        @NameInMap("Times")
        @Validation(required = true)
        public String times;

        public static DescribeMetricRuleListResponseAlarmsAlarmEscalationsInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleListResponseAlarmsAlarmEscalationsInfo self = new DescribeMetricRuleListResponseAlarmsAlarmEscalationsInfo();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMetricRuleListResponseAlarmsAlarmEscalationsWarn extends TeaModel {
        @NameInMap("ComparisonOperator")
        @Validation(required = true)
        public String comparisonOperator;

        @NameInMap("Statistics")
        @Validation(required = true)
        public String statistics;

        @NameInMap("Threshold")
        @Validation(required = true)
        public String threshold;

        @NameInMap("Times")
        @Validation(required = true)
        public String times;

        public static DescribeMetricRuleListResponseAlarmsAlarmEscalationsWarn build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleListResponseAlarmsAlarmEscalationsWarn self = new DescribeMetricRuleListResponseAlarmsAlarmEscalationsWarn();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMetricRuleListResponseAlarmsAlarmEscalationsCritical extends TeaModel {
        @NameInMap("ComparisonOperator")
        @Validation(required = true)
        public String comparisonOperator;

        @NameInMap("Statistics")
        @Validation(required = true)
        public String statistics;

        @NameInMap("Threshold")
        @Validation(required = true)
        public String threshold;

        @NameInMap("Times")
        @Validation(required = true)
        public String times;

        public static DescribeMetricRuleListResponseAlarmsAlarmEscalationsCritical build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleListResponseAlarmsAlarmEscalationsCritical self = new DescribeMetricRuleListResponseAlarmsAlarmEscalationsCritical();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMetricRuleListResponseAlarmsAlarmEscalations extends TeaModel {
        @NameInMap("Info")
        @Validation(required = true)
        public DescribeMetricRuleListResponseAlarmsAlarmEscalationsInfo info;

        @NameInMap("Warn")
        @Validation(required = true)
        public DescribeMetricRuleListResponseAlarmsAlarmEscalationsWarn warn;

        @NameInMap("Critical")
        @Validation(required = true)
        public DescribeMetricRuleListResponseAlarmsAlarmEscalationsCritical critical;

        public static DescribeMetricRuleListResponseAlarmsAlarmEscalations build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleListResponseAlarmsAlarmEscalations self = new DescribeMetricRuleListResponseAlarmsAlarmEscalations();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMetricRuleListResponseAlarmsAlarm extends TeaModel {
        @NameInMap("RuleId")
        @Validation(required = true)
        public String ruleId;

        @NameInMap("Namespace")
        @Validation(required = true)
        public String namespace;

        @NameInMap("MetricName")
        @Validation(required = true)
        public String metricName;

        @NameInMap("Period")
        @Validation(required = true)
        public String period;

        @NameInMap("EffectiveInterval")
        @Validation(required = true)
        public String effectiveInterval;

        @NameInMap("NoEffectiveInterval")
        @Validation(required = true)
        public String noEffectiveInterval;

        @NameInMap("SilenceTime")
        @Validation(required = true)
        public String silenceTime;

        @NameInMap("EnableState")
        @Validation(required = true)
        public Boolean enableState;

        @NameInMap("AlertState")
        @Validation(required = true)
        public String alertState;

        @NameInMap("ContactGroups")
        @Validation(required = true)
        public String contactGroups;

        @NameInMap("Webhook")
        @Validation(required = true)
        public String webhook;

        @NameInMap("MailSubject")
        @Validation(required = true)
        public String mailSubject;

        @NameInMap("RuleName")
        @Validation(required = true)
        public String ruleName;

        @NameInMap("Resources")
        @Validation(required = true)
        public String resources;

        @NameInMap("GroupId")
        @Validation(required = true)
        public String groupId;

        @NameInMap("GroupName")
        @Validation(required = true)
        public String groupName;

        @NameInMap("Dimensions")
        @Validation(required = true)
        public String dimensions;

        @NameInMap("SourceType")
        @Validation(required = true)
        public String sourceType;

        @NameInMap("Escalations")
        @Validation(required = true)
        public DescribeMetricRuleListResponseAlarmsAlarmEscalations escalations;

        public static DescribeMetricRuleListResponseAlarmsAlarm build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleListResponseAlarmsAlarm self = new DescribeMetricRuleListResponseAlarmsAlarm();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMetricRuleListResponseAlarms extends TeaModel {
        @NameInMap("Alarm")
        @Validation(required = true)
        public java.util.List<DescribeMetricRuleListResponseAlarmsAlarm> alarm;

        public static DescribeMetricRuleListResponseAlarms build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleListResponseAlarms self = new DescribeMetricRuleListResponseAlarms();
            return TeaModel.build(map, self);
        }

    }

}
