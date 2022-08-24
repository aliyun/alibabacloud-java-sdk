// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnIpaDomainMultiUsageDataResponseBody extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("TrafficPerInterval")
    public DescribeDcdnIpaDomainMultiUsageDataResponseBodyTrafficPerInterval trafficPerInterval;

    public static DescribeDcdnIpaDomainMultiUsageDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnIpaDomainMultiUsageDataResponseBody self = new DescribeDcdnIpaDomainMultiUsageDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnIpaDomainMultiUsageDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDcdnIpaDomainMultiUsageDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnIpaDomainMultiUsageDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDcdnIpaDomainMultiUsageDataResponseBody setTrafficPerInterval(DescribeDcdnIpaDomainMultiUsageDataResponseBodyTrafficPerInterval trafficPerInterval) {
        this.trafficPerInterval = trafficPerInterval;
        return this;
    }
    public DescribeDcdnIpaDomainMultiUsageDataResponseBodyTrafficPerInterval getTrafficPerInterval() {
        return this.trafficPerInterval;
    }

    public static class DescribeDcdnIpaDomainMultiUsageDataResponseBodyTrafficPerIntervalTrafficDataModule extends TeaModel {
        @NameInMap("Area")
        public String area;

        @NameInMap("Bps")
        public Float bps;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeDcdnIpaDomainMultiUsageDataResponseBodyTrafficPerIntervalTrafficDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnIpaDomainMultiUsageDataResponseBodyTrafficPerIntervalTrafficDataModule self = new DescribeDcdnIpaDomainMultiUsageDataResponseBodyTrafficPerIntervalTrafficDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnIpaDomainMultiUsageDataResponseBodyTrafficPerIntervalTrafficDataModule setArea(String area) {
            this.area = area;
            return this;
        }
        public String getArea() {
            return this.area;
        }

        public DescribeDcdnIpaDomainMultiUsageDataResponseBodyTrafficPerIntervalTrafficDataModule setBps(Float bps) {
            this.bps = bps;
            return this;
        }
        public Float getBps() {
            return this.bps;
        }

        public DescribeDcdnIpaDomainMultiUsageDataResponseBodyTrafficPerIntervalTrafficDataModule setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeDcdnIpaDomainMultiUsageDataResponseBodyTrafficPerIntervalTrafficDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeDcdnIpaDomainMultiUsageDataResponseBodyTrafficPerInterval extends TeaModel {
        @NameInMap("TrafficDataModule")
        public java.util.List<DescribeDcdnIpaDomainMultiUsageDataResponseBodyTrafficPerIntervalTrafficDataModule> trafficDataModule;

        public static DescribeDcdnIpaDomainMultiUsageDataResponseBodyTrafficPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnIpaDomainMultiUsageDataResponseBodyTrafficPerInterval self = new DescribeDcdnIpaDomainMultiUsageDataResponseBodyTrafficPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnIpaDomainMultiUsageDataResponseBodyTrafficPerInterval setTrafficDataModule(java.util.List<DescribeDcdnIpaDomainMultiUsageDataResponseBodyTrafficPerIntervalTrafficDataModule> trafficDataModule) {
            this.trafficDataModule = trafficDataModule;
            return this;
        }
        public java.util.List<DescribeDcdnIpaDomainMultiUsageDataResponseBodyTrafficPerIntervalTrafficDataModule> getTrafficDataModule() {
            return this.trafficDataModule;
        }

    }

}
