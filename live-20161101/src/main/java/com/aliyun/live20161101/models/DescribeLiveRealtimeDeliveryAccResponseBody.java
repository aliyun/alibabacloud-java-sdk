// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveRealtimeDeliveryAccResponseBody extends TeaModel {
    @NameInMap("RealTimeDeliveryAccData")
    public DescribeLiveRealtimeDeliveryAccResponseBodyRealTimeDeliveryAccData realTimeDeliveryAccData;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>684306D2-2511-4977-991D-CE97E91FD7C0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLiveRealtimeDeliveryAccResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveRealtimeDeliveryAccResponseBody self = new DescribeLiveRealtimeDeliveryAccResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveRealtimeDeliveryAccResponseBody setRealTimeDeliveryAccData(DescribeLiveRealtimeDeliveryAccResponseBodyRealTimeDeliveryAccData realTimeDeliveryAccData) {
        this.realTimeDeliveryAccData = realTimeDeliveryAccData;
        return this;
    }
    public DescribeLiveRealtimeDeliveryAccResponseBodyRealTimeDeliveryAccData getRealTimeDeliveryAccData() {
        return this.realTimeDeliveryAccData;
    }

    public DescribeLiveRealtimeDeliveryAccResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLiveRealtimeDeliveryAccResponseBodyRealTimeDeliveryAccDataAccData extends TeaModel {
        @NameInMap("FailedNum")
        public Integer failedNum;

        @NameInMap("SuccessNum")
        public Integer successNum;

        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeLiveRealtimeDeliveryAccResponseBodyRealTimeDeliveryAccDataAccData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveRealtimeDeliveryAccResponseBodyRealTimeDeliveryAccDataAccData self = new DescribeLiveRealtimeDeliveryAccResponseBodyRealTimeDeliveryAccDataAccData();
            return TeaModel.build(map, self);
        }

        public DescribeLiveRealtimeDeliveryAccResponseBodyRealTimeDeliveryAccDataAccData setFailedNum(Integer failedNum) {
            this.failedNum = failedNum;
            return this;
        }
        public Integer getFailedNum() {
            return this.failedNum;
        }

        public DescribeLiveRealtimeDeliveryAccResponseBodyRealTimeDeliveryAccDataAccData setSuccessNum(Integer successNum) {
            this.successNum = successNum;
            return this;
        }
        public Integer getSuccessNum() {
            return this.successNum;
        }

        public DescribeLiveRealtimeDeliveryAccResponseBodyRealTimeDeliveryAccDataAccData setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeLiveRealtimeDeliveryAccResponseBodyRealTimeDeliveryAccData extends TeaModel {
        @NameInMap("AccData")
        public java.util.List<DescribeLiveRealtimeDeliveryAccResponseBodyRealTimeDeliveryAccDataAccData> accData;

        public static DescribeLiveRealtimeDeliveryAccResponseBodyRealTimeDeliveryAccData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveRealtimeDeliveryAccResponseBodyRealTimeDeliveryAccData self = new DescribeLiveRealtimeDeliveryAccResponseBodyRealTimeDeliveryAccData();
            return TeaModel.build(map, self);
        }

        public DescribeLiveRealtimeDeliveryAccResponseBodyRealTimeDeliveryAccData setAccData(java.util.List<DescribeLiveRealtimeDeliveryAccResponseBodyRealTimeDeliveryAccDataAccData> accData) {
            this.accData = accData;
            return this;
        }
        public java.util.List<DescribeLiveRealtimeDeliveryAccResponseBodyRealTimeDeliveryAccDataAccData> getAccData() {
            return this.accData;
        }

    }

}
