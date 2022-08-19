// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class SendChatappMessageRequest extends TeaModel {
    @NameInMap("ChannelType")
    public String channelType;

    @NameInMap("Content")
    public String content;

    @NameInMap("CustWabaId")
    public String custWabaId;

    @NameInMap("FallBackContent")
    public String fallBackContent;

    @NameInMap("FallBackId")
    public String fallBackId;

    @NameInMap("From")
    public String from;

    @NameInMap("Language")
    public String language;

    @NameInMap("MessageType")
    public String messageType;

    @NameInMap("Payload")
    public java.util.List<String> payload;

    @NameInMap("TemplateCode")
    public String templateCode;

    @NameInMap("TemplateParams")
    public java.util.Map<String, String> templateParams;

    @NameInMap("To")
    public String to;

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

    public SendChatappMessageRequest setCustWabaId(String custWabaId) {
        this.custWabaId = custWabaId;
        return this;
    }
    public String getCustWabaId() {
        return this.custWabaId;
    }

    public SendChatappMessageRequest setFallBackContent(String fallBackContent) {
        this.fallBackContent = fallBackContent;
        return this;
    }
    public String getFallBackContent() {
        return this.fallBackContent;
    }

    public SendChatappMessageRequest setFallBackId(String fallBackId) {
        this.fallBackId = fallBackId;
        return this;
    }
    public String getFallBackId() {
        return this.fallBackId;
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

    public SendChatappMessageRequest setPayload(java.util.List<String> payload) {
        this.payload = payload;
        return this;
    }
    public java.util.List<String> getPayload() {
        return this.payload;
    }

    public SendChatappMessageRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public SendChatappMessageRequest setTemplateParams(java.util.Map<String, String> templateParams) {
        this.templateParams = templateParams;
        return this;
    }
    public java.util.Map<String, String> getTemplateParams() {
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
