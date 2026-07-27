// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListQualityResultsByEntityResponseBody extends TeaModel {
    /**
     * <p>The data object that contains the quality check results.</p>
     */
    @NameInMap("Data")
    public ListQualityResultsByEntityResponseBodyData data;

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
     * <p>The ID of the request.</p>
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
         * <p>The business date. If the monitored data is offline, the business date is typically the day before the check is performed.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-03</p>
         */
        @NameInMap("BizDate")
        public String bizDate;

        /**
         * <p>The value of the sample field when a <code>group by</code> clause is used. For example, if you group by the gender field, the values for <code>DiscreteProperty</code> can be male, female, or null.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DiscreteProperty")
        public String discreteProperty;

        /**
         * <p>The result of a single check.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SingleCheckResult")
        public Integer singleCheckResult;

        /**
         * <p>The threshold that was applied to this historical data point.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("Threshold")
        public Float threshold;

        /**
         * <p>The historical check value.</p>
         * 
         * <strong>example:</strong>
         * <p>19</p>
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
        /**
         * <p>The business date. If the monitored data is offline, the business date is typically the day before the check is performed.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-03</p>
         */
        @NameInMap("BizDate")
        public String bizDate;

        /**
         * <p>The value of the sample field when a <code>group by</code> clause is used. For example, if you group by the gender field, the values for <code>DiscreteProperty</code> can be male, female, or null.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DiscreteProperty")
        public String discreteProperty;

        /**
         * <p>The current sample value.</p>
         * 
         * <strong>example:</strong>
         * <p>19</p>
         */
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
         * <p>The expression that specifies the data partition that was checked.</p>
         * 
         * <strong>example:</strong>
         * <p>ds=20200912</p>
         */
        @NameInMap("ActualExpression")
        public String actualExpression;

        /**
         * <p>The start time of the check. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1600704000000</p>
         */
        @NameInMap("BeginTime")
        public Long beginTime;

        /**
         * <p>The business date. If the monitored data is offline, the business date is typically the day before the check is performed.</p>
         * 
         * <strong>example:</strong>
         * <p>1600704000000</p>
         */
        @NameInMap("BizDate")
        public Long bizDate;

        /**
         * <p>The strength of the monitoring rule. Valid values:</p>
         * <ul>
         * <li><p>1: Strong Rule. If a Strong Rule check generates a critical alert, the associated Scheduling Task is blocked.</p>
         * </li>
         * <li><p>0: Weak Rule.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BlockType")
        public Integer blockType;

        /**
         * <p>The check result. This parameter usually has the same value as <code>CheckResultStatus</code>. Valid values:</p>
         * <ul>
         * <li><p>0: Normal</p>
         * </li>
         * <li><p>1: Warning</p>
         * </li>
         * <li><p>2: Critical</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CheckResult")
        public Integer checkResult;

        /**
         * <p>The status of the check result. This parameter corresponds to the status displayed in the UI. Valid values:</p>
         * <ul>
         * <li><p>0: Normal</p>
         * </li>
         * <li><p>1: Warning</p>
         * </li>
         * <li><p>2: Critical</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CheckResultStatus")
        public Integer checkResultStatus;

        /**
         * <p>The ID of the checker.</p>
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
         * <p>The type of the checker. Valid values:</p>
         * <ul>
         * <li><p>0: Fixed Value</p>
         * </li>
         * <li><p>1: Fluctuation</p>
         * </li>
         * <li><p>2: Dynamic Threshold</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>The acceptable deviation from the expected value that triggers a critical alert. This threshold is customizable. If a critical alert is triggered for a Strong Rule, the associated Scheduling Task is blocked.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("CriticalThreshold")
        public Float criticalThreshold;

        /**
         * <p>The scheduling cycle. A common value is YMD, which represents year, month, and day.</p>
         * 
         * <strong>example:</strong>
         * <p>YMD</p>
         */
        @NameInMap("DateType")
        public String dateType;

        /**
         * <p>Specifies whether the check is a discrete check. Valid values:</p>
         * <ul>
         * <li><p>true: The check is a discrete check.</p>
         * </li>
         * <li><p>false: The check is not a discrete check.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DiscreteCheck")
        public Boolean discreteCheck;

        /**
         * <p>The end time of the check. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
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
         * <p>15432322</p>
         */
        @NameInMap("EntityId")
        public Long entityId;

        /**
         * <p>The expected value.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("ExpectValue")
        public Float expectValue;

        /**
         * <p>The Node ID of the Scheduling Task.</p>
         * 
         * <strong>example:</strong>
         * <p>1112323123</p>
         */
        @NameInMap("ExternalId")
        public String externalId;

        /**
         * <p>The type of the scheduling system. Currently, only CWF is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>CWF2</p>
         */
        @NameInMap("ExternalType")
        public String externalType;

        /**
         * <p>Specifies whether the check is based on a fixed value. Valid values:</p>
         * <ul>
         * <li><p>true: The check is based on a fixed value.</p>
         * </li>
         * <li><p>false: The check is not based on a fixed value.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("FixedCheck")
        public Boolean fixedCheck;

        /**
         * <p>The unique ID of the check result.</p>
         * 
         * <strong>example:</strong>
         * <p>121212121</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Specifies whether the result is a predicted value. Valid values:</p>
         * <ul>
         * <li><p>true: The result is a predicted value.</p>
         * </li>
         * <li><p>false: The result is not a predicted value.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsPrediction")
        public Boolean isPrediction;

        /**
         * <p>The predicted lower limit. This value is automatically generated after you set a threshold.</p>
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
         * <p>The method for collecting sample data. Valid values include <code>avg</code>, <code>count</code>, <code>sum</code>, <code>min</code>, <code>max</code>, <code>count_distinct</code>, <code>user_defined</code>, <code>table_count</code>, <code>table_size</code>, <code>table_dt_load_count</code>, <code>table_dt_refuseload_count</code>, <code>null_value</code>, <code>null_value/table_count</code>, <code>(table_count-count_distinct)/table_count</code>, and <code>table_count-count_distinct</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>count_distinct</p>
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
         * <p>The name of the monitored compute engine or Data Source.</p>
         * 
         * <strong>example:</strong>
         * <p>autotest</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <p>The name of the monitored column in the Data Source table.</p>
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
        public java.util.List<ListQualityResultsByEntityResponseBodyDataRuleChecksReferenceValue> referenceValue;

        /**
         * <p>The check result, returned as a string.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ResultString")
        public String resultString;

        /**
         * <p>The monitoring rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123123232</p>
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
        public java.util.List<ListQualityResultsByEntityResponseBodyDataRuleChecksSampleValue> sampleValue;

        /**
         * <p>The name of the table that is monitored.</p>
         * 
         * <strong>example:</strong>
         * <p>dual</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <p>The ID of the check task.</p>
         * 
         * <strong>example:</strong>
         * <p>16008552981681a0d6****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The ID of the rule template.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("TemplateId")
        public Integer templateId;

        /**
         * <p>The name of the rule template.</p>
         * 
         * <strong>example:</strong>
         * <p>Expected value verification</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>The time taken to run the check, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>202</p>
         */
        @NameInMap("TimeCost")
        public String timeCost;

        /**
         * <p>The trend of the check result.</p>
         * 
         * <strong>example:</strong>
         * <p>abs</p>
         */
        @NameInMap("Trend")
        public String trend;

        /**
         * <p>The predicted upper limit. This value is automatically generated after you set a threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>25555</p>
         */
        @NameInMap("UpperValue")
        public Float upperValue;

        /**
         * <p>The warning threshold. This value indicates the acceptable deviation from the expected value. You can customize this threshold based on your business requirements.</p>
         * 
         * <strong>example:</strong>
         * <p>0.1</p>
         */
        @NameInMap("WarningThreshold")
        public Float warningThreshold;

        /**
         * <p>The filter condition of the monitoring rule.</p>
         * 
         * <strong>example:</strong>
         * <p>id&gt;0</p>
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

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setEntityId(Long entityId) {
            this.entityId = entityId;
            return this;
        }
        public Long getEntityId() {
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

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
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

        public ListQualityResultsByEntityResponseBodyDataRuleChecks setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
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
         * <p>The monitoring rule check results.</p>
         */
        @NameInMap("RuleChecks")
        public java.util.List<ListQualityResultsByEntityResponseBodyDataRuleChecks> ruleChecks;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
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
