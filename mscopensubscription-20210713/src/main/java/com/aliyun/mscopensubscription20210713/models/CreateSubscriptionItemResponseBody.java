// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mscopensubscription20210713.models;

import com.aliyun.tea.*;

public class CreateSubscriptionItemResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubscriptionItem")
    public CreateSubscriptionItemResponseBodySubscriptionItem subscriptionItem;

    @NameInMap("Success")
    public Boolean success;

    public static CreateSubscriptionItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSubscriptionItemResponseBody self = new CreateSubscriptionItemResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSubscriptionItemResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateSubscriptionItemResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateSubscriptionItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSubscriptionItemResponseBody setSubscriptionItem(CreateSubscriptionItemResponseBodySubscriptionItem subscriptionItem) {
        this.subscriptionItem = subscriptionItem;
        return this;
    }
    public CreateSubscriptionItemResponseBodySubscriptionItem getSubscriptionItem() {
        return this.subscriptionItem;
    }

    public CreateSubscriptionItemResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateSubscriptionItemResponseBodySubscriptionItem extends TeaModel {
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

        public static CreateSubscriptionItemResponseBodySubscriptionItem build(java.util.Map<String, ?> map) throws Exception {
            CreateSubscriptionItemResponseBodySubscriptionItem self = new CreateSubscriptionItemResponseBodySubscriptionItem();
            return TeaModel.build(map, self);
        }

        public CreateSubscriptionItemResponseBodySubscriptionItem setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public CreateSubscriptionItemResponseBodySubscriptionItem setContactIds(java.util.List<Long> contactIds) {
            this.contactIds = contactIds;
            return this;
        }
        public java.util.List<Long> getContactIds() {
            return this.contactIds;
        }

        public CreateSubscriptionItemResponseBodySubscriptionItem setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateSubscriptionItemResponseBodySubscriptionItem setEmailStatus(Integer emailStatus) {
            this.emailStatus = emailStatus;
            return this;
        }
        public Integer getEmailStatus() {
            return this.emailStatus;
        }

        public CreateSubscriptionItemResponseBodySubscriptionItem setItemId(Integer itemId) {
            this.itemId = itemId;
            return this;
        }
        public Integer getItemId() {
            return this.itemId;
        }

        public CreateSubscriptionItemResponseBodySubscriptionItem setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public CreateSubscriptionItemResponseBodySubscriptionItem setPmsgStatus(Integer pmsgStatus) {
            this.pmsgStatus = pmsgStatus;
            return this;
        }
        public Integer getPmsgStatus() {
            return this.pmsgStatus;
        }

        public CreateSubscriptionItemResponseBodySubscriptionItem setSmsStatus(Integer smsStatus) {
            this.smsStatus = smsStatus;
            return this;
        }
        public Integer getSmsStatus() {
            return this.smsStatus;
        }

        public CreateSubscriptionItemResponseBodySubscriptionItem setTtsStatus(Integer ttsStatus) {
            this.ttsStatus = ttsStatus;
            return this;
        }
        public Integer getTtsStatus() {
            return this.ttsStatus;
        }

        public CreateSubscriptionItemResponseBodySubscriptionItem setWebhookIds(java.util.List<Long> webhookIds) {
            this.webhookIds = webhookIds;
            return this;
        }
        public java.util.List<Long> getWebhookIds() {
            return this.webhookIds;
        }

        public CreateSubscriptionItemResponseBodySubscriptionItem setWebhookStatus(Integer webhookStatus) {
            this.webhookStatus = webhookStatus;
            return this;
        }
        public Integer getWebhookStatus() {
            return this.webhookStatus;
        }

    }

}
