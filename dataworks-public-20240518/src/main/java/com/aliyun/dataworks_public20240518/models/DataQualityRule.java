// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DataQualityRule extends TeaModel {
    @NameInMap("CheckingConfig")
    public DataQualityRuleCheckingConfig checkingConfig;

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
    public java.util.List<DataQualityRuleErrorHandlers> errorHandlers;

    /**
     * <strong>example:</strong>
     * <p>1</p>
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
    public DataQualityRuleSamplingConfig samplingConfig;

    /**
     * <strong>example:</strong>
     * <p>High</p>
     */
    @NameInMap("Severity")
    public String severity;

    @NameInMap("Target")
    public DataQualityRuleTarget target;

    /**
     * <strong>example:</strong>
     * <p>SYSTEM:user_defined_sql</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

    /**
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

        public static DataQualityRuleCheckingConfigThresholdsCritical build(java.util.Map<String, ?> map) throws Exception {
            DataQualityRuleCheckingConfigThresholdsCritical self = new DataQualityRuleCheckingConfigThresholdsCritical();
            return TeaModel.build(map, self);
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

        public static DataQualityRuleCheckingConfigThresholdsExpected build(java.util.Map<String, ?> map) throws Exception {
            DataQualityRuleCheckingConfigThresholdsExpected self = new DataQualityRuleCheckingConfigThresholdsExpected();
            return TeaModel.build(map, self);
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

        public static DataQualityRuleCheckingConfigThresholdsWarned build(java.util.Map<String, ?> map) throws Exception {
            DataQualityRuleCheckingConfigThresholdsWarned self = new DataQualityRuleCheckingConfigThresholdsWarned();
            return TeaModel.build(map, self);
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
        @NameInMap("Critical")
        public DataQualityRuleCheckingConfigThresholdsCritical critical;

        @NameInMap("Expected")
        public DataQualityRuleCheckingConfigThresholdsExpected expected;

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
         * <strong>example:</strong>
         * <p>{ &quot;bizdate&quot;: [ &quot;-1&quot;, &quot;-7&quot;, &quot;-1m&quot; ] }</p>
         */
        @NameInMap("ReferencedSamplesFilter")
        public String referencedSamplesFilter;

        @NameInMap("Thresholds")
        public DataQualityRuleCheckingConfigThresholds thresholds;

        /**
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
