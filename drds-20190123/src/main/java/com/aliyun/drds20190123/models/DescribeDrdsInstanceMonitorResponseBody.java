// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsInstanceMonitorResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<DescribeDrdsInstanceMonitorResponseBodyData> data;

    public static DescribeDrdsInstanceMonitorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsInstanceMonitorResponseBody self = new DescribeDrdsInstanceMonitorResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsInstanceMonitorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDrdsInstanceMonitorResponseBody setData(java.util.List<DescribeDrdsInstanceMonitorResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeDrdsInstanceMonitorResponseBodyData> getData() {
        return this.data;
    }

    public static class DescribeDrdsInstanceMonitorResponseBodyDataValues extends TeaModel {
        @NameInMap("Date")
        public Long date;

        @NameInMap("Value")
        public String value;

        public static DescribeDrdsInstanceMonitorResponseBodyDataValues build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsInstanceMonitorResponseBodyDataValues self = new DescribeDrdsInstanceMonitorResponseBodyDataValues();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsInstanceMonitorResponseBodyDataValues setDate(Long date) {
            this.date = date;
            return this;
        }
        public Long getDate() {
            return this.date;
        }

        public DescribeDrdsInstanceMonitorResponseBodyDataValues setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDrdsInstanceMonitorResponseBodyData extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Unit")
        public String unit;

        @NameInMap("NodeNum")
        public Integer nodeNum;

        @NameInMap("Values")
        public java.util.List<DescribeDrdsInstanceMonitorResponseBodyDataValues> values;

        public static DescribeDrdsInstanceMonitorResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsInstanceMonitorResponseBodyData self = new DescribeDrdsInstanceMonitorResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsInstanceMonitorResponseBodyData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDrdsInstanceMonitorResponseBodyData setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public DescribeDrdsInstanceMonitorResponseBodyData setNodeNum(Integer nodeNum) {
            this.nodeNum = nodeNum;
            return this;
        }
        public Integer getNodeNum() {
            return this.nodeNum;
        }

        public DescribeDrdsInstanceMonitorResponseBodyData setValues(java.util.List<DescribeDrdsInstanceMonitorResponseBodyDataValues> values) {
            this.values = values;
            return this;
        }
        public java.util.List<DescribeDrdsInstanceMonitorResponseBodyDataValues> getValues() {
            return this.values;
        }

    }

}
