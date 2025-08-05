// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class CreateDataQualityRuleTemplateRequest extends TeaModel {
    @NameInMap("CheckingConfig")
    public CreateDataQualityRuleTemplateRequestCheckingConfig checkingConfig;

    @NameInMap("DirectoryPath")
    public String directoryPath;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("SamplingConfig")
    public CreateDataQualityRuleTemplateRequestSamplingConfig samplingConfig;

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
        @NameInMap("ReferencedSamplesFilter")
        public String referencedSamplesFilter;

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
        @NameInMap("Metric")
        public String metric;

        @NameInMap("MetricParameters")
        public String metricParameters;

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
