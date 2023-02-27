// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class QueryTracedEventsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryTracedEventsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Events")
        public java.util.List<QueryTracedEventsResponseBodyDataEvents> events;

        @NameInMap("NextToken")
        public String nextToken;

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
