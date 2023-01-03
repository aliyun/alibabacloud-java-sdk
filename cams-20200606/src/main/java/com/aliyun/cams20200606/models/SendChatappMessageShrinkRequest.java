// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class SendChatappMessageShrinkRequest extends TeaModel {
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
    public String payloadShrink;

    @NameInMap("Tag")
    public String tag;

    // The code of the message template. This parameter is required if you set the Type parameter to **template**.
    @NameInMap("TemplateCode")
    public String templateCode;

    // The variables of the message template.
    @NameInMap("TemplateParams")
    public String templateParamsShrink;

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

    public static SendChatappMessageShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SendChatappMessageShrinkRequest self = new SendChatappMessageShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SendChatappMessageShrinkRequest setChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }
    public String getChannelType() {
        return this.channelType;
    }

    public SendChatappMessageShrinkRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public SendChatappMessageShrinkRequest setContextMessageId(String contextMessageId) {
        this.contextMessageId = contextMessageId;
        return this;
    }
    public String getContextMessageId() {
        return this.contextMessageId;
    }

    public SendChatappMessageShrinkRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public SendChatappMessageShrinkRequest setCustWabaId(String custWabaId) {
        this.custWabaId = custWabaId;
        return this;
    }
    public String getCustWabaId() {
        return this.custWabaId;
    }

    public SendChatappMessageShrinkRequest setFallBackContent(String fallBackContent) {
        this.fallBackContent = fallBackContent;
        return this;
    }
    public String getFallBackContent() {
        return this.fallBackContent;
    }

    public SendChatappMessageShrinkRequest setFallBackId(String fallBackId) {
        this.fallBackId = fallBackId;
        return this;
    }
    public String getFallBackId() {
        return this.fallBackId;
    }

    public SendChatappMessageShrinkRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public SendChatappMessageShrinkRequest setIsvCode(String isvCode) {
        this.isvCode = isvCode;
        return this;
    }
    public String getIsvCode() {
        return this.isvCode;
    }

    public SendChatappMessageShrinkRequest setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public SendChatappMessageShrinkRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public SendChatappMessageShrinkRequest setMessageType(String messageType) {
        this.messageType = messageType;
        return this;
    }
    public String getMessageType() {
        return this.messageType;
    }

    public SendChatappMessageShrinkRequest setPayloadShrink(String payloadShrink) {
        this.payloadShrink = payloadShrink;
        return this;
    }
    public String getPayloadShrink() {
        return this.payloadShrink;
    }

    public SendChatappMessageShrinkRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public SendChatappMessageShrinkRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public SendChatappMessageShrinkRequest setTemplateParamsShrink(String templateParamsShrink) {
        this.templateParamsShrink = templateParamsShrink;
        return this;
    }
    public String getTemplateParamsShrink() {
        return this.templateParamsShrink;
    }

    public SendChatappMessageShrinkRequest setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

    public SendChatappMessageShrinkRequest setTrackingData(String trackingData) {
        this.trackingData = trackingData;
        return this;
    }
    public String getTrackingData() {
        return this.trackingData;
    }

    public SendChatappMessageShrinkRequest setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

    public SendChatappMessageShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
