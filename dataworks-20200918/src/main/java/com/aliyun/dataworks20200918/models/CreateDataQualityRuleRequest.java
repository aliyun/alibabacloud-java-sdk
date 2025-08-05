// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class CreateDataQualityRuleRequest extends TeaModel {
    @NameInMap("CheckingConfig")
    public CreateDataQualityRuleRequestCheckingConfig checkingConfig;

    @NameInMap("Description")
    public String description;

    @NameInMap("Enabled")
    public Boolean enabled;

    @NameInMap("ErrorHandlers")
    public java.util.List<CreateDataQualityRuleRequestErrorHandlers> errorHandlers;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("SamplingConfig")
    public CreateDataQualityRuleRequestSamplingConfig samplingConfig;

    @NameInMap("Severity")
    public String severity;

    @NameInMap("Target")
    public CreateDataQualityRuleRequestTarget target;

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
        @NameInMap("Expression")
        public String expression;

        @NameInMap("Operator")
        public String operator;

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
        @NameInMap("Expression")
        public String expression;

        @NameInMap("Operator")
        public String operator;

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
        @NameInMap("Expression")
        public String expression;

        @NameInMap("Operator")
        public String operator;

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
        @NameInMap("Critical")
        public CreateDataQualityRuleRequestCheckingConfigThresholdsCritical critical;

        @NameInMap("Expected")
        public CreateDataQualityRuleRequestCheckingConfigThresholdsExpected expected;

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
        @NameInMap("ReferencedSamplesFilter")
        public String referencedSamplesFilter;

        @NameInMap("Thresholds")
        public CreateDataQualityRuleRequestCheckingConfigThresholds thresholds;

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
        @NameInMap("ErrorDataFilter")
        public String errorDataFilter;

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
        @NameInMap("Metric")
        public String metric;

        @NameInMap("MetricParameters")
        public String metricParameters;

        @NameInMap("SamplingFilter")
        public String samplingFilter;

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
        @NameInMap("DatabaseType")
        public String databaseType;

        @NameInMap("PartitionSpec")
        public String partitionSpec;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("TableGuid")
        public String tableGuid;

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
