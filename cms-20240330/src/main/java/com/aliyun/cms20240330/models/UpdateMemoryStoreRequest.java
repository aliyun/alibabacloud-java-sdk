// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateMemoryStoreRequest extends TeaModel {
    @NameInMap("customExtractionStrategies")
    public java.util.List<CustomExtractionStrategy> customExtractionStrategies;

    /**
     * <strong>example:</strong>
     * <p>memoryStore test</p>
     */
    @NameInMap("description")
    public String description;

    @NameInMap("extractionStrategies")
    public java.util.List<String> extractionStrategies;

    /**
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("shortTermTtl")
    public Integer shortTermTtl;

    public static UpdateMemoryStoreRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMemoryStoreRequest self = new UpdateMemoryStoreRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMemoryStoreRequest setCustomExtractionStrategies(java.util.List<CustomExtractionStrategy> customExtractionStrategies) {
        this.customExtractionStrategies = customExtractionStrategies;
        return this;
    }
    public java.util.List<CustomExtractionStrategy> getCustomExtractionStrategies() {
        return this.customExtractionStrategies;
    }

    public UpdateMemoryStoreRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateMemoryStoreRequest setExtractionStrategies(java.util.List<String> extractionStrategies) {
        this.extractionStrategies = extractionStrategies;
        return this;
    }
    public java.util.List<String> getExtractionStrategies() {
        return this.extractionStrategies;
    }

    public UpdateMemoryStoreRequest setShortTermTtl(Integer shortTermTtl) {
        this.shortTermTtl = shortTermTtl;
        return this;
    }
    public Integer getShortTermTtl() {
        return this.shortTermTtl;
    }

}
