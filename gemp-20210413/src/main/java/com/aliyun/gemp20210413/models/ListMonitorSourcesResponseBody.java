// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListMonitorSourcesResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<ListMonitorSourcesResponseBodyData> data;

    @NameInMap("requestId")
    public String requestId;

    public static ListMonitorSourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMonitorSourcesResponseBody self = new ListMonitorSourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMonitorSourcesResponseBody setData(java.util.List<ListMonitorSourcesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListMonitorSourcesResponseBodyData> getData() {
        return this.data;
    }

    public ListMonitorSourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListMonitorSourcesResponseBodyData extends TeaModel {
        @NameInMap("monitorSourceId")
        public Long monitorSourceId;

        @NameInMap("monitorSourceName")
        public String monitorSourceName;

        @NameInMap("fieldKeys")
        public java.util.List<String> fieldKeys;

        public static ListMonitorSourcesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMonitorSourcesResponseBodyData self = new ListMonitorSourcesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMonitorSourcesResponseBodyData setMonitorSourceId(Long monitorSourceId) {
            this.monitorSourceId = monitorSourceId;
            return this;
        }
        public Long getMonitorSourceId() {
            return this.monitorSourceId;
        }

        public ListMonitorSourcesResponseBodyData setMonitorSourceName(String monitorSourceName) {
            this.monitorSourceName = monitorSourceName;
            return this;
        }
        public String getMonitorSourceName() {
            return this.monitorSourceName;
        }

        public ListMonitorSourcesResponseBodyData setFieldKeys(java.util.List<String> fieldKeys) {
            this.fieldKeys = fieldKeys;
            return this;
        }
        public java.util.List<String> getFieldKeys() {
            return this.fieldKeys;
        }

    }

}
