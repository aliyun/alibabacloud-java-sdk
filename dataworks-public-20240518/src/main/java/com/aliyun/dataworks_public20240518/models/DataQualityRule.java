// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DataQualityRule extends TeaModel {
    /**
     * <p>The check settings for sample data.</p>
     */
    @NameInMap("CheckingConfig")
    public DataQualityRuleCheckingConfig checkingConfig;

    /**
     * <p>The description of the rule. The description can be up to 500 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>this is a odps _sql task</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Indicates whether the rule is enabled.</p>
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
    public java.util.List<DataQualityRuleErrorHandlers> errorHandlers;

    /**
     * <p>The rule ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The rule name. The name can be up to 255 characters in length and can contain digits, letters, and punctuation marks.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The DataWorks workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The settings for sampling.</p>
     */
    @NameInMap("SamplingConfig")
    public DataQualityRuleSamplingConfig samplingConfig;

    /**
     * <p>The strength of the rule. Valid values:</p>
     * <ul>
     * <li>Normal</li>
     * <li>High</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>High</p>
     */
    @NameInMap("Severity")
    public String severity;

    /**
     * <p>The monitored object of the rule.</p>
     */
    @NameInMap("Target")
    public DataQualityRuleTarget target;

    /**
     * <p>The template used by the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>system::user_defined</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

    /**
     * <p>The DataWorks tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TenantId")
    public Long tenantId;

    public static DataQualityRule build(java.util.Map<String, ?> map) throws Exception {
        DataQualityRule self = new DataQualityRule();
        return TeaModel.build(map, self);
    }

    public DataQualityRule setCheckingConfig(DataQualityRuleCheckingConfig checkingConfig) {
        this.checkingConfig = checkingConfig;
        return this;
    }
    public DataQualityRuleCheckingConfig getCheckingConfig() {
        return this.checkingConfig;
    }

    public DataQualityRule setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DataQualityRule setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public DataQualityRule setErrorHandlers(java.util.List<DataQualityRuleErrorHandlers> errorHandlers) {
        this.errorHandlers = errorHandlers;
        return this;
    }
    public java.util.List<DataQualityRuleErrorHandlers> getErrorHandlers() {
        return this.errorHandlers;
    }

    public DataQualityRule setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DataQualityRule setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DataQualityRule setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public DataQualityRule setSamplingConfig(DataQualityRuleSamplingConfig samplingConfig) {
        this.samplingConfig = samplingConfig;
        return this;
    }
    public DataQualityRuleSamplingConfig getSamplingConfig() {
        return this.samplingConfig;
    }

    public DataQualityRule setSeverity(String severity) {
        this.severity = severity;
        return this;
    }
    public String getSeverity() {
        return this.severity;
    }

    public DataQualityRule setTarget(DataQualityRuleTarget target) {
        this.target = target;
        return this;
    }
    public DataQualityRuleTarget getTarget() {
        return this.target;
    }

    public DataQualityRule setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public DataQualityRule setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public static class DataQualityRuleCheckingConfigThresholdsCritical extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>波动率类型规则使用，通过表达式来表示波动阈值。如：波动上升大于0.01： $checkValue &gt; 0.01  波动下降大于0.01：$checkValue &lt; -0.01   波动率绝对值：abs($checkValue) &gt; 0.01</p>
         */
        @NameInMap("Expression")
        public String expression;

        /**
         * <p>The comparison operator. Valid values:</p>
         * <ul>
         * <li>/&gt;</li>
         * <li>/&gt;=</li>
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

        public static DataQualityRuleCheckingConfigThresholdsCritical build(java.util.Map<String, ?> map) throws Exception {
            DataQualityRuleCheckingConfigThresholdsCritical self = new DataQualityRuleCheckingConfigThresholdsCritical();
            return TeaModel.build(map, self);
        }

        public DataQualityRuleCheckingConfigThresholdsCritical setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public DataQualityRuleCheckingConfigThresholdsCritical setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public DataQualityRuleCheckingConfigThresholdsCritical setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DataQualityRuleCheckingConfigThresholdsExpected extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>波动率类型规则使用，通过表达式来表示波动阈值。如：波动上升大于0.01： $checkValue &gt; 0.01  波动下降大于0.01：$checkValue &lt; -0.01   波动率绝对值：abs($checkValue) &gt; 0.01</p>
         */
        @NameInMap("Expression")
        public String expression;

        /**
         * <p>The comparison operator. Valid values:</p>
         * <ul>
         * <li>/&gt;</li>
         * <li>/&gt;=</li>
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

        public static DataQualityRuleCheckingConfigThresholdsExpected build(java.util.Map<String, ?> map) throws Exception {
            DataQualityRuleCheckingConfigThresholdsExpected self = new DataQualityRuleCheckingConfigThresholdsExpected();
            return TeaModel.build(map, self);
        }

        public DataQualityRuleCheckingConfigThresholdsExpected setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public DataQualityRuleCheckingConfigThresholdsExpected setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public DataQualityRuleCheckingConfigThresholdsExpected setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DataQualityRuleCheckingConfigThresholdsWarned extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>波动率类型规则使用，通过表达式来表示波动阈值。如：波动上升大于0.01： $checkValue &gt; 0.01  波动下降大于0.01：$checkValue &lt; -0.01   波动率绝对值：abs($checkValue) &gt; 0.01</p>
         */
        @NameInMap("Expression")
        public String expression;

        /**
         * <p>The comparison operator. Valid values:</p>
         * <ul>
         * <li>/&gt;</li>
         * <li>/&gt;=</li>
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

        public static DataQualityRuleCheckingConfigThresholdsWarned build(java.util.Map<String, ?> map) throws Exception {
            DataQualityRuleCheckingConfigThresholdsWarned self = new DataQualityRuleCheckingConfigThresholdsWarned();
            return TeaModel.build(map, self);
        }

        public DataQualityRuleCheckingConfigThresholdsWarned setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public DataQualityRuleCheckingConfigThresholdsWarned setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public DataQualityRuleCheckingConfigThresholdsWarned setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DataQualityRuleCheckingConfigThresholds extends TeaModel {
        /**
         * <p>The threshold settings for critical alerts.</p>
         */
        @NameInMap("Critical")
        public DataQualityRuleCheckingConfigThresholdsCritical critical;

        /**
         * <p>The expected threshold setting.</p>
         */
        @NameInMap("Expected")
        public DataQualityRuleCheckingConfigThresholdsExpected expected;

        /**
         * <p>The threshold settings for normal alerts.</p>
         */
        @NameInMap("Warned")
        public DataQualityRuleCheckingConfigThresholdsWarned warned;

        public static DataQualityRuleCheckingConfigThresholds build(java.util.Map<String, ?> map) throws Exception {
            DataQualityRuleCheckingConfigThresholds self = new DataQualityRuleCheckingConfigThresholds();
            return TeaModel.build(map, self);
        }

        public DataQualityRuleCheckingConfigThresholds setCritical(DataQualityRuleCheckingConfigThresholdsCritical critical) {
            this.critical = critical;
            return this;
        }
        public DataQualityRuleCheckingConfigThresholdsCritical getCritical() {
            return this.critical;
        }

        public DataQualityRuleCheckingConfigThresholds setExpected(DataQualityRuleCheckingConfigThresholdsExpected expected) {
            this.expected = expected;
            return this;
        }
        public DataQualityRuleCheckingConfigThresholdsExpected getExpected() {
            return this.expected;
        }

        public DataQualityRuleCheckingConfigThresholds setWarned(DataQualityRuleCheckingConfigThresholdsWarned warned) {
            this.warned = warned;
            return this;
        }
        public DataQualityRuleCheckingConfigThresholdsWarned getWarned() {
            return this.warned;
        }

    }

    public static class DataQualityRuleCheckingConfig extends TeaModel {
        /**
         * <p>The method that is used to query the referenced samples. To obtain some types of thresholds, you need to query reference values. In this example, an expression is used to indicate the query method of referenced samples.</p>
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
        public DataQualityRuleCheckingConfigThresholds thresholds;

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

        public static DataQualityRuleCheckingConfig build(java.util.Map<String, ?> map) throws Exception {
            DataQualityRuleCheckingConfig self = new DataQualityRuleCheckingConfig();
            return TeaModel.build(map, self);
        }

        public DataQualityRuleCheckingConfig setReferencedSamplesFilter(String referencedSamplesFilter) {
            this.referencedSamplesFilter = referencedSamplesFilter;
            return this;
        }
        public String getReferencedSamplesFilter() {
            return this.referencedSamplesFilter;
        }

        public DataQualityRuleCheckingConfig setThresholds(DataQualityRuleCheckingConfigThresholds thresholds) {
            this.thresholds = thresholds;
            return this;
        }
        public DataQualityRuleCheckingConfigThresholds getThresholds() {
            return this.thresholds;
        }

        public DataQualityRuleCheckingConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DataQualityRuleErrorHandlers extends TeaModel {
        /**
         * <p>The SQL statement that is used to filter failed tasks. If the rule is defined by custom SQL statements, you must specify an SQL statement to filter failed tasks.</p>
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

        public static DataQualityRuleErrorHandlers build(java.util.Map<String, ?> map) throws Exception {
            DataQualityRuleErrorHandlers self = new DataQualityRuleErrorHandlers();
            return TeaModel.build(map, self);
        }

        public DataQualityRuleErrorHandlers setErrorDataFilter(String errorDataFilter) {
            this.errorDataFilter = errorDataFilter;
            return this;
        }
        public String getErrorDataFilter() {
            return this.errorDataFilter;
        }

        public DataQualityRuleErrorHandlers setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DataQualityRuleSamplingConfig extends TeaModel {
        /**
         * <p>The metrics used for sampling. Valid values:</p>
         * <ul>
         * <li>Count: the number of rows in the table.</li>
         * <li>Min: the minimum value of the field.</li>
         * <li>Max: the maximum value of the field.</li>
         * <li>Avg: the average value of the field.</li>
         * <li>DistinctCount: the number of unique values of the field after deduplication.</li>
         * <li>DistinctPercent: the percentage of the number of unique values of the field after deduplication to the number of rows in the table.</li>
         * <li>DuplicatedCount: the number of duplicated values in the field.</li>
         * <li>DuplicatedPercent: the percentage of the number of duplicated values of the field to the number of rows in the table.</li>
         * <li>TableSize: the table size.</li>
         * <li>NullValueCount: the number of rows in which the field is set to null.</li>
         * <li>NullValuePercent: the percentage of the number of rows in which the field is set to null to the number of rows in the table.</li>
         * <li>GroupCount: the field value and the number of rows for each field value.</li>
         * <li>CountNotIn: the number of rows in which the field values are different from the referenced values that you specified in the rule.</li>
         * <li>CountDistinctNotIn: the number of unique values that are different from the referenced values that you specified in the rule after deduplication.</li>
         * <li>UserDefinedSql: indicates that the data is sampled by executing custom SQL statements.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Min</p>
         */
        @NameInMap("Metric")
        public String metric;

        /**
         * <p>The parameters required for sampling.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;Columns&quot;: [ &quot;id&quot;, &quot;name&quot; ] }</p>
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
         * <p>SET odps.sql.udf.timeout=600s;</p>
         */
        @NameInMap("SettingConfig")
        public String settingConfig;

        public static DataQualityRuleSamplingConfig build(java.util.Map<String, ?> map) throws Exception {
            DataQualityRuleSamplingConfig self = new DataQualityRuleSamplingConfig();
            return TeaModel.build(map, self);
        }

        public DataQualityRuleSamplingConfig setMetric(String metric) {
            this.metric = metric;
            return this;
        }
        public String getMetric() {
            return this.metric;
        }

        public DataQualityRuleSamplingConfig setMetricParameters(String metricParameters) {
            this.metricParameters = metricParameters;
            return this;
        }
        public String getMetricParameters() {
            return this.metricParameters;
        }

        public DataQualityRuleSamplingConfig setSamplingFilter(String samplingFilter) {
            this.samplingFilter = samplingFilter;
            return this;
        }
        public String getSamplingFilter() {
            return this.samplingFilter;
        }

        public DataQualityRuleSamplingConfig setSettingConfig(String settingConfig) {
            this.settingConfig = settingConfig;
            return this;
        }
        public String getSettingConfig() {
            return this.settingConfig;
        }

    }

    public static class DataQualityRuleTarget extends TeaModel {
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
         * <p>The ID of the table in Data Map.</p>
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

        public static DataQualityRuleTarget build(java.util.Map<String, ?> map) throws Exception {
            DataQualityRuleTarget self = new DataQualityRuleTarget();
            return TeaModel.build(map, self);
        }

        public DataQualityRuleTarget setDatabaseType(String databaseType) {
            this.databaseType = databaseType;
            return this;
        }
        public String getDatabaseType() {
            return this.databaseType;
        }

        public DataQualityRuleTarget setPartitionSpec(String partitionSpec) {
            this.partitionSpec = partitionSpec;
            return this;
        }
        public String getPartitionSpec() {
            return this.partitionSpec;
        }

        public DataQualityRuleTarget setTableGuid(String tableGuid) {
            this.tableGuid = tableGuid;
            return this;
        }
        public String getTableGuid() {
            return this.tableGuid;
        }

        public DataQualityRuleTarget setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
