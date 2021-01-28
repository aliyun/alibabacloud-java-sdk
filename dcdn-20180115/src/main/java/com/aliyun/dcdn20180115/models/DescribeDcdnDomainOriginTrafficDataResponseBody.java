// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainOriginTrafficDataResponseBody extends TeaModel {
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

    @NameInMap("OriginTrafficDataPerInterval")
    public DescribeDcdnDomainOriginTrafficDataResponseBodyOriginTrafficDataPerInterval originTrafficDataPerInterval;

    public static DescribeDcdnDomainOriginTrafficDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainOriginTrafficDataResponseBody self = new DescribeDcdnDomainOriginTrafficDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainOriginTrafficDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDcdnDomainOriginTrafficDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnDomainOriginTrafficDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDcdnDomainOriginTrafficDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDcdnDomainOriginTrafficDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDcdnDomainOriginTrafficDataResponseBody setOriginTrafficDataPerInterval(DescribeDcdnDomainOriginTrafficDataResponseBodyOriginTrafficDataPerInterval originTrafficDataPerInterval) {
        this.originTrafficDataPerInterval = originTrafficDataPerInterval;
        return this;
    }
    public DescribeDcdnDomainOriginTrafficDataResponseBodyOriginTrafficDataPerInterval getOriginTrafficDataPerInterval() {
        return this.originTrafficDataPerInterval;
    }

    public static class DescribeDcdnDomainOriginTrafficDataResponseBodyOriginTrafficDataPerIntervalDataModule extends TeaModel {
        @NameInMap("DynamicHttpOriginTraffic")
        public Float dynamicHttpOriginTraffic;

        @NameInMap("StaticHttpsOriginTraffic")
        public Float staticHttpsOriginTraffic;

        @NameInMap("OriginTraffic")
        public Float originTraffic;

        @NameInMap("StaticHttpOriginTraffic")
        public Float staticHttpOriginTraffic;

        @NameInMap("DynamicHttpsOriginTraffic")
        public Float dynamicHttpsOriginTraffic;

        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeDcdnDomainOriginTrafficDataResponseBodyOriginTrafficDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainOriginTrafficDataResponseBodyOriginTrafficDataPerIntervalDataModule self = new DescribeDcdnDomainOriginTrafficDataResponseBodyOriginTrafficDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainOriginTrafficDataResponseBodyOriginTrafficDataPerIntervalDataModule setDynamicHttpOriginTraffic(Float dynamicHttpOriginTraffic) {
            this.dynamicHttpOriginTraffic = dynamicHttpOriginTraffic;
            return this;
        }
        public Float getDynamicHttpOriginTraffic() {
            return this.dynamicHttpOriginTraffic;
        }

        public DescribeDcdnDomainOriginTrafficDataResponseBodyOriginTrafficDataPerIntervalDataModule setStaticHttpsOriginTraffic(Float staticHttpsOriginTraffic) {
            this.staticHttpsOriginTraffic = staticHttpsOriginTraffic;
            return this;
        }
        public Float getStaticHttpsOriginTraffic() {
            return this.staticHttpsOriginTraffic;
        }

        public DescribeDcdnDomainOriginTrafficDataResponseBodyOriginTrafficDataPerIntervalDataModule setOriginTraffic(Float originTraffic) {
            this.originTraffic = originTraffic;
            return this;
        }
        public Float getOriginTraffic() {
            return this.originTraffic;
        }

        public DescribeDcdnDomainOriginTrafficDataResponseBodyOriginTrafficDataPerIntervalDataModule setStaticHttpOriginTraffic(Float staticHttpOriginTraffic) {
            this.staticHttpOriginTraffic = staticHttpOriginTraffic;
            return this;
        }
        public Float getStaticHttpOriginTraffic() {
            return this.staticHttpOriginTraffic;
        }

        public DescribeDcdnDomainOriginTrafficDataResponseBodyOriginTrafficDataPerIntervalDataModule setDynamicHttpsOriginTraffic(Float dynamicHttpsOriginTraffic) {
            this.dynamicHttpsOriginTraffic = dynamicHttpsOriginTraffic;
            return this;
        }
        public Float getDynamicHttpsOriginTraffic() {
            return this.dynamicHttpsOriginTraffic;
        }

        public DescribeDcdnDomainOriginTrafficDataResponseBodyOriginTrafficDataPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeDcdnDomainOriginTrafficDataResponseBodyOriginTrafficDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeDcdnDomainOriginTrafficDataResponseBodyOriginTrafficDataPerIntervalDataModule> dataModule;

        public static DescribeDcdnDomainOriginTrafficDataResponseBodyOriginTrafficDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainOriginTrafficDataResponseBodyOriginTrafficDataPerInterval self = new DescribeDcdnDomainOriginTrafficDataResponseBodyOriginTrafficDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainOriginTrafficDataResponseBodyOriginTrafficDataPerInterval setDataModule(java.util.List<DescribeDcdnDomainOriginTrafficDataResponseBodyOriginTrafficDataPerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeDcdnDomainOriginTrafficDataResponseBodyOriginTrafficDataPerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
