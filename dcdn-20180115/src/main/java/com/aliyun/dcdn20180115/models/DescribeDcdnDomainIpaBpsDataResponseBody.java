// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainIpaBpsDataResponseBody extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("DataInterval")
    public String dataInterval;

    @NameInMap("BpsDataPerInterval")
    public DescribeDcdnDomainIpaBpsDataResponseBodyBpsDataPerInterval bpsDataPerInterval;

    public static DescribeDcdnDomainIpaBpsDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainIpaBpsDataResponseBody self = new DescribeDcdnDomainIpaBpsDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainIpaBpsDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDcdnDomainIpaBpsDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnDomainIpaBpsDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDcdnDomainIpaBpsDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDcdnDomainIpaBpsDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDcdnDomainIpaBpsDataResponseBody setBpsDataPerInterval(DescribeDcdnDomainIpaBpsDataResponseBodyBpsDataPerInterval bpsDataPerInterval) {
        this.bpsDataPerInterval = bpsDataPerInterval;
        return this;
    }
    public DescribeDcdnDomainIpaBpsDataResponseBodyBpsDataPerInterval getBpsDataPerInterval() {
        return this.bpsDataPerInterval;
    }

    public static class DescribeDcdnDomainIpaBpsDataResponseBodyBpsDataPerIntervalDataModule extends TeaModel {
        @NameInMap("IpaBps")
        public Float ipaBps;

        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeDcdnDomainIpaBpsDataResponseBodyBpsDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainIpaBpsDataResponseBodyBpsDataPerIntervalDataModule self = new DescribeDcdnDomainIpaBpsDataResponseBodyBpsDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainIpaBpsDataResponseBodyBpsDataPerIntervalDataModule setIpaBps(Float ipaBps) {
            this.ipaBps = ipaBps;
            return this;
        }
        public Float getIpaBps() {
            return this.ipaBps;
        }

        public DescribeDcdnDomainIpaBpsDataResponseBodyBpsDataPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeDcdnDomainIpaBpsDataResponseBodyBpsDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeDcdnDomainIpaBpsDataResponseBodyBpsDataPerIntervalDataModule> dataModule;

        public static DescribeDcdnDomainIpaBpsDataResponseBodyBpsDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainIpaBpsDataResponseBodyBpsDataPerInterval self = new DescribeDcdnDomainIpaBpsDataResponseBodyBpsDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainIpaBpsDataResponseBodyBpsDataPerInterval setDataModule(java.util.List<DescribeDcdnDomainIpaBpsDataResponseBodyBpsDataPerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeDcdnDomainIpaBpsDataResponseBodyBpsDataPerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
