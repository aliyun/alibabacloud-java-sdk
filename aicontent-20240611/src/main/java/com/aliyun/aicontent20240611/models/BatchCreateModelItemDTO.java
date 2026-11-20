// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class BatchCreateModelItemDTO extends TeaModel {
    /**
     * <p>The model description.</p>
     * 
     * <strong>example:</strong>
     * <p>Qwen Max</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The extension configuration parameters in JSON string format.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("extensions")
    public String extensions;

    /**
     * <p>The supported input and output data types, separated by commas.</p>
     * 
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("inOut")
    public String inOut;

    /**
     * <p>The maximum input length in tokens.</p>
     * 
     * <strong>example:</strong>
     * <p>128000</p>
     */
    @NameInMap("maxInputLength")
    public String maxInputLength;

    /**
     * <p>The maximum output length in tokens.</p>
     * 
     * <strong>example:</strong>
     * <p>8192</p>
     */
    @NameInMap("maxOutputLength")
    public String maxOutputLength;

    /**
     * <p>The model identifier. This parameter is required and corresponds to the model ID on the vendor side. If the identifier is duplicated, the backend automatically increments the version by using v1 or v2.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen-max</p>
     */
    @NameInMap("modelId")
    public String modelId;

    /**
     * <p>The model type. This parameter is required. Valid values: Chat, Embedding, Rerank, Image, Audio, and Video.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Chat</p>
     */
    @NameInMap("modelType")
    public String modelType;

    /**
     * <p>The model name. This parameter is required. If the identifier is duplicated, add -v1 or -v2 to distinguish the models.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen-max</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The tags, separated by commas.</p>
     * 
     * <strong>example:</strong>
     * <p>chat,NLP</p>
     */
    @NameInMap("tags")
    public String tags;

    public static BatchCreateModelItemDTO build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateModelItemDTO self = new BatchCreateModelItemDTO();
        return TeaModel.build(map, self);
    }

    public BatchCreateModelItemDTO setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public BatchCreateModelItemDTO setExtensions(String extensions) {
        this.extensions = extensions;
        return this;
    }
    public String getExtensions() {
        return this.extensions;
    }

    public BatchCreateModelItemDTO setInOut(String inOut) {
        this.inOut = inOut;
        return this;
    }
    public String getInOut() {
        return this.inOut;
    }

    public BatchCreateModelItemDTO setMaxInputLength(String maxInputLength) {
        this.maxInputLength = maxInputLength;
        return this;
    }
    public String getMaxInputLength() {
        return this.maxInputLength;
    }

    public BatchCreateModelItemDTO setMaxOutputLength(String maxOutputLength) {
        this.maxOutputLength = maxOutputLength;
        return this;
    }
    public String getMaxOutputLength() {
        return this.maxOutputLength;
    }

    public BatchCreateModelItemDTO setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public BatchCreateModelItemDTO setModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }
    public String getModelType() {
        return this.modelType;
    }

    public BatchCreateModelItemDTO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public BatchCreateModelItemDTO setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

}
