// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetQualityRuleResponse extends TeaModel {
    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public GetQualityRuleResponseData data;

    public static GetQualityRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQualityRuleResponse self = new GetQualityRuleResponse();
        return TeaModel.build(map, self);
    }

    public static class GetQualityRuleResponseData extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public Long id;

        @NameInMap("EntityId")
        @Validation(required = true)
        public Long entityId;

        @NameInMap("Property")
        @Validation(required = true)
        public String property;

        @NameInMap("MethodId")
        @Validation(required = true)
        public Integer methodId;

        @NameInMap("MethodName")
        @Validation(required = true)
        public String methodName;

        @NameInMap("WhereCondition")
        @Validation(required = true)
        public String whereCondition;

        @NameInMap("OnDuty")
        @Validation(required = true)
        public String onDuty;

        @NameInMap("RuleType")
        @Validation(required = true)
        public Integer ruleType;

        @NameInMap("BlockType")
        @Validation(required = true)
        public Integer blockType;

        @NameInMap("TemplateId")
        @Validation(required = true)
        public Integer templateId;

        @NameInMap("TemplateName")
        @Validation(required = true)
        public String templateName;

        @NameInMap("Comment")
        @Validation(required = true)
        public String comment;

        @NameInMap("RuleName")
        @Validation(required = true)
        public String ruleName;

        @NameInMap("PredictType")
        @Validation(required = true)
        public Integer predictType;

        @NameInMap("WarningThreshold")
        @Validation(required = true)
        public String warningThreshold;

        @NameInMap("CriticalThreshold")
        @Validation(required = true)
        public String criticalThreshold;

        @NameInMap("Operator")
        @Validation(required = true)
        public String operator;

        @NameInMap("ExpectValue")
        @Validation(required = true)
        public String expectValue;

        @NameInMap("Trend")
        @Validation(required = true)
        public String trend;

        @NameInMap("CheckerName")
        @Validation(required = true)
        public String checkerName;

        @NameInMap("Checker")
        @Validation(required = true)
        public Integer checker;

        @NameInMap("FixCheck")
        @Validation(required = true)
        public Boolean fixCheck;

        public static GetQualityRuleResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetQualityRuleResponseData self = new GetQualityRuleResponseData();
            return TeaModel.build(map, self);
        }

    }

}
