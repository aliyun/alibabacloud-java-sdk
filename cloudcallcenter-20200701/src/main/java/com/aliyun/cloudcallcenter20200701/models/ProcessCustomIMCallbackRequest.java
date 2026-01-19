// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcallcenter20200701.models;

import com.aliyun.tea.*;

public class ProcessCustomIMCallbackRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>420F203D-87ED-599A-B137-D9D914EE9E70</p>
     */
    @NameInMap("AccessChannelId")
    public String accessChannelId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>27578380-d382-11ee-9cca-adec43112a87</p>
     */
    @NameInMap("ConversationId")
    public String conversationId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;ContentType&quot;: &quot;Text&quot;,
     *     &quot;Text&quot;: &quot;Hello&quot;
     *   }</p>
     */
    @NameInMap("MessageContent")
    public String messageContent;

    /**
     * <strong>example:</strong>
     * <p>FCEFE806-E67C-577E-865B-4ED398F2F648</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>FCEFE806-E67C-577E-865B-4ED398F2F648</p>
     */
    @NameInMap("SenderAvatarMediaId")
    public String senderAvatarMediaId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>654f1054dcda1b251282cbdf</p>
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
