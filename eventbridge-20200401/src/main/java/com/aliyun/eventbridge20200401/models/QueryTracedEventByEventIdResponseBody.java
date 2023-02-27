// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class QueryTracedEventByEventIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QueryTracedEventByEventIdResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("EventBusName")
        public String eventBusName;

        @NameInMap("EventId")
        public String eventId;

        @NameInMap("EventReceivedTime")
        public Long eventReceivedTime;

        @NameInMap("EventSource")
        public String eventSource;

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
        @NameInMap("Events")
        public java.util.List<QueryTracedEventByEventIdResponseBodyDataEvents> events;

        @NameInMap("NextToken")
        public String nextToken;

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
