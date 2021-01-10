// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeBoardEventsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Events")
    public java.util.List<DescribeBoardEventsResponseBodyEvents> events;

    public static DescribeBoardEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBoardEventsResponseBody self = new DescribeBoardEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBoardEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBoardEventsResponseBody setEvents(java.util.List<DescribeBoardEventsResponseBodyEvents> events) {
        this.events = events;
        return this;
    }
    public java.util.List<DescribeBoardEventsResponseBodyEvents> getEvents() {
        return this.events;
    }

    public static class DescribeBoardEventsResponseBodyEvents extends TeaModel {
        @NameInMap("EventId")
        public Long eventId;

        @NameInMap("EventType")
        public Integer eventType;

        @NameInMap("UserId")
        public Integer userId;

        @NameInMap("Data")
        public String data;

        @NameInMap("Timestamp")
        public Long timestamp;

        public static DescribeBoardEventsResponseBodyEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeBoardEventsResponseBodyEvents self = new DescribeBoardEventsResponseBodyEvents();
            return TeaModel.build(map, self);
        }

        public DescribeBoardEventsResponseBodyEvents setEventId(Long eventId) {
            this.eventId = eventId;
            return this;
        }
        public Long getEventId() {
            return this.eventId;
        }

        public DescribeBoardEventsResponseBodyEvents setEventType(Integer eventType) {
            this.eventType = eventType;
            return this;
        }
        public Integer getEventType() {
            return this.eventType;
        }

        public DescribeBoardEventsResponseBodyEvents setUserId(Integer userId) {
            this.userId = userId;
            return this;
        }
        public Integer getUserId() {
            return this.userId;
        }

        public DescribeBoardEventsResponseBodyEvents setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public DescribeBoardEventsResponseBodyEvents setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

}
