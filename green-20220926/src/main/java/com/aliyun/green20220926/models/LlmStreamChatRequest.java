// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class LlmStreamChatRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>guardCustomTest</p>
     */
    @NameInMap("Channel")
    public String channel;

    /**
     * <p>Conversation information</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;content\&quot;:\&quot;你好\&quot;,\&quot;role\&quot;:\&quot;user\&quot;}]</p>
     */
    @NameInMap("Messages")
    public Object messages;

    /**
     * <p>Temperature value for the large model</p>
     * 
     * <strong>example:</strong>
     * <p>0.5</p>
     */
    @NameInMap("Temperature")
    public Float temperature;

    /**
     * <p>Top p parameter controlling the randomness of the large model\&quot;s output.</p>
     * 
     * <strong>example:</strong>
     * <p>0.5</p>
     */
    @NameInMap("TopP")
    public Float topP;

    /**
     * <p>Type of conversation</p>
     * 
     * <strong>example:</strong>
     * <p>image</p>
     */
    @NameInMap("Type")
    public String type;

    public static LlmStreamChatRequest build(java.util.Map<String, ?> map) throws Exception {
        LlmStreamChatRequest self = new LlmStreamChatRequest();
        return TeaModel.build(map, self);
    }

    public LlmStreamChatRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public LlmStreamChatRequest setMessages(Object messages) {
        this.messages = messages;
        return this;
    }
    public Object getMessages() {
        return this.messages;
    }

    public LlmStreamChatRequest setTemperature(Float temperature) {
        this.temperature = temperature;
        return this;
    }
    public Float getTemperature() {
        return this.temperature;
    }

    public LlmStreamChatRequest setTopP(Float topP) {
        this.topP = topP;
        return this;
    }
    public Float getTopP() {
        return this.topP;
    }

    public LlmStreamChatRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
