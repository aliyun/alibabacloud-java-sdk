// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateDataQualityRuleTemplateRequest extends TeaModel {
    /**
     * <p>The settings for sample validation.</p>
     */
    @NameInMap("CheckingConfig")
    public UpdateDataQualityRuleTemplateRequestCheckingConfig checkingConfig;

    /**
     * <p>The code of the rule template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>USER_DEFINED:123</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The category directory in which the custom template is stored. Levels are separated by forward slashes (/). The name of each level can be up to 1024 characters in length and cannot contain whitespace characters or forward slashes (/).</p>
     * 
     * <strong>example:</strong>
     * <p>/ods/order_data</p>
     */
    @NameInMap("DirectoryPath")
    public String directoryPath;

    /**
     * <p>The name of the rule template. The name can contain digits, letters, Chinese characters, and half-width and full-width punctuation marks. The name can be up to 512 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>Table row Count Verification</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace Management page to obtain the ID.</p>
     * <p>This parameter specifies the DataWorks workspace used for this API call.</p>
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
    public UpdateDataQualityRuleTemplateRequestSamplingConfig samplingConfig;

    public static UpdateDataQualityRuleTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataQualityRuleTemplateRequest self = new UpdateDataQualityRuleTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataQualityRuleTemplateRequest setCheckingConfig(UpdateDataQualityRuleTemplateRequestCheckingConfig checkingConfig) {
        this.checkingConfig = checkingConfig;
        return this;
    }
    public UpdateDataQualityRuleTemplateRequestCheckingConfig getCheckingConfig() {
        return this.checkingConfig;
    }

    public UpdateDataQualityRuleTemplateRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateDataQualityRuleTemplateRequest setDirectoryPath(String directoryPath) {
        this.directoryPath = directoryPath;
        return this;
    }
    public String getDirectoryPath() {
        return this.directoryPath;
    }

    public UpdateDataQualityRuleTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateDataQualityRuleTemplateRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public UpdateDataQualityRuleTemplateRequest setSamplingConfig(UpdateDataQualityRuleTemplateRequestSamplingConfig samplingConfig) {
        this.samplingConfig = samplingConfig;
        return this;
    }
    public UpdateDataQualityRuleTemplateRequestSamplingConfig getSamplingConfig() {
        return this.samplingConfig;
    }

    public static class UpdateDataQualityRuleTemplateRequestCheckingConfig extends TeaModel {
        /**
         * <p>For some types of thresholds, you must query reference samples and then aggregate the values of the reference samples to obtain the threshold used for comparison. An expression is used here to indicate the query method of reference samples.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;bizdate&quot;: [ &quot;-1&quot;, &quot;-7&quot;, &quot;-1m&quot; ] }</p>
         */
        @NameInMap("ReferencedSamplesFilter")
        public String referencedSamplesFilter;

        /**
         * <p>The type of the monitored object. Valid values:</p>
         * <ul>
         * <li>Table</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Table</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdateDataQualityRuleTemplateRequestCheckingConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataQualityRuleTemplateRequestCheckingConfig self = new UpdateDataQualityRuleTemplateRequestCheckingConfig();
            return TeaModel.build(map, self);
        }

        public UpdateDataQualityRuleTemplateRequestCheckingConfig setReferencedSamplesFilter(String referencedSamplesFilter) {
            this.referencedSamplesFilter = referencedSamplesFilter;
            return this;
        }
        public String getReferencedSamplesFilter() {
            return this.referencedSamplesFilter;
        }

        public UpdateDataQualityRuleTemplateRequestCheckingConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateDataQualityRuleTemplateRequestSamplingConfig extends TeaModel {
        /**
         * <p>The name of the metric to be sampled. Valid values:</p>
         * <ul>
         * <li>Count: the number of table rows.</li>
         * <li>Min: the minimum value of a field.</li>
         * <li>Max: the maximum value of a field.</li>
         * <li>Avg: the average value of a field.</li>
         * <li>DistinctCount: the number of distinct values of a field.</li>
         * <li>DistinctPercent: the ratio of the number of distinct values of a field to the number of data rows.</li>
         * <li>DuplicatedCount: the number of duplicate values of a field.</li>
         * <li>DuplicatedPercent: the ratio of the number of duplicate values of a field to the number of data rows.</li>
         * <li>TableSize: the size of the table.</li>
         * <li>NullValueCount: the number of rows in which the field is null.</li>
         * <li>NullValuePercent: the percentage of rows in which the field is null.</li>
         * <li>GroupCount: the number of data rows corresponding to each value after the field values are aggregated.</li>
         * <li>CountNotIn: the number of rows whose values do not match the enumerated values.</li>
         * <li>CountDistinctNotIn: the number of distinct values that do not match the enumerated values.</li>
         * <li>UserDefinedSql: sample collection by using custom SQL.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Max</p>
         */
        @NameInMap("Metric")
        public String metric;

        /**
         * <p>The parameters required for sample collection.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;SQL&quot;: &quot;select count(1) from table;&quot;}</p>
         */
        @NameInMap("MetricParameters")
        public String metricParameters;

        /**
         * <p>The runtime parameter setting statements that are inserted and executed before the sampling statements are executed. The statements can be up to 1,000 characters in length. Only MaxCompute is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>SET odps.sql.udf.timeout=600s; 
         * SET odps.sql.python.version=cp27;</p>
         */
        @NameInMap("SettingConfig")
        public String settingConfig;

        public static UpdateDataQualityRuleTemplateRequestSamplingConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataQualityRuleTemplateRequestSamplingConfig self = new UpdateDataQualityRuleTemplateRequestSamplingConfig();
            return TeaModel.build(map, self);
        }

        public UpdateDataQualityRuleTemplateRequestSamplingConfig setMetric(String metric) {
            this.metric = metric;
            return this;
        }
        public String getMetric() {
            return this.metric;
        }

        public UpdateDataQualityRuleTemplateRequestSamplingConfig setMetricParameters(String metricParameters) {
            this.metricParameters = metricParameters;
            return this;
        }
        public String getMetricParameters() {
            return this.metricParameters;
        }

        public UpdateDataQualityRuleTemplateRequestSamplingConfig setSettingConfig(String settingConfig) {
            this.settingConfig = settingConfig;
            return this;
        }
        public String getSettingConfig() {
            return this.settingConfig;
        }

    }

}
