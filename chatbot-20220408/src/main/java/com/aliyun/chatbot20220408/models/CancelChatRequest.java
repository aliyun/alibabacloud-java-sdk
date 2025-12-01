// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CancelChatRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("Answer")
    public String answer;

    /**
     * <strong>example:</strong>
     * <p>7105a351-b2e7-4c9e-8437-c43a043c0a4e</p>
     */
    @NameInMap("ChatId")
    public String chatId;

    /**
     * <strong>example:</strong>
     * <p>chatbot-cn-yjzbyrEvqd</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>c1187530338311ebade7cf3eaeb3668a</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <strong>example:</strong>
     * <p>Canceled</p>
     */
    @NameInMap("Type")
    public String type;

    public static CancelChatRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelChatRequest self = new CancelChatRequest();
        return TeaModel.build(map, self);
    }

    public CancelChatRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public CancelChatRequest setAnswer(String answer) {
        this.answer = answer;
        return this;
    }
    public String getAnswer() {
        return this.answer;
    }

    public CancelChatRequest setChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }
    public String getChatId() {
        return this.chatId;
    }

    public CancelChatRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CancelChatRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public CancelChatRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
