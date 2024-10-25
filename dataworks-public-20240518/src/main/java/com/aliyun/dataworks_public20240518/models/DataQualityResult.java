// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DataQualityResult extends TeaModel {
    @NameInMap("Details")
    public java.util.List<DataQualityResultDetails> details;

    /**
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("Id")
    public Long id;

    @NameInMap("Rule")
    public DataQualityResultRule rule;

    /**
     * <strong>example:</strong>
     * <p>[   {     &quot;gender&quot;: &quot;male&quot;,     &quot;_count&quot;: 100   }, {     &quot;gender&quot;: &quot;female&quot;,     &quot;_count&quot;: 100   } ]</p>
     */
    @NameInMap("Sample")
    public String sample;

    /**
     * <strong>example:</strong>
     * <p>Passed</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>20001</p>
     */
    @NameInMap("TaskInstanceId")
    public Long taskInstanceId;

    public static DataQualityResult build(java.util.Map<String, ?> map) throws Exception {
        DataQualityResult self = new DataQualityResult();
        return TeaModel.build(map, self);
    }

    public DataQualityResult setDetails(java.util.List<DataQualityResultDetails> details) {
        this.details = details;
        return this;
    }
    public java.util.List<DataQualityResultDetails> getDetails() {
        return this.details;
    }

    public DataQualityResult setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DataQualityResult setRule(DataQualityResultRule rule) {
        this.rule = rule;
        return this;
    }
    public DataQualityResultRule getRule() {
        return this.rule;
    }

    public DataQualityResult setSample(String sample) {
        this.sample = sample;
        return this;
    }
    public String getSample() {
        return this.sample;
    }

    public DataQualityResult setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DataQualityResult setTaskInstanceId(Long taskInstanceId) {
        this.taskInstanceId = taskInstanceId;
        return this;
    }
    public Long getTaskInstanceId() {
        return this.taskInstanceId;
    }

    public static class DataQualityResultDetails extends TeaModel {
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
         * <strong>example:</strong>
         * <p>Passed</p>
         */
        @NameInMap("Status")
        public String status;

        public static DataQualityResultDetails build(java.util.Map<String, ?> map) throws Exception {
            DataQualityResultDetails self = new DataQualityResultDetails();
            return TeaModel.build(map, self);
        }

        public DataQualityResultDetails setCheckedValue(String checkedValue) {
            this.checkedValue = checkedValue;
            return this;
        }
        public String getCheckedValue() {
            return this.checkedValue;
        }

        public DataQualityResultDetails setReferencedValue(String referencedValue) {
            this.referencedValue = referencedValue;
            return this;
        }
        public String getReferencedValue() {
            return this.referencedValue;
        }

        public DataQualityResultDetails setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DataQualityResultRuleCheckingConfigThresholdsCritical extends TeaModel {
        /**
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

        public static DataQualityResultRuleCheckingConfigThresholdsCritical build(java.util.Map<String, ?> map) throws Exception {
            DataQualityResultRuleCheckingConfigThresholdsCritical self = new DataQualityResultRuleCheckingConfigThresholdsCritical();
            return TeaModel.build(map, self);
        }

        public DataQualityResultRuleCheckingConfigThresholdsCritical setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public DataQualityResultRuleCheckingConfigThresholdsCritical setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DataQualityResultRuleCheckingConfigThresholdsExpected extends TeaModel {
        /**
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

        public static DataQualityResultRuleCheckingConfigThresholdsExpected build(java.util.Map<String, ?> map) throws Exception {
            DataQualityResultRuleCheckingConfigThresholdsExpected self = new DataQualityResultRuleCheckingConfigThresholdsExpected();
            return TeaModel.build(map, self);
        }

        public DataQualityResultRuleCheckingConfigThresholdsExpected setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public DataQualityResultRuleCheckingConfigThresholdsExpected setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DataQualityResultRuleCheckingConfigThresholdsWarned extends TeaModel {
        /**
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

        public static DataQualityResultRuleCheckingConfigThresholdsWarned build(java.util.Map<String, ?> map) throws Exception {
            DataQualityResultRuleCheckingConfigThresholdsWarned self = new DataQualityResultRuleCheckingConfigThresholdsWarned();
            return TeaModel.build(map, self);
        }

        public DataQualityResultRuleCheckingConfigThresholdsWarned setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public DataQualityResultRuleCheckingConfigThresholdsWarned setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DataQualityResultRuleCheckingConfigThresholds extends TeaModel {
        @NameInMap("Critical")
        public DataQualityResultRuleCheckingConfigThresholdsCritical critical;

        @NameInMap("Expected")
        public DataQualityResultRuleCheckingConfigThresholdsExpected expected;

        @NameInMap("Warned")
        public DataQualityResultRuleCheckingConfigThresholdsWarned warned;

        public static DataQualityResultRuleCheckingConfigThresholds build(java.util.Map<String, ?> map) throws Exception {
            DataQualityResultRuleCheckingConfigThresholds self = new DataQualityResultRuleCheckingConfigThresholds();
            return TeaModel.build(map, self);
        }

        public DataQualityResultRuleCheckingConfigThresholds setCritical(DataQualityResultRuleCheckingConfigThresholdsCritical critical) {
            this.critical = critical;
            return this;
        }
        public DataQualityResultRuleCheckingConfigThresholdsCritical getCritical() {
            return this.critical;
        }

        public DataQualityResultRuleCheckingConfigThresholds setExpected(DataQualityResultRuleCheckingConfigThresholdsExpected expected) {
            this.expected = expected;
            return this;
        }
        public DataQualityResultRuleCheckingConfigThresholdsExpected getExpected() {
            return this.expected;
        }

        public DataQualityResultRuleCheckingConfigThresholds setWarned(DataQualityResultRuleCheckingConfigThresholdsWarned warned) {
            this.warned = warned;
            return this;
        }
        public DataQualityResultRuleCheckingConfigThresholdsWarned getWarned() {
            return this.warned;
        }

    }

    public static class DataQualityResultRuleCheckingConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{ &quot;bizdate&quot;: [ &quot;-1&quot;, &quot;-7&quot;, &quot;-1m&quot; ] }</p>
         */
        @NameInMap("ReferencedSamplesFilter")
        public String referencedSamplesFilter;

        @NameInMap("Thresholds")
        public DataQualityResultRuleCheckingConfigThresholds thresholds;

        /**
         * <strong>example:</strong>
         * <p>Fixed</p>
         */
        @NameInMap("Type")
        public String type;

        public static DataQualityResultRuleCheckingConfig build(java.util.Map<String, ?> map) throws Exception {
            DataQualityResultRuleCheckingConfig self = new DataQualityResultRuleCheckingConfig();
            return TeaModel.build(map, self);
        }

        public DataQualityResultRuleCheckingConfig setReferencedSamplesFilter(String referencedSamplesFilter) {
            this.referencedSamplesFilter = referencedSamplesFilter;
            return this;
        }
        public String getReferencedSamplesFilter() {
            return this.referencedSamplesFilter;
        }

        public DataQualityResultRuleCheckingConfig setThresholds(DataQualityResultRuleCheckingConfigThresholds thresholds) {
            this.thresholds = thresholds;
            return this;
        }
        public DataQualityResultRuleCheckingConfigThresholds getThresholds() {
            return this.thresholds;
        }

        public DataQualityResultRuleCheckingConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DataQualityResultRuleErrorHandlers extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>SELECT * FROM tb_api_log WHERE id IS NULL</p>
         */
        @NameInMap("ErrorDataFilter")
        public String errorDataFilter;

        /**
         * <strong>example:</strong>
         * <p>SaveErrorData</p>
         */
        @NameInMap("Type")
        public String type;

        public static DataQualityResultRuleErrorHandlers build(java.util.Map<String, ?> map) throws Exception {
            DataQualityResultRuleErrorHandlers self = new DataQualityResultRuleErrorHandlers();
            return TeaModel.build(map, self);
        }

        public DataQualityResultRuleErrorHandlers setErrorDataFilter(String errorDataFilter) {
            this.errorDataFilter = errorDataFilter;
            return this;
        }
        public String getErrorDataFilter() {
            return this.errorDataFilter;
        }

        public DataQualityResultRuleErrorHandlers setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DataQualityResultRuleSamplingConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Min</p>
         */
        @NameInMap("Metric")
        public String metric;

        /**
         * <strong>example:</strong>
         * <p>{ &quot;Columns&quot;: [ &quot;id&quot;, &quot;name&quot; ] }</p>
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

        public static DataQualityResultRuleSamplingConfig build(java.util.Map<String, ?> map) throws Exception {
            DataQualityResultRuleSamplingConfig self = new DataQualityResultRuleSamplingConfig();
            return TeaModel.build(map, self);
        }

        public DataQualityResultRuleSamplingConfig setMetric(String metric) {
            this.metric = metric;
            return this;
        }
        public String getMetric() {
            return this.metric;
        }

        public DataQualityResultRuleSamplingConfig setMetricParameters(String metricParameters) {
            this.metricParameters = metricParameters;
            return this;
        }
        public String getMetricParameters() {
            return this.metricParameters;
        }

        public DataQualityResultRuleSamplingConfig setSamplingFilter(String samplingFilter) {
            this.samplingFilter = samplingFilter;
            return this;
        }
        public String getSamplingFilter() {
            return this.samplingFilter;
        }

        public DataQualityResultRuleSamplingConfig setSettingConfig(String settingConfig) {
            this.settingConfig = settingConfig;
            return this;
        }
        public String getSettingConfig() {
            return this.settingConfig;
        }

    }

    public static class DataQualityResultRuleTarget extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>maxcompute</p>
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
         * <strong>example:</strong>
         * <p>Table</p>
         */
        @NameInMap("Type")
        public String type;

        public static DataQualityResultRuleTarget build(java.util.Map<String, ?> map) throws Exception {
            DataQualityResultRuleTarget self = new DataQualityResultRuleTarget();
            return TeaModel.build(map, self);
        }

        public DataQualityResultRuleTarget setDatabaseType(String databaseType) {
            this.databaseType = databaseType;
            return this;
        }
        public String getDatabaseType() {
            return this.databaseType;
        }

        public DataQualityResultRuleTarget setPartitionSpec(String partitionSpec) {
            this.partitionSpec = partitionSpec;
            return this;
        }
        public String getPartitionSpec() {
            return this.partitionSpec;
        }

        public DataQualityResultRuleTarget setTableGuid(String tableGuid) {
            this.tableGuid = tableGuid;
            return this;
        }
        public String getTableGuid() {
            return this.tableGuid;
        }

        public DataQualityResultRuleTarget setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DataQualityResultRule extends TeaModel {
        @NameInMap("CheckingConfig")
        public DataQualityResultRuleCheckingConfig checkingConfig;

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

        @NameInMap("ErrorHandlers")
        public java.util.List<DataQualityResultRuleErrorHandlers> errorHandlers;

        /**
         * <strong>example:</strong>
         * <p>100001</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>表不能为空</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("SamplingConfig")
        public DataQualityResultRuleSamplingConfig samplingConfig;

        /**
         * <strong>example:</strong>
         * <p>High</p>
         */
        @NameInMap("Severity")
        public String severity;

        @NameInMap("Target")
        public DataQualityResultRuleTarget target;

        /**
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

        public static DataQualityResultRule build(java.util.Map<String, ?> map) throws Exception {
            DataQualityResultRule self = new DataQualityResultRule();
            return TeaModel.build(map, self);
        }

        public DataQualityResultRule setCheckingConfig(DataQualityResultRuleCheckingConfig checkingConfig) {
            this.checkingConfig = checkingConfig;
            return this;
        }
        public DataQualityResultRuleCheckingConfig getCheckingConfig() {
            return this.checkingConfig;
        }

        public DataQualityResultRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DataQualityResultRule setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public DataQualityResultRule setErrorHandlers(java.util.List<DataQualityResultRuleErrorHandlers> errorHandlers) {
            this.errorHandlers = errorHandlers;
            return this;
        }
        public java.util.List<DataQualityResultRuleErrorHandlers> getErrorHandlers() {
            return this.errorHandlers;
        }

        public DataQualityResultRule setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DataQualityResultRule setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DataQualityResultRule setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public DataQualityResultRule setSamplingConfig(DataQualityResultRuleSamplingConfig samplingConfig) {
            this.samplingConfig = samplingConfig;
            return this;
        }
        public DataQualityResultRuleSamplingConfig getSamplingConfig() {
            return this.samplingConfig;
        }

        public DataQualityResultRule setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public DataQualityResultRule setTarget(DataQualityResultRuleTarget target) {
            this.target = target;
            return this;
        }
        public DataQualityResultRuleTarget getTarget() {
            return this.target;
        }

        public DataQualityResultRule setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public DataQualityResultRule setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

    }

}
