// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricRuleTemplateAttributeResponse extends TeaModel {
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

    @NameInMap("Resource")
    @Validation(required = true)
    public DescribeMetricRuleTemplateAttributeResponseResource resource;

    public static DescribeMetricRuleTemplateAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricRuleTemplateAttributeResponse self = new DescribeMetricRuleTemplateAttributeResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeMetricRuleTemplateAttributeResponseResourceAlertTemplatesAlertTemplateEscalationsInfo extends TeaModel {
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

        public static DescribeMetricRuleTemplateAttributeResponseResourceAlertTemplatesAlertTemplateEscalationsInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleTemplateAttributeResponseResourceAlertTemplatesAlertTemplateEscalationsInfo self = new DescribeMetricRuleTemplateAttributeResponseResourceAlertTemplatesAlertTemplateEscalationsInfo();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMetricRuleTemplateAttributeResponseResourceAlertTemplatesAlertTemplateEscalationsWarn extends TeaModel {
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

        public static DescribeMetricRuleTemplateAttributeResponseResourceAlertTemplatesAlertTemplateEscalationsWarn build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleTemplateAttributeResponseResourceAlertTemplatesAlertTemplateEscalationsWarn self = new DescribeMetricRuleTemplateAttributeResponseResourceAlertTemplatesAlertTemplateEscalationsWarn();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMetricRuleTemplateAttributeResponseResourceAlertTemplatesAlertTemplateEscalationsCritical extends TeaModel {
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

        public static DescribeMetricRuleTemplateAttributeResponseResourceAlertTemplatesAlertTemplateEscalationsCritical build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleTemplateAttributeResponseResourceAlertTemplatesAlertTemplateEscalationsCritical self = new DescribeMetricRuleTemplateAttributeResponseResourceAlertTemplatesAlertTemplateEscalationsCritical();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMetricRuleTemplateAttributeResponseResourceAlertTemplatesAlertTemplateEscalations extends TeaModel {
        @NameInMap("Info")
        @Validation(required = true)
        public DescribeMetricRuleTemplateAttributeResponseResourceAlertTemplatesAlertTemplateEscalationsInfo info;

        @NameInMap("Warn")
        @Validation(required = true)
        public DescribeMetricRuleTemplateAttributeResponseResourceAlertTemplatesAlertTemplateEscalationsWarn warn;

        @NameInMap("Critical")
        @Validation(required = true)
        public DescribeMetricRuleTemplateAttributeResponseResourceAlertTemplatesAlertTemplateEscalationsCritical critical;

        public static DescribeMetricRuleTemplateAttributeResponseResourceAlertTemplatesAlertTemplateEscalations build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleTemplateAttributeResponseResourceAlertTemplatesAlertTemplateEscalations self = new DescribeMetricRuleTemplateAttributeResponseResourceAlertTemplatesAlertTemplateEscalations();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMetricRuleTemplateAttributeResponseResourceAlertTemplatesAlertTemplate extends TeaModel {
        @NameInMap("RuleName")
        @Validation(required = true)
        public String ruleName;

        @NameInMap("Category")
        @Validation(required = true)
        public String category;

        @NameInMap("Namespace")
        @Validation(required = true)
        public String namespace;

        @NameInMap("MetricName")
        @Validation(required = true)
        public String metricName;

        @NameInMap("Selector")
        @Validation(required = true)
        public String selector;

        @NameInMap("Webhook")
        @Validation(required = true)
        public String webhook;

        @NameInMap("Escalations")
        @Validation(required = true)
        public DescribeMetricRuleTemplateAttributeResponseResourceAlertTemplatesAlertTemplateEscalations escalations;

        public static DescribeMetricRuleTemplateAttributeResponseResourceAlertTemplatesAlertTemplate build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleTemplateAttributeResponseResourceAlertTemplatesAlertTemplate self = new DescribeMetricRuleTemplateAttributeResponseResourceAlertTemplatesAlertTemplate();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMetricRuleTemplateAttributeResponseResourceAlertTemplates extends TeaModel {
        @NameInMap("AlertTemplate")
        @Validation(required = true)
        public java.util.List<DescribeMetricRuleTemplateAttributeResponseResourceAlertTemplatesAlertTemplate> alertTemplate;

        public static DescribeMetricRuleTemplateAttributeResponseResourceAlertTemplates build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleTemplateAttributeResponseResourceAlertTemplates self = new DescribeMetricRuleTemplateAttributeResponseResourceAlertTemplates();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMetricRuleTemplateAttributeResponseResource extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("TemplateId")
        @Validation(required = true)
        public String templateId;

        @NameInMap("RestVersion")
        @Validation(required = true)
        public String restVersion;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("AlertTemplates")
        @Validation(required = true)
        public DescribeMetricRuleTemplateAttributeResponseResourceAlertTemplates alertTemplates;

        public static DescribeMetricRuleTemplateAttributeResponseResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleTemplateAttributeResponseResource self = new DescribeMetricRuleTemplateAttributeResponseResource();
            return TeaModel.build(map, self);
        }

    }

}
