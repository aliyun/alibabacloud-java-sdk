// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetRuntimeModelConfigResponseBody extends TeaModel {
    /**
     * <p>The returned result object.</p>
     */
    @NameInMap("Data")
    public GetRuntimeModelConfigResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetRuntimeModelConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRuntimeModelConfigResponseBody self = new GetRuntimeModelConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRuntimeModelConfigResponseBody setData(GetRuntimeModelConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetRuntimeModelConfigResponseBodyData getData() {
        return this.data;
    }

    public GetRuntimeModelConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetRuntimeModelConfigResponseBodyDataModelProviderListLlmInfoListInferenceMetadata extends TeaModel {
        /**
         * <p>The list of request modalities, such as Text, Image, and Audio.</p>
         */
        @NameInMap("RequestModality")
        public java.util.List<String> requestModality;

        /**
         * <p>The list of response modalities, such as Text, Image, and Audio.</p>
         */
        @NameInMap("ResponseModality")
        public java.util.List<String> responseModality;

        public static GetRuntimeModelConfigResponseBodyDataModelProviderListLlmInfoListInferenceMetadata build(java.util.Map<String, ?> map) throws Exception {
            GetRuntimeModelConfigResponseBodyDataModelProviderListLlmInfoListInferenceMetadata self = new GetRuntimeModelConfigResponseBodyDataModelProviderListLlmInfoListInferenceMetadata();
            return TeaModel.build(map, self);
        }

        public GetRuntimeModelConfigResponseBodyDataModelProviderListLlmInfoListInferenceMetadata setRequestModality(java.util.List<String> requestModality) {
            this.requestModality = requestModality;
            return this;
        }
        public java.util.List<String> getRequestModality() {
            return this.requestModality;
        }

        public GetRuntimeModelConfigResponseBodyDataModelProviderListLlmInfoListInferenceMetadata setResponseModality(java.util.List<String> responseModality) {
            this.responseModality = responseModality;
            return this;
        }
        public java.util.List<String> getResponseModality() {
            return this.responseModality;
        }

    }

    public static class GetRuntimeModelConfigResponseBodyDataModelProviderListLlmInfoList extends TeaModel {
        /**
         * <p>The model description.</p>
         * 
         * <strong>example:</strong>
         * <p>Qwen3.6原生视觉语言系列Plus模型，展现出与当前顶尖前沿模型相媲美的卓越性能，模型效果相较3.5系列显著提升。模型在Agentic coding、前端编程、Vibe coding等代码能力、多模态万物识别、OCR、物体定位等能力上显著增强。</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The list of model features, such as function-calling, web-search, and structured-outputs.</p>
         */
        @NameInMap("Features")
        public java.util.List<String> features;

        /**
         * <p>The inference metadata, including request and response modalities.</p>
         */
        @NameInMap("InferenceMetadata")
        public GetRuntimeModelConfigResponseBodyDataModelProviderListLlmInfoListInferenceMetadata inferenceMetadata;

        /**
         * <p>The model code.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen3.6-plus</p>
         */
        @NameInMap("LlmCode")
        public String llmCode;

        /**
         * <p>The model name.</p>
         * 
         * <strong>example:</strong>
         * <p>Qwen3.6-Plus</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The publish time in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-03-04T06:25:17.000+00:00</p>
         */
        @NameInMap("PublishedTime")
        public String publishedTime;

        /**
         * <p>The model risk type. This parameter is returned only when the request parameter IncludeRiskInfo is set to true.</p>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("RiskType")
        public String riskType;

        public static GetRuntimeModelConfigResponseBodyDataModelProviderListLlmInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetRuntimeModelConfigResponseBodyDataModelProviderListLlmInfoList self = new GetRuntimeModelConfigResponseBodyDataModelProviderListLlmInfoList();
            return TeaModel.build(map, self);
        }

        public GetRuntimeModelConfigResponseBodyDataModelProviderListLlmInfoList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetRuntimeModelConfigResponseBodyDataModelProviderListLlmInfoList setFeatures(java.util.List<String> features) {
            this.features = features;
            return this;
        }
        public java.util.List<String> getFeatures() {
            return this.features;
        }

        public GetRuntimeModelConfigResponseBodyDataModelProviderListLlmInfoList setInferenceMetadata(GetRuntimeModelConfigResponseBodyDataModelProviderListLlmInfoListInferenceMetadata inferenceMetadata) {
            this.inferenceMetadata = inferenceMetadata;
            return this;
        }
        public GetRuntimeModelConfigResponseBodyDataModelProviderListLlmInfoListInferenceMetadata getInferenceMetadata() {
            return this.inferenceMetadata;
        }

        public GetRuntimeModelConfigResponseBodyDataModelProviderListLlmInfoList setLlmCode(String llmCode) {
            this.llmCode = llmCode;
            return this;
        }
        public String getLlmCode() {
            return this.llmCode;
        }

        public GetRuntimeModelConfigResponseBodyDataModelProviderListLlmInfoList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetRuntimeModelConfigResponseBodyDataModelProviderListLlmInfoList setPublishedTime(String publishedTime) {
            this.publishedTime = publishedTime;
            return this;
        }
        public String getPublishedTime() {
            return this.publishedTime;
        }

        public GetRuntimeModelConfigResponseBodyDataModelProviderListLlmInfoList setRiskType(String riskType) {
            this.riskType = riskType;
            return this;
        }
        public String getRiskType() {
            return this.riskType;
        }

    }

    public static class GetRuntimeModelConfigResponseBodyDataModelProviderList extends TeaModel {
        /**
         * <p>The list of model information.</p>
         */
        @NameInMap("LlmInfoList")
        public java.util.List<GetRuntimeModelConfigResponseBodyDataModelProviderListLlmInfoList> llmInfoList;

        /**
         * <p>The model provider template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>mpt-xxxx</p>
         */
        @NameInMap("ModelProviderTemplateId")
        public String modelProviderTemplateId;

        /**
         * <p>The model provider template name.</p>
         * 
         * <strong>example:</strong>
         * <p>百炼</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The model provider name.</p>
         * 
         * <strong>example:</strong>
         * <p>bailian</p>
         */
        @NameInMap("ProviderName")
        public String providerName;

        public static GetRuntimeModelConfigResponseBodyDataModelProviderList build(java.util.Map<String, ?> map) throws Exception {
            GetRuntimeModelConfigResponseBodyDataModelProviderList self = new GetRuntimeModelConfigResponseBodyDataModelProviderList();
            return TeaModel.build(map, self);
        }

        public GetRuntimeModelConfigResponseBodyDataModelProviderList setLlmInfoList(java.util.List<GetRuntimeModelConfigResponseBodyDataModelProviderListLlmInfoList> llmInfoList) {
            this.llmInfoList = llmInfoList;
            return this;
        }
        public java.util.List<GetRuntimeModelConfigResponseBodyDataModelProviderListLlmInfoList> getLlmInfoList() {
            return this.llmInfoList;
        }

        public GetRuntimeModelConfigResponseBodyDataModelProviderList setModelProviderTemplateId(String modelProviderTemplateId) {
            this.modelProviderTemplateId = modelProviderTemplateId;
            return this;
        }
        public String getModelProviderTemplateId() {
            return this.modelProviderTemplateId;
        }

        public GetRuntimeModelConfigResponseBodyDataModelProviderList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetRuntimeModelConfigResponseBodyDataModelProviderList setProviderName(String providerName) {
            this.providerName = providerName;
            return this;
        }
        public String getProviderName() {
            return this.providerName;
        }

    }

    public static class GetRuntimeModelConfigResponseBodyData extends TeaModel {
        /**
         * <p>The default model (format: providerName/llmCode).</p>
         * 
         * <strong>example:</strong>
         * <p>bailian/qwen3.6-plus</p>
         */
        @NameInMap("DefaultModel")
        public String defaultModel;

        /**
         * <p>The list of model providers.</p>
         */
        @NameInMap("ModelProviderList")
        public java.util.List<GetRuntimeModelConfigResponseBodyDataModelProviderList> modelProviderList;

        /**
         * <p>The configured model group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>mt-xxxx</p>
         */
        @NameInMap("ModelTemplateId")
        public String modelTemplateId;

        /**
         * <p>The model group name.</p>
         * 
         * <strong>example:</strong>
         * <p>model-template-001</p>
         */
        @NameInMap("ModelTemplateName")
        public String modelTemplateName;

        /**
         * <p>The model template association type (returned only when an association exists).</p>
         * 
         * <strong>example:</strong>
         * <p>Runtime</p>
         */
        @NameInMap("ModelTemplateRefType")
        public String modelTemplateRefType;

        /**
         * <p>The resource group ID to which the runtime belongs. The value is null if the runtime is not associated with a resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-xxxxx</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        public static GetRuntimeModelConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRuntimeModelConfigResponseBodyData self = new GetRuntimeModelConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRuntimeModelConfigResponseBodyData setDefaultModel(String defaultModel) {
            this.defaultModel = defaultModel;
            return this;
        }
        public String getDefaultModel() {
            return this.defaultModel;
        }

        public GetRuntimeModelConfigResponseBodyData setModelProviderList(java.util.List<GetRuntimeModelConfigResponseBodyDataModelProviderList> modelProviderList) {
            this.modelProviderList = modelProviderList;
            return this;
        }
        public java.util.List<GetRuntimeModelConfigResponseBodyDataModelProviderList> getModelProviderList() {
            return this.modelProviderList;
        }

        public GetRuntimeModelConfigResponseBodyData setModelTemplateId(String modelTemplateId) {
            this.modelTemplateId = modelTemplateId;
            return this;
        }
        public String getModelTemplateId() {
            return this.modelTemplateId;
        }

        public GetRuntimeModelConfigResponseBodyData setModelTemplateName(String modelTemplateName) {
            this.modelTemplateName = modelTemplateName;
            return this;
        }
        public String getModelTemplateName() {
            return this.modelTemplateName;
        }

        public GetRuntimeModelConfigResponseBodyData setModelTemplateRefType(String modelTemplateRefType) {
            this.modelTemplateRefType = modelTemplateRefType;
            return this;
        }
        public String getModelTemplateRefType() {
            return this.modelTemplateRefType;
        }

        public GetRuntimeModelConfigResponseBodyData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

    }

}
