// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeDBInstancePerformanceResponseBody extends TeaModel {
    // The end of the time range to query. The time is in the *yyyy-MM-dd*T*HH:mm*Z format. The time is displayed in UTC.
    @NameInMap("EndTime")
    public String endTime;

    // Details about the performance metrics.
    @NameInMap("PerformanceKeys")
    public DescribeDBInstancePerformanceResponseBodyPerformanceKeys performanceKeys;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The beginning of the time range to query. The time is in the *yyyy-MM-dd*T*HH:mm*Z format. The time is displayed in UTC.
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDBInstancePerformanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancePerformanceResponseBody self = new DescribeDBInstancePerformanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstancePerformanceResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDBInstancePerformanceResponseBody setPerformanceKeys(DescribeDBInstancePerformanceResponseBodyPerformanceKeys performanceKeys) {
        this.performanceKeys = performanceKeys;
        return this;
    }
    public DescribeDBInstancePerformanceResponseBodyPerformanceKeys getPerformanceKeys() {
        return this.performanceKeys;
    }

    public DescribeDBInstancePerformanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstancePerformanceResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeDBInstancePerformanceResponseBodyPerformanceKeysPerformanceKeyPerformanceValuesPerformanceValue extends TeaModel {
        // The date and time when the metric value was generated.
        @NameInMap("Date")
        public String date;

        // The value of the performance metric.
        @NameInMap("Value")
        public String value;

        public static DescribeDBInstancePerformanceResponseBodyPerformanceKeysPerformanceKeyPerformanceValuesPerformanceValue build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancePerformanceResponseBodyPerformanceKeysPerformanceKeyPerformanceValuesPerformanceValue self = new DescribeDBInstancePerformanceResponseBodyPerformanceKeysPerformanceKeyPerformanceValuesPerformanceValue();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancePerformanceResponseBodyPerformanceKeysPerformanceKeyPerformanceValuesPerformanceValue setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public DescribeDBInstancePerformanceResponseBodyPerformanceKeysPerformanceKeyPerformanceValuesPerformanceValue setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDBInstancePerformanceResponseBodyPerformanceKeysPerformanceKeyPerformanceValues extends TeaModel {
        @NameInMap("PerformanceValue")
        public java.util.List<DescribeDBInstancePerformanceResponseBodyPerformanceKeysPerformanceKeyPerformanceValuesPerformanceValue> performanceValue;

        public static DescribeDBInstancePerformanceResponseBodyPerformanceKeysPerformanceKeyPerformanceValues build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancePerformanceResponseBodyPerformanceKeysPerformanceKeyPerformanceValues self = new DescribeDBInstancePerformanceResponseBodyPerformanceKeysPerformanceKeyPerformanceValues();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancePerformanceResponseBodyPerformanceKeysPerformanceKeyPerformanceValues setPerformanceValue(java.util.List<DescribeDBInstancePerformanceResponseBodyPerformanceKeysPerformanceKeyPerformanceValuesPerformanceValue> performanceValue) {
            this.performanceValue = performanceValue;
            return this;
        }
        public java.util.List<DescribeDBInstancePerformanceResponseBodyPerformanceKeysPerformanceKeyPerformanceValuesPerformanceValue> getPerformanceValue() {
            return this.performanceValue;
        }

    }

    public static class DescribeDBInstancePerformanceResponseBodyPerformanceKeysPerformanceKey extends TeaModel {
        // The performance metric.
        @NameInMap("Key")
        public String key;

        // Details about the performance metric values.
        @NameInMap("PerformanceValues")
        public DescribeDBInstancePerformanceResponseBodyPerformanceKeysPerformanceKeyPerformanceValues performanceValues;

        // The unit of the performance metric.
        @NameInMap("Unit")
        public String unit;

        // The format of the performance metric value. If the performance metric contains multiple fields, the fields are separated with **\&amp;** symbols.
        // 
        // For example, if you query disk usage, the returned **ValueFormat** value is in the **ins_size\&amp;data_size\&amp;log_size** format.
        @NameInMap("ValueFormat")
        public String valueFormat;

        public static DescribeDBInstancePerformanceResponseBodyPerformanceKeysPerformanceKey build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancePerformanceResponseBodyPerformanceKeysPerformanceKey self = new DescribeDBInstancePerformanceResponseBodyPerformanceKeysPerformanceKey();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancePerformanceResponseBodyPerformanceKeysPerformanceKey setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDBInstancePerformanceResponseBodyPerformanceKeysPerformanceKey setPerformanceValues(DescribeDBInstancePerformanceResponseBodyPerformanceKeysPerformanceKeyPerformanceValues performanceValues) {
            this.performanceValues = performanceValues;
            return this;
        }
        public DescribeDBInstancePerformanceResponseBodyPerformanceKeysPerformanceKeyPerformanceValues getPerformanceValues() {
            return this.performanceValues;
        }

        public DescribeDBInstancePerformanceResponseBodyPerformanceKeysPerformanceKey setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public DescribeDBInstancePerformanceResponseBodyPerformanceKeysPerformanceKey setValueFormat(String valueFormat) {
            this.valueFormat = valueFormat;
            return this;
        }
        public String getValueFormat() {
            return this.valueFormat;
        }

    }

    public static class DescribeDBInstancePerformanceResponseBodyPerformanceKeys extends TeaModel {
        @NameInMap("PerformanceKey")
        public java.util.List<DescribeDBInstancePerformanceResponseBodyPerformanceKeysPerformanceKey> performanceKey;

        public static DescribeDBInstancePerformanceResponseBodyPerformanceKeys build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancePerformanceResponseBodyPerformanceKeys self = new DescribeDBInstancePerformanceResponseBodyPerformanceKeys();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancePerformanceResponseBodyPerformanceKeys setPerformanceKey(java.util.List<DescribeDBInstancePerformanceResponseBodyPerformanceKeysPerformanceKey> performanceKey) {
            this.performanceKey = performanceKey;
            return this;
        }
        public java.util.List<DescribeDBInstancePerformanceResponseBodyPerformanceKeysPerformanceKey> getPerformanceKey() {
            return this.performanceKey;
        }

    }

}
