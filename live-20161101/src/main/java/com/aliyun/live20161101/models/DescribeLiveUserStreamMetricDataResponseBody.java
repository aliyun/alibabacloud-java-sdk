// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveUserStreamMetricDataResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>YYYY-MM-DDThh:mm:ssZ</p>
     * 
     * <strong>example:</strong>
     * <p>2015-12-10T21:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2015-12-10T20:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("StreamDetailData")
    public java.util.List<DescribeLiveUserStreamMetricDataResponseBodyStreamDetailData> streamDetailData;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeLiveUserStreamMetricDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveUserStreamMetricDataResponseBody self = new DescribeLiveUserStreamMetricDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveUserStreamMetricDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveUserStreamMetricDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeLiveUserStreamMetricDataResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeLiveUserStreamMetricDataResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeLiveUserStreamMetricDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveUserStreamMetricDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeLiveUserStreamMetricDataResponseBody setStreamDetailData(java.util.List<DescribeLiveUserStreamMetricDataResponseBodyStreamDetailData> streamDetailData) {
        this.streamDetailData = streamDetailData;
        return this;
    }
    public java.util.List<DescribeLiveUserStreamMetricDataResponseBodyStreamDetailData> getStreamDetailData() {
        return this.streamDetailData;
    }

    public DescribeLiveUserStreamMetricDataResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeLiveUserStreamMetricDataResponseBodyStreamDetailData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>app</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <strong>example:</strong>
         * <p>423304182.66</p>
         */
        @NameInMap("Bps")
        public Float bps;

        /**
         * <strong>example:</strong>
         * <p>423304182</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <strong>example:</strong>
         * <p>454</p>
         */
        @NameInMap("FlvBps")
        public Float flvBps;

        /**
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("FlvCount")
        public Long flvCount;

        /**
         * <strong>example:</strong>
         * <p>1254</p>
         */
        @NameInMap("FlvTraffic")
        public Double flvTraffic;

        /**
         * <strong>example:</strong>
         * <p>4456</p>
         */
        @NameInMap("HlsBps")
        public Float hlsBps;

        /**
         * <strong>example:</strong>
         * <p>56</p>
         */
        @NameInMap("HlsCount")
        public Long hlsCount;

        /**
         * <strong>example:</strong>
         * <p>568</p>
         */
        @NameInMap("HlsTraffic")
        public Double hlsTraffic;

        /**
         * <strong>example:</strong>
         * <p>450</p>
         */
        @NameInMap("NewConns")
        public Long newConns;

        /**
         * <strong>example:</strong>
         * <p>6845</p>
         */
        @NameInMap("P2pBps")
        public Float p2pBps;

        /**
         * <strong>example:</strong>
         * <p>78</p>
         */
        @NameInMap("P2pCount")
        public Long p2pCount;

        /**
         * <strong>example:</strong>
         * <p>4102</p>
         */
        @NameInMap("P2pTraffic")
        public Double p2pTraffic;

        /**
         * <strong>example:</strong>
         * <p>3323</p>
         */
        @NameInMap("RtmpBps")
        public Float rtmpBps;

        /**
         * <strong>example:</strong>
         * <p>63</p>
         */
        @NameInMap("RtmpCount")
        public Long rtmpCount;

        /**
         * <strong>example:</strong>
         * <p>5568</p>
         */
        @NameInMap("RtmpTraffic")
        public Double rtmpTraffic;

        /**
         * <strong>example:</strong>
         * <p>2361</p>
         */
        @NameInMap("RtsBps")
        public Double rtsBps;

        /**
         * <strong>example:</strong>
         * <p>89</p>
         */
        @NameInMap("RtsCount")
        public Long rtsCount;

        /**
         * <strong>example:</strong>
         * <p>2322</p>
         */
        @NameInMap("RtsTraffic")
        public Double rtsTraffic;

        /**
         * <strong>example:</strong>
         * <p>test.flv</p>
         */
        @NameInMap("StreamName")
        public String streamName;

        /**
         * <strong>example:</strong>
         * <p>2015-12-10T20:00:00Z</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        /**
         * <strong>example:</strong>
         * <p>423304182</p>
         */
        @NameInMap("Traffic")
        public Double traffic;

        public static DescribeLiveUserStreamMetricDataResponseBodyStreamDetailData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveUserStreamMetricDataResponseBodyStreamDetailData self = new DescribeLiveUserStreamMetricDataResponseBodyStreamDetailData();
            return TeaModel.build(map, self);
        }

        public DescribeLiveUserStreamMetricDataResponseBodyStreamDetailData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeLiveUserStreamMetricDataResponseBodyStreamDetailData setBps(Float bps) {
            this.bps = bps;
            return this;
        }
        public Float getBps() {
            return this.bps;
        }

        public DescribeLiveUserStreamMetricDataResponseBodyStreamDetailData setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeLiveUserStreamMetricDataResponseBodyStreamDetailData setFlvBps(Float flvBps) {
            this.flvBps = flvBps;
            return this;
        }
        public Float getFlvBps() {
            return this.flvBps;
        }

        public DescribeLiveUserStreamMetricDataResponseBodyStreamDetailData setFlvCount(Long flvCount) {
            this.flvCount = flvCount;
            return this;
        }
        public Long getFlvCount() {
            return this.flvCount;
        }

        public DescribeLiveUserStreamMetricDataResponseBodyStreamDetailData setFlvTraffic(Double flvTraffic) {
            this.flvTraffic = flvTraffic;
            return this;
        }
        public Double getFlvTraffic() {
            return this.flvTraffic;
        }

        public DescribeLiveUserStreamMetricDataResponseBodyStreamDetailData setHlsBps(Float hlsBps) {
            this.hlsBps = hlsBps;
            return this;
        }
        public Float getHlsBps() {
            return this.hlsBps;
        }

        public DescribeLiveUserStreamMetricDataResponseBodyStreamDetailData setHlsCount(Long hlsCount) {
            this.hlsCount = hlsCount;
            return this;
        }
        public Long getHlsCount() {
            return this.hlsCount;
        }

        public DescribeLiveUserStreamMetricDataResponseBodyStreamDetailData setHlsTraffic(Double hlsTraffic) {
            this.hlsTraffic = hlsTraffic;
            return this;
        }
        public Double getHlsTraffic() {
            return this.hlsTraffic;
        }

        public DescribeLiveUserStreamMetricDataResponseBodyStreamDetailData setNewConns(Long newConns) {
            this.newConns = newConns;
            return this;
        }
        public Long getNewConns() {
            return this.newConns;
        }

        public DescribeLiveUserStreamMetricDataResponseBodyStreamDetailData setP2pBps(Float p2pBps) {
            this.p2pBps = p2pBps;
            return this;
        }
        public Float getP2pBps() {
            return this.p2pBps;
        }

        public DescribeLiveUserStreamMetricDataResponseBodyStreamDetailData setP2pCount(Long p2pCount) {
            this.p2pCount = p2pCount;
            return this;
        }
        public Long getP2pCount() {
            return this.p2pCount;
        }

        public DescribeLiveUserStreamMetricDataResponseBodyStreamDetailData setP2pTraffic(Double p2pTraffic) {
            this.p2pTraffic = p2pTraffic;
            return this;
        }
        public Double getP2pTraffic() {
            return this.p2pTraffic;
        }

        public DescribeLiveUserStreamMetricDataResponseBodyStreamDetailData setRtmpBps(Float rtmpBps) {
            this.rtmpBps = rtmpBps;
            return this;
        }
        public Float getRtmpBps() {
            return this.rtmpBps;
        }

        public DescribeLiveUserStreamMetricDataResponseBodyStreamDetailData setRtmpCount(Long rtmpCount) {
            this.rtmpCount = rtmpCount;
            return this;
        }
        public Long getRtmpCount() {
            return this.rtmpCount;
        }

        public DescribeLiveUserStreamMetricDataResponseBodyStreamDetailData setRtmpTraffic(Double rtmpTraffic) {
            this.rtmpTraffic = rtmpTraffic;
            return this;
        }
        public Double getRtmpTraffic() {
            return this.rtmpTraffic;
        }

        public DescribeLiveUserStreamMetricDataResponseBodyStreamDetailData setRtsBps(Double rtsBps) {
            this.rtsBps = rtsBps;
            return this;
        }
        public Double getRtsBps() {
            return this.rtsBps;
        }

        public DescribeLiveUserStreamMetricDataResponseBodyStreamDetailData setRtsCount(Long rtsCount) {
            this.rtsCount = rtsCount;
            return this;
        }
        public Long getRtsCount() {
            return this.rtsCount;
        }

        public DescribeLiveUserStreamMetricDataResponseBodyStreamDetailData setRtsTraffic(Double rtsTraffic) {
            this.rtsTraffic = rtsTraffic;
            return this;
        }
        public Double getRtsTraffic() {
            return this.rtsTraffic;
        }

        public DescribeLiveUserStreamMetricDataResponseBodyStreamDetailData setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

        public DescribeLiveUserStreamMetricDataResponseBodyStreamDetailData setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeLiveUserStreamMetricDataResponseBodyStreamDetailData setTraffic(Double traffic) {
            this.traffic = traffic;
            return this;
        }
        public Double getTraffic() {
            return this.traffic;
        }

    }

}
