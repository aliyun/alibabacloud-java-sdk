// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HiMarketModelFeature extends TeaModel {
    /**
     * <p>Indicates whether to enable multi-modal capabilities. If set to <code>true</code>, the model can process requests that include multiple data types, such as text and images.</p>
     */
    @NameInMap("enableMultiModal")
    public Boolean enableMultiModal;

    /**
     * <p>Indicates whether to include the model\&quot;s reasoning process in the response. If set to <code>true</code>, the output may contain intermediate steps that show how the model arrived at a conclusion.</p>
     */
    @NameInMap("enableThinking")
    public Boolean enableThinking;

    /**
     * <p>The maximum number of tokens to generate in the response. A token is a unit of text processed by the model.</p>
     */
    @NameInMap("maxTokens")
    public Integer maxTokens;

    /**
     * <p>The identifier of the model to use for inference.</p>
     */
    @NameInMap("model")
    public String model;

    /**
     * <p>Indicates whether to deliver the response as a continuous stream. If set to <code>true</code>, results are sent incrementally.</p>
     */
    @NameInMap("streaming")
    public Boolean streaming;

    /**
     * <p>Controls the randomness of the output. Valid values range from 0 to 1. Higher values, such as 0.8, make the output more random. Lower values, such as 0.2, make the output more deterministic.</p>
     */
    @NameInMap("temperature")
    public Float temperature;

    /**
     * <p>Indicates whether the model can search the web to provide more up-to-date responses.</p>
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
