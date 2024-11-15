// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class SendChatappMessageShrinkRequest extends TeaModel {
    /**
     * <p>The channel type. Valid values:</p>
     * <ul>
     * <li><strong>whatsapp</strong></li>
     * <li><strong>viber</strong></li>
     * <li><strong>line</strong> (under development)</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>whatsapp</p>
     */
    @NameInMap("ChannelType")
    public String channelType;

    /**
     * <p>The message content.</p>
     * <p><strong>Notes on WhatsApp messages:</strong></p>
     * <ul>
     * <li>If you set <strong>messageType</strong> to <strong>text</strong>, you must specify <strong>text</strong> and must not specify <strong>Caption</strong>.</li>
     * <li>If you set <strong>messageType</strong> to <strong>image</strong>, you must specify <strong>Link</strong>.</li>
     * <li>If you set <strong>messageType</strong> to <strong>video</strong>, you must specify <strong>Link</strong>.</li>
     * <li>If you set <strong>messageType</strong> to <strong>audio</strong>, <strong>Link</strong> is required and <strong>Caption</strong> is invalid.</li>
     * <li>If you set <strong>messageType</strong> to <strong>document</strong>, <strong>Link</strong> and <strong>FileName</strong> are required and <strong>Caption</strong> is invalid.</li>
     * <li>If you set <strong>messageType</strong> to <strong>interactive</strong>, you must specify <strong>type</strong> and <strong>action</strong>.</li>
     * <li>If you set <strong>messageType</strong> to <strong>contacts</strong>, you must specify <strong>name</strong>.</li>
     * <li>If you set <strong>messageType</strong> to <strong>location</strong>, you must specify <strong>longitude</strong> and <strong>latitude</strong>.</li>
     * <li>If you set <strong>messageType</strong> to <strong>sticker</strong>, you must specify <strong>Link</strong>, and <strong>Caption</strong> and <strong>FileName</strong> are invalid.</li>
     * <li>If you set <strong>messageType</strong> to <strong>reaction</strong>, you must specify <strong>messageId</strong> and <strong>emoji</strong>.</li>
     * </ul>
     * <p><strong>Notes on Viber messages:</strong></p>
     * <ul>
     * <li>If you set <strong>messageType</strong> to <strong>text</strong>, you must specify <strong>text</strong>.</li>
     * <li>If you set <strong>messageType</strong> to <strong>image</strong>, you must specify <strong>link</strong>.</li>
     * <li>If you set <strong>messageType</strong> to <strong>video</strong>, you must specify <strong>link</strong>, <strong>thumbnail</strong>, <strong>fileSize</strong>, and <strong>duration</strong>.</li>
     * <li>If you set <strong>messageType</strong> to <strong>document</strong>, you must specify <strong>link</strong>, <strong>fileName</strong>, and <strong>fileType</strong>.</li>
     * <li>If you set <strong>messageType</strong> to <strong>text_button</strong>, you must specify <strong>text</strong>, <strong>caption</strong>, and <strong>action</strong>.</li>
     * <li>If you set <strong>messageType</strong> to <strong>text_image_button</strong>, you must specify <strong>text</strong>, <strong>link</strong>, <strong>caption</strong>, and <strong>action</strong>.</li>
     * <li>If you set <strong>messageType</strong> to <strong>text_video</strong>, you must specify <strong>text</strong>, <strong>link</strong>, <strong>thumbnail</strong>, <strong>fileSize</strong>, and <strong>duration</strong>.</li>
     * <li>If you set <strong>messageType</strong> to <strong>text_video_button</strong>, you must specify <strong>text</strong>, <strong>link</strong>, <strong>thumbnail</strong>, <strong>fileSize</strong>, <strong>duration</strong>, and <strong>caption</strong>. In addition, you must not specify <strong>action</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;text\&quot;: \&quot;hello whatsapp\&quot;, \&quot;link\&quot;: \&quot;\&quot;, \&quot;caption\&quot;: \&quot;\&quot;, \&quot;fileName\&quot;: \&quot;\&quot; }</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The ID of the reply message.</p>
     * 
     * <strong>example:</strong>
     * <p>61851ccb2f1365b16aee****</p>
     */
    @NameInMap("ContextMessageId")
    public String contextMessageId;

    /**
     * <p>The space ID of the user.</p>
     * 
     * <strong>example:</strong>
     * <p>28251486512358****</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>The WhatsApp Business Account (WABA) ID of the RAM user within the independent software vendor (ISV) account.</p>
     * <blockquote>
     * <p> CustWabaId is an obsolete parameter. Use CustSpaceId instead.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>65921621816****</p>
     */
    @NameInMap("CustWabaId")
    @Deprecated
    public String custWabaId;

    /**
     * <p>The content of the fallback message.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a fallback message.</p>
     */
    @NameInMap("FallBackContent")
    public String fallBackContent;

    /**
     * <p>Specifies the period of time after which the fallback message is sent if the message receipt that indicates the message is delivered to clients is not received. If this parameter is left empty, the fallback message is sent only when the <strong>message fails to be sent</strong> or <strong>the message receipt that indicates the message is not delivered to clients</strong> is received. Unit: seconds. Valid values: 60 to 43200.</p>
     * 
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("FallBackDuration")
    public Integer fallBackDuration;

    /**
     * <p>The ID of the fallback policy. You can create a fallback policy and view the information in the Chat App Message Service console.</p>
     * 
     * <strong>example:</strong>
     * <p>S_000001</p>
     */
    @NameInMap("FallBackId")
    public String fallBackId;

    /**
     * <p>The fallback rule. Valid values:</p>
     * <ul>
     * <li><strong>undelivered</strong>: A fallback is triggered if the message is not delivered to clients. When the message is being sent, the template parameters are verified. If the parameters fail to pass the verification, the message fails to be sent. Whether the template and phone number are prohibited is not verified. By default, this value is used when FallBackRule is left empty.</li>
     * <li><strong>sentFailed</strong>: A fallback is triggered even if the template parameters including variables fail to pass the verification. If the channelType, type, messageType, to, and from parameters fail to pass the verification, a fallback is not triggered.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>undelivered</p>
     */
    @NameInMap("FallBackRule")
    public String fallBackRule;

    /**
     * <p>The Flow action.</p>
     */
    @NameInMap("FlowAction")
    public String flowActionShrink;

    /**
     * <p>The mobile phone number of the message sender.</p>
     * <blockquote>
     * <p> You can specify a mobile phone number that is registered for a WhatsApp account and is approved in the Chat App Message Service console.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1360000****</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>The ISV verification code. This parameter is used to verify whether the RAM user is authorized by the ISV account.</p>
     * 
     * <strong>example:</strong>
     * <p>skdi3kksloslikdkkdk</p>
     */
    @NameInMap("IsvCode")
    public String isvCode;

    /**
     * <p>The type of the Viber message. This parameter is required if ChannelType is set to viber. Valid values:</p>
     * <ul>
     * <li><strong>promotion</strong></li>
     * <li><strong>transaction</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>promotion</p>
     */
    @NameInMap("Label")
    public String label;

    /**
     * <p>The language that is used in the message template. This parameter is required only if you set the Type parameter to <strong>template</strong>. For more information about language codes, see <a href="https://help.aliyun.com/document_detail/463420.html">Language codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The specific type of the message. This parameter is required only if you set the Type parameter to <strong>message</strong>.</p>
     * <p><strong>Valid values of MessageType when you set the ChannelType parameter to whatsapp:</strong></p>
     * <ul>
     * <li><strong>text</strong>: a text message.</li>
     * <li><strong>image</strong>: an image message.</li>
     * <li><strong>video</strong>: a video message.</li>
     * <li><strong>audio</strong>: an audio message.</li>
     * <li><strong>document</strong>: a document message.</li>
     * <li><strong>interactive</strong>: an interactive message.</li>
     * <li><strong>contacts</strong>: a contact message.</li>
     * <li><strong>location</strong>: a location message.</li>
     * <li><strong>sticker</strong>: a sticker message.</li>
     * <li><strong>reaction</strong>: a reaction message.</li>
     * </ul>
     * <p><strong>Valid values of MessageType when you set the ChannelType parameter to viber:</strong></p>
     * <ul>
     * <li><strong>text</strong>: a text message.</li>
     * <li><strong>image</strong>: an image message.</li>
     * <li><strong>video</strong>: a video message.</li>
     * <li><strong>document</strong>: a document message.</li>
     * <li><strong>text_button</strong>: a message that contains the text and button media objects.</li>
     * <li><strong>text_image_button</strong>: a message that contains multiple media objects, including the text, image, and button.</li>
     * <li><strong>text_video</strong>: a message that contains the text and video media objects.</li>
     * <li><strong>text_video_button</strong>: a message that contains multiple media objects, including text, video, and button.</li>
     * <li><strong>text_image</strong>: a message that contains the text and image media objects.</li>
     * </ul>
     * <blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/454530.html">Parameters of a message template</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("MessageType")
    public String messageType;

    /**
     * <p>The payload of the button.</p>
     * 
     * <strong>example:</strong>
     * <p>payloadtext1,payloadtext2,payloadtext3</p>
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
     * 
     * <strong>example:</strong>
     * <p>tag</p>
     */
    @NameInMap("Tag")
    public String tag;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>100000001</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The code of the message template. This parameter is required only if you set the Type parameter to <strong>template</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>744c4b5c79c9432497a075bdfca3****</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

    /**
     * <p>The name of the message template.</p>
     * 
     * <strong>example:</strong>
     * <p>test_name</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The variables of the message template.</p>
     */
    @NameInMap("TemplateParams")
    public String templateParamsShrink;

    /**
     * <p>The mobile phone number of the message receiver.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1390000****</p>
     */
    @NameInMap("To")
    public String to;

    /**
     * <p>The tracking data of the Viber message.</p>
     * 
     * <strong>example:</strong>
     * <p>tracking_id:123456</p>
     */
    @NameInMap("TrackingData")
    public String trackingData;

    /**
     * <p>The timeout period for sending the Viber message. Valid values: 30 to 1209600. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("Ttl")
    public Integer ttl;

    /**
     * <p>The message type. Valid values:</p>
     * <ul>
     * <li><strong>template</strong>: the template message. A template message is sent based on a template that is created and approved in the Chat App Message Service console. You can send template messages based on your business requirements.</li>
     * <li><strong>message</strong>: the custom message. You can send a custom WhatsApp message to a user only within 24 hours after you receive the last message from the user. This limit does not apply to custom Viber messages.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>template</p>
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
