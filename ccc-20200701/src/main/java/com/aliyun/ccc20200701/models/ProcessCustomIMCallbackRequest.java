// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ProcessCustomIMCallbackRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cf584733-<em><strong>-</strong></em>-9699-cb77aa3b7aa6</p>
     */
    @NameInMap("AccessChannelId")
    public String accessChannelId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d165de4f-9851-445e-9535-66ebfa72fa51</p>
     */
    @NameInMap("ConversationId")
    public String conversationId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9cfad875-6260-4a53-ab6e-b13e3fb31f7d</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MessageContent")
    public String messageContent;

    /**
     * <strong>example:</strong>
     * <p>03C67DAD-EB26-41D8-949D-9B0C470FB716</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("SenderAvatarMediaId")
    public String senderAvatarMediaId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>63061274befd6b545aab4c83</p>
     */
    @NameInMap("SenderId")
    public String senderId;

    /**
     * <strong>example:</strong>
     * <p>tom</p>
     */
    @NameInMap("SenderName")
    public String senderName;

    public static ProcessCustomIMCallbackRequest build(java.util.Map<String, ?> map) throws Exception {
        ProcessCustomIMCallbackRequest self = new ProcessCustomIMCallbackRequest();
        return TeaModel.build(map, self);
    }

    public ProcessCustomIMCallbackRequest setAccessChannelId(String accessChannelId) {
        this.accessChannelId = accessChannelId;
        return this;
    }
    public String getAccessChannelId() {
        return this.accessChannelId;
    }

    public ProcessCustomIMCallbackRequest setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public ProcessCustomIMCallbackRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ProcessCustomIMCallbackRequest setMessageContent(String messageContent) {
        this.messageContent = messageContent;
        return this;
    }
    public String getMessageContent() {
        return this.messageContent;
    }

    public ProcessCustomIMCallbackRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ProcessCustomIMCallbackRequest setSenderAvatarMediaId(String senderAvatarMediaId) {
        this.senderAvatarMediaId = senderAvatarMediaId;
        return this;
    }
    public String getSenderAvatarMediaId() {
        return this.senderAvatarMediaId;
    }

    public ProcessCustomIMCallbackRequest setSenderId(String senderId) {
        this.senderId = senderId;
        return this;
    }
    public String getSenderId() {
        return this.senderId;
    }

    public ProcessCustomIMCallbackRequest setSenderName(String senderName) {
        this.senderName = senderName;
        return this;
    }
    public String getSenderName() {
        return this.senderName;
    }

}
