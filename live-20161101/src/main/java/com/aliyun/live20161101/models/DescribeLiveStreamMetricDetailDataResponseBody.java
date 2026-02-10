// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamMetricDetailDataResponseBody extends TeaModel {
    /**
     * <p>The accelerated domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range during which data was queried.</p>
     * 
     * <strong>example:</strong>
     * <p>2015-12-10T21:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The token that determines the start point of the next query. This parameter is returned if more data results are available.</p>
     * 
     * <strong>example:</strong>
     * <p>UjsM9x3aVcJi9a0-ArwJUTTC67C***37C0=</p>
     */
    @NameInMap("NextPageToken")
    public String nextPageToken;

    /**
     * <p>The number of rows returned.</p>
     * 
     * <strong>example:</strong>
     * <p>5000</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>B955107D-E658-4E77-B913-E0AC3D31693E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The beginning of the time range during which data was queried.</p>
     * 
     * <strong>example:</strong>
     * <p>2015-12-10T20:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("StreamDetailData")
    public DescribeLiveStreamMetricDetailDataResponseBodyStreamDetailData streamDetailData;

    public static DescribeLiveStreamMetricDetailDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamMetricDetailDataResponseBody self = new DescribeLiveStreamMetricDetailDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamMetricDetailDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveStreamMetricDetailDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeLiveStreamMetricDetailDataResponseBody setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public DescribeLiveStreamMetricDetailDataResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLiveStreamMetricDetailDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveStreamMetricDetailDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeLiveStreamMetricDetailDataResponseBody setStreamDetailData(DescribeLiveStreamMetricDetailDataResponseBodyStreamDetailData streamDetailData) {
        this.streamDetailData = streamDetailData;
        return this;
    }
    public DescribeLiveStreamMetricDetailDataResponseBodyStreamDetailData getStreamDetailData() {
        return this.streamDetailData;
    }

    public static class DescribeLiveStreamMetricDetailDataResponseBodyStreamDetailDataStreamData extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("Bps")
        public Float bps;

        @NameInMap("Count")
        public Long count;

        @NameInMap("FlvBps")
        public Float flvBps;

        @NameInMap("FlvCount")
        public Long flvCount;

        @NameInMap("FlvTraffic")
        public Long flvTraffic;

        @NameInMap("HlsBps")
        public Float hlsBps;

        @NameInMap("HlsCount")
        public Long hlsCount;

        @NameInMap("HlsTraffic")
        public Long hlsTraffic;

        @NameInMap("NewConns")
        public String newConns;

        @NameInMap("P2pBps")
        public Float p2pBps;

        @NameInMap("P2pCount")
        public Long p2pCount;

        @NameInMap("P2pTraffic")
        public Long p2pTraffic;

        @NameInMap("RtmpBps")
        public Float rtmpBps;

        @NameInMap("RtmpCount")
        public Long rtmpCount;

        @NameInMap("RtmpTraffic")
        public Long rtmpTraffic;

        @NameInMap("RtsBps")
        public Float rtsBps;

        @NameInMap("RtsCount")
        public Long rtsCount;

        @NameInMap("RtsTraffic")
        public Long rtsTraffic;

        @NameInMap("StreamName")
        public String streamName;

        @NameInMap("TimeStamp")
        public String timeStamp;

        @NameInMap("Traffic")
        public Long traffic;

        public static DescribeLiveStreamMetricDetailDataResponseBodyStreamDetailDataStreamData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamMetricDetailDataResponseBodyStreamDetailDataStreamData self = new DescribeLiveStreamMetricDetailDataResponseBodyStreamDetailDataStreamData();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamMetricDetailDataResponseBodyStreamDetailDataStreamData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeLiveStreamMetricDetailDataResponseBodyStreamDetailDataStreamData setBps(Float bps) {
            this.bps = bps;
            return this;
        }
        public Float getBps() {
            return this.bps;
        }

        public DescribeLiveStreamMetricDetailDataResponseBodyStreamDetailDataStreamData setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeLiveStreamMetricDetailDataResponseBodyStreamDetailDataStreamData setFlvBps(Float flvBps) {
            this.flvBps = flvBps;
            return this;
        }
        public Float getFlvBps() {
            return this.flvBps;
        }

        public DescribeLiveStreamMetricDetailDataResponseBodyStreamDetailDataStreamData setFlvCount(Long flvCount) {
            this.flvCount = flvCount;
            return this;
        }
        public Long getFlvCount() {
            return this.flvCount;
        }

        public DescribeLiveStreamMetricDetailDataResponseBodyStreamDetailDataStreamData setFlvTraffic(Long flvTraffic) {
            this.flvTraffic = flvTraffic;
            return this;
        }
        public Long getFlvTraffic() {
            return this.flvTraffic;
        }

        public DescribeLiveStreamMetricDetailDataResponseBodyStreamDetailDataStreamData setHlsBps(Float hlsBps) {
            this.hlsBps = hlsBps;
            return this;
        }
        public Float getHlsBps() {
            return this.hlsBps;
        }

        public DescribeLiveStreamMetricDetailDataResponseBodyStreamDetailDataStreamData setHlsCount(Long hlsCount) {
            this.hlsCount = hlsCount;
            return this;
        }
        public Long getHlsCount() {
            return this.hlsCount;
        }

        public DescribeLiveStreamMetricDetailDataResponseBodyStreamDetailDataStreamData setHlsTraffic(Long hlsTraffic) {
            this.hlsTraffic = hlsTraffic;
            return this;
        }
        public Long getHlsTraffic() {
            return this.hlsTraffic;
        }

        public DescribeLiveStreamMetricDetailDataResponseBodyStreamDetailDataStreamData setNewConns(String newConns) {
            this.newConns = newConns;
            return this;
        }
        public String getNewConns() {
            return this.newConns;
        }

        public DescribeLiveStreamMetricDetailDataResponseBodyStreamDetailDataStreamData setP2pBps(Float p2pBps) {
            this.p2pBps = p2pBps;
            return this;
        }
        public Float getP2pBps() {
            return this.p2pBps;
        }

        public DescribeLiveStreamMetricDetailDataResponseBodyStreamDetailDataStreamData setP2pCount(Long p2pCount) {
            this.p2pCount = p2pCount;
            return this;
        }
        public Long getP2pCount() {
            return this.p2pCount;
        }

        public DescribeLiveStreamMetricDetailDataResponseBodyStreamDetailDataStreamData setP2pTraffic(Long p2pTraffic) {
            this.p2pTraffic = p2pTraffic;
            return this;
        }
        public Long getP2pTraffic() {
            return this.p2pTraffic;
        }

        public DescribeLiveStreamMetricDetailDataResponseBodyStreamDetailDataStreamData setRtmpBps(Float rtmpBps) {
            this.rtmpBps = rtmpBps;
            return this;
        }
        public Float getRtmpBps() {
            return this.rtmpBps;
        }

        public DescribeLiveStreamMetricDetailDataResponseBodyStreamDetailDataStreamData setRtmpCount(Long rtmpCount) {
            this.rtmpCount = rtmpCount;
            return this;
        }
        public Long getRtmpCount() {
            return this.rtmpCount;
        }

        public DescribeLiveStreamMetricDetailDataResponseBodyStreamDetailDataStreamData setRtmpTraffic(Long rtmpTraffic) {
            this.rtmpTraffic = rtmpTraffic;
            return this;
        }
        public Long getRtmpTraffic() {
            return this.rtmpTraffic;
        }

        public DescribeLiveStreamMetricDetailDataResponseBodyStreamDetailDataStreamData setRtsBps(Float rtsBps) {
            this.rtsBps = rtsBps;
            return this;
        }
        public Float getRtsBps() {
            return this.rtsBps;
        }

        public DescribeLiveStreamMetricDetailDataResponseBodyStreamDetailDataStreamData setRtsCount(Long rtsCount) {
            this.rtsCount = rtsCount;
            return this;
        }
        public Long getRtsCount() {
            return this.rtsCount;
        }

        public DescribeLiveStreamMetricDetailDataResponseBodyStreamDetailDataStreamData setRtsTraffic(Long rtsTraffic) {
            this.rtsTraffic = rtsTraffic;
            return this;
        }
        public Long getRtsTraffic() {
            return this.rtsTraffic;
        }

        public DescribeLiveStreamMetricDetailDataResponseBodyStreamDetailDataStreamData setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

        public DescribeLiveStreamMetricDetailDataResponseBodyStreamDetailDataStreamData setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeLiveStreamMetricDetailDataResponseBodyStreamDetailDataStreamData setTraffic(Long traffic) {
            this.traffic = traffic;
            return this;
        }
        public Long getTraffic() {
            return this.traffic;
        }

    }

    public static class DescribeLiveStreamMetricDetailDataResponseBodyStreamDetailData extends TeaModel {
        @NameInMap("StreamData")
        public java.util.List<DescribeLiveStreamMetricDetailDataResponseBodyStreamDetailDataStreamData> streamData;

        public static DescribeLiveStreamMetricDetailDataResponseBodyStreamDetailData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamMetricDetailDataResponseBodyStreamDetailData self = new DescribeLiveStreamMetricDetailDataResponseBodyStreamDetailData();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamMetricDetailDataResponseBodyStreamDetailData setStreamData(java.util.List<DescribeLiveStreamMetricDetailDataResponseBodyStreamDetailDataStreamData> streamData) {
            this.streamData = streamData;
            return this;
        }
        public java.util.List<DescribeLiveStreamMetricDetailDataResponseBodyStreamDetailDataStreamData> getStreamData() {
            return this.streamData;
        }

    }

}
