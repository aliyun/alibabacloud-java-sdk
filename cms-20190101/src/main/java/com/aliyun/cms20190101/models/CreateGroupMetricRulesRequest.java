// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateGroupMetricRulesRequest extends TeaModel {
    @NameInMap("GroupId")
    @Validation(required = true)
    public Long groupId;

    @NameInMap("GroupMetricRules")
    public java.util.List<CreateGroupMetricRulesRequestGroupMetricRules> groupMetricRules;

    public static CreateGroupMetricRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupMetricRulesRequest self = new CreateGroupMetricRulesRequest();
        return TeaModel.build(map, self);
    }

    public static class CreateGroupMetricRulesRequestGroupMetricRulesEscalationsCritical extends TeaModel {
        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Times")
        public Integer times;

        public static CreateGroupMetricRulesRequestGroupMetricRulesEscalationsCritical build(java.util.Map<String, ?> map) throws Exception {
            CreateGroupMetricRulesRequestGroupMetricRulesEscalationsCritical self = new CreateGroupMetricRulesRequestGroupMetricRulesEscalationsCritical();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateGroupMetricRulesRequestGroupMetricRulesEscalationsWarn extends TeaModel {
        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Times")
        public Integer times;

        public static CreateGroupMetricRulesRequestGroupMetricRulesEscalationsWarn build(java.util.Map<String, ?> map) throws Exception {
            CreateGroupMetricRulesRequestGroupMetricRulesEscalationsWarn self = new CreateGroupMetricRulesRequestGroupMetricRulesEscalationsWarn();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateGroupMetricRulesRequestGroupMetricRulesEscalationsInfo extends TeaModel {
        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Times")
        public Integer times;

        public static CreateGroupMetricRulesRequestGroupMetricRulesEscalationsInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateGroupMetricRulesRequestGroupMetricRulesEscalationsInfo self = new CreateGroupMetricRulesRequestGroupMetricRulesEscalationsInfo();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateGroupMetricRulesRequestGroupMetricRulesEscalations extends TeaModel {
        @NameInMap("Critical")
        @Validation(required = true)
        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsCritical critical;

        @NameInMap("Warn")
        @Validation(required = true)
        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsWarn warn;

        @NameInMap("Info")
        @Validation(required = true)
        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsInfo info;

        public static CreateGroupMetricRulesRequestGroupMetricRulesEscalations build(java.util.Map<String, ?> map) throws Exception {
            CreateGroupMetricRulesRequestGroupMetricRulesEscalations self = new CreateGroupMetricRulesRequestGroupMetricRulesEscalations();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateGroupMetricRulesRequestGroupMetricRules extends TeaModel {
        @NameInMap("Category")
        @Validation(required = true)
        public String category;

        @NameInMap("RuleName")
        @Validation(required = true)
        public String ruleName;

        @NameInMap("RuleId")
        @Validation(required = true)
        public String ruleId;

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
        public CreateGroupMetricRulesRequestGroupMetricRulesEscalations escalations;

        public static CreateGroupMetricRulesRequestGroupMetricRules build(java.util.Map<String, ?> map) throws Exception {
            CreateGroupMetricRulesRequestGroupMetricRules self = new CreateGroupMetricRulesRequestGroupMetricRules();
            return TeaModel.build(map, self);
        }

    }

}
