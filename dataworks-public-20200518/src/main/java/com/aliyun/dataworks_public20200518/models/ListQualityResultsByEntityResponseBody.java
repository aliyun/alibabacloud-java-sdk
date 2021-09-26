// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListQualityResultsByEntityResponseBody extends TeaModel {
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Data")
    public ListQualityResultsByEntityResponseBodyData data;

    public static ListQualityResultsByEntityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListQualityResultsByEntityResponseBody self = new ListQualityResultsByEntityResponseBody();
        return TeaModel.build(map, self);
    }

    public ListQualityResultsByEntityResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListQualityResultsByEntityResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListQualityResultsByEntityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListQualityResultsByEntityResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListQualityResultsByEntityResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListQualityResultsByEntityResponseBody setData(ListQualityResultsByEntityResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListQualityResultsByEntityResponseBodyData getData() {
        return this.data;
    }

    public static class ListQualityResultsByEntityResponseBodyDataRuleChecksReferenceValue extends TeaModel {
        @NameInMap("DiscreteProperty")
        public String discreteProperty;

        @NameInMap("Value")
        public Float value;

        @NameInMap("BizDate")
        public String bizDate;

        @NameInMap("SingleCheckResult")
        public Integer singleCheckResult;

        @NameInMap("Threshold")
        public Float threshold;

        public static ListQualityResultsByEntityResponseBodyDataRuleChecksReferenceValue build(java.util.Map<String, ?> map) throws Exception {
            ListQualityResultsByEntityResponseBodyDataRuleChecksReferenceValue self = new ListQualityResultsByEntityResponseBodyDataRuleChecksReferenceValue();
            return TeaModel.build(map, self);
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecksReferenceValue setDiscreteProperty(String discreteProperty) {
            this.discreteProperty = discreteProperty;
            return this;
        }
        public String getDiscreteProperty() {
            return this.discreteProperty;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecksReferenceValue setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecksReferenceValue setBizDate(String bizDate) {
            this.bizDate = bizDate;
            return this;
        }
        public String getBizDate() {
            return this.bizDate;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecksReferenceValue setSingleCheckResult(Integer singleCheckResult) {
            this.singleCheckResult = singleCheckResult;
            return this;
        }
        public Integer getSingleCheckResult() {
            return this.singleCheckResult;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecksReferenceValue setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

    }

    public static class ListQualityResultsByEntityResponseBodyDataRuleChecksSampleValue extends TeaModel {
        @NameInMap("DiscreteProperty")
        public String discreteProperty;

        @NameInMap("BizDate")
        public String bizDate;

        @NameInMap("Value")
        public Float value;

        public static ListQualityResultsByEntityResponseBodyDataRuleChecksSampleValue build(java.util.Map<String, ?> map) throws Exception {
            ListQualityResultsByEntityResponseBodyDataRuleChecksSampleValue self = new ListQualityResultsByEntityResponseBodyDataRuleChecksSampleValue();
            return TeaModel.build(map, self);
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecksSampleValue setDiscreteProperty(String discreteProperty) {
            this.discreteProperty = discreteProperty;
            return this;
        }
        public String getDiscreteProperty() {
            return this.discreteProperty;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecksSampleValue setBizDate(String bizDate) {
            this.bizDate = bizDate;
            return this;
        }
        public String getBizDate() {
            return this.bizDate;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecksSampleValue setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class ListQualityResultsByEntityResponseBodyDataRuleChecks extends TeaModel {
        @NameInMap("BlockType")
        public Integer blockType;

        @NameInMap("WarningThreshold")
        public Float warningThreshold;

        @NameInMap("Property")
        public String property;

        @NameInMap("TableName")
        public String tableName;

        @NameInMap("Comment")
        public String comment;

        @NameInMap("CheckResultStatus")
        public Integer checkResultStatus;

        @NameInMap("TemplateName")
        public String templateName;

        @NameInMap("CheckerName")
        public String checkerName;

        @NameInMap("RuleId")
        public Integer ruleId;

        @NameInMap("FixedCheck")
        public Boolean fixedCheck;

        @NameInMap("Op")
        public String op;

        @NameInMap("UpperValue")
        public Float upperValue;

        @NameInMap("ActualExpression")
        public String actualExpression;

        @NameInMap("ExternalId")
        public String externalId;

        @NameInMap("TimeCost")
        public String timeCost;

        @NameInMap("Trend")
        public String trend;

        @NameInMap("ExternalType")
        public String externalType;

        @NameInMap("BizDate")
        public Long bizDate;

        @NameInMap("CheckResult")
        public Integer checkResult;

        @NameInMap("ResultString")
        public String resultString;

        @NameInMap("MatchExpression")
        public String matchExpression;

        @NameInMap("CheckerType")
        public Integer checkerType;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("BeginTime")
        public Long beginTime;

        @NameInMap("DateType")
        public String dateType;

        @NameInMap("CriticalThreshold")
        public Float criticalThreshold;

        @NameInMap("IsPrediction")
        public Boolean isPrediction;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("CheckerId")
        public Integer checkerId;

        @NameInMap("DiscreteCheck")
        public Boolean discreteCheck;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("MethodName")
        public String methodName;

        @NameInMap("LowerValue")
        public Float lowerValue;

        @NameInMap("EntityId")
        public Integer entityId;

        @NameInMap("WhereCondition")
        public String whereCondition;

        @NameInMap("ExpectValue")
        public Float expectValue;

        @NameInMap("TemplateId")
        public Integer templateId;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("ReferenceValue")
        public java.util.List<ListQualityResultsByEntityResponseBodyDataRuleChecksReferenceValue> referenceValue;

        @NameInMap("SampleValue")
        public java.util.List<ListQualityResultsByEntityResponseBodyDataRuleChecksSampleValue> sampleValue;

        public static ListQualityResultsByEntityResponseBodyDataRuleChecks build(java.util.Map<String, ?> map) throws Exception {
            ListQualityResultsByEntityResponseBodyDataRuleChecks self = new ListQualityResultsByEntityResponseBodyDataRuleChecks();
            return TeaModel.build(map, self);
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setBlockType(Integer blockType) {
            this.blockType = blockType;
            return this;
        }
        public Integer getBlockType() {
            return this.blockType;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setWarningThreshold(Float warningThreshold) {
            this.warningThreshold = warningThreshold;
            return this;
        }
        public Float getWarningThreshold() {
            return this.warningThreshold;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setProperty(String property) {
            this.property = property;
            return this;
        }
        public String getProperty() {
            return this.property;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setCheckResultStatus(Integer checkResultStatus) {
            this.checkResultStatus = checkResultStatus;
            return this;
        }
        public Integer getCheckResultStatus() {
            return this.checkResultStatus;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setCheckerName(String checkerName) {
            this.checkerName = checkerName;
            return this;
        }
        public String getCheckerName() {
            return this.checkerName;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setRuleId(Integer ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Integer getRuleId() {
            return this.ruleId;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setFixedCheck(Boolean fixedCheck) {
            this.fixedCheck = fixedCheck;
            return this;
        }
        public Boolean getFixedCheck() {
            return this.fixedCheck;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setOp(String op) {
            this.op = op;
            return this;
        }
        public String getOp() {
            return this.op;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setUpperValue(Float upperValue) {
            this.upperValue = upperValue;
            return this;
        }
        public Float getUpperValue() {
            return this.upperValue;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setActualExpression(String actualExpression) {
            this.actualExpression = actualExpression;
            return this;
        }
        public String getActualExpression() {
            return this.actualExpression;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }
        public String getExternalId() {
            return this.externalId;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setTimeCost(String timeCost) {
            this.timeCost = timeCost;
            return this;
        }
        public String getTimeCost() {
            return this.timeCost;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setTrend(String trend) {
            this.trend = trend;
            return this;
        }
        public String getTrend() {
            return this.trend;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setExternalType(String externalType) {
            this.externalType = externalType;
            return this;
        }
        public String getExternalType() {
            return this.externalType;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setBizDate(Long bizDate) {
            this.bizDate = bizDate;
            return this;
        }
        public Long getBizDate() {
            return this.bizDate;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setCheckResult(Integer checkResult) {
            this.checkResult = checkResult;
            return this;
        }
        public Integer getCheckResult() {
            return this.checkResult;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setResultString(String resultString) {
            this.resultString = resultString;
            return this;
        }
        public String getResultString() {
            return this.resultString;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setMatchExpression(String matchExpression) {
            this.matchExpression = matchExpression;
            return this;
        }
        public String getMatchExpression() {
            return this.matchExpression;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setCheckerType(Integer checkerType) {
            this.checkerType = checkerType;
            return this;
        }
        public Integer getCheckerType() {
            return this.checkerType;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setBeginTime(Long beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public Long getBeginTime() {
            return this.beginTime;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setDateType(String dateType) {
            this.dateType = dateType;
            return this;
        }
        public String getDateType() {
            return this.dateType;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setCriticalThreshold(Float criticalThreshold) {
            this.criticalThreshold = criticalThreshold;
            return this;
        }
        public Float getCriticalThreshold() {
            return this.criticalThreshold;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setIsPrediction(Boolean isPrediction) {
            this.isPrediction = isPrediction;
            return this;
        }
        public Boolean getIsPrediction() {
            return this.isPrediction;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setCheckerId(Integer checkerId) {
            this.checkerId = checkerId;
            return this;
        }
        public Integer getCheckerId() {
            return this.checkerId;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setDiscreteCheck(Boolean discreteCheck) {
            this.discreteCheck = discreteCheck;
            return this;
        }
        public Boolean getDiscreteCheck() {
            return this.discreteCheck;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setMethodName(String methodName) {
            this.methodName = methodName;
            return this;
        }
        public String getMethodName() {
            return this.methodName;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setLowerValue(Float lowerValue) {
            this.lowerValue = lowerValue;
            return this;
        }
        public Float getLowerValue() {
            return this.lowerValue;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setEntityId(Integer entityId) {
            this.entityId = entityId;
            return this;
        }
        public Integer getEntityId() {
            return this.entityId;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setWhereCondition(String whereCondition) {
            this.whereCondition = whereCondition;
            return this;
        }
        public String getWhereCondition() {
            return this.whereCondition;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setExpectValue(Float expectValue) {
            this.expectValue = expectValue;
            return this;
        }
        public Float getExpectValue() {
            return this.expectValue;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setTemplateId(Integer templateId) {
            this.templateId = templateId;
            return this;
        }
        public Integer getTemplateId() {
            return this.templateId;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setReferenceValue(java.util.List<ListQualityResultsByEntityResponseBodyDataRuleChecksReferenceValue> referenceValue) {
            this.referenceValue = referenceValue;
            return this;
        }
        public java.util.List<ListQualityResultsByEntityResponseBodyDataRuleChecksReferenceValue> getReferenceValue() {
            return this.referenceValue;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setSampleValue(java.util.List<ListQualityResultsByEntityResponseBodyDataRuleChecksSampleValue> sampleValue) {
            this.sampleValue = sampleValue;
            return this;
        }
        public java.util.List<ListQualityResultsByEntityResponseBodyDataRuleChecksSampleValue> getSampleValue() {
            return this.sampleValue;
        }

    }

    public static class ListQualityResultsByEntityResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("RuleChecks")
        public java.util.List<ListQualityResultsByEntityResponseBodyDataRuleChecks> ruleChecks;

        public static ListQualityResultsByEntityResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListQualityResultsByEntityResponseBodyData self = new ListQualityResultsByEntityResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListQualityResultsByEntityResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListQualityResultsByEntityResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListQualityResultsByEntityResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public ListQualityResultsByEntityResponseBodyData setRuleChecks(java.util.List<ListQualityResultsByEntityResponseBodyDataRuleChecks> ruleChecks) {
            this.ruleChecks = ruleChecks;
            return this;
        }
        public java.util.List<ListQualityResultsByEntityResponseBodyDataRuleChecks> getRuleChecks() {
            return this.ruleChecks;
        }

    }

}
