// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20171016.models;

import com.aliyun.tea.*;

public class DescribeDrdsInstanceDbMonitorResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeDrdsInstanceDbMonitorResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeDrdsInstanceDbMonitorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsInstanceDbMonitorResponseBody self = new DescribeDrdsInstanceDbMonitorResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsInstanceDbMonitorResponseBody setData(DescribeDrdsInstanceDbMonitorResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDrdsInstanceDbMonitorResponseBodyData getData() {
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

    public static class DescribeDrdsInstanceDbMonitorResponseBodyDataPartialPerformanceDataValuesPerformanceValue extends TeaModel {
        @NameInMap("Date")
        public Long date;

        @NameInMap("Value")
        public String value;

        public static DescribeDrdsInstanceDbMonitorResponseBodyDataPartialPerformanceDataValuesPerformanceValue build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsInstanceDbMonitorResponseBodyDataPartialPerformanceDataValuesPerformanceValue self = new DescribeDrdsInstanceDbMonitorResponseBodyDataPartialPerformanceDataValuesPerformanceValue();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsInstanceDbMonitorResponseBodyDataPartialPerformanceDataValuesPerformanceValue setDate(Long date) {
            this.date = date;
            return this;
        }
        public Long getDate() {
            return this.date;
        }

        public DescribeDrdsInstanceDbMonitorResponseBodyDataPartialPerformanceDataValuesPerformanceValue setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDrdsInstanceDbMonitorResponseBodyDataPartialPerformanceDataValues extends TeaModel {
        @NameInMap("PerformanceValue")
        public java.util.List<DescribeDrdsInstanceDbMonitorResponseBodyDataPartialPerformanceDataValuesPerformanceValue> performanceValue;

        public static DescribeDrdsInstanceDbMonitorResponseBodyDataPartialPerformanceDataValues build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsInstanceDbMonitorResponseBodyDataPartialPerformanceDataValues self = new DescribeDrdsInstanceDbMonitorResponseBodyDataPartialPerformanceDataValues();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsInstanceDbMonitorResponseBodyDataPartialPerformanceDataValues setPerformanceValue(java.util.List<DescribeDrdsInstanceDbMonitorResponseBodyDataPartialPerformanceDataValuesPerformanceValue> performanceValue) {
            this.performanceValue = performanceValue;
            return this;
        }
        public java.util.List<DescribeDrdsInstanceDbMonitorResponseBodyDataPartialPerformanceDataValuesPerformanceValue> getPerformanceValue() {
            return this.performanceValue;
        }

    }

    public static class DescribeDrdsInstanceDbMonitorResponseBodyDataPartialPerformanceData extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Unit")
        public String unit;

        @NameInMap("Values")
        public DescribeDrdsInstanceDbMonitorResponseBodyDataPartialPerformanceDataValues values;

        public static DescribeDrdsInstanceDbMonitorResponseBodyDataPartialPerformanceData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsInstanceDbMonitorResponseBodyDataPartialPerformanceData self = new DescribeDrdsInstanceDbMonitorResponseBodyDataPartialPerformanceData();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsInstanceDbMonitorResponseBodyDataPartialPerformanceData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDrdsInstanceDbMonitorResponseBodyDataPartialPerformanceData setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public DescribeDrdsInstanceDbMonitorResponseBodyDataPartialPerformanceData setValues(DescribeDrdsInstanceDbMonitorResponseBodyDataPartialPerformanceDataValues values) {
            this.values = values;
            return this;
        }
        public DescribeDrdsInstanceDbMonitorResponseBodyDataPartialPerformanceDataValues getValues() {
            return this.values;
        }

    }

    public static class DescribeDrdsInstanceDbMonitorResponseBodyData extends TeaModel {
        @NameInMap("PartialPerformanceData")
        public java.util.List<DescribeDrdsInstanceDbMonitorResponseBodyDataPartialPerformanceData> partialPerformanceData;

        public static DescribeDrdsInstanceDbMonitorResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsInstanceDbMonitorResponseBodyData self = new DescribeDrdsInstanceDbMonitorResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsInstanceDbMonitorResponseBodyData setPartialPerformanceData(java.util.List<DescribeDrdsInstanceDbMonitorResponseBodyDataPartialPerformanceData> partialPerformanceData) {
            this.partialPerformanceData = partialPerformanceData;
            return this;
        }
        public java.util.List<DescribeDrdsInstanceDbMonitorResponseBodyDataPartialPerformanceData> getPartialPerformanceData() {
            return this.partialPerformanceData;
        }

    }

}
