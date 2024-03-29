// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListMonitorDataResponseBody extends TeaModel {
    @NameInMap("MonitorData")
    public java.util.List<ListMonitorDataResponseBodyMonitorData> monitorData;

    /**
     * <p>Request Id</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListMonitorDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMonitorDataResponseBody self = new ListMonitorDataResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMonitorDataResponseBody setMonitorData(java.util.List<ListMonitorDataResponseBodyMonitorData> monitorData) {
        this.monitorData = monitorData;
        return this;
    }
    public java.util.List<ListMonitorDataResponseBodyMonitorData> getMonitorData() {
        return this.monitorData;
    }

    public ListMonitorDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListMonitorDataResponseBodyMonitorData extends TeaModel {
        @NameInMap("DataItem")
        public String dataItem;

        /**
         * <p>key</p>
         */
        @NameInMap("Key")
        public String key;

        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("Value")
        public String value;

        public static ListMonitorDataResponseBodyMonitorData build(java.util.Map<String, ?> map) throws Exception {
            ListMonitorDataResponseBodyMonitorData self = new ListMonitorDataResponseBodyMonitorData();
            return TeaModel.build(map, self);
        }

        public ListMonitorDataResponseBodyMonitorData setDataItem(String dataItem) {
            this.dataItem = dataItem;
            return this;
        }
        public String getDataItem() {
            return this.dataItem;
        }

        public ListMonitorDataResponseBodyMonitorData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListMonitorDataResponseBodyMonitorData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public ListMonitorDataResponseBodyMonitorData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
