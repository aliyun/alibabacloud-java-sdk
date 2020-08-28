// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeActiveMetricRuleListResponse extends TeaModel {
    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Datapoints")
    @Validation(required = true)
    public DescribeActiveMetricRuleListResponseDatapoints datapoints;

    @NameInMap("AlertList")
    @Validation(required = true)
    public DescribeActiveMetricRuleListResponseAlertList alertList;

    public static DescribeActiveMetricRuleListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeActiveMetricRuleListResponse self = new DescribeActiveMetricRuleListResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeActiveMetricRuleListResponseDatapointsAlarm extends TeaModel {
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

        @NameInMap("Statistics")
        @Validation(required = true)
        public String statistics;

        @NameInMap("ComparisonOperator")
        @Validation(required = true)
        public String comparisonOperator;

        @NameInMap("Threshold")
        @Validation(required = true)
        public String threshold;

        @NameInMap("EvaluationCount")
        @Validation(required = true)
        public String evaluationCount;

        @NameInMap("StartTime")
        @Validation(required = true)
        public String startTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public String endTime;

        @NameInMap("SilenceTime")
        @Validation(required = true)
        public String silenceTime;

        @NameInMap("Enable")
        @Validation(required = true)
        public String enable;

        @NameInMap("State")
        @Validation(required = true)
        public String state;

        @NameInMap("ContactGroups")
        @Validation(required = true)
        public String contactGroups;

        @NameInMap("Webhook")
        @Validation(required = true)
        public String webhook;

        @NameInMap("RuleName")
        @Validation(required = true)
        public String ruleName;

        public static DescribeActiveMetricRuleListResponseDatapointsAlarm build(java.util.Map<String, ?> map) throws Exception {
            DescribeActiveMetricRuleListResponseDatapointsAlarm self = new DescribeActiveMetricRuleListResponseDatapointsAlarm();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeActiveMetricRuleListResponseDatapoints extends TeaModel {
        @NameInMap("Alarm")
        @Validation(required = true)
        public java.util.List<DescribeActiveMetricRuleListResponseDatapointsAlarm> alarm;

        public static DescribeActiveMetricRuleListResponseDatapoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeActiveMetricRuleListResponseDatapoints self = new DescribeActiveMetricRuleListResponseDatapoints();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeActiveMetricRuleListResponseAlertListAlertEscalationsInfo extends TeaModel {
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

        public static DescribeActiveMetricRuleListResponseAlertListAlertEscalationsInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeActiveMetricRuleListResponseAlertListAlertEscalationsInfo self = new DescribeActiveMetricRuleListResponseAlertListAlertEscalationsInfo();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeActiveMetricRuleListResponseAlertListAlertEscalationsWarn extends TeaModel {
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

        public static DescribeActiveMetricRuleListResponseAlertListAlertEscalationsWarn build(java.util.Map<String, ?> map) throws Exception {
            DescribeActiveMetricRuleListResponseAlertListAlertEscalationsWarn self = new DescribeActiveMetricRuleListResponseAlertListAlertEscalationsWarn();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeActiveMetricRuleListResponseAlertListAlertEscalationsCritical extends TeaModel {
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

        public static DescribeActiveMetricRuleListResponseAlertListAlertEscalationsCritical build(java.util.Map<String, ?> map) throws Exception {
            DescribeActiveMetricRuleListResponseAlertListAlertEscalationsCritical self = new DescribeActiveMetricRuleListResponseAlertListAlertEscalationsCritical();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeActiveMetricRuleListResponseAlertListAlertEscalations extends TeaModel {
        @NameInMap("Info")
        @Validation(required = true)
        public DescribeActiveMetricRuleListResponseAlertListAlertEscalationsInfo info;

        @NameInMap("Warn")
        @Validation(required = true)
        public DescribeActiveMetricRuleListResponseAlertListAlertEscalationsWarn warn;

        @NameInMap("Critical")
        @Validation(required = true)
        public DescribeActiveMetricRuleListResponseAlertListAlertEscalationsCritical critical;

        public static DescribeActiveMetricRuleListResponseAlertListAlertEscalations build(java.util.Map<String, ?> map) throws Exception {
            DescribeActiveMetricRuleListResponseAlertListAlertEscalations self = new DescribeActiveMetricRuleListResponseAlertListAlertEscalations();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeActiveMetricRuleListResponseAlertListAlert extends TeaModel {
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

        @NameInMap("Dimensions")
        @Validation(required = true)
        public String dimensions;

        @NameInMap("Escalations")
        @Validation(required = true)
        public DescribeActiveMetricRuleListResponseAlertListAlertEscalations escalations;

        public static DescribeActiveMetricRuleListResponseAlertListAlert build(java.util.Map<String, ?> map) throws Exception {
            DescribeActiveMetricRuleListResponseAlertListAlert self = new DescribeActiveMetricRuleListResponseAlertListAlert();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeActiveMetricRuleListResponseAlertList extends TeaModel {
        @NameInMap("Alert")
        @Validation(required = true)
        public java.util.List<DescribeActiveMetricRuleListResponseAlertListAlert> alert;

        public static DescribeActiveMetricRuleListResponseAlertList build(java.util.Map<String, ?> map) throws Exception {
            DescribeActiveMetricRuleListResponseAlertList self = new DescribeActiveMetricRuleListResponseAlertList();
            return TeaModel.build(map, self);
        }

    }

}
