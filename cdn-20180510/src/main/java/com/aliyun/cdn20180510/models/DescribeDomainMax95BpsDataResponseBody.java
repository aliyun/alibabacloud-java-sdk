// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainMax95BpsDataResponseBody extends TeaModel {
    @NameInMap("DetailData")
    public DescribeDomainMax95BpsDataResponseBodyDetailData detailData;

    /**
     * <p>http://inner.jing.alibaba-inc.com:1160/v2/api/rtlog/max95BpsData</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("DomesticMax95Bps")
    public String domesticMax95Bps;

    /**
     * <p>domainName</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Max95Bps")
    public String max95Bps;

    @NameInMap("OverseasMax95Bps")
    public String overseasMax95Bps;

    /**
     * <p>Specified EndTime does not math the specified StartTime.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>http://inner.jing.alibaba-inc.com:1160/v2/api/rtlog/max95BpsData</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDomainMax95BpsDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainMax95BpsDataResponseBody self = new DescribeDomainMax95BpsDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainMax95BpsDataResponseBody setDetailData(DescribeDomainMax95BpsDataResponseBodyDetailData detailData) {
        this.detailData = detailData;
        return this;
    }
    public DescribeDomainMax95BpsDataResponseBodyDetailData getDetailData() {
        return this.detailData;
    }

    public DescribeDomainMax95BpsDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainMax95BpsDataResponseBody setDomesticMax95Bps(String domesticMax95Bps) {
        this.domesticMax95Bps = domesticMax95Bps;
        return this;
    }
    public String getDomesticMax95Bps() {
        return this.domesticMax95Bps;
    }

    public DescribeDomainMax95BpsDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainMax95BpsDataResponseBody setMax95Bps(String max95Bps) {
        this.max95Bps = max95Bps;
        return this;
    }
    public String getMax95Bps() {
        return this.max95Bps;
    }

    public DescribeDomainMax95BpsDataResponseBody setOverseasMax95Bps(String overseasMax95Bps) {
        this.overseasMax95Bps = overseasMax95Bps;
        return this;
    }
    public String getOverseasMax95Bps() {
        return this.overseasMax95Bps;
    }

    public DescribeDomainMax95BpsDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainMax95BpsDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeDomainMax95BpsDataResponseBodyDetailDataMax95Detail extends TeaModel {
        @NameInMap("Area")
        public String area;

        @NameInMap("Max95Bps")
        public Float max95Bps;

        @NameInMap("Max95BpsPeakTime")
        public String max95BpsPeakTime;

        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeDomainMax95BpsDataResponseBodyDetailDataMax95Detail build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainMax95BpsDataResponseBodyDetailDataMax95Detail self = new DescribeDomainMax95BpsDataResponseBodyDetailDataMax95Detail();
            return TeaModel.build(map, self);
        }

        public DescribeDomainMax95BpsDataResponseBodyDetailDataMax95Detail setArea(String area) {
            this.area = area;
            return this;
        }
        public String getArea() {
            return this.area;
        }

        public DescribeDomainMax95BpsDataResponseBodyDetailDataMax95Detail setMax95Bps(Float max95Bps) {
            this.max95Bps = max95Bps;
            return this;
        }
        public Float getMax95Bps() {
            return this.max95Bps;
        }

        public DescribeDomainMax95BpsDataResponseBodyDetailDataMax95Detail setMax95BpsPeakTime(String max95BpsPeakTime) {
            this.max95BpsPeakTime = max95BpsPeakTime;
            return this;
        }
        public String getMax95BpsPeakTime() {
            return this.max95BpsPeakTime;
        }

        public DescribeDomainMax95BpsDataResponseBodyDetailDataMax95Detail setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeDomainMax95BpsDataResponseBodyDetailData extends TeaModel {
        @NameInMap("Max95Detail")
        public java.util.List<DescribeDomainMax95BpsDataResponseBodyDetailDataMax95Detail> max95Detail;

        public static DescribeDomainMax95BpsDataResponseBodyDetailData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainMax95BpsDataResponseBodyDetailData self = new DescribeDomainMax95BpsDataResponseBodyDetailData();
            return TeaModel.build(map, self);
        }

        public DescribeDomainMax95BpsDataResponseBodyDetailData setMax95Detail(java.util.List<DescribeDomainMax95BpsDataResponseBodyDetailDataMax95Detail> max95Detail) {
            this.max95Detail = max95Detail;
            return this;
        }
        public java.util.List<DescribeDomainMax95BpsDataResponseBodyDetailDataMax95Detail> getMax95Detail() {
            return this.max95Detail;
        }

    }

}
