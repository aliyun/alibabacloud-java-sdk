// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainMultiUsageDataResponseBody extends TeaModel {
    /**
     * <p>The end of the time range that was queried.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about requests collected every 5 minutes.</p>
     */
    @NameInMap("RequestPerInterval")
    public DescribeDomainMultiUsageDataResponseBodyRequestPerInterval requestPerInterval;

    /**
     * <p>The beginning of the time range that was queried.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The statistics about data transfer collected every 5 minutes.</p>
     */
    @NameInMap("TrafficPerInterval")
    public DescribeDomainMultiUsageDataResponseBodyTrafficPerInterval trafficPerInterval;

    public static DescribeDomainMultiUsageDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainMultiUsageDataResponseBody self = new DescribeDomainMultiUsageDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainMultiUsageDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainMultiUsageDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainMultiUsageDataResponseBody setRequestPerInterval(DescribeDomainMultiUsageDataResponseBodyRequestPerInterval requestPerInterval) {
        this.requestPerInterval = requestPerInterval;
        return this;
    }
    public DescribeDomainMultiUsageDataResponseBodyRequestPerInterval getRequestPerInterval() {
        return this.requestPerInterval;
    }

    public DescribeDomainMultiUsageDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDomainMultiUsageDataResponseBody setTrafficPerInterval(DescribeDomainMultiUsageDataResponseBodyTrafficPerInterval trafficPerInterval) {
        this.trafficPerInterval = trafficPerInterval;
        return this;
    }
    public DescribeDomainMultiUsageDataResponseBodyTrafficPerInterval getTrafficPerInterval() {
        return this.trafficPerInterval;
    }

    public static class DescribeDomainMultiUsageDataResponseBodyRequestPerIntervalRequestDataModule extends TeaModel {
        /**
         * <p>The information about the accelerated domain name.</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The number of requests.</p>
         */
        @NameInMap("Request")
        public Long request;

        /**
         * <p>The timestamp of the data returned.</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        /**
         * <p>The type of data returned.</p>
         * <br>
         * <p>>  For Alibaba Cloud CDN, the valid value is Simple.</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeDomainMultiUsageDataResponseBodyRequestPerIntervalRequestDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainMultiUsageDataResponseBodyRequestPerIntervalRequestDataModule self = new DescribeDomainMultiUsageDataResponseBodyRequestPerIntervalRequestDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeDomainMultiUsageDataResponseBodyRequestPerIntervalRequestDataModule setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeDomainMultiUsageDataResponseBodyRequestPerIntervalRequestDataModule setRequest(Long request) {
            this.request = request;
            return this;
        }
        public Long getRequest() {
            return this.request;
        }

        public DescribeDomainMultiUsageDataResponseBodyRequestPerIntervalRequestDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeDomainMultiUsageDataResponseBodyRequestPerIntervalRequestDataModule setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeDomainMultiUsageDataResponseBodyRequestPerInterval extends TeaModel {
        @NameInMap("RequestDataModule")
        public java.util.List<DescribeDomainMultiUsageDataResponseBodyRequestPerIntervalRequestDataModule> requestDataModule;

        public static DescribeDomainMultiUsageDataResponseBodyRequestPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainMultiUsageDataResponseBodyRequestPerInterval self = new DescribeDomainMultiUsageDataResponseBodyRequestPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeDomainMultiUsageDataResponseBodyRequestPerInterval setRequestDataModule(java.util.List<DescribeDomainMultiUsageDataResponseBodyRequestPerIntervalRequestDataModule> requestDataModule) {
            this.requestDataModule = requestDataModule;
            return this;
        }
        public java.util.List<DescribeDomainMultiUsageDataResponseBodyRequestPerIntervalRequestDataModule> getRequestDataModule() {
            return this.requestDataModule;
        }

    }

    public static class DescribeDomainMultiUsageDataResponseBodyTrafficPerIntervalTrafficDataModule extends TeaModel {
        /**
         * <p>The name of the district.</p>
         */
        @NameInMap("Area")
        public String area;

        /**
         * <p>The bandwidth. Unit: bit/s.</p>
         */
        @NameInMap("Bps")
        public Float bps;

        /**
         * <p>The accelerated domain name.</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The timestamp of the data returned.</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        /**
         * <p>The type of data returned. Valid values:</p>
         * <br>
         * <p>- **StaticHttps**: the number of HTTPS requests for static content.</p>
         * <p>- **DynamicHttps**: the number of HTTPS requests for dynamic content.</p>
         * <p>- **DynamicHttp**: the number of HTTP requests for dynamic content.</p>
         * <p>- **StaticQuic**: the number of QUIC requests for static content.</p>
         * <p>- **DynamicQuic**: the number of QUIC requests for dynamic content.</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeDomainMultiUsageDataResponseBodyTrafficPerIntervalTrafficDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainMultiUsageDataResponseBodyTrafficPerIntervalTrafficDataModule self = new DescribeDomainMultiUsageDataResponseBodyTrafficPerIntervalTrafficDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeDomainMultiUsageDataResponseBodyTrafficPerIntervalTrafficDataModule setArea(String area) {
            this.area = area;
            return this;
        }
        public String getArea() {
            return this.area;
        }

        public DescribeDomainMultiUsageDataResponseBodyTrafficPerIntervalTrafficDataModule setBps(Float bps) {
            this.bps = bps;
            return this;
        }
        public Float getBps() {
            return this.bps;
        }

        public DescribeDomainMultiUsageDataResponseBodyTrafficPerIntervalTrafficDataModule setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeDomainMultiUsageDataResponseBodyTrafficPerIntervalTrafficDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeDomainMultiUsageDataResponseBodyTrafficPerIntervalTrafficDataModule setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeDomainMultiUsageDataResponseBodyTrafficPerInterval extends TeaModel {
        @NameInMap("TrafficDataModule")
        public java.util.List<DescribeDomainMultiUsageDataResponseBodyTrafficPerIntervalTrafficDataModule> trafficDataModule;

        public static DescribeDomainMultiUsageDataResponseBodyTrafficPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainMultiUsageDataResponseBodyTrafficPerInterval self = new DescribeDomainMultiUsageDataResponseBodyTrafficPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeDomainMultiUsageDataResponseBodyTrafficPerInterval setTrafficDataModule(java.util.List<DescribeDomainMultiUsageDataResponseBodyTrafficPerIntervalTrafficDataModule> trafficDataModule) {
            this.trafficDataModule = trafficDataModule;
            return this;
        }
        public java.util.List<DescribeDomainMultiUsageDataResponseBodyTrafficPerIntervalTrafficDataModule> getTrafficDataModule() {
            return this.trafficDataModule;
        }

    }

}
