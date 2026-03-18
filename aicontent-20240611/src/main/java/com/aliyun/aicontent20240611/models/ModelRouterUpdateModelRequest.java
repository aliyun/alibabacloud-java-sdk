// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterUpdateModelRequest extends TeaModel {
    /**
     * <p>API Key</p>
     * 
     * <strong>example:</strong>
     * <p>sk-xxxx</p>
     */
    @NameInMap("apiKey")
    public String apiKey;

    /**
     * <p>Base URL</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://dashscope.aliyuncs.com">https://dashscope.aliyuncs.com</a></p>
     */
    @NameInMap("baseUrl")
    public String baseUrl;

    /**
     * <strong>example:</strong>
     * <p>通义千问大模型</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>8192</p>
     */
    @NameInMap("maxInputLength")
    public String maxInputLength;

    /**
     * <strong>example:</strong>
     * <p>2048</p>
     */
    @NameInMap("maxOutputLength")
    public String maxOutputLength;

    /**
     * <strong>example:</strong>
     * <p>qwen-turbo</p>
     */
    @NameInMap("modelId")
    public String modelId;

    /**
     * <strong>example:</strong>
     * <p>Chat</p>
     */
    @NameInMap("modelType")
    public String modelType;

    /**
     * <strong>example:</strong>
     * <p>通义千问</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("status")
    public Integer status;

    /**
     * <strong>example:</strong>
     * <p>alibaba</p>
     */
    @NameInMap("symbol")
    public String symbol;

    /**
     * <strong>example:</strong>
     * <p>chat,NLP</p>
     */
    @NameInMap("tags")
    public String tags;

    public static ModelRouterUpdateModelRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterUpdateModelRequest self = new ModelRouterUpdateModelRequest();
        return TeaModel.build(map, self);
    }

    public ModelRouterUpdateModelRequest setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public ModelRouterUpdateModelRequest setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
        return this;
    }
    public String getBaseUrl() {
        return this.baseUrl;
    }

    public ModelRouterUpdateModelRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModelRouterUpdateModelRequest setMaxInputLength(String maxInputLength) {
        this.maxInputLength = maxInputLength;
        return this;
    }
    public String getMaxInputLength() {
        return this.maxInputLength;
    }

    public ModelRouterUpdateModelRequest setMaxOutputLength(String maxOutputLength) {
        this.maxOutputLength = maxOutputLength;
        return this;
    }
    public String getMaxOutputLength() {
        return this.maxOutputLength;
    }

    public ModelRouterUpdateModelRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public ModelRouterUpdateModelRequest setModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }
    public String getModelType() {
        return this.modelType;
    }

    public ModelRouterUpdateModelRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModelRouterUpdateModelRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public ModelRouterUpdateModelRequest setSymbol(String symbol) {
        this.symbol = symbol;
        return this;
    }
    public String getSymbol() {
        return this.symbol;
    }

    public ModelRouterUpdateModelRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

}
