// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetRuntimeModelConfigResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetRuntimeModelConfigResponseBodyData data;

    /**
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
        @NameInMap("RequestModality")
        public java.util.List<String> requestModality;

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
        @NameInMap("Description")
        public String description;

        @NameInMap("Features")
        public java.util.List<String> features;

        @NameInMap("InferenceMetadata")
        public GetRuntimeModelConfigResponseBodyDataModelProviderListLlmInfoListInferenceMetadata inferenceMetadata;

        /**
         * <strong>example:</strong>
         * <p>qwen3.6-plus</p>
         */
        @NameInMap("LlmCode")
        public String llmCode;

        /**
         * <strong>example:</strong>
         * <p>Qwen3.6-Plus</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>2026-03-04T06:25:17.000+00:00</p>
         */
        @NameInMap("PublishedTime")
        public String publishedTime;

        /**
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
        @NameInMap("LlmInfoList")
        public java.util.List<GetRuntimeModelConfigResponseBodyDataModelProviderListLlmInfoList> llmInfoList;

        /**
         * <strong>example:</strong>
         * <p>mpt-xxxx</p>
         */
        @NameInMap("ModelProviderTemplateId")
        public String modelProviderTemplateId;

        @NameInMap("Name")
        public String name;

        /**
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
         * <strong>example:</strong>
         * <p>bailian/qwen3.6-plus</p>
         */
        @NameInMap("DefaultModel")
        public String defaultModel;

        @NameInMap("ModelProviderList")
        public java.util.List<GetRuntimeModelConfigResponseBodyDataModelProviderList> modelProviderList;

        /**
         * <strong>example:</strong>
         * <p>mt-xxxx</p>
         */
        @NameInMap("ModelTemplateId")
        public String modelTemplateId;

        /**
         * <strong>example:</strong>
         * <p>model-template-001</p>
         */
        @NameInMap("ModelTemplateName")
        public String modelTemplateName;

        @NameInMap("ModelTemplateRefType")
        public String modelTemplateRefType;

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
