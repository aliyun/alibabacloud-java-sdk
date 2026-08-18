// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDataQualityRuleTemplateRequest extends TeaModel {
    /**
     * <p>The sample verification settings.</p>
     */
    @NameInMap("CheckingConfig")
    public CreateDataQualityRuleTemplateRequestCheckingConfig checkingConfig;

    /**
     * <p>The directory path where the custom template is stored. Levels are separated by forward slashes (/). Each level name can be up to 1024 characters in length and cannot contain whitespace characters or forward slashes.</p>
     * 
     * <strong>example:</strong>
     * <p>/ods/order_data</p>
     */
    @NameInMap("DirectoryPath")
    public String directoryPath;

    /**
     * <p>The name of the rule template. The name can contain digits, letters, Chinese characters, and half-width or full-width punctuation marks. The name can be up to 512 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Table row Count Verification</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The DataWorks workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The settings required for sample collection.</p>
     */
    @NameInMap("SamplingConfig")
    public CreateDataQualityRuleTemplateRequestSamplingConfig samplingConfig;

    /**
     * <p>The visibility scope of the template. Valid values:</p>
     * <ul>
     * <li>Tenant: available to the entire tenant.</li>
     * <li>Project: available only in the current project.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Project</p>
     */
    @NameInMap("VisibleScope")
    public String visibleScope;

    public static CreateDataQualityRuleTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataQualityRuleTemplateRequest self = new CreateDataQualityRuleTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataQualityRuleTemplateRequest setCheckingConfig(CreateDataQualityRuleTemplateRequestCheckingConfig checkingConfig) {
        this.checkingConfig = checkingConfig;
        return this;
    }
    public CreateDataQualityRuleTemplateRequestCheckingConfig getCheckingConfig() {
        return this.checkingConfig;
    }

    public CreateDataQualityRuleTemplateRequest setDirectoryPath(String directoryPath) {
        this.directoryPath = directoryPath;
        return this;
    }
    public String getDirectoryPath() {
        return this.directoryPath;
    }

    public CreateDataQualityRuleTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDataQualityRuleTemplateRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateDataQualityRuleTemplateRequest setSamplingConfig(CreateDataQualityRuleTemplateRequestSamplingConfig samplingConfig) {
        this.samplingConfig = samplingConfig;
        return this;
    }
    public CreateDataQualityRuleTemplateRequestSamplingConfig getSamplingConfig() {
        return this.samplingConfig;
    }

    public CreateDataQualityRuleTemplateRequest setVisibleScope(String visibleScope) {
        this.visibleScope = visibleScope;
        return this;
    }
    public String getVisibleScope() {
        return this.visibleScope;
    }

    public static class CreateDataQualityRuleTemplateRequestCheckingConfig extends TeaModel {
        /**
         * <p>An expression that specifies how to query reference samples. Some threshold types require querying reference samples and then aggregating their values to derive the threshold for comparison.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;bizdate&quot;: [ &quot;-1&quot;, &quot;-7&quot;, &quot;-1m&quot; ] }</p>
         */
        @NameInMap("ReferencedSamplesFilter")
        public String referencedSamplesFilter;

        /**
         * <p>The threshold calculation method. Valid values:</p>
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

        public static CreateDataQualityRuleTemplateRequestCheckingConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateDataQualityRuleTemplateRequestCheckingConfig self = new CreateDataQualityRuleTemplateRequestCheckingConfig();
            return TeaModel.build(map, self);
        }

        public CreateDataQualityRuleTemplateRequestCheckingConfig setReferencedSamplesFilter(String referencedSamplesFilter) {
            this.referencedSamplesFilter = referencedSamplesFilter;
            return this;
        }
        public String getReferencedSamplesFilter() {
            return this.referencedSamplesFilter;
        }

        public CreateDataQualityRuleTemplateRequestCheckingConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateDataQualityRuleTemplateRequestSamplingConfig extends TeaModel {
        /**
         * <p>The name of the sampling metric. Valid values:</p>
         * <ul>
         * <li>Count: the number of table rows.</li>
         * <li>Min: the minimum value of a field.</li>
         * <li>Max: the maximum value of a field.</li>
         * <li>Avg: the average value of a field.</li>
         * <li>DistinctCount: the number of distinct values in a field.</li>
         * <li>DistinctPercent: the ratio of distinct values to the total number of rows.</li>
         * <li>DuplicatedCount: the number of duplicate values in a field.</li>
         * <li>DuplicatedPercent: the ratio of duplicate values to the total number of rows.</li>
         * <li>TableSize: the table size.</li>
         * <li>NullValueCount: the number of rows where the field value is null.</li>
         * <li>NullValuePercent: the ratio of rows where the field value is null.</li>
         * <li>GroupCount: the count of rows for each value after aggregation by field value.</li>
         * <li>CountNotIn: the number of rows that do not match the enumerated values.</li>
         * <li>CountDistinctNotIn: the number of distinct values that do not match the enumerated values.</li>
         * <li>UserDefinedSql: sample collection through a custom SQL statement.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Count</p>
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
         * <p>The runtime parameter setting statements to execute before the sampling statement. The value can be up to 1000 characters in length. Currently, only MaxCompute is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>SET odps.sql.udf.timeout=600s; 
         * SET odps.sql.python.version=cp27;</p>
         */
        @NameInMap("SettingConfig")
        public String settingConfig;

        public static CreateDataQualityRuleTemplateRequestSamplingConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateDataQualityRuleTemplateRequestSamplingConfig self = new CreateDataQualityRuleTemplateRequestSamplingConfig();
            return TeaModel.build(map, self);
        }

        public CreateDataQualityRuleTemplateRequestSamplingConfig setMetric(String metric) {
            this.metric = metric;
            return this;
        }
        public String getMetric() {
            return this.metric;
        }

        public CreateDataQualityRuleTemplateRequestSamplingConfig setMetricParameters(String metricParameters) {
            this.metricParameters = metricParameters;
            return this;
        }
        public String getMetricParameters() {
            return this.metricParameters;
        }

        public CreateDataQualityRuleTemplateRequestSamplingConfig setSettingConfig(String settingConfig) {
            this.settingConfig = settingConfig;
            return this;
        }
        public String getSettingConfig() {
            return this.settingConfig;
        }

    }

}
