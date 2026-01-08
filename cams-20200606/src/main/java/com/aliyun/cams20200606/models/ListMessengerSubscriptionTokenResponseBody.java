// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListMessengerSubscriptionTokenResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListMessengerSubscriptionTokenResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>3399***</p>
     */
    @NameInMap("NextPage")
    public String nextPage;

    /**
     * <strong>example:</strong>
     * <p>ei**</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListMessengerSubscriptionTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMessengerSubscriptionTokenResponseBody self = new ListMessengerSubscriptionTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMessengerSubscriptionTokenResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListMessengerSubscriptionTokenResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListMessengerSubscriptionTokenResponseBody setData(java.util.List<ListMessengerSubscriptionTokenResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListMessengerSubscriptionTokenResponseBodyData> getData() {
        return this.data;
    }

    public ListMessengerSubscriptionTokenResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListMessengerSubscriptionTokenResponseBody setNextPage(String nextPage) {
        this.nextPage = nextPage;
        return this;
    }
    public String getNextPage() {
        return this.nextPage;
    }

    public ListMessengerSubscriptionTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMessengerSubscriptionTokenResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListMessengerSubscriptionTokenResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>172546854885</p>
         */
        @NameInMap("CreationTimestamp")
        public Long creationTimestamp;

        /**
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("CustomAudienceId")
        public String customAudienceId;

        /**
         * <strong>example:</strong>
         * <p>172546854885</p>
         */
        @NameInMap("NextEligibleTime")
        public Long nextEligibleTime;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("NotificationMessagesReoptin")
        public String notificationMessagesReoptin;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("NotificationMessagesTimezone")
        public String notificationMessagesTimezone;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("NotificationMessagesToken")
        public String notificationMessagesToken;

        /**
         * <strong>example:</strong>
         * <p>239***</p>
         */
        @NameInMap("PageId")
        public String pageId;

        /**
         * <p>The customer\&quot;s Page-scoped ID (PSID)</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("RecipientId")
        public String recipientId;

        /**
         * <strong>example:</strong>
         * <p>172546854885</p>
         */
        @NameInMap("TokenExpiryTimestamp")
        public Long tokenExpiryTimestamp;

        /**
         * <p>The message\&quot;s title</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("TopicTitle")
        public String topicTitle;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("UserTokenStatus")
        public String userTokenStatus;

        public static ListMessengerSubscriptionTokenResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMessengerSubscriptionTokenResponseBodyData self = new ListMessengerSubscriptionTokenResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMessengerSubscriptionTokenResponseBodyData setCreationTimestamp(Long creationTimestamp) {
            this.creationTimestamp = creationTimestamp;
            return this;
        }
        public Long getCreationTimestamp() {
            return this.creationTimestamp;
        }

        public ListMessengerSubscriptionTokenResponseBodyData setCustomAudienceId(String customAudienceId) {
            this.customAudienceId = customAudienceId;
            return this;
        }
        public String getCustomAudienceId() {
            return this.customAudienceId;
        }

        public ListMessengerSubscriptionTokenResponseBodyData setNextEligibleTime(Long nextEligibleTime) {
            this.nextEligibleTime = nextEligibleTime;
            return this;
        }
        public Long getNextEligibleTime() {
            return this.nextEligibleTime;
        }

        public ListMessengerSubscriptionTokenResponseBodyData setNotificationMessagesReoptin(String notificationMessagesReoptin) {
            this.notificationMessagesReoptin = notificationMessagesReoptin;
            return this;
        }
        public String getNotificationMessagesReoptin() {
            return this.notificationMessagesReoptin;
        }

        public ListMessengerSubscriptionTokenResponseBodyData setNotificationMessagesTimezone(String notificationMessagesTimezone) {
            this.notificationMessagesTimezone = notificationMessagesTimezone;
            return this;
        }
        public String getNotificationMessagesTimezone() {
            return this.notificationMessagesTimezone;
        }

        public ListMessengerSubscriptionTokenResponseBodyData setNotificationMessagesToken(String notificationMessagesToken) {
            this.notificationMessagesToken = notificationMessagesToken;
            return this;
        }
        public String getNotificationMessagesToken() {
            return this.notificationMessagesToken;
        }

        public ListMessengerSubscriptionTokenResponseBodyData setPageId(String pageId) {
            this.pageId = pageId;
            return this;
        }
        public String getPageId() {
            return this.pageId;
        }

        public ListMessengerSubscriptionTokenResponseBodyData setRecipientId(String recipientId) {
            this.recipientId = recipientId;
            return this;
        }
        public String getRecipientId() {
            return this.recipientId;
        }

        public ListMessengerSubscriptionTokenResponseBodyData setTokenExpiryTimestamp(Long tokenExpiryTimestamp) {
            this.tokenExpiryTimestamp = tokenExpiryTimestamp;
            return this;
        }
        public Long getTokenExpiryTimestamp() {
            return this.tokenExpiryTimestamp;
        }

        public ListMessengerSubscriptionTokenResponseBodyData setTopicTitle(String topicTitle) {
            this.topicTitle = topicTitle;
            return this;
        }
        public String getTopicTitle() {
            return this.topicTitle;
        }

        public ListMessengerSubscriptionTokenResponseBodyData setUserTokenStatus(String userTokenStatus) {
            this.userTokenStatus = userTokenStatus;
            return this;
        }
        public String getUserTokenStatus() {
            return this.userTokenStatus;
        }

    }

}
