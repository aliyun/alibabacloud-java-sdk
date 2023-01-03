// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class SendChatappMessageRequest extends TeaModel {
    // The type of the message channel. Valid values:
    // 
    // *   **whatsapp**
    // *   viber (under development)
    // *   line (under development)
    @NameInMap("ChannelType")
    public String channelType;

    // The content of the message.
    // 
    // **
    // 
    // **Note** The **Content** parameter is required if you set the **Type** parameter to **message**.
    @NameInMap("Content")
    public String content;

    @NameInMap("ContextMessageId")
    public String contextMessageId;

    @NameInMap("CustSpaceId")
    public String custSpaceId;

    // The unique identifier of the WhatsApp account that you register.
    @NameInMap("CustWabaId")
    @Deprecated
    public String custWabaId;

    // Fallback message content.
    @NameInMap("FallBackContent")
    public String fallBackContent;

    // Fallback strategy id. Fallback Strategy can be created on the ChatApp console.
    @NameInMap("FallBackId")
    public String fallBackId;

    // The mobile phone number of the message sender.
    // 
    // <notice>You can specify a mobile phone number that is registered for a WhatsApp account and is approved in the ChatApp console.</notice>
    @NameInMap("From")
    public String from;

    // Assigned by ISV for RAM user authentication and authorization.
    @NameInMap("IsvCode")
    public String isvCode;

    @NameInMap("Label")
    public String label;

    // The language that is used in the message template.
    @NameInMap("Language")
    public String language;

    // The type of the message. This parameter is required if you set the Type parameter to **message**. Valid values:
    // 
    // *   **text**: a text message. The **Text** parameter is required if you set the MessageType parameter to text.
    // *   **image**: an image message. The **Link** parameter is required and the **Caption** parameter is optional if you set the MessageType parameter to image.
    // *   **video**: a video message. The **Link** parameter is required and the **Caption** parameter is optional if you set the MessageType parameter to video.
    // *   **audio**: an audio message. The **Link** parameter is required and the **Caption** parameter is invalid if you set the MessageType parameter to audio.
    // *   **document**: a document message. The **Link** and **FileName** parameters are required and the **Caption** parameter is invalid if you set the MessageType parameter to document.
    @NameInMap("MessageType")
    public String messageType;

    // The payload of the button.
    @NameInMap("Payload")
    public java.util.List<String> payload;

    @NameInMap("Tag")
    public String tag;

    // The code of the message template. This parameter is required if you set the Type parameter to **template**.
    @NameInMap("TemplateCode")
    public String templateCode;

    // The variables of the message template.
    @NameInMap("TemplateParams")
    public java.util.Map<String, String> templateParams;

    // The mobile phone number of the message recipient.
    @NameInMap("To")
    public String to;

    @NameInMap("TrackingData")
    public String trackingData;

    @NameInMap("Ttl")
    public Integer ttl;

    // The type of the message. Valid values:
    // 
    // *   **template**: a template message. A template message is sent based on a template that is created in the ChatApp console and is approved. You can send template messages based on your business requirements.
    // *   **message**: a custom message. You can send a custom message to a user only within 24 hours after you receive the last message from the user.
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

    public SendChatappMessageRequest setContextMessageId(String contextMessageId) {
        this.contextMessageId = contextMessageId;
        return this;
    }
    public String getContextMessageId() {
        return this.contextMessageId;
    }

    public SendChatappMessageRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
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

    public SendChatappMessageRequest setIsvCode(String isvCode) {
        this.isvCode = isvCode;
        return this;
    }
    public String getIsvCode() {
        return this.isvCode;
    }

    public SendChatappMessageRequest setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
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

    public SendChatappMessageRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
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

    public SendChatappMessageRequest setTrackingData(String trackingData) {
        this.trackingData = trackingData;
        return this;
    }
    public String getTrackingData() {
        return this.trackingData;
    }

    public SendChatappMessageRequest setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

    public SendChatappMessageRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
