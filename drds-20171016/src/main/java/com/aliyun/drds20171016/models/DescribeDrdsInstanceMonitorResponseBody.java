// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20171016.models;

import com.aliyun.tea.*;

public class DescribeDrdsInstanceMonitorResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeDrdsInstanceMonitorResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeDrdsInstanceMonitorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsInstanceMonitorResponseBody self = new DescribeDrdsInstanceMonitorResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsInstanceMonitorResponseBody setData(DescribeDrdsInstanceMonitorResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDrdsInstanceMonitorResponseBodyData getData() {
        return this.data;
    }

    public DescribeDrdsInstanceMonitorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDrdsInstanceMonitorResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeDrdsInstanceMonitorResponseBodyDataPartialPerformanceDataValuesPerformanceValue extends TeaModel {
        @NameInMap("Date")
        public Long date;

        @NameInMap("Value")
        public String value;

        public static DescribeDrdsInstanceMonitorResponseBodyDataPartialPerformanceDataValuesPerformanceValue build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsInstanceMonitorResponseBodyDataPartialPerformanceDataValuesPerformanceValue self = new DescribeDrdsInstanceMonitorResponseBodyDataPartialPerformanceDataValuesPerformanceValue();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsInstanceMonitorResponseBodyDataPartialPerformanceDataValuesPerformanceValue setDate(Long date) {
            this.date = date;
            return this;
        }
        public Long getDate() {
            return this.date;
        }

        public DescribeDrdsInstanceMonitorResponseBodyDataPartialPerformanceDataValuesPerformanceValue setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDrdsInstanceMonitorResponseBodyDataPartialPerformanceDataValues extends TeaModel {
        @NameInMap("PerformanceValue")
        public java.util.List<DescribeDrdsInstanceMonitorResponseBodyDataPartialPerformanceDataValuesPerformanceValue> performanceValue;

        public static DescribeDrdsInstanceMonitorResponseBodyDataPartialPerformanceDataValues build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsInstanceMonitorResponseBodyDataPartialPerformanceDataValues self = new DescribeDrdsInstanceMonitorResponseBodyDataPartialPerformanceDataValues();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsInstanceMonitorResponseBodyDataPartialPerformanceDataValues setPerformanceValue(java.util.List<DescribeDrdsInstanceMonitorResponseBodyDataPartialPerformanceDataValuesPerformanceValue> performanceValue) {
            this.performanceValue = performanceValue;
            return this;
        }
        public java.util.List<DescribeDrdsInstanceMonitorResponseBodyDataPartialPerformanceDataValuesPerformanceValue> getPerformanceValue() {
            return this.performanceValue;
        }

    }

    public static class DescribeDrdsInstanceMonitorResponseBodyDataPartialPerformanceData extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Unit")
        public String unit;

        @NameInMap("Values")
        public DescribeDrdsInstanceMonitorResponseBodyDataPartialPerformanceDataValues values;

        public static DescribeDrdsInstanceMonitorResponseBodyDataPartialPerformanceData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsInstanceMonitorResponseBodyDataPartialPerformanceData self = new DescribeDrdsInstanceMonitorResponseBodyDataPartialPerformanceData();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsInstanceMonitorResponseBodyDataPartialPerformanceData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDrdsInstanceMonitorResponseBodyDataPartialPerformanceData setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public DescribeDrdsInstanceMonitorResponseBodyDataPartialPerformanceData setValues(DescribeDrdsInstanceMonitorResponseBodyDataPartialPerformanceDataValues values) {
            this.values = values;
            return this;
        }
        public DescribeDrdsInstanceMonitorResponseBodyDataPartialPerformanceDataValues getValues() {
            return this.values;
        }

    }

    public static class DescribeDrdsInstanceMonitorResponseBodyData extends TeaModel {
        @NameInMap("PartialPerformanceData")
        public java.util.List<DescribeDrdsInstanceMonitorResponseBodyDataPartialPerformanceData> partialPerformanceData;

        public static DescribeDrdsInstanceMonitorResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsInstanceMonitorResponseBodyData self = new DescribeDrdsInstanceMonitorResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsInstanceMonitorResponseBodyData setPartialPerformanceData(java.util.List<DescribeDrdsInstanceMonitorResponseBodyDataPartialPerformanceData> partialPerformanceData) {
            this.partialPerformanceData = partialPerformanceData;
            return this;
        }
        public java.util.List<DescribeDrdsInstanceMonitorResponseBodyDataPartialPerformanceData> getPartialPerformanceData() {
            return this.partialPerformanceData;
        }

    }

}
