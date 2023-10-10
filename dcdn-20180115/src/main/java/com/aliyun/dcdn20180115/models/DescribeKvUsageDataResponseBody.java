// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeKvUsageDataResponseBody extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("KvUsageData")
    public java.util.List<DescribeKvUsageDataResponseBodyKvUsageData> kvUsageData;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StartTime")
    public String startTime;

    public static DescribeKvUsageDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeKvUsageDataResponseBody self = new DescribeKvUsageDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeKvUsageDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeKvUsageDataResponseBody setKvUsageData(java.util.List<DescribeKvUsageDataResponseBodyKvUsageData> kvUsageData) {
        this.kvUsageData = kvUsageData;
        return this;
    }
    public java.util.List<DescribeKvUsageDataResponseBodyKvUsageData> getKvUsageData() {
        return this.kvUsageData;
    }

    public DescribeKvUsageDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeKvUsageDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeKvUsageDataResponseBodyKvUsageData extends TeaModel {
        @NameInMap("Acc")
        public Long acc;

        @NameInMap("AccessType")
        public String accessType;

        @NameInMap("NamespaceId")
        public String namespaceId;

        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeKvUsageDataResponseBodyKvUsageData build(java.util.Map<String, ?> map) throws Exception {
            DescribeKvUsageDataResponseBodyKvUsageData self = new DescribeKvUsageDataResponseBodyKvUsageData();
            return TeaModel.build(map, self);
        }

        public DescribeKvUsageDataResponseBodyKvUsageData setAcc(Long acc) {
            this.acc = acc;
            return this;
        }
        public Long getAcc() {
            return this.acc;
        }

        public DescribeKvUsageDataResponseBodyKvUsageData setAccessType(String accessType) {
            this.accessType = accessType;
            return this;
        }
        public String getAccessType() {
            return this.accessType;
        }

        public DescribeKvUsageDataResponseBodyKvUsageData setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public DescribeKvUsageDataResponseBodyKvUsageData setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

}
