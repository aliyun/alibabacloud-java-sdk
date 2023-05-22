// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainRealTimeReqHitRateDataResponseBody extends TeaModel {
    /**
     * <p>The list of byte hit ratios.</p>
     */
    @NameInMap("Data")
    public DescribeDcdnDomainRealTimeReqHitRateDataResponseBodyData data;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDcdnDomainRealTimeReqHitRateDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainRealTimeReqHitRateDataResponseBody self = new DescribeDcdnDomainRealTimeReqHitRateDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainRealTimeReqHitRateDataResponseBody setData(DescribeDcdnDomainRealTimeReqHitRateDataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDcdnDomainRealTimeReqHitRateDataResponseBodyData getData() {
        return this.data;
    }

    public DescribeDcdnDomainRealTimeReqHitRateDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDcdnDomainRealTimeReqHitRateDataResponseBodyDataReqHitRateDataModel extends TeaModel {
        /**
         * <p>The request hit ratio.</p>
         */
        @NameInMap("ReqHitRate")
        public Float reqHitRate;

        /**
         * <p>The timestamp of the data returned. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeDcdnDomainRealTimeReqHitRateDataResponseBodyDataReqHitRateDataModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainRealTimeReqHitRateDataResponseBodyDataReqHitRateDataModel self = new DescribeDcdnDomainRealTimeReqHitRateDataResponseBodyDataReqHitRateDataModel();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainRealTimeReqHitRateDataResponseBodyDataReqHitRateDataModel setReqHitRate(Float reqHitRate) {
            this.reqHitRate = reqHitRate;
            return this;
        }
        public Float getReqHitRate() {
            return this.reqHitRate;
        }

        public DescribeDcdnDomainRealTimeReqHitRateDataResponseBodyDataReqHitRateDataModel setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeDcdnDomainRealTimeReqHitRateDataResponseBodyData extends TeaModel {
        @NameInMap("ReqHitRateDataModel")
        public java.util.List<DescribeDcdnDomainRealTimeReqHitRateDataResponseBodyDataReqHitRateDataModel> reqHitRateDataModel;

        public static DescribeDcdnDomainRealTimeReqHitRateDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainRealTimeReqHitRateDataResponseBodyData self = new DescribeDcdnDomainRealTimeReqHitRateDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainRealTimeReqHitRateDataResponseBodyData setReqHitRateDataModel(java.util.List<DescribeDcdnDomainRealTimeReqHitRateDataResponseBodyDataReqHitRateDataModel> reqHitRateDataModel) {
            this.reqHitRateDataModel = reqHitRateDataModel;
            return this;
        }
        public java.util.List<DescribeDcdnDomainRealTimeReqHitRateDataResponseBodyDataReqHitRateDataModel> getReqHitRateDataModel() {
            return this.reqHitRateDataModel;
        }

    }

}
