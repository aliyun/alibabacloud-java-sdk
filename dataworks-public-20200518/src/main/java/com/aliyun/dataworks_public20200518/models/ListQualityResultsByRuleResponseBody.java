// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListQualityResultsByRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Data")
    public ListQualityResultsByRuleResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Success")
    public Boolean success;

    public static ListQualityResultsByRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListQualityResultsByRuleResponseBody self = new ListQualityResultsByRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ListQualityResultsByRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListQualityResultsByRuleResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListQualityResultsByRuleResponseBody setData(ListQualityResultsByRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListQualityResultsByRuleResponseBodyData getData() {
        return this.data;
    }

    public ListQualityResultsByRuleResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListQualityResultsByRuleResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListQualityResultsByRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListQualityResultsByRuleResponseBodyDataRuleChecksReferenceValue extends TeaModel {
        @NameInMap("Value")
        public Float value;

        @NameInMap("BizDate")
        public String bizDate;

        @NameInMap("DiscreteProperty")
        public String discreteProperty;

        @NameInMap("SingleCheckResult")
        public Integer singleCheckResult;

        @NameInMap("Threshold")
        public Float threshold;

        public static ListQualityResultsByRuleResponseBodyDataRuleChecksReferenceValue build(java.util.Map<String, ?> map) throws Exception {
            ListQualityResultsByRuleResponseBodyDataRuleChecksReferenceValue self = new ListQualityResultsByRuleResponseBodyDataRuleChecksReferenceValue();
            return TeaModel.build(map, self);
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecksReferenceValue setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecksReferenceValue setBizDate(String bizDate) {
            this.bizDate = bizDate;
            return this;
        }
        public String getBizDate() {
            return this.bizDate;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecksReferenceValue setDiscreteProperty(String discreteProperty) {
            this.discreteProperty = discreteProperty;
            return this;
        }
        public String getDiscreteProperty() {
            return this.discreteProperty;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecksReferenceValue setSingleCheckResult(Integer singleCheckResult) {
            this.singleCheckResult = singleCheckResult;
            return this;
        }
        public Integer getSingleCheckResult() {
            return this.singleCheckResult;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecksReferenceValue setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

    }

    public static class ListQualityResultsByRuleResponseBodyDataRuleChecksSampleValue extends TeaModel {
        @NameInMap("BizDate")
        public String bizDate;

        @NameInMap("Value")
        public Float value;

        @NameInMap("DiscreteProperty")
        public String discreteProperty;

        public static ListQualityResultsByRuleResponseBodyDataRuleChecksSampleValue build(java.util.Map<String, ?> map) throws Exception {
            ListQualityResultsByRuleResponseBodyDataRuleChecksSampleValue self = new ListQualityResultsByRuleResponseBodyDataRuleChecksSampleValue();
            return TeaModel.build(map, self);
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecksSampleValue setBizDate(String bizDate) {
            this.bizDate = bizDate;
            return this;
        }
        public String getBizDate() {
            return this.bizDate;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecksSampleValue setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecksSampleValue setDiscreteProperty(String discreteProperty) {
            this.discreteProperty = discreteProperty;
            return this;
        }
        public String getDiscreteProperty() {
            return this.discreteProperty;
        }

    }

    public static class ListQualityResultsByRuleResponseBodyDataRuleChecks extends TeaModel {
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

        @NameInMap("TimeCost")
        public String timeCost;

        @NameInMap("ExternalId")
        public String externalId;

        @NameInMap("Trend")
        public String trend;

        @NameInMap("BizDate")
        public Long bizDate;

        @NameInMap("ExternalType")
        public String externalType;

        @NameInMap("ReferenceValue")
        public java.util.List<ListQualityResultsByRuleResponseBodyDataRuleChecksReferenceValue> referenceValue;

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

        @NameInMap("SampleValue")
        public java.util.List<ListQualityResultsByRuleResponseBodyDataRuleChecksSampleValue> sampleValue;

        @NameInMap("ExpectValue")
        public Float expectValue;

        @NameInMap("TemplateId")
        public Integer templateId;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("Id")
        public Integer id;

        public static ListQualityResultsByRuleResponseBodyDataRuleChecks build(java.util.Map<String, ?> map) throws Exception {
            ListQualityResultsByRuleResponseBodyDataRuleChecks self = new ListQualityResultsByRuleResponseBodyDataRuleChecks();
            return TeaModel.build(map, self);
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setBlockType(Integer blockType) {
            this.blockType = blockType;
            return this;
        }
        public Integer getBlockType() {
            return this.blockType;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setWarningThreshold(Float warningThreshold) {
            this.warningThreshold = warningThreshold;
            return this;
        }
        public Float getWarningThreshold() {
            return this.warningThreshold;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setProperty(String property) {
            this.property = property;
            return this;
        }
        public String getProperty() {
            return this.property;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setCheckResultStatus(Integer checkResultStatus) {
            this.checkResultStatus = checkResultStatus;
            return this;
        }
        public Integer getCheckResultStatus() {
            return this.checkResultStatus;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setCheckerName(String checkerName) {
            this.checkerName = checkerName;
            return this;
        }
        public String getCheckerName() {
            return this.checkerName;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setRuleId(Integer ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Integer getRuleId() {
            return this.ruleId;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setFixedCheck(Boolean fixedCheck) {
            this.fixedCheck = fixedCheck;
            return this;
        }
        public Boolean getFixedCheck() {
            return this.fixedCheck;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setOp(String op) {
            this.op = op;
            return this;
        }
        public String getOp() {
            return this.op;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setUpperValue(Float upperValue) {
            this.upperValue = upperValue;
            return this;
        }
        public Float getUpperValue() {
            return this.upperValue;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setActualExpression(String actualExpression) {
            this.actualExpression = actualExpression;
            return this;
        }
        public String getActualExpression() {
            return this.actualExpression;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setTimeCost(String timeCost) {
            this.timeCost = timeCost;
            return this;
        }
        public String getTimeCost() {
            return this.timeCost;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }
        public String getExternalId() {
            return this.externalId;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setTrend(String trend) {
            this.trend = trend;
            return this;
        }
        public String getTrend() {
            return this.trend;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setBizDate(Long bizDate) {
            this.bizDate = bizDate;
            return this;
        }
        public Long getBizDate() {
            return this.bizDate;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setExternalType(String externalType) {
            this.externalType = externalType;
            return this;
        }
        public String getExternalType() {
            return this.externalType;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setReferenceValue(java.util.List<ListQualityResultsByRuleResponseBodyDataRuleChecksReferenceValue> referenceValue) {
            this.referenceValue = referenceValue;
            return this;
        }
        public java.util.List<ListQualityResultsByRuleResponseBodyDataRuleChecksReferenceValue> getReferenceValue() {
            return this.referenceValue;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setCheckResult(Integer checkResult) {
            this.checkResult = checkResult;
            return this;
        }
        public Integer getCheckResult() {
            return this.checkResult;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setResultString(String resultString) {
            this.resultString = resultString;
            return this;
        }
        public String getResultString() {
            return this.resultString;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setMatchExpression(String matchExpression) {
            this.matchExpression = matchExpression;
            return this;
        }
        public String getMatchExpression() {
            return this.matchExpression;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setCheckerType(Integer checkerType) {
            this.checkerType = checkerType;
            return this;
        }
        public Integer getCheckerType() {
            return this.checkerType;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setBeginTime(Long beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public Long getBeginTime() {
            return this.beginTime;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setDateType(String dateType) {
            this.dateType = dateType;
            return this;
        }
        public String getDateType() {
            return this.dateType;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setCriticalThreshold(Float criticalThreshold) {
            this.criticalThreshold = criticalThreshold;
            return this;
        }
        public Float getCriticalThreshold() {
            return this.criticalThreshold;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setIsPrediction(Boolean isPrediction) {
            this.isPrediction = isPrediction;
            return this;
        }
        public Boolean getIsPrediction() {
            return this.isPrediction;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setCheckerId(Integer checkerId) {
            this.checkerId = checkerId;
            return this;
        }
        public Integer getCheckerId() {
            return this.checkerId;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setDiscreteCheck(Boolean discreteCheck) {
            this.discreteCheck = discreteCheck;
            return this;
        }
        public Boolean getDiscreteCheck() {
            return this.discreteCheck;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setMethodName(String methodName) {
            this.methodName = methodName;
            return this;
        }
        public String getMethodName() {
            return this.methodName;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setLowerValue(Float lowerValue) {
            this.lowerValue = lowerValue;
            return this;
        }
        public Float getLowerValue() {
            return this.lowerValue;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setEntityId(Integer entityId) {
            this.entityId = entityId;
            return this;
        }
        public Integer getEntityId() {
            return this.entityId;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setWhereCondition(String whereCondition) {
            this.whereCondition = whereCondition;
            return this;
        }
        public String getWhereCondition() {
            return this.whereCondition;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setSampleValue(java.util.List<ListQualityResultsByRuleResponseBodyDataRuleChecksSampleValue> sampleValue) {
            this.sampleValue = sampleValue;
            return this;
        }
        public java.util.List<ListQualityResultsByRuleResponseBodyDataRuleChecksSampleValue> getSampleValue() {
            return this.sampleValue;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setExpectValue(Float expectValue) {
            this.expectValue = expectValue;
            return this;
        }
        public Float getExpectValue() {
            return this.expectValue;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setTemplateId(Integer templateId) {
            this.templateId = templateId;
            return this;
        }
        public Integer getTemplateId() {
            return this.templateId;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

    }

    public static class ListQualityResultsByRuleResponseBodyData extends TeaModel {
        @NameInMap("RuleChecks")
        public java.util.List<ListQualityResultsByRuleResponseBodyDataRuleChecks> ruleChecks;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListQualityResultsByRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListQualityResultsByRuleResponseBodyData self = new ListQualityResultsByRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListQualityResultsByRuleResponseBodyData setRuleChecks(java.util.List<ListQualityResultsByRuleResponseBodyDataRuleChecks> ruleChecks) {
            this.ruleChecks = ruleChecks;
            return this;
        }
        public java.util.List<ListQualityResultsByRuleResponseBodyDataRuleChecks> getRuleChecks() {
            return this.ruleChecks;
        }

        public ListQualityResultsByRuleResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListQualityResultsByRuleResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListQualityResultsByRuleResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
