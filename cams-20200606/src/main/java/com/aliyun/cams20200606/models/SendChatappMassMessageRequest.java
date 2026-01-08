// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class SendChatappMassMessageRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("ChannelType")
    public String channelType;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("CustWabaId")
    @Deprecated
    public String custWabaId;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
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
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("FallBackRule")
    public String fallBackRule;

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
     * <p>示例值示例值</p>
     */
    @NameInMap("IsvCode")
    @Deprecated
    public String isvCode;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("Label")
    public String label;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("Language")
    public String language;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SenderList")
    public java.util.List<SendChatappMassMessageRequestSenderList> senderList;

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
     * <p>示例值示例值</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <strong>example:</strong>
     * <p>46</p>
     */
    @NameInMap("Ttl")
    public Long ttl;

    public static SendChatappMassMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        SendChatappMassMessageRequest self = new SendChatappMassMessageRequest();
        return TeaModel.build(map, self);
    }

    public SendChatappMassMessageRequest setChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }
    public String getChannelType() {
        return this.channelType;
    }

    public SendChatappMassMessageRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    @Deprecated
    public SendChatappMassMessageRequest setCustWabaId(String custWabaId) {
        this.custWabaId = custWabaId;
        return this;
    }
    public String getCustWabaId() {
        return this.custWabaId;
    }

    public SendChatappMassMessageRequest setFallBackContent(String fallBackContent) {
        this.fallBackContent = fallBackContent;
        return this;
    }
    public String getFallBackContent() {
        return this.fallBackContent;
    }

    public SendChatappMassMessageRequest setFallBackDuration(Integer fallBackDuration) {
        this.fallBackDuration = fallBackDuration;
        return this;
    }
    public Integer getFallBackDuration() {
        return this.fallBackDuration;
    }

    public SendChatappMassMessageRequest setFallBackId(String fallBackId) {
        this.fallBackId = fallBackId;
        return this;
    }
    public String getFallBackId() {
        return this.fallBackId;
    }

    public SendChatappMassMessageRequest setFallBackRule(String fallBackRule) {
        this.fallBackRule = fallBackRule;
        return this;
    }
    public String getFallBackRule() {
        return this.fallBackRule;
    }

    public SendChatappMassMessageRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    @Deprecated
    public SendChatappMassMessageRequest setIsvCode(String isvCode) {
        this.isvCode = isvCode;
        return this;
    }
    public String getIsvCode() {
        return this.isvCode;
    }

    public SendChatappMassMessageRequest setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public SendChatappMassMessageRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public SendChatappMassMessageRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SendChatappMassMessageRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SendChatappMassMessageRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SendChatappMassMessageRequest setSenderList(java.util.List<SendChatappMassMessageRequestSenderList> senderList) {
        this.senderList = senderList;
        return this;
    }
    public java.util.List<SendChatappMassMessageRequestSenderList> getSenderList() {
        return this.senderList;
    }

    public SendChatappMassMessageRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public SendChatappMassMessageRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public SendChatappMassMessageRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public SendChatappMassMessageRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public SendChatappMassMessageRequest setTtl(Long ttl) {
        this.ttl = ttl;
        return this;
    }
    public Long getTtl() {
        return this.ttl;
    }

    public static class SendChatappMassMessageRequestSenderListFlowAction extends TeaModel {
        @NameInMap("FlowActionData")
        public java.util.Map<String, ?> flowActionData;

        /**
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("FlowToken")
        public String flowToken;

        public static SendChatappMassMessageRequestSenderListFlowAction build(java.util.Map<String, ?> map) throws Exception {
            SendChatappMassMessageRequestSenderListFlowAction self = new SendChatappMassMessageRequestSenderListFlowAction();
            return TeaModel.build(map, self);
        }

        public SendChatappMassMessageRequestSenderListFlowAction setFlowActionData(java.util.Map<String, ?> flowActionData) {
            this.flowActionData = flowActionData;
            return this;
        }
        public java.util.Map<String, ?> getFlowActionData() {
            return this.flowActionData;
        }

        public SendChatappMassMessageRequestSenderListFlowAction setFlowToken(String flowToken) {
            this.flowToken = flowToken;
            return this;
        }
        public String getFlowToken() {
            return this.flowToken;
        }

    }

    public static class SendChatappMassMessageRequestSenderListProductActionSectionsProductItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("ProductRetailerId")
        public String productRetailerId;

        public static SendChatappMassMessageRequestSenderListProductActionSectionsProductItems build(java.util.Map<String, ?> map) throws Exception {
            SendChatappMassMessageRequestSenderListProductActionSectionsProductItems self = new SendChatappMassMessageRequestSenderListProductActionSectionsProductItems();
            return TeaModel.build(map, self);
        }

        public SendChatappMassMessageRequestSenderListProductActionSectionsProductItems setProductRetailerId(String productRetailerId) {
            this.productRetailerId = productRetailerId;
            return this;
        }
        public String getProductRetailerId() {
            return this.productRetailerId;
        }

    }

    public static class SendChatappMassMessageRequestSenderListProductActionSections extends TeaModel {
        @NameInMap("ProductItems")
        public java.util.List<SendChatappMassMessageRequestSenderListProductActionSectionsProductItems> productItems;

        /**
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("Title")
        public String title;

        public static SendChatappMassMessageRequestSenderListProductActionSections build(java.util.Map<String, ?> map) throws Exception {
            SendChatappMassMessageRequestSenderListProductActionSections self = new SendChatappMassMessageRequestSenderListProductActionSections();
            return TeaModel.build(map, self);
        }

        public SendChatappMassMessageRequestSenderListProductActionSections setProductItems(java.util.List<SendChatappMassMessageRequestSenderListProductActionSectionsProductItems> productItems) {
            this.productItems = productItems;
            return this;
        }
        public java.util.List<SendChatappMassMessageRequestSenderListProductActionSectionsProductItems> getProductItems() {
            return this.productItems;
        }

        public SendChatappMassMessageRequestSenderListProductActionSections setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class SendChatappMassMessageRequestSenderListProductAction extends TeaModel {
        @NameInMap("Sections")
        public java.util.List<SendChatappMassMessageRequestSenderListProductActionSections> sections;

        /**
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("ThumbnailProductRetailerId")
        public String thumbnailProductRetailerId;

        public static SendChatappMassMessageRequestSenderListProductAction build(java.util.Map<String, ?> map) throws Exception {
            SendChatappMassMessageRequestSenderListProductAction self = new SendChatappMassMessageRequestSenderListProductAction();
            return TeaModel.build(map, self);
        }

        public SendChatappMassMessageRequestSenderListProductAction setSections(java.util.List<SendChatappMassMessageRequestSenderListProductActionSections> sections) {
            this.sections = sections;
            return this;
        }
        public java.util.List<SendChatappMassMessageRequestSenderListProductActionSections> getSections() {
            return this.sections;
        }

        public SendChatappMassMessageRequestSenderListProductAction setThumbnailProductRetailerId(String thumbnailProductRetailerId) {
            this.thumbnailProductRetailerId = thumbnailProductRetailerId;
            return this;
        }
        public String getThumbnailProductRetailerId() {
            return this.thumbnailProductRetailerId;
        }

    }

    public static class SendChatappMassMessageRequestSenderList extends TeaModel {
        @NameInMap("FlowAction")
        public SendChatappMassMessageRequestSenderListFlowAction flowAction;

        @NameInMap("Payload")
        public java.util.List<String> payload;

        @NameInMap("ProductAction")
        public SendChatappMassMessageRequestSenderListProductAction productAction;

        @NameInMap("TemplateParams")
        public java.util.Map<String, String> templateParams;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("To")
        public String to;

        public static SendChatappMassMessageRequestSenderList build(java.util.Map<String, ?> map) throws Exception {
            SendChatappMassMessageRequestSenderList self = new SendChatappMassMessageRequestSenderList();
            return TeaModel.build(map, self);
        }

        public SendChatappMassMessageRequestSenderList setFlowAction(SendChatappMassMessageRequestSenderListFlowAction flowAction) {
            this.flowAction = flowAction;
            return this;
        }
        public SendChatappMassMessageRequestSenderListFlowAction getFlowAction() {
            return this.flowAction;
        }

        public SendChatappMassMessageRequestSenderList setPayload(java.util.List<String> payload) {
            this.payload = payload;
            return this;
        }
        public java.util.List<String> getPayload() {
            return this.payload;
        }

        public SendChatappMassMessageRequestSenderList setProductAction(SendChatappMassMessageRequestSenderListProductAction productAction) {
            this.productAction = productAction;
            return this;
        }
        public SendChatappMassMessageRequestSenderListProductAction getProductAction() {
            return this.productAction;
        }

        public SendChatappMassMessageRequestSenderList setTemplateParams(java.util.Map<String, String> templateParams) {
            this.templateParams = templateParams;
            return this;
        }
        public java.util.Map<String, String> getTemplateParams() {
            return this.templateParams;
        }

        public SendChatappMassMessageRequestSenderList setTo(String to) {
            this.to = to;
            return this;
        }
        public String getTo() {
            return this.to;
        }

    }

}
