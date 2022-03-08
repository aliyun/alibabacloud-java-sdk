// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class SendMessageRequest extends TeaModel {
    @NameInMap("Caption")
    public String caption;

    @NameInMap("ChannelType")
    public String channelType;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("From")
    public String from;

    @NameInMap("Link")
    public String link;

    @NameInMap("MessageType")
    public String messageType;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("TemplateBodyParams")
    public String templateBodyParams;

    @NameInMap("TemplateButtonParams")
    public String templateButtonParams;

    @NameInMap("TemplateCode")
    public String templateCode;

    @NameInMap("TemplateHeaderParams")
    public String templateHeaderParams;

    @NameInMap("Text")
    public String text;

    @NameInMap("To")
    public String to;

    @NameInMap("Type")
    public String type;

    public static SendMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        SendMessageRequest self = new SendMessageRequest();
        return TeaModel.build(map, self);
    }

    public SendMessageRequest setCaption(String caption) {
        this.caption = caption;
        return this;
    }
    public String getCaption() {
        return this.caption;
    }

    public SendMessageRequest setChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }
    public String getChannelType() {
        return this.channelType;
    }

    public SendMessageRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public SendMessageRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public SendMessageRequest setLink(String link) {
        this.link = link;
        return this;
    }
    public String getLink() {
        return this.link;
    }

    public SendMessageRequest setMessageType(String messageType) {
        this.messageType = messageType;
        return this;
    }
    public String getMessageType() {
        return this.messageType;
    }

    public SendMessageRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SendMessageRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SendMessageRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SendMessageRequest setTemplateBodyParams(String templateBodyParams) {
        this.templateBodyParams = templateBodyParams;
        return this;
    }
    public String getTemplateBodyParams() {
        return this.templateBodyParams;
    }

    public SendMessageRequest setTemplateButtonParams(String templateButtonParams) {
        this.templateButtonParams = templateButtonParams;
        return this;
    }
    public String getTemplateButtonParams() {
        return this.templateButtonParams;
    }

    public SendMessageRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public SendMessageRequest setTemplateHeaderParams(String templateHeaderParams) {
        this.templateHeaderParams = templateHeaderParams;
        return this;
    }
    public String getTemplateHeaderParams() {
        return this.templateHeaderParams;
    }

    public SendMessageRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public SendMessageRequest setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

    public SendMessageRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
