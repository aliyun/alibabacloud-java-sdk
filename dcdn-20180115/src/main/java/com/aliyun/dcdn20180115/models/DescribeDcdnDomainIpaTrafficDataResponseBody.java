// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainIpaTrafficDataResponseBody extends TeaModel {
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
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The start of the time range during which data was queried.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The network traffic that was collected at each interval.</p>
     */
    @NameInMap("TrafficDataPerInterval")
    public DescribeDcdnDomainIpaTrafficDataResponseBodyTrafficDataPerInterval trafficDataPerInterval;

    public static DescribeDcdnDomainIpaTrafficDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainIpaTrafficDataResponseBody self = new DescribeDcdnDomainIpaTrafficDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainIpaTrafficDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDcdnDomainIpaTrafficDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDcdnDomainIpaTrafficDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDcdnDomainIpaTrafficDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnDomainIpaTrafficDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDcdnDomainIpaTrafficDataResponseBody setTrafficDataPerInterval(DescribeDcdnDomainIpaTrafficDataResponseBodyTrafficDataPerInterval trafficDataPerInterval) {
        this.trafficDataPerInterval = trafficDataPerInterval;
        return this;
    }
    public DescribeDcdnDomainIpaTrafficDataResponseBodyTrafficDataPerInterval getTrafficDataPerInterval() {
        return this.trafficDataPerInterval;
    }

    public static class DescribeDcdnDomainIpaTrafficDataResponseBodyTrafficDataPerIntervalDataModule extends TeaModel {
        /**
         * <p>The total amount of network traffic.</p>
         */
        @NameInMap("IpaTraffic")
        public Float ipaTraffic;

        /**
         * <p>The timestamp of the returned data.</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeDcdnDomainIpaTrafficDataResponseBodyTrafficDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainIpaTrafficDataResponseBodyTrafficDataPerIntervalDataModule self = new DescribeDcdnDomainIpaTrafficDataResponseBodyTrafficDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainIpaTrafficDataResponseBodyTrafficDataPerIntervalDataModule setIpaTraffic(Float ipaTraffic) {
            this.ipaTraffic = ipaTraffic;
            return this;
        }
        public Float getIpaTraffic() {
            return this.ipaTraffic;
        }

        public DescribeDcdnDomainIpaTrafficDataResponseBodyTrafficDataPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeDcdnDomainIpaTrafficDataResponseBodyTrafficDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeDcdnDomainIpaTrafficDataResponseBodyTrafficDataPerIntervalDataModule> dataModule;

        public static DescribeDcdnDomainIpaTrafficDataResponseBodyTrafficDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainIpaTrafficDataResponseBodyTrafficDataPerInterval self = new DescribeDcdnDomainIpaTrafficDataResponseBodyTrafficDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainIpaTrafficDataResponseBodyTrafficDataPerInterval setDataModule(java.util.List<DescribeDcdnDomainIpaTrafficDataResponseBodyTrafficDataPerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeDcdnDomainIpaTrafficDataResponseBodyTrafficDataPerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
