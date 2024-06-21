// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class SendChatappMessageShrinkRequest extends TeaModel {
    /**
     * <p>The type of the message channel. Valid values:</p>
     * <ul>
     * <li><strong>whatsapp</strong></li>
     * <li><strong>viber</strong></li>
     * <li>line. The feature that ChatAPP sends messages by using Line is under development.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>whatsapp</p>
     */
    @NameInMap("ChannelType")
    public String channelType;

    /**
     * <p>The content of the message.</p>
     * <p><strong>Usage notes when you set the ChannelType parameter to whatsapp:</strong></p>
     * <ul>
     * <li>When you set the <strong>MessageType</strong> parameter to <strong>text</strong>, the <strong>text</strong> parameter is required and the <strong>caption</strong> parameter cannot be specified.</li>
     * <li>When you set the <strong>MessageType</strong> parameter to <strong>image</strong>, the <strong>link</strong> parameter is required.</li>
     * <li>When you set the <strong>MessageType</strong> parameter to <strong>video</strong>, the <strong>link</strong> parameter is required.</li>
     * <li>When you set the <strong>MessageType</strong> parameter to <strong>audio</strong>, the <strong>link</strong> parameter is required and the <strong>caption</strong> parameter is invalid.</li>
     * <li>When you set the <strong>MessageType</strong> parameter to <strong>document</strong>, the <strong>link</strong> and <strong>fileName</strong> parameters are required and the <strong>caption</strong> parameter is invalid.</li>
     * <li>When you set the <strong>MessageType</strong> parameter to <strong>interactive</strong>, the <strong>type</strong> and <strong>action</strong> parameters are required.</li>
     * <li>When you set the <strong>MessageType</strong> parameter to <strong>contacts</strong>, the <strong>name</strong> parameter is required.</li>
     * <li>When you set the <strong>MessageType</strong> parameter to <strong>location</strong>, the <strong>longitude</strong> and <strong>latitude</strong> parameters are required.</li>
     * <li>When you set the <strong>MessageType</strong> parameter to <strong>sticker</strong>, the <strong>link</strong> parameter is required, and the <strong>caption</strong> and <strong>fileName</strong> parameters are invalid.</li>
     * <li>When you set the <strong>MessageType</strong> parameter to <strong>reaction</strong>, the <strong>messageId</strong> and <strong>emoji</strong> parameters are required.</li>
     * </ul>
     * <p><strong>Usage notes when you set the ChannelType parameter to viber:</strong></p>
     * <ul>
     * <li>When you set the <strong>MessageType</strong> parameter to <strong>text</strong>, the <strong>text</strong> parameter is required.</li>
     * <li>When you set the <strong>MessageType</strong> parameter to <strong>image</strong>, the <strong>link</strong> parameter is required.</li>
     * <li>When you set the <strong>MessageType</strong> parameter to <strong>video</strong>, the <strong>link</strong>, <strong>thumbnail</strong>, <strong>fileSize</strong>, and <strong>duration</strong> parameters are required.</li>
     * <li>When you set the <strong>MessageType</strong> parameter to <strong>document</strong>, the <strong>link</strong>, <strong>fileName</strong>, and <strong>fileType</strong> parameters are required.</li>
     * <li>When you set the <strong>MessageType</strong> parameter to <strong>text_button</strong>, the <strong>text</strong>, <strong>caption</strong>, and <strong>action</strong> parameters are required.</li>
     * <li>When you set the <strong>MessageType</strong> parameter to <strong>text_image_button</strong>, the <strong>text</strong>, <strong>link</strong>, <strong>caption</strong>, and <strong>action</strong> parameters are required.</li>
     * <li>When you set the <strong>MessageType</strong> parameter to <strong>text_video</strong>, the <strong>text</strong>, <strong>link</strong>, <strong>thumbnail</strong>, <strong>fileSize</strong>, and <strong>duration</strong> parameters are required.</li>
     * <li>When you set the <strong>MessageType</strong> parameter to <strong>text_video_button</strong>, the <strong>text</strong>, <strong>link</strong>, <strong>thumbnail</strong>, <strong>fileSize</strong>, <strong>duration</strong>, and <strong>caption</strong> parameters are required. The <strong>action</strong> parameter is invalid.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;text\&quot;: \&quot;hello whatsapp\&quot;, \&quot;link\&quot;: \&quot;\&quot;, \&quot;caption\&quot;: \&quot;\&quot;, \&quot;fileName\&quot;: \&quot;\&quot; }</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The ID of the message to reply to.</p>
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
     * <p>The ID of the WhatsApp account that you register.</p>
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
     * <p>Specifies the period of time after which the fallback Short Message Service (SMS) message is sent if the message receipt that indicates the message is delivered to customers is not received. If this parameter is left empty, the fallback SMS message is sent only when the <strong>message fails to be sent</strong> or <strong>the message receipt that indicates the message is not delivered to customers</strong> is received. Valid values: 60 to 43200. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("FallBackDuration")
    public Integer fallBackDuration;

    /**
     * <p>The ID of the fallback strategy. You can create a fallback strategy and view the information in the console.</p>
     * 
     * <strong>example:</strong>
     * <p>S_000001</p>
     */
    @NameInMap("FallBackId")
    public String fallBackId;

    /**
     * <p>回落规则。</p>
     * <blockquote>
     * <p>取值范围</p>
     * <ul>
     * <li>undelivered  消息不能发送到端时回落（在发送状态时模板、参数需要校验通过，模板被封、号码被封等不做校验）。参数值为空时默认使用此规则</li>
     * <li>sentFailed  消息在校验模板、模板变量等参数时，校验不通过也会回落。只会强校验channelType, type, messageType, to, from(是否存在) 几个参数。</li>
     * </ul>
     * </blockquote>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <blockquote>
     * <p>中国站此字段无效</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>undelivered</p>
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
     * <blockquote>
     * <p>You can specify a mobile phone number that is registered for a WhatsApp account and is approved in the ChatAPP console.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1360000****</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>The independent software vendor (ISV) verification code, which is used to verify whether the user is authorized by the ISV account.</p>
     * 
     * <strong>example:</strong>
     * <p>skdi3kksloslikdkkdk</p>
     */
    @NameInMap("IsvCode")
    public String isvCode;

    /**
     * <p>The type of the Viber message. This parameter is required if you set the ChannelType parameter to viber. Valid values: promotion and transaction.</p>
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
     * <p>The ID of the task.</p>
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
     * <p>The phone number that receives the message.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1390000****</p>
     */
    @NameInMap("To")
    public String to;

    /**
     * <p>The tracking ID of the Viber message.</p>
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
     * <p>The type of the message. Valid values:</p>
     * <ul>
     * <li><strong>template</strong>: a template message. A template message is sent based on a template that is created in the ChatAPP console and is approved. You can send template messages at any time based on your business requirements.</li>
     * <li><strong>message</strong>: a custom message. You can send a custom message to a user only within 24 hours after you receive the last message from the user.</li>
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
