// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamsOnlineListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageNum")
    @Validation(required = true)
    public Integer pageNum;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("TotalNum")
    @Validation(required = true)
    public Integer totalNum;

    @NameInMap("TotalPage")
    @Validation(required = true)
    public Integer totalPage;

    @NameInMap("OnlineInfo")
    @Validation(required = true)
    public DescribeLiveStreamsOnlineListResponseOnlineInfo onlineInfo;

    public static DescribeLiveStreamsOnlineListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamsOnlineListResponse self = new DescribeLiveStreamsOnlineListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamsOnlineListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveStreamsOnlineListResponse setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeLiveStreamsOnlineListResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLiveStreamsOnlineListResponse setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public DescribeLiveStreamsOnlineListResponse setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public DescribeLiveStreamsOnlineListResponse setOnlineInfo(DescribeLiveStreamsOnlineListResponseOnlineInfo onlineInfo) {
        this.onlineInfo = onlineInfo;
        return this;
    }
    public DescribeLiveStreamsOnlineListResponseOnlineInfo getOnlineInfo() {
        return this.onlineInfo;
    }

    public static class DescribeLiveStreamsOnlineListResponseOnlineInfoLiveStreamOnlineInfo extends TeaModel {
        @NameInMap("DomainName")
        @Validation(required = true)
        public String domainName;

        @NameInMap("AppName")
        @Validation(required = true)
        public String appName;

        @NameInMap("StreamName")
        @Validation(required = true)
        public String streamName;

        @NameInMap("PublishTime")
        @Validation(required = true)
        public String publishTime;

        @NameInMap("PublishUrl")
        @Validation(required = true)
        public String publishUrl;

        @NameInMap("PublishDomain")
        @Validation(required = true)
        public String publishDomain;

        @NameInMap("PublishType")
        @Validation(required = true)
        public String publishType;

        @NameInMap("Transcoded")
        @Validation(required = true)
        public String transcoded;

        @NameInMap("TranscodeId")
        @Validation(required = true)
        public String transcodeId;

        @NameInMap("ServerIp")
        @Validation(required = true)
        public String serverIp;

        @NameInMap("ClientIp")
        @Validation(required = true)
        public String clientIp;

        @NameInMap("VideoCodecId")
        @Validation(required = true)
        public Integer videoCodecId;

        @NameInMap("VideoDataRate")
        @Validation(required = true)
        public Integer videoDataRate;

        @NameInMap("FrameRate")
        @Validation(required = true)
        public Integer frameRate;

        @NameInMap("Width")
        @Validation(required = true)
        public Integer width;

        @NameInMap("Height")
        @Validation(required = true)
        public Integer height;

        @NameInMap("AudioCodecId")
        @Validation(required = true)
        public Integer audioCodecId;

        @NameInMap("AudioDataRate")
        @Validation(required = true)
        public Integer audioDataRate;

        public static DescribeLiveStreamsOnlineListResponseOnlineInfoLiveStreamOnlineInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamsOnlineListResponseOnlineInfoLiveStreamOnlineInfo self = new DescribeLiveStreamsOnlineListResponseOnlineInfoLiveStreamOnlineInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamsOnlineListResponseOnlineInfoLiveStreamOnlineInfo setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeLiveStreamsOnlineListResponseOnlineInfoLiveStreamOnlineInfo setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeLiveStreamsOnlineListResponseOnlineInfoLiveStreamOnlineInfo setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

        public DescribeLiveStreamsOnlineListResponseOnlineInfoLiveStreamOnlineInfo setPublishTime(String publishTime) {
            this.publishTime = publishTime;
            return this;
        }
        public String getPublishTime() {
            return this.publishTime;
        }

        public DescribeLiveStreamsOnlineListResponseOnlineInfoLiveStreamOnlineInfo setPublishUrl(String publishUrl) {
            this.publishUrl = publishUrl;
            return this;
        }
        public String getPublishUrl() {
            return this.publishUrl;
        }

        public DescribeLiveStreamsOnlineListResponseOnlineInfoLiveStreamOnlineInfo setPublishDomain(String publishDomain) {
            this.publishDomain = publishDomain;
            return this;
        }
        public String getPublishDomain() {
            return this.publishDomain;
        }

        public DescribeLiveStreamsOnlineListResponseOnlineInfoLiveStreamOnlineInfo setPublishType(String publishType) {
            this.publishType = publishType;
            return this;
        }
        public String getPublishType() {
            return this.publishType;
        }

        public DescribeLiveStreamsOnlineListResponseOnlineInfoLiveStreamOnlineInfo setTranscoded(String transcoded) {
            this.transcoded = transcoded;
            return this;
        }
        public String getTranscoded() {
            return this.transcoded;
        }

        public DescribeLiveStreamsOnlineListResponseOnlineInfoLiveStreamOnlineInfo setTranscodeId(String transcodeId) {
            this.transcodeId = transcodeId;
            return this;
        }
        public String getTranscodeId() {
            return this.transcodeId;
        }

        public DescribeLiveStreamsOnlineListResponseOnlineInfoLiveStreamOnlineInfo setServerIp(String serverIp) {
            this.serverIp = serverIp;
            return this;
        }
        public String getServerIp() {
            return this.serverIp;
        }

        public DescribeLiveStreamsOnlineListResponseOnlineInfoLiveStreamOnlineInfo setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

        public DescribeLiveStreamsOnlineListResponseOnlineInfoLiveStreamOnlineInfo setVideoCodecId(Integer videoCodecId) {
            this.videoCodecId = videoCodecId;
            return this;
        }
        public Integer getVideoCodecId() {
            return this.videoCodecId;
        }

        public DescribeLiveStreamsOnlineListResponseOnlineInfoLiveStreamOnlineInfo setVideoDataRate(Integer videoDataRate) {
            this.videoDataRate = videoDataRate;
            return this;
        }
        public Integer getVideoDataRate() {
            return this.videoDataRate;
        }

        public DescribeLiveStreamsOnlineListResponseOnlineInfoLiveStreamOnlineInfo setFrameRate(Integer frameRate) {
            this.frameRate = frameRate;
            return this;
        }
        public Integer getFrameRate() {
            return this.frameRate;
        }

        public DescribeLiveStreamsOnlineListResponseOnlineInfoLiveStreamOnlineInfo setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public DescribeLiveStreamsOnlineListResponseOnlineInfoLiveStreamOnlineInfo setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public DescribeLiveStreamsOnlineListResponseOnlineInfoLiveStreamOnlineInfo setAudioCodecId(Integer audioCodecId) {
            this.audioCodecId = audioCodecId;
            return this;
        }
        public Integer getAudioCodecId() {
            return this.audioCodecId;
        }

        public DescribeLiveStreamsOnlineListResponseOnlineInfoLiveStreamOnlineInfo setAudioDataRate(Integer audioDataRate) {
            this.audioDataRate = audioDataRate;
            return this;
        }
        public Integer getAudioDataRate() {
            return this.audioDataRate;
        }

    }

    public static class DescribeLiveStreamsOnlineListResponseOnlineInfo extends TeaModel {
        @NameInMap("LiveStreamOnlineInfo")
        @Validation(required = true)
        public java.util.List<DescribeLiveStreamsOnlineListResponseOnlineInfoLiveStreamOnlineInfo> liveStreamOnlineInfo;

        public static DescribeLiveStreamsOnlineListResponseOnlineInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamsOnlineListResponseOnlineInfo self = new DescribeLiveStreamsOnlineListResponseOnlineInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamsOnlineListResponseOnlineInfo setLiveStreamOnlineInfo(java.util.List<DescribeLiveStreamsOnlineListResponseOnlineInfoLiveStreamOnlineInfo> liveStreamOnlineInfo) {
            this.liveStreamOnlineInfo = liveStreamOnlineInfo;
            return this;
        }
        public java.util.List<DescribeLiveStreamsOnlineListResponseOnlineInfoLiveStreamOnlineInfo> getLiveStreamOnlineInfo() {
            return this.liveStreamOnlineInfo;
        }

    }

}
