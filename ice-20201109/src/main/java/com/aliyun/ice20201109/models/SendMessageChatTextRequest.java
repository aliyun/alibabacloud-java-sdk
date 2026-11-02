// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SendMessageChatTextRequest extends TeaModel {
    /**
     * <p>The agent ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>39f8e0bc005e4f309379701645f4****</p>
     */
    @NameInMap("AIAgentId")
    public String AIAgentId;

    /**
     * <p>The sending mode. Valid values:</p>
     * <ul>
     * <li><p>online: online message</p>
     * </li>
     * <li><p>offline: offline message</p>
     * </li>
     * </ul>
     * <p>Default value: offline.</p>
     * 
     * <strong>example:</strong>
     * <p>online</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>Specifies whether to archive the chat history. Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NeedArchiving")
    public Boolean needArchiving;

    /**
     * <p>The ID of the user who receives the message. The ID can contain uppercase and lowercase letters and digits and must not exceed 64 bytes in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>60000042053</p>
     */
    @NameInMap("ReceiverId")
    public String receiverId;

    /**
     * <p>The session ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f27f9b9be28642a88e18****</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>The text content to send.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hello</p>
     */
    @NameInMap("Text")
    public String text;

    /**
     * <p>The type of the message to send. Valid values:</p>
     * <ul>
     * <li><p>announcement: proactive notification text</p>
     * </li>
     * <li><p>custom: custom message</p>
     * </li>
     * </ul>
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
