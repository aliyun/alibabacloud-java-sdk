// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainQpsDataResponseBody extends TeaModel {
    /**
     * <p>The time interval between the data entries returned. Unit: seconds.</p>
     */
    @NameInMap("DataInterval")
    public String dataInterval;

    /**
     * <p>The accelerated domain name.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range during which data was queried.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The QPS returned at each time interval.</p>
     */
    @NameInMap("QpsDataPerInterval")
    public DescribeDcdnDomainQpsDataResponseBodyQpsDataPerInterval qpsDataPerInterval;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The start of the time range during which data was queried.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDcdnDomainQpsDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainQpsDataResponseBody self = new DescribeDcdnDomainQpsDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainQpsDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDcdnDomainQpsDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDcdnDomainQpsDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDcdnDomainQpsDataResponseBody setQpsDataPerInterval(DescribeDcdnDomainQpsDataResponseBodyQpsDataPerInterval qpsDataPerInterval) {
        this.qpsDataPerInterval = qpsDataPerInterval;
        return this;
    }
    public DescribeDcdnDomainQpsDataResponseBodyQpsDataPerInterval getQpsDataPerInterval() {
        return this.qpsDataPerInterval;
    }

    public DescribeDcdnDomainQpsDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnDomainQpsDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeDcdnDomainQpsDataResponseBodyQpsDataPerIntervalDataModule extends TeaModel {
        /**
         * <p>The total number of requests.</p>
         */
        @NameInMap("Acc")
        public Float acc;

        /**
         * <p>The number of requests for dynamic content delivery over HTTP.</p>
         */
        @NameInMap("DynamicHttpAcc")
        public Float dynamicHttpAcc;

        /**
         * <p>The QPS for dynamic content delivery over HTTP.</p>
         */
        @NameInMap("DynamicHttpQps")
        public Float dynamicHttpQps;

        /**
         * <p>The number of requests for dynamic content delivery over HTTPS.</p>
         */
        @NameInMap("DynamicHttpsAcc")
        public Float dynamicHttpsAcc;

        /**
         * <p>The QPS for dynamic content delivery over HTTPS.</p>
         */
        @NameInMap("DynamicHttpsQps")
        public Float dynamicHttpsQps;

        /**
         * <p>The total QPS.</p>
         */
        @NameInMap("Qps")
        public Float qps;

        /**
         * <p>The number of requests for static content delivery over HTTP.</p>
         */
        @NameInMap("StaticHttpAcc")
        public Float staticHttpAcc;

        /**
         * <p>The QPS for static content delivery over HTTP.</p>
         */
        @NameInMap("StaticHttpQps")
        public Float staticHttpQps;

        /**
         * <p>The number of requests for static content delivery over HTTPS.</p>
         */
        @NameInMap("StaticHttpsAcc")
        public Float staticHttpsAcc;

        /**
         * <p>The QPS for static content delivery over HTTPS.</p>
         */
        @NameInMap("StaticHttpsQps")
        public Float staticHttpsQps;

        /**
         * <p>The timestamp of the returned data.</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeDcdnDomainQpsDataResponseBodyQpsDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainQpsDataResponseBodyQpsDataPerIntervalDataModule self = new DescribeDcdnDomainQpsDataResponseBodyQpsDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainQpsDataResponseBodyQpsDataPerIntervalDataModule setAcc(Float acc) {
            this.acc = acc;
            return this;
        }
        public Float getAcc() {
            return this.acc;
        }

        public DescribeDcdnDomainQpsDataResponseBodyQpsDataPerIntervalDataModule setDynamicHttpAcc(Float dynamicHttpAcc) {
            this.dynamicHttpAcc = dynamicHttpAcc;
            return this;
        }
        public Float getDynamicHttpAcc() {
            return this.dynamicHttpAcc;
        }

        public DescribeDcdnDomainQpsDataResponseBodyQpsDataPerIntervalDataModule setDynamicHttpQps(Float dynamicHttpQps) {
            this.dynamicHttpQps = dynamicHttpQps;
            return this;
        }
        public Float getDynamicHttpQps() {
            return this.dynamicHttpQps;
        }

        public DescribeDcdnDomainQpsDataResponseBodyQpsDataPerIntervalDataModule setDynamicHttpsAcc(Float dynamicHttpsAcc) {
            this.dynamicHttpsAcc = dynamicHttpsAcc;
            return this;
        }
        public Float getDynamicHttpsAcc() {
            return this.dynamicHttpsAcc;
        }

        public DescribeDcdnDomainQpsDataResponseBodyQpsDataPerIntervalDataModule setDynamicHttpsQps(Float dynamicHttpsQps) {
            this.dynamicHttpsQps = dynamicHttpsQps;
            return this;
        }
        public Float getDynamicHttpsQps() {
            return this.dynamicHttpsQps;
        }

        public DescribeDcdnDomainQpsDataResponseBodyQpsDataPerIntervalDataModule setQps(Float qps) {
            this.qps = qps;
            return this;
        }
        public Float getQps() {
            return this.qps;
        }

        public DescribeDcdnDomainQpsDataResponseBodyQpsDataPerIntervalDataModule setStaticHttpAcc(Float staticHttpAcc) {
            this.staticHttpAcc = staticHttpAcc;
            return this;
        }
        public Float getStaticHttpAcc() {
            return this.staticHttpAcc;
        }

        public DescribeDcdnDomainQpsDataResponseBodyQpsDataPerIntervalDataModule setStaticHttpQps(Float staticHttpQps) {
            this.staticHttpQps = staticHttpQps;
            return this;
        }
        public Float getStaticHttpQps() {
            return this.staticHttpQps;
        }

        public DescribeDcdnDomainQpsDataResponseBodyQpsDataPerIntervalDataModule setStaticHttpsAcc(Float staticHttpsAcc) {
            this.staticHttpsAcc = staticHttpsAcc;
            return this;
        }
        public Float getStaticHttpsAcc() {
            return this.staticHttpsAcc;
        }

        public DescribeDcdnDomainQpsDataResponseBodyQpsDataPerIntervalDataModule setStaticHttpsQps(Float staticHttpsQps) {
            this.staticHttpsQps = staticHttpsQps;
            return this;
        }
        public Float getStaticHttpsQps() {
            return this.staticHttpsQps;
        }

        public DescribeDcdnDomainQpsDataResponseBodyQpsDataPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeDcdnDomainQpsDataResponseBodyQpsDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeDcdnDomainQpsDataResponseBodyQpsDataPerIntervalDataModule> dataModule;

        public static DescribeDcdnDomainQpsDataResponseBodyQpsDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainQpsDataResponseBodyQpsDataPerInterval self = new DescribeDcdnDomainQpsDataResponseBodyQpsDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainQpsDataResponseBodyQpsDataPerInterval setDataModule(java.util.List<DescribeDcdnDomainQpsDataResponseBodyQpsDataPerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeDcdnDomainQpsDataResponseBodyQpsDataPerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
