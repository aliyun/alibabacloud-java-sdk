// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListMessengerSubscriptionTokenResponseBody extends TeaModel {
    /**
     * <p>Details about the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The status code of the request.</p>
     * <ul>
     * <li><p>A return value of OK indicates that the request was successful.</p>
     * </li>
     * <li><p>For a list of other error codes, see <a href="https://help.aliyun.com/document_detail/196974.html">Error codes</a>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListMessengerSubscriptionTokenResponseBodyData> data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The identifier for the next page. Pass this value to query the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>3399***</p>
     */
    @NameInMap("NextPage")
    public String nextPage;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ei**</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation was successful. Valid values:</p>
     * <ul>
     * <li><p>true: successful.</p>
     * </li>
     * <li><p>false: failed.</p>
     * </li>
     * </ul>
     * 
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
         * <p>The time when the security token was created.</p>
         * 
         * <strong>example:</strong>
         * <p>172546854885</p>
         */
        @NameInMap("CreationTimestamp")
        public Long creationTimestamp;

        /**
         * <p>The custom audience ID.</p>
         * 
         * <strong>example:</strong>
         * <p>Example</p>
         */
        @NameInMap("CustomAudienceId")
        public String customAudienceId;

        /**
         * <p>The time when the application can send the next marketing message to the recipient.</p>
         * 
         * <strong>example:</strong>
         * <p>172546854885</p>
         */
        @NameInMap("NextEligibleTime")
        public Long nextEligibleTime;

        /**
         * <p>The re-subscription status.</p>
         * 
         * <strong>example:</strong>
         * <p>Example</p>
         */
        @NameInMap("NotificationMessagesReoptin")
        public String notificationMessagesReoptin;

        /**
         * <p>The customer\&quot;s time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>Example</p>
         */
        @NameInMap("NotificationMessagesTimezone")
        public String notificationMessagesTimezone;

        /**
         * <p>The page-scoped ID of the customer.</p>
         * 
         * <strong>example:</strong>
         * <p>Example</p>
         */
        @NameInMap("NotificationMessagesToken")
        public String notificationMessagesToken;

        /**
         * <p>The page ID for Messenger.</p>
         * 
         * <strong>example:</strong>
         * <p>239***</p>
         */
        @NameInMap("PageId")
        public String pageId;

        /**
         * <p>The customer\&quot;s Page-scoped ID (PSID)</p>
         * 
         * <strong>example:</strong>
         * <p>Example</p>
         */
        @NameInMap("RecipientId")
        public String recipientId;

        /**
         * <p>The expiration time of the security token.</p>
         * 
         * <strong>example:</strong>
         * <p>172546854885</p>
         */
        @NameInMap("TokenExpiryTimestamp")
        public Long tokenExpiryTimestamp;

        /**
         * <p>The message\&quot;s title</p>
         * 
         * <strong>example:</strong>
         * <p>Example</p>
         */
        @NameInMap("TopicTitle")
        public String topicTitle;

        /**
         * <p>The status of the security token.</p>
         * 
         * <strong>example:</strong>
         * <p>Example</p>
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
