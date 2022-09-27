// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mscopensubscription20210713.models;

import com.aliyun.tea.*;

public class ListSubscriptionItemsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("NextToken")
    public Integer nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubscriptionItems")
    public java.util.List<ListSubscriptionItemsResponseBodySubscriptionItems> subscriptionItems;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListSubscriptionItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSubscriptionItemsResponseBody self = new ListSubscriptionItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSubscriptionItemsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSubscriptionItemsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSubscriptionItemsResponseBody setNextToken(Integer nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public Integer getNextToken() {
        return this.nextToken;
    }

    public ListSubscriptionItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSubscriptionItemsResponseBody setSubscriptionItems(java.util.List<ListSubscriptionItemsResponseBodySubscriptionItems> subscriptionItems) {
        this.subscriptionItems = subscriptionItems;
        return this;
    }
    public java.util.List<ListSubscriptionItemsResponseBodySubscriptionItems> getSubscriptionItems() {
        return this.subscriptionItems;
    }

    public ListSubscriptionItemsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListSubscriptionItemsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListSubscriptionItemsResponseBodySubscriptionItems extends TeaModel {
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

        public static ListSubscriptionItemsResponseBodySubscriptionItems build(java.util.Map<String, ?> map) throws Exception {
            ListSubscriptionItemsResponseBodySubscriptionItems self = new ListSubscriptionItemsResponseBodySubscriptionItems();
            return TeaModel.build(map, self);
        }

        public ListSubscriptionItemsResponseBodySubscriptionItems setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public ListSubscriptionItemsResponseBodySubscriptionItems setContactIds(java.util.List<Long> contactIds) {
            this.contactIds = contactIds;
            return this;
        }
        public java.util.List<Long> getContactIds() {
            return this.contactIds;
        }

        public ListSubscriptionItemsResponseBodySubscriptionItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListSubscriptionItemsResponseBodySubscriptionItems setEmailStatus(Integer emailStatus) {
            this.emailStatus = emailStatus;
            return this;
        }
        public Integer getEmailStatus() {
            return this.emailStatus;
        }

        public ListSubscriptionItemsResponseBodySubscriptionItems setItemId(Integer itemId) {
            this.itemId = itemId;
            return this;
        }
        public Integer getItemId() {
            return this.itemId;
        }

        public ListSubscriptionItemsResponseBodySubscriptionItems setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public ListSubscriptionItemsResponseBodySubscriptionItems setPmsgStatus(Integer pmsgStatus) {
            this.pmsgStatus = pmsgStatus;
            return this;
        }
        public Integer getPmsgStatus() {
            return this.pmsgStatus;
        }

        public ListSubscriptionItemsResponseBodySubscriptionItems setSmsStatus(Integer smsStatus) {
            this.smsStatus = smsStatus;
            return this;
        }
        public Integer getSmsStatus() {
            return this.smsStatus;
        }

        public ListSubscriptionItemsResponseBodySubscriptionItems setTtsStatus(Integer ttsStatus) {
            this.ttsStatus = ttsStatus;
            return this;
        }
        public Integer getTtsStatus() {
            return this.ttsStatus;
        }

        public ListSubscriptionItemsResponseBodySubscriptionItems setWebhookIds(java.util.List<Long> webhookIds) {
            this.webhookIds = webhookIds;
            return this;
        }
        public java.util.List<Long> getWebhookIds() {
            return this.webhookIds;
        }

        public ListSubscriptionItemsResponseBodySubscriptionItems setWebhookStatus(Integer webhookStatus) {
            this.webhookStatus = webhookStatus;
            return this;
        }
        public Integer getWebhookStatus() {
            return this.webhookStatus;
        }

    }

}
