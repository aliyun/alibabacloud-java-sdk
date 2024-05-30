// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class SendChatappMassMessageShrinkRequest extends TeaModel {
    /**
     * <p>The channel type. Valid values: whatsapp, viber, and line.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ChannelType")
    public String channelType;

    /**
     * <p>The space ID of the user.</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>The ID of the WhatsApp Business account under the ISV account.</p>
     */
    @NameInMap("CustWabaId")
    @Deprecated
    public String custWabaId;

    /**
     * <p>The fallback content.</p>
     */
    @NameInMap("FallBackContent")
    public String fallBackContent;

    @NameInMap("FallBackDuration")
    public Integer fallBackDuration;

    /**
     * <p>The ID of the fallback strategy.</p>
     */
    @NameInMap("FallBackId")
    public String fallBackId;

    /**
     * <p>The fallback rule.</p>
     * <br>
     * <p>>  Valid values:</p>
     * <br>
     * <p>*   undelivered: A fallback is triggered if the WhatsApp message is not delivered to clients. When the WhatsApp message is being sent, the template parameters are verified. If the parameters fail to pass the verification, the message fails to be sent. Whether the template and phone number are prohibited is not verified. By default, this value is used when FallBackRule is left empty.</p>
     * <br>
     * <p>*   sentfailed: A fallback is triggered even if the template parameters including variables fail to pass the verification. If the channelType, type, messageType, to, and from parameters fail to pass the verification, a fallback is not triggered.</p>
     */
    @NameInMap("FallBackRule")
    public String fallBackRule;

    /**
     * <p>The phone number of the message sender.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>The ISV verification code, which is used to verify whether the user is authorized by the ISV account.</p>
     */
    @NameInMap("IsvCode")
    public String isvCode;

    /**
     * <p>The message type when the ChannelType parameter is set to viber. Valid values: promotion and transaction.</p>
     */
    @NameInMap("Label")
    public String label;

    /**
     * <p>The language. For more information about language codes, see [Language codes](https://help.aliyun.com/document_detail/463420.html).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The phone numbers to which the message is sent.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SenderList")
    public String senderListShrink;

    /**
     * <p>The tag information when the ChannelType parameter is set to viber.</p>
     */
    @NameInMap("Tag")
    public String tag;

    /**
     * <p>The ID of the task.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The encoding of the message template.</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The timeout period for sending messages when the ChannelType parameter is set to viber. Valid values: 30 to 1209600. Unit: seconds.</p>
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
