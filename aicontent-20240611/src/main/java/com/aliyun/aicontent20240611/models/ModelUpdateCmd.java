// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelUpdateCmd extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>sk-xxxx</p>
     */
    @NameInMap("apiKey")
    public String apiKey;

    /**
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

    public static ModelUpdateCmd build(java.util.Map<String, ?> map) throws Exception {
        ModelUpdateCmd self = new ModelUpdateCmd();
        return TeaModel.build(map, self);
    }

    public ModelUpdateCmd setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public ModelUpdateCmd setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
        return this;
    }
    public String getBaseUrl() {
        return this.baseUrl;
    }

    public ModelUpdateCmd setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModelUpdateCmd setMaxInputLength(String maxInputLength) {
        this.maxInputLength = maxInputLength;
        return this;
    }
    public String getMaxInputLength() {
        return this.maxInputLength;
    }

    public ModelUpdateCmd setMaxOutputLength(String maxOutputLength) {
        this.maxOutputLength = maxOutputLength;
        return this;
    }
    public String getMaxOutputLength() {
        return this.maxOutputLength;
    }

    public ModelUpdateCmd setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public ModelUpdateCmd setModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }
    public String getModelType() {
        return this.modelType;
    }

    public ModelUpdateCmd setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModelUpdateCmd setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public ModelUpdateCmd setSymbol(String symbol) {
        this.symbol = symbol;
        return this;
    }
    public String getSymbol() {
        return this.symbol;
    }

    public ModelUpdateCmd setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

}
