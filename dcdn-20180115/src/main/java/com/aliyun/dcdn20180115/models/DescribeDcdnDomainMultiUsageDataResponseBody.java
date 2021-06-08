// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainMultiUsageDataResponseBody extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RequestPerInterval")
    public DescribeDcdnDomainMultiUsageDataResponseBodyRequestPerInterval requestPerInterval;

    @NameInMap("TrafficPerInterval")
    public DescribeDcdnDomainMultiUsageDataResponseBodyTrafficPerInterval trafficPerInterval;

    public static DescribeDcdnDomainMultiUsageDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainMultiUsageDataResponseBody self = new DescribeDcdnDomainMultiUsageDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainMultiUsageDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDcdnDomainMultiUsageDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDcdnDomainMultiUsageDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnDomainMultiUsageDataResponseBody setRequestPerInterval(DescribeDcdnDomainMultiUsageDataResponseBodyRequestPerInterval requestPerInterval) {
        this.requestPerInterval = requestPerInterval;
        return this;
    }
    public DescribeDcdnDomainMultiUsageDataResponseBodyRequestPerInterval getRequestPerInterval() {
        return this.requestPerInterval;
    }

    public DescribeDcdnDomainMultiUsageDataResponseBody setTrafficPerInterval(DescribeDcdnDomainMultiUsageDataResponseBodyTrafficPerInterval trafficPerInterval) {
        this.trafficPerInterval = trafficPerInterval;
        return this;
    }
    public DescribeDcdnDomainMultiUsageDataResponseBodyTrafficPerInterval getTrafficPerInterval() {
        return this.trafficPerInterval;
    }

    public static class DescribeDcdnDomainMultiUsageDataResponseBodyRequestPerIntervalRequestDataModule extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("TimeStamp")
        public String timeStamp;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("Request")
        public Long request;

        public static DescribeDcdnDomainMultiUsageDataResponseBodyRequestPerIntervalRequestDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainMultiUsageDataResponseBodyRequestPerIntervalRequestDataModule self = new DescribeDcdnDomainMultiUsageDataResponseBodyRequestPerIntervalRequestDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainMultiUsageDataResponseBodyRequestPerIntervalRequestDataModule setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDcdnDomainMultiUsageDataResponseBodyRequestPerIntervalRequestDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeDcdnDomainMultiUsageDataResponseBodyRequestPerIntervalRequestDataModule setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeDcdnDomainMultiUsageDataResponseBodyRequestPerIntervalRequestDataModule setRequest(Long request) {
            this.request = request;
            return this;
        }
        public Long getRequest() {
            return this.request;
        }

    }

    public static class DescribeDcdnDomainMultiUsageDataResponseBodyRequestPerInterval extends TeaModel {
        @NameInMap("RequestDataModule")
        public java.util.List<DescribeDcdnDomainMultiUsageDataResponseBodyRequestPerIntervalRequestDataModule> requestDataModule;

        public static DescribeDcdnDomainMultiUsageDataResponseBodyRequestPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainMultiUsageDataResponseBodyRequestPerInterval self = new DescribeDcdnDomainMultiUsageDataResponseBodyRequestPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainMultiUsageDataResponseBodyRequestPerInterval setRequestDataModule(java.util.List<DescribeDcdnDomainMultiUsageDataResponseBodyRequestPerIntervalRequestDataModule> requestDataModule) {
            this.requestDataModule = requestDataModule;
            return this;
        }
        public java.util.List<DescribeDcdnDomainMultiUsageDataResponseBodyRequestPerIntervalRequestDataModule> getRequestDataModule() {
            return this.requestDataModule;
        }

    }

    public static class DescribeDcdnDomainMultiUsageDataResponseBodyTrafficPerIntervalTrafficDataModule extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("TimeStamp")
        public String timeStamp;

        @NameInMap("Area")
        public String area;

        @NameInMap("Bps")
        public Float bps;

        public static DescribeDcdnDomainMultiUsageDataResponseBodyTrafficPerIntervalTrafficDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainMultiUsageDataResponseBodyTrafficPerIntervalTrafficDataModule self = new DescribeDcdnDomainMultiUsageDataResponseBodyTrafficPerIntervalTrafficDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainMultiUsageDataResponseBodyTrafficPerIntervalTrafficDataModule setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDcdnDomainMultiUsageDataResponseBodyTrafficPerIntervalTrafficDataModule setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeDcdnDomainMultiUsageDataResponseBodyTrafficPerIntervalTrafficDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeDcdnDomainMultiUsageDataResponseBodyTrafficPerIntervalTrafficDataModule setArea(String area) {
            this.area = area;
            return this;
        }
        public String getArea() {
            return this.area;
        }

        public DescribeDcdnDomainMultiUsageDataResponseBodyTrafficPerIntervalTrafficDataModule setBps(Float bps) {
            this.bps = bps;
            return this;
        }
        public Float getBps() {
            return this.bps;
        }

    }

    public static class DescribeDcdnDomainMultiUsageDataResponseBodyTrafficPerInterval extends TeaModel {
        @NameInMap("TrafficDataModule")
        public java.util.List<DescribeDcdnDomainMultiUsageDataResponseBodyTrafficPerIntervalTrafficDataModule> trafficDataModule;

        public static DescribeDcdnDomainMultiUsageDataResponseBodyTrafficPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainMultiUsageDataResponseBodyTrafficPerInterval self = new DescribeDcdnDomainMultiUsageDataResponseBodyTrafficPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainMultiUsageDataResponseBodyTrafficPerInterval setTrafficDataModule(java.util.List<DescribeDcdnDomainMultiUsageDataResponseBodyTrafficPerIntervalTrafficDataModule> trafficDataModule) {
            this.trafficDataModule = trafficDataModule;
            return this;
        }
        public java.util.List<DescribeDcdnDomainMultiUsageDataResponseBodyTrafficPerIntervalTrafficDataModule> getTrafficDataModule() {
            return this.trafficDataModule;
        }

    }

}
