// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateMemoryStoreRequest extends TeaModel {
    /**
     * <p>A list of custom extraction strategies.</p>
     */
    @NameInMap("customExtractionStrategies")
    public java.util.List<CustomExtractionStrategy> customExtractionStrategies;

    /**
     * <p>The description of the Memory Store.</p>
     * 
     * <strong>example:</strong>
     * <p>Test memory store for demonstration.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The extraction strategies to use. Valid values: <code>Episodic</code>, <code>Summary</code>, and <code>Fact</code>.</p>
     */
    @NameInMap("extractionStrategies")
    public java.util.List<String> extractionStrategies;

    /**
     * <p>The name of the Memory Store.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-memory-store</p>
     */
    @NameInMap("memoryStoreName")
    public String memoryStoreName;

    /**
     * <p>The time-to-live (TTL) for short-term memory.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("shortTermTtl")
    public Integer shortTermTtl;

    public static CreateMemoryStoreRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMemoryStoreRequest self = new CreateMemoryStoreRequest();
        return TeaModel.build(map, self);
    }

    public CreateMemoryStoreRequest setCustomExtractionStrategies(java.util.List<CustomExtractionStrategy> customExtractionStrategies) {
        this.customExtractionStrategies = customExtractionStrategies;
        return this;
    }
    public java.util.List<CustomExtractionStrategy> getCustomExtractionStrategies() {
        return this.customExtractionStrategies;
    }

    public CreateMemoryStoreRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateMemoryStoreRequest setExtractionStrategies(java.util.List<String> extractionStrategies) {
        this.extractionStrategies = extractionStrategies;
        return this;
    }
    public java.util.List<String> getExtractionStrategies() {
        return this.extractionStrategies;
    }

    public CreateMemoryStoreRequest setMemoryStoreName(String memoryStoreName) {
        this.memoryStoreName = memoryStoreName;
        return this;
    }
    public String getMemoryStoreName() {
        return this.memoryStoreName;
    }

    public CreateMemoryStoreRequest setShortTermTtl(Integer shortTermTtl) {
        this.shortTermTtl = shortTermTtl;
        return this;
    }
    public Integer getShortTermTtl() {
        return this.shortTermTtl;
    }

}
