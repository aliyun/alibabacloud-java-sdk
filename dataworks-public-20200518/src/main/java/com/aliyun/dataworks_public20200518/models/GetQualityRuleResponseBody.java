// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetQualityRuleResponseBody extends TeaModel {
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public GetQualityRuleResponseBodyData data;

    public static GetQualityRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQualityRuleResponseBody self = new GetQualityRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQualityRuleResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetQualityRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQualityRuleResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetQualityRuleResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetQualityRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetQualityRuleResponseBody setData(GetQualityRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetQualityRuleResponseBodyData getData() {
        return this.data;
    }

    public static class GetQualityRuleResponseBodyData extends TeaModel {
        @NameInMap("BlockType")
        public Integer blockType;

        @NameInMap("OnDutyAccountName")
        public String onDutyAccountName;

        @NameInMap("WarningThreshold")
        public String warningThreshold;

        @NameInMap("Property")
        public String property;

        @NameInMap("RuleType")
        public Integer ruleType;

        @NameInMap("Comment")
        public String comment;

        @NameInMap("OnDuty")
        public String onDuty;

        @NameInMap("Checker")
        public Integer checker;

        @NameInMap("FixCheck")
        public Boolean fixCheck;

        @NameInMap("MethodId")
        public Integer methodId;

        @NameInMap("CriticalThreshold")
        public String criticalThreshold;

        @NameInMap("PredictType")
        public Integer predictType;

        @NameInMap("TemplateName")
        public String templateName;

        @NameInMap("CheckerName")
        public String checkerName;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("MethodName")
        public String methodName;

        @NameInMap("EntityId")
        public Long entityId;

        @NameInMap("WhereCondition")
        public String whereCondition;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("ExpectValue")
        public String expectValue;

        @NameInMap("Trend")
        public String trend;

        @NameInMap("TemplateId")
        public Integer templateId;

        @NameInMap("Id")
        public Long id;

        public static GetQualityRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetQualityRuleResponseBodyData self = new GetQualityRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetQualityRuleResponseBodyData setBlockType(Integer blockType) {
            this.blockType = blockType;
            return this;
        }
        public Integer getBlockType() {
            return this.blockType;
        }

        public GetQualityRuleResponseBodyData setOnDutyAccountName(String onDutyAccountName) {
            this.onDutyAccountName = onDutyAccountName;
            return this;
        }
        public String getOnDutyAccountName() {
            return this.onDutyAccountName;
        }

        public GetQualityRuleResponseBodyData setWarningThreshold(String warningThreshold) {
            this.warningThreshold = warningThreshold;
            return this;
        }
        public String getWarningThreshold() {
            return this.warningThreshold;
        }

        public GetQualityRuleResponseBodyData setProperty(String property) {
            this.property = property;
            return this;
        }
        public String getProperty() {
            return this.property;
        }

        public GetQualityRuleResponseBodyData setRuleType(Integer ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public Integer getRuleType() {
            return this.ruleType;
        }

        public GetQualityRuleResponseBodyData setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetQualityRuleResponseBodyData setOnDuty(String onDuty) {
            this.onDuty = onDuty;
            return this;
        }
        public String getOnDuty() {
            return this.onDuty;
        }

        public GetQualityRuleResponseBodyData setChecker(Integer checker) {
            this.checker = checker;
            return this;
        }
        public Integer getChecker() {
            return this.checker;
        }

        public GetQualityRuleResponseBodyData setFixCheck(Boolean fixCheck) {
            this.fixCheck = fixCheck;
            return this;
        }
        public Boolean getFixCheck() {
            return this.fixCheck;
        }

        public GetQualityRuleResponseBodyData setMethodId(Integer methodId) {
            this.methodId = methodId;
            return this;
        }
        public Integer getMethodId() {
            return this.methodId;
        }

        public GetQualityRuleResponseBodyData setCriticalThreshold(String criticalThreshold) {
            this.criticalThreshold = criticalThreshold;
            return this;
        }
        public String getCriticalThreshold() {
            return this.criticalThreshold;
        }

        public GetQualityRuleResponseBodyData setPredictType(Integer predictType) {
            this.predictType = predictType;
            return this;
        }
        public Integer getPredictType() {
            return this.predictType;
        }

        public GetQualityRuleResponseBodyData setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public GetQualityRuleResponseBodyData setCheckerName(String checkerName) {
            this.checkerName = checkerName;
            return this;
        }
        public String getCheckerName() {
            return this.checkerName;
        }

        public GetQualityRuleResponseBodyData setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public GetQualityRuleResponseBodyData setMethodName(String methodName) {
            this.methodName = methodName;
            return this;
        }
        public String getMethodName() {
            return this.methodName;
        }

        public GetQualityRuleResponseBodyData setEntityId(Long entityId) {
            this.entityId = entityId;
            return this;
        }
        public Long getEntityId() {
            return this.entityId;
        }

        public GetQualityRuleResponseBodyData setWhereCondition(String whereCondition) {
            this.whereCondition = whereCondition;
            return this;
        }
        public String getWhereCondition() {
            return this.whereCondition;
        }

        public GetQualityRuleResponseBodyData setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetQualityRuleResponseBodyData setExpectValue(String expectValue) {
            this.expectValue = expectValue;
            return this;
        }
        public String getExpectValue() {
            return this.expectValue;
        }

        public GetQualityRuleResponseBodyData setTrend(String trend) {
            this.trend = trend;
            return this;
        }
        public String getTrend() {
            return this.trend;
        }

        public GetQualityRuleResponseBodyData setTemplateId(Integer templateId) {
            this.templateId = templateId;
            return this;
        }
        public Integer getTemplateId() {
            return this.templateId;
        }

        public GetQualityRuleResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
