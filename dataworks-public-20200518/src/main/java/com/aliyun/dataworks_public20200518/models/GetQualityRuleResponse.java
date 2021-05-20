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

    public GetQualityRuleResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetQualityRuleResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetQualityRuleResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetQualityRuleResponse setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetQualityRuleResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQualityRuleResponse setData(GetQualityRuleResponseData data) {
        this.data = data;
        return this;
    }
    public GetQualityRuleResponseData getData() {
        return this.data;
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

        @NameInMap("OnDutyAccountName")
        @Validation(required = true)
        public String onDutyAccountName;

        public static GetQualityRuleResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetQualityRuleResponseData self = new GetQualityRuleResponseData();
            return TeaModel.build(map, self);
        }

        public GetQualityRuleResponseData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetQualityRuleResponseData setEntityId(Long entityId) {
            this.entityId = entityId;
            return this;
        }
        public Long getEntityId() {
            return this.entityId;
        }

        public GetQualityRuleResponseData setProperty(String property) {
            this.property = property;
            return this;
        }
        public String getProperty() {
            return this.property;
        }

        public GetQualityRuleResponseData setMethodId(Integer methodId) {
            this.methodId = methodId;
            return this;
        }
        public Integer getMethodId() {
            return this.methodId;
        }

        public GetQualityRuleResponseData setMethodName(String methodName) {
            this.methodName = methodName;
            return this;
        }
        public String getMethodName() {
            return this.methodName;
        }

        public GetQualityRuleResponseData setWhereCondition(String whereCondition) {
            this.whereCondition = whereCondition;
            return this;
        }
        public String getWhereCondition() {
            return this.whereCondition;
        }

        public GetQualityRuleResponseData setOnDuty(String onDuty) {
            this.onDuty = onDuty;
            return this;
        }
        public String getOnDuty() {
            return this.onDuty;
        }

        public GetQualityRuleResponseData setRuleType(Integer ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public Integer getRuleType() {
            return this.ruleType;
        }

        public GetQualityRuleResponseData setBlockType(Integer blockType) {
            this.blockType = blockType;
            return this;
        }
        public Integer getBlockType() {
            return this.blockType;
        }

        public GetQualityRuleResponseData setTemplateId(Integer templateId) {
            this.templateId = templateId;
            return this;
        }
        public Integer getTemplateId() {
            return this.templateId;
        }

        public GetQualityRuleResponseData setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public GetQualityRuleResponseData setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetQualityRuleResponseData setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public GetQualityRuleResponseData setPredictType(Integer predictType) {
            this.predictType = predictType;
            return this;
        }
        public Integer getPredictType() {
            return this.predictType;
        }

        public GetQualityRuleResponseData setWarningThreshold(String warningThreshold) {
            this.warningThreshold = warningThreshold;
            return this;
        }
        public String getWarningThreshold() {
            return this.warningThreshold;
        }

        public GetQualityRuleResponseData setCriticalThreshold(String criticalThreshold) {
            this.criticalThreshold = criticalThreshold;
            return this;
        }
        public String getCriticalThreshold() {
            return this.criticalThreshold;
        }

        public GetQualityRuleResponseData setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetQualityRuleResponseData setExpectValue(String expectValue) {
            this.expectValue = expectValue;
            return this;
        }
        public String getExpectValue() {
            return this.expectValue;
        }

        public GetQualityRuleResponseData setTrend(String trend) {
            this.trend = trend;
            return this;
        }
        public String getTrend() {
            return this.trend;
        }

        public GetQualityRuleResponseData setCheckerName(String checkerName) {
            this.checkerName = checkerName;
            return this;
        }
        public String getCheckerName() {
            return this.checkerName;
        }

        public GetQualityRuleResponseData setChecker(Integer checker) {
            this.checker = checker;
            return this;
        }
        public Integer getChecker() {
            return this.checker;
        }

        public GetQualityRuleResponseData setFixCheck(Boolean fixCheck) {
            this.fixCheck = fixCheck;
            return this;
        }
        public Boolean getFixCheck() {
            return this.fixCheck;
        }

        public GetQualityRuleResponseData setOnDutyAccountName(String onDutyAccountName) {
            this.onDutyAccountName = onDutyAccountName;
            return this;
        }
        public String getOnDutyAccountName() {
            return this.onDutyAccountName;
        }

    }

}
