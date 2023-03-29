// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainRealTimeReqHitRateDataResponseBody extends TeaModel {
    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Data")
    public DescribeDomainRealTimeReqHitRateDataResponseBodyData data;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDomainRealTimeReqHitRateDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainRealTimeReqHitRateDataResponseBody self = new DescribeDomainRealTimeReqHitRateDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainRealTimeReqHitRateDataResponseBody setData(DescribeDomainRealTimeReqHitRateDataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDomainRealTimeReqHitRateDataResponseBodyData getData() {
        return this.data;
    }

    public DescribeDomainRealTimeReqHitRateDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDomainRealTimeReqHitRateDataResponseBodyDataReqHitRateDataModel extends TeaModel {
        /**
         * <p>The request hit ratio.</p>
         */
        @NameInMap("ReqHitRate")
        public Float reqHitRate;

        /**
         * <p>The timestamp. The time follows the ISO 8601 standard. The time is displayed in UTC.</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeDomainRealTimeReqHitRateDataResponseBodyDataReqHitRateDataModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainRealTimeReqHitRateDataResponseBodyDataReqHitRateDataModel self = new DescribeDomainRealTimeReqHitRateDataResponseBodyDataReqHitRateDataModel();
            return TeaModel.build(map, self);
        }

        public DescribeDomainRealTimeReqHitRateDataResponseBodyDataReqHitRateDataModel setReqHitRate(Float reqHitRate) {
            this.reqHitRate = reqHitRate;
            return this;
        }
        public Float getReqHitRate() {
            return this.reqHitRate;
        }

        public DescribeDomainRealTimeReqHitRateDataResponseBodyDataReqHitRateDataModel setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeDomainRealTimeReqHitRateDataResponseBodyData extends TeaModel {
        @NameInMap("ReqHitRateDataModel")
        public java.util.List<DescribeDomainRealTimeReqHitRateDataResponseBodyDataReqHitRateDataModel> reqHitRateDataModel;

        public static DescribeDomainRealTimeReqHitRateDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainRealTimeReqHitRateDataResponseBodyData self = new DescribeDomainRealTimeReqHitRateDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDomainRealTimeReqHitRateDataResponseBodyData setReqHitRateDataModel(java.util.List<DescribeDomainRealTimeReqHitRateDataResponseBodyDataReqHitRateDataModel> reqHitRateDataModel) {
            this.reqHitRateDataModel = reqHitRateDataModel;
            return this;
        }
        public java.util.List<DescribeDomainRealTimeReqHitRateDataResponseBodyDataReqHitRateDataModel> getReqHitRateDataModel() {
            return this.reqHitRateDataModel;
        }

    }

}
