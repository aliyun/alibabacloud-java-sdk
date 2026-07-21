// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelDTO extends TeaModel {
    /**
     * <p>A masked preview of the API key.</p>
     * 
     * <strong>example:</strong>
     * <p>sk-xxx****xxx</p>
     */
    @NameInMap("apiKeyPreview")
    public String apiKeyPreview;

    /**
     * <p>The base URL for API requests.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://dashscope.aliyuncs.com">https://dashscope.aliyuncs.com</a></p>
     */
    @NameInMap("baseUrl")
    public String baseUrl;

    /**
     * <p>Indicates the model\&quot;s status. A value of 0 means enabled, and a non-zero value means disabled.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("deleteTag")
    public Integer deleteTag;

    /**
     * <p>The model description.</p>
     * 
     * <strong>example:</strong>
     * <p>通义千问大模型</p>
     */
    @NameInMap("description")
    public String description;

    @NameInMap("extensions")
    public String extensions;

    /**
     * <p>The time when the model was created, in ISO 8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-01-01T00:00:00Z</p>
     */
    @NameInMap("gmtCreate")
    public String gmtCreate;

    /**
     * <p>The time when the model was last updated, in ISO 8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-01-01T00:00:00Z</p>
     */
    @NameInMap("gmtModified")
    public String gmtModified;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("hasBillingRule")
    public Boolean hasBillingRule;

    /**
     * <p>The unique ID of the model.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    public Long id;

    @NameInMap("inOut")
    public String inOut;

    /**
     * <p>Indicates whether the model is custom.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("isCustom")
    public Boolean isCustom;

    /**
     * <p>The maximum input length.</p>
     * 
     * <strong>example:</strong>
     * <p>8192</p>
     */
    @NameInMap("maxInputLength")
    public String maxInputLength;

    /**
     * <p>The maximum output length.</p>
     * 
     * <strong>example:</strong>
     * <p>2048</p>
     */
    @NameInMap("maxOutputLength")
    public String maxOutputLength;

    /**
     * <p>The model code.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen-turbo</p>
     */
    @NameInMap("modelCode")
    public String modelCode;

    /**
     * <p>The model type.</p>
     * 
     * <strong>example:</strong>
     * <p>Chat</p>
     */
    @NameInMap("modelType")
    public String modelType;

    /**
     * <p>The model name.</p>
     * 
     * <strong>example:</strong>
     * <p>通义千问</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The vendor symbol.</p>
     * 
     * <strong>example:</strong>
     * <p>alibaba</p>
     */
    @NameInMap("symbol")
    public String symbol;

    /**
     * <p>The display names for the tags, separated by commas.</p>
     * 
     * <strong>example:</strong>
     * <p>对话,自然语言处理</p>
     */
    @NameInMap("tagNames")
    public String tagNames;

    /**
     * <p>A comma-separated list of model tags.</p>
     * 
     * <strong>example:</strong>
     * <p>chat,NLP</p>
     */
    @NameInMap("tags")
    public String tags;

    /**
     * <p>The version number.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("version")
    public Integer version;

    public static ModelDTO build(java.util.Map<String, ?> map) throws Exception {
        ModelDTO self = new ModelDTO();
        return TeaModel.build(map, self);
    }

    public ModelDTO setApiKeyPreview(String apiKeyPreview) {
        this.apiKeyPreview = apiKeyPreview;
        return this;
    }
    public String getApiKeyPreview() {
        return this.apiKeyPreview;
    }

    public ModelDTO setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
        return this;
    }
    public String getBaseUrl() {
        return this.baseUrl;
    }

    public ModelDTO setDeleteTag(Integer deleteTag) {
        this.deleteTag = deleteTag;
        return this;
    }
    public Integer getDeleteTag() {
        return this.deleteTag;
    }

    public ModelDTO setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModelDTO setExtensions(String extensions) {
        this.extensions = extensions;
        return this;
    }
    public String getExtensions() {
        return this.extensions;
    }

    public ModelDTO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public ModelDTO setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public ModelDTO setHasBillingRule(Boolean hasBillingRule) {
        this.hasBillingRule = hasBillingRule;
        return this;
    }
    public Boolean getHasBillingRule() {
        return this.hasBillingRule;
    }

    public ModelDTO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ModelDTO setInOut(String inOut) {
        this.inOut = inOut;
        return this;
    }
    public String getInOut() {
        return this.inOut;
    }

    public ModelDTO setIsCustom(Boolean isCustom) {
        this.isCustom = isCustom;
        return this;
    }
    public Boolean getIsCustom() {
        return this.isCustom;
    }

    public ModelDTO setMaxInputLength(String maxInputLength) {
        this.maxInputLength = maxInputLength;
        return this;
    }
    public String getMaxInputLength() {
        return this.maxInputLength;
    }

    public ModelDTO setMaxOutputLength(String maxOutputLength) {
        this.maxOutputLength = maxOutputLength;
        return this;
    }
    public String getMaxOutputLength() {
        return this.maxOutputLength;
    }

    public ModelDTO setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

    public ModelDTO setModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }
    public String getModelType() {
        return this.modelType;
    }

    public ModelDTO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModelDTO setSymbol(String symbol) {
        this.symbol = symbol;
        return this;
    }
    public String getSymbol() {
        return this.symbol;
    }

    public ModelDTO setTagNames(String tagNames) {
        this.tagNames = tagNames;
        return this;
    }
    public String getTagNames() {
        return this.tagNames;
    }

    public ModelDTO setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public ModelDTO setVersion(Integer version) {
        this.version = version;
        return this;
    }
    public Integer getVersion() {
        return this.version;
    }

}
