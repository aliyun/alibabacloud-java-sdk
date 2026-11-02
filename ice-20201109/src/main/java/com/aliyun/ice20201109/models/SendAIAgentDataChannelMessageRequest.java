// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SendAIAgentDataChannelMessageRequest extends TeaModel {
    /**
     * <p>The instance ID of the agent that is currently in a call.</p>
     * <blockquote>
     * <p>InstanceId is the unique ID returned after the agent instance is successfully started. For more information about the API operations used to start an agent, see <a href="https://help.aliyun.com/document_detail/2846201.html">StartAIAgentInstance</a> and <a href="https://help.aliyun.com/document_detail/2846209.html">GenerateAIAgentCall</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>39f8e0bc005e4f309379701645f4****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The DataChannel message to send. The value must be a JSON string with a maximum length of 8,192 characters.</p>
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
