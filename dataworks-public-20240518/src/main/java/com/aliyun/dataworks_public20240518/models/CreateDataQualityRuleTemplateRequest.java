// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDataQualityRuleTemplateRequest extends TeaModel {
    /**
     * <p>The sample validation settings.</p>
     */
    @NameInMap("CheckingConfig")
    public CreateDataQualityRuleTemplateRequestCheckingConfig checkingConfig;

    /**
     * <p>The category directory where the custom template is stored. Hierarchy levels are separated by slashes. Each level name can be up to 1024 characters long and cannot contain whitespace characters or slashes.</p>
     * 
     * <strong>example:</strong>
     * <p>/ods/order_data</p>
     */
    @NameInMap("DirectoryPath")
    public String directoryPath;

    /**
     * <p>The name of the rule template. It can be a combination of digits, English letters, Chinese characters, and half-width or full-width punctuation marks. The maximum length is 512 characters.</p>
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
     * <p>The visibility scope of the template:</p>
     * <ul>
     * <li>Tenant: available to the entire tenant</li>
     * <li>Project: available only in the current project</li>
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
         * <p>Some threshold types require querying reference samples and then aggregating the values of those reference samples to derive the threshold used for comparison. An expression is used here to describe how the reference samples are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;bizdate&quot;: [ &quot;-1&quot;, &quot;-7&quot;, &quot;-1m&quot; ] }</p>
         */
        @NameInMap("ReferencedSamplesFilter")
        public String referencedSamplesFilter;

        /**
         * <p>The threshold calculation method:</p>
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
         * <p>The name of the metric to sample:</p>
         * <ul>
         * <li>Count: number of table rows</li>
         * <li>Min: minimum field value</li>
         * <li>Max: maximum field value</li>
         * <li>Avg: average field value</li>
         * <li>DistinctCount: number of distinct field values</li>
         * <li>DistinctPercent: ratio of the number of distinct field values to the number of data rows</li>
         * <li>DuplicatedCount: number of duplicate field values</li>
         * <li>DuplicatedPercent: ratio of the number of duplicate field values to the number of data rows</li>
         * <li>TableSize: table size</li>
         * <li>NullValueCount: number of rows where the field is null</li>
         * <li>NullValuePercent: ratio of rows where the field is null</li>
         * <li>GroupCount: each value and the corresponding number of data rows after aggregating by field value</li>
         * <li>CountNotIn: number of rows whose enum value does not match</li>
         * <li>CountDistinctNotIn: number of distinct values whose enum value does not match</li>
         * <li>UserDefinedSql: sample collection via a custom SQL statement</li>
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
         * <p>Runtime parameter setting statements to be inserted and executed before the sampling statement is executed. The maximum length is 1000 characters. Currently only MaxCompute is supported.</p>
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
