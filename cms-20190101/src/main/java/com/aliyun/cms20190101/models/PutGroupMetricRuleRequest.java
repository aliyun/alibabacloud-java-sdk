// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutGroupMetricRuleRequest extends TeaModel {
    @NameInMap("GroupId")
    @Validation(required = true)
    public String groupId;

    @NameInMap("RuleId")
    @Validation(required = true)
    public String ruleId;

    @NameInMap("Category")
    @Validation(required = true)
    public String category;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("Namespace")
    @Validation(required = true)
    public String namespace;

    @NameInMap("MetricName")
    @Validation(required = true)
    public String metricName;

    @NameInMap("Dimensions")
    public String dimensions;

    @NameInMap("EffectiveInterval")
    public String effectiveInterval;

    @NameInMap("NoEffectiveInterval")
    public String noEffectiveInterval;

    @NameInMap("SilenceTime")
    public Integer silenceTime;

    @NameInMap("Period")
    public String period;

    @NameInMap("Interval")
    public String interval;

    @NameInMap("Webhook")
    public String webhook;

    @NameInMap("EmailSubject")
    public String emailSubject;

    @NameInMap("Escalations")
    @Validation(required = true)
    public PutGroupMetricRuleRequestEscalations escalations;

    public static PutGroupMetricRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        PutGroupMetricRuleRequest self = new PutGroupMetricRuleRequest();
        return TeaModel.build(map, self);
    }

    public static class PutGroupMetricRuleRequestEscalationsCritical extends TeaModel {
        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Times")
        public Integer times;

        public static PutGroupMetricRuleRequestEscalationsCritical build(java.util.Map<String, ?> map) throws Exception {
            PutGroupMetricRuleRequestEscalationsCritical self = new PutGroupMetricRuleRequestEscalationsCritical();
            return TeaModel.build(map, self);
        }

    }

    public static class PutGroupMetricRuleRequestEscalationsWarn extends TeaModel {
        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Times")
        public Integer times;

        public static PutGroupMetricRuleRequestEscalationsWarn build(java.util.Map<String, ?> map) throws Exception {
            PutGroupMetricRuleRequestEscalationsWarn self = new PutGroupMetricRuleRequestEscalationsWarn();
            return TeaModel.build(map, self);
        }

    }

    public static class PutGroupMetricRuleRequestEscalationsInfo extends TeaModel {
        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Times")
        public Integer times;

        public static PutGroupMetricRuleRequestEscalationsInfo build(java.util.Map<String, ?> map) throws Exception {
            PutGroupMetricRuleRequestEscalationsInfo self = new PutGroupMetricRuleRequestEscalationsInfo();
            return TeaModel.build(map, self);
        }

    }

    public static class PutGroupMetricRuleRequestEscalations extends TeaModel {
        @NameInMap("Critical")
        @Validation(required = true)
        public PutGroupMetricRuleRequestEscalationsCritical critical;

        @NameInMap("Warn")
        @Validation(required = true)
        public PutGroupMetricRuleRequestEscalationsWarn warn;

        @NameInMap("Info")
        @Validation(required = true)
        public PutGroupMetricRuleRequestEscalationsInfo info;

        public static PutGroupMetricRuleRequestEscalations build(java.util.Map<String, ?> map) throws Exception {
            PutGroupMetricRuleRequestEscalations self = new PutGroupMetricRuleRequestEscalations();
            return TeaModel.build(map, self);
        }

    }

}
