// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryAppEventsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryAppEventsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryAppEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAppEventsResponseBody self = new QueryAppEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAppEventsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAppEventsResponseBody setData(QueryAppEventsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryAppEventsResponseBodyData getData() {
        return this.data;
    }

    public QueryAppEventsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAppEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAppEventsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryAppEventsResponseBodyDataAlarmEvents extends TeaModel {
        @NameInMap("Event")
        public String event;

        @NameInMap("Time")
        public Long time;

        @NameInMap("Timestamp")
        public String timestamp;

        public static QueryAppEventsResponseBodyDataAlarmEvents build(java.util.Map<String, ?> map) throws Exception {
            QueryAppEventsResponseBodyDataAlarmEvents self = new QueryAppEventsResponseBodyDataAlarmEvents();
            return TeaModel.build(map, self);
        }

        public QueryAppEventsResponseBodyDataAlarmEvents setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public QueryAppEventsResponseBodyDataAlarmEvents setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public QueryAppEventsResponseBodyDataAlarmEvents setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

    }

    public static class QueryAppEventsResponseBodyDataProtectEvents extends TeaModel {
        @NameInMap("Event")
        public String event;

        @NameInMap("Time")
        public Long time;

        @NameInMap("Timestamp")
        public String timestamp;

        public static QueryAppEventsResponseBodyDataProtectEvents build(java.util.Map<String, ?> map) throws Exception {
            QueryAppEventsResponseBodyDataProtectEvents self = new QueryAppEventsResponseBodyDataProtectEvents();
            return TeaModel.build(map, self);
        }

        public QueryAppEventsResponseBodyDataProtectEvents setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public QueryAppEventsResponseBodyDataProtectEvents setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public QueryAppEventsResponseBodyDataProtectEvents setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

    }

    public static class QueryAppEventsResponseBodyData extends TeaModel {
        @NameInMap("AlarmEvents")
        public java.util.List<QueryAppEventsResponseBodyDataAlarmEvents> alarmEvents;

        @NameInMap("AlarmRuleCount")
        public Integer alarmRuleCount;

        @NameInMap("AppEventCount")
        public java.util.Map<String, ?> appEventCount;

        @NameInMap("EventCount")
        public Integer eventCount;

        @NameInMap("ProtectEvents")
        public java.util.List<QueryAppEventsResponseBodyDataProtectEvents> protectEvents;

        public static QueryAppEventsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAppEventsResponseBodyData self = new QueryAppEventsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAppEventsResponseBodyData setAlarmEvents(java.util.List<QueryAppEventsResponseBodyDataAlarmEvents> alarmEvents) {
            this.alarmEvents = alarmEvents;
            return this;
        }
        public java.util.List<QueryAppEventsResponseBodyDataAlarmEvents> getAlarmEvents() {
            return this.alarmEvents;
        }

        public QueryAppEventsResponseBodyData setAlarmRuleCount(Integer alarmRuleCount) {
            this.alarmRuleCount = alarmRuleCount;
            return this;
        }
        public Integer getAlarmRuleCount() {
            return this.alarmRuleCount;
        }

        public QueryAppEventsResponseBodyData setAppEventCount(java.util.Map<String, ?> appEventCount) {
            this.appEventCount = appEventCount;
            return this;
        }
        public java.util.Map<String, ?> getAppEventCount() {
            return this.appEventCount;
        }

        public QueryAppEventsResponseBodyData setEventCount(Integer eventCount) {
            this.eventCount = eventCount;
            return this;
        }
        public Integer getEventCount() {
            return this.eventCount;
        }

        public QueryAppEventsResponseBodyData setProtectEvents(java.util.List<QueryAppEventsResponseBodyDataProtectEvents> protectEvents) {
            this.protectEvents = protectEvents;
            return this;
        }
        public java.util.List<QueryAppEventsResponseBodyDataProtectEvents> getProtectEvents() {
            return this.protectEvents;
        }

    }

}
