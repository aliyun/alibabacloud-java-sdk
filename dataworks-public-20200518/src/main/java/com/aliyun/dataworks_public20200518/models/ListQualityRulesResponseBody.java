// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListQualityRulesResponseBody extends TeaModel {
    /**
     * <p>The list of monitoring rules.</p>
     */
    @NameInMap("Data")
    public ListQualityRulesResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>Invalid.Tenant.ConnectionNotExists</p>
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
     * <p>The request ID. You can troubleshoot errors based on the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>38cbdef0-f6cf-49****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The strength of the monitoring rule. The strength of a monitoring rule indicates the importance of the rule. Valid values:</p>
         * <ul>
         * <li>1: The monitoring rule is a strong rule.</li>
         * <li>0: The monitoring rule is a weak rule. You can specify the strength of a monitoring rule based on your business requirements. If a monitoring rule is a strong rule and the critical threshold is exceeded, a critical alert is reported and tasks that are associated with the rule are blocked from running.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BlockType")
        public Integer blockType;

        /**
         * <p>The checker ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("CheckerId")
        public Integer checkerId;

        /**
         * <p>The description of the system defense rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Verify table rules</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The threshold for a critical alert. The threshold indicates the deviation of the monitoring result from the expected value. You can specify a custom value for the threshold based on your business requirements. If a monitoring rule is a strong rule and the critical threshold is exceeded, a critical alert is reported and tasks that are associated with the rule are blocked from running.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("CriticalThreshold")
        public String criticalThreshold;

        /**
         * <p>The ID of the partition filter expression.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("EntityId")
        public Long entityId;

        /**
         * <p>The expected value.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("ExpectValue")
        public String expectValue;

        /**
         * <p>Indicates whether the monitoring is performed based on a fixed value.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FixCheck")
        public Boolean fixCheck;

        /**
         * <p>The historical threshold for a critical alert.</p>
         * 
         * <strong>example:</strong>
         * <p>history max:80%,history min:50%</p>
         */
        @NameInMap("HistoryCriticalThreshold")
        public String historyCriticalThreshold;

        /**
         * <p>The historical threshold for a warning alert.</p>
         * 
         * <strong>example:</strong>
         * <p>history max:40%,history min:10%</p>
         */
        @NameInMap("HistoryWarningThreshold")
        public String historyWarningThreshold;

        /**
         * <p>The monitoring rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The partition filter expression.</p>
         * 
         * <strong>example:</strong>
         * <p>dt=$[yyyymmdd]</p>
         */
        @NameInMap("MatchExpression")
        public String matchExpression;

        /**
         * <p>The ID of the task that is associated with the partition filter expression.</p>
         * 
         * <strong>example:</strong>
         * <p>21</p>
         */
        @NameInMap("MethodId")
        public Integer methodId;

        /**
         * <p>The method that is used to collect sample data, such as avg, count, sum, min, max, count_distinct, user_defined, table_count, table_size, table_dt_load_count, table_dt_refuseload_count, null_value, null_value/table_count, (table_count-count_distinct)/table_count, or table_count-count_distinct.</p>
         * 
         * <strong>example:</strong>
         * <p>count/table_count</p>
         */
        @NameInMap("MethodName")
        public String methodName;

        /**
         * <p>The name of the Alibaba Cloud account that is used to configure the monitoring rule.</p>
         * 
         * <strong>example:</strong>
         * <p>1912****</p>
         */
        @NameInMap("OnDuty")
        public String onDuty;

        /**
         * <p>The name of the Alibaba Cloud account that is used to configure the monitoring rule.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("OnDutyAccountName")
        public String onDutyAccountName;

        /**
         * <p>The name of the compute engine or data source.</p>
         * 
         * <strong>example:</strong>
         * <p>autotest</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <p>The name of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>id</p>
         */
        @NameInMap("Property")
        public String property;

        /**
         * <p>The field that is used to associate with monitoring rules at the frontend. This parameter can be ignored.</p>
         * 
         * <strong>example:</strong>
         * <p>table_count</p>
         */
        @NameInMap("PropertyKey")
        public String propertyKey;

        /**
         * <p>The ID of the task that is associated with the partition filter expression.</p>
         * 
         * <strong>example:</strong>
         * <p>132323</p>
         */
        @NameInMap("RuleCheckerRelationId")
        public Long ruleCheckerRelationId;

        /**
         * <p>The name of the monitoring rule.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The type of the monitoring rule. Valid values:</p>
         * <ul>
         * <li>0: The monitoring rule is created by the system.</li>
         * <li>1: The monitoring rule is created by a user.</li>
         * <li>2: The monitoring rule is a workspace-level rule.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RuleType")
        public Integer ruleType;

        /**
         * <p>The name of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>dual</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <p>The ID of the monitoring template.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("TemplateId")
        public Integer templateId;

        /**
         * <p>The name of the monitoring template.</p>
         * 
         * <strong>example:</strong>
         * <p>Number of SQL task table rows, 1, 7, and 30 days wave detection</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>The trend of the monitoring result.</p>
         * 
         * <strong>example:</strong>
         * <p>abs</p>
         */
        @NameInMap("Trend")
        public String trend;

        /**
         * <p>The threshold for a warning alert. The threshold specifies the deviation of the monitoring result from the expected value. You can specify a custom value for the threshold based on your business requirements.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
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

        public ListQualityRulesResponseBodyDataRules setEntityId(Long entityId) {
            this.entityId = entityId;
            return this;
        }
        public Long getEntityId() {
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

        public ListQualityRulesResponseBodyDataRules setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
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

        public ListQualityRulesResponseBodyDataRules setRuleCheckerRelationId(Long ruleCheckerRelationId) {
            this.ruleCheckerRelationId = ruleCheckerRelationId;
            return this;
        }
        public Long getRuleCheckerRelationId() {
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
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The details of the monitoring rule.</p>
         */
        @NameInMap("Rules")
        public java.util.List<ListQualityRulesResponseBodyDataRules> rules;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>400</p>
         */
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
