// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainIspDataResponseBody extends TeaModel {
    /**
     * <p>The total amount of network traffic.</p>
     */
    @NameInMap("DataInterval")
    public String dataInterval;

    /**
     * <p>The total number of requests.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The time interval between the data entries returned. Unit: seconds.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The number of queries per second.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The access statistics by ISP.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The average response speed. Unit: byte/ms.</p>
     */
    @NameInMap("Value")
    public DescribeDcdnDomainIspDataResponseBodyValue value;

    public static DescribeDcdnDomainIspDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainIspDataResponseBody self = new DescribeDcdnDomainIspDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainIspDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDcdnDomainIspDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDcdnDomainIspDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDcdnDomainIspDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnDomainIspDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDcdnDomainIspDataResponseBody setValue(DescribeDcdnDomainIspDataResponseBodyValue value) {
        this.value = value;
        return this;
    }
    public DescribeDcdnDomainIspDataResponseBodyValue getValue() {
        return this.value;
    }

    public static class DescribeDcdnDomainIspDataResponseBodyValueIspProportionData extends TeaModel {
        /**
         * <p>The proportion of network traffic. For example, a value of 90 indicates that 90% of network traffic was coming from the specified ISP.</p>
         */
        @NameInMap("AvgObjectSize")
        public String avgObjectSize;

        /**
         * <p>The name of the ISP.</p>
         */
        @NameInMap("AvgResponseRate")
        public String avgResponseRate;

        /**
         * <p>The bandwidth.</p>
         */
        @NameInMap("AvgResponseTime")
        public String avgResponseTime;

        /**
         * <p>The information about the ISP.</p>
         */
        @NameInMap("Bps")
        public String bps;

        /**
         * <p>The total amount of network traffic.</p>
         */
        @NameInMap("BytesProportion")
        public String bytesProportion;

        /**
         * <p>The name of the ISP.</p>
         */
        @NameInMap("Isp")
        public String isp;

        /**
         * <p>> </p>
         * <p>*   You can call this operation up to 100 times per second.</p>
         * <p>*   If **StartTime** is set but **EndTime** is not set, the data within the hour that starts from **StartTime** is queried.</p>
         * <p>*   If **EndTime** is set but **StartTime** is not set, the data within the last hour that precedes **EndTime** is queried.</p>
         * <p>*   You can query data of a domain name or all domain names that belong to your account.</p>
         * <p>*   You can view data that is collected over the last seven days. The interval at which data is queried is based on the time range specified by **StartTime** and **EndTime**.</p>
         * <p>    *   **If the time range is shorter than or equal to one hour**, data is queried every minute.</p>
         * <p>    *   **If the time range is longer than 1 hour but shorter than or equal to three days**, data is queried every five minutes.</p>
         * <p>    *   **If the time range is longer than three days but shorter than or equal to seven days**, data is queried every hour.</p>
         */
        @NameInMap("IspEname")
        public String ispEname;

        /**
         * <p>The information about the ISP.</p>
         */
        @NameInMap("Proportion")
        public String proportion;

        /**
         * <p>The average response time. Unit: milliseconds.</p>
         */
        @NameInMap("Qps")
        public String qps;

        /**
         * <p>The average response size. Unit: bytes.</p>
         */
        @NameInMap("TotalBytes")
        public String totalBytes;

        /**
         * <p>The proportion of requests.</p>
         */
        @NameInMap("TotalQuery")
        public String totalQuery;

        public static DescribeDcdnDomainIspDataResponseBodyValueIspProportionData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainIspDataResponseBodyValueIspProportionData self = new DescribeDcdnDomainIspDataResponseBodyValueIspProportionData();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainIspDataResponseBodyValueIspProportionData setAvgObjectSize(String avgObjectSize) {
            this.avgObjectSize = avgObjectSize;
            return this;
        }
        public String getAvgObjectSize() {
            return this.avgObjectSize;
        }

        public DescribeDcdnDomainIspDataResponseBodyValueIspProportionData setAvgResponseRate(String avgResponseRate) {
            this.avgResponseRate = avgResponseRate;
            return this;
        }
        public String getAvgResponseRate() {
            return this.avgResponseRate;
        }

        public DescribeDcdnDomainIspDataResponseBodyValueIspProportionData setAvgResponseTime(String avgResponseTime) {
            this.avgResponseTime = avgResponseTime;
            return this;
        }
        public String getAvgResponseTime() {
            return this.avgResponseTime;
        }

        public DescribeDcdnDomainIspDataResponseBodyValueIspProportionData setBps(String bps) {
            this.bps = bps;
            return this;
        }
        public String getBps() {
            return this.bps;
        }

        public DescribeDcdnDomainIspDataResponseBodyValueIspProportionData setBytesProportion(String bytesProportion) {
            this.bytesProportion = bytesProportion;
            return this;
        }
        public String getBytesProportion() {
            return this.bytesProportion;
        }

        public DescribeDcdnDomainIspDataResponseBodyValueIspProportionData setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

        public DescribeDcdnDomainIspDataResponseBodyValueIspProportionData setIspEname(String ispEname) {
            this.ispEname = ispEname;
            return this;
        }
        public String getIspEname() {
            return this.ispEname;
        }

        public DescribeDcdnDomainIspDataResponseBodyValueIspProportionData setProportion(String proportion) {
            this.proportion = proportion;
            return this;
        }
        public String getProportion() {
            return this.proportion;
        }

        public DescribeDcdnDomainIspDataResponseBodyValueIspProportionData setQps(String qps) {
            this.qps = qps;
            return this;
        }
        public String getQps() {
            return this.qps;
        }

        public DescribeDcdnDomainIspDataResponseBodyValueIspProportionData setTotalBytes(String totalBytes) {
            this.totalBytes = totalBytes;
            return this;
        }
        public String getTotalBytes() {
            return this.totalBytes;
        }

        public DescribeDcdnDomainIspDataResponseBodyValueIspProportionData setTotalQuery(String totalQuery) {
            this.totalQuery = totalQuery;
            return this;
        }
        public String getTotalQuery() {
            return this.totalQuery;
        }

    }

    public static class DescribeDcdnDomainIspDataResponseBodyValue extends TeaModel {
        @NameInMap("IspProportionData")
        public java.util.List<DescribeDcdnDomainIspDataResponseBodyValueIspProportionData> ispProportionData;

        public static DescribeDcdnDomainIspDataResponseBodyValue build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainIspDataResponseBodyValue self = new DescribeDcdnDomainIspDataResponseBodyValue();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainIspDataResponseBodyValue setIspProportionData(java.util.List<DescribeDcdnDomainIspDataResponseBodyValueIspProportionData> ispProportionData) {
            this.ispProportionData = ispProportionData;
            return this;
        }
        public java.util.List<DescribeDcdnDomainIspDataResponseBodyValueIspProportionData> getIspProportionData() {
            return this.ispProportionData;
        }

    }

}
