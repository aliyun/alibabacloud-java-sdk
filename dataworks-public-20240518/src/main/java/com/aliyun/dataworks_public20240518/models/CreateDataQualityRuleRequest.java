// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDataQualityRuleRequest extends TeaModel {
    /**
     * <p>The sample check settings.</p>
     */
    @NameInMap("CheckingConfig")
    public CreateDataQualityRuleRequestCheckingConfig checkingConfig;

    /**
     * <p>The description of the rule. The maximum length is 500 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>this is a odps _sql task</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to enable the data quality rule.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>The list of issue handlers for the data quality rule check.</p>
     */
    @NameInMap("ErrorHandlers")
    public java.util.List<CreateDataQualityRuleRequestErrorHandlers> errorHandlers;

    /**
     * <p>The name of the rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>The table cannot be empty.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the DataWorks workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10726</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The settings required for sample collection.</p>
     */
    @NameInMap("SamplingConfig")
    public CreateDataQualityRuleRequestSamplingConfig samplingConfig;

    /**
     * <p>The severity of the rule for the business (corresponding to the strong/weak rule on the page). Valid values:</p>
     * <ul>
     * <li>Normal</li>
     * <li>High</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("Severity")
    public String severity;

    /**
     * <p>The object monitored by the rule.</p>
     */
    @NameInMap("Target")
    public CreateDataQualityRuleRequestTarget target;

    /**
     * <p>The unique identifier of the rule template that the rule references.</p>
     * 
     * <strong>example:</strong>
     * <p>SYSTEM:table:table_count:fixed</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

    public static CreateDataQualityRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataQualityRuleRequest self = new CreateDataQualityRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataQualityRuleRequest setCheckingConfig(CreateDataQualityRuleRequestCheckingConfig checkingConfig) {
        this.checkingConfig = checkingConfig;
        return this;
    }
    public CreateDataQualityRuleRequestCheckingConfig getCheckingConfig() {
        return this.checkingConfig;
    }

    public CreateDataQualityRuleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDataQualityRuleRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public CreateDataQualityRuleRequest setErrorHandlers(java.util.List<CreateDataQualityRuleRequestErrorHandlers> errorHandlers) {
        this.errorHandlers = errorHandlers;
        return this;
    }
    public java.util.List<CreateDataQualityRuleRequestErrorHandlers> getErrorHandlers() {
        return this.errorHandlers;
    }

    public CreateDataQualityRuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDataQualityRuleRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateDataQualityRuleRequest setSamplingConfig(CreateDataQualityRuleRequestSamplingConfig samplingConfig) {
        this.samplingConfig = samplingConfig;
        return this;
    }
    public CreateDataQualityRuleRequestSamplingConfig getSamplingConfig() {
        return this.samplingConfig;
    }

    public CreateDataQualityRuleRequest setSeverity(String severity) {
        this.severity = severity;
        return this;
    }
    public String getSeverity() {
        return this.severity;
    }

    public CreateDataQualityRuleRequest setTarget(CreateDataQualityRuleRequestTarget target) {
        this.target = target;
        return this;
    }
    public CreateDataQualityRuleRequestTarget getTarget() {
        return this.target;
    }

    public CreateDataQualityRuleRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public static class CreateDataQualityRuleRequestCheckingConfigThresholdsCritical extends TeaModel {
        /**
         * <p>The threshold expression.</p>
         * <p>For a fluctuation-type rule, you must use an expression to represent the fluctuation threshold. Examples:</p>
         * <ul>
         * <li>Fluctuation rises above 0.01: $checkValue &gt; 0.01 </li>
         * <li>Fluctuation drops below -0.01: $checkValue &lt; -0.01 </li>
         * <li>Absolute value of the fluctuation: abs($checkValue) &gt; 0.01</li>
         * </ul>
         * <p>For a fixed-value type rule, you can also use an expression to configure the threshold. If both are configured at the same time, the expression takes precedence over Operator and Value.</p>
         * 
         * <strong>example:</strong>
         * <p>$checkValue &gt; 0.05</p>
         */
        @NameInMap("Expression")
        public String expression;

        /**
         * <p>The comparison operator:</p>
         * <ul>
         * <li>\&gt;</li>
         * <li>\&gt;=</li>
         * <li>\&lt;</li>
         * <li>\&lt;=</li>
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

        public static CreateDataQualityRuleRequestCheckingConfigThresholdsCritical build(java.util.Map<String, ?> map) throws Exception {
            CreateDataQualityRuleRequestCheckingConfigThresholdsCritical self = new CreateDataQualityRuleRequestCheckingConfigThresholdsCritical();
            return TeaModel.build(map, self);
        }

        public CreateDataQualityRuleRequestCheckingConfigThresholdsCritical setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public CreateDataQualityRuleRequestCheckingConfigThresholdsCritical setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public CreateDataQualityRuleRequestCheckingConfigThresholdsCritical setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateDataQualityRuleRequestCheckingConfigThresholdsExpected extends TeaModel {
        /**
         * <p>The threshold expression.</p>
         * <p>For a fluctuation-type rule, you must use an expression to represent the fluctuation threshold. Examples:</p>
         * <ul>
         * <li>Fluctuation rises above 0.01: $checkValue &gt; 0.01 </li>
         * <li>Fluctuation drops below -0.01: $checkValue &lt; -0.01 </li>
         * <li>Absolute value of the fluctuation: abs($checkValue) &gt; 0.01</li>
         * </ul>
         * <p>For a fixed-value type rule, you can also use an expression to configure the threshold. If both are configured at the same time, the expression takes precedence over Operator and Value.</p>
         * 
         * <strong>example:</strong>
         * <p>$checkValue &lt;= 0.01</p>
         */
        @NameInMap("Expression")
        public String expression;

        /**
         * <p>The comparison operator:</p>
         * <ul>
         * <li>\&gt;</li>
         * <li>\&gt;=</li>
         * <li>\&lt;</li>
         * <li>\&lt;=</li>
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

        public static CreateDataQualityRuleRequestCheckingConfigThresholdsExpected build(java.util.Map<String, ?> map) throws Exception {
            CreateDataQualityRuleRequestCheckingConfigThresholdsExpected self = new CreateDataQualityRuleRequestCheckingConfigThresholdsExpected();
            return TeaModel.build(map, self);
        }

        public CreateDataQualityRuleRequestCheckingConfigThresholdsExpected setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public CreateDataQualityRuleRequestCheckingConfigThresholdsExpected setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public CreateDataQualityRuleRequestCheckingConfigThresholdsExpected setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateDataQualityRuleRequestCheckingConfigThresholdsWarned extends TeaModel {
        /**
         * <p>The threshold expression.</p>
         * <p>For a fluctuation-type rule, you must use an expression to represent the fluctuation threshold. Examples:</p>
         * <ul>
         * <li>Fluctuation rises above 0.01: $checkValue &gt; 0.01 </li>
         * <li>Fluctuation drops below -0.01: $checkValue &lt; -0.01 </li>
         * <li>Absolute value of the fluctuation: abs($checkValue) &gt; 0.01</li>
         * </ul>
         * <p>For a fixed-value type rule, you can also use an expression to configure the threshold. If both are configured at the same time, the expression takes precedence over Operator and Value.</p>
         * 
         * <strong>example:</strong>
         * <p>$checkValue &gt; 0.01</p>
         */
        @NameInMap("Expression")
        public String expression;

        /**
         * <p>The comparison operator:</p>
         * <ul>
         * <li>\&gt;</li>
         * <li>\&gt;=</li>
         * <li>\&lt;</li>
         * <li>\&lt;=</li>
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

        public static CreateDataQualityRuleRequestCheckingConfigThresholdsWarned build(java.util.Map<String, ?> map) throws Exception {
            CreateDataQualityRuleRequestCheckingConfigThresholdsWarned self = new CreateDataQualityRuleRequestCheckingConfigThresholdsWarned();
            return TeaModel.build(map, self);
        }

        public CreateDataQualityRuleRequestCheckingConfigThresholdsWarned setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public CreateDataQualityRuleRequestCheckingConfigThresholdsWarned setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public CreateDataQualityRuleRequestCheckingConfigThresholdsWarned setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateDataQualityRuleRequestCheckingConfigThresholds extends TeaModel {
        /**
         * <p>The threshold settings for a critical warning.</p>
         */
        @NameInMap("Critical")
        public CreateDataQualityRuleRequestCheckingConfigThresholdsCritical critical;

        /**
         * <p>The expected threshold settings.</p>
         */
        @NameInMap("Expected")
        public CreateDataQualityRuleRequestCheckingConfigThresholdsExpected expected;

        /**
         * <p>The threshold settings for a normal warning.</p>
         */
        @NameInMap("Warned")
        public CreateDataQualityRuleRequestCheckingConfigThresholdsWarned warned;

        public static CreateDataQualityRuleRequestCheckingConfigThresholds build(java.util.Map<String, ?> map) throws Exception {
            CreateDataQualityRuleRequestCheckingConfigThresholds self = new CreateDataQualityRuleRequestCheckingConfigThresholds();
            return TeaModel.build(map, self);
        }

        public CreateDataQualityRuleRequestCheckingConfigThresholds setCritical(CreateDataQualityRuleRequestCheckingConfigThresholdsCritical critical) {
            this.critical = critical;
            return this;
        }
        public CreateDataQualityRuleRequestCheckingConfigThresholdsCritical getCritical() {
            return this.critical;
        }

        public CreateDataQualityRuleRequestCheckingConfigThresholds setExpected(CreateDataQualityRuleRequestCheckingConfigThresholdsExpected expected) {
            this.expected = expected;
            return this;
        }
        public CreateDataQualityRuleRequestCheckingConfigThresholdsExpected getExpected() {
            return this.expected;
        }

        public CreateDataQualityRuleRequestCheckingConfigThresholds setWarned(CreateDataQualityRuleRequestCheckingConfigThresholdsWarned warned) {
            this.warned = warned;
            return this;
        }
        public CreateDataQualityRuleRequestCheckingConfigThresholdsWarned getWarned() {
            return this.warned;
        }

    }

    public static class CreateDataQualityRuleRequestCheckingConfig extends TeaModel {
        /**
         * <p>Some types of thresholds require querying for reference samples and then summarizing the values of the reference samples to derive the threshold to be compared. An expression is used here to represent the query method for the reference samples.</p>
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
        public CreateDataQualityRuleRequestCheckingConfigThresholds thresholds;

        /**
         * <p>The threshold calculation method. You do not need to specify this parameter when a template is used.</p>
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

        public static CreateDataQualityRuleRequestCheckingConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateDataQualityRuleRequestCheckingConfig self = new CreateDataQualityRuleRequestCheckingConfig();
            return TeaModel.build(map, self);
        }

        public CreateDataQualityRuleRequestCheckingConfig setReferencedSamplesFilter(String referencedSamplesFilter) {
            this.referencedSamplesFilter = referencedSamplesFilter;
            return this;
        }
        public String getReferencedSamplesFilter() {
            return this.referencedSamplesFilter;
        }

        public CreateDataQualityRuleRequestCheckingConfig setThresholds(CreateDataQualityRuleRequestCheckingConfigThresholds thresholds) {
            this.thresholds = thresholds;
            return this;
        }
        public CreateDataQualityRuleRequestCheckingConfigThresholds getThresholds() {
            return this.thresholds;
        }

        public CreateDataQualityRuleRequestCheckingConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateDataQualityRuleRequestErrorHandlers extends TeaModel {
        /**
         * <p>For a custom SQL rule, you must specify an SQL statement to filter problematic data.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT * FROM tb_api_log WHERE id IS NULL</p>
         */
        @NameInMap("ErrorDataFilter")
        public String errorDataFilter;

        /**
         * <p>The handler type:</p>
         * <ul>
         * <li>SaveErrorData</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SaveErrorData</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateDataQualityRuleRequestErrorHandlers build(java.util.Map<String, ?> map) throws Exception {
            CreateDataQualityRuleRequestErrorHandlers self = new CreateDataQualityRuleRequestErrorHandlers();
            return TeaModel.build(map, self);
        }

        public CreateDataQualityRuleRequestErrorHandlers setErrorDataFilter(String errorDataFilter) {
            this.errorDataFilter = errorDataFilter;
            return this;
        }
        public String getErrorDataFilter() {
            return this.errorDataFilter;
        }

        public CreateDataQualityRuleRequestErrorHandlers setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateDataQualityRuleRequestSamplingConfig extends TeaModel {
        /**
         * <p>The name of the metric to be sampled. You do not need to specify this parameter when a template is used.</p>
         * <ul>
         * <li>Count: the number of rows in the table.</li>
         * <li>Min: the minimum value of the field.</li>
         * <li>Max: the maximum value of the field.</li>
         * <li>Avg: the average value of the field.</li>
         * <li>DistinctCount: the number of distinct values of the field.</li>
         * <li>DistinctPercent: the ratio of the number of distinct values of the field to the number of data rows.</li>
         * <li>DuplicatedCount: the number of duplicate values of the field.</li>
         * <li>DuplicatedPercent: the ratio of the number of duplicate values of the field to the number of data rows.</li>
         * <li>TableSize: the size of the table.</li>
         * <li>NullValueCount: the number of rows in which the field is null.</li>
         * <li>NullValuePercent: the ratio of rows in which the field is null.</li>
         * <li>GroupCount: the values aggregated by field value and the corresponding number of data rows for each value.</li>
         * <li>CountNotIn: the number of rows whose enum values do not match.</li>
         * <li>CountDistinctNotIn: the number of distinct values that do not match the enum values.</li>
         * <li>UserDefinedSql: collects samples by using a custom SQL statement.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Count</p>
         */
        @NameInMap("Metric")
        public String metric;

        /**
         * <p>The parameters required during sample collection.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;Columns&quot;: [ &quot;id&quot;, &quot;name&quot; ] , &quot;SQL&quot;: &quot;select count(1) from table;&quot;}</p>
         */
        @NameInMap("MetricParameters")
        public String metricParameters;

        /**
         * <p>The condition used to perform a secondary filter on the irrelevant data during sampling. The maximum length is 16777215 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>id IS NULL</p>
         */
        @NameInMap("SamplingFilter")
        public String samplingFilter;

        /**
         * <p>The runtime parameter setting statements to be inserted and executed before the sampling statement is executed. The maximum length is 1000 characters. Only MaxCompute is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>SET odps.sql.udf.timeout=600s; 
         * SET odps.sql.python.version=cp27;</p>
         */
        @NameInMap("SettingConfig")
        public String settingConfig;

        public static CreateDataQualityRuleRequestSamplingConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateDataQualityRuleRequestSamplingConfig self = new CreateDataQualityRuleRequestSamplingConfig();
            return TeaModel.build(map, self);
        }

        public CreateDataQualityRuleRequestSamplingConfig setMetric(String metric) {
            this.metric = metric;
            return this;
        }
        public String getMetric() {
            return this.metric;
        }

        public CreateDataQualityRuleRequestSamplingConfig setMetricParameters(String metricParameters) {
            this.metricParameters = metricParameters;
            return this;
        }
        public String getMetricParameters() {
            return this.metricParameters;
        }

        public CreateDataQualityRuleRequestSamplingConfig setSamplingFilter(String samplingFilter) {
            this.samplingFilter = samplingFilter;
            return this;
        }
        public String getSamplingFilter() {
            return this.samplingFilter;
        }

        public CreateDataQualityRuleRequestSamplingConfig setSettingConfig(String settingConfig) {
            this.settingConfig = settingConfig;
            return this;
        }
        public String getSettingConfig() {
            return this.settingConfig;
        }

    }

    public static class CreateDataQualityRuleRequestTarget extends TeaModel {
        /**
         * <p>For a table-type dataset, the type of database to which the table belongs.</p>
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
         * <p>The partition settings of the partitioned table.</p>
         * 
         * <strong>example:</strong>
         * <p>ds=$[yyyymmdd-1]</p>
         */
        @NameInMap("PartitionSpec")
        public String partitionSpec;

        /**
         * <p>The unique ID of the table in Data Map on which the rule operates.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>odps.unit_test.tb_unit_test</p>
         */
        @NameInMap("TableGuid")
        public String tableGuid;

        /**
         * <p>The type of the monitored object.</p>
         * <ul>
         * <li>Table</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Table</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateDataQualityRuleRequestTarget build(java.util.Map<String, ?> map) throws Exception {
            CreateDataQualityRuleRequestTarget self = new CreateDataQualityRuleRequestTarget();
            return TeaModel.build(map, self);
        }

        public CreateDataQualityRuleRequestTarget setDatabaseType(String databaseType) {
            this.databaseType = databaseType;
            return this;
        }
        public String getDatabaseType() {
            return this.databaseType;
        }

        public CreateDataQualityRuleRequestTarget setPartitionSpec(String partitionSpec) {
            this.partitionSpec = partitionSpec;
            return this;
        }
        public String getPartitionSpec() {
            return this.partitionSpec;
        }

        public CreateDataQualityRuleRequestTarget setTableGuid(String tableGuid) {
            this.tableGuid = tableGuid;
            return this;
        }
        public String getTableGuid() {
            return this.tableGuid;
        }

        public CreateDataQualityRuleRequestTarget setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
