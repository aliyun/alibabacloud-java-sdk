// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class SendChatappMessageRequest extends TeaModel {
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
    public SendChatappMessageRequestFlowAction flowAction;

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
    public java.util.List<String> payload;

    @NameInMap("ProductAction")
    public SendChatappMessageRequestProductAction productAction;

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
    public java.util.Map<String, String> templateParams;

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

    public static SendChatappMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        SendChatappMessageRequest self = new SendChatappMessageRequest();
        return TeaModel.build(map, self);
    }

    public SendChatappMessageRequest setAdAccountId(String adAccountId) {
        this.adAccountId = adAccountId;
        return this;
    }
    public String getAdAccountId() {
        return this.adAccountId;
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

    @Deprecated
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

    public SendChatappMessageRequest setFallBackDuration(Integer fallBackDuration) {
        this.fallBackDuration = fallBackDuration;
        return this;
    }
    public Integer getFallBackDuration() {
        return this.fallBackDuration;
    }

    public SendChatappMessageRequest setFallBackId(String fallBackId) {
        this.fallBackId = fallBackId;
        return this;
    }
    public String getFallBackId() {
        return this.fallBackId;
    }

    public SendChatappMessageRequest setFallBackRule(String fallBackRule) {
        this.fallBackRule = fallBackRule;
        return this;
    }
    public String getFallBackRule() {
        return this.fallBackRule;
    }

    public SendChatappMessageRequest setFlowAction(SendChatappMessageRequestFlowAction flowAction) {
        this.flowAction = flowAction;
        return this;
    }
    public SendChatappMessageRequestFlowAction getFlowAction() {
        return this.flowAction;
    }

    public SendChatappMessageRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    @Deprecated
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

    public SendChatappMessageRequest setMessageCampaignId(String messageCampaignId) {
        this.messageCampaignId = messageCampaignId;
        return this;
    }
    public String getMessageCampaignId() {
        return this.messageCampaignId;
    }

    public SendChatappMessageRequest setMessageType(String messageType) {
        this.messageType = messageType;
        return this;
    }
    public String getMessageType() {
        return this.messageType;
    }

    public SendChatappMessageRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SendChatappMessageRequest setPayload(java.util.List<String> payload) {
        this.payload = payload;
        return this;
    }
    public java.util.List<String> getPayload() {
        return this.payload;
    }

    public SendChatappMessageRequest setProductAction(SendChatappMessageRequestProductAction productAction) {
        this.productAction = productAction;
        return this;
    }
    public SendChatappMessageRequestProductAction getProductAction() {
        return this.productAction;
    }

    public SendChatappMessageRequest setRecipientType(String recipientType) {
        this.recipientType = recipientType;
        return this;
    }
    public String getRecipientType() {
        return this.recipientType;
    }

    public SendChatappMessageRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SendChatappMessageRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SendChatappMessageRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public SendChatappMessageRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public SendChatappMessageRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public SendChatappMessageRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
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

    public SendChatappMessageRequest setTokenType(String tokenType) {
        this.tokenType = tokenType;
        return this;
    }
    public String getTokenType() {
        return this.tokenType;
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

    public static class SendChatappMessageRequestFlowAction extends TeaModel {
        @NameInMap("FlowActionData")
        public java.util.Map<String, ?> flowActionData;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("FlowToken")
        public String flowToken;

        public static SendChatappMessageRequestFlowAction build(java.util.Map<String, ?> map) throws Exception {
            SendChatappMessageRequestFlowAction self = new SendChatappMessageRequestFlowAction();
            return TeaModel.build(map, self);
        }

        public SendChatappMessageRequestFlowAction setFlowActionData(java.util.Map<String, ?> flowActionData) {
            this.flowActionData = flowActionData;
            return this;
        }
        public java.util.Map<String, ?> getFlowActionData() {
            return this.flowActionData;
        }

        public SendChatappMessageRequestFlowAction setFlowToken(String flowToken) {
            this.flowToken = flowToken;
            return this;
        }
        public String getFlowToken() {
            return this.flowToken;
        }

    }

    public static class SendChatappMessageRequestProductActionSectionsProductItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("ProductRetailerId")
        public String productRetailerId;

        public static SendChatappMessageRequestProductActionSectionsProductItems build(java.util.Map<String, ?> map) throws Exception {
            SendChatappMessageRequestProductActionSectionsProductItems self = new SendChatappMessageRequestProductActionSectionsProductItems();
            return TeaModel.build(map, self);
        }

        public SendChatappMessageRequestProductActionSectionsProductItems setProductRetailerId(String productRetailerId) {
            this.productRetailerId = productRetailerId;
            return this;
        }
        public String getProductRetailerId() {
            return this.productRetailerId;
        }

    }

    public static class SendChatappMessageRequestProductActionSections extends TeaModel {
        @NameInMap("ProductItems")
        public java.util.List<SendChatappMessageRequestProductActionSectionsProductItems> productItems;

        /**
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("Title")
        public String title;

        public static SendChatappMessageRequestProductActionSections build(java.util.Map<String, ?> map) throws Exception {
            SendChatappMessageRequestProductActionSections self = new SendChatappMessageRequestProductActionSections();
            return TeaModel.build(map, self);
        }

        public SendChatappMessageRequestProductActionSections setProductItems(java.util.List<SendChatappMessageRequestProductActionSectionsProductItems> productItems) {
            this.productItems = productItems;
            return this;
        }
        public java.util.List<SendChatappMessageRequestProductActionSectionsProductItems> getProductItems() {
            return this.productItems;
        }

        public SendChatappMessageRequestProductActionSections setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class SendChatappMessageRequestProductAction extends TeaModel {
        @NameInMap("Sections")
        public java.util.List<SendChatappMessageRequestProductActionSections> sections;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("ThumbnailProductRetailerId")
        public String thumbnailProductRetailerId;

        public static SendChatappMessageRequestProductAction build(java.util.Map<String, ?> map) throws Exception {
            SendChatappMessageRequestProductAction self = new SendChatappMessageRequestProductAction();
            return TeaModel.build(map, self);
        }

        public SendChatappMessageRequestProductAction setSections(java.util.List<SendChatappMessageRequestProductActionSections> sections) {
            this.sections = sections;
            return this;
        }
        public java.util.List<SendChatappMessageRequestProductActionSections> getSections() {
            return this.sections;
        }

        public SendChatappMessageRequestProductAction setThumbnailProductRetailerId(String thumbnailProductRetailerId) {
            this.thumbnailProductRetailerId = thumbnailProductRetailerId;
            return this;
        }
        public String getThumbnailProductRetailerId() {
            return this.thumbnailProductRetailerId;
        }

    }

}
