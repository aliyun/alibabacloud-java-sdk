// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainRegionDataResponseBody extends TeaModel {
    /**
     * <p>The average response time. Unit: milliseconds.</p>
     */
    @NameInMap("DataInterval")
    public String dataInterval;

    /**
     * <p>The average response speed. Unit: byte/s.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The total amount of network traffic.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The region.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The name of the region.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The proportion of requests from the specified region based on the total number of requests in percentile. For example, a value of 90 indicates that 90% of the requests were coming from the specified region.</p>
     */
    @NameInMap("Value")
    public DescribeDcdnDomainRegionDataResponseBodyValue value;

    public static DescribeDcdnDomainRegionDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainRegionDataResponseBody self = new DescribeDcdnDomainRegionDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainRegionDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDcdnDomainRegionDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDcdnDomainRegionDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDcdnDomainRegionDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnDomainRegionDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDcdnDomainRegionDataResponseBody setValue(DescribeDcdnDomainRegionDataResponseBodyValue value) {
        this.value = value;
        return this;
    }
    public DescribeDcdnDomainRegionDataResponseBodyValue getValue() {
        return this.value;
    }

    public static class DescribeDcdnDomainRegionDataResponseBodyValueRegionProportionData extends TeaModel {
        @NameInMap("AvgObjectSize")
        public String avgObjectSize;

        @NameInMap("AvgResponseRate")
        public String avgResponseRate;

        @NameInMap("AvgResponseTime")
        public String avgResponseTime;

        @NameInMap("Bps")
        public String bps;

        @NameInMap("BytesProportion")
        public String bytesProportion;

        @NameInMap("Proportion")
        public String proportion;

        /**
         * <p>The average response size. Unit: bytes.</p>
         */
        @NameInMap("Qps")
        public String qps;

        @NameInMap("Region")
        public String region;

        /**
         * <p>> </p>
         * <p>*   If you do not specify the StartTime or EndTime parameters, the data within the last 24 hours is queried by default.</p>
         * <p>*   If you specify the StartTime and EndTime parameters, the data within the specified time range is queried.</p>
         * <p>*   The maximum number of times that each user can call this operation per second is 100.</p>
         */
        @NameInMap("RegionEname")
        public String regionEname;

        /**
         * <p>The proportion of network traffic occupied by the specified region based on the total amount of network traffic in percentile. For example, a value of 90 indicates that 90% of the network traffic was coming from the specified region.</p>
         */
        @NameInMap("TotalBytes")
        public String totalBytes;

        /**
         * <p>The bandwidth.</p>
         */
        @NameInMap("TotalQuery")
        public String totalQuery;

        public static DescribeDcdnDomainRegionDataResponseBodyValueRegionProportionData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainRegionDataResponseBodyValueRegionProportionData self = new DescribeDcdnDomainRegionDataResponseBodyValueRegionProportionData();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainRegionDataResponseBodyValueRegionProportionData setAvgObjectSize(String avgObjectSize) {
            this.avgObjectSize = avgObjectSize;
            return this;
        }
        public String getAvgObjectSize() {
            return this.avgObjectSize;
        }

        public DescribeDcdnDomainRegionDataResponseBodyValueRegionProportionData setAvgResponseRate(String avgResponseRate) {
            this.avgResponseRate = avgResponseRate;
            return this;
        }
        public String getAvgResponseRate() {
            return this.avgResponseRate;
        }

        public DescribeDcdnDomainRegionDataResponseBodyValueRegionProportionData setAvgResponseTime(String avgResponseTime) {
            this.avgResponseTime = avgResponseTime;
            return this;
        }
        public String getAvgResponseTime() {
            return this.avgResponseTime;
        }

        public DescribeDcdnDomainRegionDataResponseBodyValueRegionProportionData setBps(String bps) {
            this.bps = bps;
            return this;
        }
        public String getBps() {
            return this.bps;
        }

        public DescribeDcdnDomainRegionDataResponseBodyValueRegionProportionData setBytesProportion(String bytesProportion) {
            this.bytesProportion = bytesProportion;
            return this;
        }
        public String getBytesProportion() {
            return this.bytesProportion;
        }

        public DescribeDcdnDomainRegionDataResponseBodyValueRegionProportionData setProportion(String proportion) {
            this.proportion = proportion;
            return this;
        }
        public String getProportion() {
            return this.proportion;
        }

        public DescribeDcdnDomainRegionDataResponseBodyValueRegionProportionData setQps(String qps) {
            this.qps = qps;
            return this;
        }
        public String getQps() {
            return this.qps;
        }

        public DescribeDcdnDomainRegionDataResponseBodyValueRegionProportionData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeDcdnDomainRegionDataResponseBodyValueRegionProportionData setRegionEname(String regionEname) {
            this.regionEname = regionEname;
            return this;
        }
        public String getRegionEname() {
            return this.regionEname;
        }

        public DescribeDcdnDomainRegionDataResponseBodyValueRegionProportionData setTotalBytes(String totalBytes) {
            this.totalBytes = totalBytes;
            return this;
        }
        public String getTotalBytes() {
            return this.totalBytes;
        }

        public DescribeDcdnDomainRegionDataResponseBodyValueRegionProportionData setTotalQuery(String totalQuery) {
            this.totalQuery = totalQuery;
            return this;
        }
        public String getTotalQuery() {
            return this.totalQuery;
        }

    }

    public static class DescribeDcdnDomainRegionDataResponseBodyValue extends TeaModel {
        @NameInMap("RegionProportionData")
        public java.util.List<DescribeDcdnDomainRegionDataResponseBodyValueRegionProportionData> regionProportionData;

        public static DescribeDcdnDomainRegionDataResponseBodyValue build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainRegionDataResponseBodyValue self = new DescribeDcdnDomainRegionDataResponseBodyValue();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainRegionDataResponseBodyValue setRegionProportionData(java.util.List<DescribeDcdnDomainRegionDataResponseBodyValueRegionProportionData> regionProportionData) {
            this.regionProportionData = regionProportionData;
            return this;
        }
        public java.util.List<DescribeDcdnDomainRegionDataResponseBodyValueRegionProportionData> getRegionProportionData() {
            return this.regionProportionData;
        }

    }

}
