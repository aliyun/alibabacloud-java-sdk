// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeKvRealTimeQpsDataResponseBody extends TeaModel {
    @NameInMap("AggregateData")
    public java.util.List<DescribeKvRealTimeQpsDataResponseBodyAggregateData> aggregateData;

    /**
     * <strong>example:</strong>
     * <p>2023-01-18T15:59:59Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("KvQpsData")
    public java.util.List<DescribeKvRealTimeQpsDataResponseBodyKvQpsData> kvQpsData;

    /**
     * <strong>example:</strong>
     * <p>3C6CCEC4-6B88-4D4A-93E4-D47B3D92C***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2023-01-10T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeKvRealTimeQpsDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeKvRealTimeQpsDataResponseBody self = new DescribeKvRealTimeQpsDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeKvRealTimeQpsDataResponseBody setAggregateData(java.util.List<DescribeKvRealTimeQpsDataResponseBodyAggregateData> aggregateData) {
        this.aggregateData = aggregateData;
        return this;
    }
    public java.util.List<DescribeKvRealTimeQpsDataResponseBodyAggregateData> getAggregateData() {
        return this.aggregateData;
    }

    public DescribeKvRealTimeQpsDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeKvRealTimeQpsDataResponseBody setKvQpsData(java.util.List<DescribeKvRealTimeQpsDataResponseBodyKvQpsData> kvQpsData) {
        this.kvQpsData = kvQpsData;
        return this;
    }
    public java.util.List<DescribeKvRealTimeQpsDataResponseBodyKvQpsData> getKvQpsData() {
        return this.kvQpsData;
    }

    public DescribeKvRealTimeQpsDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeKvRealTimeQpsDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeKvRealTimeQpsDataResponseBodyAggregateData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Acc")
        public Long acc;

        /**
         * <strong>example:</strong>
         * <p>get</p>
         */
        @NameInMap("AccessType")
        public String accessType;

        /**
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("KeyAcc")
        public Long keyAcc;

        /**
         * <strong>example:</strong>
         * <p>1233</p>
         */
        @NameInMap("KeySuccAcc")
        public Long keySuccAcc;

        public static DescribeKvRealTimeQpsDataResponseBodyAggregateData build(java.util.Map<String, ?> map) throws Exception {
            DescribeKvRealTimeQpsDataResponseBodyAggregateData self = new DescribeKvRealTimeQpsDataResponseBodyAggregateData();
            return TeaModel.build(map, self);
        }

        public DescribeKvRealTimeQpsDataResponseBodyAggregateData setAcc(Long acc) {
            this.acc = acc;
            return this;
        }
        public Long getAcc() {
            return this.acc;
        }

        public DescribeKvRealTimeQpsDataResponseBodyAggregateData setAccessType(String accessType) {
            this.accessType = accessType;
            return this;
        }
        public String getAccessType() {
            return this.accessType;
        }

        public DescribeKvRealTimeQpsDataResponseBodyAggregateData setKeyAcc(Long keyAcc) {
            this.keyAcc = keyAcc;
            return this;
        }
        public Long getKeyAcc() {
            return this.keyAcc;
        }

        public DescribeKvRealTimeQpsDataResponseBodyAggregateData setKeySuccAcc(Long keySuccAcc) {
            this.keySuccAcc = keySuccAcc;
            return this;
        }
        public Long getKeySuccAcc() {
            return this.keySuccAcc;
        }

    }

    public static class DescribeKvRealTimeQpsDataResponseBodyKvQpsData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>get</p>
         */
        @NameInMap("AccessType")
        public String accessType;

        /**
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("KeyQps")
        public Long keyQps;

        /**
         * <strong>example:</strong>
         * <p>1233</p>
         */
        @NameInMap("KeySuccQps")
        public Long keySuccQps;

        /**
         * <strong>example:</strong>
         * <p>534167033424646***</p>
         */
        @NameInMap("NamespaceId")
        public String namespaceId;

        /**
         * <strong>example:</strong>
         * <p>5236</p>
         */
        @NameInMap("Qps")
        public Long qps;

        /**
         * <strong>example:</strong>
         * <p>2023-01-10T16:00:00Z</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeKvRealTimeQpsDataResponseBodyKvQpsData build(java.util.Map<String, ?> map) throws Exception {
            DescribeKvRealTimeQpsDataResponseBodyKvQpsData self = new DescribeKvRealTimeQpsDataResponseBodyKvQpsData();
            return TeaModel.build(map, self);
        }

        public DescribeKvRealTimeQpsDataResponseBodyKvQpsData setAccessType(String accessType) {
            this.accessType = accessType;
            return this;
        }
        public String getAccessType() {
            return this.accessType;
        }

        public DescribeKvRealTimeQpsDataResponseBodyKvQpsData setKeyQps(Long keyQps) {
            this.keyQps = keyQps;
            return this;
        }
        public Long getKeyQps() {
            return this.keyQps;
        }

        public DescribeKvRealTimeQpsDataResponseBodyKvQpsData setKeySuccQps(Long keySuccQps) {
            this.keySuccQps = keySuccQps;
            return this;
        }
        public Long getKeySuccQps() {
            return this.keySuccQps;
        }

        public DescribeKvRealTimeQpsDataResponseBodyKvQpsData setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public DescribeKvRealTimeQpsDataResponseBodyKvQpsData setQps(Long qps) {
            this.qps = qps;
            return this;
        }
        public Long getQps() {
            return this.qps;
        }

        public DescribeKvRealTimeQpsDataResponseBodyKvQpsData setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

}
