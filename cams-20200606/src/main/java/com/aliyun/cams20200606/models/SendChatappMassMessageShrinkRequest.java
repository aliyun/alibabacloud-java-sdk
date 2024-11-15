// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class SendChatappMassMessageShrinkRequest extends TeaModel {
    /**
     * <p>The type of the channel. Valid values:</p>
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
     * <p>Fallback message</p>
     */
    @NameInMap("FallBackContent")
    public String fallBackContent;

    /**
     * <p>Specifies the period of time after which the fallback message is sent if the message receipt that indicates the message is delivered to clients is not received. If this parameter is left empty, the fallback message is sent only when the message fails to be sent or the message receipt that indicates the message is not delivered to clients is received. Unit: seconds. Valid values: 60 to 43200.</p>
     * 
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("FallBackDuration")
    public Integer fallBackDuration;

    /**
     * <p>The ID of the fallback policy.</p>
     * 
     * <strong>example:</strong>
     * <p>S00001</p>
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
     * <p>The mobile phone number of the message sender.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>861387777****</p>
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
     * <p>The type of the Viber message. Valid values:</p>
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
     * <p>The language. For more information about language codes, see <a href="https://help.aliyun.com/document_detail/463420.html">Language codes</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The mobile phone numbers of the message receivers.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SenderList")
    public String senderListShrink;

    /**
     * <p>The tag information when the ChannelType parameter is set to viber.</p>
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
     * <p>The template code.</p>
     * 
     * <strong>example:</strong>
     * <p>744c4b5c79c9432497a075bdfca36bf5</p>
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
     * <p>The timeout period for sending messages when the ChannelType parameter is set to viber. Valid values: 30 to 1209600. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("Ttl")
    public Long ttl;

    public static SendChatappMassMessageShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SendChatappMassMessageShrinkRequest self = new SendChatappMassMessageShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SendChatappMassMessageShrinkRequest setChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }
    public String getChannelType() {
        return this.channelType;
    }

    public SendChatappMassMessageShrinkRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public SendChatappMassMessageShrinkRequest setCustWabaId(String custWabaId) {
        this.custWabaId = custWabaId;
        return this;
    }
    public String getCustWabaId() {
        return this.custWabaId;
    }

    public SendChatappMassMessageShrinkRequest setFallBackContent(String fallBackContent) {
        this.fallBackContent = fallBackContent;
        return this;
    }
    public String getFallBackContent() {
        return this.fallBackContent;
    }

    public SendChatappMassMessageShrinkRequest setFallBackDuration(Integer fallBackDuration) {
        this.fallBackDuration = fallBackDuration;
        return this;
    }
    public Integer getFallBackDuration() {
        return this.fallBackDuration;
    }

    public SendChatappMassMessageShrinkRequest setFallBackId(String fallBackId) {
        this.fallBackId = fallBackId;
        return this;
    }
    public String getFallBackId() {
        return this.fallBackId;
    }

    public SendChatappMassMessageShrinkRequest setFallBackRule(String fallBackRule) {
        this.fallBackRule = fallBackRule;
        return this;
    }
    public String getFallBackRule() {
        return this.fallBackRule;
    }

    public SendChatappMassMessageShrinkRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public SendChatappMassMessageShrinkRequest setIsvCode(String isvCode) {
        this.isvCode = isvCode;
        return this;
    }
    public String getIsvCode() {
        return this.isvCode;
    }

    public SendChatappMassMessageShrinkRequest setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public SendChatappMassMessageShrinkRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public SendChatappMassMessageShrinkRequest setSenderListShrink(String senderListShrink) {
        this.senderListShrink = senderListShrink;
        return this;
    }
    public String getSenderListShrink() {
        return this.senderListShrink;
    }

    public SendChatappMassMessageShrinkRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public SendChatappMassMessageShrinkRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public SendChatappMassMessageShrinkRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public SendChatappMassMessageShrinkRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public SendChatappMassMessageShrinkRequest setTtl(Long ttl) {
        this.ttl = ttl;
        return this;
    }
    public Long getTtl() {
        return this.ttl;
    }

}
