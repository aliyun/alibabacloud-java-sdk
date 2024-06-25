// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class QueryTracedEventsResponseBody extends TeaModel {
    /**
     * <p>The returned HTTP status code. The HTTP status code 200 indicates that the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public QueryTracedEventsResponseBodyData data;

    /**
     * <p>The returned error message.</p>
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
     * <p>d9e4628b-8b34-4f33-82be-5aac50aac0ba</p>
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

    public static QueryTracedEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTracedEventsResponseBody self = new QueryTracedEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTracedEventsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryTracedEventsResponseBody setData(QueryTracedEventsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryTracedEventsResponseBodyData getData() {
        return this.data;
    }

    public QueryTracedEventsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryTracedEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTracedEventsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryTracedEventsResponseBodyDataEvents extends TeaModel {
        /**
         * <p>The name of the event bus.</p>
         * 
         * <strong>example:</strong>
         * <p>test-custom-bus</p>
         */
        @NameInMap("EventBusName")
        public String eventBusName;

        /**
         * <p>The event ID.</p>
         * 
         * <strong>example:</strong>
         * <p>07E-1OCckaVzNB92BIFFh4xgydOF1wd</p>
         */
        @NameInMap("EventId")
        public String eventId;

        /**
         * <p>The time when the event was delivered to the event bus.</p>
         * 
         * <strong>example:</strong>
         * <p>1661773573100</p>
         */
        @NameInMap("EventReceivedTime")
        public Long eventReceivedTime;

        /**
         * <p>The name of the event source.</p>
         * 
         * <strong>example:</strong>
         * <p>acs.resourcemanager</p>
         */
        @NameInMap("EventSource")
        public String eventSource;

        /**
         * <p>The event type.</p>
         * 
         * <strong>example:</strong>
         * <p>eventbridge:Events:HTTPEvent</p>
         */
        @NameInMap("EventType")
        public String eventType;

        public static QueryTracedEventsResponseBodyDataEvents build(java.util.Map<String, ?> map) throws Exception {
            QueryTracedEventsResponseBodyDataEvents self = new QueryTracedEventsResponseBodyDataEvents();
            return TeaModel.build(map, self);
        }

        public QueryTracedEventsResponseBodyDataEvents setEventBusName(String eventBusName) {
            this.eventBusName = eventBusName;
            return this;
        }
        public String getEventBusName() {
            return this.eventBusName;
        }

        public QueryTracedEventsResponseBodyDataEvents setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public QueryTracedEventsResponseBodyDataEvents setEventReceivedTime(Long eventReceivedTime) {
            this.eventReceivedTime = eventReceivedTime;
            return this;
        }
        public Long getEventReceivedTime() {
            return this.eventReceivedTime;
        }

        public QueryTracedEventsResponseBodyDataEvents setEventSource(String eventSource) {
            this.eventSource = eventSource;
            return this;
        }
        public String getEventSource() {
            return this.eventSource;
        }

        public QueryTracedEventsResponseBodyDataEvents setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

    }

    public static class QueryTracedEventsResponseBodyData extends TeaModel {
        /**
         * <p>The event type.</p>
         */
        @NameInMap("Events")
        public java.util.List<QueryTracedEventsResponseBodyDataEvents> events;

        /**
         * <p>If excess return values exist, this parameter is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static QueryTracedEventsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTracedEventsResponseBodyData self = new QueryTracedEventsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTracedEventsResponseBodyData setEvents(java.util.List<QueryTracedEventsResponseBodyDataEvents> events) {
            this.events = events;
            return this;
        }
        public java.util.List<QueryTracedEventsResponseBodyDataEvents> getEvents() {
            return this.events;
        }

        public QueryTracedEventsResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public QueryTracedEventsResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
