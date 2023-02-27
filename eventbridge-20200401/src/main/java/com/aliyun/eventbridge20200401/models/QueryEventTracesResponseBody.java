// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class QueryEventTracesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QueryEventTracesResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryEventTracesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryEventTracesResponseBody self = new QueryEventTracesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryEventTracesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryEventTracesResponseBody setData(java.util.List<QueryEventTracesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryEventTracesResponseBodyData> getData() {
        return this.data;
    }

    public QueryEventTracesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryEventTracesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryEventTracesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryEventTracesResponseBodyData extends TeaModel {
        @NameInMap("Action")
        public String action;

        @NameInMap("ActionTime")
        public Long actionTime;

        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("EventBusName")
        public String eventBusName;

        @NameInMap("EventId")
        public String eventId;

        @NameInMap("EventSource")
        public String eventSource;

        @NameInMap("NotifyLatency")
        public String notifyLatency;

        @NameInMap("NotifyStatus")
        public String notifyStatus;

        @NameInMap("NotifyTime")
        public Long notifyTime;

        @NameInMap("ReceivedTime")
        public Long receivedTime;

        @NameInMap("RuleMatchingTime")
        public String ruleMatchingTime;

        @NameInMap("RuleName")
        public String ruleName;

        public static QueryEventTracesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryEventTracesResponseBodyData self = new QueryEventTracesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryEventTracesResponseBodyData setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public QueryEventTracesResponseBodyData setActionTime(Long actionTime) {
            this.actionTime = actionTime;
            return this;
        }
        public Long getActionTime() {
            return this.actionTime;
        }

        public QueryEventTracesResponseBodyData setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public QueryEventTracesResponseBodyData setEventBusName(String eventBusName) {
            this.eventBusName = eventBusName;
            return this;
        }
        public String getEventBusName() {
            return this.eventBusName;
        }

        public QueryEventTracesResponseBodyData setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public QueryEventTracesResponseBodyData setEventSource(String eventSource) {
            this.eventSource = eventSource;
            return this;
        }
        public String getEventSource() {
            return this.eventSource;
        }

        public QueryEventTracesResponseBodyData setNotifyLatency(String notifyLatency) {
            this.notifyLatency = notifyLatency;
            return this;
        }
        public String getNotifyLatency() {
            return this.notifyLatency;
        }

        public QueryEventTracesResponseBodyData setNotifyStatus(String notifyStatus) {
            this.notifyStatus = notifyStatus;
            return this;
        }
        public String getNotifyStatus() {
            return this.notifyStatus;
        }

        public QueryEventTracesResponseBodyData setNotifyTime(Long notifyTime) {
            this.notifyTime = notifyTime;
            return this;
        }
        public Long getNotifyTime() {
            return this.notifyTime;
        }

        public QueryEventTracesResponseBodyData setReceivedTime(Long receivedTime) {
            this.receivedTime = receivedTime;
            return this;
        }
        public Long getReceivedTime() {
            return this.receivedTime;
        }

        public QueryEventTracesResponseBodyData setRuleMatchingTime(String ruleMatchingTime) {
            this.ruleMatchingTime = ruleMatchingTime;
            return this;
        }
        public String getRuleMatchingTime() {
            return this.ruleMatchingTime;
        }

        public QueryEventTracesResponseBodyData setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

    }

}
