// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeRealtimeDeliveryAccResponseBody extends TeaModel {
    /**
     * <p>The statistics about real-time log deliveries.</p>
     */
    @NameInMap("ReatTimeDeliveryAccData")
    public DescribeRealtimeDeliveryAccResponseBodyReatTimeDeliveryAccData reatTimeDeliveryAccData;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>684306D2-2511-4977-991D-CE97E91FD7C0</p>
     */
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
        /**
         * <p>The number of failed attempts to deliver log data to Log Service.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("FailedNum")
        public Integer failedNum;

        /**
         * <p>The number of successful deliveries of log data to Log Service.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("SuccessNum")
        public Integer successNum;

        /**
         * <p>The timestamp of the data returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-09-03T06:00:00Z</p>
         */
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
