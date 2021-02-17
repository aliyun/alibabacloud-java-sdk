// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeDBInstancePerformanceResponseBody extends TeaModel {
    @NameInMap("PerformanceKeys")
    public DescribeDBInstancePerformanceResponseBodyPerformanceKeys performanceKeys;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDBInstancePerformanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancePerformanceResponseBody self = new DescribeDBInstancePerformanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstancePerformanceResponseBody setPerformanceKeys(DescribeDBInstancePerformanceResponseBodyPerformanceKeys performanceKeys) {
        this.performanceKeys = performanceKeys;
        return this;
    }
    public DescribeDBInstancePerformanceResponseBodyPerformanceKeys getPerformanceKeys() {
        return this.performanceKeys;
    }

    public DescribeDBInstancePerformanceResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
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
        @NameInMap("Value")
        public String value;

        @NameInMap("Date")
        public String date;

        public static DescribeDBInstancePerformanceResponseBodyPerformanceKeysPerformanceKeyPerformanceValuesPerformanceValue build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancePerformanceResponseBodyPerformanceKeysPerformanceKeyPerformanceValuesPerformanceValue self = new DescribeDBInstancePerformanceResponseBodyPerformanceKeysPerformanceKeyPerformanceValuesPerformanceValue();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancePerformanceResponseBodyPerformanceKeysPerformanceKeyPerformanceValuesPerformanceValue setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeDBInstancePerformanceResponseBodyPerformanceKeysPerformanceKeyPerformanceValuesPerformanceValue setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
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
        @NameInMap("Key")
        public String key;

        @NameInMap("Unit")
        public String unit;

        @NameInMap("ValueFormat")
        public String valueFormat;

        @NameInMap("PerformanceValues")
        public DescribeDBInstancePerformanceResponseBodyPerformanceKeysPerformanceKeyPerformanceValues performanceValues;

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

        public DescribeDBInstancePerformanceResponseBodyPerformanceKeysPerformanceKey setPerformanceValues(DescribeDBInstancePerformanceResponseBodyPerformanceKeysPerformanceKeyPerformanceValues performanceValues) {
            this.performanceValues = performanceValues;
            return this;
        }
        public DescribeDBInstancePerformanceResponseBodyPerformanceKeysPerformanceKeyPerformanceValues getPerformanceValues() {
            return this.performanceValues;
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
