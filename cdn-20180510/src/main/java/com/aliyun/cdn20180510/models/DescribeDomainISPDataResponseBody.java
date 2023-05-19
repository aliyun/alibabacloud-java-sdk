// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainISPDataResponseBody extends TeaModel {
    /**
     * <p>The accelerated domain name. You can specify only one domain name in each call.</p>
     * <br>
     * <p>By default, this operation queries the proportions of data usage for all accelerated domain names.</p>
     */
    @NameInMap("DataInterval")
    public String dataInterval;

    /**
     * <p>The end of the time range that was queried.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The operation that you want to perform. Set the value to **DescribeDomainISPData**.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The number of queries per second.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The proportion of network traffic.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The proportion of the HTTP status code.</p>
     */
    @NameInMap("Value")
    public DescribeDomainISPDataResponseBodyValue value;

    public static DescribeDomainISPDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainISPDataResponseBody self = new DescribeDomainISPDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainISPDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDomainISPDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainISPDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainISPDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainISPDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDomainISPDataResponseBody setValue(DescribeDomainISPDataResponseBodyValue value) {
        this.value = value;
        return this;
    }
    public DescribeDomainISPDataResponseBodyValue getValue() {
        return this.value;
    }

    public static class DescribeDomainISPDataResponseBodyValueISPProportionData extends TeaModel {
        /**
         * <p>The average response time. Unit: milliseconds.</p>
         */
        @NameInMap("AvgObjectSize")
        public String avgObjectSize;

        /**
         * <p>The access statistics by ISP.</p>
         */
        @NameInMap("AvgResponseRate")
        public String avgResponseRate;

        /**
         * <p>The total number of requests.</p>
         */
        @NameInMap("AvgResponseTime")
        public String avgResponseTime;

        /**
         * <p>The time interval between the data entries. Unit: seconds.</p>
         */
        @NameInMap("Bps")
        public String bps;

        @NameInMap("BytesProportion")
        public String bytesProportion;

        /**
         * <p>Queries the proportions of data usage of different Internet service providers (ISPs). Data is collected every day. You can query data collected within the last 90 days.</p>
         */
        @NameInMap("ISP")
        public String ISP;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("IspEname")
        public String ispEname;

        /**
         * <p>The average response size. Unit: bytes.</p>
         */
        @NameInMap("Proportion")
        public String proportion;

        /**
         * <p>The bandwidth value.</p>
         */
        @NameInMap("Qps")
        public String qps;

        /**
         * <p>The beginning of the time range that was queried.</p>
         */
        @NameInMap("ReqErrRate")
        public String reqErrRate;

        /**
         * <p>The information about the ISP.</p>
         */
        @NameInMap("TotalBytes")
        public String totalBytes;

        /**
         * <p>The average response speed. Unit: byte/ms.</p>
         */
        @NameInMap("TotalQuery")
        public String totalQuery;

        public static DescribeDomainISPDataResponseBodyValueISPProportionData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainISPDataResponseBodyValueISPProportionData self = new DescribeDomainISPDataResponseBodyValueISPProportionData();
            return TeaModel.build(map, self);
        }

        public DescribeDomainISPDataResponseBodyValueISPProportionData setAvgObjectSize(String avgObjectSize) {
            this.avgObjectSize = avgObjectSize;
            return this;
        }
        public String getAvgObjectSize() {
            return this.avgObjectSize;
        }

        public DescribeDomainISPDataResponseBodyValueISPProportionData setAvgResponseRate(String avgResponseRate) {
            this.avgResponseRate = avgResponseRate;
            return this;
        }
        public String getAvgResponseRate() {
            return this.avgResponseRate;
        }

        public DescribeDomainISPDataResponseBodyValueISPProportionData setAvgResponseTime(String avgResponseTime) {
            this.avgResponseTime = avgResponseTime;
            return this;
        }
        public String getAvgResponseTime() {
            return this.avgResponseTime;
        }

        public DescribeDomainISPDataResponseBodyValueISPProportionData setBps(String bps) {
            this.bps = bps;
            return this;
        }
        public String getBps() {
            return this.bps;
        }

        public DescribeDomainISPDataResponseBodyValueISPProportionData setBytesProportion(String bytesProportion) {
            this.bytesProportion = bytesProportion;
            return this;
        }
        public String getBytesProportion() {
            return this.bytesProportion;
        }

        public DescribeDomainISPDataResponseBodyValueISPProportionData setISP(String ISP) {
            this.ISP = ISP;
            return this;
        }
        public String getISP() {
            return this.ISP;
        }

        public DescribeDomainISPDataResponseBodyValueISPProportionData setIspEname(String ispEname) {
            this.ispEname = ispEname;
            return this;
        }
        public String getIspEname() {
            return this.ispEname;
        }

        public DescribeDomainISPDataResponseBodyValueISPProportionData setProportion(String proportion) {
            this.proportion = proportion;
            return this;
        }
        public String getProportion() {
            return this.proportion;
        }

        public DescribeDomainISPDataResponseBodyValueISPProportionData setQps(String qps) {
            this.qps = qps;
            return this;
        }
        public String getQps() {
            return this.qps;
        }

        public DescribeDomainISPDataResponseBodyValueISPProportionData setReqErrRate(String reqErrRate) {
            this.reqErrRate = reqErrRate;
            return this;
        }
        public String getReqErrRate() {
            return this.reqErrRate;
        }

        public DescribeDomainISPDataResponseBodyValueISPProportionData setTotalBytes(String totalBytes) {
            this.totalBytes = totalBytes;
            return this;
        }
        public String getTotalBytes() {
            return this.totalBytes;
        }

        public DescribeDomainISPDataResponseBodyValueISPProportionData setTotalQuery(String totalQuery) {
            this.totalQuery = totalQuery;
            return this;
        }
        public String getTotalQuery() {
            return this.totalQuery;
        }

    }

    public static class DescribeDomainISPDataResponseBodyValue extends TeaModel {
        @NameInMap("ISPProportionData")
        public java.util.List<DescribeDomainISPDataResponseBodyValueISPProportionData> ISPProportionData;

        public static DescribeDomainISPDataResponseBodyValue build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainISPDataResponseBodyValue self = new DescribeDomainISPDataResponseBodyValue();
            return TeaModel.build(map, self);
        }

        public DescribeDomainISPDataResponseBodyValue setISPProportionData(java.util.List<DescribeDomainISPDataResponseBodyValueISPProportionData> ISPProportionData) {
            this.ISPProportionData = ISPProportionData;
            return this;
        }
        public java.util.List<DescribeDomainISPDataResponseBodyValueISPProportionData> getISPProportionData() {
            return this.ISPProportionData;
        }

    }

}
