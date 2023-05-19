// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainRegionDataResponseBody extends TeaModel {
    /**
     * <p>The proportion of visits from each region. For example, a value of 90 indicates that 90% of the visits are from the specified area.</p>
     */
    @NameInMap("DataInterval")
    public String dataInterval;

    /**
     * <p>The accelerated domain name. Separate multiple accelerated domain names with commas (,).  </p>
     * <br>
     * <p>By default, this operation queries the geographic distribution of users for all accelerated domain names.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The number of queries per second.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The name of the region.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The end of the time range that was queried.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The average response speed. Unit: bit/s.</p>
     */
    @NameInMap("Value")
    public DescribeDomainRegionDataResponseBodyValue value;

    public static DescribeDomainRegionDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainRegionDataResponseBody self = new DescribeDomainRegionDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainRegionDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDomainRegionDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainRegionDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainRegionDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainRegionDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDomainRegionDataResponseBody setValue(DescribeDomainRegionDataResponseBodyValue value) {
        this.value = value;
        return this;
    }
    public DescribeDomainRegionDataResponseBodyValue getValue() {
        return this.value;
    }

    public static class DescribeDomainRegionDataResponseBodyValueRegionProportionData extends TeaModel {
        /**
         * <p>The bandwidth.</p>
         */
        @NameInMap("AvgObjectSize")
        public String avgObjectSize;

        /**
         * <p>The beginning of the time range that was queried.</p>
         */
        @NameInMap("AvgResponseRate")
        public String avgResponseRate;

        /**
         * <p>The average response time. Unit: milliseconds.</p>
         */
        @NameInMap("AvgResponseTime")
        public String avgResponseTime;

        /**
         * <p>The average response size. Unit: bytes.</p>
         */
        @NameInMap("Bps")
        public String bps;

        @NameInMap("BytesProportion")
        public String bytesProportion;

        @NameInMap("Proportion")
        public String proportion;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("Qps")
        public String qps;

        /**
         * <p>DescribeDomainRegionData</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>Queries the geographic distribution of users. The data is collected at an interval of 1 day. You can query data collected within the last 90 days.</p>
         */
        @NameInMap("RegionEname")
        public String regionEname;

        /**
         * <p>The time interval between the data entries returned. Unit: seconds.</p>
         */
        @NameInMap("ReqErrRate")
        public String reqErrRate;

        /**
         * <p>The total number of requests.</p>
         */
        @NameInMap("TotalBytes")
        public String totalBytes;

        /**
         * <p>The proportions of requests initiated from each area.</p>
         */
        @NameInMap("TotalQuery")
        public String totalQuery;

        public static DescribeDomainRegionDataResponseBodyValueRegionProportionData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainRegionDataResponseBodyValueRegionProportionData self = new DescribeDomainRegionDataResponseBodyValueRegionProportionData();
            return TeaModel.build(map, self);
        }

        public DescribeDomainRegionDataResponseBodyValueRegionProportionData setAvgObjectSize(String avgObjectSize) {
            this.avgObjectSize = avgObjectSize;
            return this;
        }
        public String getAvgObjectSize() {
            return this.avgObjectSize;
        }

        public DescribeDomainRegionDataResponseBodyValueRegionProportionData setAvgResponseRate(String avgResponseRate) {
            this.avgResponseRate = avgResponseRate;
            return this;
        }
        public String getAvgResponseRate() {
            return this.avgResponseRate;
        }

        public DescribeDomainRegionDataResponseBodyValueRegionProportionData setAvgResponseTime(String avgResponseTime) {
            this.avgResponseTime = avgResponseTime;
            return this;
        }
        public String getAvgResponseTime() {
            return this.avgResponseTime;
        }

        public DescribeDomainRegionDataResponseBodyValueRegionProportionData setBps(String bps) {
            this.bps = bps;
            return this;
        }
        public String getBps() {
            return this.bps;
        }

        public DescribeDomainRegionDataResponseBodyValueRegionProportionData setBytesProportion(String bytesProportion) {
            this.bytesProportion = bytesProportion;
            return this;
        }
        public String getBytesProportion() {
            return this.bytesProportion;
        }

        public DescribeDomainRegionDataResponseBodyValueRegionProportionData setProportion(String proportion) {
            this.proportion = proportion;
            return this;
        }
        public String getProportion() {
            return this.proportion;
        }

        public DescribeDomainRegionDataResponseBodyValueRegionProportionData setQps(String qps) {
            this.qps = qps;
            return this;
        }
        public String getQps() {
            return this.qps;
        }

        public DescribeDomainRegionDataResponseBodyValueRegionProportionData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeDomainRegionDataResponseBodyValueRegionProportionData setRegionEname(String regionEname) {
            this.regionEname = regionEname;
            return this;
        }
        public String getRegionEname() {
            return this.regionEname;
        }

        public DescribeDomainRegionDataResponseBodyValueRegionProportionData setReqErrRate(String reqErrRate) {
            this.reqErrRate = reqErrRate;
            return this;
        }
        public String getReqErrRate() {
            return this.reqErrRate;
        }

        public DescribeDomainRegionDataResponseBodyValueRegionProportionData setTotalBytes(String totalBytes) {
            this.totalBytes = totalBytes;
            return this;
        }
        public String getTotalBytes() {
            return this.totalBytes;
        }

        public DescribeDomainRegionDataResponseBodyValueRegionProportionData setTotalQuery(String totalQuery) {
            this.totalQuery = totalQuery;
            return this;
        }
        public String getTotalQuery() {
            return this.totalQuery;
        }

    }

    public static class DescribeDomainRegionDataResponseBodyValue extends TeaModel {
        @NameInMap("RegionProportionData")
        public java.util.List<DescribeDomainRegionDataResponseBodyValueRegionProportionData> regionProportionData;

        public static DescribeDomainRegionDataResponseBodyValue build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainRegionDataResponseBodyValue self = new DescribeDomainRegionDataResponseBodyValue();
            return TeaModel.build(map, self);
        }

        public DescribeDomainRegionDataResponseBodyValue setRegionProportionData(java.util.List<DescribeDomainRegionDataResponseBodyValueRegionProportionData> regionProportionData) {
            this.regionProportionData = regionProportionData;
            return this;
        }
        public java.util.List<DescribeDomainRegionDataResponseBodyValueRegionProportionData> getRegionProportionData() {
            return this.regionProportionData;
        }

    }

}
