// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetDataQualityEvaluationTaskInstanceResponseBody extends TeaModel {
    /**
     * <p>The details of the data quality monitoring instance.</p>
     */
    @NameInMap("DataQualityEvaluationTaskInstance")
    public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstance dataQualityEvaluationTaskInstance;

    /**
     * <p>The request ID. Used to locate logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>8abcb91f-d266-4073-b907-2ed67****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetDataQualityEvaluationTaskInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataQualityEvaluationTaskInstanceResponseBody self = new GetDataQualityEvaluationTaskInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataQualityEvaluationTaskInstanceResponseBody setDataQualityEvaluationTaskInstance(GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstance dataQualityEvaluationTaskInstance) {
        this.dataQualityEvaluationTaskInstance = dataQualityEvaluationTaskInstance;
        return this;
    }
    public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstance getDataQualityEvaluationTaskInstance() {
        return this.dataQualityEvaluationTaskInstance;
    }

    public GetDataQualityEvaluationTaskInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsDetails extends TeaModel {
        @NameInMap("CheckedValue")
        public String checkedValue;

        @NameInMap("ReferencedValue")
        public String referencedValue;

        @NameInMap("Status")
        public String status;

        public static GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsDetails build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsDetails self = new GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsDetails();
            return TeaModel.build(map, self);
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsDetails setCheckedValue(String checkedValue) {
            this.checkedValue = checkedValue;
            return this;
        }
        public String getCheckedValue() {
            return this.checkedValue;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsDetails setReferencedValue(String referencedValue) {
            this.referencedValue = referencedValue;
            return this;
        }
        public String getReferencedValue() {
            return this.referencedValue;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsDetails setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholdsCritical extends TeaModel {
        @NameInMap("Expression")
        public String expression;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Value")
        public String value;

        public static GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholdsCritical build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholdsCritical self = new GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholdsCritical();
            return TeaModel.build(map, self);
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholdsCritical setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholdsCritical setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholdsCritical setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholdsExpected extends TeaModel {
        @NameInMap("Expression")
        public String expression;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Value")
        public String value;

        public static GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholdsExpected build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholdsExpected self = new GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholdsExpected();
            return TeaModel.build(map, self);
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholdsExpected setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholdsExpected setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholdsExpected setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholdsWarned extends TeaModel {
        @NameInMap("Expression")
        public String expression;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Value")
        public String value;

        public static GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholdsWarned build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholdsWarned self = new GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholdsWarned();
            return TeaModel.build(map, self);
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholdsWarned setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholdsWarned setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholdsWarned setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholds extends TeaModel {
        @NameInMap("Critical")
        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholdsCritical critical;

        @NameInMap("Expected")
        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholdsExpected expected;

        @NameInMap("Warned")
        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholdsWarned warned;

        public static GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholds build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholds self = new GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholds();
            return TeaModel.build(map, self);
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholds setCritical(GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholdsCritical critical) {
            this.critical = critical;
            return this;
        }
        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholdsCritical getCritical() {
            return this.critical;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholds setExpected(GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholdsExpected expected) {
            this.expected = expected;
            return this;
        }
        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholdsExpected getExpected() {
            return this.expected;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholds setWarned(GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholdsWarned warned) {
            this.warned = warned;
            return this;
        }
        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholdsWarned getWarned() {
            return this.warned;
        }

    }

    public static class GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfig extends TeaModel {
        @NameInMap("ReferencedSamplesFilter")
        public String referencedSamplesFilter;

        @NameInMap("Thresholds")
        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholds thresholds;

        @NameInMap("Type")
        public String type;

        public static GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfig build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfig self = new GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfig();
            return TeaModel.build(map, self);
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfig setReferencedSamplesFilter(String referencedSamplesFilter) {
            this.referencedSamplesFilter = referencedSamplesFilter;
            return this;
        }
        public String getReferencedSamplesFilter() {
            return this.referencedSamplesFilter;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfig setThresholds(GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholds thresholds) {
            this.thresholds = thresholds;
            return this;
        }
        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfigThresholds getThresholds() {
            return this.thresholds;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleErrorHandlers extends TeaModel {
        @NameInMap("ErrorDataFilter")
        public String errorDataFilter;

        @NameInMap("Type")
        public String type;

        public static GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleErrorHandlers build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleErrorHandlers self = new GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleErrorHandlers();
            return TeaModel.build(map, self);
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleErrorHandlers setErrorDataFilter(String errorDataFilter) {
            this.errorDataFilter = errorDataFilter;
            return this;
        }
        public String getErrorDataFilter() {
            return this.errorDataFilter;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleErrorHandlers setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleSamplingConfig extends TeaModel {
        @NameInMap("Metric")
        public String metric;

        @NameInMap("MetricParameters")
        public String metricParameters;

        @NameInMap("SamplingFilter")
        public String samplingFilter;

        @NameInMap("SettingConfig")
        public String settingConfig;

        public static GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleSamplingConfig build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleSamplingConfig self = new GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleSamplingConfig();
            return TeaModel.build(map, self);
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleSamplingConfig setMetric(String metric) {
            this.metric = metric;
            return this;
        }
        public String getMetric() {
            return this.metric;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleSamplingConfig setMetricParameters(String metricParameters) {
            this.metricParameters = metricParameters;
            return this;
        }
        public String getMetricParameters() {
            return this.metricParameters;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleSamplingConfig setSamplingFilter(String samplingFilter) {
            this.samplingFilter = samplingFilter;
            return this;
        }
        public String getSamplingFilter() {
            return this.samplingFilter;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleSamplingConfig setSettingConfig(String settingConfig) {
            this.settingConfig = settingConfig;
            return this;
        }
        public String getSettingConfig() {
            return this.settingConfig;
        }

    }

    public static class GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleTarget extends TeaModel {
        @NameInMap("DatabaseType")
        public String databaseType;

        @NameInMap("TableGuid")
        public String tableGuid;

        @NameInMap("Type")
        public String type;

        public static GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleTarget build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleTarget self = new GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleTarget();
            return TeaModel.build(map, self);
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleTarget setDatabaseType(String databaseType) {
            this.databaseType = databaseType;
            return this;
        }
        public String getDatabaseType() {
            return this.databaseType;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleTarget setTableGuid(String tableGuid) {
            this.tableGuid = tableGuid;
            return this;
        }
        public String getTableGuid() {
            return this.tableGuid;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleTarget setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRule extends TeaModel {
        @NameInMap("CheckingConfig")
        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfig checkingConfig;

        @NameInMap("Description")
        public String description;

        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("ErrorHandlers")
        public java.util.List<GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleErrorHandlers> errorHandlers;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("SamplingConfig")
        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleSamplingConfig samplingConfig;

        @NameInMap("Severity")
        public String severity;

        @NameInMap("Target")
        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleTarget target;

        @NameInMap("TemplateCode")
        public String templateCode;

        public static GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRule build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRule self = new GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRule();
            return TeaModel.build(map, self);
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRule setCheckingConfig(GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfig checkingConfig) {
            this.checkingConfig = checkingConfig;
            return this;
        }
        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleCheckingConfig getCheckingConfig() {
            return this.checkingConfig;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRule setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRule setErrorHandlers(java.util.List<GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleErrorHandlers> errorHandlers) {
            this.errorHandlers = errorHandlers;
            return this;
        }
        public java.util.List<GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleErrorHandlers> getErrorHandlers() {
            return this.errorHandlers;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRule setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRule setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRule setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRule setSamplingConfig(GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleSamplingConfig samplingConfig) {
            this.samplingConfig = samplingConfig;
            return this;
        }
        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleSamplingConfig getSamplingConfig() {
            return this.samplingConfig;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRule setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRule setTarget(GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleTarget target) {
            this.target = target;
            return this;
        }
        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRuleTarget getTarget() {
            return this.target;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRule setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

    }

    public static class GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResults extends TeaModel {
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Details")
        public java.util.List<GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsDetails> details;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Rule")
        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRule rule;

        @NameInMap("Sample")
        public String sample;

        @NameInMap("Status")
        public String status;

        @NameInMap("TaskInstanceId")
        public Long taskInstanceId;

        public static GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResults build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResults self = new GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResults();
            return TeaModel.build(map, self);
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResults setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResults setDetails(java.util.List<GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsDetails> details) {
            this.details = details;
            return this;
        }
        public java.util.List<GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsDetails> getDetails() {
            return this.details;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResults setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResults setRule(GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRule rule) {
            this.rule = rule;
            return this;
        }
        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResultsRule getRule() {
            return this.rule;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResults setSample(String sample) {
            this.sample = sample;
            return this;
        }
        public String getSample() {
            return this.sample;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResults setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResults setTaskInstanceId(Long taskInstanceId) {
            this.taskInstanceId = taskInstanceId;
            return this;
        }
        public Long getTaskInstanceId() {
            return this.taskInstanceId;
        }

    }

    public static class GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskHooks extends TeaModel {
        /**
         * <p>The cause that triggers the hook action. When this condition is met, the hook action is triggered. Only two types of conditional expressions are supported:</p>
         * <ul>
         * <li>Specify a single combination of rule severity and rule check status. For example, <code>${severity} == &quot;High&quot; AND ${status} == &quot;Critical&quot;</code> means that the condition is met if any rule with a severity of High has a check result of Critical.</li>
         * <li>Specify multiple combinations of rule severity and rule check status. For example, <code>(${severity} == &quot;High&quot; AND ${status} == &quot;Critical&quot;) OR (${severity} == &quot;Normal&quot; AND ${status} == &quot;Critical&quot;) OR (${severity} == &quot;Normal&quot; AND ${status} == &quot;Error&quot;)</code> means that the condition is met if any rule with a severity of High has a check result of Critical, or any rule with a severity of Normal has a check result of Critical, or any rule with a severity of Normal has a check result of Error. The severity enumeration values in the conditional expression are consistent with the severity enumeration values in DataQualityRule, and the status enumeration values are consistent with the status values in DataQualityResult.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>(${severity} == &quot;High&quot; AND ${status} == &quot;Critical&quot;) OR (${severity} == &quot;Normal&quot; AND ${status} == &quot;Critical&quot;) OR (${severity} == &quot;Normal&quot; AND ${status} == &quot;Error&quot;)</p>
         */
        @NameInMap("Condition")
        public String condition;

        /**
         * <p>The hook type. Only one type is supported:</p>
         * <ul>
         * <li>BlockTaskInstance: Blocks the scheduling node from continuing to run. If the data quality monitoring task is triggered by a scheduling node, after the data quality monitoring task is completed, the system determines whether to block the scheduling node from continuing to run based on Hook.Condition.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BlockTaskInstance</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskHooks build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskHooks self = new GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskHooks();
            return TeaModel.build(map, self);
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskHooks setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskHooks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationChannels extends TeaModel {
        /**
         * <p>The notification channels.</p>
         */
        @NameInMap("Channels")
        public java.util.List<String> channels;

        public static GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationChannels build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationChannels self = new GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationChannels();
            return TeaModel.build(map, self);
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationChannels setChannels(java.util.List<String> channels) {
            this.channels = channels;
            return this;
        }
        public java.util.List<String> getChannels() {
            return this.channels;
        }

    }

    public static class GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationReceivers extends TeaModel {
        /**
         * <p>The additional parameter settings for sending alerts, in JSON format. The following keys are supported:</p>
         * <ul>
         * <li>atAll: Specifies whether to @everyone in the group when sending a DingTalk alert. This parameter takes effect only when ReceiverType is set to DingdingUrl.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;atAll&quot;: true }</p>
         */
        @NameInMap("Extension")
        public String extension;

        /**
         * <p>The type of the alert recipient.</p>
         * 
         * <strong>example:</strong>
         * <p>DingdingUrl</p>
         */
        @NameInMap("ReceiverType")
        public String receiverType;

        /**
         * <p>The alert recipients.</p>
         */
        @NameInMap("ReceiverValues")
        public java.util.List<String> receiverValues;

        public static GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationReceivers build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationReceivers self = new GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationReceivers();
            return TeaModel.build(map, self);
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationReceivers setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationReceivers setReceiverType(String receiverType) {
            this.receiverType = receiverType;
            return this;
        }
        public String getReceiverType() {
            return this.receiverType;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationReceivers setReceiverValues(java.util.List<String> receiverValues) {
            this.receiverValues = receiverValues;
            return this;
        }
        public java.util.List<String> getReceiverValues() {
            return this.receiverValues;
        }

    }

    public static class GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotifications extends TeaModel {
        /**
         * <p>The notification channels.</p>
         */
        @NameInMap("NotificationChannels")
        public java.util.List<GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationChannels> notificationChannels;

        /**
         * <p>The notification recipients.</p>
         */
        @NameInMap("NotificationReceivers")
        public java.util.List<GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationReceivers> notificationReceivers;

        public static GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotifications build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotifications self = new GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotifications();
            return TeaModel.build(map, self);
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotifications setNotificationChannels(java.util.List<GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationChannels> notificationChannels) {
            this.notificationChannels = notificationChannels;
            return this;
        }
        public java.util.List<GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationChannels> getNotificationChannels() {
            return this.notificationChannels;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotifications setNotificationReceivers(java.util.List<GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationReceivers> notificationReceivers) {
            this.notificationReceivers = notificationReceivers;
            return this;
        }
        public java.util.List<GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationReceivers> getNotificationReceivers() {
            return this.notificationReceivers;
        }

    }

    public static class GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotifications extends TeaModel {
        /**
         * <p>The cause that triggers a notification. When this condition is met, a message notification is sent. Only two types of conditional expressions are supported:</p>
         * <ul>
         * <li>Specify a single combination of rule severity and rule check status. For example, <code>${severity} == &quot;High&quot; AND ${status} == &quot;Critical&quot;</code> means that the condition is met if any rule with a severity of High has a check result of Critical. </li>
         * <li>Specify multiple combinations of rule severity and rule check status. For example, <code>(${severity} == &quot;High&quot;AND ${status} == &quot;Critical&quot;) OR (${severity} == &quot;Normal&quot; AND ${status} == &quot;Critical&quot;) OR (${severity} == &quot;Normal&quot; AND ${status} == &quot;Error&quot;)</code> means that the condition is met if any rule with a severity of High has a check result of Critical, or any rule with a severity of Normal has a check result of Critical, or any rule with a severity of Normal has a check result of Error. The severity enumeration values in the conditional expression are consistent with the severity enumeration values in DataQualityRule, and the status enumeration values are consistent with the status values in DataQualityResult.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>${severity} == &quot;High&quot; AND ${status} == &quot;Critical&quot;</p>
         */
        @NameInMap("Condition")
        public String condition;

        /**
         * <p>The alert methods.</p>
         */
        @NameInMap("Notifications")
        public java.util.List<GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotifications> notifications;

        public static GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotifications build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotifications self = new GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotifications();
            return TeaModel.build(map, self);
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotifications setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotifications setNotifications(java.util.List<GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotifications> notifications) {
            this.notifications = notifications;
            return this;
        }
        public java.util.List<GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotifications> getNotifications() {
            return this.notifications;
        }

    }

    public static class GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskTarget extends TeaModel {
        /**
         * <p>The type of the database to which the table belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>maxcompute</p>
         */
        @NameInMap("DatabaseType")
        public String databaseType;

        /**
         * <p>The partition range to monitor.</p>
         * 
         * <strong>example:</strong>
         * <p>pt=$[yyyymmdd-1]</p>
         */
        @NameInMap("PartitionSpec")
        public String partitionSpec;

        /**
         * <p>The unique ID of the table in DataWorks Data Map.</p>
         * 
         * <strong>example:</strong>
         * <p>odps.api_trace.ods_d_api_log</p>
         */
        @NameInMap("TableGuid")
        public String tableGuid;

        /**
         * <p>The monitored object type. Valid values:</p>
         * <ul>
         * <li>Table: table.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Table</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskTarget build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskTarget self = new GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskTarget();
            return TeaModel.build(map, self);
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskTarget setDatabaseType(String databaseType) {
            this.databaseType = databaseType;
            return this;
        }
        public String getDatabaseType() {
            return this.databaseType;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskTarget setPartitionSpec(String partitionSpec) {
            this.partitionSpec = partitionSpec;
            return this;
        }
        public String getPartitionSpec() {
            return this.partitionSpec;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskTarget setTableGuid(String tableGuid) {
            this.tableGuid = tableGuid;
            return this;
        }
        public String getTableGuid() {
            return this.tableGuid;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskTarget setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskTrigger extends TeaModel {
        /**
         * <p>The list of scheduling node IDs. This parameter is valid only when Type is set to ByScheduledTaskInstance.</p>
         */
        @NameInMap("TaskIds")
        public java.util.List<Long> taskIds;

        /**
         * <p>The trigger type of the quality monitoring task. Valid values:</p>
         * <ul>
         * <li>ByManual: Manual trigger. This is the default value.</li>
         * <li>ByScheduledTaskInstance: Triggered by an associated scheduling node.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ByScheduledTaskInstance</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskTrigger build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskTrigger self = new GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskTrigger();
            return TeaModel.build(map, self);
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskTrigger setTaskIds(java.util.List<Long> taskIds) {
            this.taskIds = taskIds;
            return this;
        }
        public java.util.List<Long> getTaskIds() {
            return this.taskIds;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskTrigger setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTask extends TeaModel {
        /**
         * <p>The description of the data quality monitoring task.</p>
         * 
         * <strong>example:</strong>
         * <p>OpenAPI quality monitoring test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The callback settings.</p>
         */
        @NameInMap("Hooks")
        public java.util.List<GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskHooks> hooks;

        /**
         * <p>The ID of the data quality monitoring task.</p>
         * 
         * <strong>example:</strong>
         * <p>28544990</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the data quality monitoring task.</p>
         * 
         * <strong>example:</strong>
         * <p>Data quality OpenAPI monitoring test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The notification settings.</p>
         */
        @NameInMap("Notifications")
        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotifications notifications;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20629</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The extension configuration, a JSON-formatted character string. This parameter takes effect only for EMR-type data quality monitoring tasks.</p>
         * <ul>
         * <li>queue: The YARN queue used to execute EMR data validation. The default value is the queue configured for the current project.</li>
         * <li>sqlEngine: The SQL engine used to execute EMR data validation. Valid values:<ul>
         * <li>HIVE_SQL</li>
         * <li>SPARK_SQL.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;queue&quot;: &quot;default&quot; }</p>
         */
        @NameInMap("RuntimeConf")
        public String runtimeConf;

        /**
         * <p>The monitored object of the data quality check task. Refer to the DataQualityTarget example.</p>
         */
        @NameInMap("Target")
        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskTarget target;

        /**
         * <p>The trigger configuration of the data quality check task.</p>
         */
        @NameInMap("Trigger")
        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskTrigger trigger;

        public static GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTask build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTask self = new GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTask();
            return TeaModel.build(map, self);
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTask setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTask setHooks(java.util.List<GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskHooks> hooks) {
            this.hooks = hooks;
            return this;
        }
        public java.util.List<GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskHooks> getHooks() {
            return this.hooks;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTask setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTask setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTask setNotifications(GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotifications notifications) {
            this.notifications = notifications;
            return this;
        }
        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotifications getNotifications() {
            return this.notifications;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTask setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTask setRuntimeConf(String runtimeConf) {
            this.runtimeConf = runtimeConf;
            return this;
        }
        public String getRuntimeConf() {
            return this.runtimeConf;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTask setTarget(GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskTarget target) {
            this.target = target;
            return this;
        }
        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskTarget getTarget() {
            return this.target;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTask setTrigger(GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskTrigger trigger) {
            this.trigger = trigger;
            return this;
        }
        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskTrigger getTrigger() {
            return this.trigger;
        }

    }

    public static class GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstance extends TeaModel {
        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1716344665000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The end time of the instance execution.</p>
         * 
         * <strong>example:</strong>
         * <p>1716344665000</p>
         */
        @NameInMap("FinishTime")
        public Long finishTime;

        /**
         * <p>The data quality monitoring instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7234231689</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The execution parameters for the data quality check, in JSON format. The following keys are available:</p>
         * <ul>
         * <li>triggerTime: the millisecond-level timestamp of the trigger time. This is the base time for the $[yyyymmdd] expression in the data range of the data quality monitoring task. This key is required.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;triggerTime&quot;: 1733284062000 }</p>
         */
        @NameInMap("Parameters")
        public String parameters;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>98330</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("Results")
        public java.util.List<GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResults> results;

        /**
         * <p>The instance status of the data quality monitoring task. Valid values:</p>
         * <ul>
         * <li>Running: The check is in progress.</li>
         * <li>Error: A rule check encountered an error.</li>
         * <li>Passed: All rule checks passed.</li>
         * <li>Warned: A rule triggered a normal alert threshold.</li>
         * <li>Critical: A rule triggered a critical alert threshold.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Passed</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The data quality monitoring task.</p>
         */
        @NameInMap("Task")
        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTask task;

        /**
         * <p>The context information when the instance is triggered, in JSON format. The following keys may be included:</p>
         * <ul>
         * <li>TriggerClient: the trigger source of the data quality monitoring instance, such as CWF2 (scheduling system). More values may be added in the future.</li>
         * <li>TriggerClientId: the ID of a specific business resource in the source system. For example, when TriggerClient is CWF2, this field records the scheduling task ID.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;triggerClient&quot;: &quot;CWF2&quot;, &quot;triggerClientId&quot;: 70001238945 }</p>
         */
        @NameInMap("TriggerContext")
        public String triggerContext;

        public static GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstance build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstance self = new GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstance();
            return TeaModel.build(map, self);
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstance setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstance setFinishTime(Long finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Long getFinishTime() {
            return this.finishTime;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstance setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstance setParameters(String parameters) {
            this.parameters = parameters;
            return this;
        }
        public String getParameters() {
            return this.parameters;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstance setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstance setResults(java.util.List<GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceResults> getResults() {
            return this.results;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstance setTask(GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTask task) {
            this.task = task;
            return this;
        }
        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTask getTask() {
            return this.task;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstance setTriggerContext(String triggerContext) {
            this.triggerContext = triggerContext;
            return this;
        }
        public String getTriggerContext() {
            return this.triggerContext;
        }

    }

}
