// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mscopensubscription20210713.models;

import com.aliyun.tea.*;

public class GetSubscriptionItemResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubscriptionItem")
    public GetSubscriptionItemResponseBodySubscriptionItem subscriptionItem;

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
        @NameInMap("Channel")
        public String channel;

        @NameInMap("ContactIds")
        public java.util.List<Long> contactIds;

        @NameInMap("Description")
        public String description;

        @NameInMap("EmailStatus")
        public Integer emailStatus;

        @NameInMap("ItemId")
        public Integer itemId;

        @NameInMap("ItemName")
        public String itemName;

        @NameInMap("PmsgStatus")
        public Integer pmsgStatus;

        @NameInMap("SmsStatus")
        public Integer smsStatus;

        @NameInMap("TtsStatus")
        public Integer ttsStatus;

        @NameInMap("WebhookIds")
        public java.util.List<Long> webhookIds;

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
