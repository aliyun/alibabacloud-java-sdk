// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsInstanceMonitorResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public java.util.List<DescribeDrdsInstanceMonitorResponseData> data;

    public static DescribeDrdsInstanceMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsInstanceMonitorResponse self = new DescribeDrdsInstanceMonitorResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsInstanceMonitorResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDrdsInstanceMonitorResponse setData(java.util.List<DescribeDrdsInstanceMonitorResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeDrdsInstanceMonitorResponseData> getData() {
        return this.data;
    }

    public static class DescribeDrdsInstanceMonitorResponseDataValues extends TeaModel {
        @NameInMap("Date")
        @Validation(required = true)
        public Long date;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static DescribeDrdsInstanceMonitorResponseDataValues build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsInstanceMonitorResponseDataValues self = new DescribeDrdsInstanceMonitorResponseDataValues();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsInstanceMonitorResponseDataValues setDate(Long date) {
            this.date = date;
            return this;
        }
        public Long getDate() {
            return this.date;
        }

        public DescribeDrdsInstanceMonitorResponseDataValues setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDrdsInstanceMonitorResponseData extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Unit")
        @Validation(required = true)
        public String unit;

        @NameInMap("NodeNum")
        @Validation(required = true)
        public Integer nodeNum;

        @NameInMap("Values")
        @Validation(required = true)
        public java.util.List<DescribeDrdsInstanceMonitorResponseDataValues> values;

        public static DescribeDrdsInstanceMonitorResponseData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsInstanceMonitorResponseData self = new DescribeDrdsInstanceMonitorResponseData();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsInstanceMonitorResponseData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDrdsInstanceMonitorResponseData setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public DescribeDrdsInstanceMonitorResponseData setNodeNum(Integer nodeNum) {
            this.nodeNum = nodeNum;
            return this;
        }
        public Integer getNodeNum() {
            return this.nodeNum;
        }

        public DescribeDrdsInstanceMonitorResponseData setValues(java.util.List<DescribeDrdsInstanceMonitorResponseDataValues> values) {
            this.values = values;
            return this;
        }
        public java.util.List<DescribeDrdsInstanceMonitorResponseDataValues> getValues() {
            return this.values;
        }

    }

}
