// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListQualityResultsByRuleResponseBody extends TeaModel {
    /**
     * <p>The data structure of the monitoring results returned.</p>
     */
    @NameInMap("Data")
    public ListQualityResultsByRuleResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>401</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>You have no permission.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CBA58543-00D4-41****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListQualityResultsByRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListQualityResultsByRuleResponseBody self = new ListQualityResultsByRuleResponseBody();
        return TeaModel.build(map, self);
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

    public ListQualityResultsByRuleResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListQualityResultsByRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListQualityResultsByRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListQualityResultsByRuleResponseBodyDataRuleChecksReferenceValue extends TeaModel {
        /**
         * <p>The data timestamp. If the monitored business entity is offline data, the value is usually one day before the monitoring is performed.</p>
         * 
         * <strong>example:</strong>
         * <p>1600704000000</p>
         */
        @NameInMap("BizDate")
        public String bizDate;

        /**
         * <p>The values of the sample field that are grouped by using the GROUP BY clause. For example, the values of the Gender field are grouped by using the GROUP BY clause. In this case, the values of DiscreteProperty are Male, Female, and null.</p>
         * 
         * <strong>example:</strong>
         * <p>type1</p>
         */
        @NameInMap("DiscreteProperty")
        public String discreteProperty;

        /**
         * <p>The string of the monitoring result.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("SingleCheckResult")
        public Integer singleCheckResult;

        /**
         * <p>The threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("Threshold")
        public Float threshold;

        /**
         * <p>The sample value.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Value")
        public Float value;

        public static ListQualityResultsByRuleResponseBodyDataRuleChecksReferenceValue build(java.util.Map<String, ?> map) throws Exception {
            ListQualityResultsByRuleResponseBodyDataRuleChecksReferenceValue self = new ListQualityResultsByRuleResponseBodyDataRuleChecksReferenceValue();
            return TeaModel.build(map, self);
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

        public ListQualityResultsByRuleResponseBodyDataRuleChecksReferenceValue setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class ListQualityResultsByRuleResponseBodyDataRuleChecksSampleValue extends TeaModel {
        /**
         * <p>The data timestamp. If the monitored business entity is offline data, the value is usually one day before the monitoring is performed.</p>
         * 
         * <strong>example:</strong>
         * <p>1600704000000</p>
         */
        @NameInMap("BizDate")
        public String bizDate;

        /**
         * <p>The values of the sample field that are grouped by using the GROUP BY clause. For example, the values of the Gender field are grouped by using the GROUP BY clause. In this case, the values of DiscreteProperty are Male, Female, and null.</p>
         * 
         * <strong>example:</strong>
         * <p>type2</p>
         */
        @NameInMap("DiscreteProperty")
        public String discreteProperty;

        /**
         * <p>The sample value.</p>
         * 
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("Value")
        public Float value;

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

        public ListQualityResultsByRuleResponseBodyDataRuleChecksSampleValue setDiscreteProperty(String discreteProperty) {
            this.discreteProperty = discreteProperty;
            return this;
        }
        public String getDiscreteProperty() {
            return this.discreteProperty;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecksSampleValue setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class ListQualityResultsByRuleResponseBodyDataRuleChecks extends TeaModel {
        /**
         * <p>The partition in the monitored data source table.</p>
         * 
         * <strong>example:</strong>
         * <p>ds=20200925</p>
         */
        @NameInMap("ActualExpression")
        public String actualExpression;

        /**
         * <p>The time when the monitoring started.</p>
         * 
         * <strong>example:</strong>
         * <p>1600704000000</p>
         */
        @NameInMap("BeginTime")
        public Long beginTime;

        /**
         * <p>The data timestamp. If the monitored business entity is offline data, the value is usually one day before the monitoring is performed.</p>
         * 
         * <strong>example:</strong>
         * <p>1600704000000</p>
         */
        @NameInMap("BizDate")
        public Long bizDate;

        /**
         * <p>The strength of the monitoring rule. The strength of a monitoring rule indicates the importance of the rule. Valid values:</p>
         * <ul>
         * <li>1: indicates that the monitoring rule is a strong rule.</li>
         * <li>0: indicates that the monitoring rule is a weak rule. You can specify the strength of a monitoring rule based on your business requirements. If a monitoring rule is a strong rule and the critical threshold is exceeded, a critical alert is reported and tasks that are associated with the rule are blocked from running.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BlockType")
        public Integer blockType;

        /**
         * <p>The monitoring result.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("CheckResult")
        public Integer checkResult;

        /**
         * <p>The status of the monitoring result.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("CheckResultStatus")
        public Integer checkResultStatus;

        /**
         * <p>The checker ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("CheckerId")
        public Integer checkerId;

        /**
         * <p>The name of the checker.</p>
         * 
         * <strong>example:</strong>
         * <p>fulx</p>
         */
        @NameInMap("CheckerName")
        public String checkerName;

        /**
         * <p>The type of the checker.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CheckerType")
        public Integer checkerType;

        /**
         * <p>The description of the monitoring rule.</p>
         * 
         * <strong>example:</strong>
         * <p>The description of the rule.</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The threshold for a critical alert. The threshold indicates the deviation of the monitoring result from the expected value. You can specify a custom value for the threshold based on your business requirements. If a monitoring rule is a strong rule and the critical threshold is exceeded, a critical alert is reported and tasks that are associated with the rule are blocked from running.</p>
         * 
         * <strong>example:</strong>
         * <p>0.6</p>
         */
        @NameInMap("CriticalThreshold")
        public Float criticalThreshold;

        /**
         * <p>The scheduling frequency. In most cases, the value of this parameter is YMD. This value indicates year, month, and day.</p>
         * 
         * <strong>example:</strong>
         * <p>YMD</p>
         */
        @NameInMap("DateType")
        public String dateType;

        /**
         * <p>Indicates whether the monitoring is discrete monitoring. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DiscreteCheck")
        public Boolean discreteCheck;

        /**
         * <p>The time when the monitoring ended.</p>
         * 
         * <strong>example:</strong>
         * <p>1600704000000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The ID of the partition filter expression.</p>
         * 
         * <strong>example:</strong>
         * <p>14534343</p>
         */
        @NameInMap("EntityId")
        public Long entityId;

        /**
         * <p>The expected value.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("ExpectValue")
        public Float expectValue;

        /**
         * <p>The node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123112232</p>
         */
        @NameInMap("ExternalId")
        public String externalId;

        /**
         * <p>The type of the scheduling system. Only CWF scheduling systems are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>CWF2</p>
         */
        @NameInMap("ExternalType")
        public String externalType;

        /**
         * <p>Indicates whether the monitoring is performed based on a fixed value. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("FixedCheck")
        public Boolean fixedCheck;

        /**
         * <p>The primary key ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2231123</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Indicates whether the monitoring result is the same as the predicted result. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsPrediction")
        public Boolean isPrediction;

        /**
         * <p>The lower limit of the predicted result. The value of this parameter is automatically generated based on the threshold that you specify.</p>
         * 
         * <strong>example:</strong>
         * <p>2344</p>
         */
        @NameInMap("LowerValue")
        public Float lowerValue;

        /**
         * <p>The partition filter expression.</p>
         * 
         * <strong>example:</strong>
         * <p>ds=$[yyyymmdd]</p>
         */
        @NameInMap("MatchExpression")
        public String matchExpression;

        /**
         * <p>The method used to collect sample data, such as such as avg, count, sum, min, max, count_distinct, user_defined, table_count, table_size, table_dt_load_count, table_dt_refuseload_count, null_value, null_value/table_count, (table_count-count_distinct)/table_count, or table_count-count_distinct.</p>
         * 
         * <strong>example:</strong>
         * <p>max</p>
         */
        @NameInMap("MethodName")
        public String methodName;

        /**
         * <p>The comparison operator.</p>
         * 
         * <strong>example:</strong>
         * <blockquote>
         * </blockquote>
         */
        @NameInMap("Op")
        public String op;

        /**
         * <p>Indicates whether the monitoring rule is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Open")
        public Boolean open;

        /**
         * <p>The name of the compute engine or data source for which data quality is monitored.</p>
         * 
         * <strong>example:</strong>
         * <p>autotest</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <p>The field whose data quality is checked based on the monitoring rule. This field is a column in the data source table that is monitored.</p>
         * 
         * <strong>example:</strong>
         * <p>type</p>
         */
        @NameInMap("Property")
        public String property;

        /**
         * <p>The historical sample values.</p>
         */
        @NameInMap("ReferenceValue")
        public java.util.List<ListQualityResultsByRuleResponseBodyDataRuleChecksReferenceValue> referenceValue;

        /**
         * <p>The string of the monitoring result.</p>
         * 
         * <strong>example:</strong>
         * <p>ResultString</p>
         */
        @NameInMap("ResultString")
        public String resultString;

        /**
         * <p>The ID of the monitoring rule.</p>
         * 
         * <strong>example:</strong>
         * <p>123421</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        /**
         * <p>The name of the monitoring rule.</p>
         * 
         * <strong>example:</strong>
         * <p>The name of the rule.</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The current sample values.</p>
         */
        @NameInMap("SampleValue")
        public java.util.List<ListQualityResultsByRuleResponseBodyDataRuleChecksSampleValue> sampleValue;

        /**
         * <p>The name of the table that is monitored.</p>
         * 
         * <strong>example:</strong>
         * <p>dual</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <p>The monitoring task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>16008552981681a0d6****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The ID of the monitoring template.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("TemplateId")
        public Integer templateId;

        /**
         * <p>The name of the monitoring template.</p>
         * 
         * <strong>example:</strong>
         * <p>Expected value verification</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>The time that was taken to run the monitoring task.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TimeCost")
        public String timeCost;

        /**
         * <p>The trend of the monitoring result.</p>
         * 
         * <strong>example:</strong>
         * <p>up</p>
         */
        @NameInMap("Trend")
        public String trend;

        /**
         * <p>The upper limit of the predicted result. The value of this parameter is automatically generated based on the threshold that you specify.</p>
         * 
         * <strong>example:</strong>
         * <p>22200</p>
         */
        @NameInMap("UpperValue")
        public Float upperValue;

        /**
         * <p>The threshold for a warning alert. The threshold specifies the deviation of the monitoring result from the expected value. You can specify a custom value for the threshold based on your business requirements.</p>
         * 
         * <strong>example:</strong>
         * <p>0.1</p>
         */
        @NameInMap("WarningThreshold")
        public Float warningThreshold;

        /**
         * <p>The filter condition of the monitoring task.</p>
         * 
         * <strong>example:</strong>
         * <p>type!=\&quot;type2\&quot;</p>
         */
        @NameInMap("WhereCondition")
        public String whereCondition;

        public static ListQualityResultsByRuleResponseBodyDataRuleChecks build(java.util.Map<String, ?> map) throws Exception {
            ListQualityResultsByRuleResponseBodyDataRuleChecks self = new ListQualityResultsByRuleResponseBodyDataRuleChecks();
            return TeaModel.build(map, self);
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setActualExpression(String actualExpression) {
            this.actualExpression = actualExpression;
            return this;
        }
        public String getActualExpression() {
            return this.actualExpression;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setBeginTime(Long beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public Long getBeginTime() {
            return this.beginTime;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setBizDate(Long bizDate) {
            this.bizDate = bizDate;
            return this;
        }
        public Long getBizDate() {
            return this.bizDate;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setBlockType(Integer blockType) {
            this.blockType = blockType;
            return this;
        }
        public Integer getBlockType() {
            return this.blockType;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setCheckResult(Integer checkResult) {
            this.checkResult = checkResult;
            return this;
        }
        public Integer getCheckResult() {
            return this.checkResult;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setCheckResultStatus(Integer checkResultStatus) {
            this.checkResultStatus = checkResultStatus;
            return this;
        }
        public Integer getCheckResultStatus() {
            return this.checkResultStatus;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setCheckerId(Integer checkerId) {
            this.checkerId = checkerId;
            return this;
        }
        public Integer getCheckerId() {
            return this.checkerId;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setCheckerName(String checkerName) {
            this.checkerName = checkerName;
            return this;
        }
        public String getCheckerName() {
            return this.checkerName;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setCheckerType(Integer checkerType) {
            this.checkerType = checkerType;
            return this;
        }
        public Integer getCheckerType() {
            return this.checkerType;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setCriticalThreshold(Float criticalThreshold) {
            this.criticalThreshold = criticalThreshold;
            return this;
        }
        public Float getCriticalThreshold() {
            return this.criticalThreshold;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setDateType(String dateType) {
            this.dateType = dateType;
            return this;
        }
        public String getDateType() {
            return this.dateType;
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

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setEntityId(Long entityId) {
            this.entityId = entityId;
            return this;
        }
        public Long getEntityId() {
            return this.entityId;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setExpectValue(Float expectValue) {
            this.expectValue = expectValue;
            return this;
        }
        public Float getExpectValue() {
            return this.expectValue;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }
        public String getExternalId() {
            return this.externalId;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setExternalType(String externalType) {
            this.externalType = externalType;
            return this;
        }
        public String getExternalType() {
            return this.externalType;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setFixedCheck(Boolean fixedCheck) {
            this.fixedCheck = fixedCheck;
            return this;
        }
        public Boolean getFixedCheck() {
            return this.fixedCheck;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setIsPrediction(Boolean isPrediction) {
            this.isPrediction = isPrediction;
            return this;
        }
        public Boolean getIsPrediction() {
            return this.isPrediction;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setLowerValue(Float lowerValue) {
            this.lowerValue = lowerValue;
            return this;
        }
        public Float getLowerValue() {
            return this.lowerValue;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setMatchExpression(String matchExpression) {
            this.matchExpression = matchExpression;
            return this;
        }
        public String getMatchExpression() {
            return this.matchExpression;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setMethodName(String methodName) {
            this.methodName = methodName;
            return this;
        }
        public String getMethodName() {
            return this.methodName;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setOp(String op) {
            this.op = op;
            return this;
        }
        public String getOp() {
            return this.op;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setOpen(Boolean open) {
            this.open = open;
            return this;
        }
        public Boolean getOpen() {
            return this.open;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setProperty(String property) {
            this.property = property;
            return this;
        }
        public String getProperty() {
            return this.property;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setReferenceValue(java.util.List<ListQualityResultsByRuleResponseBodyDataRuleChecksReferenceValue> referenceValue) {
            this.referenceValue = referenceValue;
            return this;
        }
        public java.util.List<ListQualityResultsByRuleResponseBodyDataRuleChecksReferenceValue> getReferenceValue() {
            return this.referenceValue;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setResultString(String resultString) {
            this.resultString = resultString;
            return this;
        }
        public String getResultString() {
            return this.resultString;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setSampleValue(java.util.List<ListQualityResultsByRuleResponseBodyDataRuleChecksSampleValue> sampleValue) {
            this.sampleValue = sampleValue;
            return this;
        }
        public java.util.List<ListQualityResultsByRuleResponseBodyDataRuleChecksSampleValue> getSampleValue() {
            return this.sampleValue;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setTemplateId(Integer templateId) {
            this.templateId = templateId;
            return this;
        }
        public Integer getTemplateId() {
            return this.templateId;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setTimeCost(String timeCost) {
            this.timeCost = timeCost;
            return this;
        }
        public String getTimeCost() {
            return this.timeCost;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setTrend(String trend) {
            this.trend = trend;
            return this;
        }
        public String getTrend() {
            return this.trend;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setUpperValue(Float upperValue) {
            this.upperValue = upperValue;
            return this;
        }
        public Float getUpperValue() {
            return this.upperValue;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setWarningThreshold(Float warningThreshold) {
            this.warningThreshold = warningThreshold;
            return this;
        }
        public Float getWarningThreshold() {
            return this.warningThreshold;
        }

        public ListQualityResultsByRuleResponseBodyDataRuleChecks setWhereCondition(String whereCondition) {
            this.whereCondition = whereCondition;
            return this;
        }
        public String getWhereCondition() {
            return this.whereCondition;
        }

    }

    public static class ListQualityResultsByRuleResponseBodyData extends TeaModel {
        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The returned monitoring results.</p>
         */
        @NameInMap("RuleChecks")
        public java.util.List<ListQualityResultsByRuleResponseBodyDataRuleChecks> ruleChecks;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListQualityResultsByRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListQualityResultsByRuleResponseBodyData self = new ListQualityResultsByRuleResponseBodyData();
            return TeaModel.build(map, self);
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

        public ListQualityResultsByRuleResponseBodyData setRuleChecks(java.util.List<ListQualityResultsByRuleResponseBodyDataRuleChecks> ruleChecks) {
            this.ruleChecks = ruleChecks;
            return this;
        }
        public java.util.List<ListQualityResultsByRuleResponseBodyDataRuleChecks> getRuleChecks() {
            return this.ruleChecks;
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
