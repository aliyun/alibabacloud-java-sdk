// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainRealTimeQpsDataResponseBody extends TeaModel {
    /**
     * <p>The accelerated domain name. Separate multiple accelerated domain names with commas (,).</p>
     */
    @NameInMap("Data")
    public DescribeDcdnDomainRealTimeQpsDataResponseBodyData data;

    /**
     * <p>- You can call this operation up to 10 times per second per account.</p>
     * <p>- If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last hour. If you set both the StartTime and EndTime parameters, the request returns the data collected within the specified time range.</p>
     * <br>
     * <p>**Time granularity**The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay. </p>
     * <br>
     * <p>| Time granularity | Maximum time range per query | Historical data available | Data delay |</p>
     * <p>| ---------------- | ---------------------------- | ------------------------- | ---------- |</p>
     * <p>| 1 minute | 1 hour | 7 days | 5 minutes |</p>
     * <p>| 5 minutes | 3 days | 93 days | 15 minutes |</p>
     * <p>| 1 hour | 31 days | 186 days | 4 hours |</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDcdnDomainRealTimeQpsDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainRealTimeQpsDataResponseBody self = new DescribeDcdnDomainRealTimeQpsDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainRealTimeQpsDataResponseBody setData(DescribeDcdnDomainRealTimeQpsDataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDcdnDomainRealTimeQpsDataResponseBodyData getData() {
        return this.data;
    }

    public DescribeDcdnDomainRealTimeQpsDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDcdnDomainRealTimeQpsDataResponseBodyDataQpsModel extends TeaModel {
        /**
         * <p>The name of the Internet service provider (ISP).</p>
         * <br>
         * <p>You can call the [DescribeDcdnRegionAndIsp](~~207199~~) operation to query ISPs.</p>
         */
        @NameInMap("Qps")
        public Float qps;

        /**
         * <p>The QPS data.</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeDcdnDomainRealTimeQpsDataResponseBodyDataQpsModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainRealTimeQpsDataResponseBodyDataQpsModel self = new DescribeDcdnDomainRealTimeQpsDataResponseBodyDataQpsModel();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainRealTimeQpsDataResponseBodyDataQpsModel setQps(Float qps) {
            this.qps = qps;
            return this;
        }
        public Float getQps() {
            return this.qps;
        }

        public DescribeDcdnDomainRealTimeQpsDataResponseBodyDataQpsModel setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeDcdnDomainRealTimeQpsDataResponseBodyData extends TeaModel {
        @NameInMap("QpsModel")
        public java.util.List<DescribeDcdnDomainRealTimeQpsDataResponseBodyDataQpsModel> qpsModel;

        public static DescribeDcdnDomainRealTimeQpsDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainRealTimeQpsDataResponseBodyData self = new DescribeDcdnDomainRealTimeQpsDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainRealTimeQpsDataResponseBodyData setQpsModel(java.util.List<DescribeDcdnDomainRealTimeQpsDataResponseBodyDataQpsModel> qpsModel) {
            this.qpsModel = qpsModel;
            return this;
        }
        public java.util.List<DescribeDcdnDomainRealTimeQpsDataResponseBodyDataQpsModel> getQpsModel() {
            return this.qpsModel;
        }

    }

}
