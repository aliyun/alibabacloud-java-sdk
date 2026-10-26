// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListUserNotifyHistoriesResponseBody extends TeaModel {
    @NameInMap("historyList")
    public java.util.List<ListUserNotifyHistoriesResponseBodyHistoryList> historyList;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>2f8aKz3mNq9p****</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>0B9377D9-C56B-5C2E-A8A4-************</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
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
         * <strong>example:</strong>
         * <p>DING</p>
         */
        @NameInMap("channel")
        public String channel;

        /**
         * <strong>example:</strong>
         * <p>张三,李四</p>
         */
        @NameInMap("contacts")
        public String contacts;

        /**
         * <strong>example:</strong>
         * <p>运维组,值班组</p>
         */
        @NameInMap("groups")
        public String groups;

        /**
         * <strong>example:</strong>
         * <p>5d41402abc4b2a76b9719d911017c592</p>
         */
        @NameInMap("incidentId")
        public String incidentId;

        /**
         * <strong>example:</strong>
         * <p>3fa85f64-5717-4562-b3fc-2c963f66afa8</p>
         */
        @NameInMap("jobId")
        public String jobId;

        @NameInMap("noChannel")
        public Boolean noChannel;

        /**
         * <strong>example:</strong>
         * <p>2b3c4d5e6f7a8b9c0d1e2f3a4b5c6d7e</p>
         */
        @NameInMap("notifyStrategyId")
        public String notifyStrategyId;

        /**
         * <strong>example:</strong>
         * <p>默认通知策略</p>
         */
        @NameInMap("notifyStrategyName")
        public String notifyStrategyName;

        /**
         * <strong>example:</strong>
         * <p>13800138000</p>
         */
        @NameInMap("receiver")
        public String receiver;

        /**
         * <strong>example:</strong>
         * <p>{&quot;errcode&quot;:0,&quot;errmsg&quot;:&quot;ok&quot;}</p>
         */
        @NameInMap("result")
        public String result;

        /**
         * <strong>example:</strong>
         * <p>3fa85f64-5717-4562-b3fc-2c963f66afa6</p>
         */
        @NameInMap("ruleId")
        public String ruleId;

        /**
         * <strong>example:</strong>
         * <p>CPU使用率告警</p>
         */
        @NameInMap("ruleName")
        public String ruleName;

        /**
         * <strong>example:</strong>
         * <p>SUBSCRIBE</p>
         */
        @NameInMap("sendType")
        public String sendType;

        /**
         * <strong>example:</strong>
         * <p>CRITICAL</p>
         */
        @NameInMap("severity")
        public String severity;

        /**
         * <strong>example:</strong>
         * <p>TRIGGERED</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>1a2b3c4d5e6f7a8b9c0d1e2f3a4b5c6d</p>
         */
        @NameInMap("subscriptionId")
        public String subscriptionId;

        /**
         * <strong>example:</strong>
         * <p>默认订阅</p>
         */
        @NameInMap("subscriptionName")
        public String subscriptionName;

        @NameInMap("success")
        public Boolean success;

        /**
         * <strong>example:</strong>
         * <p>1729400000</p>
         */
        @NameInMap("timestamp")
        public Integer timestamp;

        /**
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
