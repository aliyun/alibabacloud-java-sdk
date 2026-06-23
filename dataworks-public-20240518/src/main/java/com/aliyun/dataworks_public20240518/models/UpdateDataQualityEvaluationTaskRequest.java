// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateDataQualityEvaluationTaskRequest extends TeaModel {
    /**
     * <p>List of data quality rules associated with the data quality monitoring.</p>
     */
    @NameInMap("DataQualityRules")
    public java.util.List<UpdateDataQualityEvaluationTaskRequestDataQualityRules> dataQualityRules;

    /**
     * <p>Data source ID. You can call <a href="https://help.aliyun.com/document_detail/211431.html">ListDataSources</a> to obtain the data source ID.</p>
     * 
     * <strong>example:</strong>
     * <p>358750</p>
     */
    @NameInMap("DataSourceId")
    public Long dataSourceId;

    /**
     * <p>Description of the quality monitoring task</p>
     * 
     * <strong>example:</strong>
     * <p>OpenAPI data quality monitoring test.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Callback settings</p>
     */
    @NameInMap("Hooks")
    public java.util.List<UpdateDataQualityEvaluationTaskRequestHooks> hooks;

    /**
     * <p>Data quality monitoring ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7227061794</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>Name of the quality monitoring task</p>
     * 
     * <strong>example:</strong>
     * <p>OpenAPI data quality monitoring test.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Notification subscription configuration</p>
     */
    @NameInMap("Notifications")
    public UpdateDataQualityEvaluationTaskRequestNotifications notifications;

    /**
     * <p>Workspace ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>Extended configuration. A JSON-formatted string. Takes effect only for EMR-type data quality monitoring.</p>
     * <ul>
     * <li>queue: The YARN queue used when executing EMR data quality validation. Defaults to the queue configured for the current project.</li>
     * <li>sqlEngine: The SQL engine used when executing EMR data validation.<ul>
     * <li>HIVE_SQL</li>
     * <li>SPARK_SQL</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;queue&quot;: &quot;default&quot;, &quot;sqlEngine&quot;: &quot;SPARK_SQL&quot; }</p>
     */
    @NameInMap("RuntimeConf")
    public String runtimeConf;

    /**
     * <p>Data quality monitoring object</p>
     */
    @NameInMap("Target")
    public UpdateDataQualityEvaluationTaskRequestTarget target;

    /**
     * <p>Trigger configuration of the data quality validation task</p>
     */
    @NameInMap("Trigger")
    public UpdateDataQualityEvaluationTaskRequestTrigger trigger;

    public static UpdateDataQualityEvaluationTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataQualityEvaluationTaskRequest self = new UpdateDataQualityEvaluationTaskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataQualityEvaluationTaskRequest setDataQualityRules(java.util.List<UpdateDataQualityEvaluationTaskRequestDataQualityRules> dataQualityRules) {
        this.dataQualityRules = dataQualityRules;
        return this;
    }
    public java.util.List<UpdateDataQualityEvaluationTaskRequestDataQualityRules> getDataQualityRules() {
        return this.dataQualityRules;
    }

    public UpdateDataQualityEvaluationTaskRequest setDataSourceId(Long dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public Long getDataSourceId() {
        return this.dataSourceId;
    }

    public UpdateDataQualityEvaluationTaskRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateDataQualityEvaluationTaskRequest setHooks(java.util.List<UpdateDataQualityEvaluationTaskRequestHooks> hooks) {
        this.hooks = hooks;
        return this;
    }
    public java.util.List<UpdateDataQualityEvaluationTaskRequestHooks> getHooks() {
        return this.hooks;
    }

    public UpdateDataQualityEvaluationTaskRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateDataQualityEvaluationTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateDataQualityEvaluationTaskRequest setNotifications(UpdateDataQualityEvaluationTaskRequestNotifications notifications) {
        this.notifications = notifications;
        return this;
    }
    public UpdateDataQualityEvaluationTaskRequestNotifications getNotifications() {
        return this.notifications;
    }

    public UpdateDataQualityEvaluationTaskRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public UpdateDataQualityEvaluationTaskRequest setRuntimeConf(String runtimeConf) {
        this.runtimeConf = runtimeConf;
        return this;
    }
    public String getRuntimeConf() {
        return this.runtimeConf;
    }

    public UpdateDataQualityEvaluationTaskRequest setTarget(UpdateDataQualityEvaluationTaskRequestTarget target) {
        this.target = target;
        return this;
    }
    public UpdateDataQualityEvaluationTaskRequestTarget getTarget() {
        return this.target;
    }

    public UpdateDataQualityEvaluationTaskRequest setTrigger(UpdateDataQualityEvaluationTaskRequestTrigger trigger) {
        this.trigger = trigger;
        return this;
    }
    public UpdateDataQualityEvaluationTaskRequestTrigger getTrigger() {
        return this.trigger;
    }

    public static class UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsCritical extends TeaModel {
        /**
         * <p>Threshold expression.</p>
         * <p>Fluctuation-type rules must use an expression to represent the fluctuation threshold. For example:</p>
         * <ul>
         * <li>Fluctuation rises above 0.01: $checkValue &gt; 0.01</li>
         * <li>Fluctuation drops below 0.01: $checkValue &lt; -0.01</li>
         * <li>Absolute fluctuation rate: abs($checkValue) &gt; 0.01</li>
         * </ul>
         * <p>Fixed-value-type rules can also use an expression to configure the threshold. If both are configured, the expression takes precedence over Operator and Value.</p>
         * 
         * <strong>example:</strong>
         * <p>$checkValue &gt; 0.01</p>
         */
        @NameInMap("Expression")
        public String expression;

        /**
         * <p>Comparison operator</p>
         * <ul>
         * <li>\&gt;</li>
         * <li>\&gt;=</li>
         * <li>&lt;</li>
         * <li>&lt;=</li>
         * <li>!=</li>
         * <li>=</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <blockquote>
         * </blockquote>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>Threshold value.</p>
         * 
         * <strong>example:</strong>
         * <p>0.01</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsCritical build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsCritical self = new UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsCritical();
            return TeaModel.build(map, self);
        }

        public UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsCritical setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsCritical setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsCritical setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsExpected extends TeaModel {
        /**
         * <p>Threshold expression.</p>
         * <p>Fluctuation-type rules must use an expression to represent the fluctuation threshold. For example:</p>
         * <ul>
         * <li>Fluctuation rises above 0.01: $checkValue &gt; 0.01</li>
         * <li>Fluctuation drops below 0.01: $checkValue &lt; -0.01</li>
         * <li>Absolute fluctuation rate: abs($checkValue) &gt; 0.01</li>
         * </ul>
         * <p>Fixed-value-type rules can also use an expression to configure the threshold. If both are configured, the expression takes precedence over Operator and Value.</p>
         * 
         * <strong>example:</strong>
         * <p>$checkValue &gt; 0.01</p>
         */
        @NameInMap("Expression")
        public String expression;

        /**
         * <p>Comparison operator</p>
         * <ul>
         * <li>\&gt;</li>
         * <li>\&gt;=</li>
         * <li>&lt;</li>
         * <li>&lt;=</li>
         * <li>!=</li>
         * <li>=</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>=</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>Threshold value</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsExpected build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsExpected self = new UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsExpected();
            return TeaModel.build(map, self);
        }

        public UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsExpected setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsExpected setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsExpected setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsWarned extends TeaModel {
        /**
         * <p>Threshold expression.</p>
         * <p>Fluctuation-type rules must use an expression to represent the fluctuation threshold. For example:</p>
         * <ul>
         * <li>Fluctuation rises above 0.01: $checkValue &gt; 0.01</li>
         * <li>Fluctuation drops below 0.01: $checkValue &lt; -0.01</li>
         * <li>Absolute fluctuation rate: abs($checkValue) &gt; 0.01</li>
         * </ul>
         * <p>Fixed-value-type rules can also use an expression to configure the threshold. If both are configured, the expression takes precedence over Operator and Value.</p>
         * 
         * <strong>example:</strong>
         * <p>$checkValue &gt; 0.01</p>
         */
        @NameInMap("Expression")
        public String expression;

        /**
         * <p>Comparison operator</p>
         * <ul>
         * <li>\&gt;</li>
         * <li>\&gt;=</li>
         * <li>\&lt;</li>
         * <li>\&lt;=</li>
         * <li>!=</li>
         * <li>=</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <blockquote>
         * </blockquote>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>Threshold value</p>
         * 
         * <strong>example:</strong>
         * <p>0.001</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsWarned build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsWarned self = new UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsWarned();
            return TeaModel.build(map, self);
        }

        public UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsWarned setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsWarned setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsWarned setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholds extends TeaModel {
        /**
         * <p>Threshold settings for critical warnings</p>
         */
        @NameInMap("Critical")
        public UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsCritical critical;

        /**
         * <p>Expected threshold settings</p>
         */
        @NameInMap("Expected")
        public UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsExpected expected;

        /**
         * <p>Threshold settings for normal warnings</p>
         */
        @NameInMap("Warned")
        public UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsWarned warned;

        public static UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholds build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholds self = new UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholds();
            return TeaModel.build(map, self);
        }

        public UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholds setCritical(UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsCritical critical) {
            this.critical = critical;
            return this;
        }
        public UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsCritical getCritical() {
            return this.critical;
        }

        public UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholds setExpected(UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsExpected expected) {
            this.expected = expected;
            return this;
        }
        public UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsExpected getExpected() {
            return this.expected;
        }

        public UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholds setWarned(UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsWarned warned) {
            this.warned = warned;
            return this;
        }
        public UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsWarned getWarned() {
            return this.warned;
        }

    }

    public static class UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfig extends TeaModel {
        /**
         * <p>Some threshold types require querying reference samples and then aggregating their values to derive the comparison threshold. An expression is used here to indicate how the reference samples are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;bizdate&quot;: [&quot;-1&quot;]}</p>
         */
        @NameInMap("ReferencedSamplesFilter")
        public String referencedSamplesFilter;

        /**
         * <p>Validation threshold settings.</p>
         */
        @NameInMap("Thresholds")
        public UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholds thresholds;

        /**
         * <p>Threshold calculation method</p>
         * <ul>
         * <li>Fluctation: Fluctuation range validation</li>
         * <li>Auto: Intelligent threshold validation</li>
         * <li>FluctationDiscreate: Discrete value fluctuation range validation</li>
         * <li>Average: Mean fluctuation range validation</li>
         * <li>Fixed: Fixed value validation</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Fixed</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfig self = new UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfig();
            return TeaModel.build(map, self);
        }

        public UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfig setReferencedSamplesFilter(String referencedSamplesFilter) {
            this.referencedSamplesFilter = referencedSamplesFilter;
            return this;
        }
        public String getReferencedSamplesFilter() {
            return this.referencedSamplesFilter;
        }

        public UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfig setThresholds(UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholds thresholds) {
            this.thresholds = thresholds;
            return this;
        }
        public UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholds getThresholds() {
            return this.thresholds;
        }

        public UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateDataQualityEvaluationTaskRequestDataQualityRulesErrorHandlers extends TeaModel {
        /**
         * <p>For custom SQL rules, the user must specify the SQL to filter problematic data.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT * FROM ods_d_openapi_log WHERE status = \&quot;Error\&quot;</p>
         */
        @NameInMap("ErrorDataFilter")
        public String errorDataFilter;

        /**
         * <p>Handler type:</p>
         * <ul>
         * <li>SaveErrorData: Retain problematic data</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SaveErrorData</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdateDataQualityEvaluationTaskRequestDataQualityRulesErrorHandlers build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataQualityEvaluationTaskRequestDataQualityRulesErrorHandlers self = new UpdateDataQualityEvaluationTaskRequestDataQualityRulesErrorHandlers();
            return TeaModel.build(map, self);
        }

        public UpdateDataQualityEvaluationTaskRequestDataQualityRulesErrorHandlers setErrorDataFilter(String errorDataFilter) {
            this.errorDataFilter = errorDataFilter;
            return this;
        }
        public String getErrorDataFilter() {
            return this.errorDataFilter;
        }

        public UpdateDataQualityEvaluationTaskRequestDataQualityRulesErrorHandlers setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateDataQualityEvaluationTaskRequestDataQualityRulesSamplingConfig extends TeaModel {
        /**
         * <p>Name of the sampling metric</p>
         * <ul>
         * <li>Count: Number of rows in the table</li>
         * <li>Min: Minimum value of the field</li>
         * <li>Max: Maximum value of the field</li>
         * <li>Avg: Average value of the field</li>
         * <li>DistinctCount: Number of distinct values of the field</li>
         * <li>DistinctPercent: Ratio of the number of distinct field values to the total number of rows</li>
         * <li>DuplicatedCount: Number of duplicate values of the field</li>
         * <li>DuplicatedPercent: Ratio of the number of duplicate field values to the total number of rows</li>
         * <li>TableSize: Size of the table</li>
         * <li>NullValueCount: Number of rows where the field is null</li>
         * <li>NullValuePercent: Proportion of rows where the field is null</li>
         * <li>GroupCount: After aggregating by field value, each value and its corresponding number of rows</li>
         * <li>CountNotIn: Number of rows whose enum values do not match</li>
         * <li>CountDistinctNotIn: Number of distinct values whose enum values do not match</li>
         * <li>UserDefinedSql: Sample collection via custom SQL</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CountNotIn</p>
         */
        @NameInMap("Metric")
        public String metric;

        /**
         * <p>Parameters required for sample collection</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;Columns&quot;: [ &quot;id&quot;, &quot;name&quot; ] , &quot;SQL&quot;: &quot;select count(1) from table;&quot;}</p>
         */
        @NameInMap("MetricParameters")
        public String metricParameters;

        /**
         * <p>Conditions for further filtering of data not of concern during sampling. Maximum 16777215 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>status != \&quot;Succeeded\&quot;</p>
         */
        @NameInMap("SamplingFilter")
        public String samplingFilter;

        /**
         * <p>Runtime parameter setting statements to be inserted and executed before the actual sampling statement. Maximum 1000 characters. Currently only MaxCompute is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>odps.sql.type.system.odps2=True,odps.sql.hive.compatible=True</p>
         */
        @NameInMap("SettingConfig")
        public String settingConfig;

        public static UpdateDataQualityEvaluationTaskRequestDataQualityRulesSamplingConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataQualityEvaluationTaskRequestDataQualityRulesSamplingConfig self = new UpdateDataQualityEvaluationTaskRequestDataQualityRulesSamplingConfig();
            return TeaModel.build(map, self);
        }

        public UpdateDataQualityEvaluationTaskRequestDataQualityRulesSamplingConfig setMetric(String metric) {
            this.metric = metric;
            return this;
        }
        public String getMetric() {
            return this.metric;
        }

        public UpdateDataQualityEvaluationTaskRequestDataQualityRulesSamplingConfig setMetricParameters(String metricParameters) {
            this.metricParameters = metricParameters;
            return this;
        }
        public String getMetricParameters() {
            return this.metricParameters;
        }

        public UpdateDataQualityEvaluationTaskRequestDataQualityRulesSamplingConfig setSamplingFilter(String samplingFilter) {
            this.samplingFilter = samplingFilter;
            return this;
        }
        public String getSamplingFilter() {
            return this.samplingFilter;
        }

        public UpdateDataQualityEvaluationTaskRequestDataQualityRulesSamplingConfig setSettingConfig(String settingConfig) {
            this.settingConfig = settingConfig;
            return this;
        }
        public String getSettingConfig() {
            return this.settingConfig;
        }

    }

    public static class UpdateDataQualityEvaluationTaskRequestDataQualityRules extends TeaModel {
        /**
         * <p>Sample validation settings</p>
         */
        @NameInMap("CheckingConfig")
        public UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfig checkingConfig;

        /**
         * <p>Description of the data quality rule.</p>
         * 
         * <strong>example:</strong>
         * <p>OpenAPI test rules</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Whether the data quality rule is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>Quality rule validation issue handler</p>
         */
        @NameInMap("ErrorHandlers")
        public java.util.List<UpdateDataQualityEvaluationTaskRequestDataQualityRulesErrorHandlers> errorHandlers;

        /**
         * <p>ID of the validation rule. You can call the <a href="https://help.aliyun.com/document_detail/173995.html">ListQualityRules</a> operation to obtain the rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1022171560</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Name of the data quality rule.</p>
         * 
         * <strong>example:</strong>
         * <p>OpenAPI test rules</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Parameters required for sample collection</p>
         */
        @NameInMap("SamplingConfig")
        public UpdateDataQualityEvaluationTaskRequestDataQualityRulesSamplingConfig samplingConfig;

        /**
         * <p>Severity level of the rule for the business (corresponds to strong/weak rules on the page). Optional enum values:</p>
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
         * <p>Unique identifier of the rule template referenced by the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM:field:null_value:fixed:0</p>
         */
        @NameInMap("TemplateCode")
        public String templateCode;

        public static UpdateDataQualityEvaluationTaskRequestDataQualityRules build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataQualityEvaluationTaskRequestDataQualityRules self = new UpdateDataQualityEvaluationTaskRequestDataQualityRules();
            return TeaModel.build(map, self);
        }

        public UpdateDataQualityEvaluationTaskRequestDataQualityRules setCheckingConfig(UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfig checkingConfig) {
            this.checkingConfig = checkingConfig;
            return this;
        }
        public UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfig getCheckingConfig() {
            return this.checkingConfig;
        }

        public UpdateDataQualityEvaluationTaskRequestDataQualityRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateDataQualityEvaluationTaskRequestDataQualityRules setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdateDataQualityEvaluationTaskRequestDataQualityRules setErrorHandlers(java.util.List<UpdateDataQualityEvaluationTaskRequestDataQualityRulesErrorHandlers> errorHandlers) {
            this.errorHandlers = errorHandlers;
            return this;
        }
        public java.util.List<UpdateDataQualityEvaluationTaskRequestDataQualityRulesErrorHandlers> getErrorHandlers() {
            return this.errorHandlers;
        }

        public UpdateDataQualityEvaluationTaskRequestDataQualityRules setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateDataQualityEvaluationTaskRequestDataQualityRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateDataQualityEvaluationTaskRequestDataQualityRules setSamplingConfig(UpdateDataQualityEvaluationTaskRequestDataQualityRulesSamplingConfig samplingConfig) {
            this.samplingConfig = samplingConfig;
            return this;
        }
        public UpdateDataQualityEvaluationTaskRequestDataQualityRulesSamplingConfig getSamplingConfig() {
            return this.samplingConfig;
        }

        public UpdateDataQualityEvaluationTaskRequestDataQualityRules setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public UpdateDataQualityEvaluationTaskRequestDataQualityRules setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

    }

    public static class UpdateDataQualityEvaluationTaskRequestHooks extends TeaModel {
        /**
         * <p>Hook trigger condition. When this condition is met, the hook action is triggered. Currently, only two types of condition expressions are supported:</p>
         * <ul>
         * <li>Specify a single group of rule severity type and rule validation status, such as <code>${severity} == &quot;High&quot; AND ${status} == &quot;Critical&quot;</code>. This means the condition is met when any executed rule with severity High has a validation result of Critical.</li>
         * <li>Specify multiple groups of rule severity type and rule validation status, such as <code>(${severity} == &quot;High&quot; AND ${status} == &quot;Critical&quot;) OR (${severity} == &quot;Normal&quot; AND ${status} == &quot;Critical&quot;) OR (${severity} == &quot;Normal&quot; AND ${status} == &quot;Error&quot;)</code>. This means the condition is met when any executed rule satisfies one of the following: severity High with validation result Critical, severity Normal with validation result Critical, or severity Normal with validation result Error. The severity enum in the condition expression is consistent with the severity enum in DataQualityRule, and the status enum is consistent with the status in DataQualityResult.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>${severity} == &quot;High&quot; AND ${status} == &quot;Critical&quot;</p>
         */
        @NameInMap("Condition")
        public String condition;

        /**
         * <p>Hook actions executed after data quality validation completes.</p>
         * <ul>
         * <li>BlockTaskInstance: Block the scheduling task.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ByScheduledTaskInstance</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdateDataQualityEvaluationTaskRequestHooks build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataQualityEvaluationTaskRequestHooks self = new UpdateDataQualityEvaluationTaskRequestHooks();
            return TeaModel.build(map, self);
        }

        public UpdateDataQualityEvaluationTaskRequestHooks setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public UpdateDataQualityEvaluationTaskRequestHooks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateDataQualityEvaluationTaskRequestNotificationsNotificationsNotificationChannels extends TeaModel {
        /**
         * <p>Notification method</p>
         */
        @NameInMap("Channels")
        public java.util.List<String> channels;

        public static UpdateDataQualityEvaluationTaskRequestNotificationsNotificationsNotificationChannels build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataQualityEvaluationTaskRequestNotificationsNotificationsNotificationChannels self = new UpdateDataQualityEvaluationTaskRequestNotificationsNotificationsNotificationChannels();
            return TeaModel.build(map, self);
        }

        public UpdateDataQualityEvaluationTaskRequestNotificationsNotificationsNotificationChannels setChannels(java.util.List<String> channels) {
            this.channels = channels;
            return this;
        }
        public java.util.List<String> getChannels() {
            return this.channels;
        }

    }

    public static class UpdateDataQualityEvaluationTaskRequestNotificationsNotificationsNotificationReceivers extends TeaModel {
        /**
         * <p>Additional parameter settings when sending alerts. JSON format. The supported keys are as follows:</p>
         * <ul>
         * <li>atAll: Whether to @all members in the group when sending DingTalk alerts. Takes effect when ReceiverType is DingdingUrl.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{  &quot;atAll&quot;: true }</p>
         */
        @NameInMap("Extension")
        public String extension;

        /**
         * <p>Alert recipient type</p>
         * 
         * <strong>example:</strong>
         * <p>DingdingUrl</p>
         */
        @NameInMap("ReceiverType")
        public String receiverType;

        /**
         * <p>Alert recipients</p>
         */
        @NameInMap("ReceiverValues")
        public java.util.List<String> receiverValues;

        public static UpdateDataQualityEvaluationTaskRequestNotificationsNotificationsNotificationReceivers build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataQualityEvaluationTaskRequestNotificationsNotificationsNotificationReceivers self = new UpdateDataQualityEvaluationTaskRequestNotificationsNotificationsNotificationReceivers();
            return TeaModel.build(map, self);
        }

        public UpdateDataQualityEvaluationTaskRequestNotificationsNotificationsNotificationReceivers setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public UpdateDataQualityEvaluationTaskRequestNotificationsNotificationsNotificationReceivers setReceiverType(String receiverType) {
            this.receiverType = receiverType;
            return this;
        }
        public String getReceiverType() {
            return this.receiverType;
        }

        public UpdateDataQualityEvaluationTaskRequestNotificationsNotificationsNotificationReceivers setReceiverValues(java.util.List<String> receiverValues) {
            this.receiverValues = receiverValues;
            return this;
        }
        public java.util.List<String> getReceiverValues() {
            return this.receiverValues;
        }

    }

    public static class UpdateDataQualityEvaluationTaskRequestNotificationsNotifications extends TeaModel {
        /**
         * <p>Notification method</p>
         */
        @NameInMap("NotificationChannels")
        public java.util.List<UpdateDataQualityEvaluationTaskRequestNotificationsNotificationsNotificationChannels> notificationChannels;

        /**
         * <p>Alert recipient settings</p>
         */
        @NameInMap("NotificationReceivers")
        public java.util.List<UpdateDataQualityEvaluationTaskRequestNotificationsNotificationsNotificationReceivers> notificationReceivers;

        public static UpdateDataQualityEvaluationTaskRequestNotificationsNotifications build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataQualityEvaluationTaskRequestNotificationsNotifications self = new UpdateDataQualityEvaluationTaskRequestNotificationsNotifications();
            return TeaModel.build(map, self);
        }

        public UpdateDataQualityEvaluationTaskRequestNotificationsNotifications setNotificationChannels(java.util.List<UpdateDataQualityEvaluationTaskRequestNotificationsNotificationsNotificationChannels> notificationChannels) {
            this.notificationChannels = notificationChannels;
            return this;
        }
        public java.util.List<UpdateDataQualityEvaluationTaskRequestNotificationsNotificationsNotificationChannels> getNotificationChannels() {
            return this.notificationChannels;
        }

        public UpdateDataQualityEvaluationTaskRequestNotificationsNotifications setNotificationReceivers(java.util.List<UpdateDataQualityEvaluationTaskRequestNotificationsNotificationsNotificationReceivers> notificationReceivers) {
            this.notificationReceivers = notificationReceivers;
            return this;
        }
        public java.util.List<UpdateDataQualityEvaluationTaskRequestNotificationsNotificationsNotificationReceivers> getNotificationReceivers() {
            return this.notificationReceivers;
        }

    }

    public static class UpdateDataQualityEvaluationTaskRequestNotifications extends TeaModel {
        /**
         * <p>Notification trigger condition. When this condition is met, a message notification is triggered. Currently, only two types of condition expressions are supported:</p>
         * <ul>
         * <li>Specify a single group of rule severity type and rule validation status, such as <code>${severity} == &quot;High&quot; AND ${status} == &quot;Critical&quot;</code>. This means the condition is met when any executed rule with severity High has a validation result of Critical.</li>
         * <li>Specify multiple groups of rule severity type and rule validation status, such as <code>(${severity} == &quot;High&quot; AND ${status} == &quot;Critical&quot;) OR (${severity} == &quot;Normal&quot; AND ${status} == &quot;Critical&quot;) OR (${severity} == &quot;Normal&quot; AND ${status} == &quot;Error&quot;)</code>. This means the condition is met when any executed rule satisfies one of the following: severity High with validation result Critical, severity Normal with validation result Critical, or severity Normal with validation result Error. The severity enum in the condition expression is consistent with the severity enum in DataQualityRule, and the status enum is consistent with the status in DataQualityResult.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>${severity} == &quot;High&quot; AND ${status} == &quot;Critical&quot;</p>
         */
        @NameInMap("Condition")
        public String condition;

        /**
         * <p>Notification settings</p>
         */
        @NameInMap("Notifications")
        public java.util.List<UpdateDataQualityEvaluationTaskRequestNotificationsNotifications> notifications;

        public static UpdateDataQualityEvaluationTaskRequestNotifications build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataQualityEvaluationTaskRequestNotifications self = new UpdateDataQualityEvaluationTaskRequestNotifications();
            return TeaModel.build(map, self);
        }

        public UpdateDataQualityEvaluationTaskRequestNotifications setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public UpdateDataQualityEvaluationTaskRequestNotifications setNotifications(java.util.List<UpdateDataQualityEvaluationTaskRequestNotificationsNotifications> notifications) {
            this.notifications = notifications;
            return this;
        }
        public java.util.List<UpdateDataQualityEvaluationTaskRequestNotificationsNotifications> getNotifications() {
            return this.notifications;
        }

    }

    public static class UpdateDataQualityEvaluationTaskRequestTarget extends TeaModel {
        /**
         * <p>Database type to which the table belongs</p>
         * <ul>
         * <li>maxcompute</li>
         * <li>hologres</li>
         * <li>cdh</li>
         * <li>analyticdb_for_mysql</li>
         * <li>starrocks</li>
         * <li>emr</li>
         * <li>analyticdb_for_postgresql</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>maxcompute</p>
         */
        @NameInMap("DatabaseType")
        public String databaseType;

        /**
         * <p>Partition settings of the partitioned table</p>
         * 
         * <strong>example:</strong>
         * <p>dt=$[yyyymmdd-1]</p>
         */
        @NameInMap("PartitionSpec")
        public String partitionSpec;

        /**
         * <p>Unique ID of the table in Data Map</p>
         * 
         * <strong>example:</strong>
         * <p>odsp.openapi.ods_d_openapi_log</p>
         */
        @NameInMap("TableGuid")
        public String tableGuid;

        public static UpdateDataQualityEvaluationTaskRequestTarget build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataQualityEvaluationTaskRequestTarget self = new UpdateDataQualityEvaluationTaskRequestTarget();
            return TeaModel.build(map, self);
        }

        public UpdateDataQualityEvaluationTaskRequestTarget setDatabaseType(String databaseType) {
            this.databaseType = databaseType;
            return this;
        }
        public String getDatabaseType() {
            return this.databaseType;
        }

        public UpdateDataQualityEvaluationTaskRequestTarget setPartitionSpec(String partitionSpec) {
            this.partitionSpec = partitionSpec;
            return this;
        }
        public String getPartitionSpec() {
            return this.partitionSpec;
        }

        public UpdateDataQualityEvaluationTaskRequestTarget setTableGuid(String tableGuid) {
            this.tableGuid = tableGuid;
            return this;
        }
        public String getTableGuid() {
            return this.tableGuid;
        }

    }

    public static class UpdateDataQualityEvaluationTaskRequestTrigger extends TeaModel {
        /**
         * <p>List of scheduling task IDs. Valid when Type is ByScheduledTaskInstance.</p>
         */
        @NameInMap("TaskIds")
        public java.util.List<Long> taskIds;

        /**
         * <p>Trigger type of the quality monitoring task.</p>
         * <ul>
         * <li>ByScheduledTaskInstance: Triggered by an associated scheduling task.</li>
         * <li>ByManual: Triggered manually.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ByScheduledTaskInstance</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdateDataQualityEvaluationTaskRequestTrigger build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataQualityEvaluationTaskRequestTrigger self = new UpdateDataQualityEvaluationTaskRequestTrigger();
            return TeaModel.build(map, self);
        }

        public UpdateDataQualityEvaluationTaskRequestTrigger setTaskIds(java.util.List<Long> taskIds) {
            this.taskIds = taskIds;
            return this;
        }
        public java.util.List<Long> getTaskIds() {
            return this.taskIds;
        }

        public UpdateDataQualityEvaluationTaskRequestTrigger setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
