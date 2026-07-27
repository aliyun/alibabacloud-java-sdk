// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetQualityRuleResponseBody extends TeaModel {
    /**
     * <p>The quality rule details.</p>
     */
    @NameInMap("Data")
    public GetQualityRuleResponseBodyData data;

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
     * <p>576b9457-2cf5-4****</p>
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

    public static GetQualityRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQualityRuleResponseBody self = new GetQualityRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQualityRuleResponseBody setData(GetQualityRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetQualityRuleResponseBodyData getData() {
        return this.data;
    }

    public GetQualityRuleResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetQualityRuleResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
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

    public GetQualityRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetQualityRuleResponseBodyData extends TeaModel {
        /**
         * <p>The severity of the quality rule. Valid values:</p>
         * <ul>
         * <li><p><code>1</code>: Strong Rule. If a Strong Rule triggers a critical Alert, the associated Scheduling Task is blocked.</p>
         * </li>
         * <li><p><code>0</code>: Weak Rule.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BlockType")
        public Integer blockType;

        /**
         * <p>The checker ID, which is derived from a primary key and used for front-end identification.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("Checker")
        public Integer checker;

        /**
         * <p>The name of the checker.</p>
         * 
         * <strong>example:</strong>
         * <p>compared with a fixed value</p>
         */
        @NameInMap("CheckerName")
        public String checkerName;

        /**
         * <p>The comment for the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Verify that the primary key is unique</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The threshold for a critical Alert, which defines the maximum acceptable deviation from the Expected Value. If this threshold is met for a Strong Rule, the associated Scheduling Task is blocked.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("CriticalThreshold")
        public String criticalThreshold;

        /**
         * <p>The ID of the partition expression.</p>
         * 
         * <strong>example:</strong>
         * <p>165523</p>
         */
        @NameInMap("EntityId")
        public Long entityId;

        /**
         * <p>The expected value.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("ExpectValue")
        public String expectValue;

        /**
         * <p>Indicates whether to validate against a fixed value.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FixCheck")
        public Boolean fixCheck;

        /**
         * <p>The ID of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>123232</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The ID of the method used to collect sample data.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("MethodId")
        public Integer methodId;

        /**
         * <p>The name of the method used to collect sample data. Valid values include <code>avg</code>, <code>count</code>, <code>sum</code>, <code>min</code>, <code>max</code>, <code>count_distinct</code>, <code>user_defined</code>, <code>table_count</code>, <code>table_size</code>, <code>table_dt_load_count</code>, <code>table_dt_refuseload_count</code>, <code>null_value</code>, <code>null_value/table_count</code>, <code>(table_count-count_distinct)/table_count</code>, and <code>table_count-count_distinct</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>table_count</p>
         */
        @NameInMap("MethodName")
        public String methodName;

        /**
         * <p>The ID of the Alibaba Cloud account that configured the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>1822931****</p>
         */
        @NameInMap("OnDuty")
        public String onDuty;

        /**
         * <p>The name of the Alibaba Cloud account that configured the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("OnDutyAccountName")
        public String onDutyAccountName;

        /**
         * <p>Indicates whether the rule is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("OpenSwitch")
        public Boolean openSwitch;

        /**
         * <p>The comparison operator.</p>
         * 
         * <strong>example:</strong>
         * <blockquote>
         * <p>=</p>
         * </blockquote>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>Indicates whether the threshold is dynamic. Valid values:</p>
         * <ul>
         * <li><p><code>0</code>: The threshold is static.</p>
         * </li>
         * <li><p><code>1</code>: The threshold is dynamic.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PredictType")
        public Integer predictType;

        /**
         * <p>The column in the data source table to which the rule applies.</p>
         * 
         * <strong>example:</strong>
         * <p>id</p>
         */
        @NameInMap("Property")
        public String property;

        /**
         * <p>The name of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>View table fluctuations</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The type of the quality rule. Valid values:</p>
         * <ul>
         * <li><p><code>0</code>: A rule based on a system template.</p>
         * </li>
         * <li><p><code>1</code>: A rule based on a custom SQL statement.</p>
         * </li>
         * <li><p><code>4</code>: A rule based on a custom template.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RuleType")
        public Integer ruleType;

        /**
         * <p>The variable settings inserted before a custom rule. The format is x=a,y=b.</p>
         * 
         * <strong>example:</strong>
         * <p>x=a,y=b</p>
         */
        @NameInMap("TaskSetting")
        public String taskSetting;

        /**
         * <p>The ID of the template used.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("TemplateId")
        public Integer templateId;

        /**
         * <p>The name of the template used.</p>
         * 
         * <strong>example:</strong>
         * <p>SQL task table rows, 1,7, 30 days fluctuation test</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>The trend of the validation result.</p>
         * 
         * <strong>example:</strong>
         * <p>abs</p>
         */
        @NameInMap("Trend")
        public String trend;

        /**
         * <p>The threshold for a warning Alert. This value specifies the acceptable deviation from the Expected Value and can be customized.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("WarningThreshold")
        public String warningThreshold;

        /**
         * <p>The filter condition or custom SQL statement used for validation.</p>
         * 
         * <strong>example:</strong>
         * <p>id&gt;10</p>
         */
        @NameInMap("WhereCondition")
        public String whereCondition;

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

        public GetQualityRuleResponseBodyData setChecker(Integer checker) {
            this.checker = checker;
            return this;
        }
        public Integer getChecker() {
            return this.checker;
        }

        public GetQualityRuleResponseBodyData setCheckerName(String checkerName) {
            this.checkerName = checkerName;
            return this;
        }
        public String getCheckerName() {
            return this.checkerName;
        }

        public GetQualityRuleResponseBodyData setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetQualityRuleResponseBodyData setCriticalThreshold(String criticalThreshold) {
            this.criticalThreshold = criticalThreshold;
            return this;
        }
        public String getCriticalThreshold() {
            return this.criticalThreshold;
        }

        public GetQualityRuleResponseBodyData setEntityId(Long entityId) {
            this.entityId = entityId;
            return this;
        }
        public Long getEntityId() {
            return this.entityId;
        }

        public GetQualityRuleResponseBodyData setExpectValue(String expectValue) {
            this.expectValue = expectValue;
            return this;
        }
        public String getExpectValue() {
            return this.expectValue;
        }

        public GetQualityRuleResponseBodyData setFixCheck(Boolean fixCheck) {
            this.fixCheck = fixCheck;
            return this;
        }
        public Boolean getFixCheck() {
            return this.fixCheck;
        }

        public GetQualityRuleResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetQualityRuleResponseBodyData setMethodId(Integer methodId) {
            this.methodId = methodId;
            return this;
        }
        public Integer getMethodId() {
            return this.methodId;
        }

        public GetQualityRuleResponseBodyData setMethodName(String methodName) {
            this.methodName = methodName;
            return this;
        }
        public String getMethodName() {
            return this.methodName;
        }

        public GetQualityRuleResponseBodyData setOnDuty(String onDuty) {
            this.onDuty = onDuty;
            return this;
        }
        public String getOnDuty() {
            return this.onDuty;
        }

        public GetQualityRuleResponseBodyData setOnDutyAccountName(String onDutyAccountName) {
            this.onDutyAccountName = onDutyAccountName;
            return this;
        }
        public String getOnDutyAccountName() {
            return this.onDutyAccountName;
        }

        public GetQualityRuleResponseBodyData setOpenSwitch(Boolean openSwitch) {
            this.openSwitch = openSwitch;
            return this;
        }
        public Boolean getOpenSwitch() {
            return this.openSwitch;
        }

        public GetQualityRuleResponseBodyData setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetQualityRuleResponseBodyData setPredictType(Integer predictType) {
            this.predictType = predictType;
            return this;
        }
        public Integer getPredictType() {
            return this.predictType;
        }

        public GetQualityRuleResponseBodyData setProperty(String property) {
            this.property = property;
            return this;
        }
        public String getProperty() {
            return this.property;
        }

        public GetQualityRuleResponseBodyData setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public GetQualityRuleResponseBodyData setRuleType(Integer ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public Integer getRuleType() {
            return this.ruleType;
        }

        public GetQualityRuleResponseBodyData setTaskSetting(String taskSetting) {
            this.taskSetting = taskSetting;
            return this;
        }
        public String getTaskSetting() {
            return this.taskSetting;
        }

        public GetQualityRuleResponseBodyData setTemplateId(Integer templateId) {
            this.templateId = templateId;
            return this;
        }
        public Integer getTemplateId() {
            return this.templateId;
        }

        public GetQualityRuleResponseBodyData setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public GetQualityRuleResponseBodyData setTrend(String trend) {
            this.trend = trend;
            return this;
        }
        public String getTrend() {
            return this.trend;
        }

        public GetQualityRuleResponseBodyData setWarningThreshold(String warningThreshold) {
            this.warningThreshold = warningThreshold;
            return this;
        }
        public String getWarningThreshold() {
            return this.warningThreshold;
        }

        public GetQualityRuleResponseBodyData setWhereCondition(String whereCondition) {
            this.whereCondition = whereCondition;
            return this;
        }
        public String getWhereCondition() {
            return this.whereCondition;
        }

    }

}
