// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamsOnlineListResponseBody extends TeaModel {
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
        @NameInMap("AppName")
        public String appName;

        @NameInMap("AudioCodecId")
        public Integer audioCodecId;

        @NameInMap("AudioDataRate")
        public Integer audioDataRate;

        @NameInMap("ClientIp")
        public String clientIp;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("FrameRate")
        public Integer frameRate;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("PublishDomain")
        public String publishDomain;

        @NameInMap("PublishTime")
        public String publishTime;

        @NameInMap("PublishType")
        public String publishType;

        @NameInMap("PublishUrl")
        public String publishUrl;

        @NameInMap("ServerIp")
        public String serverIp;

        @NameInMap("StreamName")
        public String streamName;

        @NameInMap("Transcoded")
        public String transcoded;

        @NameInMap("VideoCodecId")
        public Integer videoCodecId;

        @NameInMap("VideoDataRate")
        public Integer videoDataRate;

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
