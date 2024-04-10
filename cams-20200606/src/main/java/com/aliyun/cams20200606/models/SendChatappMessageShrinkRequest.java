// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class SendChatappMessageShrinkRequest extends TeaModel {
    /**
     * <p>The type of the message channel. Valid values:</p>
     * <br>
     * <p>*   **whatsapp**</p>
     * <p>*   **viber**</p>
     * <p>*   line. The feature that ChatAPP sends messages by using Line is under development.</p>
     */
    @NameInMap("ChannelType")
    public String channelType;

    /**
     * <p>The content of the message.</p>
     * <br>
     * <p>**Usage notes when you set the ChannelType parameter to whatsapp:**</p>
     * <br>
     * <p>*   When you set the **MessageType** parameter to **text**, the **text** parameter is required and the **caption** parameter cannot be specified.</p>
     * <p>*   When you set the **MessageType** parameter to **image**, the **link** parameter is required.</p>
     * <p>*   When you set the **MessageType** parameter to **video**, the **link** parameter is required.</p>
     * <p>*   When you set the **MessageType** parameter to **audio**, the **link** parameter is required and the **caption** parameter is invalid.</p>
     * <p>*   When you set the **MessageType** parameter to **document**, the **link** and **fileName** parameters are required and the **caption** parameter is invalid.</p>
     * <p>*   When you set the **MessageType** parameter to **interactive**, the **type** and **action** parameters are required.</p>
     * <p>*   When you set the **MessageType** parameter to **contacts**, the **name** parameter is required.</p>
     * <p>*   When you set the **MessageType** parameter to **location**, the **longitude** and **latitude** parameters are required.</p>
     * <p>*   When you set the **MessageType** parameter to **sticker**, the **link** parameter is required, and the **caption** and **fileName** parameters are invalid.</p>
     * <p>*   When you set the **MessageType** parameter to **reaction**, the **messageId** and **emoji** parameters are required.</p>
     * <br>
     * <p>**Usage notes when you set the ChannelType parameter to viber:**</p>
     * <br>
     * <p>*   When you set the **MessageType** parameter to **text**, the **text** parameter is required.</p>
     * <p>*   When you set the **MessageType** parameter to **image**, the **link** parameter is required.</p>
     * <p>*   When you set the **MessageType** parameter to **video**, the **link**, **thumbnail**, **fileSize**, and **duration** parameters are required.</p>
     * <p>*   When you set the **MessageType** parameter to **document**, the **link**, **fileName**, and **fileType** parameters are required.</p>
     * <p>*   When you set the **MessageType** parameter to **text_button**, the **text**, **caption**, and **action** parameters are required.</p>
     * <p>*   When you set the **MessageType** parameter to **text_image_button**, the **text**, **link**, **caption**, and **action** parameters are required.</p>
     * <p>*   When you set the **MessageType** parameter to **text_video**, the **text**, **link**, **thumbnail**, **fileSize**, and **duration** parameters are required.</p>
     * <p>*   When you set the **MessageType** parameter to **text_video_button**, the **text**, **link**, **thumbnail**, **fileSize**, **duration**, and **caption** parameters are required. The **action** parameter is invalid.</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The ID of the message to reply to.</p>
     */
    @NameInMap("ContextMessageId")
    public String contextMessageId;

    /**
     * <p>The space ID of the user.</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>The ID of the WhatsApp account that you register.</p>
     */
    @NameInMap("CustWabaId")
    @Deprecated
    public String custWabaId;

    /**
     * <p>The content of the fallback message.</p>
     */
    @NameInMap("FallBackContent")
    public String fallBackContent;

    /**
     * <p>Specifies the period of time after which the fallback Short Message Service (SMS) message is sent if the message receipt that indicates the message is delivered to customers is not received. If this parameter is left empty, the fallback SMS message is sent only when the **message fails to be sent** or **the message receipt that indicates the message is not delivered to customers** is received. Valid values: 60 to 43200. Unit: seconds.</p>
     */
    @NameInMap("FallBackDuration")
    public Integer fallBackDuration;

    /**
     * <p>The ID of the fallback strategy. You can create a fallback strategy and view the information in the console.</p>
     */
    @NameInMap("FallBackId")
    public String fallBackId;

    /**
     * <p>回落规则。</p>
     * <br>
     * <p>> 取值范围</p>
     * <p>> - undelivered  消息不能发送到端时回落（在发送状态时模板、参数需要校验通过，模板被封、号码被封等不做校验）。参数值为空时默认使用此规则</p>
     * <p>> - sentFailed  消息在校验模板、模板变量等参数时，校验不通过也会回落。只会强校验channelType, type, messageType, to, from(是否存在) 几个参数。</p>
     * <br>
     * <p><props="china"></p>
     * <br>
     * <p>> 中国站此字段无效</p>
     * <p></props></p>
     */
    @NameInMap("FallBackRule")
    public String fallBackRule;

    /**
     * <p>Flow发送数据</p>
     */
    @NameInMap("FlowAction")
    public String flowActionShrink;

    /**
     * <p>The phone number of the message sender.</p>
     * <br>
     * <p>> You can specify a mobile phone number that is registered for a WhatsApp account and is approved in the ChatAPP console.</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>The independent software vendor (ISV) verification code, which is used to verify whether the user is authorized by the ISV account.</p>
     */
    @NameInMap("IsvCode")
    public String isvCode;

    /**
     * <p>The type of the Viber message. This parameter is required if you set the ChannelType parameter to viber. Valid values: promotion and transaction.</p>
     */
    @NameInMap("Label")
    public String label;

    /**
     * <p>The language that is used in the message template. This parameter is required only if you set the Type parameter to **template**. For more information about language codes, see [Language codes](~~463420~~).</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The specific type of the message. This parameter is required only if you set the Type parameter to **message**.</p>
     * <br>
     * <p>**Valid values of MessageType when you set the ChannelType parameter to whatsapp:**</p>
     * <br>
     * <p>*   **text**: a text message.</p>
     * <p>*   **image**: an image message.</p>
     * <p>*   **video**: a video message.</p>
     * <p>*   **audio**: an audio message.</p>
     * <p>*   **document**: a document message.</p>
     * <p>*   **interactive**: an interactive message.</p>
     * <p>*   **contacts**: a contact message.</p>
     * <p>*   **location**: a location message.</p>
     * <p>*   **sticker**: a sticker message.</p>
     * <p>*   **reaction**: a reaction message.</p>
     * <br>
     * <p>**Valid values of MessageType when you set the ChannelType parameter to viber:**</p>
     * <br>
     * <p>*   **text**: a text message.</p>
     * <p>*   **image**: an image message.</p>
     * <p>*   **video**: a video message.</p>
     * <p>*   **document**: a document message.</p>
     * <p>*   **text_button**: a message that contains the text and button media objects.</p>
     * <p>*   **text_image_button**: a message that contains multiple media objects, including the text, image, and button.</p>
     * <p>*   **text_video**: a message that contains the text and video media objects.</p>
     * <p>*   **text_video_button**: a message that contains multiple media objects, including text, video, and button.</p>
     * <p>*   **text_image**: a message that contains the text and image media objects.</p>
     * <br>
     * <p>> For more information, see [Parameters of a message template](~~454530~~).</p>
     */
    @NameInMap("MessageType")
    public String messageType;

    /**
     * <p>The payload of the button.</p>
     */
    @NameInMap("Payload")
    public String payloadShrink;

    /**
     * <p>The information about the products included in the WhatsApp catalog message or multi-product message (MPM).</p>
     */
    @NameInMap("ProductAction")
    public String productActionShrink;

    /**
     * <p>The tag information of the Viber message.</p>
     */
    @NameInMap("Tag")
    public String tag;

    /**
     * <p>The ID of the task.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The code of the message template. This parameter is required only if you set the Type parameter to **template**.</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The variables of the message template.</p>
     */
    @NameInMap("TemplateParams")
    public String templateParamsShrink;

    /**
     * <p>The phone number that receives the message.</p>
     */
    @NameInMap("To")
    public String to;

    /**
     * <p>The tracking ID of the Viber message.</p>
     */
    @NameInMap("TrackingData")
    public String trackingData;

    /**
     * <p>The timeout period for sending the Viber message. Valid values: 30 to 1209600. Unit: seconds.</p>
     */
    @NameInMap("Ttl")
    public Integer ttl;

    /**
     * <p>The type of the message. Valid values:</p>
     * <br>
     * <p>*   **template**: a template message. A template message is sent based on a template that is created in the ChatAPP console and is approved. You can send template messages at any time based on your business requirements.</p>
     * <p>*   **message**: a custom message. You can send a custom message to a user only within 24 hours after you receive the last message from the user.</p>
     */
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

    public SendChatappMessageShrinkRequest setFallBackDuration(Integer fallBackDuration) {
        this.fallBackDuration = fallBackDuration;
        return this;
    }
    public Integer getFallBackDuration() {
        return this.fallBackDuration;
    }

    public SendChatappMessageShrinkRequest setFallBackId(String fallBackId) {
        this.fallBackId = fallBackId;
        return this;
    }
    public String getFallBackId() {
        return this.fallBackId;
    }

    public SendChatappMessageShrinkRequest setFallBackRule(String fallBackRule) {
        this.fallBackRule = fallBackRule;
        return this;
    }
    public String getFallBackRule() {
        return this.fallBackRule;
    }

    public SendChatappMessageShrinkRequest setFlowActionShrink(String flowActionShrink) {
        this.flowActionShrink = flowActionShrink;
        return this;
    }
    public String getFlowActionShrink() {
        return this.flowActionShrink;
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

    public SendChatappMessageShrinkRequest setProductActionShrink(String productActionShrink) {
        this.productActionShrink = productActionShrink;
        return this;
    }
    public String getProductActionShrink() {
        return this.productActionShrink;
    }

    public SendChatappMessageShrinkRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public SendChatappMessageShrinkRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public SendChatappMessageShrinkRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public SendChatappMessageShrinkRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
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
