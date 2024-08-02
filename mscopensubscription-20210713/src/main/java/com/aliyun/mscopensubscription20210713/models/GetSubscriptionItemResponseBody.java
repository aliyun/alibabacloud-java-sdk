// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mscopensubscription20210713.models;

import com.aliyun.tea.*;

public class GetSubscriptionItemResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>FF1EFA25-9DB3-13E4-9643-5D3AD301C1D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>result</p>
     */
    @NameInMap("SubscriptionItem")
    public GetSubscriptionItemResponseBodySubscriptionItem subscriptionItem;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetSubscriptionItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSubscriptionItemResponseBody self = new GetSubscriptionItemResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSubscriptionItemResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSubscriptionItemResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSubscriptionItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSubscriptionItemResponseBody setSubscriptionItem(GetSubscriptionItemResponseBodySubscriptionItem subscriptionItem) {
        this.subscriptionItem = subscriptionItem;
        return this;
    }
    public GetSubscriptionItemResponseBodySubscriptionItem getSubscriptionItem() {
        return this.subscriptionItem;
    }

    public GetSubscriptionItemResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSubscriptionItemResponseBodySubscriptionItem extends TeaModel {
        /**
         * <p>属于通道</p>
         * 
         * <strong>example:</strong>
         * <p>tts</p>
         */
        @NameInMap("Channel")
        public String channel;

        /**
         * <p>订阅联系人</p>
         */
        @NameInMap("ContactIds")
        public java.util.List<Long> contactIds;

        /**
         * <p>订阅项描述</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>邮件订阅情况</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("EmailStatus")
        public Integer emailStatus;

        /**
         * <p>代表资源一级ID的资源属性字段</p>
         * 
         * <strong>example:</strong>
         * <p>10086</p>
         */
        @NameInMap("ItemId")
        public Integer itemId;

        /**
         * <p>订阅项名称</p>
         */
        @NameInMap("ItemName")
        public String itemName;

        /**
         * <p>站内信订阅情况</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PmsgStatus")
        public Integer pmsgStatus;

        /**
         * <p>短信订阅情况</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SmsStatus")
        public Integer smsStatus;

        /**
         * <p>语音短信订阅情况</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TtsStatus")
        public Integer ttsStatus;

        /**
         * <p>订阅webhooks</p>
         */
        @NameInMap("WebhookIds")
        public java.util.List<Long> webhookIds;

        /**
         * <p>回调订阅情况</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("WebhookStatus")
        public Integer webhookStatus;

        public static GetSubscriptionItemResponseBodySubscriptionItem build(java.util.Map<String, ?> map) throws Exception {
            GetSubscriptionItemResponseBodySubscriptionItem self = new GetSubscriptionItemResponseBodySubscriptionItem();
            return TeaModel.build(map, self);
        }

        public GetSubscriptionItemResponseBodySubscriptionItem setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public GetSubscriptionItemResponseBodySubscriptionItem setContactIds(java.util.List<Long> contactIds) {
            this.contactIds = contactIds;
            return this;
        }
        public java.util.List<Long> getContactIds() {
            return this.contactIds;
        }

        public GetSubscriptionItemResponseBodySubscriptionItem setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetSubscriptionItemResponseBodySubscriptionItem setEmailStatus(Integer emailStatus) {
            this.emailStatus = emailStatus;
            return this;
        }
        public Integer getEmailStatus() {
            return this.emailStatus;
        }

        public GetSubscriptionItemResponseBodySubscriptionItem setItemId(Integer itemId) {
            this.itemId = itemId;
            return this;
        }
        public Integer getItemId() {
            return this.itemId;
        }

        public GetSubscriptionItemResponseBodySubscriptionItem setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public GetSubscriptionItemResponseBodySubscriptionItem setPmsgStatus(Integer pmsgStatus) {
            this.pmsgStatus = pmsgStatus;
            return this;
        }
        public Integer getPmsgStatus() {
            return this.pmsgStatus;
        }

        public GetSubscriptionItemResponseBodySubscriptionItem setSmsStatus(Integer smsStatus) {
            this.smsStatus = smsStatus;
            return this;
        }
        public Integer getSmsStatus() {
            return this.smsStatus;
        }

        public GetSubscriptionItemResponseBodySubscriptionItem setTtsStatus(Integer ttsStatus) {
            this.ttsStatus = ttsStatus;
            return this;
        }
        public Integer getTtsStatus() {
            return this.ttsStatus;
        }

        public GetSubscriptionItemResponseBodySubscriptionItem setWebhookIds(java.util.List<Long> webhookIds) {
            this.webhookIds = webhookIds;
            return this;
        }
        public java.util.List<Long> getWebhookIds() {
            return this.webhookIds;
        }

        public GetSubscriptionItemResponseBodySubscriptionItem setWebhookStatus(Integer webhookStatus) {
            this.webhookStatus = webhookStatus;
            return this;
        }
        public Integer getWebhookStatus() {
            return this.webhookStatus;
        }

    }

}
