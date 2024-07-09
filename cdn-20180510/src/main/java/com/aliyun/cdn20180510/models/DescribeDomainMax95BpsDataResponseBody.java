// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainMax95BpsDataResponseBody extends TeaModel {
    /**
     * <p>Details of the 95th percentile bandwidth.</p>
     */
    @NameInMap("DetailData")
    public DescribeDomainMax95BpsDataResponseBodyDetailData detailData;

    /**
     * <p>The accelerated domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The 95th percentile bandwidth in the Chinese mainland.</p>
     * 
     * <strong>example:</strong>
     * <p>16777590.28</p>
     */
    @NameInMap("DomesticMax95Bps")
    public String domesticMax95Bps;

    /**
     * <p>The end of the time range for which the data was queried.</p>
     * 
     * <strong>example:</strong>
     * <p>2015-12-11T21:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The 95th percentile bandwidth.</p>
     * 
     * <strong>example:</strong>
     * <p>16777590.28</p>
     */
    @NameInMap("Max95Bps")
    public String max95Bps;

    /**
     * <p>The 95th percentile bandwidth outside the Chinese mainland.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("OverseasMax95Bps")
    public String overseasMax95Bps;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>3C6CCEC4-6B88-4D4A-93E4-D47B3D92CF8F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The beginning of the time range for which the data was queried.</p>
     * 
     * <strong>example:</strong>
     * <p>2015-12-10T20:00:00Z</p>
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
        /**
         * <p>Region of the 95th percentile bandwidth.</p>
         * 
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("Area")
        public String area;

        /**
         * <p>The 95th percentile bandwidth.</p>
         * 
         * <strong>example:</strong>
         * <p>16777590.28</p>
         */
        @NameInMap("Max95Bps")
        public Float max95Bps;

        /**
         * <p>Time of the 95th percentile bandwidth.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-12-11T21:05:00Z</p>
         */
        @NameInMap("Max95BpsPeakTime")
        public String max95BpsPeakTime;

        /**
         * <p>The timestamp of the returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-12-11T21:00:00Z</p>
         */
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
