// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainMultiUsageDataResponseBody extends TeaModel {
    /**
     * <p>The end of the time range that was queried.</p>
     * 
     * <strong>example:</strong>
     * <p>2017-12-10T21:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>3C6CCEC4-6B88-4D4A-93E4-D47B3D92CF8F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about requests collected every 5 minutes.</p>
     */
    @NameInMap("RequestPerInterval")
    public DescribeDomainMultiUsageDataResponseBodyRequestPerInterval requestPerInterval;

    /**
     * <p>The start of the time range that was queried.</p>
     * 
     * <strong>example:</strong>
     * <p>2017-12-10T20:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The statistics of network traffic collected every 5 minutes.</p>
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
         * <p>The accelerated domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The number of requests.</p>
         * 
         * <strong>example:</strong>
         * <p>11288111</p>
         */
        @NameInMap("Request")
        public Long request;

        /**
         * <p>The timestamp of the returned number of requests.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-12-10T20:00:00Z</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        /**
         * <p>The type.</p>
         * <blockquote>
         * <p> The value is Simple for Alibaba Cloud CDN.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Simple</p>
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
         * <p>The name of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("Area")
        public String area;

        /**
         * <p>The bandwidth. Unit: bit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>11288111.1</p>
         */
        @NameInMap("Bps")
        public Float bps;

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The startstamp of the returned usage data.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-12-10T20:00:00Z</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        /**
         * <p>The type of requests. Valid values:</p>
         * <ul>
         * <li><strong>StaticHttps</strong>: static HTTPS requests</li>
         * <li><strong>DynamicHttps</strong>: dynamic HTTPS requests</li>
         * <li><strong>DynamicHttp</strong>: dynamic HTTP requests</li>
         * <li><strong>StaticQuic</strong>: static QUIC requests</li>
         * <li><strong>DynamicQuic</strong>: dynamic QUIC requests</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DynamicHttp</p>
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
