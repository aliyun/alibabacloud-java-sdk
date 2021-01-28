// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainTrafficDataResponseBody extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("TrafficDataPerInterval")
    public DescribeDcdnDomainTrafficDataResponseBodyTrafficDataPerInterval trafficDataPerInterval;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("DataInterval")
    public String dataInterval;

    public static DescribeDcdnDomainTrafficDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainTrafficDataResponseBody self = new DescribeDcdnDomainTrafficDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainTrafficDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDcdnDomainTrafficDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnDomainTrafficDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDcdnDomainTrafficDataResponseBody setTrafficDataPerInterval(DescribeDcdnDomainTrafficDataResponseBodyTrafficDataPerInterval trafficDataPerInterval) {
        this.trafficDataPerInterval = trafficDataPerInterval;
        return this;
    }
    public DescribeDcdnDomainTrafficDataResponseBodyTrafficDataPerInterval getTrafficDataPerInterval() {
        return this.trafficDataPerInterval;
    }

    public DescribeDcdnDomainTrafficDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDcdnDomainTrafficDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public static class DescribeDcdnDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule extends TeaModel {
        @NameInMap("StaticHttpTraffic")
        public Float staticHttpTraffic;

        @NameInMap("DynamicHttpsTraffic")
        public Float dynamicHttpsTraffic;

        @NameInMap("Traffic")
        public Float traffic;

        @NameInMap("DynamicHttpTraffic")
        public Float dynamicHttpTraffic;

        @NameInMap("TimeStamp")
        public String timeStamp;

        @NameInMap("StaticHttpsTraffic")
        public Float staticHttpsTraffic;

        public static DescribeDcdnDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule self = new DescribeDcdnDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule setStaticHttpTraffic(Float staticHttpTraffic) {
            this.staticHttpTraffic = staticHttpTraffic;
            return this;
        }
        public Float getStaticHttpTraffic() {
            return this.staticHttpTraffic;
        }

        public DescribeDcdnDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule setDynamicHttpsTraffic(Float dynamicHttpsTraffic) {
            this.dynamicHttpsTraffic = dynamicHttpsTraffic;
            return this;
        }
        public Float getDynamicHttpsTraffic() {
            return this.dynamicHttpsTraffic;
        }

        public DescribeDcdnDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule setTraffic(Float traffic) {
            this.traffic = traffic;
            return this;
        }
        public Float getTraffic() {
            return this.traffic;
        }

        public DescribeDcdnDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule setDynamicHttpTraffic(Float dynamicHttpTraffic) {
            this.dynamicHttpTraffic = dynamicHttpTraffic;
            return this;
        }
        public Float getDynamicHttpTraffic() {
            return this.dynamicHttpTraffic;
        }

        public DescribeDcdnDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeDcdnDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule setStaticHttpsTraffic(Float staticHttpsTraffic) {
            this.staticHttpsTraffic = staticHttpsTraffic;
            return this;
        }
        public Float getStaticHttpsTraffic() {
            return this.staticHttpsTraffic;
        }

    }

    public static class DescribeDcdnDomainTrafficDataResponseBodyTrafficDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeDcdnDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule> dataModule;

        public static DescribeDcdnDomainTrafficDataResponseBodyTrafficDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainTrafficDataResponseBodyTrafficDataPerInterval self = new DescribeDcdnDomainTrafficDataResponseBodyTrafficDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainTrafficDataResponseBodyTrafficDataPerInterval setDataModule(java.util.List<DescribeDcdnDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeDcdnDomainTrafficDataResponseBodyTrafficDataPerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
