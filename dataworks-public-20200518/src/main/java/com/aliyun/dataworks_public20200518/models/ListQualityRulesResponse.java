// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListQualityRulesResponse extends TeaModel {
    @NameInMap("ErrorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

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
    public ListQualityRulesResponseData data;

    public static ListQualityRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListQualityRulesResponse self = new ListQualityRulesResponse();
        return TeaModel.build(map, self);
    }

    public static class ListQualityRulesResponseDataRules extends TeaModel {
        @NameInMap("ProjectName")
        @Validation(required = true)
        public String projectName;

        @NameInMap("TableName")
        @Validation(required = true)
        public String tableName;

        @NameInMap("Id")
        @Validation(required = true)
        public Integer id;

        @NameInMap("EntityId")
        @Validation(required = true)
        public Integer entityId;

        @NameInMap("Property")
        @Validation(required = true)
        public String property;

        @NameInMap("MethodId")
        @Validation(required = true)
        public Integer methodId;

        @NameInMap("MethodName")
        @Validation(required = true)
        public String methodName;

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

        @NameInMap("RuleCheckerRelationId")
        @Validation(required = true)
        public Integer ruleCheckerRelationId;

        @NameInMap("CheckerId")
        @Validation(required = true)
        public Integer checkerId;

        @NameInMap("FixCheck")
        @Validation(required = true)
        public Boolean fixCheck;

        @NameInMap("Trend")
        @Validation(required = true)
        public String trend;

        @NameInMap("WarningThreshold")
        @Validation(required = true)
        public String warningThreshold;

        @NameInMap("CriticalThreshold")
        @Validation(required = true)
        public String criticalThreshold;

        @NameInMap("HistoryWarningThreshold")
        @Validation(required = true)
        public String historyWarningThreshold;

        @NameInMap("HistoryCriticalThreshold")
        @Validation(required = true)
        public String historyCriticalThreshold;

        @NameInMap("PropertyKey")
        @Validation(required = true)
        public String propertyKey;

        @NameInMap("MatchExpression")
        @Validation(required = true)
        public String matchExpression;

        @NameInMap("Comment")
        @Validation(required = true)
        public String comment;

        @NameInMap("ExpectValue")
        @Validation(required = true)
        public String expectValue;

        public static ListQualityRulesResponseDataRules build(java.util.Map<String, ?> map) throws Exception {
            ListQualityRulesResponseDataRules self = new ListQualityRulesResponseDataRules();
            return TeaModel.build(map, self);
        }

    }

    public static class ListQualityRulesResponseData extends TeaModel {
        @NameInMap("TotalCount")
        @Validation(required = true)
        public Long totalCount;

        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("Rules")
        @Validation(required = true)
        public java.util.List<ListQualityRulesResponseDataRules> rules;

        public static ListQualityRulesResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListQualityRulesResponseData self = new ListQualityRulesResponseData();
            return TeaModel.build(map, self);
        }

    }

}
