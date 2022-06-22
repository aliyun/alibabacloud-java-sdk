// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ListMetricsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListMetricsResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMetricsResponseBody self = new ListMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMetricsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListMetricsResponseBody setData(java.util.List<ListMetricsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListMetricsResponseBodyData> getData() {
        return this.data;
    }

    public ListMetricsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListMetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMetricsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListMetricsResponseBodyDataItems extends TeaModel {
        @NameInMap("average")
        public String average;

        @NameInMap("instanceId")
        public String instanceId;

        @NameInMap("maximum")
        public String maximum;

        @NameInMap("minimum")
        public String minimum;

        @NameInMap("timestamp")
        public Long timestamp;

        public static ListMetricsResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListMetricsResponseBodyDataItems self = new ListMetricsResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListMetricsResponseBodyDataItems setAverage(String average) {
            this.average = average;
            return this;
        }
        public String getAverage() {
            return this.average;
        }

        public ListMetricsResponseBodyDataItems setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListMetricsResponseBodyDataItems setMaximum(String maximum) {
            this.maximum = maximum;
            return this;
        }
        public String getMaximum() {
            return this.maximum;
        }

        public ListMetricsResponseBodyDataItems setMinimum(String minimum) {
            this.minimum = minimum;
            return this;
        }
        public String getMinimum() {
            return this.minimum;
        }

        public ListMetricsResponseBodyDataItems setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

    public static class ListMetricsResponseBodyData extends TeaModel {
        @NameInMap("desc")
        public String desc;

        @NameInMap("items")
        public java.util.List<ListMetricsResponseBodyDataItems> items;

        @NameInMap("metricName")
        public String metricName;

        @NameInMap("unit")
        public String unit;

        public static ListMetricsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMetricsResponseBodyData self = new ListMetricsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMetricsResponseBodyData setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public ListMetricsResponseBodyData setItems(java.util.List<ListMetricsResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListMetricsResponseBodyDataItems> getItems() {
            return this.items;
        }

        public ListMetricsResponseBodyData setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public ListMetricsResponseBodyData setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

}
