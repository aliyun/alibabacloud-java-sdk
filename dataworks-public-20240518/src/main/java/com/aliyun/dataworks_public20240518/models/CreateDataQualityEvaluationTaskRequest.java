// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDataQualityEvaluationTaskRequest extends TeaModel {
    /**
     * <p>The list of data quality rules associated with the data quality monitor. If DataQualityRule.Id is specified, the rule corresponding to that ID is associated with the newly created quality monitor. If not specified, a new rule is created from the other fields and associated with the newly created quality monitor.</p>
     */
    @NameInMap("DataQualityRules")
    public java.util.List<CreateDataQualityEvaluationTaskRequestDataQualityRules> dataQualityRules;

    /**
     * <p>The ID of the data source. You can call <a href="https://help.aliyun.com/document_detail/211431.html">ListDataSources</a> to obtain the ID of the data source.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DataSourceId")
    public Long dataSourceId;

    /**
     * <p>The description of the quality monitoring task.</p>
     * 
     * <strong>example:</strong>
     * <p>OpenAPI create a data quality monitoring test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The hook settings.</p>
     */
    @NameInMap("Hooks")
    public java.util.List<CreateDataQualityEvaluationTaskRequestHooks> hooks;

    /**
     * <p>The name of the quality monitoring task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OpenAPI create a data quality monitoring test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The notification subscription configuration.</p>
     */
    @NameInMap("Notifications")
    public CreateDataQualityEvaluationTaskRequestNotifications notifications;

    /**
     * <p>The ID of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace Management page to obtain the ID.</p>
     * <p>This parameter specifies the DataWorks workspace used by this API call.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The extended configuration, a JSON-formatted string. This setting takes effect only for EMR-type data quality monitors.</p>
     * <ul>
     * <li>queue: The YARN queue used when running EMR data quality validation. The default is the queue configured for the current project.</li>
     * <li>sqlEngine: The SQL engine used when running EMR data validation.<ul>
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
     * <p>The data quality monitoring object.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Target")
    public CreateDataQualityEvaluationTaskRequestTarget target;

    /**
     * <p>The trigger configuration of the data quality validation task.</p>
     */
    @NameInMap("Trigger")
    public CreateDataQualityEvaluationTaskRequestTrigger trigger;

    public static CreateDataQualityEvaluationTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataQualityEvaluationTaskRequest self = new CreateDataQualityEvaluationTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataQualityEvaluationTaskRequest setDataQualityRules(java.util.List<CreateDataQualityEvaluationTaskRequestDataQualityRules> dataQualityRules) {
        this.dataQualityRules = dataQualityRules;
        return this;
    }
    public java.util.List<CreateDataQualityEvaluationTaskRequestDataQualityRules> getDataQualityRules() {
        return this.dataQualityRules;
    }

    public CreateDataQualityEvaluationTaskRequest setDataSourceId(Long dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public Long getDataSourceId() {
        return this.dataSourceId;
    }

    public CreateDataQualityEvaluationTaskRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDataQualityEvaluationTaskRequest setHooks(java.util.List<CreateDataQualityEvaluationTaskRequestHooks> hooks) {
        this.hooks = hooks;
        return this;
    }
    public java.util.List<CreateDataQualityEvaluationTaskRequestHooks> getHooks() {
        return this.hooks;
    }

    public CreateDataQualityEvaluationTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDataQualityEvaluationTaskRequest setNotifications(CreateDataQualityEvaluationTaskRequestNotifications notifications) {
        this.notifications = notifications;
        return this;
    }
    public CreateDataQualityEvaluationTaskRequestNotifications getNotifications() {
        return this.notifications;
    }

    public CreateDataQualityEvaluationTaskRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateDataQualityEvaluationTaskRequest setRuntimeConf(String runtimeConf) {
        this.runtimeConf = runtimeConf;
        return this;
    }
    public String getRuntimeConf() {
        return this.runtimeConf;
    }

    public CreateDataQualityEvaluationTaskRequest setTarget(CreateDataQualityEvaluationTaskRequestTarget target) {
        this.target = target;
        return this;
    }
    public CreateDataQualityEvaluationTaskRequestTarget getTarget() {
        return this.target;
    }

    public CreateDataQualityEvaluationTaskRequest setTrigger(CreateDataQualityEvaluationTaskRequestTrigger trigger) {
        this.trigger = trigger;
        return this;
    }
    public CreateDataQualityEvaluationTaskRequestTrigger getTrigger() {
        return this.trigger;
    }

    public static class CreateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsCritical extends TeaModel {
        /**
         * <p>The threshold expression.</p>
         * <p>Fluctuation-type rules must use expressions to specify the fluctuation threshold. For example:</p>
         * <ul>
         * <li>Fluctuation increase greater than 0.01: $checkValue &gt; 0.01</li>
         * <li>Fluctuation decrease greater than 0.01: $checkValue &lt; -0.01</li>
         * <li>Absolute fluctuation rate: abs($checkValue) &gt; 0.01</li>
         * </ul>
         * <p>Fixed-value rules can also use expressions to configure thresholds. If both are configured, the expression takes precedence over Operator and Value.</p>
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
         * <p>The threshold value.</p>
         * 
         * <strong>example:</strong>
         * <p>0.01</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsCritical build(java.util.Map<String, ?> map) throws Exception {
            CreateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsCritical self = new CreateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsCritical();
            return TeaModel.build(map, self);
        }

        public CreateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsCritical setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public CreateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsCritical setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public CreateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsCritical setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsExpected extends TeaModel {
        /**
         * <p>The threshold expression.</p>
         * <p>Fluctuation-type rules must use expressions to specify the fluctuation threshold. For example:</p>
         * <ul>
         * <li>Fluctuation increase greater than 0.01: $checkValue &gt; 0.01</li>
         * <li>Fluctuation decrease greater than 0.01: $checkValue &lt; -0.01</li>
         * <li>Absolute fluctuation rate: abs($checkValue) &gt; 0.01</li>
         * </ul>
         * <p>Fixed-value rules can also use expressions to configure thresholds. If both are configured, the expression takes precedence over Operator and Value.</p>
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
         * <li>=</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>=</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The threshold value.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsExpected build(java.util.Map<String, ?> map) throws Exception {
            CreateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsExpected self = new CreateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsExpected();
            return TeaModel.build(map, self);
        }

        public CreateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsExpected setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public CreateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsExpected setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public CreateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsExpected setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsWarned extends TeaModel {
        /**
         * <p>The threshold expression.</p>
         * <p>Fluctuation-type rules must use expressions to specify the fluctuation threshold. For example:</p>
         * <ul>
         * <li>Fluctuation increase greater than 0.01: $checkValue &gt; 0.01</li>
         * <li>Fluctuation decrease greater than 0.01: $checkValue &lt; -0.01</li>
         * <li>Absolute fluctuation rate: abs($checkValue) &gt; 0.01</li>
         * </ul>
         * <p>Fixed-value rules can also use expressions to configure thresholds. If both are configured, the expression takes precedence over Operator and Value.</p>
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
         * <p>The threshold value.</p>
         * 
         * <strong>example:</strong>
         * <p>0.001</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsWarned build(java.util.Map<String, ?> map) throws Exception {
            CreateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsWarned self = new CreateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsWarned();
            return TeaModel.build(map, self);
        }

        public CreateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsWarned setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public CreateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsWarned setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public CreateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsWarned setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholds extends TeaModel {
        /**
         * <p>The threshold settings for the critical warning level.</p>
         */
        @NameInMap("Critical")
        public CreateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsCritical critical;

        /**
         * <p>The expected threshold settings.</p>
         */
        @NameInMap("Expected")
        public CreateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsExpected expected;

        /**
         * <p>The threshold settings for the normal warning level.</p>
         */
        @NameInMap("Warned")
        public CreateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsWarned warned;

        public static CreateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholds build(java.util.Map<String, ?> map) throws Exception {
            CreateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholds self = new CreateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholds();
            return TeaModel.build(map, self);
        }

        public CreateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholds setCritical(CreateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsCritical critical) {
            this.critical = critical;
            return this;
        }
        public CreateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsCritical getCritical() {
            return this.critical;
        }

        public CreateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholds setExpected(CreateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsExpected expected) {
            this.expected = expected;
            return this;
        }
        public CreateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsExpected getExpected() {
            return this.expected;
        }

        public CreateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholds setWarned(CreateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsWarned warned) {
            this.warned = warned;
            return this;
        }
        public CreateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsWarned getWarned() {
            return this.warned;
        }

    }

    public static class CreateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfig extends TeaModel {
        /**
         * <p>For some threshold types, reference samples must be queried and aggregated to derive the threshold used for comparison. This field uses an expression to describe how the reference samples are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;bizdate&quot;: [&quot;-1&quot;]}</p>
         */
        @NameInMap("ReferencedSamplesFilter")
        public String referencedSamplesFilter;

        /**
         * <p>The validation threshold settings.</p>
         */
        @NameInMap("Thresholds")
        public CreateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholds thresholds;

        /**
         * <p>The method used to compute the threshold. Valid values:</p>
         * <ul>
         * <li>Fixed</li>
         * <li>Fluctation</li>
         * <li>FluctationDiscreate</li>
         * <li>Auto</li>
         * <li>Average</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Fixed</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfig self = new CreateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfig();
            return TeaModel.build(map, self);
        }

        public CreateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfig setReferencedSamplesFilter(String referencedSamplesFilter) {
            this.referencedSamplesFilter = referencedSamplesFilter;
            return this;
        }
        public String getReferencedSamplesFilter() {
            return this.referencedSamplesFilter;
        }

        public CreateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfig setThresholds(CreateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholds thresholds) {
            this.thresholds = thresholds;
            return this;
        }
        public CreateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholds getThresholds() {
            return this.thresholds;
        }

        public CreateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateDataQualityEvaluationTaskRequestDataQualityRulesErrorHandlers extends TeaModel {
        /**
         * <p>For custom SQL rules, the user must specify a SQL statement to filter the problematic data.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT * FROM ods_api_log WHERE status = \&quot;Error\&quot;;</p>
         */
        @NameInMap("ErrorDataFilter")
        public String errorDataFilter;

        /**
         * <p>The type of the handler. Valid values:</p>
         * <ul>
         * <li>SaveErrorData: retains the problematic data.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SaveErrorData</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateDataQualityEvaluationTaskRequestDataQualityRulesErrorHandlers build(java.util.Map<String, ?> map) throws Exception {
            CreateDataQualityEvaluationTaskRequestDataQualityRulesErrorHandlers self = new CreateDataQualityEvaluationTaskRequestDataQualityRulesErrorHandlers();
            return TeaModel.build(map, self);
        }

        public CreateDataQualityEvaluationTaskRequestDataQualityRulesErrorHandlers setErrorDataFilter(String errorDataFilter) {
            this.errorDataFilter = errorDataFilter;
            return this;
        }
        public String getErrorDataFilter() {
            return this.errorDataFilter;
        }

        public CreateDataQualityEvaluationTaskRequestDataQualityRulesErrorHandlers setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateDataQualityEvaluationTaskRequestDataQualityRulesSamplingConfig extends TeaModel {
        /**
         * <p>The name of the sampling metric. Valid values:</p>
         * <ul>
         * <li>Count: the number of rows in the table.</li>
         * <li>Min: the minimum value of the field.</li>
         * <li>Max: the maximum value of the field.</li>
         * <li>Avg: the average value of the field.</li>
         * <li>DistinctCount: the number of distinct values of the field.</li>
         * <li>DistinctPercent: the ratio of the number of distinct values of the field to the number of rows.</li>
         * <li>DuplicatedCount: the number of duplicate values of the field.</li>
         * <li>DuplicatedPercent: the ratio of the number of duplicate values of the field to the number of rows.</li>
         * <li>TableSize: the size of the table.</li>
         * <li>NullValueCount: the number of rows in which the field is null.</li>
         * <li>NullValuePercent: the ratio of rows in which the field is null.</li>
         * <li>GroupCount: after grouping by the field value, the count of rows for each value.</li>
         * <li>CountNotIn: the number of rows whose enumeration values do not match.</li>
         * <li>CountDistinctNotIn: the number of distinct values whose enumeration values do not match.</li>
         * <li>UserDefinedSql: collect samples using a custom SQL statement.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NullValueCount</p>
         */
        @NameInMap("Metric")
        public String metric;

        /**
         * <p>The parameters required when collecting samples.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;Columns&quot;: [ &quot;id&quot;, &quot;name&quot; ] , &quot;SQL&quot;: &quot;select count(1) from table;&quot;}</p>
         */
        @NameInMap("MetricParameters")
        public String metricParameters;

        /**
         * <p>An additional filter condition applied during sampling to exclude data that is not of interest. The maximum length is 16,777,215 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>status != \&quot;Succeeded\&quot;</p>
         */
        @NameInMap("SamplingFilter")
        public String samplingFilter;

        /**
         * <p>The runtime parameter statements inserted and executed before the sampling statement is executed. The maximum length is 1000 characters. Only MaxCompute is currently supported.</p>
         * 
         * <strong>example:</strong>
         * <p>odps.sql.type.system.odps2=True,odps.sql.hive.compatible=True</p>
         */
        @NameInMap("SettingConfig")
        public String settingConfig;

        public static CreateDataQualityEvaluationTaskRequestDataQualityRulesSamplingConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateDataQualityEvaluationTaskRequestDataQualityRulesSamplingConfig self = new CreateDataQualityEvaluationTaskRequestDataQualityRulesSamplingConfig();
            return TeaModel.build(map, self);
        }

        public CreateDataQualityEvaluationTaskRequestDataQualityRulesSamplingConfig setMetric(String metric) {
            this.metric = metric;
            return this;
        }
        public String getMetric() {
            return this.metric;
        }

        public CreateDataQualityEvaluationTaskRequestDataQualityRulesSamplingConfig setMetricParameters(String metricParameters) {
            this.metricParameters = metricParameters;
            return this;
        }
        public String getMetricParameters() {
            return this.metricParameters;
        }

        public CreateDataQualityEvaluationTaskRequestDataQualityRulesSamplingConfig setSamplingFilter(String samplingFilter) {
            this.samplingFilter = samplingFilter;
            return this;
        }
        public String getSamplingFilter() {
            return this.samplingFilter;
        }

        public CreateDataQualityEvaluationTaskRequestDataQualityRulesSamplingConfig setSettingConfig(String settingConfig) {
            this.settingConfig = settingConfig;
            return this;
        }
        public String getSettingConfig() {
            return this.settingConfig;
        }

    }

    public static class CreateDataQualityEvaluationTaskRequestDataQualityRules extends TeaModel {
        /**
         * <p>The sample validation settings.</p>
         */
        @NameInMap("CheckingConfig")
        public CreateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfig checkingConfig;

        /**
         * <p>The description of the data quality rule.</p>
         * 
         * <strong>example:</strong>
         * <p>OpenAPI test rules</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Specifies whether the quality rule is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The list of error handlers for issues detected by the quality rule validation.</p>
         */
        @NameInMap("ErrorHandlers")
        public java.util.List<CreateDataQualityEvaluationTaskRequestDataQualityRulesErrorHandlers> errorHandlers;

        /**
         * <p>The ID of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>2176</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the data quality rule.</p>
         * 
         * <strong>example:</strong>
         * <p>OpenAPI test rules</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The parameters required when collecting samples.</p>
         */
        @NameInMap("SamplingConfig")
        public CreateDataQualityEvaluationTaskRequestDataQualityRulesSamplingConfig samplingConfig;

        /**
         * <p>The business severity level of the rule (corresponding to strong/weak rules in the console). Valid values:</p>
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
         * <p>The unique identifier of the rule template that the rule references.</p>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM:field:null_value:fixed:0</p>
         */
        @NameInMap("TemplateCode")
        public String templateCode;

        public static CreateDataQualityEvaluationTaskRequestDataQualityRules build(java.util.Map<String, ?> map) throws Exception {
            CreateDataQualityEvaluationTaskRequestDataQualityRules self = new CreateDataQualityEvaluationTaskRequestDataQualityRules();
            return TeaModel.build(map, self);
        }

        public CreateDataQualityEvaluationTaskRequestDataQualityRules setCheckingConfig(CreateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfig checkingConfig) {
            this.checkingConfig = checkingConfig;
            return this;
        }
        public CreateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfig getCheckingConfig() {
            return this.checkingConfig;
        }

        public CreateDataQualityEvaluationTaskRequestDataQualityRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateDataQualityEvaluationTaskRequestDataQualityRules setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateDataQualityEvaluationTaskRequestDataQualityRules setErrorHandlers(java.util.List<CreateDataQualityEvaluationTaskRequestDataQualityRulesErrorHandlers> errorHandlers) {
            this.errorHandlers = errorHandlers;
            return this;
        }
        public java.util.List<CreateDataQualityEvaluationTaskRequestDataQualityRulesErrorHandlers> getErrorHandlers() {
            return this.errorHandlers;
        }

        public CreateDataQualityEvaluationTaskRequestDataQualityRules setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateDataQualityEvaluationTaskRequestDataQualityRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateDataQualityEvaluationTaskRequestDataQualityRules setSamplingConfig(CreateDataQualityEvaluationTaskRequestDataQualityRulesSamplingConfig samplingConfig) {
            this.samplingConfig = samplingConfig;
            return this;
        }
        public CreateDataQualityEvaluationTaskRequestDataQualityRulesSamplingConfig getSamplingConfig() {
            return this.samplingConfig;
        }

        public CreateDataQualityEvaluationTaskRequestDataQualityRules setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public CreateDataQualityEvaluationTaskRequestDataQualityRules setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

    }

    public static class CreateDataQualityEvaluationTaskRequestHooks extends TeaModel {
        /**
         * <p>The trigger condition of the hook. The hook action is triggered when this condition is met. Currently only two forms of expressions are supported:</p>
         * <ol>
         * <li>Specify a single combination of rule severity and rule validation status, for example <code>${severity} == &quot;High&quot; AND ${status} == &quot;Critical&quot;</code>, which means the condition is met if among the executed rules there exists a rule whose severity is High and whose validation result is Critical.</li>
         * <li>Specify multiple combinations of rule severity and rule validation status, for example <code>(${severity} == &quot;High&quot; AND ${status} == &quot;Critical&quot;) OR (${severity} == &quot;Normal&quot; AND ${status} == &quot;Critical&quot;) OR (${severity} == &quot;Normal&quot; AND ${status} == &quot;Error&quot;)</code>, which means the condition is met if among the executed rules there exists a rule whose severity is High and validation result is Critical, or a rule whose severity is Normal and validation result is Critical, or a rule whose severity is Normal and validation result is Error. The enumeration of severity in the expression is the same as severity in DataQualityRule, and the enumeration of status is the same as status in DataQualityResult.</li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>(${severity} == &quot;High&quot; AND ${status} == &quot;Critical&quot;) OR (${severity} == &quot;Normal&quot; AND ${status} == &quot;Critical&quot;) OR (${severity} == &quot;Normal&quot; AND ${status} == &quot;Error&quot;)</p>
         */
        @NameInMap("Condition")
        public String condition;

        /**
         * <p>The type of the hook. Currently only one type is supported:</p>
         * <ul>
         * <li>BlockTaskInstance: blocks the scheduling task from continuing to run. If the data quality monitor is triggered by a scheduling task, after the monitor finishes running, Hook.Condition is evaluated to determine whether to block the scheduling task from continuing to run.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BlockTaskInstance</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateDataQualityEvaluationTaskRequestHooks build(java.util.Map<String, ?> map) throws Exception {
            CreateDataQualityEvaluationTaskRequestHooks self = new CreateDataQualityEvaluationTaskRequestHooks();
            return TeaModel.build(map, self);
        }

        public CreateDataQualityEvaluationTaskRequestHooks setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public CreateDataQualityEvaluationTaskRequestHooks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateDataQualityEvaluationTaskRequestNotificationsNotificationsNotificationChannels extends TeaModel {
        /**
         * <p>The notification methods.</p>
         */
        @NameInMap("Channels")
        public java.util.List<String> channels;

        public static CreateDataQualityEvaluationTaskRequestNotificationsNotificationsNotificationChannels build(java.util.Map<String, ?> map) throws Exception {
            CreateDataQualityEvaluationTaskRequestNotificationsNotificationsNotificationChannels self = new CreateDataQualityEvaluationTaskRequestNotificationsNotificationsNotificationChannels();
            return TeaModel.build(map, self);
        }

        public CreateDataQualityEvaluationTaskRequestNotificationsNotificationsNotificationChannels setChannels(java.util.List<String> channels) {
            this.channels = channels;
            return this;
        }
        public java.util.List<String> getChannels() {
            return this.channels;
        }

    }

    public static class CreateDataQualityEvaluationTaskRequestNotificationsNotificationsNotificationReceivers extends TeaModel {
        /**
         * <p>Additional parameters used when sending alerts, in JSON format. Supported keys:</p>
         * <ul>
         * <li>atAll: whether to mention all members (@all) in the group when sending a DingTalk alert. This key takes effect when ReceiverType is set to DingdingUrl.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{  &quot;atAll&quot;: true }</p>
         */
        @NameInMap("Extension")
        public String extension;

        /**
         * <p>The type of the alert recipient. Valid values:</p>
         * <ul>
         * <li>WebhookUrl: a custom webhook URL.</li>
         * <li>FeishuUrl: a Lark (Feishu) alert URL.</li>
         * <li>DingdingUrl: a DingTalk alert URL.</li>
         * <li>WeixinUrl: a WeCom (Enterprise WeChat) alert URL.</li>
         * <li>AliUid: an Alibaba Cloud user ID.</li>
         * </ul>
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

        public static CreateDataQualityEvaluationTaskRequestNotificationsNotificationsNotificationReceivers build(java.util.Map<String, ?> map) throws Exception {
            CreateDataQualityEvaluationTaskRequestNotificationsNotificationsNotificationReceivers self = new CreateDataQualityEvaluationTaskRequestNotificationsNotificationsNotificationReceivers();
            return TeaModel.build(map, self);
        }

        public CreateDataQualityEvaluationTaskRequestNotificationsNotificationsNotificationReceivers setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public CreateDataQualityEvaluationTaskRequestNotificationsNotificationsNotificationReceivers setReceiverType(String receiverType) {
            this.receiverType = receiverType;
            return this;
        }
        public String getReceiverType() {
            return this.receiverType;
        }

        public CreateDataQualityEvaluationTaskRequestNotificationsNotificationsNotificationReceivers setReceiverValues(java.util.List<String> receiverValues) {
            this.receiverValues = receiverValues;
            return this;
        }
        public java.util.List<String> getReceiverValues() {
            return this.receiverValues;
        }

    }

    public static class CreateDataQualityEvaluationTaskRequestNotificationsNotifications extends TeaModel {
        /**
         * <p>The notification methods.</p>
         */
        @NameInMap("NotificationChannels")
        public java.util.List<CreateDataQualityEvaluationTaskRequestNotificationsNotificationsNotificationChannels> notificationChannels;

        /**
         * <p>The alert recipient settings.</p>
         */
        @NameInMap("NotificationReceivers")
        public java.util.List<CreateDataQualityEvaluationTaskRequestNotificationsNotificationsNotificationReceivers> notificationReceivers;

        public static CreateDataQualityEvaluationTaskRequestNotificationsNotifications build(java.util.Map<String, ?> map) throws Exception {
            CreateDataQualityEvaluationTaskRequestNotificationsNotifications self = new CreateDataQualityEvaluationTaskRequestNotificationsNotifications();
            return TeaModel.build(map, self);
        }

        public CreateDataQualityEvaluationTaskRequestNotificationsNotifications setNotificationChannels(java.util.List<CreateDataQualityEvaluationTaskRequestNotificationsNotificationsNotificationChannels> notificationChannels) {
            this.notificationChannels = notificationChannels;
            return this;
        }
        public java.util.List<CreateDataQualityEvaluationTaskRequestNotificationsNotificationsNotificationChannels> getNotificationChannels() {
            return this.notificationChannels;
        }

        public CreateDataQualityEvaluationTaskRequestNotificationsNotifications setNotificationReceivers(java.util.List<CreateDataQualityEvaluationTaskRequestNotificationsNotificationsNotificationReceivers> notificationReceivers) {
            this.notificationReceivers = notificationReceivers;
            return this;
        }
        public java.util.List<CreateDataQualityEvaluationTaskRequestNotificationsNotificationsNotificationReceivers> getNotificationReceivers() {
            return this.notificationReceivers;
        }

    }

    public static class CreateDataQualityEvaluationTaskRequestNotifications extends TeaModel {
        /**
         * <p>The trigger condition of the notification. The notification is triggered when this condition is met. Currently only two forms of expressions are supported:</p>
         * <p>Specify a single combination of rule severity and rule validation status, for example <code>${severity} == &quot;High&quot; AND ${status} == &quot;Critical&quot;</code>, which means the condition is met if among the executed rules there exists a rule whose severity is High and whose validation result is Critical.
         * Specify multiple combinations of rule severity and rule validation status, for example <code>(${severity} == &quot;High&quot; AND ${status} == &quot;Critical&quot;) OR (${severity} == &quot;Normal&quot; AND ${status} == &quot;Critical&quot;) OR (${severity} == &quot;Normal&quot; AND ${status} == &quot;Error&quot;)</code>, which means the condition is met if among the executed rules there exists a rule whose severity is High and validation result is Critical, or a rule whose severity is Normal and validation result is Critical, or a rule whose severity is Normal and validation result is Error. The enumeration of severity in the expression is the same as severity in DataQualityRule, and the enumeration of status is the same as status in DataQualityResult.</p>
         * 
         * <strong>example:</strong>
         * <p>(${severity} == &quot;High&quot; AND ${status} == &quot;Critical&quot;) OR (${severity} == &quot;Normal&quot; AND ${status} == &quot;Critical&quot;) OR (${severity} == &quot;Normal&quot; AND ${status} == &quot;Error&quot;)</p>
         */
        @NameInMap("Condition")
        public String condition;

        /**
         * <p>The notification settings.</p>
         */
        @NameInMap("Notifications")
        public java.util.List<CreateDataQualityEvaluationTaskRequestNotificationsNotifications> notifications;

        public static CreateDataQualityEvaluationTaskRequestNotifications build(java.util.Map<String, ?> map) throws Exception {
            CreateDataQualityEvaluationTaskRequestNotifications self = new CreateDataQualityEvaluationTaskRequestNotifications();
            return TeaModel.build(map, self);
        }

        public CreateDataQualityEvaluationTaskRequestNotifications setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public CreateDataQualityEvaluationTaskRequestNotifications setNotifications(java.util.List<CreateDataQualityEvaluationTaskRequestNotificationsNotifications> notifications) {
            this.notifications = notifications;
            return this;
        }
        public java.util.List<CreateDataQualityEvaluationTaskRequestNotificationsNotifications> getNotifications() {
            return this.notifications;
        }

    }

    public static class CreateDataQualityEvaluationTaskRequestTarget extends TeaModel {
        /**
         * <p>The type of the database to which the table belongs. Valid values:</p>
         * <ul>
         * <li>maxcompute</li>
         * <li>hologres</li>
         * <li>cdh</li>
         * <li>analyticdb_for_mysql</li>
         * <li>starrocks</li>
         * <li>emr</li>
         * <li>analyticdb_for_postgresql</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>maxcompute</p>
         */
        @NameInMap("DatabaseType")
        public String databaseType;

        /**
         * <p>The partition settings of the partitioned table.</p>
         * 
         * <strong>example:</strong>
         * <p>pt=$[yyyymmdd-1]</p>
         */
        @NameInMap("PartitionSpec")
        public String partitionSpec;

        /**
         * <p>The unique ID of the table in Data Map.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>odps.api_test.ods_openapi_log_d</p>
         */
        @NameInMap("TableGuid")
        public String tableGuid;

        public static CreateDataQualityEvaluationTaskRequestTarget build(java.util.Map<String, ?> map) throws Exception {
            CreateDataQualityEvaluationTaskRequestTarget self = new CreateDataQualityEvaluationTaskRequestTarget();
            return TeaModel.build(map, self);
        }

        public CreateDataQualityEvaluationTaskRequestTarget setDatabaseType(String databaseType) {
            this.databaseType = databaseType;
            return this;
        }
        public String getDatabaseType() {
            return this.databaseType;
        }

        public CreateDataQualityEvaluationTaskRequestTarget setPartitionSpec(String partitionSpec) {
            this.partitionSpec = partitionSpec;
            return this;
        }
        public String getPartitionSpec() {
            return this.partitionSpec;
        }

        public CreateDataQualityEvaluationTaskRequestTarget setTableGuid(String tableGuid) {
            this.tableGuid = tableGuid;
            return this;
        }
        public String getTableGuid() {
            return this.tableGuid;
        }

    }

    public static class CreateDataQualityEvaluationTaskRequestTrigger extends TeaModel {
        /**
         * <p>The list of scheduling task IDs. This parameter is valid when Type is set to ByScheduledTaskInstance.</p>
         */
        @NameInMap("TaskIds")
        public java.util.List<Long> taskIds;

        /**
         * <p>The trigger type of the quality monitoring task. Valid values:</p>
         * <ul>
         * <li>ByManual: triggered manually. This is the default value.</li>
         * <li>ByScheduledTaskInstance: triggered by an associated scheduling task.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ByScheduledTaskInstance</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateDataQualityEvaluationTaskRequestTrigger build(java.util.Map<String, ?> map) throws Exception {
            CreateDataQualityEvaluationTaskRequestTrigger self = new CreateDataQualityEvaluationTaskRequestTrigger();
            return TeaModel.build(map, self);
        }

        public CreateDataQualityEvaluationTaskRequestTrigger setTaskIds(java.util.List<Long> taskIds) {
            this.taskIds = taskIds;
            return this;
        }
        public java.util.List<Long> getTaskIds() {
            return this.taskIds;
        }

        public CreateDataQualityEvaluationTaskRequestTrigger setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
