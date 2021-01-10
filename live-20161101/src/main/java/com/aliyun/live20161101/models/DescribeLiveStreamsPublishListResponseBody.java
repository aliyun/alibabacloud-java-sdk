// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamsPublishListResponseBody extends TeaModel {
    @NameInMap("TotalNum")
    public Integer totalNum;

    @NameInMap("TotalPage")
    public Integer totalPage;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PublishInfo")
    public DescribeLiveStreamsPublishListResponseBodyPublishInfo publishInfo;

    public static DescribeLiveStreamsPublishListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamsPublishListResponseBody self = new DescribeLiveStreamsPublishListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamsPublishListResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public DescribeLiveStreamsPublishListResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public DescribeLiveStreamsPublishListResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeLiveStreamsPublishListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLiveStreamsPublishListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveStreamsPublishListResponseBody setPublishInfo(DescribeLiveStreamsPublishListResponseBodyPublishInfo publishInfo) {
        this.publishInfo = publishInfo;
        return this;
    }
    public DescribeLiveStreamsPublishListResponseBodyPublishInfo getPublishInfo() {
        return this.publishInfo;
    }

    public static class DescribeLiveStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo extends TeaModel {
        @NameInMap("EdgeNodeAddr")
        public String edgeNodeAddr;

        @NameInMap("PublishUrl")
        public String publishUrl;

        @NameInMap("StreamName")
        public String streamName;

        @NameInMap("StopTime")
        public String stopTime;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("TranscodeId")
        public String transcodeId;

        @NameInMap("PublishDomain")
        public String publishDomain;

        @NameInMap("PublishTime")
        public String publishTime;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("PublishType")
        public String publishType;

        @NameInMap("Transcoded")
        public String transcoded;

        @NameInMap("ClientAddr")
        public String clientAddr;

        @NameInMap("StreamUrl")
        public String streamUrl;

        public static DescribeLiveStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo self = new DescribeLiveStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo setEdgeNodeAddr(String edgeNodeAddr) {
            this.edgeNodeAddr = edgeNodeAddr;
            return this;
        }
        public String getEdgeNodeAddr() {
            return this.edgeNodeAddr;
        }

        public DescribeLiveStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo setPublishUrl(String publishUrl) {
            this.publishUrl = publishUrl;
            return this;
        }
        public String getPublishUrl() {
            return this.publishUrl;
        }

        public DescribeLiveStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

        public DescribeLiveStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo setStopTime(String stopTime) {
            this.stopTime = stopTime;
            return this;
        }
        public String getStopTime() {
            return this.stopTime;
        }

        public DescribeLiveStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeLiveStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo setTranscodeId(String transcodeId) {
            this.transcodeId = transcodeId;
            return this;
        }
        public String getTranscodeId() {
            return this.transcodeId;
        }

        public DescribeLiveStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo setPublishDomain(String publishDomain) {
            this.publishDomain = publishDomain;
            return this;
        }
        public String getPublishDomain() {
            return this.publishDomain;
        }

        public DescribeLiveStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo setPublishTime(String publishTime) {
            this.publishTime = publishTime;
            return this;
        }
        public String getPublishTime() {
            return this.publishTime;
        }

        public DescribeLiveStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeLiveStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo setPublishType(String publishType) {
            this.publishType = publishType;
            return this;
        }
        public String getPublishType() {
            return this.publishType;
        }

        public DescribeLiveStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo setTranscoded(String transcoded) {
            this.transcoded = transcoded;
            return this;
        }
        public String getTranscoded() {
            return this.transcoded;
        }

        public DescribeLiveStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo setClientAddr(String clientAddr) {
            this.clientAddr = clientAddr;
            return this;
        }
        public String getClientAddr() {
            return this.clientAddr;
        }

        public DescribeLiveStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo setStreamUrl(String streamUrl) {
            this.streamUrl = streamUrl;
            return this;
        }
        public String getStreamUrl() {
            return this.streamUrl;
        }

    }

    public static class DescribeLiveStreamsPublishListResponseBodyPublishInfo extends TeaModel {
        @NameInMap("LiveStreamPublishInfo")
        public java.util.List<DescribeLiveStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo> liveStreamPublishInfo;

        public static DescribeLiveStreamsPublishListResponseBodyPublishInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamsPublishListResponseBodyPublishInfo self = new DescribeLiveStreamsPublishListResponseBodyPublishInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamsPublishListResponseBodyPublishInfo setLiveStreamPublishInfo(java.util.List<DescribeLiveStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo> liveStreamPublishInfo) {
            this.liveStreamPublishInfo = liveStreamPublishInfo;
            return this;
        }
        public java.util.List<DescribeLiveStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo> getLiveStreamPublishInfo() {
            return this.liveStreamPublishInfo;
        }

    }

}
