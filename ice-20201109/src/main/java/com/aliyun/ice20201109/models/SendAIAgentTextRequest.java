// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SendAIAgentTextRequest extends TeaModel {
    /**
     * <p>The ID of the AI agent instance.</p>
     * <blockquote>
     * <p>InstanceId is a unique identifier that is returned when the AI agent is started. To start an AI agent, call <a href="https://help.aliyun.com/document_detail/2846201.html">StartAIAgentInstance </a> or <a href="https://help.aliyun.com/document_detail/2846209.html">GenerateAIAgentCall</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f27f9b9be28642a88e18****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The input to the LLM.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Hello</p>
     */
    @NameInMap("Text")
    public String text;

    public static SendAIAgentTextRequest build(java.util.Map<String, ?> map) throws Exception {
        SendAIAgentTextRequest self = new SendAIAgentTextRequest();
        return TeaModel.build(map, self);
    }

    public SendAIAgentTextRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SendAIAgentTextRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

}
