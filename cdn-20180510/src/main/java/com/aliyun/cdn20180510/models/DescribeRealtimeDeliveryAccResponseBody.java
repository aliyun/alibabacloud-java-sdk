// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeRealtimeDeliveryAccResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ReatTimeDeliveryAccData")
    public DescribeRealtimeDeliveryAccResponseBodyReatTimeDeliveryAccData reatTimeDeliveryAccData;

    public static DescribeRealtimeDeliveryAccResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRealtimeDeliveryAccResponseBody self = new DescribeRealtimeDeliveryAccResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRealtimeDeliveryAccResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRealtimeDeliveryAccResponseBody setReatTimeDeliveryAccData(DescribeRealtimeDeliveryAccResponseBodyReatTimeDeliveryAccData reatTimeDeliveryAccData) {
        this.reatTimeDeliveryAccData = reatTimeDeliveryAccData;
        return this;
    }
    public DescribeRealtimeDeliveryAccResponseBodyReatTimeDeliveryAccData getReatTimeDeliveryAccData() {
        return this.reatTimeDeliveryAccData;
    }

    public static class DescribeRealtimeDeliveryAccResponseBodyReatTimeDeliveryAccDataAccData extends TeaModel {
        @NameInMap("FailedNum")
        public Integer failedNum;

        @NameInMap("TimeStamp")
        public String timeStamp;

        @NameInMap("SuccessNum")
        public Integer successNum;

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

        public DescribeRealtimeDeliveryAccResponseBodyReatTimeDeliveryAccDataAccData setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeRealtimeDeliveryAccResponseBodyReatTimeDeliveryAccDataAccData setSuccessNum(Integer successNum) {
            this.successNum = successNum;
            return this;
        }
        public Integer getSuccessNum() {
            return this.successNum;
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
