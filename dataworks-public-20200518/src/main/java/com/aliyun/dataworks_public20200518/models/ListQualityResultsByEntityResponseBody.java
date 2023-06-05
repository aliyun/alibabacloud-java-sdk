// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListQualityResultsByEntityResponseBody extends TeaModel {
    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("Data")
    public ListQualityResultsByEntityResponseBodyData data;

    /**
     * <p>The number of entries returned per page. Default value: 10. Maximum value: 100.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error code returned.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The data structure of the monitoring results returned.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListQualityResultsByEntityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListQualityResultsByEntityResponseBody self = new ListQualityResultsByEntityResponseBody();
        return TeaModel.build(map, self);
    }

    public ListQualityResultsByEntityResponseBody setData(ListQualityResultsByEntityResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListQualityResultsByEntityResponseBodyData getData() {
        return this.data;
    }

    public ListQualityResultsByEntityResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListQualityResultsByEntityResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListQualityResultsByEntityResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    public static class ListQualityResultsByEntityResponseBodyDataRuleChecksReferenceValue extends TeaModel {
        /**
         * <p>The sample values.</p>
         */
        @NameInMap("BizDate")
        public String bizDate;

        /**
         * <p>The monitoring result.</p>
         */
        @NameInMap("DiscreteProperty")
        public String discreteProperty;

        /**
         * <p>The values of the sample field that are grouped by using the GROUP BY clause. For example, the values of the Gender field are grouped by using the GROUP BY clause. In this case, the values of DiscreteProperty are Male, Female, and null.</p>
         */
        @NameInMap("SingleCheckResult")
        public Integer singleCheckResult;

        /**
         * <p>The data timestamp. If the monitored business entity is offline data, the value is usually one day before the monitoring is performed.</p>
         */
        @NameInMap("Threshold")
        public Float threshold;

        /**
         * <p>The threshold.</p>
         */
        @NameInMap("Value")
        public Float value;

        public static ListQualityResultsByEntityResponseBodyDataRuleChecksReferenceValue build(java.util.Map<String, ?> map) throws Exception {
            ListQualityResultsByEntityResponseBodyDataRuleChecksReferenceValue self = new ListQualityResultsByEntityResponseBodyDataRuleChecksReferenceValue();
            return TeaModel.build(map, self);
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecksReferenceValue setBizDate(String bizDate) {
            this.bizDate = bizDate;
            return this;
        }
        public String getBizDate() {
            return this.bizDate;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecksReferenceValue setDiscreteProperty(String discreteProperty) {
            this.discreteProperty = discreteProperty;
            return this;
        }
        public String getDiscreteProperty() {
            return this.discreteProperty;
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

        public ListQualityResultsByEntityResponseBodyDataRuleChecksReferenceValue setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class ListQualityResultsByEntityResponseBodyDataRuleChecksSampleValue extends TeaModel {
        @NameInMap("BizDate")
        public String bizDate;

        @NameInMap("DiscreteProperty")
        public String discreteProperty;

        @NameInMap("Value")
        public Float value;

        public static ListQualityResultsByEntityResponseBodyDataRuleChecksSampleValue build(java.util.Map<String, ?> map) throws Exception {
            ListQualityResultsByEntityResponseBodyDataRuleChecksSampleValue self = new ListQualityResultsByEntityResponseBodyDataRuleChecksSampleValue();
            return TeaModel.build(map, self);
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecksSampleValue setBizDate(String bizDate) {
            this.bizDate = bizDate;
            return this;
        }
        public String getBizDate() {
            return this.bizDate;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecksSampleValue setDiscreteProperty(String discreteProperty) {
            this.discreteProperty = discreteProperty;
            return this;
        }
        public String getDiscreteProperty() {
            return this.discreteProperty;
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
        /**
         * <p>The trend of the monitoring result.</p>
         */
        @NameInMap("ActualExpression")
        public String actualExpression;

        /**
         * <p>Indicates whether the monitoring result is the same as the predicted result. Valid values:</p>
         * <br>
         * <p>*   true: indicates that the monitoring result is the same as the predicted result.</p>
         * <p>*   false: indicates that the monitoring result is different from the predicted result.</p>
         */
        @NameInMap("BeginTime")
        public Long beginTime;

        /**
         * <p>The partition filter expression.</p>
         */
        @NameInMap("BizDate")
        public Long bizDate;

        /**
         * <p>The name of the table that is monitored.</p>
         */
        @NameInMap("BlockType")
        public Integer blockType;

        /**
         * <p>The monitoring type. Valid values:</p>
         * <br>
         * <p>*   1: VOLATILITY_CHECK</p>
         * <p>*   2: FIXEDVALUE_CHECK</p>
         */
        @NameInMap("CheckResult")
        public Integer checkResult;

        /**
         * <p>The ID of the monitoring rule.</p>
         */
        @NameInMap("CheckResultStatus")
        public Integer checkResultStatus;

        /**
         * <p>The method used to collect sample data, such as avg, count, sum, min, max, count_distinct, user_defined, table_count, table_size, table_dt_load_count, table_dt_refuseload_count, null_value, null_value/table_count, (table_count-count_distinct)/table_count, or table_count-count_distinct.</p>
         */
        @NameInMap("CheckerId")
        public Integer checkerId;

        /**
         * <p>The comparison operator.</p>
         */
        @NameInMap("CheckerName")
        public String checkerName;

        /**
         * <p>The type of the scheduling cycle. In most cases, the value of this parameter is YMD. This value indicates year, month, and day.</p>
         */
        @NameInMap("CheckerType")
        public Integer checkerType;

        /**
         * <p>The name of the checker.</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The ID of the checker.</p>
         */
        @NameInMap("CriticalThreshold")
        public Float criticalThreshold;

        /**
         * <p>The name of the monitoring rule.</p>
         */
        @NameInMap("DateType")
        public String dateType;

        /**
         * <p>The lower limit of the predicted result. The value of this parameter is automatically generated based on the threshold that you specified.</p>
         */
        @NameInMap("DiscreteCheck")
        public Boolean discreteCheck;

        /**
         * <p>The ID of the partition filter expression.</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The ID of the monitoring template.</p>
         */
        @NameInMap("EntityId")
        public Integer entityId;

        /**
         * <p>The ID of the primary key.</p>
         */
        @NameInMap("ExpectValue")
        public Float expectValue;

        /**
         * <p>The type of the scheduling system. Only CWF scheduling systems are supported.</p>
         */
        @NameInMap("ExternalId")
        public String externalId;

        /**
         * <p>The string of the monitoring result.</p>
         */
        @NameInMap("ExternalType")
        public String externalType;

        /**
         * <p>The partition in the monitored data source table.</p>
         */
        @NameInMap("FixedCheck")
        public Boolean fixedCheck;

        /**
         * <p>The check value.</p>
         */
        @NameInMap("Id")
        public Integer id;

        /**
         * <p>Indicates whether the monitoring is discrete monitoring. Valid values:</p>
         * <br>
         * <p>*   true: indicates that the monitoring is discrete monitoring.</p>
         * <p>*   false: indicates that the monitoring is not discrete monitoring.</p>
         */
        @NameInMap("IsPrediction")
        public Boolean isPrediction;

        /**
         * <p>The expected value.</p>
         */
        @NameInMap("LowerValue")
        public Float lowerValue;

        /**
         * <p>The time when the monitoring started.</p>
         */
        @NameInMap("MatchExpression")
        public String matchExpression;

        /**
         * <p>The filter condition of the monitoring rule.</p>
         */
        @NameInMap("MethodName")
        public String methodName;

        /**
         * <p>The ID of the node.</p>
         */
        @NameInMap("Op")
        public String op;

        /**
         * <p>The threshold for a critical alert. The threshold indicates the deviation of the monitoring result from the expected value. You can customize this threshold based on your business requirements. If a strong rule is used and a critical alert is reported, nodes are blocked.</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <p>The check result of the monitoring rule. Valid values:</p>
         * <br>
         * <p>*   0: indicates that the data source table is normal.</p>
         * <p>*   1: indicates that a warning alert is reported.</p>
         * <p>*   2: indicates that a critical alert is reported.</p>
         */
        @NameInMap("Property")
        public String property;

        /**
         * <p>The data timestamp. If the monitored business entity is offline data, the value is usually one day before the monitoring is performed.</p>
         */
        @NameInMap("ReferenceValue")
        public java.util.List<ListQualityResultsByEntityResponseBodyDataRuleChecksReferenceValue> referenceValue;

        /**
         * <p>The name of the compute engine instance or data source for which data quality is monitored.</p>
         */
        @NameInMap("ResultString")
        public String resultString;

        /**
         * <p>The upper limit of the predicted result. The value of this parameter is automatically generated based on the threshold that you specified.</p>
         */
        @NameInMap("RuleId")
        public Integer ruleId;

        /**
         * <p>The time when the monitoring ended.</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The current sample value.</p>
         */
        @NameInMap("SampleValue")
        public java.util.List<ListQualityResultsByEntityResponseBodyDataRuleChecksSampleValue> sampleValue;

        /**
         * <p>The name of the monitoring template.</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <p>The values of the sample field that are grouped by using the GROUP BY clause. For example, the values of the Gender field are grouped by using the GROUP BY clause. In this case, the values of DiscreteProperty are Male, Female, and null.</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The historical sample values.</p>
         */
        @NameInMap("TemplateId")
        public Integer templateId;

        /**
         * <p>Indicates whether the monitoring is performed based on a fixed value. Valid values:</p>
         * <br>
         * <p>*   true: indicates that the monitoring is performed based on a fixed value.</p>
         * <p>*   false: indicates that the monitoring is performed based on a non-fixed value.</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>The data timestamp. If the monitored business entity is offline data, the value is usually one day before the monitoring is performed.</p>
         */
        @NameInMap("TimeCost")
        public String timeCost;

        /**
         * <p>The monitoring result. The value of this parameter is the same as the value of the CheckResultStatus parameter. Valid values:</p>
         * <br>
         * <p>*   0: indicates that the data source table is normal.</p>
         * <p>*   1: indicates that a warning alert is reported.</p>
         * <p>*   2: indicates that a critical alert is reported.</p>
         */
        @NameInMap("Trend")
        public String trend;

        /**
         * <p>The time that was taken to run the monitoring task. Unit: seconds.</p>
         */
        @NameInMap("UpperValue")
        public Float upperValue;

        /**
         * <p>The description of the monitoring rule.</p>
         */
        @NameInMap("WarningThreshold")
        public Float warningThreshold;

        /**
         * <p>The ID of the monitoring task.</p>
         */
        @NameInMap("WhereCondition")
        public String whereCondition;

        public static ListQualityResultsByEntityResponseBodyDataRuleChecks build(java.util.Map<String, ?> map) throws Exception {
            ListQualityResultsByEntityResponseBodyDataRuleChecks self = new ListQualityResultsByEntityResponseBodyDataRuleChecks();
            return TeaModel.build(map, self);
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setActualExpression(String actualExpression) {
            this.actualExpression = actualExpression;
            return this;
        }
        public String getActualExpression() {
            return this.actualExpression;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setBeginTime(Long beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public Long getBeginTime() {
            return this.beginTime;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setBizDate(Long bizDate) {
            this.bizDate = bizDate;
            return this;
        }
        public Long getBizDate() {
            return this.bizDate;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setBlockType(Integer blockType) {
            this.blockType = blockType;
            return this;
        }
        public Integer getBlockType() {
            return this.blockType;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setCheckResult(Integer checkResult) {
            this.checkResult = checkResult;
            return this;
        }
        public Integer getCheckResult() {
            return this.checkResult;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setCheckResultStatus(Integer checkResultStatus) {
            this.checkResultStatus = checkResultStatus;
            return this;
        }
        public Integer getCheckResultStatus() {
            return this.checkResultStatus;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setCheckerId(Integer checkerId) {
            this.checkerId = checkerId;
            return this;
        }
        public Integer getCheckerId() {
            return this.checkerId;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setCheckerName(String checkerName) {
            this.checkerName = checkerName;
            return this;
        }
        public String getCheckerName() {
            return this.checkerName;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setCheckerType(Integer checkerType) {
            this.checkerType = checkerType;
            return this;
        }
        public Integer getCheckerType() {
            return this.checkerType;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setCriticalThreshold(Float criticalThreshold) {
            this.criticalThreshold = criticalThreshold;
            return this;
        }
        public Float getCriticalThreshold() {
            return this.criticalThreshold;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setDateType(String dateType) {
            this.dateType = dateType;
            return this;
        }
        public String getDateType() {
            return this.dateType;
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

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setEntityId(Integer entityId) {
            this.entityId = entityId;
            return this;
        }
        public Integer getEntityId() {
            return this.entityId;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setExpectValue(Float expectValue) {
            this.expectValue = expectValue;
            return this;
        }
        public Float getExpectValue() {
            return this.expectValue;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }
        public String getExternalId() {
            return this.externalId;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setExternalType(String externalType) {
            this.externalType = externalType;
            return this;
        }
        public String getExternalType() {
            return this.externalType;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setFixedCheck(Boolean fixedCheck) {
            this.fixedCheck = fixedCheck;
            return this;
        }
        public Boolean getFixedCheck() {
            return this.fixedCheck;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setIsPrediction(Boolean isPrediction) {
            this.isPrediction = isPrediction;
            return this;
        }
        public Boolean getIsPrediction() {
            return this.isPrediction;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setLowerValue(Float lowerValue) {
            this.lowerValue = lowerValue;
            return this;
        }
        public Float getLowerValue() {
            return this.lowerValue;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setMatchExpression(String matchExpression) {
            this.matchExpression = matchExpression;
            return this;
        }
        public String getMatchExpression() {
            return this.matchExpression;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setMethodName(String methodName) {
            this.methodName = methodName;
            return this;
        }
        public String getMethodName() {
            return this.methodName;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setOp(String op) {
            this.op = op;
            return this;
        }
        public String getOp() {
            return this.op;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setProperty(String property) {
            this.property = property;
            return this;
        }
        public String getProperty() {
            return this.property;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setReferenceValue(java.util.List<ListQualityResultsByEntityResponseBodyDataRuleChecksReferenceValue> referenceValue) {
            this.referenceValue = referenceValue;
            return this;
        }
        public java.util.List<ListQualityResultsByEntityResponseBodyDataRuleChecksReferenceValue> getReferenceValue() {
            return this.referenceValue;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setResultString(String resultString) {
            this.resultString = resultString;
            return this;
        }
        public String getResultString() {
            return this.resultString;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setRuleId(Integer ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Integer getRuleId() {
            return this.ruleId;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setSampleValue(java.util.List<ListQualityResultsByEntityResponseBodyDataRuleChecksSampleValue> sampleValue) {
            this.sampleValue = sampleValue;
            return this;
        }
        public java.util.List<ListQualityResultsByEntityResponseBodyDataRuleChecksSampleValue> getSampleValue() {
            return this.sampleValue;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setTemplateId(Integer templateId) {
            this.templateId = templateId;
            return this;
        }
        public Integer getTemplateId() {
            return this.templateId;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
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

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setUpperValue(Float upperValue) {
            this.upperValue = upperValue;
            return this;
        }
        public Float getUpperValue() {
            return this.upperValue;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setWarningThreshold(Float warningThreshold) {
            this.warningThreshold = warningThreshold;
            return this;
        }
        public Float getWarningThreshold() {
            return this.warningThreshold;
        }

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setWhereCondition(String whereCondition) {
            this.whereCondition = whereCondition;
            return this;
        }
        public String getWhereCondition() {
            return this.whereCondition;
        }

    }

    public static class ListQualityResultsByEntityResponseBodyData extends TeaModel {
        /**
         * <p>The monitoring results returned.</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The type of the monitoring rule. The type of a monitoring rule indicates the importance of the rule. Valid values:</p>
         * <br>
         * <p>*   1: indicates that the monitoring rule is a strong rule.</p>
         * <br>
         * <p>*   0: indicates that the monitoring rule is a weak rule.</p>
         * <br>
         * <p>    You can specify whether a monitoring rule is a strong rule based on your business requirements. If a strong rule is used and a critical alert is triggered, nodes are blocked.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The field of the rule attribute. This field is the column name of the data source table that is monitored.</p>
         */
        @NameInMap("RuleChecks")
        public java.util.List<ListQualityResultsByEntityResponseBodyDataRuleChecks> ruleChecks;

        /**
         * <p>The threshold for a warning alert. The threshold indicates the deviation of the monitoring result from the expected value. You can customize this threshold based on your business requirements.</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

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

        public ListQualityResultsByEntityResponseBodyData setRuleChecks(java.util.List<ListQualityResultsByEntityResponseBodyDataRuleChecks> ruleChecks) {
            this.ruleChecks = ruleChecks;
            return this;
        }
        public java.util.List<ListQualityResultsByEntityResponseBodyDataRuleChecks> getRuleChecks() {
            return this.ruleChecks;
        }

        public ListQualityResultsByEntityResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
