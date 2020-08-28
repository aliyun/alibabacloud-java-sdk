// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutResourceMetricRuleRequest extends TeaModel {
    @NameInMap("RuleId")
    @Validation(required = true)
    public String ruleId;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("Namespace")
    @Validation(required = true)
    public String namespace;

    @NameInMap("MetricName")
    @Validation(required = true)
    public String metricName;

    @NameInMap("Resources")
    @Validation(required = true)
    public String resources;

    @NameInMap("ContactGroups")
    @Validation(required = true)
    public String contactGroups;

    @NameInMap("Webhook")
    public String webhook;

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

    @NameInMap("EmailSubject")
    public String emailSubject;

    @NameInMap("Escalations")
    @Validation(required = true)
    public PutResourceMetricRuleRequestEscalations escalations;

    public static PutResourceMetricRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        PutResourceMetricRuleRequest self = new PutResourceMetricRuleRequest();
        return TeaModel.build(map, self);
    }

    public static class PutResourceMetricRuleRequestEscalationsCritical extends TeaModel {
        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Times")
        public Integer times;

        public static PutResourceMetricRuleRequestEscalationsCritical build(java.util.Map<String, ?> map) throws Exception {
            PutResourceMetricRuleRequestEscalationsCritical self = new PutResourceMetricRuleRequestEscalationsCritical();
            return TeaModel.build(map, self);
        }

    }

    public static class PutResourceMetricRuleRequestEscalationsWarn extends TeaModel {
        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Times")
        public Integer times;

        public static PutResourceMetricRuleRequestEscalationsWarn build(java.util.Map<String, ?> map) throws Exception {
            PutResourceMetricRuleRequestEscalationsWarn self = new PutResourceMetricRuleRequestEscalationsWarn();
            return TeaModel.build(map, self);
        }

    }

    public static class PutResourceMetricRuleRequestEscalationsInfo extends TeaModel {
        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Times")
        public Integer times;

        public static PutResourceMetricRuleRequestEscalationsInfo build(java.util.Map<String, ?> map) throws Exception {
            PutResourceMetricRuleRequestEscalationsInfo self = new PutResourceMetricRuleRequestEscalationsInfo();
            return TeaModel.build(map, self);
        }

    }

    public static class PutResourceMetricRuleRequestEscalations extends TeaModel {
        @NameInMap("Critical")
        @Validation(required = true)
        public PutResourceMetricRuleRequestEscalationsCritical critical;

        @NameInMap("Warn")
        @Validation(required = true)
        public PutResourceMetricRuleRequestEscalationsWarn warn;

        @NameInMap("Info")
        @Validation(required = true)
        public PutResourceMetricRuleRequestEscalationsInfo info;

        public static PutResourceMetricRuleRequestEscalations build(java.util.Map<String, ?> map) throws Exception {
            PutResourceMetricRuleRequestEscalations self = new PutResourceMetricRuleRequestEscalations();
            return TeaModel.build(map, self);
        }

    }

}
