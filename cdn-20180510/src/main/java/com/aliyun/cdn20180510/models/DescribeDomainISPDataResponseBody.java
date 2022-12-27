// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainISPDataResponseBody extends TeaModel {
    // The time interval between the data entries. Unit: seconds.
    @NameInMap("DataInterval")
    public String dataInterval;

    // The accelerated domain name.
    @NameInMap("DomainName")
    public String domainName;

    // The end of the time range that was queried.
    @NameInMap("EndTime")
    public String endTime;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The beginning of the time range that was queried.
    @NameInMap("StartTime")
    public String startTime;

    // The access statistics by ISP.
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
        // The average response size. Unit: bytes.
        @NameInMap("AvgObjectSize")
        public String avgObjectSize;

        // The average response speed. Unit: byte/ms.
        @NameInMap("AvgResponseRate")
        public String avgResponseRate;

        // The average response time. Unit: milliseconds.
        @NameInMap("AvgResponseTime")
        public String avgResponseTime;

        // The bandwidth value.
        @NameInMap("Bps")
        public String bps;

        // The proportion of network traffic.
        @NameInMap("BytesProportion")
        public String bytesProportion;

        // The information about the ISP.
        @NameInMap("ISP")
        public String ISP;

        // The name of the ISP.
        @NameInMap("IspEname")
        public String ispEname;

        // The proportion of the HTTP status code.
        @NameInMap("Proportion")
        public String proportion;

        // The number of queries per second.
        @NameInMap("Qps")
        public String qps;

        // The request error rate.
        @NameInMap("ReqErrRate")
        public String reqErrRate;

        // The total amount of network traffic.
        @NameInMap("TotalBytes")
        public String totalBytes;

        // The total number of requests.
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
