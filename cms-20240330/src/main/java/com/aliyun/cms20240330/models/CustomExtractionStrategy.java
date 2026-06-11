// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CustomExtractionStrategy extends TeaModel {
    /**
     * <p>Description</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Extraction prompt</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("extractionPrompt")
    public String extractionPrompt;

    /**
     * <p>Policy Name</p>
     * 
     * <strong>example:</strong>
     * <p>test1</p>
     */
    @NameInMap("strategyName")
    public String strategyName;

    /**
     * <p>Policy type. Supports &quot;Episodic&quot;, &quot;Summary&quot;, and &quot;Fact&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>Fact</p>
     */
    @NameInMap("strategyType")
    public String strategyType;

    /**
     * <p>Update prompt</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("updatePrompt")
    public String updatePrompt;

    public static CustomExtractionStrategy build(java.util.Map<String, ?> map) throws Exception {
        CustomExtractionStrategy self = new CustomExtractionStrategy();
        return TeaModel.build(map, self);
    }

    public CustomExtractionStrategy setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CustomExtractionStrategy setExtractionPrompt(String extractionPrompt) {
        this.extractionPrompt = extractionPrompt;
        return this;
    }
    public String getExtractionPrompt() {
        return this.extractionPrompt;
    }

    public CustomExtractionStrategy setStrategyName(String strategyName) {
        this.strategyName = strategyName;
        return this;
    }
    public String getStrategyName() {
        return this.strategyName;
    }

    public CustomExtractionStrategy setStrategyType(String strategyType) {
        this.strategyType = strategyType;
        return this;
    }
    public String getStrategyType() {
        return this.strategyType;
    }

    public CustomExtractionStrategy setUpdatePrompt(String updatePrompt) {
        this.updatePrompt = updatePrompt;
        return this;
    }
    public String getUpdatePrompt() {
        return this.updatePrompt;
    }

}
