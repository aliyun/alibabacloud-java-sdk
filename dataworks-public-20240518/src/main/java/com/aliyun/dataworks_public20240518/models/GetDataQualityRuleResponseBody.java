// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetDataQualityRuleResponseBody extends TeaModel {
    /**
     * <p>The information about the rule.</p>
     */
    @NameInMap("DataQualityRule")
    public GetDataQualityRuleResponseBodyDataQualityRule dataQualityRule;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>691CA452-D37A-4ED0-9441</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetDataQualityRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataQualityRuleResponseBody self = new GetDataQualityRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataQualityRuleResponseBody setDataQualityRule(GetDataQualityRuleResponseBodyDataQualityRule dataQualityRule) {
        this.dataQualityRule = dataQualityRule;
        return this;
    }
    public GetDataQualityRuleResponseBodyDataQualityRule getDataQualityRule() {
        return this.dataQualityRule;
    }

    public GetDataQualityRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDataQualityRuleResponseBodyDataQualityRuleCheckingConfigThresholdsCritical extends TeaModel {
        /**
         * <p>The threshold expression.</p>
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

        public static GetDataQualityRuleResponseBodyDataQualityRuleCheckingConfigThresholdsCritical build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityRuleResponseBodyDataQualityRuleCheckingConfigThresholdsCritical self = new GetDataQualityRuleResponseBodyDataQualityRuleCheckingConfigThresholdsCritical();
            return TeaModel.build(map, self);
        }

        public GetDataQualityRuleResponseBodyDataQualityRuleCheckingConfigThresholdsCritical setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public GetDataQualityRuleResponseBodyDataQualityRuleCheckingConfigThresholdsCritical setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetDataQualityRuleResponseBodyDataQualityRuleCheckingConfigThresholdsCritical setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetDataQualityRuleResponseBodyDataQualityRuleCheckingConfigThresholdsExpected extends TeaModel {
        /**
         * <p>The threshold expression.</p>
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

        public static GetDataQualityRuleResponseBodyDataQualityRuleCheckingConfigThresholdsExpected build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityRuleResponseBodyDataQualityRuleCheckingConfigThresholdsExpected self = new GetDataQualityRuleResponseBodyDataQualityRuleCheckingConfigThresholdsExpected();
            return TeaModel.build(map, self);
        }

        public GetDataQualityRuleResponseBodyDataQualityRuleCheckingConfigThresholdsExpected setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public GetDataQualityRuleResponseBodyDataQualityRuleCheckingConfigThresholdsExpected setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetDataQualityRuleResponseBodyDataQualityRuleCheckingConfigThresholdsExpected setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetDataQualityRuleResponseBodyDataQualityRuleCheckingConfigThresholdsWarned extends TeaModel {
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

        public static GetDataQualityRuleResponseBodyDataQualityRuleCheckingConfigThresholdsWarned build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityRuleResponseBodyDataQualityRuleCheckingConfigThresholdsWarned self = new GetDataQualityRuleResponseBodyDataQualityRuleCheckingConfigThresholdsWarned();
            return TeaModel.build(map, self);
        }

        public GetDataQualityRuleResponseBodyDataQualityRuleCheckingConfigThresholdsWarned setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public GetDataQualityRuleResponseBodyDataQualityRuleCheckingConfigThresholdsWarned setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetDataQualityRuleResponseBodyDataQualityRuleCheckingConfigThresholdsWarned setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetDataQualityRuleResponseBodyDataQualityRuleCheckingConfigThresholds extends TeaModel {
        /**
         * <p>The threshold settings for critical alerts.</p>
         */
        @NameInMap("Critical")
        public GetDataQualityRuleResponseBodyDataQualityRuleCheckingConfigThresholdsCritical critical;

        /**
         * <p>The expected threshold setting.</p>
         */
        @NameInMap("Expected")
        public GetDataQualityRuleResponseBodyDataQualityRuleCheckingConfigThresholdsExpected expected;

        /**
         * <p>The threshold settings for normal alerts.</p>
         */
        @NameInMap("Warned")
        public GetDataQualityRuleResponseBodyDataQualityRuleCheckingConfigThresholdsWarned warned;

        public static GetDataQualityRuleResponseBodyDataQualityRuleCheckingConfigThresholds build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityRuleResponseBodyDataQualityRuleCheckingConfigThresholds self = new GetDataQualityRuleResponseBodyDataQualityRuleCheckingConfigThresholds();
            return TeaModel.build(map, self);
        }

        public GetDataQualityRuleResponseBodyDataQualityRuleCheckingConfigThresholds setCritical(GetDataQualityRuleResponseBodyDataQualityRuleCheckingConfigThresholdsCritical critical) {
            this.critical = critical;
            return this;
        }
        public GetDataQualityRuleResponseBodyDataQualityRuleCheckingConfigThresholdsCritical getCritical() {
            return this.critical;
        }

        public GetDataQualityRuleResponseBodyDataQualityRuleCheckingConfigThresholds setExpected(GetDataQualityRuleResponseBodyDataQualityRuleCheckingConfigThresholdsExpected expected) {
            this.expected = expected;
            return this;
        }
        public GetDataQualityRuleResponseBodyDataQualityRuleCheckingConfigThresholdsExpected getExpected() {
            return this.expected;
        }

        public GetDataQualityRuleResponseBodyDataQualityRuleCheckingConfigThresholds setWarned(GetDataQualityRuleResponseBodyDataQualityRuleCheckingConfigThresholdsWarned warned) {
            this.warned = warned;
            return this;
        }
        public GetDataQualityRuleResponseBodyDataQualityRuleCheckingConfigThresholdsWarned getWarned() {
            return this.warned;
        }

    }

    public static class GetDataQualityRuleResponseBodyDataQualityRuleCheckingConfig extends TeaModel {
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
        public GetDataQualityRuleResponseBodyDataQualityRuleCheckingConfigThresholds thresholds;

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

        public static GetDataQualityRuleResponseBodyDataQualityRuleCheckingConfig build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityRuleResponseBodyDataQualityRuleCheckingConfig self = new GetDataQualityRuleResponseBodyDataQualityRuleCheckingConfig();
            return TeaModel.build(map, self);
        }

        public GetDataQualityRuleResponseBodyDataQualityRuleCheckingConfig setReferencedSamplesFilter(String referencedSamplesFilter) {
            this.referencedSamplesFilter = referencedSamplesFilter;
            return this;
        }
        public String getReferencedSamplesFilter() {
            return this.referencedSamplesFilter;
        }

        public GetDataQualityRuleResponseBodyDataQualityRuleCheckingConfig setThresholds(GetDataQualityRuleResponseBodyDataQualityRuleCheckingConfigThresholds thresholds) {
            this.thresholds = thresholds;
            return this;
        }
        public GetDataQualityRuleResponseBodyDataQualityRuleCheckingConfigThresholds getThresholds() {
            return this.thresholds;
        }

        public GetDataQualityRuleResponseBodyDataQualityRuleCheckingConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDataQualityRuleResponseBodyDataQualityRuleErrorHandlers extends TeaModel {
        /**
         * <p>The SQL statement that is used to filter failed tasks. If you define the rule by using custom SQL statements, you must specify an SQL statement to filter failed tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT * FROM tb_api_log WHERE id IS NULL</p>
         */
        @NameInMap("ErrorDataFilter")
        public String errorDataFilter;

        /**
         * <p>Processor type:</p>
         * <ul>
         * <li>SaveErrorData</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SaveErrorData</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetDataQualityRuleResponseBodyDataQualityRuleErrorHandlers build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityRuleResponseBodyDataQualityRuleErrorHandlers self = new GetDataQualityRuleResponseBodyDataQualityRuleErrorHandlers();
            return TeaModel.build(map, self);
        }

        public GetDataQualityRuleResponseBodyDataQualityRuleErrorHandlers setErrorDataFilter(String errorDataFilter) {
            this.errorDataFilter = errorDataFilter;
            return this;
        }
        public String getErrorDataFilter() {
            return this.errorDataFilter;
        }

        public GetDataQualityRuleResponseBodyDataQualityRuleErrorHandlers setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDataQualityRuleResponseBodyDataQualityRuleSamplingConfig extends TeaModel {
        /**
         * <p>The metrics used for sampling. Valid values:</p>
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
         * <li>UserDefinedSql: indicates that data is sampled by executing custom SQL statements.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Max</p>
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

        public static GetDataQualityRuleResponseBodyDataQualityRuleSamplingConfig build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityRuleResponseBodyDataQualityRuleSamplingConfig self = new GetDataQualityRuleResponseBodyDataQualityRuleSamplingConfig();
            return TeaModel.build(map, self);
        }

        public GetDataQualityRuleResponseBodyDataQualityRuleSamplingConfig setMetric(String metric) {
            this.metric = metric;
            return this;
        }
        public String getMetric() {
            return this.metric;
        }

        public GetDataQualityRuleResponseBodyDataQualityRuleSamplingConfig setMetricParameters(String metricParameters) {
            this.metricParameters = metricParameters;
            return this;
        }
        public String getMetricParameters() {
            return this.metricParameters;
        }

        public GetDataQualityRuleResponseBodyDataQualityRuleSamplingConfig setSamplingFilter(String samplingFilter) {
            this.samplingFilter = samplingFilter;
            return this;
        }
        public String getSamplingFilter() {
            return this.samplingFilter;
        }

        public GetDataQualityRuleResponseBodyDataQualityRuleSamplingConfig setSettingConfig(String settingConfig) {
            this.settingConfig = settingConfig;
            return this;
        }
        public String getSettingConfig() {
            return this.settingConfig;
        }

    }

    public static class GetDataQualityRuleResponseBodyDataQualityRuleTarget extends TeaModel {
        /**
         * <p>The dataset of the table type. The database type to which the table belongs.</p>
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
         * 
         * <strong>example:</strong>
         * <p>odps.unit_test.tb_unit_test</p>
         */
        @NameInMap("TableGuid")
        public String tableGuid;

        /**
         * <p>Monitoring object type</p>
         * <ul>
         * <li>Table</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Table</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetDataQualityRuleResponseBodyDataQualityRuleTarget build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityRuleResponseBodyDataQualityRuleTarget self = new GetDataQualityRuleResponseBodyDataQualityRuleTarget();
            return TeaModel.build(map, self);
        }

        public GetDataQualityRuleResponseBodyDataQualityRuleTarget setDatabaseType(String databaseType) {
            this.databaseType = databaseType;
            return this;
        }
        public String getDatabaseType() {
            return this.databaseType;
        }

        public GetDataQualityRuleResponseBodyDataQualityRuleTarget setPartitionSpec(String partitionSpec) {
            this.partitionSpec = partitionSpec;
            return this;
        }
        public String getPartitionSpec() {
            return this.partitionSpec;
        }

        public GetDataQualityRuleResponseBodyDataQualityRuleTarget setTableGuid(String tableGuid) {
            this.tableGuid = tableGuid;
            return this;
        }
        public String getTableGuid() {
            return this.tableGuid;
        }

        public GetDataQualityRuleResponseBodyDataQualityRuleTarget setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDataQualityRuleResponseBodyDataQualityRule extends TeaModel {
        /**
         * <p>The check settings for sample data.</p>
         */
        @NameInMap("CheckingConfig")
        public GetDataQualityRuleResponseBodyDataQualityRuleCheckingConfig checkingConfig;

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
        public java.util.List<GetDataQualityRuleResponseBodyDataQualityRuleErrorHandlers> errorHandlers;

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>16033</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>The table cannot be empty.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The DataWorks workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1948</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The sampling settings.</p>
         */
        @NameInMap("SamplingConfig")
        public GetDataQualityRuleResponseBodyDataQualityRuleSamplingConfig samplingConfig;

        /**
         * <p>Rule for the business level (corresponding to the strong and weak rules on the page), optional enumeration value:</p>
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
        public GetDataQualityRuleResponseBodyDataQualityRuleTarget target;

        /**
         * <p>The ID of the template used by the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>system::user_defined</p>
         */
        @NameInMap("TemplateCode")
        public String templateCode;

        public static GetDataQualityRuleResponseBodyDataQualityRule build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityRuleResponseBodyDataQualityRule self = new GetDataQualityRuleResponseBodyDataQualityRule();
            return TeaModel.build(map, self);
        }

        public GetDataQualityRuleResponseBodyDataQualityRule setCheckingConfig(GetDataQualityRuleResponseBodyDataQualityRuleCheckingConfig checkingConfig) {
            this.checkingConfig = checkingConfig;
            return this;
        }
        public GetDataQualityRuleResponseBodyDataQualityRuleCheckingConfig getCheckingConfig() {
            return this.checkingConfig;
        }

        public GetDataQualityRuleResponseBodyDataQualityRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetDataQualityRuleResponseBodyDataQualityRule setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetDataQualityRuleResponseBodyDataQualityRule setErrorHandlers(java.util.List<GetDataQualityRuleResponseBodyDataQualityRuleErrorHandlers> errorHandlers) {
            this.errorHandlers = errorHandlers;
            return this;
        }
        public java.util.List<GetDataQualityRuleResponseBodyDataQualityRuleErrorHandlers> getErrorHandlers() {
            return this.errorHandlers;
        }

        public GetDataQualityRuleResponseBodyDataQualityRule setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetDataQualityRuleResponseBodyDataQualityRule setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDataQualityRuleResponseBodyDataQualityRule setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetDataQualityRuleResponseBodyDataQualityRule setSamplingConfig(GetDataQualityRuleResponseBodyDataQualityRuleSamplingConfig samplingConfig) {
            this.samplingConfig = samplingConfig;
            return this;
        }
        public GetDataQualityRuleResponseBodyDataQualityRuleSamplingConfig getSamplingConfig() {
            return this.samplingConfig;
        }

        public GetDataQualityRuleResponseBodyDataQualityRule setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public GetDataQualityRuleResponseBodyDataQualityRule setTarget(GetDataQualityRuleResponseBodyDataQualityRuleTarget target) {
            this.target = target;
            return this;
        }
        public GetDataQualityRuleResponseBodyDataQualityRuleTarget getTarget() {
            return this.target;
        }

        public GetDataQualityRuleResponseBodyDataQualityRule setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

    }

}
