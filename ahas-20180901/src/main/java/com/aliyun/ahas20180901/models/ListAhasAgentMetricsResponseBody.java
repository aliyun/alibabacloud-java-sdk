// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ListAhasAgentMetricsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListAhasAgentMetricsResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListAhasAgentMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAhasAgentMetricsResponseBody self = new ListAhasAgentMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAhasAgentMetricsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAhasAgentMetricsResponseBody setData(java.util.List<ListAhasAgentMetricsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAhasAgentMetricsResponseBodyData> getData() {
        return this.data;
    }

    public ListAhasAgentMetricsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAhasAgentMetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAhasAgentMetricsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAhasAgentMetricsResponseBodyDataItems extends TeaModel {
        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("Value")
        public String value;

        public static ListAhasAgentMetricsResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListAhasAgentMetricsResponseBodyDataItems self = new ListAhasAgentMetricsResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListAhasAgentMetricsResponseBodyDataItems setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public ListAhasAgentMetricsResponseBodyDataItems setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListAhasAgentMetricsResponseBodyData extends TeaModel {
        @NameInMap("Desc")
        public String desc;

        @NameInMap("Items")
        public java.util.List<ListAhasAgentMetricsResponseBodyDataItems> items;

        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("Unit")
        public String unit;

        public static ListAhasAgentMetricsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAhasAgentMetricsResponseBodyData self = new ListAhasAgentMetricsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAhasAgentMetricsResponseBodyData setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public ListAhasAgentMetricsResponseBodyData setItems(java.util.List<ListAhasAgentMetricsResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListAhasAgentMetricsResponseBodyDataItems> getItems() {
            return this.items;
        }

        public ListAhasAgentMetricsResponseBodyData setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public ListAhasAgentMetricsResponseBodyData setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

}
