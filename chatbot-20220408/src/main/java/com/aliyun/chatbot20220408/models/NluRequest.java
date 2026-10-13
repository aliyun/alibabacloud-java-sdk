// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class NluRequest extends TeaModel {
    /**
     * <p>The business space key. If not specified, the default business space is accessed. You can obtain the key on the business management page of the Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>The unique identifier of the chatbot.</p>
     * 
     * <strong>example:</strong>
     * <p>chatbot-cn-mp90s2lrk00050</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The user utterance.</p>
     * 
     * <strong>example:</strong>
     * <p>How is the weather in Beijing</p>
     */
    @NameInMap("Utterance")
    public String utterance;

    public static NluRequest build(java.util.Map<String, ?> map) throws Exception {
        NluRequest self = new NluRequest();
        return TeaModel.build(map, self);
    }

    public NluRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public NluRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public NluRequest setUtterance(String utterance) {
        this.utterance = utterance;
        return this;
    }
    public String getUtterance() {
        return this.utterance;
    }

}
