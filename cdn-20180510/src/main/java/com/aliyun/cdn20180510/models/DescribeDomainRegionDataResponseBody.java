// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainRegionDataResponseBody extends TeaModel {
    /**
     * <p>The average response time. Unit: milliseconds.</p>
     */
    @NameInMap("DataInterval")
    public String dataInterval;

    /**
     * <p>The average response speed. Unit: bit/s.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The proportions of requests initiated from each area.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The total traffic. Unit: bytes.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of requests.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The request error rate. A value of 90 indicates that 90% of the requests encountered errors.</p>
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
         * <p>cn-shenzhen</p>
         */
        @NameInMap("AvgObjectSize")
        public String avgObjectSize;

        /**
         * <p>The number of queries per second.</p>
         */
        @NameInMap("AvgResponseRate")
        public String avgResponseRate;

        /**
         * <p>The name of the region.</p>
         */
        @NameInMap("AvgResponseTime")
        public String avgResponseTime;

        /**
         * <p>The proportion of visits from each region. For example, a value of 90 indicates that 90% of the visits are from the specified area.</p>
         */
        @NameInMap("Bps")
        public String bps;

        /**
         * <p>The accelerated domain name.</p>
         */
        @NameInMap("BytesProportion")
        public String bytesProportion;

        /**
         * <p>The request error rate. A value of 90 indicates that 90% of the requests encountered errors.</p>
         */
        @NameInMap("Proportion")
        public String proportion;

        /**
         * <p>The proportion of bytes transferred from each region. For example, a value of 90 indicates that 90% of the bytes are transferred from the specified area.</p>
         */
        @NameInMap("Qps")
        public String qps;

        /**
         * <p>The start of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The statistical analytics feature of Alibaba Cloud CDN is discontinued. The API operations related to the statistical analytics feature are no longer maintained. We recommend that you do not use the API operations because data may be missing or inaccurate. You can use the [operations report](https://www.alibabacloud.com/help/en/alibaba-cloud-cdn/latest/customize-an-operations-report-template-and-create-a-tracking-task) feature to for data analysis.  </p>
         * <br>
         * <p>> - If you do not set **StartTime** or **EndTime**, data collected within the last **24** hours is queried. If you set both **StartTime** and **EndTime**, data collected within the specified time range is queried.</p>
         * <p>- You may fail to query the latest data. If you need to query data collected within the last day, we recommend that you query the data on the next day.</p>
         * <p>- You can call this operation up to 100 times per second per account.</p>
         */
        @NameInMap("RegionEname")
        public String regionEname;

        /**
         * <p>The information of the regions.</p>
         */
        @NameInMap("ReqErrRate")
        public String reqErrRate;

        /**
         * <p>The bandwidth.</p>
         */
        @NameInMap("TotalBytes")
        public String totalBytes;

        /**
         * <p>The average response size. Unit: bytes.</p>
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
