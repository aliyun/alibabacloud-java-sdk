// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateDataQualityRuleTemplateRequest extends TeaModel {
    /**
     * <p>The check settings for sample data.</p>
     */
    @NameInMap("CheckingConfig")
    public UpdateDataQualityRuleTemplateRequestCheckingConfig checkingConfig;

    /**
     * <p>The code for the template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>USER_DEFINED:123</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The directory in which the template is stored. Slashes (/) are used to separate directory levels. The name of each directory level can be up to 1,024 characters in length. It cannot contain whitespace characters or slashes (/).</p>
     * 
     * <strong>example:</strong>
     * <p>/ods/order_data</p>
     */
    @NameInMap("DirectoryPath")
    public String directoryPath;

    /**
     * <p>The name of the template. The name can be up to 512 characters in length and can contain digits, letters, and punctuation marks.</p>
     * 
     * <strong>example:</strong>
     * <p>Table row Count Verification</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The sampling settings.</p>
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
         * <p>The method that is used to query the referenced samples. To obtain some types of thresholds, you need to query reference samples and perform aggregate operations on the reference values. In this example, an expression is used to specify the query method of referenced samples.</p>
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
         * <li>UserDefinedSql: indicates that data is sampled by executing custom SQL statements.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Max</p>
         */
        @NameInMap("Metric")
        public String metric;

        /**
         * <p>The parameters required for sampling.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;SQL&quot;: &quot;select count(1) from table;&quot;}</p>
         */
        @NameInMap("MetricParameters")
        public String metricParameters;

        /**
         * <p>The statements that are used to configure the parameters required for sampling before you execute the sampling statements. The statements can be up to 1,000 characters in length. Only the MaxCompute database is supported.</p>
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
