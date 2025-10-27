// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class GetExecutionHistoryResponseBody extends TeaModel {
    /**
     * <p>The events.</p>
     */
    @NameInMap("Events")
    public java.util.List<GetExecutionHistoryResponseBodyEvents> events;

    /**
     * <p>You do not need to specify this parameter for the first request. The returned value of <strong>ScheduleEventId</strong> is used as the token for the next query. No value is returned for the last query.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>testRequestId</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetExecutionHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetExecutionHistoryResponseBody self = new GetExecutionHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetExecutionHistoryResponseBody setEvents(java.util.List<GetExecutionHistoryResponseBodyEvents> events) {
        this.events = events;
        return this;
    }
    public java.util.List<GetExecutionHistoryResponseBodyEvents> getEvents() {
        return this.events;
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

    public static class GetExecutionHistoryResponseBodyEvents extends TeaModel {
        /**
         * <p>The details about the execution step.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("EventDetail")
        public String eventDetail;

        /**
         * <p>The ID of the execution step.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("EventId")
        public Long eventId;

        /**
         * <p>The ID of the scheduling step.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ScheduleEventId")
        public Long scheduleEventId;

        /**
         * <p>The name of the execution step.</p>
         * 
         * <strong>example:</strong>
         * <p>passStep</p>
         */
        @NameInMap("StepName")
        public String stepName;

        /**
         * <p>The time when the event was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-01-01T01:01:01.001Z</p>
         */
        @NameInMap("Time")
        public String time;

        /**
         * <p>The type of the execution step. Valid values:</p>
         * <ul>
         * <li><strong>StepEntered</strong></li>
         * <li><strong>StepStarted</strong></li>
         * <li><strong>StepSucceeded</strong></li>
         * <li><strong>StepFailed</strong></li>
         * <li><strong>StepExited</strong></li>
         * <li><strong>BranchEntered</strong></li>
         * <li><strong>BranchExited</strong></li>
         * <li><strong>IterationEntered</strong></li>
         * <li><strong>IterationExited</strong></li>
         * <li><strong>TaskScheduled</strong></li>
         * <li><strong>TaskStarted</strong></li>
         * <li><strong>TaskSubmitted</strong></li>
         * <li><strong>TaskSubmitFailed</strong></li>
         * <li><strong>TaskSucceeded</strong></li>
         * <li><strong>TaskFailed</strong></li>
         * <li><strong>TaskTimedOut</strong></li>
         * <li><strong>ExecutionStarted</strong></li>
         * <li><strong>ExecutionStopped</strong></li>
         * <li><strong>ExecutionSucceeded</strong></li>
         * <li><strong>ExecutionFailed</strong></li>
         * <li><strong>ExecutionTimedOut</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TaskSucceeded</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetExecutionHistoryResponseBodyEvents build(java.util.Map<String, ?> map) throws Exception {
            GetExecutionHistoryResponseBodyEvents self = new GetExecutionHistoryResponseBodyEvents();
            return TeaModel.build(map, self);
        }

        public GetExecutionHistoryResponseBodyEvents setEventDetail(String eventDetail) {
            this.eventDetail = eventDetail;
            return this;
        }
        public String getEventDetail() {
            return this.eventDetail;
        }

        public GetExecutionHistoryResponseBodyEvents setEventId(Long eventId) {
            this.eventId = eventId;
            return this;
        }
        public Long getEventId() {
            return this.eventId;
        }

        public GetExecutionHistoryResponseBodyEvents setScheduleEventId(Long scheduleEventId) {
            this.scheduleEventId = scheduleEventId;
            return this;
        }
        public Long getScheduleEventId() {
            return this.scheduleEventId;
        }

        public GetExecutionHistoryResponseBodyEvents setStepName(String stepName) {
            this.stepName = stepName;
            return this;
        }
        public String getStepName() {
            return this.stepName;
        }

        public GetExecutionHistoryResponseBodyEvents setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public GetExecutionHistoryResponseBodyEvents setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
