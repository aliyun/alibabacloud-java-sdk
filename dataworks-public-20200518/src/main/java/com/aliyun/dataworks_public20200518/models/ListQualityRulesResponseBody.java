// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListQualityRulesResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListQualityRulesResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListQualityRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListQualityRulesResponseBody self = new ListQualityRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListQualityRulesResponseBody setData(ListQualityRulesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListQualityRulesResponseBodyData getData() {
        return this.data;
    }

    public ListQualityRulesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListQualityRulesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListQualityRulesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListQualityRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListQualityRulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListQualityRulesResponseBodyDataRules extends TeaModel {
        @NameInMap("BlockType")
        public Integer blockType;

        @NameInMap("CheckerId")
        public Integer checkerId;

        @NameInMap("Comment")
        public String comment;

        @NameInMap("CriticalThreshold")
        public String criticalThreshold;

        @NameInMap("EntityId")
        public Integer entityId;

        @NameInMap("ExpectValue")
        public String expectValue;

        @NameInMap("FixCheck")
        public Boolean fixCheck;

        @NameInMap("HistoryCriticalThreshold")
        public String historyCriticalThreshold;

        @NameInMap("HistoryWarningThreshold")
        public String historyWarningThreshold;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("MatchExpression")
        public String matchExpression;

        @NameInMap("MethodId")
        public Integer methodId;

        @NameInMap("MethodName")
        public String methodName;

        @NameInMap("OnDuty")
        public String onDuty;

        @NameInMap("OnDutyAccountName")
        public String onDutyAccountName;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("Property")
        public String property;

        @NameInMap("PropertyKey")
        public String propertyKey;

        @NameInMap("RuleCheckerRelationId")
        public Integer ruleCheckerRelationId;

        // 规则名称
        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("RuleType")
        public Integer ruleType;

        @NameInMap("TableName")
        public String tableName;

        @NameInMap("TemplateId")
        public Integer templateId;

        @NameInMap("TemplateName")
        public String templateName;

        @NameInMap("Trend")
        public String trend;

        @NameInMap("WarningThreshold")
        public String warningThreshold;

        public static ListQualityRulesResponseBodyDataRules build(java.util.Map<String, ?> map) throws Exception {
            ListQualityRulesResponseBodyDataRules self = new ListQualityRulesResponseBodyDataRules();
            return TeaModel.build(map, self);
        }

        public ListQualityRulesResponseBodyDataRules setBlockType(Integer blockType) {
            this.blockType = blockType;
            return this;
        }
        public Integer getBlockType() {
            return this.blockType;
        }

        public ListQualityRulesResponseBodyDataRules setCheckerId(Integer checkerId) {
            this.checkerId = checkerId;
            return this;
        }
        public Integer getCheckerId() {
            return this.checkerId;
        }

        public ListQualityRulesResponseBodyDataRules setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListQualityRulesResponseBodyDataRules setCriticalThreshold(String criticalThreshold) {
            this.criticalThreshold = criticalThreshold;
            return this;
        }
        public String getCriticalThreshold() {
            return this.criticalThreshold;
        }

        public ListQualityRulesResponseBodyDataRules setEntityId(Integer entityId) {
            this.entityId = entityId;
            return this;
        }
        public Integer getEntityId() {
            return this.entityId;
        }

        public ListQualityRulesResponseBodyDataRules setExpectValue(String expectValue) {
            this.expectValue = expectValue;
            return this;
        }
        public String getExpectValue() {
            return this.expectValue;
        }

        public ListQualityRulesResponseBodyDataRules setFixCheck(Boolean fixCheck) {
            this.fixCheck = fixCheck;
            return this;
        }
        public Boolean getFixCheck() {
            return this.fixCheck;
        }

        public ListQualityRulesResponseBodyDataRules setHistoryCriticalThreshold(String historyCriticalThreshold) {
            this.historyCriticalThreshold = historyCriticalThreshold;
            return this;
        }
        public String getHistoryCriticalThreshold() {
            return this.historyCriticalThreshold;
        }

        public ListQualityRulesResponseBodyDataRules setHistoryWarningThreshold(String historyWarningThreshold) {
            this.historyWarningThreshold = historyWarningThreshold;
            return this;
        }
        public String getHistoryWarningThreshold() {
            return this.historyWarningThreshold;
        }

        public ListQualityRulesResponseBodyDataRules setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public ListQualityRulesResponseBodyDataRules setMatchExpression(String matchExpression) {
            this.matchExpression = matchExpression;
            return this;
        }
        public String getMatchExpression() {
            return this.matchExpression;
        }

        public ListQualityRulesResponseBodyDataRules setMethodId(Integer methodId) {
            this.methodId = methodId;
            return this;
        }
        public Integer getMethodId() {
            return this.methodId;
        }

        public ListQualityRulesResponseBodyDataRules setMethodName(String methodName) {
            this.methodName = methodName;
            return this;
        }
        public String getMethodName() {
            return this.methodName;
        }

        public ListQualityRulesResponseBodyDataRules setOnDuty(String onDuty) {
            this.onDuty = onDuty;
            return this;
        }
        public String getOnDuty() {
            return this.onDuty;
        }

        public ListQualityRulesResponseBodyDataRules setOnDutyAccountName(String onDutyAccountName) {
            this.onDutyAccountName = onDutyAccountName;
            return this;
        }
        public String getOnDutyAccountName() {
            return this.onDutyAccountName;
        }

        public ListQualityRulesResponseBodyDataRules setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListQualityRulesResponseBodyDataRules setProperty(String property) {
            this.property = property;
            return this;
        }
        public String getProperty() {
            return this.property;
        }

        public ListQualityRulesResponseBodyDataRules setPropertyKey(String propertyKey) {
            this.propertyKey = propertyKey;
            return this;
        }
        public String getPropertyKey() {
            return this.propertyKey;
        }

        public ListQualityRulesResponseBodyDataRules setRuleCheckerRelationId(Integer ruleCheckerRelationId) {
            this.ruleCheckerRelationId = ruleCheckerRelationId;
            return this;
        }
        public Integer getRuleCheckerRelationId() {
            return this.ruleCheckerRelationId;
        }

        public ListQualityRulesResponseBodyDataRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListQualityRulesResponseBodyDataRules setRuleType(Integer ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public Integer getRuleType() {
            return this.ruleType;
        }

        public ListQualityRulesResponseBodyDataRules setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public ListQualityRulesResponseBodyDataRules setTemplateId(Integer templateId) {
            this.templateId = templateId;
            return this;
        }
        public Integer getTemplateId() {
            return this.templateId;
        }

        public ListQualityRulesResponseBodyDataRules setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public ListQualityRulesResponseBodyDataRules setTrend(String trend) {
            this.trend = trend;
            return this;
        }
        public String getTrend() {
            return this.trend;
        }

        public ListQualityRulesResponseBodyDataRules setWarningThreshold(String warningThreshold) {
            this.warningThreshold = warningThreshold;
            return this;
        }
        public String getWarningThreshold() {
            return this.warningThreshold;
        }

    }

    public static class ListQualityRulesResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Rules")
        public java.util.List<ListQualityRulesResponseBodyDataRules> rules;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListQualityRulesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListQualityRulesResponseBodyData self = new ListQualityRulesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListQualityRulesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListQualityRulesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListQualityRulesResponseBodyData setRules(java.util.List<ListQualityRulesResponseBodyDataRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<ListQualityRulesResponseBodyDataRules> getRules() {
            return this.rules;
        }

        public ListQualityRulesResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
