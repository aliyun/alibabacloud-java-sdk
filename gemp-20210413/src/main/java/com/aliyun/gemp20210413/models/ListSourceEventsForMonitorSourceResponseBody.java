// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListSourceEventsForMonitorSourceResponseBody extends TeaModel {
    // 告警列表
    @NameInMap("data")
    public java.util.List<ListSourceEventsForMonitorSourceResponseBodyData> data;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static ListSourceEventsForMonitorSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSourceEventsForMonitorSourceResponseBody self = new ListSourceEventsForMonitorSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSourceEventsForMonitorSourceResponseBody setData(java.util.List<ListSourceEventsForMonitorSourceResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListSourceEventsForMonitorSourceResponseBodyData> getData() {
        return this.data;
    }

    public ListSourceEventsForMonitorSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListSourceEventsForMonitorSourceResponseBodyData extends TeaModel {
        // 告警内容
        @NameInMap("eventJson")
        public String eventJson;

        // 告警上报时间
        @NameInMap("eventTime")
        public String eventTime;

        // 监控源ID
        @NameInMap("monitorSourceId")
        public Boolean monitorSourceId;

        // 监控源名称
        @NameInMap("monitorSourceName")
        public String monitorSourceName;

        public static ListSourceEventsForMonitorSourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSourceEventsForMonitorSourceResponseBodyData self = new ListSourceEventsForMonitorSourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSourceEventsForMonitorSourceResponseBodyData setEventJson(String eventJson) {
            this.eventJson = eventJson;
            return this;
        }
        public String getEventJson() {
            return this.eventJson;
        }

        public ListSourceEventsForMonitorSourceResponseBodyData setEventTime(String eventTime) {
            this.eventTime = eventTime;
            return this;
        }
        public String getEventTime() {
            return this.eventTime;
        }

        public ListSourceEventsForMonitorSourceResponseBodyData setMonitorSourceId(Boolean monitorSourceId) {
            this.monitorSourceId = monitorSourceId;
            return this;
        }
        public Boolean getMonitorSourceId() {
            return this.monitorSourceId;
        }

        public ListSourceEventsForMonitorSourceResponseBodyData setMonitorSourceName(String monitorSourceName) {
            this.monitorSourceName = monitorSourceName;
            return this;
        }
        public String getMonitorSourceName() {
            return this.monitorSourceName;
        }

    }

}
