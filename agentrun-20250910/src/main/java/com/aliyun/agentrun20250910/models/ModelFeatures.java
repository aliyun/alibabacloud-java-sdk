// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ModelFeatures extends TeaModel {
    @NameInMap("agentThought")
    public Boolean agentThought;

    @NameInMap("multiToolCall")
    public Boolean multiToolCall;

    @NameInMap("streamToolCall")
    public Boolean streamToolCall;

    @NameInMap("toolCall")
    public Boolean toolCall;

    @NameInMap("vision")
    public Boolean vision;

    public static ModelFeatures build(java.util.Map<String, ?> map) throws Exception {
        ModelFeatures self = new ModelFeatures();
        return TeaModel.build(map, self);
    }

    public ModelFeatures setAgentThought(Boolean agentThought) {
        this.agentThought = agentThought;
        return this;
    }
    public Boolean getAgentThought() {
        return this.agentThought;
    }

    public ModelFeatures setMultiToolCall(Boolean multiToolCall) {
        this.multiToolCall = multiToolCall;
        return this;
    }
    public Boolean getMultiToolCall() {
        return this.multiToolCall;
    }

    public ModelFeatures setStreamToolCall(Boolean streamToolCall) {
        this.streamToolCall = streamToolCall;
        return this;
    }
    public Boolean getStreamToolCall() {
        return this.streamToolCall;
    }

    public ModelFeatures setToolCall(Boolean toolCall) {
        this.toolCall = toolCall;
        return this;
    }
    public Boolean getToolCall() {
        return this.toolCall;
    }

    public ModelFeatures setVision(Boolean vision) {
        this.vision = vision;
        return this;
    }
    public Boolean getVision() {
        return this.vision;
    }

}
