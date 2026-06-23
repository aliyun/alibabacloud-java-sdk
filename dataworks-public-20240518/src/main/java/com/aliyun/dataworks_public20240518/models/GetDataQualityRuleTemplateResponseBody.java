// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetDataQualityRuleTemplateResponseBody extends TeaModel {
    /**
     * <p>The details of the rule template.</p>
     */
    @NameInMap("DataQualityRuleTemplate")
    public GetDataQualityRuleTemplateResponseBodyDataQualityRuleTemplate dataQualityRuleTemplate;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>691CA452-D37A-4E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetDataQualityRuleTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataQualityRuleTemplateResponseBody self = new GetDataQualityRuleTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataQualityRuleTemplateResponseBody setDataQualityRuleTemplate(GetDataQualityRuleTemplateResponseBodyDataQualityRuleTemplate dataQualityRuleTemplate) {
        this.dataQualityRuleTemplate = dataQualityRuleTemplate;
        return this;
    }
    public GetDataQualityRuleTemplateResponseBodyDataQualityRuleTemplate getDataQualityRuleTemplate() {
        return this.dataQualityRuleTemplate;
    }

    public GetDataQualityRuleTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDataQualityRuleTemplateResponseBodyDataQualityRuleTemplateCheckingConfig extends TeaModel {
        /**
         * <p>Some types of thresholds require you to query reference samples and aggregate the values of the reference samples to obtain the threshold for comparison. An expression is used to indicate the query method of reference samples.</p>
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

        public static GetDataQualityRuleTemplateResponseBodyDataQualityRuleTemplateCheckingConfig build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityRuleTemplateResponseBodyDataQualityRuleTemplateCheckingConfig self = new GetDataQualityRuleTemplateResponseBodyDataQualityRuleTemplateCheckingConfig();
            return TeaModel.build(map, self);
        }

        public GetDataQualityRuleTemplateResponseBodyDataQualityRuleTemplateCheckingConfig setReferencedSamplesFilter(String referencedSamplesFilter) {
            this.referencedSamplesFilter = referencedSamplesFilter;
            return this;
        }
        public String getReferencedSamplesFilter() {
            return this.referencedSamplesFilter;
        }

        public GetDataQualityRuleTemplateResponseBodyDataQualityRuleTemplateCheckingConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDataQualityRuleTemplateResponseBodyDataQualityRuleTemplateSamplingConfig extends TeaModel {
        /**
         * <p>The name of the metric to be sampled:</p>
         * <ul>
         * <li>Count: the number of rows in the table.</li>
         * <li>Min: the minimum value of the field.</li>
         * <li>Max: the maximum value of the field.</li>
         * <li>Avg: the average value of the field.</li>
         * <li>DistinctCount: the number of distinct values of the field.</li>
         * <li>DistinctPercent: the ratio of the number of distinct values of the field to the number of data rows.</li>
         * <li>DuplicatedCount: the number of duplicate values of the field.</li>
         * <li>DuplicatedPercent: the ratio of the number of duplicate values of the field to the number of data rows.</li>
         * <li>TableSize: the size of the table.</li>
         * <li>NullValueCount: the number of rows in which the field is null.</li>
         * <li>NullValuePercent: the percentage of rows in which the field is null.</li>
         * <li>GroupCount: the number of data rows corresponding to each value after aggregation by field value.</li>
         * <li>CountNotIn: the number of rows whose enumerated values do not match.</li>
         * <li>CountDistinctNotIn: the number of distinct values whose enumerated values do not match.</li>
         * <li>UserDefinedSql: collects samples by using a custom SQL statement.</li>
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
         * <p>The runtime parameter setting statements that are inserted and executed before the specific sampling statement is executed. The setting can be a maximum of 1,000 characters in length. Only MaxCompute is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>SET odps.sql.udf.timeout=600s; 
         * SET odps.sql.python.version=cp27;</p>
         */
        @NameInMap("SettingConfig")
        public String settingConfig;

        public static GetDataQualityRuleTemplateResponseBodyDataQualityRuleTemplateSamplingConfig build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityRuleTemplateResponseBodyDataQualityRuleTemplateSamplingConfig self = new GetDataQualityRuleTemplateResponseBodyDataQualityRuleTemplateSamplingConfig();
            return TeaModel.build(map, self);
        }

        public GetDataQualityRuleTemplateResponseBodyDataQualityRuleTemplateSamplingConfig setMetric(String metric) {
            this.metric = metric;
            return this;
        }
        public String getMetric() {
            return this.metric;
        }

        public GetDataQualityRuleTemplateResponseBodyDataQualityRuleTemplateSamplingConfig setMetricParameters(String metricParameters) {
            this.metricParameters = metricParameters;
            return this;
        }
        public String getMetricParameters() {
            return this.metricParameters;
        }

        public GetDataQualityRuleTemplateResponseBodyDataQualityRuleTemplateSamplingConfig setSettingConfig(String settingConfig) {
            this.settingConfig = settingConfig;
            return this;
        }
        public String getSettingConfig() {
            return this.settingConfig;
        }

    }

    public static class GetDataQualityRuleTemplateResponseBodyDataQualityRuleTemplate extends TeaModel {
        /**
         * <p>The sample verification settings.</p>
         */
        @NameInMap("CheckingConfig")
        public GetDataQualityRuleTemplateResponseBodyDataQualityRuleTemplateCheckingConfig checkingConfig;

        /**
         * <p>The code of the rule template.</p>
         * 
         * <strong>example:</strong>
         * <p>USER_DEFINED:123</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The category directory in which the custom template is stored. Levels are separated by forward slashes (/). Each level name can be a maximum of 1,024 characters in length and cannot contain whitespace characters or forward slashes (/).</p>
         * 
         * <strong>example:</strong>
         * <p>/ods/order_data</p>
         */
        @NameInMap("DirectoryPath")
        public String directoryPath;

        /**
         * <p>The name of the rule template. The name can be a combination of digits, letters, Chinese characters, and half-width or full-width punctuation marks. The name can be a maximum of 512 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>Table row Count Verification</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the DataWorks workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>4020</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The settings required for sample collection.</p>
         */
        @NameInMap("SamplingConfig")
        public GetDataQualityRuleTemplateResponseBodyDataQualityRuleTemplateSamplingConfig samplingConfig;

        /**
         * <p>The scope in which the template is available:</p>
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

        public static GetDataQualityRuleTemplateResponseBodyDataQualityRuleTemplate build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityRuleTemplateResponseBodyDataQualityRuleTemplate self = new GetDataQualityRuleTemplateResponseBodyDataQualityRuleTemplate();
            return TeaModel.build(map, self);
        }

        public GetDataQualityRuleTemplateResponseBodyDataQualityRuleTemplate setCheckingConfig(GetDataQualityRuleTemplateResponseBodyDataQualityRuleTemplateCheckingConfig checkingConfig) {
            this.checkingConfig = checkingConfig;
            return this;
        }
        public GetDataQualityRuleTemplateResponseBodyDataQualityRuleTemplateCheckingConfig getCheckingConfig() {
            return this.checkingConfig;
        }

        public GetDataQualityRuleTemplateResponseBodyDataQualityRuleTemplate setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetDataQualityRuleTemplateResponseBodyDataQualityRuleTemplate setDirectoryPath(String directoryPath) {
            this.directoryPath = directoryPath;
            return this;
        }
        public String getDirectoryPath() {
            return this.directoryPath;
        }

        public GetDataQualityRuleTemplateResponseBodyDataQualityRuleTemplate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDataQualityRuleTemplateResponseBodyDataQualityRuleTemplate setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetDataQualityRuleTemplateResponseBodyDataQualityRuleTemplate setSamplingConfig(GetDataQualityRuleTemplateResponseBodyDataQualityRuleTemplateSamplingConfig samplingConfig) {
            this.samplingConfig = samplingConfig;
            return this;
        }
        public GetDataQualityRuleTemplateResponseBodyDataQualityRuleTemplateSamplingConfig getSamplingConfig() {
            return this.samplingConfig;
        }

        public GetDataQualityRuleTemplateResponseBodyDataQualityRuleTemplate setVisibleScope(String visibleScope) {
            this.visibleScope = visibleScope;
            return this;
        }
        public String getVisibleScope() {
            return this.visibleScope;
        }

    }

}
