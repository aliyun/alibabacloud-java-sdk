// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ApplyMetricRuleTemplateResponse extends TeaModel {
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
    public ApplyMetricRuleTemplateResponseResource resource;

    public static ApplyMetricRuleTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyMetricRuleTemplateResponse self = new ApplyMetricRuleTemplateResponse();
        return TeaModel.build(map, self);
    }

    public static class ApplyMetricRuleTemplateResponseResourceAlertResults extends TeaModel {
        @NameInMap("GroupId")
        @Validation(required = true)
        public Long groupId;

        @NameInMap("RuleId")
        @Validation(required = true)
        public String ruleId;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        @NameInMap("RuleName")
        @Validation(required = true)
        public String ruleName;

        @NameInMap("Code")
        @Validation(required = true)
        public String code;

        @NameInMap("Success")
        @Validation(required = true)
        public Boolean success;

        public static ApplyMetricRuleTemplateResponseResourceAlertResults build(java.util.Map<String, ?> map) throws Exception {
            ApplyMetricRuleTemplateResponseResourceAlertResults self = new ApplyMetricRuleTemplateResponseResourceAlertResults();
            return TeaModel.build(map, self);
        }

    }

    public static class ApplyMetricRuleTemplateResponseResource extends TeaModel {
        @NameInMap("GroupId")
        @Validation(required = true)
        public Long groupId;

        @NameInMap("AlertResults")
        @Validation(required = true)
        public java.util.List<ApplyMetricRuleTemplateResponseResourceAlertResults> alertResults;

        public static ApplyMetricRuleTemplateResponseResource build(java.util.Map<String, ?> map) throws Exception {
            ApplyMetricRuleTemplateResponseResource self = new ApplyMetricRuleTemplateResponseResource();
            return TeaModel.build(map, self);
        }

    }

}
