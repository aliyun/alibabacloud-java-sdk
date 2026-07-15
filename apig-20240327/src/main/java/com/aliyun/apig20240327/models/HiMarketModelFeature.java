// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HiMarketModelFeature extends TeaModel {
    /**
     * <p>Indicates whether multimodal input is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("enableMultiModal")
    public Boolean enableMultiModal;

    /**
     * <p>Indicates whether chain-of-thought (Thinking) is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("enableThinking")
    public Boolean enableThinking;

    /**
     * <p>The maximum number of tokens supported by the model.</p>
     * 
     * <strong>example:</strong>
     * <p>8192</p>
     */
    @NameInMap("maxTokens")
    public Integer maxTokens;

    /**
     * <p>The model name.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen-max</p>
     */
    @NameInMap("model")
    public String model;

    /**
     * <p>Indicates whether streaming output is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("streaming")
    public Boolean streaming;

    /**
     * <p>The temperature parameter that controls the randomness of generation.</p>
     * 
     * <strong>example:</strong>
     * <p>0.7</p>
     */
    @NameInMap("temperature")
    public Float temperature;

    /**
     * <p>Indicates whether web search is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("webSearch")
    public Boolean webSearch;

    public static HiMarketModelFeature build(java.util.Map<String, ?> map) throws Exception {
        HiMarketModelFeature self = new HiMarketModelFeature();
        return TeaModel.build(map, self);
    }

    public HiMarketModelFeature setEnableMultiModal(Boolean enableMultiModal) {
        this.enableMultiModal = enableMultiModal;
        return this;
    }
    public Boolean getEnableMultiModal() {
        return this.enableMultiModal;
    }

    public HiMarketModelFeature setEnableThinking(Boolean enableThinking) {
        this.enableThinking = enableThinking;
        return this;
    }
    public Boolean getEnableThinking() {
        return this.enableThinking;
    }

    public HiMarketModelFeature setMaxTokens(Integer maxTokens) {
        this.maxTokens = maxTokens;
        return this;
    }
    public Integer getMaxTokens() {
        return this.maxTokens;
    }

    public HiMarketModelFeature setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public HiMarketModelFeature setStreaming(Boolean streaming) {
        this.streaming = streaming;
        return this;
    }
    public Boolean getStreaming() {
        return this.streaming;
    }

    public HiMarketModelFeature setTemperature(Float temperature) {
        this.temperature = temperature;
        return this;
    }
    public Float getTemperature() {
        return this.temperature;
    }

    public HiMarketModelFeature setWebSearch(Boolean webSearch) {
        this.webSearch = webSearch;
        return this;
    }
    public Boolean getWebSearch() {
        return this.webSearch;
    }

}
