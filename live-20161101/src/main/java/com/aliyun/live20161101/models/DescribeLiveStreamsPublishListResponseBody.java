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

    /**
     * <p>The information about the stream ingest records.</p>
     */
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
        /**
         * <p>Internal error</p>
         * 
         * <strong>example:</strong>
         * <p>3000001</p>
         */
        @NameInMap("AliInnerErrorFlags")
        public String aliInnerErrorFlags;

        /**
         * <p>The name of the application to which the live stream belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>liveApp****</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The IP address of the client that ingested the live stream.</p>
         * 
         * <strong>example:</strong>
         * <p>10.175.XX.XX</p>
         */
        @NameInMap("ClientAddr")
        public String clientAddr;

        /**
         * <p>The ingest domain or main streaming domain.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The IP address of the CDN point of presence (POP) to which the stream was ingested.</p>
         * 
         * <strong>example:</strong>
         * <p>10.175.XX.XX</p>
         */
        @NameInMap("EdgeNodeAddr")
        public String edgeNodeAddr;

        /**
         * <p>The ingest domain.</p>
         * 
         * <strong>example:</strong>
         * <p>demo.aliyundoc.com</p>
         */
        @NameInMap("PublishDomain")
        public String publishDomain;

        /**
         * <p>The time when the stream ingest was started. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-12-02T03:05:53Z</p>
         */
        @NameInMap("PublishTime")
        public String publishTime;

        /**
         * <p>The type of the stream ingest. Valid values:</p>
         * <ul>
         * <li><strong>edge</strong>: edge ingest</li>
         * <li><strong>center</strong>: live center ingest</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>edge</p>
         */
        @NameInMap("PublishType")
        public String publishType;

        /**
         * <p>The complete ingest URL.</p>
         */
        @NameInMap("PublishUrl")
        public String publishUrl;

        /**
         * <p>The time when the stream ingest was stopped. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-12-02T03:11:19Z</p>
         */
        @NameInMap("StopTime")
        public String stopTime;

        /**
         * <p>The name of the live stream.</p>
         * 
         * <strong>example:</strong>
         * <p>liveStream****</p>
         */
        @NameInMap("StreamName")
        public String streamName;

        /**
         * <p>The streaming URL.</p>
         */
        @NameInMap("StreamUrl")
        public String streamUrl;

        /**
         * <p>The ID of the transcoding template.</p>
         * <blockquote>
         * <p> This parameter is not returned if the value of the Transcoded parameter is no.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ld</p>
         */
        @NameInMap("TranscodeId")
        public String transcodeId;

        /**
         * <p>Indicates whether the stream was a transcoded stream.</p>
         * 
         * <strong>example:</strong>
         * <p>yes</p>
         */
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
