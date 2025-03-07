// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SendAIAgentSpeechRequest extends TeaModel {
    /**
     * <p>Specifies whether the broadcast can interrupt the ongoing speech. Default value: true</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableInterrupt")
    public Boolean enableInterrupt;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>39f8e0bc005e4f309379701645f4****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Text")
    public String text;

    public static SendAIAgentSpeechRequest build(java.util.Map<String, ?> map) throws Exception {
        SendAIAgentSpeechRequest self = new SendAIAgentSpeechRequest();
        return TeaModel.build(map, self);
    }

    public SendAIAgentSpeechRequest setEnableInterrupt(Boolean enableInterrupt) {
        this.enableInterrupt = enableInterrupt;
        return this;
    }
    public Boolean getEnableInterrupt() {
        return this.enableInterrupt;
    }

    public SendAIAgentSpeechRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SendAIAgentSpeechRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

}
