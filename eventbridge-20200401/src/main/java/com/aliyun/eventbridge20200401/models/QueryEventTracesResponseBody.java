// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class QueryEventTracesResponseBody extends TeaModel {
    /**
     * <p>The status code returned. The status code 200 indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The name of the event source.</p>
     */
    @NameInMap("Data")
    public java.util.List<QueryEventTracesResponseBodyData> data;

    /**
     * <p>The error message that is returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>EventBusNotExist</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BB934571-1F5A-5E17-91DD-E2BC3E1BFBFF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values: true and false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The type of the event trace. Valid values: PutEvent: a delivery event. FilterEvent: a filtering event. PushEvent: a pushing event.</p>
         * 
         * <strong>example:</strong>
         * <p>PutEvent</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The execution time of the event trace.</p>
         * 
         * <strong>example:</strong>
         * <p>1659495343896</p>
         */
        @NameInMap("ActionTime")
        public Long actionTime;

        /**
         * <p>The endpoint of the event target. This parameter is returned if the value of the Action parameter is PushEvent.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:mns:cn-zhangjiakou:123456789098****:queues/testQueue</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The name of the event bus.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("EventBusName")
        public String eventBusName;

        /**
         * <p>The event ID.</p>
         * 
         * <strong>example:</strong>
         * <p>a5747e4f-2af2-40b6-b262-d0140e995bf7</p>
         */
        @NameInMap("EventId")
        public String eventId;

        /**
         * <p>The name of the event source.</p>
         * 
         * <strong>example:</strong>
         * <p>cert-api</p>
         */
        @NameInMap("EventSource")
        public String eventSource;

        /**
         * <p>The delivery delay of the event target. This parameter is returned if the value of the Action parameter is PushEvent.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("NotifyLatency")
        public String notifyLatency;

        /**
         * <p>The event target delivery status.</p>
         * 
         * <strong>example:</strong>
         * <p>[200]Ok</p>
         */
        @NameInMap("NotifyStatus")
        public String notifyStatus;

        /**
         * <p>The delivery time of the event target. This parameter is returned if the value of the Action parameter is PushEvent.</p>
         * 
         * <strong>example:</strong>
         * <p>1659495343896</p>
         */
        @NameInMap("NotifyTime")
        public Long notifyTime;

        /**
         * <p>The time when the event was delivered to the event bus. This parameter is returned if the value of the Action parameter is PutEvent.</p>
         * 
         * <strong>example:</strong>
         * <p>1659495343896</p>
         */
        @NameInMap("ReceivedTime")
        public Long receivedTime;

        /**
         * <p>The time when the event rule was matched. This parameter is returned if the value of the Action parameter is FilterEvent.</p>
         * 
         * <strong>example:</strong>
         * <p>1659495343896</p>
         */
        @NameInMap("RuleMatchingTime")
        public String ruleMatchingTime;

        /**
         * <p>The name of the event rule.</p>
         * 
         * <strong>example:</strong>
         * <p>ramrolechange-mns</p>
         */
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
