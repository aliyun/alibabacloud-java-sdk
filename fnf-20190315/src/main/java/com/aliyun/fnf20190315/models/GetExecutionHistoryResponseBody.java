// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class GetExecutionHistoryResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Events")
    public java.util.List<GetExecutionHistoryResponseBodyEvents> events;

    public static GetExecutionHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetExecutionHistoryResponseBody self = new GetExecutionHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetExecutionHistoryResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public GetExecutionHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetExecutionHistoryResponseBody setEvents(java.util.List<GetExecutionHistoryResponseBodyEvents> events) {
        this.events = events;
        return this;
    }
    public java.util.List<GetExecutionHistoryResponseBodyEvents> getEvents() {
        return this.events;
    }

    public static class GetExecutionHistoryResponseBodyEvents extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("EventId")
        public Long eventId;

        @NameInMap("Time")
        public String time;

        @NameInMap("ScheduleEventId")
        public Long scheduleEventId;

        @NameInMap("EventDetail")
        public String eventDetail;

        @NameInMap("StepName")
        public String stepName;

        public static GetExecutionHistoryResponseBodyEvents build(java.util.Map<String, ?> map) throws Exception {
            GetExecutionHistoryResponseBodyEvents self = new GetExecutionHistoryResponseBodyEvents();
            return TeaModel.build(map, self);
        }

        public GetExecutionHistoryResponseBodyEvents setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetExecutionHistoryResponseBodyEvents setEventId(Long eventId) {
            this.eventId = eventId;
            return this;
        }
        public Long getEventId() {
            return this.eventId;
        }

        public GetExecutionHistoryResponseBodyEvents setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public GetExecutionHistoryResponseBodyEvents setScheduleEventId(Long scheduleEventId) {
            this.scheduleEventId = scheduleEventId;
            return this;
        }
        public Long getScheduleEventId() {
            return this.scheduleEventId;
        }

        public GetExecutionHistoryResponseBodyEvents setEventDetail(String eventDetail) {
            this.eventDetail = eventDetail;
            return this;
        }
        public String getEventDetail() {
            return this.eventDetail;
        }

        public GetExecutionHistoryResponseBodyEvents setStepName(String stepName) {
            this.stepName = stepName;
            return this;
        }
        public String getStepName() {
            return this.stepName;
        }

    }

}
