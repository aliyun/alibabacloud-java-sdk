// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveRealtimeDeliveryAccResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RealTimeDeliveryAccData")
    @Validation(required = true)
    public DescribeLiveRealtimeDeliveryAccResponseRealTimeDeliveryAccData realTimeDeliveryAccData;

    public static DescribeLiveRealtimeDeliveryAccResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveRealtimeDeliveryAccResponse self = new DescribeLiveRealtimeDeliveryAccResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveRealtimeDeliveryAccResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveRealtimeDeliveryAccResponse setRealTimeDeliveryAccData(DescribeLiveRealtimeDeliveryAccResponseRealTimeDeliveryAccData realTimeDeliveryAccData) {
        this.realTimeDeliveryAccData = realTimeDeliveryAccData;
        return this;
    }
    public DescribeLiveRealtimeDeliveryAccResponseRealTimeDeliveryAccData getRealTimeDeliveryAccData() {
        return this.realTimeDeliveryAccData;
    }

    public static class DescribeLiveRealtimeDeliveryAccResponseRealTimeDeliveryAccDataAccData extends TeaModel {
        @NameInMap("TimeStamp")
        @Validation(required = true)
        public String timeStamp;

        @NameInMap("SuccessNum")
        @Validation(required = true)
        public Integer successNum;

        @NameInMap("FailedNum")
        @Validation(required = true)
        public Integer failedNum;

        public static DescribeLiveRealtimeDeliveryAccResponseRealTimeDeliveryAccDataAccData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveRealtimeDeliveryAccResponseRealTimeDeliveryAccDataAccData self = new DescribeLiveRealtimeDeliveryAccResponseRealTimeDeliveryAccDataAccData();
            return TeaModel.build(map, self);
        }

        public DescribeLiveRealtimeDeliveryAccResponseRealTimeDeliveryAccDataAccData setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeLiveRealtimeDeliveryAccResponseRealTimeDeliveryAccDataAccData setSuccessNum(Integer successNum) {
            this.successNum = successNum;
            return this;
        }
        public Integer getSuccessNum() {
            return this.successNum;
        }

        public DescribeLiveRealtimeDeliveryAccResponseRealTimeDeliveryAccDataAccData setFailedNum(Integer failedNum) {
            this.failedNum = failedNum;
            return this;
        }
        public Integer getFailedNum() {
            return this.failedNum;
        }

    }

    public static class DescribeLiveRealtimeDeliveryAccResponseRealTimeDeliveryAccData extends TeaModel {
        @NameInMap("AccData")
        @Validation(required = true)
        public java.util.List<DescribeLiveRealtimeDeliveryAccResponseRealTimeDeliveryAccDataAccData> accData;

        public static DescribeLiveRealtimeDeliveryAccResponseRealTimeDeliveryAccData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveRealtimeDeliveryAccResponseRealTimeDeliveryAccData self = new DescribeLiveRealtimeDeliveryAccResponseRealTimeDeliveryAccData();
            return TeaModel.build(map, self);
        }

        public DescribeLiveRealtimeDeliveryAccResponseRealTimeDeliveryAccData setAccData(java.util.List<DescribeLiveRealtimeDeliveryAccResponseRealTimeDeliveryAccDataAccData> accData) {
            this.accData = accData;
            return this;
        }
        public java.util.List<DescribeLiveRealtimeDeliveryAccResponseRealTimeDeliveryAccDataAccData> getAccData() {
            return this.accData;
        }

    }

}
