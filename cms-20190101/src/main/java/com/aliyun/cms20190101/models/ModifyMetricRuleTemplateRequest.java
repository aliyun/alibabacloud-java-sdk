// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ModifyMetricRuleTemplateRequest extends TeaModel {
    @NameInMap("TemplateId")
    @Validation(required = true)
    public Long templateId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    @NameInMap("RestVersion")
    @Validation(required = true)
    public Long restVersion;

    @NameInMap("AlertTemplates")
    public java.util.List<ModifyMetricRuleTemplateRequestAlertTemplates> alertTemplates;

    public static ModifyMetricRuleTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyMetricRuleTemplateRequest self = new ModifyMetricRuleTemplateRequest();
        return TeaModel.build(map, self);
    }

    public static class ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsCritical extends TeaModel {
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

        public static ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsCritical build(java.util.Map<String, ?> map) throws Exception {
            ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsCritical self = new ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsCritical();
            return TeaModel.build(map, self);
        }

    }

    public static class ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsWarn extends TeaModel {
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

        public static ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsWarn build(java.util.Map<String, ?> map) throws Exception {
            ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsWarn self = new ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsWarn();
            return TeaModel.build(map, self);
        }

    }

    public static class ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsInfo extends TeaModel {
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

        public static ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsInfo build(java.util.Map<String, ?> map) throws Exception {
            ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsInfo self = new ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsInfo();
            return TeaModel.build(map, self);
        }

    }

    public static class ModifyMetricRuleTemplateRequestAlertTemplatesEscalations extends TeaModel {
        @NameInMap("Critical")
        @Validation(required = true)
        public ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsCritical critical;

        @NameInMap("Warn")
        @Validation(required = true)
        public ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsWarn warn;

        @NameInMap("Info")
        @Validation(required = true)
        public ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsInfo info;

        public static ModifyMetricRuleTemplateRequestAlertTemplatesEscalations build(java.util.Map<String, ?> map) throws Exception {
            ModifyMetricRuleTemplateRequestAlertTemplatesEscalations self = new ModifyMetricRuleTemplateRequestAlertTemplatesEscalations();
            return TeaModel.build(map, self);
        }

    }

    public static class ModifyMetricRuleTemplateRequestAlertTemplates extends TeaModel {
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
        public ModifyMetricRuleTemplateRequestAlertTemplatesEscalations escalations;

        public static ModifyMetricRuleTemplateRequestAlertTemplates build(java.util.Map<String, ?> map) throws Exception {
            ModifyMetricRuleTemplateRequestAlertTemplates self = new ModifyMetricRuleTemplateRequestAlertTemplates();
            return TeaModel.build(map, self);
        }

    }

}
