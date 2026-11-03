// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetDataQualityEvaluationTaskInstanceResponseBody extends TeaModel {
    /**
     * <p>The details of the data quality evaluation task instance.</p>
     */
    @NameInMap("DataQualityEvaluationTaskInstance")
    public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstance dataQualityEvaluationTaskInstance;

    /**
     * <p>The request ID. You can use this ID to locate logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>8abcb91f-d266-4073-b907-2ed67****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetDataQualityEvaluationTaskInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataQualityEvaluationTaskInstanceResponseBody self = new GetDataQualityEvaluationTaskInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataQualityEvaluationTaskInstanceResponseBody setDataQualityEvaluationTaskInstance(GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstance dataQualityEvaluationTaskInstance) {
        this.dataQualityEvaluationTaskInstance = dataQualityEvaluationTaskInstance;
        return this;
    }
    public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstance getDataQualityEvaluationTaskInstance() {
        return this.dataQualityEvaluationTaskInstance;
    }

    public GetDataQualityEvaluationTaskInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsDetails extends TeaModel {
        /**
         * <p>The final value used to compare with the threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>100.0</p>
         */
        @NameInMap("CheckedValue")
        public String checkedValue;

        /**
         * <p>The referenced sample value used as the baseline for calculating the CheckedValue.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("ReferencedValue")
        public String referencedValue;

        /**
         * <p>The status of the final comparison result.</p>
         * 
         * <strong>example:</strong>
         * <p>Passed</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsDetails build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsDetails self = new GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsDetails();
            return TeaModel.build(map, self);
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsDetails setCheckedValue(String checkedValue) {
            this.checkedValue = checkedValue;
            return this;
        }
        public String getCheckedValue() {
            return this.checkedValue;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsDetails setReferencedValue(String referencedValue) {
            this.referencedValue = referencedValue;
            return this;
        }
        public String getReferencedValue() {
            return this.referencedValue;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsDetails setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholdsCritical extends TeaModel {
        /**
         * <p>The check expression.</p>
         * 
         * <strong>example:</strong>
         * <p>$checkValue &gt; 0.01</p>
         */
        @NameInMap("Expression")
        public String expression;

        /**
         * <p>The comparison operator. Valid values:</p>
         * <ul>
         * <li>\&gt;</li>
         * <li>\&gt;=</li>
         * <li>&lt;</li>
         * <li>&lt;=</li>
         * <li>!=</li>
         * <li>=</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <blockquote>
         * </blockquote>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The threshold value.</p>
         * 
         * <strong>example:</strong>
         * <p>100.0</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholdsCritical build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholdsCritical self = new GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholdsCritical();
            return TeaModel.build(map, self);
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholdsCritical setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholdsCritical setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholdsCritical setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholdsExpected extends TeaModel {
        /**
         * <p>The threshold expression.</p>
         * 
         * <strong>example:</strong>
         * <p>$checkValue &gt; 0.01</p>
         */
        @NameInMap("Expression")
        public String expression;

        /**
         * <p>The comparison operator. Valid values:</p>
         * <ul>
         * <li>\&gt;</li>
         * <li>\&gt;=</li>
         * <li>&lt;</li>
         * <li>&lt;=</li>
         * <li>!=</li>
         * <li>=</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <blockquote>
         * </blockquote>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The threshold value.</p>
         * 
         * <strong>example:</strong>
         * <p>100.0</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholdsExpected build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholdsExpected self = new GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholdsExpected();
            return TeaModel.build(map, self);
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholdsExpected setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholdsExpected setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholdsExpected setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholdsWarned extends TeaModel {
        /**
         * <p>The threshold expression.</p>
         * 
         * <strong>example:</strong>
         * <p>$checkValue &gt; 0.01</p>
         */
        @NameInMap("Expression")
        public String expression;

        /**
         * <p>The comparison operator. Valid values:</p>
         * <ul>
         * <li>\&gt;</li>
         * <li>\&gt;=</li>
         * <li>&lt;</li>
         * <li>&lt;=</li>
         * <li>!=</li>
         * <li>=</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <blockquote>
         * </blockquote>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The threshold value.</p>
         * 
         * <strong>example:</strong>
         * <p>100.0</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholdsWarned build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholdsWarned self = new GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholdsWarned();
            return TeaModel.build(map, self);
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholdsWarned setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholdsWarned setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholdsWarned setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholds extends TeaModel {
        /**
         * <p>The threshold settings for critical alerts.</p>
         */
        @NameInMap("Critical")
        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholdsCritical critical;

        /**
         * <p>The expected threshold settings.</p>
         */
        @NameInMap("Expected")
        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholdsExpected expected;

        /**
         * <p>The threshold settings for warning alerts.</p>
         */
        @NameInMap("Warned")
        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholdsWarned warned;

        public static GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholds build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholds self = new GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholds();
            return TeaModel.build(map, self);
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholds setCritical(GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholdsCritical critical) {
            this.critical = critical;
            return this;
        }
        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholdsCritical getCritical() {
            return this.critical;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholds setExpected(GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholdsExpected expected) {
            this.expected = expected;
            return this;
        }
        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholdsExpected getExpected() {
            return this.expected;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholds setWarned(GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholdsWarned warned) {
            this.warned = warned;
            return this;
        }
        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholdsWarned getWarned() {
            return this.warned;
        }

    }

    public static class GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfig extends TeaModel {
        /**
         * <p>The expression that represents the query method for reference samples. Some types of thresholds require querying reference samples and aggregating their values to obtain the threshold for comparison.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;bizdate&quot;: [ &quot;-1&quot;, &quot;-7&quot;, &quot;-1m&quot; ] }</p>
         */
        @NameInMap("ReferencedSamplesFilter")
        public String referencedSamplesFilter;

        /**
         * <p>The threshold settings.</p>
         */
        @NameInMap("Thresholds")
        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholds thresholds;

        /**
         * <p>The threshold calculation method. Valid values:</p>
         * <ul>
         * <li>Fixed</li>
         * <li>Fluctation</li>
         * <li>FluctationDiscreate</li>
         * <li>Auto</li>
         * <li>Average</li>
         * <li>Variance</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Fixed</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfig build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfig self = new GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfig();
            return TeaModel.build(map, self);
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfig setReferencedSamplesFilter(String referencedSamplesFilter) {
            this.referencedSamplesFilter = referencedSamplesFilter;
            return this;
        }
        public String getReferencedSamplesFilter() {
            return this.referencedSamplesFilter;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfig setThresholds(GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholds thresholds) {
            this.thresholds = thresholds;
            return this;
        }
        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholds getThresholds() {
            return this.thresholds;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleErrorHandlers extends TeaModel {
        /**
         * <p>The SQL statement used to filter problematic data for custom SQL rules.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT * FROM tb_api_log WHERE id IS NULL</p>
         */
        @NameInMap("ErrorDataFilter")
        public String errorDataFilter;

        /**
         * <p>The handler type.</p>
         * 
         * <strong>example:</strong>
         * <p>SaveErrorData</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleErrorHandlers build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleErrorHandlers self = new GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleErrorHandlers();
            return TeaModel.build(map, self);
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleErrorHandlers setErrorDataFilter(String errorDataFilter) {
            this.errorDataFilter = errorDataFilter;
            return this;
        }
        public String getErrorDataFilter() {
            return this.errorDataFilter;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleErrorHandlers setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleSamplingConfig extends TeaModel {
        /**
         * <p>The name of the sampling metric. Valid values:</p>
         * <ul>
         * <li>Count: The number of rows in the table.</li>
         * <li>Min: The minimum value of the column.</li>
         * <li>Max: The maximum value of the column.</li>
         * <li>Avg: The average value of the column.</li>
         * <li>DistinctCount: The number of unique values in the column.</li>
         * <li>DistinctPercent: The ratio of the number of unique values in the column to the number of data rows.</li>
         * <li>DuplicatedCount: The number of duplicate values in the column.</li>
         * <li>DuplicatedPercent: The ratio of the number of duplicate values in the column to the number of data rows.</li>
         * <li>TableSize: The size of the table.</li>
         * <li>NullValueCount: The number of rows where the column is null.</li>
         * <li>NullValuePercent: The ratio of rows where the column is null.</li>
         * <li>GroupCount: The number of data rows corresponding to each value after aggregation by column value.</li>
         * <li>CountNotIn: The number of rows that do not match the enumerated values.</li>
         * <li>CountDistinctNotIn: The number of unique values that do not match the enumerated values.</li>
         * <li>UserDefinedSql: Sample collection by using custom SQL statements.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Min</p>
         */
        @NameInMap("Metric")
        public String metric;

        /**
         * <p>The parameters required for sample collection.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;Columns&quot;: [ &quot;id&quot;, &quot;name&quot; ] }</p>
         */
        @NameInMap("MetricParameters")
        public String metricParameters;

        /**
         * <p>The condition for secondary filtering of uninterested data during sampling. It can be up to 16,777,215 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>id IS NULL</p>
         */
        @NameInMap("SamplingFilter")
        public String samplingFilter;

        /**
         * <p>The runtime parameter setting statements inserted before the sampling statements are executed. It can be up to 1,000 characters in length. Currently, only MaxCompute is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>SET odps.sql.udf.timeout=600s;</p>
         */
        @NameInMap("SettingConfig")
        public String settingConfig;

        public static GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleSamplingConfig build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleSamplingConfig self = new GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleSamplingConfig();
            return TeaModel.build(map, self);
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleSamplingConfig setMetric(String metric) {
            this.metric = metric;
            return this;
        }
        public String getMetric() {
            return this.metric;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleSamplingConfig setMetricParameters(String metricParameters) {
            this.metricParameters = metricParameters;
            return this;
        }
        public String getMetricParameters() {
            return this.metricParameters;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleSamplingConfig setSamplingFilter(String samplingFilter) {
            this.samplingFilter = samplingFilter;
            return this;
        }
        public String getSamplingFilter() {
            return this.samplingFilter;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleSamplingConfig setSettingConfig(String settingConfig) {
            this.settingConfig = settingConfig;
            return this;
        }
        public String getSettingConfig() {
            return this.settingConfig;
        }

    }

    public static class GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleTarget extends TeaModel {
        /**
         * <p>The database type to which the table dataset belongs. Valid values:</p>
         * <ul>
         * <li>maxcompute</li>
         * <li>emr</li>
         * <li>cdh</li>
         * <li>hologres</li>
         * <li>analyticdb_for_postgresql</li>
         * <li>analyticdb_for_mysql</li>
         * <li>starrocks</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>maxcompute</p>
         */
        @NameInMap("DatabaseType")
        public String databaseType;

        /**
         * <p>The unique ID of the table in DataWorks Data Map.</p>
         * 
         * <strong>example:</strong>
         * <p>odps.unit_test.tb_unit_test</p>
         */
        @NameInMap("TableGuid")
        public String tableGuid;

        /**
         * <p>The monitored object type. Valid values:</p>
         * <ul>
         * <li>Table</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Table</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleTarget build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleTarget self = new GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleTarget();
            return TeaModel.build(map, self);
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleTarget setDatabaseType(String databaseType) {
            this.databaseType = databaseType;
            return this;
        }
        public String getDatabaseType() {
            return this.databaseType;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleTarget setTableGuid(String tableGuid) {
            this.tableGuid = tableGuid;
            return this;
        }
        public String getTableGuid() {
            return this.tableGuid;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleTarget setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRule extends TeaModel {
        /**
         * <p>The sample check settings.</p>
         */
        @NameInMap("CheckingConfig")
        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfig checkingConfig;

        /**
         * <p>The description of the rule. It can be up to 500 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>this is a odps _sql task</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Specifies whether the rule is enabled.</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The error handlers for quality rule check issues.</p>
         */
        @NameInMap("ErrorHandlers")
        public java.util.List<GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleErrorHandlers> errorHandlers;

        /**
         * <p>The globally unique ID of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>100001</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the rule. The name can contain digits, letters, Chinese characters, and half-width or full-width punctuation marks. It can be up to 255 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>Table cannot be empty</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the DataWorks workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The settings required for sample collection.</p>
         */
        @NameInMap("SamplingConfig")
        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleSamplingConfig samplingConfig;

        /**
         * <p>The severity level of the rule for the business, which corresponds to the strong and weak rules on the page.</p>
         * 
         * <strong>example:</strong>
         * <p>High</p>
         */
        @NameInMap("Severity")
        public String severity;

        /**
         * <p>The object monitored by the rule.</p>
         */
        @NameInMap("Target")
        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleTarget target;

        /**
         * <p>The rule template referenced when the rule is created.</p>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM:user_defined_sql</p>
         */
        @NameInMap("TemplateCode")
        public String templateCode;

        public static GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRule build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRule self = new GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRule();
            return TeaModel.build(map, self);
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRule setCheckingConfig(GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfig checkingConfig) {
            this.checkingConfig = checkingConfig;
            return this;
        }
        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfig getCheckingConfig() {
            return this.checkingConfig;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRule setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRule setErrorHandlers(java.util.List<GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleErrorHandlers> errorHandlers) {
            this.errorHandlers = errorHandlers;
            return this;
        }
        public java.util.List<GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleErrorHandlers> getErrorHandlers() {
            return this.errorHandlers;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRule setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRule setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRule setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRule setSamplingConfig(GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleSamplingConfig samplingConfig) {
            this.samplingConfig = samplingConfig;
            return this;
        }
        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleSamplingConfig getSamplingConfig() {
            return this.samplingConfig;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRule setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRule setTarget(GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleTarget target) {
            this.target = target;
            return this;
        }
        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleTarget getTarget() {
            return this.target;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRule setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

    }

    public static class GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResults extends TeaModel {
        /**
         * <p>The generation time of the evaluation result.</p>
         * <p>The value is a 13-digit number, such as <code>1708284916414</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1708284916414</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The details of this evaluation.</p>
         */
        @NameInMap("Details")
        public java.util.List<GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsDetails> details;

        /**
         * <p>The ID of the evaluation result.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The snapshot of the rule configuration at the start of the evaluation.</p>
         */
        @NameInMap("Rule")
        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRule rule;

        /**
         * <p>The sample value used for this evaluation.</p>
         * 
         * <strong>example:</strong>
         * <p>[   {     &quot;gender&quot;: &quot;male&quot;,     &quot;_count&quot;: 100   }, {     &quot;gender&quot;: &quot;female&quot;,     &quot;_count&quot;: 100   } ]</p>
         */
        @NameInMap("Sample")
        public String sample;

        /**
         * <p>The status of the evaluation result.</p>
         * 
         * <strong>example:</strong>
         * <p>Passed</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The instance ID of the data quality check task.</p>
         * 
         * <strong>example:</strong>
         * <p>20001</p>
         */
        @NameInMap("TaskInstanceId")
        public Long taskInstanceId;

        public static GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResults build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResults self = new GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResults();
            return TeaModel.build(map, self);
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResults setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResults setDetails(java.util.List<GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsDetails> details) {
            this.details = details;
            return this;
        }
        public java.util.List<GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsDetails> getDetails() {
            return this.details;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResults setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResults setRule(GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRule rule) {
            this.rule = rule;
            return this;
        }
        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRule getRule() {
            return this.rule;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResults setSample(String sample) {
            this.sample = sample;
            return this;
        }
        public String getSample() {
            return this.sample;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResults setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResults setTaskInstanceId(Long taskInstanceId) {
            this.taskInstanceId = taskInstanceId;
            return this;
        }
        public Long getTaskInstanceId() {
            return this.taskInstanceId;
        }

    }

    public static class GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskHooks extends TeaModel {
        /**
         * <p>The condition for triggering the hook. When this condition is met, the hook action is triggered. Currently, only two types of conditional expressions are supported:</p>
         * <ul>
         * <li>Specify only one set of rule severity and rule check status, such as <code>${severity} == &quot;High&quot; AND ${status} == &quot;Critical&quot;</code>. This means that among the rules that you execute, if a rule with the severity of High has a check result of Critical, the condition is met.</li>
         * <li>Specify multiple sets of rule severity and rule check status, such as <code>(${severity} == &quot;High&quot; AND ${status} == &quot;Critical&quot;) OR (${severity} == &quot;Normal&quot; AND ${status} == &quot;Critical&quot;) OR (${severity} == &quot;Normal&quot; AND ${status} == &quot;Error&quot;)</code>. This means that among the rules that you execute, if a rule with the severity of High has a check result of Critical, or a rule with the severity of Normal has a check result of Critical, or a rule with the severity of Normal has a check result of Error, the condition is met. The valid values for severity in the conditional expression are the same as those in DataQualityRule, and the valid values for status are the same as those in DataQualityResult.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>(${severity} == &quot;High&quot; AND ${status} == &quot;Critical&quot;) OR (${severity} == &quot;Normal&quot; AND ${status} == &quot;Critical&quot;) OR (${severity} == &quot;Normal&quot; AND ${status} == &quot;Error&quot;)</p>
         */
        @NameInMap("Condition")
        public String condition;

        /**
         * <p>The hook type. Currently, only one type is supported:</p>
         * <ul>
         * <li>BlockTaskInstance: Blocks the scheduling task from continuing to run. If the data quality evaluation task is triggered by a scheduling task, the system determines whether to block the scheduling task based on Hook.Condition after the data quality evaluation task is completed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BlockTaskInstance</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskHooks build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskHooks self = new GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskHooks();
            return TeaModel.build(map, self);
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskHooks setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskHooks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationChannels extends TeaModel {
        /**
         * <p>The notification channels.</p>
         */
        @NameInMap("Channels")
        public java.util.List<String> channels;

        public static GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationChannels build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationChannels self = new GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationChannels();
            return TeaModel.build(map, self);
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationChannels setChannels(java.util.List<String> channels) {
            this.channels = channels;
            return this;
        }
        public java.util.List<String> getChannels() {
            return this.channels;
        }

    }

    public static class GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationReceivers extends TeaModel {
        /**
         * <p>The additional parameter settings in JSON format when an alert is sent. Supported keys:</p>
         * <ul>
         * <li>atAll: Specifies whether to @all in the DingTalk group when a DingTalk alert is sent. This parameter takes effect only when ReceiverType is set to DingdingUrl.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;atAll&quot;: true }</p>
         */
        @NameInMap("Extension")
        public String extension;

        /**
         * <p>The type of the alert recipient.</p>
         * 
         * <strong>example:</strong>
         * <p>DingdingUrl</p>
         */
        @NameInMap("ReceiverType")
        public String receiverType;

        /**
         * <p>The alert recipients.</p>
         */
        @NameInMap("ReceiverValues")
        public java.util.List<String> receiverValues;

        public static GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationReceivers build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationReceivers self = new GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationReceivers();
            return TeaModel.build(map, self);
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationReceivers setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationReceivers setReceiverType(String receiverType) {
            this.receiverType = receiverType;
            return this;
        }
        public String getReceiverType() {
            return this.receiverType;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationReceivers setReceiverValues(java.util.List<String> receiverValues) {
            this.receiverValues = receiverValues;
            return this;
        }
        public java.util.List<String> getReceiverValues() {
            return this.receiverValues;
        }

    }

    public static class GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotifications extends TeaModel {
        /**
         * <p>The notification channels.</p>
         */
        @NameInMap("NotificationChannels")
        public java.util.List<GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationChannels> notificationChannels;

        /**
         * <p>The values of the notification recipients.</p>
         */
        @NameInMap("NotificationReceivers")
        public java.util.List<GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationReceivers> notificationReceivers;

        public static GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotifications build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotifications self = new GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotifications();
            return TeaModel.build(map, self);
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotifications setNotificationChannels(java.util.List<GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationChannels> notificationChannels) {
            this.notificationChannels = notificationChannels;
            return this;
        }
        public java.util.List<GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationChannels> getNotificationChannels() {
            return this.notificationChannels;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotifications setNotificationReceivers(java.util.List<GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationReceivers> notificationReceivers) {
            this.notificationReceivers = notificationReceivers;
            return this;
        }
        public java.util.List<GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationReceivers> getNotificationReceivers() {
            return this.notificationReceivers;
        }

    }

    public static class GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotifications extends TeaModel {
        /**
         * <p>The condition for triggering a notification. When this condition is met, a message notification is triggered. Currently, only two types of conditional expressions are supported:</p>
         * <ul>
         * <li>Specify only one set of rule severity and rule check status, such as <code>${severity} == &quot;High&quot; AND ${status} == &quot;Critical&quot;</code>. This means that among the rules that you execute, if a rule with the severity of High has a check result of Critical, the condition is met. </li>
         * <li>Specify multiple sets of rule severity and rule check status, such as <code>(${severity} == &quot;High&quot; AND ${status} == &quot;Critical&quot;) OR (${severity} == &quot;Normal&quot; AND ${status} == &quot;Critical&quot;) OR (${severity} == &quot;Normal&quot; AND ${status} == &quot;Error&quot;)</code>. This means that among the rules that you execute, if a rule with the severity of High has a check result of Critical, or a rule with the severity of Normal has a check result of Critical, or a rule with the severity of Normal has a check result of Error, the condition is met. The valid values for severity in the conditional expression are the same as those in DataQualityRule, and the valid values for status are the same as those in DataQualityResult.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>${severity} == &quot;High&quot; AND ${status} == &quot;Critical&quot;</p>
         */
        @NameInMap("Condition")
        public String condition;

        /**
         * <p>The notification methods.</p>
         */
        @NameInMap("Notifications")
        public java.util.List<GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotifications> notifications;

        public static GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotifications build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotifications self = new GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotifications();
            return TeaModel.build(map, self);
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotifications setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotifications setNotifications(java.util.List<GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotifications> notifications) {
            this.notifications = notifications;
            return this;
        }
        public java.util.List<GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotifications> getNotifications() {
            return this.notifications;
        }

    }

    public static class GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskTarget extends TeaModel {
        /**
         * <p>The database type to which the table belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>maxcompute</p>
         */
        @NameInMap("DatabaseType")
        public String databaseType;

        /**
         * <p>The partition range to be monitored.</p>
         * 
         * <strong>example:</strong>
         * <p>pt=$[yyyymmdd-1]</p>
         */
        @NameInMap("PartitionSpec")
        public String partitionSpec;

        /**
         * <p>The unique ID of the table in DataWorks Data Map.</p>
         * 
         * <strong>example:</strong>
         * <p>odps.api_trace.ods_d_api_log</p>
         */
        @NameInMap("TableGuid")
        public String tableGuid;

        /**
         * <p>The monitored object type. Valid values:</p>
         * <ul>
         * <li>Table: Table.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Table</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskTarget build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskTarget self = new GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskTarget();
            return TeaModel.build(map, self);
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskTarget setDatabaseType(String databaseType) {
            this.databaseType = databaseType;
            return this;
        }
        public String getDatabaseType() {
            return this.databaseType;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskTarget setPartitionSpec(String partitionSpec) {
            this.partitionSpec = partitionSpec;
            return this;
        }
        public String getPartitionSpec() {
            return this.partitionSpec;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskTarget setTableGuid(String tableGuid) {
            this.tableGuid = tableGuid;
            return this;
        }
        public String getTableGuid() {
            return this.tableGuid;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskTarget setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskTrigger extends TeaModel {
        /**
         * <p>The list of scheduling task IDs. This parameter takes effect only when Type is set to ByScheduledTaskInstance.</p>
         */
        @NameInMap("TaskIds")
        public java.util.List<Long> taskIds;

        /**
         * <p>The trigger type of the data quality evaluation task. Valid values:</p>
         * <ul>
         * <li>ByManual: Manual trigger. This is the default value.</li>
         * <li>ByScheduledTaskInstance: Triggered by an associated scheduling task.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ByScheduledTaskInstance</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskTrigger build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskTrigger self = new GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskTrigger();
            return TeaModel.build(map, self);
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskTrigger setTaskIds(java.util.List<Long> taskIds) {
            this.taskIds = taskIds;
            return this;
        }
        public java.util.List<Long> getTaskIds() {
            return this.taskIds;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskTrigger setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTask extends TeaModel {
        /**
         * <p>The description of the data quality evaluation task.</p>
         * 
         * <strong>example:</strong>
         * <p>OpenAPI quality monitoring test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The hook settings.</p>
         */
        @NameInMap("Hooks")
        public java.util.List<GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskHooks> hooks;

        /**
         * <p>The ID of the data quality evaluation task.</p>
         * 
         * <strong>example:</strong>
         * <p>28544990</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the data quality evaluation task.</p>
         * 
         * <strong>example:</strong>
         * <p>Data quality OpenAPI monitoring test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The notification settings.</p>
         */
        @NameInMap("Notifications")
        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotifications notifications;

        /**
         * <p>The ID of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>20629</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The extension configuration, a JSON-formatted character string, takes effect only for EMR data quality monitoring.</p>
         * <ul>
         * <li>queue: The YARN queue used when you execute EMR data validation. The default value is the queue configured for the current project.</li>
         * <li>sqlEngine: The SQL engine used when you execute EMR data validation. Valid values:<ul>
         * <li>HIVE_SQL</li>
         * <li>SPARK_SQL</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;queue&quot;: &quot;default&quot; }</p>
         */
        @NameInMap("RuntimeConf")
        public String runtimeConf;

        /**
         * <p>The monitored object of the data quality evaluation task. For more information, see the DataQualityTarget example and DataQualityTarget.</p>
         */
        @NameInMap("Target")
        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskTarget target;

        /**
         * <p>The trigger configurations of the data quality evaluation task.</p>
         */
        @NameInMap("Trigger")
        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskTrigger trigger;

        public static GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTask build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTask self = new GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTask();
            return TeaModel.build(map, self);
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTask setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTask setHooks(java.util.List<GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskHooks> hooks) {
            this.hooks = hooks;
            return this;
        }
        public java.util.List<GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskHooks> getHooks() {
            return this.hooks;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTask setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTask setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTask setNotifications(GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotifications notifications) {
            this.notifications = notifications;
            return this;
        }
        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotifications getNotifications() {
            return this.notifications;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTask setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTask setRuntimeConf(String runtimeConf) {
            this.runtimeConf = runtimeConf;
            return this;
        }
        public String getRuntimeConf() {
            return this.runtimeConf;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTask setTarget(GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskTarget target) {
            this.target = target;
            return this;
        }
        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskTarget getTarget() {
            return this.target;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTask setTrigger(GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskTrigger trigger) {
            this.trigger = trigger;
            return this;
        }
        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskTrigger getTrigger() {
            return this.trigger;
        }

    }

    public static class GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstance extends TeaModel {
        /**
         * <p>The creation time.</p>
         * <p>The value is a 13-digit number, such as <code>1716344665000</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1716344665000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The end time of the instance run.</p>
         * <p>The value is a 13-digit number, such as <code>1716344665000</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1716344665000</p>
         */
        @NameInMap("FinishTime")
        public Long finishTime;

        /**
         * <p>The instance ID of the data quality monitoring.</p>
         * 
         * <strong>example:</strong>
         * <p>7234231689</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The execution parameters of the data quality evaluation task in JSON format. Available keys:</p>
         * <ul>
         * <li>triggerTime: The millisecond timestamp of the trigger time. This is the base time for the <code>$[yyyymmdd]</code> expression in the data range of the data quality evaluation task. This parameter is required.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;triggerTime&quot;: 1733284062000 }</p>
         */
        @NameInMap("Parameters")
        public String parameters;

        /**
         * <p>The ID of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>98330</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The list of data quality evaluation results.</p>
         */
        @NameInMap("Results")
        public java.util.List<GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResults> results;

        /**
         * <p>The status of the data quality monitoring instance. Valid values:</p>
         * <ul>
         * <li>Running: The check is in progress.</li>
         * <li>Error: An error occurred while checking a rule.</li>
         * <li>Passed: All rule checks passed.</li>
         * <li>Warned: A rule triggered the warning alert threshold.</li>
         * <li>Critical: A rule triggered the critical alert threshold.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Passed</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The data quality evaluation task.</p>
         */
        @NameInMap("Task")
        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTask task;

        /**
         * <p>The context information when the instance is triggered, in JSON format. Possible keys:</p>
         * <ul>
         * <li>TriggerClient: The trigger source of the data quality evaluation task instance, such as CWF2 (scheduling system). More sources may be added in the future.</li>
         * <li>TriggerClientId: The specific business resource in the source system. For example, if TriggerClient is CWF2, this parameter records the scheduling task ID.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;triggerClient&quot;: &quot;CWF2&quot;, &quot;triggerClientId&quot;: 70001238945 }</p>
         */
        @NameInMap("TriggerContext")
        public String triggerContext;

        public static GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstance build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstance self = new GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstance();
            return TeaModel.build(map, self);
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstance setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstance setFinishTime(Long finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Long getFinishTime() {
            return this.finishTime;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstance setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstance setParameters(String parameters) {
            this.parameters = parameters;
            return this;
        }
        public String getParameters() {
            return this.parameters;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstance setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstance setResults(java.util.List<GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResults> getResults() {
            return this.results;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstance setTask(GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTask task) {
            this.task = task;
            return this;
        }
        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTask getTask() {
            return this.task;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstance setTriggerContext(String triggerContext) {
            this.triggerContext = triggerContext;
            return this;
        }
        public String getTriggerContext() {
            return this.triggerContext;
        }

    }

}
