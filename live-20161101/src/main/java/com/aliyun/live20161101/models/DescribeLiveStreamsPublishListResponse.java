// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamsPublishListResponse extends TeaModel {
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

    @NameInMap("PublishInfo")
    @Validation(required = true)
    public DescribeLiveStreamsPublishListResponsePublishInfo publishInfo;

    public static DescribeLiveStreamsPublishListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamsPublishListResponse self = new DescribeLiveStreamsPublishListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamsPublishListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveStreamsPublishListResponse setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeLiveStreamsPublishListResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLiveStreamsPublishListResponse setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public DescribeLiveStreamsPublishListResponse setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public DescribeLiveStreamsPublishListResponse setPublishInfo(DescribeLiveStreamsPublishListResponsePublishInfo publishInfo) {
        this.publishInfo = publishInfo;
        return this;
    }
    public DescribeLiveStreamsPublishListResponsePublishInfo getPublishInfo() {
        return this.publishInfo;
    }

    public static class DescribeLiveStreamsPublishListResponsePublishInfoLiveStreamPublishInfo extends TeaModel {
        @NameInMap("DomainName")
        @Validation(required = true)
        public String domainName;

        @NameInMap("AppName")
        @Validation(required = true)
        public String appName;

        @NameInMap("StreamName")
        @Validation(required = true)
        public String streamName;

        @NameInMap("StreamUrl")
        @Validation(required = true)
        public String streamUrl;

        @NameInMap("PublishTime")
        @Validation(required = true)
        public String publishTime;

        @NameInMap("StopTime")
        @Validation(required = true)
        public String stopTime;

        @NameInMap("PublishUrl")
        @Validation(required = true)
        public String publishUrl;

        @NameInMap("ClientAddr")
        @Validation(required = true)
        public String clientAddr;

        @NameInMap("EdgeNodeAddr")
        @Validation(required = true)
        public String edgeNodeAddr;

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

        public static DescribeLiveStreamsPublishListResponsePublishInfoLiveStreamPublishInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamsPublishListResponsePublishInfoLiveStreamPublishInfo self = new DescribeLiveStreamsPublishListResponsePublishInfoLiveStreamPublishInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamsPublishListResponsePublishInfoLiveStreamPublishInfo setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeLiveStreamsPublishListResponsePublishInfoLiveStreamPublishInfo setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeLiveStreamsPublishListResponsePublishInfoLiveStreamPublishInfo setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

        public DescribeLiveStreamsPublishListResponsePublishInfoLiveStreamPublishInfo setStreamUrl(String streamUrl) {
            this.streamUrl = streamUrl;
            return this;
        }
        public String getStreamUrl() {
            return this.streamUrl;
        }

        public DescribeLiveStreamsPublishListResponsePublishInfoLiveStreamPublishInfo setPublishTime(String publishTime) {
            this.publishTime = publishTime;
            return this;
        }
        public String getPublishTime() {
            return this.publishTime;
        }

        public DescribeLiveStreamsPublishListResponsePublishInfoLiveStreamPublishInfo setStopTime(String stopTime) {
            this.stopTime = stopTime;
            return this;
        }
        public String getStopTime() {
            return this.stopTime;
        }

        public DescribeLiveStreamsPublishListResponsePublishInfoLiveStreamPublishInfo setPublishUrl(String publishUrl) {
            this.publishUrl = publishUrl;
            return this;
        }
        public String getPublishUrl() {
            return this.publishUrl;
        }

        public DescribeLiveStreamsPublishListResponsePublishInfoLiveStreamPublishInfo setClientAddr(String clientAddr) {
            this.clientAddr = clientAddr;
            return this;
        }
        public String getClientAddr() {
            return this.clientAddr;
        }

        public DescribeLiveStreamsPublishListResponsePublishInfoLiveStreamPublishInfo setEdgeNodeAddr(String edgeNodeAddr) {
            this.edgeNodeAddr = edgeNodeAddr;
            return this;
        }
        public String getEdgeNodeAddr() {
            return this.edgeNodeAddr;
        }

        public DescribeLiveStreamsPublishListResponsePublishInfoLiveStreamPublishInfo setPublishDomain(String publishDomain) {
            this.publishDomain = publishDomain;
            return this;
        }
        public String getPublishDomain() {
            return this.publishDomain;
        }

        public DescribeLiveStreamsPublishListResponsePublishInfoLiveStreamPublishInfo setPublishType(String publishType) {
            this.publishType = publishType;
            return this;
        }
        public String getPublishType() {
            return this.publishType;
        }

        public DescribeLiveStreamsPublishListResponsePublishInfoLiveStreamPublishInfo setTranscoded(String transcoded) {
            this.transcoded = transcoded;
            return this;
        }
        public String getTranscoded() {
            return this.transcoded;
        }

        public DescribeLiveStreamsPublishListResponsePublishInfoLiveStreamPublishInfo setTranscodeId(String transcodeId) {
            this.transcodeId = transcodeId;
            return this;
        }
        public String getTranscodeId() {
            return this.transcodeId;
        }

    }

    public static class DescribeLiveStreamsPublishListResponsePublishInfo extends TeaModel {
        @NameInMap("LiveStreamPublishInfo")
        @Validation(required = true)
        public java.util.List<DescribeLiveStreamsPublishListResponsePublishInfoLiveStreamPublishInfo> liveStreamPublishInfo;

        public static DescribeLiveStreamsPublishListResponsePublishInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamsPublishListResponsePublishInfo self = new DescribeLiveStreamsPublishListResponsePublishInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamsPublishListResponsePublishInfo setLiveStreamPublishInfo(java.util.List<DescribeLiveStreamsPublishListResponsePublishInfoLiveStreamPublishInfo> liveStreamPublishInfo) {
            this.liveStreamPublishInfo = liveStreamPublishInfo;
            return this;
        }
        public java.util.List<DescribeLiveStreamsPublishListResponsePublishInfoLiveStreamPublishInfo> getLiveStreamPublishInfo() {
            return this.liveStreamPublishInfo;
        }

    }

}
