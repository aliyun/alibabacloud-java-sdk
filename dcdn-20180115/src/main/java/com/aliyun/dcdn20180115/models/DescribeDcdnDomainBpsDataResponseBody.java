// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainBpsDataResponseBody extends TeaModel {
    @NameInMap("BpsDataPerInterval")
    public DescribeDcdnDomainBpsDataResponseBodyBpsDataPerInterval bpsDataPerInterval;

    @NameInMap("DataInterval")
    public String dataInterval;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDcdnDomainBpsDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainBpsDataResponseBody self = new DescribeDcdnDomainBpsDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainBpsDataResponseBody setBpsDataPerInterval(DescribeDcdnDomainBpsDataResponseBodyBpsDataPerInterval bpsDataPerInterval) {
        this.bpsDataPerInterval = bpsDataPerInterval;
        return this;
    }
    public DescribeDcdnDomainBpsDataResponseBodyBpsDataPerInterval getBpsDataPerInterval() {
        return this.bpsDataPerInterval;
    }

    public DescribeDcdnDomainBpsDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDcdnDomainBpsDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDcdnDomainBpsDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDcdnDomainBpsDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnDomainBpsDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeDcdnDomainBpsDataResponseBodyBpsDataPerIntervalDataModule extends TeaModel {
        @NameInMap("Bps")
        public Float bps;

        @NameInMap("DynamicHttpBps")
        public Float dynamicHttpBps;

        @NameInMap("DynamicHttpsBps")
        public Float dynamicHttpsBps;

        @NameInMap("StaticHttpBps")
        public Float staticHttpBps;

        @NameInMap("StaticHttpsBps")
        public Float staticHttpsBps;

        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeDcdnDomainBpsDataResponseBodyBpsDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainBpsDataResponseBodyBpsDataPerIntervalDataModule self = new DescribeDcdnDomainBpsDataResponseBodyBpsDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainBpsDataResponseBodyBpsDataPerIntervalDataModule setBps(Float bps) {
            this.bps = bps;
            return this;
        }
        public Float getBps() {
            return this.bps;
        }

        public DescribeDcdnDomainBpsDataResponseBodyBpsDataPerIntervalDataModule setDynamicHttpBps(Float dynamicHttpBps) {
            this.dynamicHttpBps = dynamicHttpBps;
            return this;
        }
        public Float getDynamicHttpBps() {
            return this.dynamicHttpBps;
        }

        public DescribeDcdnDomainBpsDataResponseBodyBpsDataPerIntervalDataModule setDynamicHttpsBps(Float dynamicHttpsBps) {
            this.dynamicHttpsBps = dynamicHttpsBps;
            return this;
        }
        public Float getDynamicHttpsBps() {
            return this.dynamicHttpsBps;
        }

        public DescribeDcdnDomainBpsDataResponseBodyBpsDataPerIntervalDataModule setStaticHttpBps(Float staticHttpBps) {
            this.staticHttpBps = staticHttpBps;
            return this;
        }
        public Float getStaticHttpBps() {
            return this.staticHttpBps;
        }

        public DescribeDcdnDomainBpsDataResponseBodyBpsDataPerIntervalDataModule setStaticHttpsBps(Float staticHttpsBps) {
            this.staticHttpsBps = staticHttpsBps;
            return this;
        }
        public Float getStaticHttpsBps() {
            return this.staticHttpsBps;
        }

        public DescribeDcdnDomainBpsDataResponseBodyBpsDataPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeDcdnDomainBpsDataResponseBodyBpsDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeDcdnDomainBpsDataResponseBodyBpsDataPerIntervalDataModule> dataModule;

        public static DescribeDcdnDomainBpsDataResponseBodyBpsDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainBpsDataResponseBodyBpsDataPerInterval self = new DescribeDcdnDomainBpsDataResponseBodyBpsDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainBpsDataResponseBodyBpsDataPerInterval setDataModule(java.util.List<DescribeDcdnDomainBpsDataResponseBodyBpsDataPerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeDcdnDomainBpsDataResponseBodyBpsDataPerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
