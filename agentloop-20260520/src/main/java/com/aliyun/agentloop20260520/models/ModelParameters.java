// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class ModelParameters extends TeaModel {
    /**
     * <p>The frequency penalty. Positive values reduce repetition. Valid values: -2.0 to 2.0.</p>
     * 
     * <strong>example:</strong>
     * <p>0.2</p>
     */
    @NameInMap("frequencyPenalty")
    public Float frequencyPenalty;

    /**
     * <p>The maximum number of output tokens.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("maxTokens")
    public Long maxTokens;

    /**
     * <p>The presence penalty. Positive values encourage new topics. Valid values: -2.0 to 2.0.</p>
     * 
     * <strong>example:</strong>
     * <p>0.1</p>
     */
    @NameInMap("presencePenalty")
    public Float presencePenalty;

    /**
     * <p>The stop sequences. Generation stops immediately when any of these sequences is encountered.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;END&quot;]</p>
     */
    @NameInMap("stopSequences")
    public java.util.List<String> stopSequences;

    /**
     * <p>The temperature parameter that controls the randomness of the output. Valid values: 0 to 2.</p>
     * 
     * <strong>example:</strong>
     * <p>0.7</p>
     */
    @NameInMap("temperature")
    public Float temperature;

    /**
     * <p>The top-k sampling parameter. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("topK")
    public Integer topK;

    /**
     * <p>The top-p sampling parameter. Valid values: 0 to 1.</p>
     * 
     * <strong>example:</strong>
     * <p>0.9</p>
     */
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
