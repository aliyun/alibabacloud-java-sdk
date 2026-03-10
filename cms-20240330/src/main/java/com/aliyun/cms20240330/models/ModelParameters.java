// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ModelParameters extends TeaModel {
    @NameInMap("frequencyPenalty")
    public Float frequencyPenalty;

    @NameInMap("maxTokens")
    public Long maxTokens;

    @NameInMap("presencePenalty")
    public Float presencePenalty;

    @NameInMap("stopSequences")
    public java.util.List<String> stopSequences;

    @NameInMap("temperature")
    public Float temperature;

    @NameInMap("topK")
    public Integer topK;

    @NameInMap("topP")
    public Float topP;

    public static ModelParameters build(java.util.Map<String, ?> map) throws Exception {
        ModelParameters self = new ModelParameters();
        return TeaModel.build(map, self);
    }

    public ModelParameters setFrequencyPenalty(Float frequencyPenalty) {
        this.frequencyPenalty = frequencyPenalty;
        return this;
    }
    public Float getFrequencyPenalty() {
        return this.frequencyPenalty;
    }

    public ModelParameters setMaxTokens(Long maxTokens) {
        this.maxTokens = maxTokens;
        return this;
    }
    public Long getMaxTokens() {
        return this.maxTokens;
    }

    public ModelParameters setPresencePenalty(Float presencePenalty) {
        this.presencePenalty = presencePenalty;
        return this;
    }
    public Float getPresencePenalty() {
        return this.presencePenalty;
    }

    public ModelParameters setStopSequences(java.util.List<String> stopSequences) {
        this.stopSequences = stopSequences;
        return this;
    }
    public java.util.List<String> getStopSequences() {
        return this.stopSequences;
    }

    public ModelParameters setTemperature(Float temperature) {
        this.temperature = temperature;
        return this;
    }
    public Float getTemperature() {
        return this.temperature;
    }

    public ModelParameters setTopK(Integer topK) {
        this.topK = topK;
        return this;
    }
    public Integer getTopK() {
        return this.topK;
    }

    public ModelParameters setTopP(Float topP) {
        this.topP = topP;
        return this;
    }
    public Float getTopP() {
        return this.topP;
    }

}
