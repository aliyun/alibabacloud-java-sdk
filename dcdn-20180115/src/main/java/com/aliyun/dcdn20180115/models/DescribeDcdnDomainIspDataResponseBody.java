// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainIspDataResponseBody extends TeaModel {
    @NameInMap("DataInterval")
    public String dataInterval;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StartTime")
    public String startTime;

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

        @NameInMap("Isp")
        public String isp;

        @NameInMap("IspEname")
        public String ispEname;

        @NameInMap("Proportion")
        public String proportion;

        @NameInMap("Qps")
        public String qps;

        @NameInMap("TotalBytes")
        public String totalBytes;

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
