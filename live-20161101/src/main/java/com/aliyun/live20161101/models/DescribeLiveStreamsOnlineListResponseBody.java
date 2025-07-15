// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamsOnlineListResponseBody extends TeaModel {
    /**
     * <p>The information about the live streams that are being ingested.</p>
     */
    @NameInMap("OnlineInfo")
    public DescribeLiveStreamsOnlineListResponseBodyOnlineInfo onlineInfo;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5c6a2a0df228-4a64- af62-20e91b9676b3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of streams that meet the specified conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("TotalNum")
    public Integer totalNum;

    /**
     * <p>The total number of pages returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalPage")
    public Integer totalPage;

    public static DescribeLiveStreamsOnlineListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamsOnlineListResponseBody self = new DescribeLiveStreamsOnlineListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamsOnlineListResponseBody setOnlineInfo(DescribeLiveStreamsOnlineListResponseBodyOnlineInfo onlineInfo) {
        this.onlineInfo = onlineInfo;
        return this;
    }
    public DescribeLiveStreamsOnlineListResponseBodyOnlineInfo getOnlineInfo() {
        return this.onlineInfo;
    }

    public DescribeLiveStreamsOnlineListResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeLiveStreamsOnlineListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLiveStreamsOnlineListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveStreamsOnlineListResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public DescribeLiveStreamsOnlineListResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeLiveStreamsOnlineListResponseBodyOnlineInfoLiveStreamOnlineInfo extends TeaModel {
        /**
         * <p>The name of the application to which the live stream belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>liveApp****</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The ID of the audio codec.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("AudioCodecId")
        public Integer audioCodecId;

        /**
         * <p>The audio bitrate of the live stream. Unit: Kbit/s.</p>
         * <blockquote>
         * <p> This parameter can be returned after you submit a ticket for whitelist configuration. For more information about how to submit a ticket, see Contact us.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("AudioDataRate")
        public Integer audioDataRate;

        /**
         * <p>The IP address of the client for stream ingest.</p>
         * 
         * <strong>example:</strong>
         * <p>106.11.XX.XX</p>
         */
        @NameInMap("ClientIp")
        public String clientIp;

        /**
         * <p>The main streaming domain.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The frame rate. Unit: FPS.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("FrameRate")
        public Integer frameRate;

        /**
         * <p>The height of the video resolution. Unit: pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>720</p>
         */
        @NameInMap("Height")
        public Integer height;

        /**
         * <p>The ingest domain. If live center ingest was used, the streaming domain is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>demo.aliyundoc.com</p>
         */
        @NameInMap("PublishDomain")
        public String publishDomain;

        /**
         * <p>The start time of stream ingest. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-08-09T02:37:59Z</p>
         */
        @NameInMap("PublishTime")
        public String publishTime;

        /**
         * <p>The ingest type. Valid values:</p>
         * <ul>
         * <li><strong>edge</strong>: edge ingest.</li>
         * <li><strong>center</strong>: live center ingest.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>edge</p>
         */
        @NameInMap("PublishType")
        public String publishType;

        /**
         * <p>The complete URL that was used to ingest the stream.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp://demo.aliyundoc.com/live/test****</p>
         */
        @NameInMap("PublishUrl")
        public String publishUrl;

        /**
         * <p>The IP address of the ingest node.</p>
         * 
         * <strong>example:</strong>
         * <p>120.221.XX.XX</p>
         */
        @NameInMap("ServerIp")
        public String serverIp;

        /**
         * <p>The name of the live stream.</p>
         * 
         * <strong>example:</strong>
         * <p>liveStream****</p>
         */
        @NameInMap("StreamName")
        public String streamName;

        /**
         * <p>Indicates whether the stream was transcoded. Valid values:</p>
         * <ul>
         * <li><strong>yes</strong></li>
         * <li><strong>no</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>no</p>
         */
        @NameInMap("Transcoded")
        public String transcoded;

        /**
         * <p>The ID of the video codec.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("VideoCodecId")
        public Integer videoCodecId;

        /**
         * <p>The video bitrate of the live stream. Unit: Kbit/s.</p>
         * <blockquote>
         * <p> This parameter can be returned after you submit a ticket for whitelist configuration. For more information about how to submit a ticket, see Contact us.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("VideoDataRate")
        public Integer videoDataRate;

        /**
         * <p>The width of the video resolution. Unit: pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>1280</p>
         */
        @NameInMap("Width")
        public Integer width;

        public static DescribeLiveStreamsOnlineListResponseBodyOnlineInfoLiveStreamOnlineInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamsOnlineListResponseBodyOnlineInfoLiveStreamOnlineInfo self = new DescribeLiveStreamsOnlineListResponseBodyOnlineInfoLiveStreamOnlineInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamsOnlineListResponseBodyOnlineInfoLiveStreamOnlineInfo setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeLiveStreamsOnlineListResponseBodyOnlineInfoLiveStreamOnlineInfo setAudioCodecId(Integer audioCodecId) {
            this.audioCodecId = audioCodecId;
            return this;
        }
        public Integer getAudioCodecId() {
            return this.audioCodecId;
        }

        public DescribeLiveStreamsOnlineListResponseBodyOnlineInfoLiveStreamOnlineInfo setAudioDataRate(Integer audioDataRate) {
            this.audioDataRate = audioDataRate;
            return this;
        }
        public Integer getAudioDataRate() {
            return this.audioDataRate;
        }

        public DescribeLiveStreamsOnlineListResponseBodyOnlineInfoLiveStreamOnlineInfo setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

        public DescribeLiveStreamsOnlineListResponseBodyOnlineInfoLiveStreamOnlineInfo setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeLiveStreamsOnlineListResponseBodyOnlineInfoLiveStreamOnlineInfo setFrameRate(Integer frameRate) {
            this.frameRate = frameRate;
            return this;
        }
        public Integer getFrameRate() {
            return this.frameRate;
        }

        public DescribeLiveStreamsOnlineListResponseBodyOnlineInfoLiveStreamOnlineInfo setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public DescribeLiveStreamsOnlineListResponseBodyOnlineInfoLiveStreamOnlineInfo setPublishDomain(String publishDomain) {
            this.publishDomain = publishDomain;
            return this;
        }
        public String getPublishDomain() {
            return this.publishDomain;
        }

        public DescribeLiveStreamsOnlineListResponseBodyOnlineInfoLiveStreamOnlineInfo setPublishTime(String publishTime) {
            this.publishTime = publishTime;
            return this;
        }
        public String getPublishTime() {
            return this.publishTime;
        }

        public DescribeLiveStreamsOnlineListResponseBodyOnlineInfoLiveStreamOnlineInfo setPublishType(String publishType) {
            this.publishType = publishType;
            return this;
        }
        public String getPublishType() {
            return this.publishType;
        }

        public DescribeLiveStreamsOnlineListResponseBodyOnlineInfoLiveStreamOnlineInfo setPublishUrl(String publishUrl) {
            this.publishUrl = publishUrl;
            return this;
        }
        public String getPublishUrl() {
            return this.publishUrl;
        }

        public DescribeLiveStreamsOnlineListResponseBodyOnlineInfoLiveStreamOnlineInfo setServerIp(String serverIp) {
            this.serverIp = serverIp;
            return this;
        }
        public String getServerIp() {
            return this.serverIp;
        }

        public DescribeLiveStreamsOnlineListResponseBodyOnlineInfoLiveStreamOnlineInfo setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

        public DescribeLiveStreamsOnlineListResponseBodyOnlineInfoLiveStreamOnlineInfo setTranscoded(String transcoded) {
            this.transcoded = transcoded;
            return this;
        }
        public String getTranscoded() {
            return this.transcoded;
        }

        public DescribeLiveStreamsOnlineListResponseBodyOnlineInfoLiveStreamOnlineInfo setVideoCodecId(Integer videoCodecId) {
            this.videoCodecId = videoCodecId;
            return this;
        }
        public Integer getVideoCodecId() {
            return this.videoCodecId;
        }

        public DescribeLiveStreamsOnlineListResponseBodyOnlineInfoLiveStreamOnlineInfo setVideoDataRate(Integer videoDataRate) {
            this.videoDataRate = videoDataRate;
            return this;
        }
        public Integer getVideoDataRate() {
            return this.videoDataRate;
        }

        public DescribeLiveStreamsOnlineListResponseBodyOnlineInfoLiveStreamOnlineInfo setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class DescribeLiveStreamsOnlineListResponseBodyOnlineInfo extends TeaModel {
        @NameInMap("LiveStreamOnlineInfo")
        public java.util.List<DescribeLiveStreamsOnlineListResponseBodyOnlineInfoLiveStreamOnlineInfo> liveStreamOnlineInfo;

        public static DescribeLiveStreamsOnlineListResponseBodyOnlineInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamsOnlineListResponseBodyOnlineInfo self = new DescribeLiveStreamsOnlineListResponseBodyOnlineInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamsOnlineListResponseBodyOnlineInfo setLiveStreamOnlineInfo(java.util.List<DescribeLiveStreamsOnlineListResponseBodyOnlineInfoLiveStreamOnlineInfo> liveStreamOnlineInfo) {
            this.liveStreamOnlineInfo = liveStreamOnlineInfo;
            return this;
        }
        public java.util.List<DescribeLiveStreamsOnlineListResponseBodyOnlineInfoLiveStreamOnlineInfo> getLiveStreamOnlineInfo() {
            return this.liveStreamOnlineInfo;
        }

    }

}
