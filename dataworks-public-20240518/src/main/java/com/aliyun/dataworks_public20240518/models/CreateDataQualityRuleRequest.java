// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDataQualityRuleRequest extends TeaModel {
    /**
     * <p>The check settings for sample data.</p>
     */
    @NameInMap("CheckingConfig")
    public CreateDataQualityRuleRequestCheckingConfig checkingConfig;

    /**
     * <p>The description of the rule. The description can be up to 500 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>this is a odps _sql task</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to enable the monitoring rule.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>The operations that you can perform after the rule-based check fails.</p>
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
     * <p>The DataWorks workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10726</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The sampling settings.</p>
     */
    @NameInMap("SamplingConfig")
    public CreateDataQualityRuleRequestSamplingConfig samplingConfig;

    /**
     * <p>The strength of the monitoring rule. Valid values:</p>
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
     * <p>The monitored object of the rule.</p>
     */
    @NameInMap("Target")
    public CreateDataQualityRuleRequestTarget target;

    /**
     * <p>The ID of the template used by the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>system::user_defined</p>
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
         * <p>If the template specified by the TemplateCode parameter is about fluctuation, you must use an expression to represent the threshold for fluctuation. Example:</p>
         * <ul>
         * <li>$checkValue &gt; 0.01</li>
         * <li>$checkValue &lt; -0.01</li>
         * <li>abs($checkValue) &gt; 0.01</li>
         * </ul>
         * <p>If the template specified by the TemplateCode parameter is about fixed value, you can also use an expression to represent the threshold. If you configure the Expression, Operator, and Value parameters for the threshold at the same time, the Expression parameter takes precedence over the Operator and Value parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>$checkValue &gt; 0.05</p>
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
         * <li>\=</li>
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
         * <p>If the template specified by the TemplateCode parameter is about fluctuation, you must use an expression to represent the threshold for fluctuation. Example:</p>
         * <ul>
         * <li>$checkValue &gt; 0.01</li>
         * <li>$checkValue &lt; -0.01</li>
         * <li>abs($checkValue) &gt; 0.01</li>
         * </ul>
         * <p>If the template specified by the TemplateCode parameter is about fixed value, you can also use an expression to represent the threshold. If you configure the Expression, Operator, and Value parameters for the threshold at the same time, the Expression parameter takes precedence over the Operator and Value parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>$checkValue &lt;= 0.01</p>
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
         * <li>\=</li>
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
         * <p>If the template specified by the TemplateCode parameter is about fluctuation, you must use an expression to represent the threshold for fluctuation. Example:</p>
         * <ul>
         * <li>$checkValue &gt; 0.01</li>
         * <li>$checkValue &lt; -0.01</li>
         * <li>abs($checkValue) &gt; 0.01</li>
         * </ul>
         * <p>If the template specified by the TemplateCode parameter is about fixed value, you can also use an expression to represent the threshold. If you configure the Expression, Operator, and Value parameters for the threshold at the same time, the Expression parameter takes precedence over the Operator and Value parameters.</p>
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
         * <li>\=</li>
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
         * <p>The threshold settings for critical alerts.</p>
         */
        @NameInMap("Critical")
        public CreateDataQualityRuleRequestCheckingConfigThresholdsCritical critical;

        /**
         * <p>The expected threshold setting.</p>
         */
        @NameInMap("Expected")
        public CreateDataQualityRuleRequestCheckingConfigThresholdsExpected expected;

        /**
         * <p>The threshold settings for normal alerts.</p>
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
         * <p>The method that is used to query the referenced samples. To obtain some types of thresholds, you need to query reference samples and perform aggregate operations on the reference values. In this example, an expression is used to specify the query method of referenced samples.</p>
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
         * <p>The method that is used to calculate a threshold. You can leave this parameter empty if you use a rule template. Valid values:</p>
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
         * <p>The SQL statement that is used to filter failed tasks. If you define the rule by using custom SQL statements, you must specify an SQL statement to filter failed tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT * FROM tb_api_log WHERE id IS NULL</p>
         */
        @NameInMap("ErrorDataFilter")
        public String errorDataFilter;

        /**
         * <p>The type of the operation. Valid values:</p>
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
         * <p>The metrics used for sampling. You can leave this parameter empty if you use a rule template. Valid values:</p>
         * <ul>
         * <li>Count: the number of rows in the table.</li>
         * <li>Min: the minimum value of the field.</li>
         * <li>Max: the maximum value of the field.</li>
         * <li>Avg: the average value of the field.</li>
         * <li>DistinctCount: the number of unique values of the field after deduplication.</li>
         * <li>DistinctPercent: the proportion of the number of unique values of the field after deduplication to the number of rows in the table.</li>
         * <li>DuplicatedCount: the number of duplicated values of the field.</li>
         * <li>DuplicatedPercent: the proportion of the number of duplicated values of the field to the number of rows in the table.</li>
         * <li>TableSize: the table size.</li>
         * <li>NullValueCount: the number of rows in which the field value is null.</li>
         * <li>NullValuePercent: the proportion of the number of rows in which the field value is null to the number of rows in the table.</li>
         * <li>GroupCount: the field value and the number of rows for each field value.</li>
         * <li>CountNotIn: the number of rows in which the field values are different from the referenced values that you specified in the rule.</li>
         * <li>CountDistinctNotIn: the number of unique values that are different from the referenced values that you specified in the rule after deduplication.</li>
         * <li>UserDefinedSql: specifies that data is sampled by executing custom SQL statements.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Count</p>
         */
        @NameInMap("Metric")
        public String metric;

        /**
         * <p>The parameters required for sampling.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;Columns&quot;: [ &quot;id&quot;, &quot;name&quot; ] , &quot;SQL&quot;: &quot;select count(1) from table;&quot;}</p>
         */
        @NameInMap("MetricParameters")
        public String metricParameters;

        /**
         * <p>The statements that are used to filter unnecessary data during sampling. The statements can be up to 16,777,215 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>id IS NULL</p>
         */
        @NameInMap("SamplingFilter")
        public String samplingFilter;

        /**
         * <p>The statements that are used to configure the parameters required for sampling before you execute the sampling statements. The statements can be up to 1,000 characters in length. Only the MaxCompute database is supported.</p>
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
         * <p>The type of the database to which the table belongs. Valid values:</p>
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
         * <p>The configuration of the partitioned table.</p>
         * 
         * <strong>example:</strong>
         * <p>ds=$[yyyymmdd-1]</p>
         */
        @NameInMap("PartitionSpec")
        public String partitionSpec;

        /**
         * <p>The ID of the table that is limited by the rule in Data Map.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>odps.unit_test.tb_unit_test</p>
         */
        @NameInMap("TableGuid")
        public String tableGuid;

        /**
         * <p>The type of the monitored object. Valid values:</p>
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
