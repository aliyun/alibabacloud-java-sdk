// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class SendChatappMessageShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("AdAccountId")
    public String adAccountId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
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
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("ContextMessageId")
    public String contextMessageId;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("CustWabaId")
    @Deprecated
    public String custWabaId;

    /**
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("FallBackContent")
    public String fallBackContent;

    @NameInMap("FallBackDuration")
    public Integer fallBackDuration;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("FallBackId")
    public String fallBackId;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("FallBackRule")
    public String fallBackRule;

    @NameInMap("FlowAction")
    public String flowActionShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("IsvCode")
    @Deprecated
    public String isvCode;

    /**
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("Label")
    public String label;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("MessageCampaignId")
    public String messageCampaignId;

    /**
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("MessageType")
    public String messageType;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The payload of the button.</p>
     * 
     * <strong>example:</strong>
     * <p>payloadtext1,payloadtext2,payloadtext3</p>
     */
    @NameInMap("Payload")
    public String payloadShrink;

    @NameInMap("ProductAction")
    public String productActionShrink;

    /**
     * <strong>example:</strong>
     * <p>individual</p>
     */
    @NameInMap("RecipientType")
    public String recipientType;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("Tag")
    public String tag;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    @NameInMap("TemplateParams")
    public String templateParamsShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("To")
    public String to;

    /**
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("TokenType")
    public String tokenType;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("TrackingData")
    public String trackingData;

    @NameInMap("Ttl")
    public Integer ttl;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("Type")
    public String type;

    public static SendChatappMessageShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SendChatappMessageShrinkRequest self = new SendChatappMessageShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SendChatappMessageShrinkRequest setAdAccountId(String adAccountId) {
        this.adAccountId = adAccountId;
        return this;
    }
    public String getAdAccountId() {
        return this.adAccountId;
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

    @Deprecated
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

    @Deprecated
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

    public SendChatappMessageShrinkRequest setMessageCampaignId(String messageCampaignId) {
        this.messageCampaignId = messageCampaignId;
        return this;
    }
    public String getMessageCampaignId() {
        return this.messageCampaignId;
    }

    public SendChatappMessageShrinkRequest setMessageType(String messageType) {
        this.messageType = messageType;
        return this;
    }
    public String getMessageType() {
        return this.messageType;
    }

    public SendChatappMessageShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
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

    public SendChatappMessageShrinkRequest setRecipientType(String recipientType) {
        this.recipientType = recipientType;
        return this;
    }
    public String getRecipientType() {
        return this.recipientType;
    }

    public SendChatappMessageShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SendChatappMessageShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
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

    public SendChatappMessageShrinkRequest setTokenType(String tokenType) {
        this.tokenType = tokenType;
        return this;
    }
    public String getTokenType() {
        return this.tokenType;
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
