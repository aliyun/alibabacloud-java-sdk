// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class DescribeSubscriptionPerformanceResponseBody extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("PerformanceKeys")
    public DescribeSubscriptionPerformanceResponseBodyPerformanceKeys performanceKeys;

    @NameInMap("ReplicaId")
    public String replicaId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StartTime")
    public String startTime;

    public static DescribeSubscriptionPerformanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSubscriptionPerformanceResponseBody self = new DescribeSubscriptionPerformanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSubscriptionPerformanceResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeSubscriptionPerformanceResponseBody setPerformanceKeys(DescribeSubscriptionPerformanceResponseBodyPerformanceKeys performanceKeys) {
        this.performanceKeys = performanceKeys;
        return this;
    }
    public DescribeSubscriptionPerformanceResponseBodyPerformanceKeys getPerformanceKeys() {
        return this.performanceKeys;
    }

    public DescribeSubscriptionPerformanceResponseBody setReplicaId(String replicaId) {
        this.replicaId = replicaId;
        return this;
    }
    public String getReplicaId() {
        return this.replicaId;
    }

    public DescribeSubscriptionPerformanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSubscriptionPerformanceResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeSubscriptionPerformanceResponseBodyPerformanceKeysPerformanceKeyPerformanceValuesPerformanceValue extends TeaModel {
        @NameInMap("Date")
        public String date;

        @NameInMap("Value")
        public String value;

        public static DescribeSubscriptionPerformanceResponseBodyPerformanceKeysPerformanceKeyPerformanceValuesPerformanceValue build(java.util.Map<String, ?> map) throws Exception {
            DescribeSubscriptionPerformanceResponseBodyPerformanceKeysPerformanceKeyPerformanceValuesPerformanceValue self = new DescribeSubscriptionPerformanceResponseBodyPerformanceKeysPerformanceKeyPerformanceValuesPerformanceValue();
            return TeaModel.build(map, self);
        }

        public DescribeSubscriptionPerformanceResponseBodyPerformanceKeysPerformanceKeyPerformanceValuesPerformanceValue setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public DescribeSubscriptionPerformanceResponseBodyPerformanceKeysPerformanceKeyPerformanceValuesPerformanceValue setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeSubscriptionPerformanceResponseBodyPerformanceKeysPerformanceKeyPerformanceValues extends TeaModel {
        @NameInMap("PerformanceValue")
        public java.util.List<DescribeSubscriptionPerformanceResponseBodyPerformanceKeysPerformanceKeyPerformanceValuesPerformanceValue> performanceValue;

        public static DescribeSubscriptionPerformanceResponseBodyPerformanceKeysPerformanceKeyPerformanceValues build(java.util.Map<String, ?> map) throws Exception {
            DescribeSubscriptionPerformanceResponseBodyPerformanceKeysPerformanceKeyPerformanceValues self = new DescribeSubscriptionPerformanceResponseBodyPerformanceKeysPerformanceKeyPerformanceValues();
            return TeaModel.build(map, self);
        }

        public DescribeSubscriptionPerformanceResponseBodyPerformanceKeysPerformanceKeyPerformanceValues setPerformanceValue(java.util.List<DescribeSubscriptionPerformanceResponseBodyPerformanceKeysPerformanceKeyPerformanceValuesPerformanceValue> performanceValue) {
            this.performanceValue = performanceValue;
            return this;
        }
        public java.util.List<DescribeSubscriptionPerformanceResponseBodyPerformanceKeysPerformanceKeyPerformanceValuesPerformanceValue> getPerformanceValue() {
            return this.performanceValue;
        }

    }

    public static class DescribeSubscriptionPerformanceResponseBodyPerformanceKeysPerformanceKey extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("PerformanceValues")
        public DescribeSubscriptionPerformanceResponseBodyPerformanceKeysPerformanceKeyPerformanceValues performanceValues;

        @NameInMap("Unit")
        public String unit;

        @NameInMap("ValueFormat")
        public String valueFormat;

        public static DescribeSubscriptionPerformanceResponseBodyPerformanceKeysPerformanceKey build(java.util.Map<String, ?> map) throws Exception {
            DescribeSubscriptionPerformanceResponseBodyPerformanceKeysPerformanceKey self = new DescribeSubscriptionPerformanceResponseBodyPerformanceKeysPerformanceKey();
            return TeaModel.build(map, self);
        }

        public DescribeSubscriptionPerformanceResponseBodyPerformanceKeysPerformanceKey setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeSubscriptionPerformanceResponseBodyPerformanceKeysPerformanceKey setPerformanceValues(DescribeSubscriptionPerformanceResponseBodyPerformanceKeysPerformanceKeyPerformanceValues performanceValues) {
            this.performanceValues = performanceValues;
            return this;
        }
        public DescribeSubscriptionPerformanceResponseBodyPerformanceKeysPerformanceKeyPerformanceValues getPerformanceValues() {
            return this.performanceValues;
        }

        public DescribeSubscriptionPerformanceResponseBodyPerformanceKeysPerformanceKey setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public DescribeSubscriptionPerformanceResponseBodyPerformanceKeysPerformanceKey setValueFormat(String valueFormat) {
            this.valueFormat = valueFormat;
            return this;
        }
        public String getValueFormat() {
            return this.valueFormat;
        }

    }

    public static class DescribeSubscriptionPerformanceResponseBodyPerformanceKeys extends TeaModel {
        @NameInMap("PerformanceKey")
        public java.util.List<DescribeSubscriptionPerformanceResponseBodyPerformanceKeysPerformanceKey> performanceKey;

        public static DescribeSubscriptionPerformanceResponseBodyPerformanceKeys build(java.util.Map<String, ?> map) throws Exception {
            DescribeSubscriptionPerformanceResponseBodyPerformanceKeys self = new DescribeSubscriptionPerformanceResponseBodyPerformanceKeys();
            return TeaModel.build(map, self);
        }

        public DescribeSubscriptionPerformanceResponseBodyPerformanceKeys setPerformanceKey(java.util.List<DescribeSubscriptionPerformanceResponseBodyPerformanceKeysPerformanceKey> performanceKey) {
            this.performanceKey = performanceKey;
            return this;
        }
        public java.util.List<DescribeSubscriptionPerformanceResponseBodyPerformanceKeysPerformanceKey> getPerformanceKey() {
            return this.performanceKey;
        }

    }

}
