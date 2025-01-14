// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DataQualityRuleTemplate extends TeaModel {
    @NameInMap("CheckingConfig")
    public DataQualityRuleTemplateCheckingConfig checkingConfig;

    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>/ods/订单数据</p>
     */
    @NameInMap("DirectoryPath")
    public String directoryPath;

    @NameInMap("Name")
    public String name;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("SamplingConfig")
    public DataQualityRuleTemplateSamplingConfig samplingConfig;

    @NameInMap("TenantId")
    public Long tenantId;

    /**
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
         * <strong>example:</strong>
         * <p>{ &quot;bizdate&quot;: [ &quot;-1&quot;, &quot;-7&quot;, &quot;-1m&quot; ] }</p>
         */
        @NameInMap("ReferencedSamplesFilter")
        public String referencedSamplesFilter;

        /**
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
         * <strong>example:</strong>
         * <p>Min</p>
         */
        @NameInMap("Metric")
        public String metric;

        /**
         * <strong>example:</strong>
         * <p>{ &quot;SQL&quot;: &quot;SELECT min(id) from table;&quot; }</p>
         */
        @NameInMap("MetricParameters")
        public String metricParameters;

        /**
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
