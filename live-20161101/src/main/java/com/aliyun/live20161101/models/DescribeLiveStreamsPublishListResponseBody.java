// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamsPublishListResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PublishInfo")
    public DescribeLiveStreamsPublishListResponseBodyPublishInfo publishInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>40A4F36D-A7CC-473A-88E7-154F92242566</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries that meet the specified conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("TotalNum")
    public Integer totalNum;

    /**
     * <p>The total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalPage")
    public Integer totalPage;

    public static DescribeLiveStreamsPublishListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamsPublishListResponseBody self = new DescribeLiveStreamsPublishListResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeLiveStreamsPublishListResponseBody setPublishInfo(DescribeLiveStreamsPublishListResponseBodyPublishInfo publishInfo) {
        this.publishInfo = publishInfo;
        return this;
    }
    public DescribeLiveStreamsPublishListResponseBodyPublishInfo getPublishInfo() {
        return this.publishInfo;
    }

    public DescribeLiveStreamsPublishListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

    public static class DescribeLiveStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo extends TeaModel {
        @NameInMap("AliInnerErrorFlags")
        public String aliInnerErrorFlags;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("ClientAddr")
        public String clientAddr;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("EdgeNodeAddr")
        public String edgeNodeAddr;

        @NameInMap("PublishDomain")
        public String publishDomain;

        @NameInMap("PublishTime")
        public String publishTime;

        @NameInMap("PublishType")
        public String publishType;

        @NameInMap("PublishUrl")
        public String publishUrl;

        @NameInMap("StopTime")
        public String stopTime;

        @NameInMap("StreamName")
        public String streamName;

        @NameInMap("StreamUrl")
        public String streamUrl;

        @NameInMap("TranscodeId")
        public String transcodeId;

        @NameInMap("Transcoded")
        public String transcoded;

        public static DescribeLiveStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo self = new DescribeLiveStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo setAliInnerErrorFlags(String aliInnerErrorFlags) {
            this.aliInnerErrorFlags = aliInnerErrorFlags;
            return this;
        }
        public String getAliInnerErrorFlags() {
            return this.aliInnerErrorFlags;
        }

        public DescribeLiveStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeLiveStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo setClientAddr(String clientAddr) {
            this.clientAddr = clientAddr;
            return this;
        }
        public String getClientAddr() {
            return this.clientAddr;
        }

        public DescribeLiveStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeLiveStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo setEdgeNodeAddr(String edgeNodeAddr) {
            this.edgeNodeAddr = edgeNodeAddr;
            return this;
        }
        public String getEdgeNodeAddr() {
            return this.edgeNodeAddr;
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

        public DescribeLiveStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo setPublishType(String publishType) {
            this.publishType = publishType;
            return this;
        }
        public String getPublishType() {
            return this.publishType;
        }

        public DescribeLiveStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo setPublishUrl(String publishUrl) {
            this.publishUrl = publishUrl;
            return this;
        }
        public String getPublishUrl() {
            return this.publishUrl;
        }

        public DescribeLiveStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo setStopTime(String stopTime) {
            this.stopTime = stopTime;
            return this;
        }
        public String getStopTime() {
            return this.stopTime;
        }

        public DescribeLiveStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

        public DescribeLiveStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo setStreamUrl(String streamUrl) {
            this.streamUrl = streamUrl;
            return this;
        }
        public String getStreamUrl() {
            return this.streamUrl;
        }

        public DescribeLiveStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo setTranscodeId(String transcodeId) {
            this.transcodeId = transcodeId;
            return this;
        }
        public String getTranscodeId() {
            return this.transcodeId;
        }

        public DescribeLiveStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo setTranscoded(String transcoded) {
            this.transcoded = transcoded;
            return this;
        }
        public String getTranscoded() {
            return this.transcoded;
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
