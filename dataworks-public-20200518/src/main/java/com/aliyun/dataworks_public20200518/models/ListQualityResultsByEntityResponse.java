// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListQualityResultsByEntityResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("QualityResults")
    @Validation(required = true)
    public ListQualityResultsByEntityResponseQualityResults qualityResults;

    public static ListQualityResultsByEntityResponse build(java.util.Map<String, ?> map) throws Exception {
        ListQualityResultsByEntityResponse self = new ListQualityResultsByEntityResponse();
        return TeaModel.build(map, self);
    }

    public ListQualityResultsByEntityResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListQualityResultsByEntityResponse setQualityResults(ListQualityResultsByEntityResponseQualityResults qualityResults) {
        this.qualityResults = qualityResults;
        return this;
    }
    public ListQualityResultsByEntityResponseQualityResults getQualityResults() {
        return this.qualityResults;
    }

    public static class ListQualityResultsByEntityResponseQualityResultsRuleChecksReferenceValue extends TeaModel {
        @NameInMap("BizDate")
        @Validation(required = true)
        public Long bizDate;

        @NameInMap("DiscreteProperty")
        @Validation(required = true)
        public String discreteProperty;

        @NameInMap("Value")
        @Validation(required = true)
        public Float value;

        @NameInMap("Threshold")
        @Validation(required = true)
        public Float threshold;

        @NameInMap("SingleCheckResult")
        @Validation(required = true)
        public Integer singleCheckResult;

        public static ListQualityResultsByEntityResponseQualityResultsRuleChecksReferenceValue build(java.util.Map<String, ?> map) throws Exception {
            ListQualityResultsByEntityResponseQualityResultsRuleChecksReferenceValue self = new ListQualityResultsByEntityResponseQualityResultsRuleChecksReferenceValue();
            return TeaModel.build(map, self);
        }

        public ListQualityResultsByEntityResponseQualityResultsRuleChecksReferenceValue setBizDate(Long bizDate) {
            this.bizDate = bizDate;
            return this;
        }
        public Long getBizDate() {
            return this.bizDate;
        }

        public ListQualityResultsByEntityResponseQualityResultsRuleChecksReferenceValue setDiscreteProperty(String discreteProperty) {
            this.discreteProperty = discreteProperty;
            return this;
        }
        public String getDiscreteProperty() {
            return this.discreteProperty;
        }

        public ListQualityResultsByEntityResponseQualityResultsRuleChecksReferenceValue setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

        public ListQualityResultsByEntityResponseQualityResultsRuleChecksReferenceValue setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

        public ListQualityResultsByEntityResponseQualityResultsRuleChecksReferenceValue setSingleCheckResult(Integer singleCheckResult) {
            this.singleCheckResult = singleCheckResult;
            return this;
        }
        public Integer getSingleCheckResult() {
            return this.singleCheckResult;
        }

    }

    public static class ListQualityResultsByEntityResponseQualityResultsRuleChecksSampleValue extends TeaModel {
        @NameInMap("BizDate")
        @Validation(required = true)
        public Long bizDate;

        @NameInMap("DiscreteProperty")
        @Validation(required = true)
        public String discreteProperty;

        @NameInMap("Value")
        @Validation(required = true)
        public Float value;

        public static ListQualityResultsByEntityResponseQualityResultsRuleChecksSampleValue build(java.util.Map<String, ?> map) throws Exception {
            ListQualityResultsByEntityResponseQualityResultsRuleChecksSampleValue self = new ListQualityResultsByEntityResponseQualityResultsRuleChecksSampleValue();
            return TeaModel.build(map, self);
        }

        public ListQualityResultsByEntityResponseQualityResultsRuleChecksSampleValue setBizDate(Long bizDate) {
            this.bizDate = bizDate;
            return this;
        }
        public Long getBizDate() {
            return this.bizDate;
        }

        public ListQualityResultsByEntityResponseQualityResultsRuleChecksSampleValue setDiscreteProperty(String discreteProperty) {
            this.discreteProperty = discreteProperty;
            return this;
        }
        public String getDiscreteProperty() {
            return this.discreteProperty;
        }

        public ListQualityResultsByEntityResponseQualityResultsRuleChecksSampleValue setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class ListQualityResultsByEntityResponseQualityResultsRuleChecks extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public Integer id;

        @NameInMap("TaskId")
        @Validation(required = true)
        public String taskId;

        @NameInMap("EntityId")
        @Validation(required = true)
        public Integer entityId;

        @NameInMap("RuleId")
        @Validation(required = true)
        public Integer ruleId;

        @NameInMap("Property")
        @Validation(required = true)
        public String property;

        @NameInMap("BizDate")
        @Validation(required = true)
        public Long bizDate;

        @NameInMap("DateType")
        @Validation(required = true)
        public String dateType;

        @NameInMap("ActualExpression")
        @Validation(required = true)
        public String actualExpression;

        @NameInMap("MatchExpression")
        @Validation(required = true)
        public String matchExpression;

        @NameInMap("BlockType")
        @Validation(required = true)
        public Integer blockType;

        @NameInMap("CheckResult")
        @Validation(required = true)
        public Integer checkResult;

        @NameInMap("CheckResultStatus")
        @Validation(required = true)
        public Integer checkResultStatus;

        @NameInMap("MethodName")
        @Validation(required = true)
        public String methodName;

        @NameInMap("Comment")
        @Validation(required = true)
        public String comment;

        @NameInMap("WhereCondition")
        @Validation(required = true)
        public String whereCondition;

        @NameInMap("BeginTime")
        @Validation(required = true)
        public Long beginTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public Long endTime;

        @NameInMap("TimeCost")
        @Validation(required = true)
        public String timeCost;

        @NameInMap("ExternalType")
        @Validation(required = true)
        public String externalType;

        @NameInMap("ExternalId")
        @Validation(required = true)
        public String externalId;

        @NameInMap("DiscreteCheck")
        @Validation(required = true)
        public Boolean discreteCheck;

        @NameInMap("FixedCheck")
        @Validation(required = true)
        public Boolean fixedCheck;

        @NameInMap("Trend")
        @Validation(required = true)
        public String trend;

        @NameInMap("WarningThreshold")
        @Validation(required = true)
        public Float warningThreshold;

        @NameInMap("CriticalThreshold")
        @Validation(required = true)
        public Float criticalThreshold;

        @NameInMap("ExpectValue")
        @Validation(required = true)
        public Float expectValue;

        @NameInMap("Op")
        @Validation(required = true)
        public String op;

        @NameInMap("ProjectName")
        @Validation(required = true)
        public String projectName;

        @NameInMap("TableName")
        @Validation(required = true)
        public String tableName;

        @NameInMap("TemplateId")
        @Validation(required = true)
        public Integer templateId;

        @NameInMap("TemplateName")
        @Validation(required = true)
        public String templateName;

        @NameInMap("ResultString")
        @Validation(required = true)
        public String resultString;

        @NameInMap("CheckerId")
        @Validation(required = true)
        public Integer checkerId;

        @NameInMap("CheckerType")
        @Validation(required = true)
        public Integer checkerType;

        @NameInMap("RuleName")
        @Validation(required = true)
        public String ruleName;

        @NameInMap("IsPrediction")
        @Validation(required = true)
        public Boolean isPrediction;

        @NameInMap("UpperValue")
        @Validation(required = true)
        public Float upperValue;

        @NameInMap("LowerValue")
        @Validation(required = true)
        public Float lowerValue;

        @NameInMap("CheckerName")
        @Validation(required = true)
        public String checkerName;

        @NameInMap("ReferenceValue")
        @Validation(required = true)
        public java.util.List<ListQualityResultsByEntityResponseQualityResultsRuleChecksReferenceValue> referenceValue;

        @NameInMap("SampleValue")
        @Validation(required = true)
        public java.util.List<ListQualityResultsByEntityResponseQualityResultsRuleChecksSampleValue> sampleValue;

        public static ListQualityResultsByEntityResponseQualityResultsRuleChecks build(java.util.Map<String, ?> map) throws Exception {
            ListQualityResultsByEntityResponseQualityResultsRuleChecks self = new ListQualityResultsByEntityResponseQualityResultsRuleChecks();
            return TeaModel.build(map, self);
        }

        public ListQualityResultsByEntityResponseQualityResultsRuleChecks setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public ListQualityResultsByEntityResponseQualityResultsRuleChecks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListQualityResultsByEntityResponseQualityResultsRuleChecks setEntityId(Integer entityId) {
            this.entityId = entityId;
            return this;
        }
        public Integer getEntityId() {
            return this.entityId;
        }

        public ListQualityResultsByEntityResponseQualityResultsRuleChecks setRuleId(Integer ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Integer getRuleId() {
            return this.ruleId;
        }

        public ListQualityResultsByEntityResponseQualityResultsRuleChecks setProperty(String property) {
            this.property = property;
            return this;
        }
        public String getProperty() {
            return this.property;
        }

        public ListQualityResultsByEntityResponseQualityResultsRuleChecks setBizDate(Long bizDate) {
            this.bizDate = bizDate;
            return this;
        }
        public Long getBizDate() {
            return this.bizDate;
        }

        public ListQualityResultsByEntityResponseQualityResultsRuleChecks setDateType(String dateType) {
            this.dateType = dateType;
            return this;
        }
        public String getDateType() {
            return this.dateType;
        }

        public ListQualityResultsByEntityResponseQualityResultsRuleChecks setActualExpression(String actualExpression) {
            this.actualExpression = actualExpression;
            return this;
        }
        public String getActualExpression() {
            return this.actualExpression;
        }

        public ListQualityResultsByEntityResponseQualityResultsRuleChecks setMatchExpression(String matchExpression) {
            this.matchExpression = matchExpression;
            return this;
        }
        public String getMatchExpression() {
            return this.matchExpression;
        }

        public ListQualityResultsByEntityResponseQualityResultsRuleChecks setBlockType(Integer blockType) {
            this.blockType = blockType;
            return this;
        }
        public Integer getBlockType() {
            return this.blockType;
        }

        public ListQualityResultsByEntityResponseQualityResultsRuleChecks setCheckResult(Integer checkResult) {
            this.checkResult = checkResult;
            return this;
        }
        public Integer getCheckResult() {
            return this.checkResult;
        }

        public ListQualityResultsByEntityResponseQualityResultsRuleChecks setCheckResultStatus(Integer checkResultStatus) {
            this.checkResultStatus = checkResultStatus;
            return this;
        }
        public Integer getCheckResultStatus() {
            return this.checkResultStatus;
        }

        public ListQualityResultsByEntityResponseQualityResultsRuleChecks setMethodName(String methodName) {
            this.methodName = methodName;
            return this;
        }
        public String getMethodName() {
            return this.methodName;
        }

        public ListQualityResultsByEntityResponseQualityResultsRuleChecks setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListQualityResultsByEntityResponseQualityResultsRuleChecks setWhereCondition(String whereCondition) {
            this.whereCondition = whereCondition;
            return this;
        }
        public String getWhereCondition() {
            return this.whereCondition;
        }

        public ListQualityResultsByEntityResponseQualityResultsRuleChecks setBeginTime(Long beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public Long getBeginTime() {
            return this.beginTime;
        }

        public ListQualityResultsByEntityResponseQualityResultsRuleChecks setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListQualityResultsByEntityResponseQualityResultsRuleChecks setTimeCost(String timeCost) {
            this.timeCost = timeCost;
            return this;
        }
        public String getTimeCost() {
            return this.timeCost;
        }

        public ListQualityResultsByEntityResponseQualityResultsRuleChecks setExternalType(String externalType) {
            this.externalType = externalType;
            return this;
        }
        public String getExternalType() {
            return this.externalType;
        }

        public ListQualityResultsByEntityResponseQualityResultsRuleChecks setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }
        public String getExternalId() {
            return this.externalId;
        }

        public ListQualityResultsByEntityResponseQualityResultsRuleChecks setDiscreteCheck(Boolean discreteCheck) {
            this.discreteCheck = discreteCheck;
            return this;
        }
        public Boolean getDiscreteCheck() {
            return this.discreteCheck;
        }

        public ListQualityResultsByEntityResponseQualityResultsRuleChecks setFixedCheck(Boolean fixedCheck) {
            this.fixedCheck = fixedCheck;
            return this;
        }
        public Boolean getFixedCheck() {
            return this.fixedCheck;
        }

        public ListQualityResultsByEntityResponseQualityResultsRuleChecks setTrend(String trend) {
            this.trend = trend;
            return this;
        }
        public String getTrend() {
            return this.trend;
        }

        public ListQualityResultsByEntityResponseQualityResultsRuleChecks setWarningThreshold(Float warningThreshold) {
            this.warningThreshold = warningThreshold;
            return this;
        }
        public Float getWarningThreshold() {
            return this.warningThreshold;
        }

        public ListQualityResultsByEntityResponseQualityResultsRuleChecks setCriticalThreshold(Float criticalThreshold) {
            this.criticalThreshold = criticalThreshold;
            return this;
        }
        public Float getCriticalThreshold() {
            return this.criticalThreshold;
        }

        public ListQualityResultsByEntityResponseQualityResultsRuleChecks setExpectValue(Float expectValue) {
            this.expectValue = expectValue;
            return this;
        }
        public Float getExpectValue() {
            return this.expectValue;
        }

        public ListQualityResultsByEntityResponseQualityResultsRuleChecks setOp(String op) {
            this.op = op;
            return this;
        }
        public String getOp() {
            return this.op;
        }

        public ListQualityResultsByEntityResponseQualityResultsRuleChecks setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListQualityResultsByEntityResponseQualityResultsRuleChecks setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public ListQualityResultsByEntityResponseQualityResultsRuleChecks setTemplateId(Integer templateId) {
            this.templateId = templateId;
            return this;
        }
        public Integer getTemplateId() {
            return this.templateId;
        }

        public ListQualityResultsByEntityResponseQualityResultsRuleChecks setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public ListQualityResultsByEntityResponseQualityResultsRuleChecks setResultString(String resultString) {
            this.resultString = resultString;
            return this;
        }
        public String getResultString() {
            return this.resultString;
        }

        public ListQualityResultsByEntityResponseQualityResultsRuleChecks setCheckerId(Integer checkerId) {
            this.checkerId = checkerId;
            return this;
        }
        public Integer getCheckerId() {
            return this.checkerId;
        }

        public ListQualityResultsByEntityResponseQualityResultsRuleChecks setCheckerType(Integer checkerType) {
            this.checkerType = checkerType;
            return this;
        }
        public Integer getCheckerType() {
            return this.checkerType;
        }

        public ListQualityResultsByEntityResponseQualityResultsRuleChecks setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListQualityResultsByEntityResponseQualityResultsRuleChecks setIsPrediction(Boolean isPrediction) {
            this.isPrediction = isPrediction;
            return this;
        }
        public Boolean getIsPrediction() {
            return this.isPrediction;
        }

        public ListQualityResultsByEntityResponseQualityResultsRuleChecks setUpperValue(Float upperValue) {
            this.upperValue = upperValue;
            return this;
        }
        public Float getUpperValue() {
            return this.upperValue;
        }

        public ListQualityResultsByEntityResponseQualityResultsRuleChecks setLowerValue(Float lowerValue) {
            this.lowerValue = lowerValue;
            return this;
        }
        public Float getLowerValue() {
            return this.lowerValue;
        }

        public ListQualityResultsByEntityResponseQualityResultsRuleChecks setCheckerName(String checkerName) {
            this.checkerName = checkerName;
            return this;
        }
        public String getCheckerName() {
            return this.checkerName;
        }

        public ListQualityResultsByEntityResponseQualityResultsRuleChecks setReferenceValue(java.util.List<ListQualityResultsByEntityResponseQualityResultsRuleChecksReferenceValue> referenceValue) {
            this.referenceValue = referenceValue;
            return this;
        }
        public java.util.List<ListQualityResultsByEntityResponseQualityResultsRuleChecksReferenceValue> getReferenceValue() {
            return this.referenceValue;
        }

        public ListQualityResultsByEntityResponseQualityResultsRuleChecks setSampleValue(java.util.List<ListQualityResultsByEntityResponseQualityResultsRuleChecksSampleValue> sampleValue) {
            this.sampleValue = sampleValue;
            return this;
        }
        public java.util.List<ListQualityResultsByEntityResponseQualityResultsRuleChecksSampleValue> getSampleValue() {
            return this.sampleValue;
        }

    }

    public static class ListQualityResultsByEntityResponseQualityResults extends TeaModel {
        @NameInMap("TotalCount")
        @Validation(required = true)
        public Long totalCount;

        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("RuleChecks")
        @Validation(required = true)
        public java.util.List<ListQualityResultsByEntityResponseQualityResultsRuleChecks> ruleChecks;

        public static ListQualityResultsByEntityResponseQualityResults build(java.util.Map<String, ?> map) throws Exception {
            ListQualityResultsByEntityResponseQualityResults self = new ListQualityResultsByEntityResponseQualityResults();
            return TeaModel.build(map, self);
        }

        public ListQualityResultsByEntityResponseQualityResults setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public ListQualityResultsByEntityResponseQualityResults setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListQualityResultsByEntityResponseQualityResults setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListQualityResultsByEntityResponseQualityResults setRuleChecks(java.util.List<ListQualityResultsByEntityResponseQualityResultsRuleChecks> ruleChecks) {
            this.ruleChecks = ruleChecks;
            return this;
        }
        public java.util.List<ListQualityResultsByEntityResponseQualityResultsRuleChecks> getRuleChecks() {
            return this.ruleChecks;
        }

    }

}
