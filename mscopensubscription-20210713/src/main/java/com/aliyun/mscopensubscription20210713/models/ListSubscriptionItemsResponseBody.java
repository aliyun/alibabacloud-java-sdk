// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mscopensubscription20210713.models;

import com.aliyun.tea.*;

public class ListSubscriptionItemsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>qwe-ert</p>
     */
    @NameInMap("NextToken")
    public Integer nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>CFA1882C-493D-1986-922D-6AF5085C0F91</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubscriptionItems")
    public java.util.List<ListSubscriptionItemsResponseBodySubscriptionItems> subscriptionItems;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
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
         * <p>32</p>
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
         * <p>0</p>
         */
        @NameInMap("PmsgStatus")
        public Integer pmsgStatus;

        /**
         * <p>短信订阅情况</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("SmsStatus")
        public Integer smsStatus;

        /**
         * <p>语音短信订阅情况</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
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
         * <p>-2</p>
         */
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
