// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListUserNotifyHistoriesResponseBody extends TeaModel {
    /**
     * <p>The notification history list.</p>
     */
    @NameInMap("historyList")
    public java.util.List<ListUserNotifyHistoriesResponseBodyHistoryList> historyList;

    /**
     * <p>The maximum number of entries returned by this request.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next page. It is an opaque string generated and encrypted by the server. An empty value indicates that no more data is available.</p>
     * 
     * <strong>example:</strong>
     * <p>2f8aKz3mNq9p****</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0B9377D9-C56B-5C2E-A8A4-************</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The total number of notification history entries that meet the query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>128</p>
     */
    @NameInMap("total")
    public Long total;

    public static ListUserNotifyHistoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserNotifyHistoriesResponseBody self = new ListUserNotifyHistoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserNotifyHistoriesResponseBody setHistoryList(java.util.List<ListUserNotifyHistoriesResponseBodyHistoryList> historyList) {
        this.historyList = historyList;
        return this;
    }
    public java.util.List<ListUserNotifyHistoriesResponseBodyHistoryList> getHistoryList() {
        return this.historyList;
    }

    public ListUserNotifyHistoriesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListUserNotifyHistoriesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListUserNotifyHistoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserNotifyHistoriesResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListUserNotifyHistoriesResponseBodyHistoryList extends TeaModel {
        /**
         * <p>The notification channel. The valid values are the same as those of the <code>channel</code> request parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>DING</p>
         */
        @NameInMap("channel")
        public String channel;

        /**
         * <p>The list of contacts. Multiple contacts are separated by commas.</p>
         * 
         * <strong>example:</strong>
         * <p>Zhang San, Li Si</p>
         */
        @NameInMap("contacts")
        public String contacts;

        /**
         * <p>The list of contact groups. Multiple contact groups are separated by commas.</p>
         * 
         * <strong>example:</strong>
         * <p>O&amp;M group, on-call group</p>
         */
        @NameInMap("groups")
        public String groups;

        /**
         * <p>The incident ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5d41402abc4b2a76b9719d911017c592</p>
         */
        @NameInMap("incidentId")
        public String incidentId;

        /**
         * <p>The notification job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3fa85f64-5717-4562-b3fc-2c963f66afa8</p>
         */
        @NameInMap("jobId")
        public String jobId;

        /**
         * <p>Indicates whether the notification record has no actual delivery channel. Valid values:</p>
         * <ul>
         * <li>true: The notification record has no actual delivery channel, and the notifyResult is NO_CHANNEL.</li>
         * <li>false: The notification record has an actual delivery channel.</li>
         * </ul>
         */
        @NameInMap("noChannel")
        public Boolean noChannel;

        /**
         * <p>The notification policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2b3c4d5e6f7a8b9c0d1e2f3a4b5c6d7e</p>
         */
        @NameInMap("notifyStrategyId")
        public String notifyStrategyId;

        /**
         * <p>The notification policy name.</p>
         * 
         * <strong>example:</strong>
         * <p>Default notification policy</p>
         */
        @NameInMap("notifyStrategyName")
        public String notifyStrategyName;

        /**
         * <p>The recipient address, such as a phone number, email address, or webhook URL, depending on the notification channel.</p>
         * 
         * <strong>example:</strong>
         * <p>13800138000</p>
         */
        @NameInMap("receiver")
        public String receiver;

        /**
         * <p>The notification delivery result details. This is the raw response content returned by the channel, such as the API response from a DingTalk or Lark bot.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;errcode&quot;:0,&quot;errmsg&quot;:&quot;ok&quot;}</p>
         */
        @NameInMap("result")
        public String result;

        /**
         * <p>The alert rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3fa85f64-5717-4562-b3fc-2c963f66afa6</p>
         */
        @NameInMap("ruleId")
        public String ruleId;

        /**
         * <p>The alert rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>CPU usage alert</p>
         */
        @NameInMap("ruleName")
        public String ruleName;

        /**
         * <p>The notification delivery type. Valid values:</p>
         * <ul>
         * <li>SUBSCRIBE: subscription notifications</li>
         * <li>DIRECT: direct event notifications</li>
         * <li>ITSM: ticket or action notifications</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUBSCRIBE</p>
         */
        @NameInMap("sendType")
        public String sendType;

        /**
         * <p>The alert severity. Valid values:</p>
         * <ul>
         * <li>CRITICAL: critical</li>
         * <li>ERROR: error</li>
         * <li>WARNING: warning</li>
         * <li>INFO: information</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CRITICAL</p>
         */
        @NameInMap("severity")
        public String severity;

        /**
         * <p>The incident status. Valid values:</p>
         * <ul>
         * <li>TRIGGERED: triggered</li>
         * <li>RESOLVED: resolved</li>
         * <li>ACK: acknowledged</li>
         * <li>ESCALATED: escalated</li>
         * <li>MANUAL_RESOLVED: manually resolved</li>
         * <li>TIMEOUT: automatically resolved due to timeout</li>
         * <li>RETRIGGERED: retriggered</li>
         * <li>PARTIAL_RESOLVED: partially resolved</li>
         * <li>INVALID: invalid</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TRIGGERED</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The subscription ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1a2b3c4d5e6f7a8b9c0d1e2f3a4b5c6d</p>
         */
        @NameInMap("subscriptionId")
        public String subscriptionId;

        /**
         * <p>The subscription name.</p>
         * 
         * <strong>example:</strong>
         * <p>Default subscription</p>
         */
        @NameInMap("subscriptionName")
        public String subscriptionName;

        /**
         * <p>Indicates whether the notification was delivered successfully. Valid values:</p>
         * <ul>
         * <li>true: The notification was delivered successfully.</li>
         * <li>false: The notification delivery failed.</li>
         * </ul>
         */
        @NameInMap("success")
        public Boolean success;

        /**
         * <p>The time when the notification record was generated. The value is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1729400000</p>
         */
        @NameInMap("timestamp")
        public Integer timestamp;

        /**
         * <p>The Alibaba Cloud account ID to which the notification record belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>5884500827389836</p>
         */
        @NameInMap("userId")
        public String userId;

        public static ListUserNotifyHistoriesResponseBodyHistoryList build(java.util.Map<String, ?> map) throws Exception {
            ListUserNotifyHistoriesResponseBodyHistoryList self = new ListUserNotifyHistoriesResponseBodyHistoryList();
            return TeaModel.build(map, self);
        }

        public ListUserNotifyHistoriesResponseBodyHistoryList setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public ListUserNotifyHistoriesResponseBodyHistoryList setContacts(String contacts) {
            this.contacts = contacts;
            return this;
        }
        public String getContacts() {
            return this.contacts;
        }

        public ListUserNotifyHistoriesResponseBodyHistoryList setGroups(String groups) {
            this.groups = groups;
            return this;
        }
        public String getGroups() {
            return this.groups;
        }

        public ListUserNotifyHistoriesResponseBodyHistoryList setIncidentId(String incidentId) {
            this.incidentId = incidentId;
            return this;
        }
        public String getIncidentId() {
            return this.incidentId;
        }

        public ListUserNotifyHistoriesResponseBodyHistoryList setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListUserNotifyHistoriesResponseBodyHistoryList setNoChannel(Boolean noChannel) {
            this.noChannel = noChannel;
            return this;
        }
        public Boolean getNoChannel() {
            return this.noChannel;
        }

        public ListUserNotifyHistoriesResponseBodyHistoryList setNotifyStrategyId(String notifyStrategyId) {
            this.notifyStrategyId = notifyStrategyId;
            return this;
        }
        public String getNotifyStrategyId() {
            return this.notifyStrategyId;
        }

        public ListUserNotifyHistoriesResponseBodyHistoryList setNotifyStrategyName(String notifyStrategyName) {
            this.notifyStrategyName = notifyStrategyName;
            return this;
        }
        public String getNotifyStrategyName() {
            return this.notifyStrategyName;
        }

        public ListUserNotifyHistoriesResponseBodyHistoryList setReceiver(String receiver) {
            this.receiver = receiver;
            return this;
        }
        public String getReceiver() {
            return this.receiver;
        }

        public ListUserNotifyHistoriesResponseBodyHistoryList setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public ListUserNotifyHistoriesResponseBodyHistoryList setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public ListUserNotifyHistoriesResponseBodyHistoryList setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListUserNotifyHistoriesResponseBodyHistoryList setSendType(String sendType) {
            this.sendType = sendType;
            return this;
        }
        public String getSendType() {
            return this.sendType;
        }

        public ListUserNotifyHistoriesResponseBodyHistoryList setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public ListUserNotifyHistoriesResponseBodyHistoryList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListUserNotifyHistoriesResponseBodyHistoryList setSubscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }
        public String getSubscriptionId() {
            return this.subscriptionId;
        }

        public ListUserNotifyHistoriesResponseBodyHistoryList setSubscriptionName(String subscriptionName) {
            this.subscriptionName = subscriptionName;
            return this;
        }
        public String getSubscriptionName() {
            return this.subscriptionName;
        }

        public ListUserNotifyHistoriesResponseBodyHistoryList setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public ListUserNotifyHistoriesResponseBodyHistoryList setTimestamp(Integer timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Integer getTimestamp() {
            return this.timestamp;
        }

        public ListUserNotifyHistoriesResponseBodyHistoryList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
