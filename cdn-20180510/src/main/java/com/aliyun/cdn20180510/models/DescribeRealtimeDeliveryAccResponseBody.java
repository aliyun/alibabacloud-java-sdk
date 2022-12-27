// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeRealtimeDeliveryAccResponseBody extends TeaModel {
    // The information about real-time log delivery.
    @NameInMap("ReatTimeDeliveryAccData")
    public DescribeRealtimeDeliveryAccResponseBodyReatTimeDeliveryAccData reatTimeDeliveryAccData;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRealtimeDeliveryAccResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRealtimeDeliveryAccResponseBody self = new DescribeRealtimeDeliveryAccResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRealtimeDeliveryAccResponseBody setReatTimeDeliveryAccData(DescribeRealtimeDeliveryAccResponseBodyReatTimeDeliveryAccData reatTimeDeliveryAccData) {
        this.reatTimeDeliveryAccData = reatTimeDeliveryAccData;
        return this;
    }
    public DescribeRealtimeDeliveryAccResponseBodyReatTimeDeliveryAccData getReatTimeDeliveryAccData() {
        return this.reatTimeDeliveryAccData;
    }

    public DescribeRealtimeDeliveryAccResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRealtimeDeliveryAccResponseBodyReatTimeDeliveryAccDataAccData extends TeaModel {
        // The number of failed attempts to deliver log data to Log Service.
        @NameInMap("FailedNum")
        public Integer failedNum;

        // The number of successful deliveries of log data to Log Service.
        @NameInMap("SuccessNum")
        public Integer successNum;

        // The timestamp of the data.
        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeRealtimeDeliveryAccResponseBodyReatTimeDeliveryAccDataAccData build(java.util.Map<String, ?> map) throws Exception {
            DescribeRealtimeDeliveryAccResponseBodyReatTimeDeliveryAccDataAccData self = new DescribeRealtimeDeliveryAccResponseBodyReatTimeDeliveryAccDataAccData();
            return TeaModel.build(map, self);
        }

        public DescribeRealtimeDeliveryAccResponseBodyReatTimeDeliveryAccDataAccData setFailedNum(Integer failedNum) {
            this.failedNum = failedNum;
            return this;
        }
        public Integer getFailedNum() {
            return this.failedNum;
        }

        public DescribeRealtimeDeliveryAccResponseBodyReatTimeDeliveryAccDataAccData setSuccessNum(Integer successNum) {
            this.successNum = successNum;
            return this;
        }
        public Integer getSuccessNum() {
            return this.successNum;
        }

        public DescribeRealtimeDeliveryAccResponseBodyReatTimeDeliveryAccDataAccData setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeRealtimeDeliveryAccResponseBodyReatTimeDeliveryAccData extends TeaModel {
        @NameInMap("AccData")
        public java.util.List<DescribeRealtimeDeliveryAccResponseBodyReatTimeDeliveryAccDataAccData> accData;

        public static DescribeRealtimeDeliveryAccResponseBodyReatTimeDeliveryAccData build(java.util.Map<String, ?> map) throws Exception {
            DescribeRealtimeDeliveryAccResponseBodyReatTimeDeliveryAccData self = new DescribeRealtimeDeliveryAccResponseBodyReatTimeDeliveryAccData();
            return TeaModel.build(map, self);
        }

        public DescribeRealtimeDeliveryAccResponseBodyReatTimeDeliveryAccData setAccData(java.util.List<DescribeRealtimeDeliveryAccResponseBodyReatTimeDeliveryAccDataAccData> accData) {
            this.accData = accData;
            return this;
        }
        public java.util.List<DescribeRealtimeDeliveryAccResponseBodyReatTimeDeliveryAccDataAccData> getAccData() {
            return this.accData;
        }

    }

}
