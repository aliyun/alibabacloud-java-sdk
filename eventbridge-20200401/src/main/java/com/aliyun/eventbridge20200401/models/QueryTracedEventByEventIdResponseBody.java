// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class QueryTracedEventByEventIdResponseBody extends TeaModel {
    /**
     * <p>The returned HTTP status code. The HTTP status code 200 indicates that the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("Data")
    public java.util.List<QueryTracedEventByEventIdResponseBodyData> data;

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
     * <p>A5D7B9F4-BF96-51A9-90B1-928955FABB5B</p>
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

    public static QueryTracedEventByEventIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTracedEventByEventIdResponseBody self = new QueryTracedEventByEventIdResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTracedEventByEventIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryTracedEventByEventIdResponseBody setData(java.util.List<QueryTracedEventByEventIdResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryTracedEventByEventIdResponseBodyData> getData() {
        return this.data;
    }

    public QueryTracedEventByEventIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryTracedEventByEventIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTracedEventByEventIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryTracedEventByEventIdResponseBodyDataEvents extends TeaModel {
        /**
         * <p>The name of the event bus.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("EventBusName")
        public String eventBusName;

        /**
         * <p>The event ID.</p>
         * 
         * <strong>example:</strong>
         * <p>37C-1P6Yn6EM7TcH37Vod8w7rbSeimJ</p>
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
         * <p>cert-api</p>
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

        public static QueryTracedEventByEventIdResponseBodyDataEvents build(java.util.Map<String, ?> map) throws Exception {
            QueryTracedEventByEventIdResponseBodyDataEvents self = new QueryTracedEventByEventIdResponseBodyDataEvents();
            return TeaModel.build(map, self);
        }

        public QueryTracedEventByEventIdResponseBodyDataEvents setEventBusName(String eventBusName) {
            this.eventBusName = eventBusName;
            return this;
        }
        public String getEventBusName() {
            return this.eventBusName;
        }

        public QueryTracedEventByEventIdResponseBodyDataEvents setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public QueryTracedEventByEventIdResponseBodyDataEvents setEventReceivedTime(Long eventReceivedTime) {
            this.eventReceivedTime = eventReceivedTime;
            return this;
        }
        public Long getEventReceivedTime() {
            return this.eventReceivedTime;
        }

        public QueryTracedEventByEventIdResponseBodyDataEvents setEventSource(String eventSource) {
            this.eventSource = eventSource;
            return this;
        }
        public String getEventSource() {
            return this.eventSource;
        }

        public QueryTracedEventByEventIdResponseBodyDataEvents setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

    }

    public static class QueryTracedEventByEventIdResponseBodyData extends TeaModel {
        /**
         * <p>The events.</p>
         */
        @NameInMap("Events")
        public java.util.List<QueryTracedEventByEventIdResponseBodyDataEvents> events;

        /**
         * <p>If excess return values exist, this parameter is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>18</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static QueryTracedEventByEventIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTracedEventByEventIdResponseBodyData self = new QueryTracedEventByEventIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTracedEventByEventIdResponseBodyData setEvents(java.util.List<QueryTracedEventByEventIdResponseBodyDataEvents> events) {
            this.events = events;
            return this;
        }
        public java.util.List<QueryTracedEventByEventIdResponseBodyDataEvents> getEvents() {
            return this.events;
        }

        public QueryTracedEventByEventIdResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public QueryTracedEventByEventIdResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
