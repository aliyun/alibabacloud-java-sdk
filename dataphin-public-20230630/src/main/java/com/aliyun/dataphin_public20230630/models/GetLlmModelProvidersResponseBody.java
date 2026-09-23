// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetLlmModelProvidersResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The list of large language model service providers and available models.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetLlmModelProvidersResponseBodyData> data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The details of the backend exception.</p>
     * 
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetLlmModelProvidersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLlmModelProvidersResponseBody self = new GetLlmModelProvidersResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLlmModelProvidersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetLlmModelProvidersResponseBody setData(java.util.List<GetLlmModelProvidersResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetLlmModelProvidersResponseBodyData> getData() {
        return this.data;
    }

    public GetLlmModelProvidersResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetLlmModelProvidersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLlmModelProvidersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLlmModelProvidersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetLlmModelProvidersResponseBodyDataLlmModels extends TeaModel {
        /**
         * <p>The Chinese name of the model.</p>
         * 
         * <strong>example:</strong>
         * <p>通义千问-Max</p>
         */
        @NameInMap("CnName")
        public String cnName;

        /**
         * <p>The description of the model.</p>
         * 
         * <strong>example:</strong>
         * <p>General text generation model</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The list of available dimension values for the embedding model. This value is returned only for embedding models.</p>
         */
        @NameInMap("EmbeddingDimensions")
        public java.util.List<Integer> embeddingDimensions;

        /**
         * <p>The enabling status.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The model invocation method. Valid values:</p>
         * <ul>
         * <li>OPEN_AI</li>
         * <li>DASH_SCOPE</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DASH_SCOPE</p>
         */
        @NameInMap("InvokeType")
        public String invokeType;

        /**
         * <p>The model ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("ModelId")
        public Long modelId;

        /**
         * <p>The list of model modality types. Valid values:</p>
         * <ul>
         * <li>TEXT: text</li>
         * <li>IMAGE: image</li>
         * <li>AUDIO: audio</li>
         * <li>VIDEO: video</li>
         * <li>EMBEDDING: embedding</li>
         * </ul>
         */
        @NameInMap("ModelTypes")
        public java.util.List<String> modelTypes;

        /**
         * <p>The name of the model.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-max</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The service provider.</p>
         * 
         * <strong>example:</strong>
         * <p>bailian</p>
         */
        @NameInMap("ServiceProvider")
        public String serviceProvider;

        /**
         * <p>The list of model task capabilities. Valid values:</p>
         * <ul>
         * <li>ASR: speech recognition</li>
         * <li>TTS: speech synthesis</li>
         * <li>TRANSLATION: speech translation</li>
         * </ul>
         */
        @NameInMap("Tasks")
        public java.util.List<String> tasks;

        public static GetLlmModelProvidersResponseBodyDataLlmModels build(java.util.Map<String, ?> map) throws Exception {
            GetLlmModelProvidersResponseBodyDataLlmModels self = new GetLlmModelProvidersResponseBodyDataLlmModels();
            return TeaModel.build(map, self);
        }

        public GetLlmModelProvidersResponseBodyDataLlmModels setCnName(String cnName) {
            this.cnName = cnName;
            return this;
        }
        public String getCnName() {
            return this.cnName;
        }

        public GetLlmModelProvidersResponseBodyDataLlmModels setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetLlmModelProvidersResponseBodyDataLlmModels setEmbeddingDimensions(java.util.List<Integer> embeddingDimensions) {
            this.embeddingDimensions = embeddingDimensions;
            return this;
        }
        public java.util.List<Integer> getEmbeddingDimensions() {
            return this.embeddingDimensions;
        }

        public GetLlmModelProvidersResponseBodyDataLlmModels setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetLlmModelProvidersResponseBodyDataLlmModels setInvokeType(String invokeType) {
            this.invokeType = invokeType;
            return this;
        }
        public String getInvokeType() {
            return this.invokeType;
        }

        public GetLlmModelProvidersResponseBodyDataLlmModels setModelId(Long modelId) {
            this.modelId = modelId;
            return this;
        }
        public Long getModelId() {
            return this.modelId;
        }

        public GetLlmModelProvidersResponseBodyDataLlmModels setModelTypes(java.util.List<String> modelTypes) {
            this.modelTypes = modelTypes;
            return this;
        }
        public java.util.List<String> getModelTypes() {
            return this.modelTypes;
        }

        public GetLlmModelProvidersResponseBodyDataLlmModels setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLlmModelProvidersResponseBodyDataLlmModels setServiceProvider(String serviceProvider) {
            this.serviceProvider = serviceProvider;
            return this;
        }
        public String getServiceProvider() {
            return this.serviceProvider;
        }

        public GetLlmModelProvidersResponseBodyDataLlmModels setTasks(java.util.List<String> tasks) {
            this.tasks = tasks;
            return this;
        }
        public java.util.List<String> getTasks() {
            return this.tasks;
        }

    }

    public static class GetLlmModelProvidersResponseBodyData extends TeaModel {
        /**
         * <p>The base URL of the model.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://dashscope.aliyuncs.com">https://dashscope.aliyuncs.com</a></p>
         */
        @NameInMap("BaseUrl")
        public String baseUrl;

        /**
         * <p>The enabling status.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The ID of the model service provider.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The list of models provided by the model service provider.</p>
         */
        @NameInMap("LlmModels")
        public java.util.List<GetLlmModelProvidersResponseBodyDataLlmModels> llmModels;

        /**
         * <p>The source of the model service provider. Valid values:</p>
         * <ul>
         * <li>BUILTIN_MODEL: built-in</li>
         * <li>BYOM: user-provided</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BUILTIN_MODEL</p>
         */
        @NameInMap("ProviderSource")
        public String providerSource;

        /**
         * <p>The provider type. Valid values:</p>
         * <ul>
         * <li>BAILIAN</li>
         * <li>DEEPSEEK</li>
         * <li>AI_STACK</li>
         * <li>VLLM</li>
         * <li>AGENT_ONE</li>
         * <li>DATAPHIN</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BAILIAN</p>
         */
        @NameInMap("ProviderType")
        public String providerType;

        /**
         * <p>The name of the model service provider.</p>
         * 
         * <strong>example:</strong>
         * <p>bailian</p>
         */
        @NameInMap("ServiceProvider")
        public String serviceProvider;

        public static GetLlmModelProvidersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetLlmModelProvidersResponseBodyData self = new GetLlmModelProvidersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetLlmModelProvidersResponseBodyData setBaseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }
        public String getBaseUrl() {
            return this.baseUrl;
        }

        public GetLlmModelProvidersResponseBodyData setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetLlmModelProvidersResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetLlmModelProvidersResponseBodyData setLlmModels(java.util.List<GetLlmModelProvidersResponseBodyDataLlmModels> llmModels) {
            this.llmModels = llmModels;
            return this;
        }
        public java.util.List<GetLlmModelProvidersResponseBodyDataLlmModels> getLlmModels() {
            return this.llmModels;
        }

        public GetLlmModelProvidersResponseBodyData setProviderSource(String providerSource) {
            this.providerSource = providerSource;
            return this;
        }
        public String getProviderSource() {
            return this.providerSource;
        }

        public GetLlmModelProvidersResponseBodyData setProviderType(String providerType) {
            this.providerType = providerType;
            return this;
        }
        public String getProviderType() {
            return this.providerType;
        }

        public GetLlmModelProvidersResponseBodyData setServiceProvider(String serviceProvider) {
            this.serviceProvider = serviceProvider;
            return this;
        }
        public String getServiceProvider() {
            return this.serviceProvider;
        }

    }

}
