// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateMetricRuleTemplateRequest extends TeaModel {
    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    @NameInMap("Description")
    public String description;

    @NameInMap("AlertTemplates")
    public java.util.List<CreateMetricRuleTemplateRequestAlertTemplates> alertTemplates;

    public static CreateMetricRuleTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMetricRuleTemplateRequest self = new CreateMetricRuleTemplateRequest();
        return TeaModel.build(map, self);
    }

    public static class CreateMetricRuleTemplateRequestAlertTemplatesEscalationsCritical extends TeaModel {
        @NameInMap("Statistics")
        @Validation(required = true)
        public String statistics;

        @NameInMap("ComparisonOperator")
        @Validation(required = true)
        public String comparisonOperator;

        @NameInMap("Threshold")
        @Validation(required = true)
        public String threshold;

        @NameInMap("Times")
        @Validation(required = true)
        public Integer times;

        public static CreateMetricRuleTemplateRequestAlertTemplatesEscalationsCritical build(java.util.Map<String, ?> map) throws Exception {
            CreateMetricRuleTemplateRequestAlertTemplatesEscalationsCritical self = new CreateMetricRuleTemplateRequestAlertTemplatesEscalationsCritical();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateMetricRuleTemplateRequestAlertTemplatesEscalationsWarn extends TeaModel {
        @NameInMap("Statistics")
        @Validation(required = true)
        public String statistics;

        @NameInMap("ComparisonOperator")
        @Validation(required = true)
        public String comparisonOperator;

        @NameInMap("Threshold")
        @Validation(required = true)
        public String threshold;

        @NameInMap("Times")
        @Validation(required = true)
        public Integer times;

        public static CreateMetricRuleTemplateRequestAlertTemplatesEscalationsWarn build(java.util.Map<String, ?> map) throws Exception {
            CreateMetricRuleTemplateRequestAlertTemplatesEscalationsWarn self = new CreateMetricRuleTemplateRequestAlertTemplatesEscalationsWarn();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateMetricRuleTemplateRequestAlertTemplatesEscalationsInfo extends TeaModel {
        @NameInMap("Statistics")
        @Validation(required = true)
        public String statistics;

        @NameInMap("ComparisonOperator")
        @Validation(required = true)
        public String comparisonOperator;

        @NameInMap("Threshold")
        @Validation(required = true)
        public String threshold;

        @NameInMap("Times")
        @Validation(required = true)
        public Integer times;

        public static CreateMetricRuleTemplateRequestAlertTemplatesEscalationsInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateMetricRuleTemplateRequestAlertTemplatesEscalationsInfo self = new CreateMetricRuleTemplateRequestAlertTemplatesEscalationsInfo();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateMetricRuleTemplateRequestAlertTemplatesEscalations extends TeaModel {
        @NameInMap("Critical")
        @Validation(required = true)
        public CreateMetricRuleTemplateRequestAlertTemplatesEscalationsCritical critical;

        @NameInMap("Warn")
        @Validation(required = true)
        public CreateMetricRuleTemplateRequestAlertTemplatesEscalationsWarn warn;

        @NameInMap("Info")
        @Validation(required = true)
        public CreateMetricRuleTemplateRequestAlertTemplatesEscalationsInfo info;

        public static CreateMetricRuleTemplateRequestAlertTemplatesEscalations build(java.util.Map<String, ?> map) throws Exception {
            CreateMetricRuleTemplateRequestAlertTemplatesEscalations self = new CreateMetricRuleTemplateRequestAlertTemplatesEscalations();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateMetricRuleTemplateRequestAlertTemplates extends TeaModel {
        @NameInMap("MetricName")
        @Validation(required = true)
        public String metricName;

        @NameInMap("RuleName")
        @Validation(required = true)
        public String ruleName;

        @NameInMap("Category")
        @Validation(required = true)
        public String category;

        @NameInMap("Namespace")
        @Validation(required = true)
        public String namespace;

        @NameInMap("Period")
        @Validation(required = true)
        public Integer period;

        @NameInMap("Selector")
        @Validation(required = true)
        public String selector;

        @NameInMap("Webhook")
        @Validation(required = true)
        public String webhook;

        @NameInMap("Escalations")
        @Validation(required = true)
        public CreateMetricRuleTemplateRequestAlertTemplatesEscalations escalations;

        public static CreateMetricRuleTemplateRequestAlertTemplates build(java.util.Map<String, ?> map) throws Exception {
            CreateMetricRuleTemplateRequestAlertTemplates self = new CreateMetricRuleTemplateRequestAlertTemplates();
            return TeaModel.build(map, self);
        }

    }

}
