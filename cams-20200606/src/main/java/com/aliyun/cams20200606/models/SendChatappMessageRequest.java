// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class SendChatappMessageRequest extends TeaModel {
    // 通道类型 whatsapp/viber/line
    @NameInMap("ChannelType")
    public String channelType;

    // 消息内容
    @NameInMap("Content")
    public String content;

    // 发送方
    @NameInMap("From")
    public String from;

    // 语言
    @NameInMap("Language")
    public String language;

    // 消息类型
    @NameInMap("MessageType")
    public String messageType;

    @NameInMap("OwnerId")
    public Long ownerId;

    // 当发送模板消息时，模板中包含按钮类型是QUICK_REPLY时有效，在快速回复的时候会再上行
    @NameInMap("Payload")
    public String payload;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // 模板编码
    @NameInMap("TemplateCode")
    public String templateCode;

    // 模板参数
    @NameInMap("TemplateParams")
    public String templateParams;

    // 接收号码
    @NameInMap("To")
    public String to;

    // 消息大类
    // template--模板
    // message--非模板
    @NameInMap("Type")
    public String type;

    public static SendChatappMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        SendChatappMessageRequest self = new SendChatappMessageRequest();
        return TeaModel.build(map, self);
    }

    public SendChatappMessageRequest setChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }
    public String getChannelType() {
        return this.channelType;
    }

    public SendChatappMessageRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public SendChatappMessageRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public SendChatappMessageRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public SendChatappMessageRequest setMessageType(String messageType) {
        this.messageType = messageType;
        return this;
    }
    public String getMessageType() {
        return this.messageType;
    }

    public SendChatappMessageRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SendChatappMessageRequest setPayload(String payload) {
        this.payload = payload;
        return this;
    }
    public String getPayload() {
        return this.payload;
    }

    public SendChatappMessageRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SendChatappMessageRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SendChatappMessageRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public SendChatappMessageRequest setTemplateParams(String templateParams) {
        this.templateParams = templateParams;
        return this;
    }
    public String getTemplateParams() {
        return this.templateParams;
    }

    public SendChatappMessageRequest setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

    public SendChatappMessageRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
