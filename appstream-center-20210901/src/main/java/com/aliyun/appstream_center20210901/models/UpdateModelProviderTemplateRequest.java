// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class UpdateModelProviderTemplateRequest extends TeaModel {
    /**
     * <p>The model provider configuration.</p>
     */
    @NameInMap("Config")
    public UpdateModelProviderTemplateRequestConfig config;

    /**
     * <p>The description of the model provider template.</p>
     * 
     * <strong>example:</strong>
     * <p>阿里云百炼服务商</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to enable the Wuying security gateway proxy.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableWuyingProxy")
    public Boolean enableWuyingProxy;

    /**
     * <p>The name of the model provider template.</p>
     * 
     * <strong>example:</strong>
     * <p>阿里云百炼</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the model provider template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mpt-xxxx</p>
     */
    @NameInMap("ProviderTemplateId")
    public String providerTemplateId;

    public static UpdateModelProviderTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateModelProviderTemplateRequest self = new UpdateModelProviderTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateModelProviderTemplateRequest setConfig(UpdateModelProviderTemplateRequestConfig config) {
        this.config = config;
        return this;
    }
    public UpdateModelProviderTemplateRequestConfig getConfig() {
        return this.config;
    }

    public UpdateModelProviderTemplateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateModelProviderTemplateRequest setEnableWuyingProxy(Boolean enableWuyingProxy) {
        this.enableWuyingProxy = enableWuyingProxy;
        return this;
    }
    public Boolean getEnableWuyingProxy() {
        return this.enableWuyingProxy;
    }

    public UpdateModelProviderTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateModelProviderTemplateRequest setProviderTemplateId(String providerTemplateId) {
        this.providerTemplateId = providerTemplateId;
        return this;
    }
    public String getProviderTemplateId() {
        return this.providerTemplateId;
    }

    public static class UpdateModelProviderTemplateRequestConfig extends TeaModel {
        /**
         * <p>The API key of the model service, which is used for authentication. The key is encrypted after it is created.</p>
         * 
         * <strong>example:</strong>
         * <p>sk-xxxxxxxxxxxxxxxxxxxx</p>
         */
        @NameInMap("ApiKey")
        public String apiKey;

        /**
         * <p>The API protocol type.</p>
         * 
         * <strong>example:</strong>
         * <p>openai-completions</p>
         */
        @NameInMap("ApiType")
        public String apiType;

        /**
         * <p>The base URL of the model service API.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://dashscope.aliyuncs.com/compatible-mode/v1">https://dashscope.aliyuncs.com/compatible-mode/v1</a></p>
         */
        @NameInMap("BaseUrl")
        public String baseUrl;

        public static UpdateModelProviderTemplateRequestConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateModelProviderTemplateRequestConfig self = new UpdateModelProviderTemplateRequestConfig();
            return TeaModel.build(map, self);
        }

        public UpdateModelProviderTemplateRequestConfig setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public UpdateModelProviderTemplateRequestConfig setApiType(String apiType) {
            this.apiType = apiType;
            return this;
        }
        public String getApiType() {
            return this.apiType;
        }

        public UpdateModelProviderTemplateRequestConfig setBaseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }
        public String getBaseUrl() {
            return this.baseUrl;
        }

    }

}
