// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeBoardEventsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Events")
    @Validation(required = true)
    public java.util.List<DescribeBoardEventsResponseEvents> events;

    public static DescribeBoardEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBoardEventsResponse self = new DescribeBoardEventsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBoardEventsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBoardEventsResponse setEvents(java.util.List<DescribeBoardEventsResponseEvents> events) {
        this.events = events;
        return this;
    }
    public java.util.List<DescribeBoardEventsResponseEvents> getEvents() {
        return this.events;
    }

    public static class DescribeBoardEventsResponseEvents extends TeaModel {
        @NameInMap("EventId")
        @Validation(required = true)
        public Long eventId;

        @NameInMap("EventType")
        @Validation(required = true)
        public Integer eventType;

        @NameInMap("UserId")
        @Validation(required = true)
        public Integer userId;

        @NameInMap("Data")
        @Validation(required = true)
        public String data;

        @NameInMap("Timestamp")
        @Validation(required = true)
        public Long timestamp;

        public static DescribeBoardEventsResponseEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeBoardEventsResponseEvents self = new DescribeBoardEventsResponseEvents();
            return TeaModel.build(map, self);
        }

        public DescribeBoardEventsResponseEvents setEventId(Long eventId) {
            this.eventId = eventId;
            return this;
        }
        public Long getEventId() {
            return this.eventId;
        }

        public DescribeBoardEventsResponseEvents setEventType(Integer eventType) {
            this.eventType = eventType;
            return this;
        }
        public Integer getEventType() {
            return this.eventType;
        }

        public DescribeBoardEventsResponseEvents setUserId(Integer userId) {
            this.userId = userId;
            return this;
        }
        public Integer getUserId() {
            return this.userId;
        }

        public DescribeBoardEventsResponseEvents setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public DescribeBoardEventsResponseEvents setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

}
