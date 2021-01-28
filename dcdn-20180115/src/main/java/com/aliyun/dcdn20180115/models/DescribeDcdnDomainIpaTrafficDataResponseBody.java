// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainIpaTrafficDataResponseBody extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("TrafficDataPerInterval")
    public DescribeDcdnDomainIpaTrafficDataResponseBodyTrafficDataPerInterval trafficDataPerInterval;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("DataInterval")
    public String dataInterval;

    public static DescribeDcdnDomainIpaTrafficDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainIpaTrafficDataResponseBody self = new DescribeDcdnDomainIpaTrafficDataResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeDcdnDomainIpaTrafficDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDcdnDomainIpaTrafficDataResponseBody setTrafficDataPerInterval(DescribeDcdnDomainIpaTrafficDataResponseBodyTrafficDataPerInterval trafficDataPerInterval) {
        this.trafficDataPerInterval = trafficDataPerInterval;
        return this;
    }
    public DescribeDcdnDomainIpaTrafficDataResponseBodyTrafficDataPerInterval getTrafficDataPerInterval() {
        return this.trafficDataPerInterval;
    }

    public DescribeDcdnDomainIpaTrafficDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDcdnDomainIpaTrafficDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public static class DescribeDcdnDomainIpaTrafficDataResponseBodyTrafficDataPerIntervalDataModule extends TeaModel {
        @NameInMap("IpaTraffic")
        public Float ipaTraffic;

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
