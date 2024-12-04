// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDataQualityResultsResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PagingInfo")
    public ListDataQualityResultsResponseBodyPagingInfo pagingInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>691CA452-D37A-4ED0-9441</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListDataQualityResultsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataQualityResultsResponseBody self = new ListDataQualityResultsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataQualityResultsResponseBody setPagingInfo(ListDataQualityResultsResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListDataQualityResultsResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListDataQualityResultsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsDetails extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100.0</p>
         */
        @NameInMap("CheckedValue")
        public String checkedValue;

        /**
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("ReferencedValue")
        public String referencedValue;

        /**
         * <p>The comparison result between the value of CheckedValue and the threshold. Valid values:</p>
         * <ul>
         * <li>Error</li>
         * <li>Passed</li>
         * <li>Warned</li>
         * <li>Critical</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PASSED</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsDetails build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsDetails self = new ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsDetails();
            return TeaModel.build(map, self);
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsDetails setCheckedValue(String checkedValue) {
            this.checkedValue = checkedValue;
            return this;
        }
        public String getCheckedValue() {
            return this.checkedValue;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsDetails setReferencedValue(String referencedValue) {
            this.referencedValue = referencedValue;
            return this;
        }
        public String getReferencedValue() {
            return this.referencedValue;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsDetails setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsCritical extends TeaModel {
        /**
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
         * <strong>example:</strong>
         * <p>100.0</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsCritical build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsCritical self = new ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsCritical();
            return TeaModel.build(map, self);
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsCritical setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsCritical setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsExpected extends TeaModel {
        /**
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
         * <strong>example:</strong>
         * <p>100.0</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsExpected build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsExpected self = new ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsExpected();
            return TeaModel.build(map, self);
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsExpected setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsExpected setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsWarned extends TeaModel {
        /**
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
         * <strong>example:</strong>
         * <p>100.0</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsWarned build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsWarned self = new ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsWarned();
            return TeaModel.build(map, self);
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsWarned setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsWarned setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholds extends TeaModel {
        @NameInMap("Critical")
        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsCritical critical;

        @NameInMap("Expected")
        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsExpected expected;

        @NameInMap("Warned")
        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsWarned warned;

        public static ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholds build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholds self = new ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholds();
            return TeaModel.build(map, self);
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholds setCritical(ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsCritical critical) {
            this.critical = critical;
            return this;
        }
        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsCritical getCritical() {
            return this.critical;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholds setExpected(ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsExpected expected) {
            this.expected = expected;
            return this;
        }
        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsExpected getExpected() {
            return this.expected;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholds setWarned(ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsWarned warned) {
            this.warned = warned;
            return this;
        }
        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsWarned getWarned() {
            return this.warned;
        }

    }

    public static class ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{ &quot;bizdate&quot;: [ &quot;-1&quot;, &quot;-7&quot;, &quot;-1m&quot; ] }</p>
         */
        @NameInMap("ReferencedSamplesFilter")
        public String referencedSamplesFilter;

        @NameInMap("Thresholds")
        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholds thresholds;

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
         * <p>FIXED</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfig build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfig self = new ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfig();
            return TeaModel.build(map, self);
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfig setReferencedSamplesFilter(String referencedSamplesFilter) {
            this.referencedSamplesFilter = referencedSamplesFilter;
            return this;
        }
        public String getReferencedSamplesFilter() {
            return this.referencedSamplesFilter;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfig setThresholds(ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholds thresholds) {
            this.thresholds = thresholds;
            return this;
        }
        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholds getThresholds() {
            return this.thresholds;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleErrorHandlers extends TeaModel {
        /**
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
         * <p>SAVE_ERROR_DATA</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleErrorHandlers build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleErrorHandlers self = new ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleErrorHandlers();
            return TeaModel.build(map, self);
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleErrorHandlers setErrorDataFilter(String errorDataFilter) {
            this.errorDataFilter = errorDataFilter;
            return this;
        }
        public String getErrorDataFilter() {
            return this.errorDataFilter;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleErrorHandlers setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleSamplingConfig extends TeaModel {
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
         * <p>COUNT</p>
         */
        @NameInMap("Metric")
        public String metric;

        /**
         * <strong>example:</strong>
         * <p>{ &quot;columns&quot;: [ &quot;id&quot;, &quot;name&quot; ] }</p>
         */
        @NameInMap("MetricParameters")
        public String metricParameters;

        /**
         * <strong>example:</strong>
         * <p>id IS NULL</p>
         */
        @NameInMap("SamplingFilter")
        public String samplingFilter;

        /**
         * <strong>example:</strong>
         * <p>SET odps.sql.udf.timeout=600s;</p>
         */
        @NameInMap("SettingConfig")
        public String settingConfig;

        public static ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleSamplingConfig build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleSamplingConfig self = new ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleSamplingConfig();
            return TeaModel.build(map, self);
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleSamplingConfig setMetric(String metric) {
            this.metric = metric;
            return this;
        }
        public String getMetric() {
            return this.metric;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleSamplingConfig setMetricParameters(String metricParameters) {
            this.metricParameters = metricParameters;
            return this;
        }
        public String getMetricParameters() {
            return this.metricParameters;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleSamplingConfig setSamplingFilter(String samplingFilter) {
            this.samplingFilter = samplingFilter;
            return this;
        }
        public String getSamplingFilter() {
            return this.samplingFilter;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleSamplingConfig setSettingConfig(String settingConfig) {
            this.settingConfig = settingConfig;
            return this;
        }
        public String getSettingConfig() {
            return this.settingConfig;
        }

    }

    public static class ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleTarget extends TeaModel {
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
         * <p>MAX_COMPUTE</p>
         */
        @NameInMap("DatabaseType")
        public String databaseType;

        /**
         * <strong>example:</strong>
         * <p>ds=$[yyyymmdd-1]</p>
         */
        @NameInMap("PartitionSpec")
        public String partitionSpec;

        /**
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
         * <p>TABLE</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleTarget build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleTarget self = new ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleTarget();
            return TeaModel.build(map, self);
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleTarget setDatabaseType(String databaseType) {
            this.databaseType = databaseType;
            return this;
        }
        public String getDatabaseType() {
            return this.databaseType;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleTarget setPartitionSpec(String partitionSpec) {
            this.partitionSpec = partitionSpec;
            return this;
        }
        public String getPartitionSpec() {
            return this.partitionSpec;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleTarget setTableGuid(String tableGuid) {
            this.tableGuid = tableGuid;
            return this;
        }
        public String getTableGuid() {
            return this.tableGuid;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleTarget setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRule extends TeaModel {
        /**
         * <p>The check settings for sample data.</p>
         */
        @NameInMap("CheckingConfig")
        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfig checkingConfig;

        /**
         * <strong>example:</strong>
         * <p>this is a odps _sql task</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The operations that you can perform after the rule-based check fails.</p>
         */
        @NameInMap("ErrorHandlers")
        public java.util.List<ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleErrorHandlers> errorHandlers;

        /**
         * <strong>example:</strong>
         * <p>100001</p>
         */
        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The sampling settings.</p>
         */
        @NameInMap("SamplingConfig")
        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleSamplingConfig samplingConfig;

        /**
         * <p>The strength of the rule. Valid values:</p>
         * <ul>
         * <li>High</li>
         * <li>Normal</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("Severity")
        public String severity;

        /**
         * <p>The monitored object of the rule.</p>
         */
        @NameInMap("Target")
        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleTarget target;

        /**
         * <p>The code of the template that is referenced when you create a rule.</p>
         * 
         * <strong>example:</strong>
         * <p>system::user_defined</p>
         */
        @NameInMap("TemplateCode")
        public String templateCode;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TenantId")
        public Long tenantId;

        public static ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRule build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRule self = new ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRule();
            return TeaModel.build(map, self);
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRule setCheckingConfig(ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfig checkingConfig) {
            this.checkingConfig = checkingConfig;
            return this;
        }
        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfig getCheckingConfig() {
            return this.checkingConfig;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRule setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRule setErrorHandlers(java.util.List<ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleErrorHandlers> errorHandlers) {
            this.errorHandlers = errorHandlers;
            return this;
        }
        public java.util.List<ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleErrorHandlers> getErrorHandlers() {
            return this.errorHandlers;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRule setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRule setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRule setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRule setSamplingConfig(ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleSamplingConfig samplingConfig) {
            this.samplingConfig = samplingConfig;
            return this;
        }
        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleSamplingConfig getSamplingConfig() {
            return this.samplingConfig;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRule setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRule setTarget(ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleTarget target) {
            this.target = target;
            return this;
        }
        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleTarget getTarget() {
            return this.target;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRule setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRule setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

    }

    public static class ListDataQualityResultsResponseBodyPagingInfoDataQualityResults extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1708284916414</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The check details.</p>
         */
        @NameInMap("Details")
        public java.util.List<ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsDetails> details;

        /**
         * <strong>example:</strong>
         * <p>16033</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The snapshot of the rule configuration when the check starts.</p>
         */
        @NameInMap("Rule")
        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRule rule;

        /**
         * <strong>example:</strong>
         * <p>[
         *   {
         *     &quot;gender&quot;: &quot;male&quot;,
         *     &quot;_count&quot;: 100
         *   }, {
         *     &quot;gender&quot;: &quot;female&quot;,
         *     &quot;_count&quot;: 100
         *   }
         * ]</p>
         */
        @NameInMap("Sample")
        public String sample;

        /**
         * <p>The status of the check result. Valid values:</p>
         * <ul>
         * <li>Running</li>
         * <li>Error</li>
         * <li>Passed</li>
         * <li>Warned</li>
         * <li>Critical</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PASSED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>200001</p>
         */
        @NameInMap("TaskInstanceId")
        public Long taskInstanceId;

        public static ListDataQualityResultsResponseBodyPagingInfoDataQualityResults build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityResultsResponseBodyPagingInfoDataQualityResults self = new ListDataQualityResultsResponseBodyPagingInfoDataQualityResults();
            return TeaModel.build(map, self);
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResults setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResults setDetails(java.util.List<ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsDetails> details) {
            this.details = details;
            return this;
        }
        public java.util.List<ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsDetails> getDetails() {
            return this.details;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResults setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResults setRule(ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRule rule) {
            this.rule = rule;
            return this;
        }
        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRule getRule() {
            return this.rule;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResults setSample(String sample) {
            this.sample = sample;
            return this;
        }
        public String getSample() {
            return this.sample;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResults setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResults setTaskInstanceId(Long taskInstanceId) {
            this.taskInstanceId = taskInstanceId;
            return this;
        }
        public Long getTaskInstanceId() {
            return this.taskInstanceId;
        }

    }

    public static class ListDataQualityResultsResponseBodyPagingInfo extends TeaModel {
        /**
         * <p>The data quality check results.</p>
         */
        @NameInMap("DataQualityResults")
        public java.util.List<ListDataQualityResultsResponseBodyPagingInfoDataQualityResults> dataQualityResults;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>219</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListDataQualityResultsResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityResultsResponseBodyPagingInfo self = new ListDataQualityResultsResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListDataQualityResultsResponseBodyPagingInfo setDataQualityResults(java.util.List<ListDataQualityResultsResponseBodyPagingInfoDataQualityResults> dataQualityResults) {
            this.dataQualityResults = dataQualityResults;
            return this;
        }
        public java.util.List<ListDataQualityResultsResponseBodyPagingInfoDataQualityResults> getDataQualityResults() {
            return this.dataQualityResults;
        }

        public ListDataQualityResultsResponseBodyPagingInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListDataQualityResultsResponseBodyPagingInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListDataQualityResultsResponseBodyPagingInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
