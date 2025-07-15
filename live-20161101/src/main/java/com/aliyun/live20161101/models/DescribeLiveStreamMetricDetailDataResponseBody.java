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

    /**
     * <p>The data array returned.</p>
     */
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
        /**
         * <p>The name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>app</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The total bandwidth consumed by the stream per minute. Unit: bit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>423304182.66</p>
         */
        @NameInMap("Bps")
        public Float bps;

        /**
         * <p>The total number of online viewers for the stream per minute.</p>
         * 
         * <strong>example:</strong>
         * <p>423304182</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The bandwidth over the Flash Video (FLV) protocol. Unit: bit/s.</p>
         * <blockquote>
         * <p> This parameter is not returned if no traffic is generated over the protocol.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>454</p>
         */
        @NameInMap("FlvBps")
        public Float flvBps;

        /**
         * <p>The number of online viewers over the FLV protocol.</p>
         * <blockquote>
         * <p> This parameter is not returned if no traffic is generated over the protocol.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("FlvCount")
        public Long flvCount;

        /**
         * <p>The amount of traffic over the FLV protocol. Unit: bytes.</p>
         * <blockquote>
         * <p> This parameter is not returned if no traffic is generated over the protocol.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1254</p>
         */
        @NameInMap("FlvTraffic")
        public Long flvTraffic;

        /**
         * <p>The bandwidth over the HTTP Live Streaming (HLS) protocol. Unit: bit/s.</p>
         * <blockquote>
         * <p> This parameter is not returned if no traffic is generated over the protocol.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>4456</p>
         */
        @NameInMap("HlsBps")
        public Float hlsBps;

        /**
         * <p>The number of online viewers over the HLS protocol.</p>
         * <blockquote>
         * <p> Currently, this parameter is not supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>56</p>
         */
        @NameInMap("HlsCount")
        public Long hlsCount;

        /**
         * <p>The amount of traffic over the HLS protocol. Unit: bytes.</p>
         * <blockquote>
         * <p> This parameter is not returned if no traffic is generated over the protocol.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>568</p>
         */
        @NameInMap("HlsTraffic")
        public Long hlsTraffic;

        /**
         * <p>Number of new connections established per minute.</p>
         * 
         * <strong>example:</strong>
         * <p>450</p>
         */
        @NameInMap("NewConns")
        public String newConns;

        /**
         * <p>The bandwidth over the P2P protocol. Unit: bit/s.</p>
         * <blockquote>
         * <p> This parameter is not returned if no traffic is generated over the protocol.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>6845</p>
         */
        @NameInMap("P2pBps")
        public Float p2pBps;

        /**
         * <p>The number of online viewers over the P2P protocol.</p>
         * <blockquote>
         * <p> This parameter is not returned if no traffic is generated over the protocol.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>78</p>
         */
        @NameInMap("P2pCount")
        public Long p2pCount;

        /**
         * <p>The amount of traffic over the peer-to-peer (P2P) protocol. Unit: bytes.</p>
         * <blockquote>
         * <p> This parameter is not returned if no traffic is generated over the protocol.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>4102</p>
         */
        @NameInMap("P2pTraffic")
        public Long p2pTraffic;

        /**
         * <p>The bandwidth over the Real-Time Messaging Protocol (RTMP) protocol. Unit: bit/s.</p>
         * <blockquote>
         * <p> This parameter is not returned if no traffic is generated over the protocol.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3323</p>
         */
        @NameInMap("RtmpBps")
        public Float rtmpBps;

        /**
         * <p>The number of online viewers over the RTMP protocol.</p>
         * <blockquote>
         * <p> This parameter is not returned if no traffic is generated over the protocol.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>63</p>
         */
        @NameInMap("RtmpCount")
        public Long rtmpCount;

        /**
         * <p>The amount of traffic over the RTMP protocol. Unit: bytes.</p>
         * <blockquote>
         * <p> This parameter is not returned if no traffic is generated over the protocol.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5568</p>
         */
        @NameInMap("RtmpTraffic")
        public Long rtmpTraffic;

        /**
         * <p>The bandwidth over the RTS protocol. Unit: bit/s.</p>
         * <blockquote>
         * <p> This parameter is not returned if no traffic is generated over the protocol.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2361</p>
         */
        @NameInMap("RtsBps")
        public Float rtsBps;

        /**
         * <p>The number of online viewers over the Real-Time Streaming (RTS) protocol.</p>
         * <blockquote>
         * <p> This parameter is not returned if no traffic is generated over the protocol.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>89</p>
         */
        @NameInMap("RtsCount")
        public Long rtsCount;

        /**
         * <p>The amount of traffic over the RTS protocol. Unit: bytes.</p>
         * <blockquote>
         * <p> This parameter is not returned if no traffic is generated over the protocol.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2322</p>
         */
        @NameInMap("RtsTraffic")
        public Long rtsTraffic;

        /**
         * <p>The name of the stream.</p>
         * 
         * <strong>example:</strong>
         * <p>test.flv</p>
         */
        @NameInMap("StreamName")
        public String streamName;

        /**
         * <p>The timestamp of the returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-12-10T20:00:00Z</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        /**
         * <p>The total amount of traffic consumed by the stream per minute. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>423304182</p>
         */
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
