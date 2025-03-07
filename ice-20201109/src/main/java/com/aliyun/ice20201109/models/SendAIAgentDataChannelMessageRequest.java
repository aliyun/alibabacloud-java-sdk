// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SendAIAgentDataChannelMessageRequest extends TeaModel {
    /**
     * <p>The ID of the AI agent in the conversation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>39f8e0bc005e4f309379701645f4****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The DataChannel message you want to send. You must specify a JSON string. The value can be up to 8,192 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;key&quot;:&quot;value&quot;}</p>
     */
    @NameInMap("Message")
    public String message;

    public static SendAIAgentDataChannelMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        SendAIAgentDataChannelMessageRequest self = new SendAIAgentDataChannelMessageRequest();
        return TeaModel.build(map, self);
    }

    public SendAIAgentDataChannelMessageRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SendAIAgentDataChannelMessageRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
