// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class GetDataQualityRuleResponseBody extends TeaModel {
    @NameInMap("DataQualityRule")
    public GetDataQualityRuleResponseBodyDataQualityRule dataQualityRule;

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
        @NameInMap("Expression")
        public String expression;

        @NameInMap("Operator")
        public String operator;

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
        @NameInMap("Expression")
        public String expression;

        @NameInMap("Operator")
        public String operator;

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
        @NameInMap("Expression")
        public String expression;

        @NameInMap("Operator")
        public String operator;

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
        @NameInMap("Critical")
        public GetDataQualityRuleResponseBodyDataQualityRuleCheckingConfigThresholdsCritical critical;

        @NameInMap("Expected")
        public GetDataQualityRuleResponseBodyDataQualityRuleCheckingConfigThresholdsExpected expected;

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
        @NameInMap("ReferencedSamplesFilter")
        public String referencedSamplesFilter;

        @NameInMap("Thresholds")
        public GetDataQualityRuleResponseBodyDataQualityRuleCheckingConfigThresholds thresholds;

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
        @NameInMap("ErrorDataFilter")
        public String errorDataFilter;

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
        @NameInMap("Metric")
        public String metric;

        @NameInMap("MetricParameters")
        public String metricParameters;

        @NameInMap("SamplingFilter")
        public String samplingFilter;

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
        @NameInMap("DatabaseType")
        public String databaseType;

        @NameInMap("PartitionSpec")
        public String partitionSpec;

        @NameInMap("TableGuid")
        public String tableGuid;

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
        @NameInMap("CheckingConfig")
        public GetDataQualityRuleResponseBodyDataQualityRuleCheckingConfig checkingConfig;

        @NameInMap("Description")
        public String description;

        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("ErrorHandlers")
        public java.util.List<GetDataQualityRuleResponseBodyDataQualityRuleErrorHandlers> errorHandlers;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("SamplingConfig")
        public GetDataQualityRuleResponseBodyDataQualityRuleSamplingConfig samplingConfig;

        @NameInMap("Severity")
        public String severity;

        @NameInMap("Target")
        public GetDataQualityRuleResponseBodyDataQualityRuleTarget target;

        @NameInMap("TemplateCode")
        public String templateCode;

        @NameInMap("TenantId")
        public Long tenantId;

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

        public GetDataQualityRuleResponseBodyDataQualityRule setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

    }

}
