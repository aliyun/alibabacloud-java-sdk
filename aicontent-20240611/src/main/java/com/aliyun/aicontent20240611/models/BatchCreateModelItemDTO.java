// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class BatchCreateModelItemDTO extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>通义千问 Max</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("extensions")
    public String extensions;

    /**
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("inOut")
    public String inOut;

    /**
     * <strong>example:</strong>
     * <p>128000</p>
     */
    @NameInMap("maxInputLength")
    public String maxInputLength;

    /**
     * <strong>example:</strong>
     * <p>8192</p>
     */
    @NameInMap("maxOutputLength")
    public String maxOutputLength;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen-max</p>
     */
    @NameInMap("modelId")
    public String modelId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Chat</p>
     */
    @NameInMap("modelType")
    public String modelType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen-max</p>
     */
    @NameInMap("name")
    public String name;

    /**
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
