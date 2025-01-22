// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDataQualityEvaluationTaskRequest extends TeaModel {
    /**
     * <p>The list of monitoring rules that are associated with the monitor. If you configure the ID of a monitoring rule by using the DataQualityRule.Id parameter, the system associates the rule with a created monitor. If you do not configure the ID of a monitoring rule, the system creates a new monitoring rule by using other fields and associates the rule with a created monitor.</p>
     */
    @NameInMap("DataQualityRules")
    public java.util.List<CreateDataQualityEvaluationTaskRequestDataQualityRules> dataQualityRules;

    /**
     * <p>The data source ID. You can call the <a href="https://help.aliyun.com/document_detail/211431.html">ListDataSources</a> operation to query the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DataSourceId")
    public Long dataSourceId;

    /**
     * <p>The description of the monitor.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The hook.</p>
     */
    @NameInMap("Hooks")
    public java.util.List<CreateDataQualityEvaluationTaskRequestHooks> hooks;

    /**
     * <p>The name of the monitor.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The configurations of alert notifications.</p>
     */
    @NameInMap("Notifications")
    public CreateDataQualityEvaluationTaskRequestNotifications notifications;

    /**
     * <p>The ID of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to query the ID.</p>
     * <p>You can use this parameter to specify the DataWorks workspace on which you want to perform the API operation.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The extended configurations in JSON-formatted strings. You can use this parameter only for monitors that are used to monitor the quality of E-MapReduce (EMR) data.</p>
     * <ul>
     * <li><p>queue: The Yarn queue used when a monitor checks the quality of EMR data. By default, the queue configured for the current workspace is used.</p>
     * </li>
     * <li><p>sqlEngine: The SQL engine used when a monitor checks the quality of EMR data.</p>
     * <ul>
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
     * <p>The monitored object of the monitor.</p>
     */
    @NameInMap("Target")
    public CreateDataQualityEvaluationTaskRequestTarget target;

    /**
     * <p>The trigger configuration of the monitor.</p>
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
         * <p>The threshold settings for critical alerts.</p>
         */
        @NameInMap("Critical")
        public CreateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsCritical critical;

        /**
         * <p>The expected threshold setting.</p>
         */
        @NameInMap("Expected")
        public CreateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsExpected expected;

        /**
         * <p>The threshold settings for normal alerts.</p>
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
         * <p>The method that is used to query the referenced samples. To obtain specific types of thresholds, you must query reference values. In this example, an expression is used to specify the query method of referenced samples.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;bizdate&quot;: [&quot;-1&quot;]}</p>
         */
        @NameInMap("ReferencedSamplesFilter")
        public String referencedSamplesFilter;

        /**
         * <p>The threshold settings.</p>
         */
        @NameInMap("Thresholds")
        public CreateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholds thresholds;

        /**
         * <p>The threshold calculation method. Valid values:</p>
         * <ul>
         * <li>Fixed</li>
         * <li>Fluctuation</li>
         * <li>FluctuationDiscreate</li>
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
         * <p>The SQL statement that is used to filter failed tasks. If you define the rule by using custom SQL statements, you must specify an SQL statement to filter failed tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT * FROM ods_api_log WHERE status = \&quot;Error\&quot;;</p>
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
         * <li>UserDefinedSql: specifies that data is sampled by executing custom SQL statements.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NullValueCount</p>
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
         * <p>status != \&quot;Succeeded\&quot;</p>
         */
        @NameInMap("SamplingFilter")
        public String samplingFilter;

        /**
         * <p>The statements that are used to configure the parameters required for sampling before you execute the sampling statements. The statements can be up to 1,000 characters in length. Only the MaxCompute database is supported.</p>
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
         * <p>The check settings for sample data.</p>
         */
        @NameInMap("CheckingConfig")
        public CreateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfig checkingConfig;

        /**
         * <p>The description of the monitoring rule.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Specifies whether to enable the monitoring rule.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The operations that you can perform after the rule-based check.</p>
         */
        @NameInMap("ErrorHandlers")
        public java.util.List<CreateDataQualityEvaluationTaskRequestDataQualityRulesErrorHandlers> errorHandlers;

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2176</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the monitoring rule.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The parameters required for sampling.</p>
         */
        @NameInMap("SamplingConfig")
        public CreateDataQualityEvaluationTaskRequestDataQualityRulesSamplingConfig samplingConfig;

        /**
         * <p>The strength of the monitoring rule. Valid values:</p>
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
         * <p>The ID of the template used by the monitoring rule.</p>
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
         * <p>The hook trigger condition. When this condition is met, the hook action is triggered. Only two conditional expressions are supported:</p>
         * <ol>
         * <li>Specify only one group of rule strength type and rule check status, such as <code>${severity} == &quot;High&quot; AND ${status} == &quot;Critical&quot;</code>. In this expression, the hook trigger condition is met if severity is High and status is Critical.</li>
         * <li>Specify multiple groups of rule strength types and rule check status, such as <code>(${severity} == &quot;High&quot; AND ${status} == &quot;Critical&quot;) OR (${severity} == &quot;Normal&quot; AND ${status} == &quot;Critical&quot;) OR (${severity} == &quot;Normal&quot; AND ${status} == &quot;Error&quot;)</code>. In this expression, the hook trigger condition is met if severity is High and status is Critical, severity is Normal and status is Critical, or severity is Normal and status is Error. The enumeration of severity in a conditional expression is the same as the enumeration of severity in DataQualityRule. The enumeration of status in a conditional expression is the same as the enumeration of status in DataQualityResult.</li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>(${severity} == &quot;High&quot; AND ${status} == &quot;Critical&quot;) OR (${severity} == &quot;Normal&quot; AND ${status} == &quot;Critical&quot;) OR (${severity} == &quot;Normal&quot; AND ${status} == &quot;Error&quot;)</p>
         */
        @NameInMap("Condition")
        public String condition;

        /**
         * <p>The hook type. Only one hook type is supported.</p>
         * <ul>
         * <li>BlockTaskInstance: Blocks the running of scheduling tasks. A monitor is triggered by scheduling tasks. After a monitor finishes running, the monitor determines whether to block the running of scheduling tasks based on the hook condition.</li>
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
         * <p>The alert notification method.</p>
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
         * <p>The additional parameters that are required when alerts are sent. The parameters are JSON-formatted strings. The following keys are supported:</p>
         * <ul>
         * <li>atAll: specifies that all members in a group are mentioned when alerts are sent by using DingTalk. This parameter is valid only if you set ReceiverType to DingdingUrl.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{  &quot;atAll&quot;: true }</p>
         */
        @NameInMap("Extension")
        public String extension;

        /**
         * <p>The type of the alert recipient.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>WebhookUrl</li>
         * <li>FeishuUrl</li>
         * <li>DingdingUrl</li>
         * <li>WeixinUrl</li>
         * <li>AliUid</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DingdingUrl</p>
         */
        @NameInMap("ReceiverType")
        public String receiverType;

        /**
         * <p>The alert recipient.</p>
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
         * <p>The alert notification method.</p>
         */
        @NameInMap("NotificationChannels")
        public java.util.List<CreateDataQualityEvaluationTaskRequestNotificationsNotificationsNotificationChannels> notificationChannels;

        /**
         * <p>The configurations of alert recipients.</p>
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
         * <p>The notification trigger condition. When this condition is met, the alert notification is triggered. Only two conditional expressions are supported:</p>
         * <p>Specify only one group of rule strength type and rule check status, such as <code>${severity} == &quot;High&quot; AND ${status} == &quot;Critical&quot;</code>. In this expression, the hook trigger condition is met if severity is High and status is Critical. Specify multiple groups of rule strength types and rule check status, such as <code>(${severity} == &quot;High&quot; AND ${status} == &quot;Critical&quot;) OR (${severity} == &quot;Normal&quot; AND ${status} == &quot;Critical&quot;) OR (${severity} == &quot;Normal&quot; AND ${status} == &quot;Error&quot;)</code>. In this expression, the hook trigger condition is met if severity is High and status is Critical, severity is Normal and status is Critical, or severity is Normal and status is Error. The enumeration of severity in a conditional expression is the same as the enumeration of severity in DataQualityRule. The enumeration of status in a conditional expression is the same as the enumeration of status in DataQualityResult.</p>
         * 
         * <strong>example:</strong>
         * <p>(${severity} == &quot;High&quot; AND ${status} == &quot;Critical&quot;) OR (${severity} == &quot;Normal&quot; AND ${status} == &quot;Critical&quot;) OR (${severity} == &quot;Normal&quot; AND ${status} == &quot;Error&quot;)</p>
         */
        @NameInMap("Condition")
        public String condition;

        /**
         * <p>The configurations of the alert notification.</p>
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
         * <p>The type of the database to which the table belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>maxcompute</p>
         */
        @NameInMap("DatabaseType")
        public String databaseType;

        /**
         * <p>The partition configuration of the partitioned table.</p>
         * 
         * <strong>example:</strong>
         * <p>pt=$[yyyymmdd-1]</p>
         */
        @NameInMap("PartitionSpec")
        public String partitionSpec;

        /**
         * <p>The ID of the table in Data Map.</p>
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
         * <p>The IDs of scheduling tasks. This parameter is valid only if you set Type to ByScheduledTaskInstance.</p>
         */
        @NameInMap("TaskIds")
        public java.util.List<Long> taskIds;

        /**
         * <p>The trigger type of the monitor. Valid values:</p>
         * <ul>
         * <li>ByManual (default): The monitor is manually triggered.</li>
         * <li>ByScheduledTaskInstance: The monitor is triggered by the associated scheduling tasks.</li>
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
