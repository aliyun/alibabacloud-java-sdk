// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDataQualityRulesResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PagingInfo")
    public ListDataQualityRulesResponseBodyPagingInfo pagingInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>691CA452-D37A-4ED0-9441</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListDataQualityRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataQualityRulesResponseBody self = new ListDataQualityRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataQualityRulesResponseBody setPagingInfo(ListDataQualityRulesResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListDataQualityRulesResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListDataQualityRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholdsCritical extends TeaModel {
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

        public static ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholdsCritical build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholdsCritical self = new ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholdsCritical();
            return TeaModel.build(map, self);
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholdsCritical setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholdsCritical setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholdsCritical setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholdsExpected extends TeaModel {
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

        public static ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholdsExpected build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholdsExpected self = new ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholdsExpected();
            return TeaModel.build(map, self);
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholdsExpected setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholdsExpected setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholdsExpected setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholdsWarned extends TeaModel {
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

        public static ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholdsWarned build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholdsWarned self = new ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholdsWarned();
            return TeaModel.build(map, self);
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholdsWarned setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholdsWarned setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholdsWarned setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholds extends TeaModel {
        /**
         * <p>The threshold settings for critical alerts.</p>
         */
        @NameInMap("Critical")
        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholdsCritical critical;

        /**
         * <p>The expected threshold setting.</p>
         */
        @NameInMap("Expected")
        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholdsExpected expected;

        /**
         * <p>The threshold settings for normal alerts.</p>
         */
        @NameInMap("Warned")
        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholdsWarned warned;

        public static ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholds build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholds self = new ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholds();
            return TeaModel.build(map, self);
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholds setCritical(ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholdsCritical critical) {
            this.critical = critical;
            return this;
        }
        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholdsCritical getCritical() {
            return this.critical;
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholds setExpected(ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholdsExpected expected) {
            this.expected = expected;
            return this;
        }
        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholdsExpected getExpected() {
            return this.expected;
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholds setWarned(ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholdsWarned warned) {
            this.warned = warned;
            return this;
        }
        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholdsWarned getWarned() {
            return this.warned;
        }

    }

    public static class ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfig extends TeaModel {
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
        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholds thresholds;

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

        public static ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfig build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfig self = new ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfig();
            return TeaModel.build(map, self);
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfig setReferencedSamplesFilter(String referencedSamplesFilter) {
            this.referencedSamplesFilter = referencedSamplesFilter;
            return this;
        }
        public String getReferencedSamplesFilter() {
            return this.referencedSamplesFilter;
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfig setThresholds(ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholds thresholds) {
            this.thresholds = thresholds;
            return this;
        }
        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholds getThresholds() {
            return this.thresholds;
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesErrorHandlers extends TeaModel {
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

        public static ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesErrorHandlers build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesErrorHandlers self = new ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesErrorHandlers();
            return TeaModel.build(map, self);
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesErrorHandlers setErrorDataFilter(String errorDataFilter) {
            this.errorDataFilter = errorDataFilter;
            return this;
        }
        public String getErrorDataFilter() {
            return this.errorDataFilter;
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesErrorHandlers setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesSamplingConfig extends TeaModel {
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

        public static ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesSamplingConfig build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesSamplingConfig self = new ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesSamplingConfig();
            return TeaModel.build(map, self);
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesSamplingConfig setMetric(String metric) {
            this.metric = metric;
            return this;
        }
        public String getMetric() {
            return this.metric;
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesSamplingConfig setMetricParameters(String metricParameters) {
            this.metricParameters = metricParameters;
            return this;
        }
        public String getMetricParameters() {
            return this.metricParameters;
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesSamplingConfig setSamplingFilter(String samplingFilter) {
            this.samplingFilter = samplingFilter;
            return this;
        }
        public String getSamplingFilter() {
            return this.samplingFilter;
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesSamplingConfig setSettingConfig(String settingConfig) {
            this.settingConfig = settingConfig;
            return this;
        }
        public String getSettingConfig() {
            return this.settingConfig;
        }

    }

    public static class ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesTarget extends TeaModel {
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

        public static ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesTarget build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesTarget self = new ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesTarget();
            return TeaModel.build(map, self);
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesTarget setDatabaseType(String databaseType) {
            this.databaseType = databaseType;
            return this;
        }
        public String getDatabaseType() {
            return this.databaseType;
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesTarget setPartitionSpec(String partitionSpec) {
            this.partitionSpec = partitionSpec;
            return this;
        }
        public String getPartitionSpec() {
            return this.partitionSpec;
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesTarget setTableGuid(String tableGuid) {
            this.tableGuid = tableGuid;
            return this;
        }
        public String getTableGuid() {
            return this.tableGuid;
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesTarget setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListDataQualityRulesResponseBodyPagingInfoDataQualityRules extends TeaModel {
        /**
         * <p>The check settings for sample data.</p>
         */
        @NameInMap("CheckingConfig")
        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfig checkingConfig;

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
        public java.util.List<ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesErrorHandlers> errorHandlers;

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>22130</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The rule name.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The DataWorks workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>100001</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The settings for sampling.</p>
         */
        @NameInMap("SamplingConfig")
        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesSamplingConfig samplingConfig;

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
        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesTarget target;

        /**
         * <p>The ID of the template used by the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>system::user_defined</p>
         */
        @NameInMap("TemplateCode")
        public String templateCode;

        /**
         * <p>The ID of the DataWorks tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>100001</p>
         */
        @NameInMap("TenantId")
        public Long tenantId;

        public static ListDataQualityRulesResponseBodyPagingInfoDataQualityRules build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityRulesResponseBodyPagingInfoDataQualityRules self = new ListDataQualityRulesResponseBodyPagingInfoDataQualityRules();
            return TeaModel.build(map, self);
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRules setCheckingConfig(ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfig checkingConfig) {
            this.checkingConfig = checkingConfig;
            return this;
        }
        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfig getCheckingConfig() {
            return this.checkingConfig;
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRules setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRules setErrorHandlers(java.util.List<ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesErrorHandlers> errorHandlers) {
            this.errorHandlers = errorHandlers;
            return this;
        }
        public java.util.List<ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesErrorHandlers> getErrorHandlers() {
            return this.errorHandlers;
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRules setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRules setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRules setSamplingConfig(ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesSamplingConfig samplingConfig) {
            this.samplingConfig = samplingConfig;
            return this;
        }
        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesSamplingConfig getSamplingConfig() {
            return this.samplingConfig;
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRules setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRules setTarget(ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesTarget target) {
            this.target = target;
            return this;
        }
        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesTarget getTarget() {
            return this.target;
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRules setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRules setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

    }

    public static class ListDataQualityRulesResponseBodyPagingInfo extends TeaModel {
        /**
         * <p>The rules.</p>
         */
        @NameInMap("DataQualityRules")
        public java.util.List<ListDataQualityRulesResponseBodyPagingInfoDataQualityRules> dataQualityRules;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>294</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListDataQualityRulesResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityRulesResponseBodyPagingInfo self = new ListDataQualityRulesResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListDataQualityRulesResponseBodyPagingInfo setDataQualityRules(java.util.List<ListDataQualityRulesResponseBodyPagingInfoDataQualityRules> dataQualityRules) {
            this.dataQualityRules = dataQualityRules;
            return this;
        }
        public java.util.List<ListDataQualityRulesResponseBodyPagingInfoDataQualityRules> getDataQualityRules() {
            return this.dataQualityRules;
        }

        public ListDataQualityRulesResponseBodyPagingInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListDataQualityRulesResponseBodyPagingInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListDataQualityRulesResponseBodyPagingInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
