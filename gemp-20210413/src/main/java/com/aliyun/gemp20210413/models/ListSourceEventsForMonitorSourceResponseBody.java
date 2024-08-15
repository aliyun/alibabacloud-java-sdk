// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListSourceEventsForMonitorSourceResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<ListSourceEventsForMonitorSourceResponseBodyData> data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("eventJson")
        public String eventJson;

        /**
         * <strong>example:</strong>
         * <p>2020-01-01 18:30:00</p>
         */
        @NameInMap("eventTime")
        public String eventTime;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("monitorSourceId")
        public Boolean monitorSourceId;

        /**
         * <strong>example:</strong>
         * <p>zabbix</p>
         */
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
