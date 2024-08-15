// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetEventResponseBody extends TeaModel {
    @NameInMap("data")
    public GetEventResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>XXXXXXXXXXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEventResponseBody self = new GetEventResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEventResponseBody setData(GetEventResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetEventResponseBodyData getData() {
        return this.data;
    }

    public GetEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetEventResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>“”</p>
         */
        @NameInMap("eventJson")
        public String eventJson;

        /**
         * <strong>example:</strong>
         * <p>2002-09-08 15:30:35</p>
         */
        @NameInMap("eventTime")
        public String eventTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("monitorSourceId")
        public Long monitorSourceId;

        /**
         * <strong>example:</strong>
         * <p>zabbix</p>
         */
        @NameInMap("monitorSourceName")
        public String monitorSourceName;

        public static GetEventResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetEventResponseBodyData self = new GetEventResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetEventResponseBodyData setEventJson(String eventJson) {
            this.eventJson = eventJson;
            return this;
        }
        public String getEventJson() {
            return this.eventJson;
        }

        public GetEventResponseBodyData setEventTime(String eventTime) {
            this.eventTime = eventTime;
            return this;
        }
        public String getEventTime() {
            return this.eventTime;
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

    }

}
