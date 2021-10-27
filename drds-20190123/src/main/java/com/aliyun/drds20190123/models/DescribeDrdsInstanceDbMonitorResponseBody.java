// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsInstanceDbMonitorResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeDrdsInstanceDbMonitorResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeDrdsInstanceDbMonitorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsInstanceDbMonitorResponseBody self = new DescribeDrdsInstanceDbMonitorResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsInstanceDbMonitorResponseBody setData(java.util.List<DescribeDrdsInstanceDbMonitorResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeDrdsInstanceDbMonitorResponseBodyData> getData() {
        return this.data;
    }

    public DescribeDrdsInstanceDbMonitorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDrdsInstanceDbMonitorResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeDrdsInstanceDbMonitorResponseBodyDataValues extends TeaModel {
        @NameInMap("Date")
        public Long date;

        @NameInMap("Value")
        public String value;

        public static DescribeDrdsInstanceDbMonitorResponseBodyDataValues build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsInstanceDbMonitorResponseBodyDataValues self = new DescribeDrdsInstanceDbMonitorResponseBodyDataValues();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsInstanceDbMonitorResponseBodyDataValues setDate(Long date) {
            this.date = date;
            return this;
        }
        public Long getDate() {
            return this.date;
        }

        public DescribeDrdsInstanceDbMonitorResponseBodyDataValues setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDrdsInstanceDbMonitorResponseBodyData extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Unit")
        public String unit;

        @NameInMap("Values")
        public java.util.List<DescribeDrdsInstanceDbMonitorResponseBodyDataValues> values;

        public static DescribeDrdsInstanceDbMonitorResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsInstanceDbMonitorResponseBodyData self = new DescribeDrdsInstanceDbMonitorResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsInstanceDbMonitorResponseBodyData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDrdsInstanceDbMonitorResponseBodyData setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public DescribeDrdsInstanceDbMonitorResponseBodyData setValues(java.util.List<DescribeDrdsInstanceDbMonitorResponseBodyDataValues> values) {
            this.values = values;
            return this;
        }
        public java.util.List<DescribeDrdsInstanceDbMonitorResponseBodyDataValues> getValues() {
            return this.values;
        }

    }

}
