// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SendMessageChatTextRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>39f8e0bc005e4f309379701645f4****</p>
     */
    @NameInMap("AIAgentId")
    public String AIAgentId;

    /**
     * <strong>example:</strong>
     * <p>online</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NeedArchiving")
    public Boolean needArchiving;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>60000042053</p>
     */
    @NameInMap("ReceiverId")
    public String receiverId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f27f9b9be28642a88e18****</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Text")
    public String text;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>announcement</p>
     */
    @NameInMap("Type")
    public String type;

    public static SendMessageChatTextRequest build(java.util.Map<String, ?> map) throws Exception {
        SendMessageChatTextRequest self = new SendMessageChatTextRequest();
        return TeaModel.build(map, self);
    }

    public SendMessageChatTextRequest setAIAgentId(String AIAgentId) {
        this.AIAgentId = AIAgentId;
        return this;
    }
    public String getAIAgentId() {
        return this.AIAgentId;
    }

    public SendMessageChatTextRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public SendMessageChatTextRequest setNeedArchiving(Boolean needArchiving) {
        this.needArchiving = needArchiving;
        return this;
    }
    public Boolean getNeedArchiving() {
        return this.needArchiving;
    }

    public SendMessageChatTextRequest setReceiverId(String receiverId) {
        this.receiverId = receiverId;
        return this;
    }
    public String getReceiverId() {
        return this.receiverId;
    }

    public SendMessageChatTextRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public SendMessageChatTextRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public SendMessageChatTextRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
