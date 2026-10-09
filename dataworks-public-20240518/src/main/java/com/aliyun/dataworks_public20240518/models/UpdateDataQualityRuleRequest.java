// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateDataQualityRuleRequest extends TeaModel {
    /**
     * <p>The sample check settings.</p>
     */
    @NameInMap("CheckingConfig")
    public UpdateDataQualityRuleRequestCheckingConfig checkingConfig;

    /**
     * <p>The description of the rule. It can be up to 500 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>this is a odps _sql task</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether the rule is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>The list of error handlers for quality rule check issues.</p>
     */
    @NameInMap("ErrorHandlers")
    public java.util.List<UpdateDataQualityRuleRequestErrorHandlers> errorHandlers;

    /**
     * <p>The ID of the rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100001</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The name of the rule. The name can contain digits, letters, Chinese characters, and half-width or full-width punctuation marks. It can be up to 255 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>Table cannot be empty</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace Configuration page to obtain the workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The settings required for sample collection.</p>
     */
    @NameInMap("SamplingConfig")
    public UpdateDataQualityRuleRequestSamplingConfig samplingConfig;

    /**
     * <p>The severity level of the rule for the business, which corresponds to the strong or weak rule on the page. Valid values:</p>
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
     * <p>The unique identifier of the rule template referenced by the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>SYSTEM:table:table_count:fixed</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

    public static UpdateDataQualityRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataQualityRuleRequest self = new UpdateDataQualityRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataQualityRuleRequest setCheckingConfig(UpdateDataQualityRuleRequestCheckingConfig checkingConfig) {
        this.checkingConfig = checkingConfig;
        return this;
    }
    public UpdateDataQualityRuleRequestCheckingConfig getCheckingConfig() {
        return this.checkingConfig;
    }

    public UpdateDataQualityRuleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateDataQualityRuleRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public UpdateDataQualityRuleRequest setErrorHandlers(java.util.List<UpdateDataQualityRuleRequestErrorHandlers> errorHandlers) {
        this.errorHandlers = errorHandlers;
        return this;
    }
    public java.util.List<UpdateDataQualityRuleRequestErrorHandlers> getErrorHandlers() {
        return this.errorHandlers;
    }

    public UpdateDataQualityRuleRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateDataQualityRuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateDataQualityRuleRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public UpdateDataQualityRuleRequest setSamplingConfig(UpdateDataQualityRuleRequestSamplingConfig samplingConfig) {
        this.samplingConfig = samplingConfig;
        return this;
    }
    public UpdateDataQualityRuleRequestSamplingConfig getSamplingConfig() {
        return this.samplingConfig;
    }

    public UpdateDataQualityRuleRequest setSeverity(String severity) {
        this.severity = severity;
        return this;
    }
    public String getSeverity() {
        return this.severity;
    }

    public UpdateDataQualityRuleRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public static class UpdateDataQualityRuleRequestCheckingConfigThresholdsCritical extends TeaModel {
        /**
         * <p>The threshold expression. For fluctuation rules, you must use an expression to specify the fluctuation threshold. Examples:</p>
         * <ul>
         * <li>Fluctuation increase greater than 0.01: $checkValue &gt; 0.01 </li>
         * <li>Fluctuation decrease greater than 0.01: $checkValue &lt; -0.01 </li>
         * <li>Absolute value of the fluctuation rate: abs($checkValue) &gt; 0.01
         * For fixed value rules, you can also use an expression to configure the threshold. If both are configured, the expression takes precedence over the Operator and Value parameters.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>$checkValue &gt; 0.05</p>
         */
        @NameInMap("Expression")
        public String expression;

        /**
         * <p>The comparison operator. Valid values:</p>
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
         * <p>The threshold value.</p>
         * 
         * <strong>example:</strong>
         * <p>100.0</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateDataQualityRuleRequestCheckingConfigThresholdsCritical build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataQualityRuleRequestCheckingConfigThresholdsCritical self = new UpdateDataQualityRuleRequestCheckingConfigThresholdsCritical();
            return TeaModel.build(map, self);
        }

        public UpdateDataQualityRuleRequestCheckingConfigThresholdsCritical setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public UpdateDataQualityRuleRequestCheckingConfigThresholdsCritical setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public UpdateDataQualityRuleRequestCheckingConfigThresholdsCritical setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateDataQualityRuleRequestCheckingConfigThresholdsExpected extends TeaModel {
        /**
         * <p>The threshold expression. For fluctuation rules, you must use an expression to specify the fluctuation threshold. Examples:</p>
         * <ul>
         * <li>Fluctuation increase greater than 0.01: $checkValue &gt; 0.01 </li>
         * <li>Fluctuation decrease greater than 0.01: $checkValue &lt; -0.01 </li>
         * <li>Absolute value of the fluctuation rate: abs($checkValue) &gt; 0.01
         * For fixed value rules, you can also use an expression to configure the threshold. If both are configured, the expression takes precedence over the Operator and Value parameters.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>$checkValue &lt;= 0.01</p>
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
         * <p>100.0</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateDataQualityRuleRequestCheckingConfigThresholdsExpected build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataQualityRuleRequestCheckingConfigThresholdsExpected self = new UpdateDataQualityRuleRequestCheckingConfigThresholdsExpected();
            return TeaModel.build(map, self);
        }

        public UpdateDataQualityRuleRequestCheckingConfigThresholdsExpected setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public UpdateDataQualityRuleRequestCheckingConfigThresholdsExpected setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public UpdateDataQualityRuleRequestCheckingConfigThresholdsExpected setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateDataQualityRuleRequestCheckingConfigThresholdsWarned extends TeaModel {
        /**
         * <p>The threshold expression. For fluctuation rules, you must use an expression to specify the fluctuation threshold. Examples:</p>
         * <ul>
         * <li>Fluctuation increase greater than 0.01: $checkValue &gt; 0.01 </li>
         * <li>Fluctuation decrease greater than 0.01: $checkValue &lt; -0.01 </li>
         * <li>Absolute value of the fluctuation rate: abs($checkValue) &gt; 0.01
         * For fixed value rules, you can also use an expression to configure the threshold. If both are configured, the expression takes precedence over the Operator and Value parameters.</li>
         * </ul>
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
         * <p>The threshold value.</p>
         * 
         * <strong>example:</strong>
         * <p>100.0</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateDataQualityRuleRequestCheckingConfigThresholdsWarned build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataQualityRuleRequestCheckingConfigThresholdsWarned self = new UpdateDataQualityRuleRequestCheckingConfigThresholdsWarned();
            return TeaModel.build(map, self);
        }

        public UpdateDataQualityRuleRequestCheckingConfigThresholdsWarned setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public UpdateDataQualityRuleRequestCheckingConfigThresholdsWarned setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public UpdateDataQualityRuleRequestCheckingConfigThresholdsWarned setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateDataQualityRuleRequestCheckingConfigThresholds extends TeaModel {
        /**
         * <p>The threshold settings for critical warnings.</p>
         */
        @NameInMap("Critical")
        public UpdateDataQualityRuleRequestCheckingConfigThresholdsCritical critical;

        /**
         * <p>The expected threshold settings.</p>
         */
        @NameInMap("Expected")
        public UpdateDataQualityRuleRequestCheckingConfigThresholdsExpected expected;

        /**
         * <p>The threshold settings for common warnings.</p>
         */
        @NameInMap("Warned")
        public UpdateDataQualityRuleRequestCheckingConfigThresholdsWarned warned;

        public static UpdateDataQualityRuleRequestCheckingConfigThresholds build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataQualityRuleRequestCheckingConfigThresholds self = new UpdateDataQualityRuleRequestCheckingConfigThresholds();
            return TeaModel.build(map, self);
        }

        public UpdateDataQualityRuleRequestCheckingConfigThresholds setCritical(UpdateDataQualityRuleRequestCheckingConfigThresholdsCritical critical) {
            this.critical = critical;
            return this;
        }
        public UpdateDataQualityRuleRequestCheckingConfigThresholdsCritical getCritical() {
            return this.critical;
        }

        public UpdateDataQualityRuleRequestCheckingConfigThresholds setExpected(UpdateDataQualityRuleRequestCheckingConfigThresholdsExpected expected) {
            this.expected = expected;
            return this;
        }
        public UpdateDataQualityRuleRequestCheckingConfigThresholdsExpected getExpected() {
            return this.expected;
        }

        public UpdateDataQualityRuleRequestCheckingConfigThresholds setWarned(UpdateDataQualityRuleRequestCheckingConfigThresholdsWarned warned) {
            this.warned = warned;
            return this;
        }
        public UpdateDataQualityRuleRequestCheckingConfigThresholdsWarned getWarned() {
            return this.warned;
        }

    }

    public static class UpdateDataQualityRuleRequestCheckingConfig extends TeaModel {
        /**
         * <p>For some types of thresholds, reference samples must be queried, and the values of the reference samples are aggregated to obtain the threshold for comparison. This parameter uses an expression to specify the query method for the reference samples.</p>
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
        public UpdateDataQualityRuleRequestCheckingConfigThresholds thresholds;

        /**
         * <p>The threshold calculation method. This parameter is optional when a template is used. Valid values:</p>
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

        public static UpdateDataQualityRuleRequestCheckingConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataQualityRuleRequestCheckingConfig self = new UpdateDataQualityRuleRequestCheckingConfig();
            return TeaModel.build(map, self);
        }

        public UpdateDataQualityRuleRequestCheckingConfig setReferencedSamplesFilter(String referencedSamplesFilter) {
            this.referencedSamplesFilter = referencedSamplesFilter;
            return this;
        }
        public String getReferencedSamplesFilter() {
            return this.referencedSamplesFilter;
        }

        public UpdateDataQualityRuleRequestCheckingConfig setThresholds(UpdateDataQualityRuleRequestCheckingConfigThresholds thresholds) {
            this.thresholds = thresholds;
            return this;
        }
        public UpdateDataQualityRuleRequestCheckingConfigThresholds getThresholds() {
            return this.thresholds;
        }

        public UpdateDataQualityRuleRequestCheckingConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateDataQualityRuleRequestErrorHandlers extends TeaModel {
        /**
         * <p>If the rule is a custom SQL rule, you must specify an SQL statement to filter the error data.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT * FROM tb_api_log WHERE id IS NULL</p>
         */
        @NameInMap("ErrorDataFilter")
        public String errorDataFilter;

        /**
         * <p>The type of the error handler. Valid values:</p>
         * <ul>
         * <li>SaveErrorData</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SaveErrorData</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdateDataQualityRuleRequestErrorHandlers build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataQualityRuleRequestErrorHandlers self = new UpdateDataQualityRuleRequestErrorHandlers();
            return TeaModel.build(map, self);
        }

        public UpdateDataQualityRuleRequestErrorHandlers setErrorDataFilter(String errorDataFilter) {
            this.errorDataFilter = errorDataFilter;
            return this;
        }
        public String getErrorDataFilter() {
            return this.errorDataFilter;
        }

        public UpdateDataQualityRuleRequestErrorHandlers setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateDataQualityRuleRequestSamplingConfig extends TeaModel {
        /**
         * <p>The name of the sampling metric. This parameter is optional when a template is used. Valid values:</p>
         * <ul>
         * <li>Count: number of rows in the table</li>
         * <li>Min: minimum value of the field</li>
         * <li>Max: maximum value of the field</li>
         * <li>Avg: average value of the field</li>
         * <li>DistinctCount: number of unique values in the field</li>
         * <li>DistinctPercent: ratio of the number of unique values in the field to the number of data rows</li>
         * <li>DuplicatedCount: number of duplicate values in the field</li>
         * <li>DuplicatedPercent: ratio of the number of duplicate values in the field to the number of data rows</li>
         * <li>TableSize: size of the table</li>
         * <li>NullValueCount: number of rows where the field is null</li>
         * <li>NullValuePercent: ratio of rows where the field is null</li>
         * <li>GroupCount: number of data rows corresponding to each value after aggregation by field value</li>
         * <li>CountNotIn: number of rows that do not match the enumerated values</li>
         * <li>CountDistinctNotIn: number of unique values that do not match the enumerated values</li>
         * <li>UserDefinedSql: sample collection by using custom SQL statements</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Min</p>
         */
        @NameInMap("Metric")
        public String metric;

        /**
         * <p>The parameters required for sample collection.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;Columns&quot;: [ &quot;id&quot;, &quot;name&quot; ] , &quot;SQL&quot;: &quot;select count(1) from table;&quot;}</p>
         */
        @NameInMap("MetricParameters")
        public String metricParameters;

        /**
         * <p>The condition used to filter out unneeded data during sampling. It can be up to 16,777,215 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>id IS NULL</p>
         */
        @NameInMap("SamplingFilter")
        public String samplingFilter;

        /**
         * <p>The runtime parameter setting statements that are inserted and executed before the sampling statements are executed. It can be up to 1,000 characters in length. Only MaxCompute is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>SET odps.sql.udf.timeout=600s; 
         * SET odps.sql.python.version=cp27;</p>
         */
        @NameInMap("SettingConfig")
        public String settingConfig;

        public static UpdateDataQualityRuleRequestSamplingConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataQualityRuleRequestSamplingConfig self = new UpdateDataQualityRuleRequestSamplingConfig();
            return TeaModel.build(map, self);
        }

        public UpdateDataQualityRuleRequestSamplingConfig setMetric(String metric) {
            this.metric = metric;
            return this;
        }
        public String getMetric() {
            return this.metric;
        }

        public UpdateDataQualityRuleRequestSamplingConfig setMetricParameters(String metricParameters) {
            this.metricParameters = metricParameters;
            return this;
        }
        public String getMetricParameters() {
            return this.metricParameters;
        }

        public UpdateDataQualityRuleRequestSamplingConfig setSamplingFilter(String samplingFilter) {
            this.samplingFilter = samplingFilter;
            return this;
        }
        public String getSamplingFilter() {
            return this.samplingFilter;
        }

        public UpdateDataQualityRuleRequestSamplingConfig setSettingConfig(String settingConfig) {
            this.settingConfig = settingConfig;
            return this;
        }
        public String getSettingConfig() {
            return this.settingConfig;
        }

    }

}
