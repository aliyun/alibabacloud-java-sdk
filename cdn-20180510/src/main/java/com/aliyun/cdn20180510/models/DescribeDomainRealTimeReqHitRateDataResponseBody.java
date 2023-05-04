// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainRealTimeReqHitRateDataResponseBody extends TeaModel {
    /**
     * <p>- The maximum number of times that each user can call this operation per second is 10.</p>
     * <p>- If you do not set StartTime or EndTime, data collected within the last hour is queried. If you set both StartTime and EndTime, data collected within the specified time range is queried.</p>
     * <p>- By default, requests in the Go programming language use the POST request method. You must manually change the request method to GET by declaring: request.Method="GET".</p>
     * <p>- The network traffic destined for different domain names may be redirected to the same origin server. Therefore, the request hit ratios may be inaccurate. The accuracy of query results is based on the actual configurations.</p>
     * <br>
     * <p>**Time granularity**</p>
     * <br>
     * <p>The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay. </p>
     * <br>
     * <p>| Time granularity | Time range to query | Historical data available | Data delay |</p>
     * <p>| ---------------- | ------------------- | ------------------------- | ---------- |</p>
     * <p>| 1 minute | 1 hour | 7 days | 5 minutes |</p>
     * <p>| 5 minutes | 3 Days | 93 days | 15 minutes |</p>
     * <p>| 1 hour | 31 days | 186 days | 4 hours |</p>
     */
    @NameInMap("Data")
    public DescribeDomainRealTimeReqHitRateDataResponseBodyData data;

    /**
     * <p>624461</p>
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
         * <p>You can specify multiple domain names and separate them with commas (,). You can specify at most 100 domain names in each call.</p>
         */
        @NameInMap("ReqHitRate")
        public Float reqHitRate;

        /**
         * <p>The request hit ratio.</p>
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
