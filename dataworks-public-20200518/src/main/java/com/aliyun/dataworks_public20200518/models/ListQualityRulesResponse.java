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

    public ListQualityRulesResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListQualityRulesResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListQualityRulesResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListQualityRulesResponse setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListQualityRulesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListQualityRulesResponse setData(ListQualityRulesResponseData data) {
        this.data = data;
        return this;
    }
    public ListQualityRulesResponseData getData() {
        return this.data;
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

        @NameInMap("OnDutyAccountName")
        @Validation(required = true)
        public String onDutyAccountName;

        public static ListQualityRulesResponseDataRules build(java.util.Map<String, ?> map) throws Exception {
            ListQualityRulesResponseDataRules self = new ListQualityRulesResponseDataRules();
            return TeaModel.build(map, self);
        }

        public ListQualityRulesResponseDataRules setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListQualityRulesResponseDataRules setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public ListQualityRulesResponseDataRules setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public ListQualityRulesResponseDataRules setEntityId(Integer entityId) {
            this.entityId = entityId;
            return this;
        }
        public Integer getEntityId() {
            return this.entityId;
        }

        public ListQualityRulesResponseDataRules setProperty(String property) {
            this.property = property;
            return this;
        }
        public String getProperty() {
            return this.property;
        }

        public ListQualityRulesResponseDataRules setMethodId(Integer methodId) {
            this.methodId = methodId;
            return this;
        }
        public Integer getMethodId() {
            return this.methodId;
        }

        public ListQualityRulesResponseDataRules setMethodName(String methodName) {
            this.methodName = methodName;
            return this;
        }
        public String getMethodName() {
            return this.methodName;
        }

        public ListQualityRulesResponseDataRules setOnDuty(String onDuty) {
            this.onDuty = onDuty;
            return this;
        }
        public String getOnDuty() {
            return this.onDuty;
        }

        public ListQualityRulesResponseDataRules setRuleType(Integer ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public Integer getRuleType() {
            return this.ruleType;
        }

        public ListQualityRulesResponseDataRules setBlockType(Integer blockType) {
            this.blockType = blockType;
            return this;
        }
        public Integer getBlockType() {
            return this.blockType;
        }

        public ListQualityRulesResponseDataRules setTemplateId(Integer templateId) {
            this.templateId = templateId;
            return this;
        }
        public Integer getTemplateId() {
            return this.templateId;
        }

        public ListQualityRulesResponseDataRules setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public ListQualityRulesResponseDataRules setRuleCheckerRelationId(Integer ruleCheckerRelationId) {
            this.ruleCheckerRelationId = ruleCheckerRelationId;
            return this;
        }
        public Integer getRuleCheckerRelationId() {
            return this.ruleCheckerRelationId;
        }

        public ListQualityRulesResponseDataRules setCheckerId(Integer checkerId) {
            this.checkerId = checkerId;
            return this;
        }
        public Integer getCheckerId() {
            return this.checkerId;
        }

        public ListQualityRulesResponseDataRules setFixCheck(Boolean fixCheck) {
            this.fixCheck = fixCheck;
            return this;
        }
        public Boolean getFixCheck() {
            return this.fixCheck;
        }

        public ListQualityRulesResponseDataRules setTrend(String trend) {
            this.trend = trend;
            return this;
        }
        public String getTrend() {
            return this.trend;
        }

        public ListQualityRulesResponseDataRules setWarningThreshold(String warningThreshold) {
            this.warningThreshold = warningThreshold;
            return this;
        }
        public String getWarningThreshold() {
            return this.warningThreshold;
        }

        public ListQualityRulesResponseDataRules setCriticalThreshold(String criticalThreshold) {
            this.criticalThreshold = criticalThreshold;
            return this;
        }
        public String getCriticalThreshold() {
            return this.criticalThreshold;
        }

        public ListQualityRulesResponseDataRules setHistoryWarningThreshold(String historyWarningThreshold) {
            this.historyWarningThreshold = historyWarningThreshold;
            return this;
        }
        public String getHistoryWarningThreshold() {
            return this.historyWarningThreshold;
        }

        public ListQualityRulesResponseDataRules setHistoryCriticalThreshold(String historyCriticalThreshold) {
            this.historyCriticalThreshold = historyCriticalThreshold;
            return this;
        }
        public String getHistoryCriticalThreshold() {
            return this.historyCriticalThreshold;
        }

        public ListQualityRulesResponseDataRules setPropertyKey(String propertyKey) {
            this.propertyKey = propertyKey;
            return this;
        }
        public String getPropertyKey() {
            return this.propertyKey;
        }

        public ListQualityRulesResponseDataRules setMatchExpression(String matchExpression) {
            this.matchExpression = matchExpression;
            return this;
        }
        public String getMatchExpression() {
            return this.matchExpression;
        }

        public ListQualityRulesResponseDataRules setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListQualityRulesResponseDataRules setExpectValue(String expectValue) {
            this.expectValue = expectValue;
            return this;
        }
        public String getExpectValue() {
            return this.expectValue;
        }

        public ListQualityRulesResponseDataRules setOnDutyAccountName(String onDutyAccountName) {
            this.onDutyAccountName = onDutyAccountName;
            return this;
        }
        public String getOnDutyAccountName() {
            return this.onDutyAccountName;
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

        public ListQualityRulesResponseData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public ListQualityRulesResponseData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListQualityRulesResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListQualityRulesResponseData setRules(java.util.List<ListQualityRulesResponseDataRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<ListQualityRulesResponseDataRules> getRules() {
            return this.rules;
        }

    }

}
