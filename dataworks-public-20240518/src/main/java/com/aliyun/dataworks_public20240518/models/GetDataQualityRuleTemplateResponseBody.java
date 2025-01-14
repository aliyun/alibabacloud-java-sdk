// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetDataQualityRuleTemplateResponseBody extends TeaModel {
    /**
     * <p>The information about the template.</p>
     */
    @NameInMap("DataQualityRuleTemplate")
    public GetDataQualityRuleTemplateResponseBodyDataQualityRuleTemplate dataQualityRuleTemplate;

    /**
     * <strong>example:</strong>
     * <p>691CA452-D37A-4ED0-9441</p>
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
         * <strong>example:</strong>
         * <p>Max</p>
         */
        @NameInMap("Metric")
        public String metric;

        /**
         * <strong>example:</strong>
         * <p>{&quot;SQL&quot;: &quot;select count(1) from table;&quot;}</p>
         */
        @NameInMap("MetricParameters")
        public String metricParameters;

        /**
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
        @NameInMap("CheckingConfig")
        public GetDataQualityRuleTemplateResponseBodyDataQualityRuleTemplateCheckingConfig checkingConfig;

        /**
         * <strong>example:</strong>
         * <p>USER_DEFINED:123</p>
         */
        @NameInMap("Code")
        public String code;

        @NameInMap("DirectoryPath")
        public String directoryPath;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>4020</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("SamplingConfig")
        public GetDataQualityRuleTemplateResponseBodyDataQualityRuleTemplateSamplingConfig samplingConfig;

        /**
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
