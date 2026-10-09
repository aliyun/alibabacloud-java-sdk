// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DataQualityRuleTemplate extends TeaModel {
    /**
     * <p>The sample check settings.</p>
     */
    @NameInMap("CheckingConfig")
    public DataQualityRuleTemplateCheckingConfig checkingConfig;

    /**
     * <p>The globally unique code of the rule template.</p>
     * 
     * <strong>example:</strong>
     * <p>USER_DEFINED:123</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The category directory where the custom template is stored. Levels are separated by forward slashes.</p>
     * 
     * <strong>example:</strong>
     * <p>/ods/OrderData</p>
     */
    @NameInMap("DirectoryPath")
    public String directoryPath;

    /**
     * <p>The name of the rule template.</p>
     * 
     * <strong>example:</strong>
     * <p>Table row count check</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The DataWorks workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2043</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The sample collection settings.</p>
     */
    @NameInMap("SamplingConfig")
    public DataQualityRuleTemplateSamplingConfig samplingConfig;

    /**
     * <p>The DataWorks tenant ID.</p>
     */
    @NameInMap("TenantId")
    public Long tenantId;

    /**
     * <p>The visibility scope of the template.</p>
     * 
     * <strong>example:</strong>
     * <p>Project</p>
     */
    @NameInMap("VisibleScope")
    public String visibleScope;

    public static DataQualityRuleTemplate build(java.util.Map<String, ?> map) throws Exception {
        DataQualityRuleTemplate self = new DataQualityRuleTemplate();
        return TeaModel.build(map, self);
    }

    public DataQualityRuleTemplate setCheckingConfig(DataQualityRuleTemplateCheckingConfig checkingConfig) {
        this.checkingConfig = checkingConfig;
        return this;
    }
    public DataQualityRuleTemplateCheckingConfig getCheckingConfig() {
        return this.checkingConfig;
    }

    public DataQualityRuleTemplate setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DataQualityRuleTemplate setDirectoryPath(String directoryPath) {
        this.directoryPath = directoryPath;
        return this;
    }
    public String getDirectoryPath() {
        return this.directoryPath;
    }

    public DataQualityRuleTemplate setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DataQualityRuleTemplate setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public DataQualityRuleTemplate setSamplingConfig(DataQualityRuleTemplateSamplingConfig samplingConfig) {
        this.samplingConfig = samplingConfig;
        return this;
    }
    public DataQualityRuleTemplateSamplingConfig getSamplingConfig() {
        return this.samplingConfig;
    }

    public DataQualityRuleTemplate setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public DataQualityRuleTemplate setVisibleScope(String visibleScope) {
        this.visibleScope = visibleScope;
        return this;
    }
    public String getVisibleScope() {
        return this.visibleScope;
    }

    public static class DataQualityRuleTemplateCheckingConfig extends TeaModel {
        /**
         * <p>The expression used to query referenced samples. Some threshold types require querying referenced samples and aggregating their values to derive the comparison threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;bizdate&quot;: [ &quot;-1&quot;, &quot;-7&quot;, &quot;-1m&quot; ] }</p>
         */
        @NameInMap("ReferencedSamplesFilter")
        public String referencedSamplesFilter;

        /**
         * <p>The threshold calculation method.</p>
         * 
         * <strong>example:</strong>
         * <p>Fixed</p>
         */
        @NameInMap("Type")
        public String type;

        public static DataQualityRuleTemplateCheckingConfig build(java.util.Map<String, ?> map) throws Exception {
            DataQualityRuleTemplateCheckingConfig self = new DataQualityRuleTemplateCheckingConfig();
            return TeaModel.build(map, self);
        }

        public DataQualityRuleTemplateCheckingConfig setReferencedSamplesFilter(String referencedSamplesFilter) {
            this.referencedSamplesFilter = referencedSamplesFilter;
            return this;
        }
        public String getReferencedSamplesFilter() {
            return this.referencedSamplesFilter;
        }

        public DataQualityRuleTemplateCheckingConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DataQualityRuleTemplateSamplingConfig extends TeaModel {
        /**
         * <p>The name of the sampled metric.</p>
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
         * <p>{ &quot;SQL&quot;: &quot;SELECT min(id) from table;&quot; }</p>
         */
        @NameInMap("MetricParameters")
        public String metricParameters;

        /**
         * <p>The runtime parameter setting statements inserted before the execution of the sampling statement. The maximum length is 1,000 characters. Currently, only MaxCompute is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>SET odps.sql.udf.timeout=600s;</p>
         */
        @NameInMap("SettingConfig")
        public String settingConfig;

        public static DataQualityRuleTemplateSamplingConfig build(java.util.Map<String, ?> map) throws Exception {
            DataQualityRuleTemplateSamplingConfig self = new DataQualityRuleTemplateSamplingConfig();
            return TeaModel.build(map, self);
        }

        public DataQualityRuleTemplateSamplingConfig setMetric(String metric) {
            this.metric = metric;
            return this;
        }
        public String getMetric() {
            return this.metric;
        }

        public DataQualityRuleTemplateSamplingConfig setMetricParameters(String metricParameters) {
            this.metricParameters = metricParameters;
            return this;
        }
        public String getMetricParameters() {
            return this.metricParameters;
        }

        public DataQualityRuleTemplateSamplingConfig setSettingConfig(String settingConfig) {
            this.settingConfig = settingConfig;
            return this;
        }
        public String getSettingConfig() {
            return this.settingConfig;
        }

    }

}
