// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetEventResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    // 告警
    @NameInMap("data")
    public GetEventResponseBodyData data;

    public static GetEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEventResponseBody self = new GetEventResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEventResponseBody setData(GetEventResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetEventResponseBodyData getData() {
        return this.data;
    }

    public static class GetEventResponseBodyData extends TeaModel {
        // 告警源ID
        @NameInMap("monitorSourceId")
        public Long monitorSourceId;

        // 告警源名称
        @NameInMap("monitorSourceName")
        public String monitorSourceName;

        // 告警上报时间
        @NameInMap("eventTime")
        public String eventTime;

        // 告警内容
        @NameInMap("eventJson")
        public String eventJson;

        public static GetEventResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetEventResponseBodyData self = new GetEventResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetEventResponseBodyData setMonitorSourceId(Long monitorSourceId) {
            this.monitorSourceId = monitorSourceId;
            return this;
        }
        public Long getMonitorSourceId() {
            return this.monitorSourceId;
        }

        public GetEventResponseBodyData setMonitorSourceName(String monitorSourceName) {
            this.monitorSourceName = monitorSourceName;
            return this;
        }
        public String getMonitorSourceName() {
            return this.monitorSourceName;
        }

        public GetEventResponseBodyData setEventTime(String eventTime) {
            this.eventTime = eventTime;
            return this;
        }
        public String getEventTime() {
            return this.eventTime;
        }

        public GetEventResponseBodyData setEventJson(String eventJson) {
            this.eventJson = eventJson;
            return this;
        }
        public String getEventJson() {
            return this.eventJson;
        }

    }

}
