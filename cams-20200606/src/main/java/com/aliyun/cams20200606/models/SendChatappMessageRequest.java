// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class SendChatappMessageRequest extends TeaModel {
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

    @NameInMap("FallBackDuration")
    public Integer fallBackDuration;

    /**
     * <p>The ID of the fallback strategy. You can create a fallback strategy and view the information in the console.</p>
     */
    @NameInMap("FallBackId")
    public String fallBackId;

    @NameInMap("FallBackRule")
    public String fallBackRule;

    @NameInMap("FlowAction")
    public SendChatappMessageRequestFlowAction flowAction;

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
    public java.util.List<String> payload;

    /**
     * <p>The information about the products included in the WhatsApp catalog message or multi-product message (MPM).</p>
     */
    @NameInMap("ProductAction")
    public SendChatappMessageRequestProductAction productAction;

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

    /**
     * <p>The variables of the message template.</p>
     */
    @NameInMap("TemplateParams")
    public java.util.Map<String, String> templateParams;

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

    public SendChatappMessageRequest setProductAction(SendChatappMessageRequestProductAction productAction) {
        this.productAction = productAction;
        return this;
    }
    public SendChatappMessageRequestProductAction getProductAction() {
        return this.productAction;
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

    public static class SendChatappMessageRequestFlowAction extends TeaModel {
        @NameInMap("FlowActionData")
        public java.util.Map<String, String> flowActionData;

        @NameInMap("FlowToken")
        public String flowToken;

        public static SendChatappMessageRequestFlowAction build(java.util.Map<String, ?> map) throws Exception {
            SendChatappMessageRequestFlowAction self = new SendChatappMessageRequestFlowAction();
            return TeaModel.build(map, self);
        }

        public SendChatappMessageRequestFlowAction setFlowActionData(java.util.Map<String, String> flowActionData) {
            this.flowActionData = flowActionData;
            return this;
        }
        public java.util.Map<String, String> getFlowActionData() {
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
         * <p>The retailer ID of the product.</p>
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
        /**
         * <p>The products.</p>
         */
        @NameInMap("ProductItems")
        public java.util.List<SendChatappMessageRequestProductActionSectionsProductItems> productItems;

        /**
         * <p>The name of the category.</p>
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
        /**
         * <p>The products. Up to 30 products can be added. The products can be divided into up to 10 categories.</p>
         */
        @NameInMap("Sections")
        public java.util.List<SendChatappMessageRequestProductActionSections> sections;

        /**
         * <p>The retailer ID of the product.</p>
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
