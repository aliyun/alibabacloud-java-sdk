// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamsOnlineListResponseBody extends TeaModel {
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

    @NameInMap("OnlineInfo")
    public DescribeLiveStreamsOnlineListResponseBodyOnlineInfo onlineInfo;

    public static DescribeLiveStreamsOnlineListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamsOnlineListResponseBody self = new DescribeLiveStreamsOnlineListResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeLiveStreamsOnlineListResponseBody setOnlineInfo(DescribeLiveStreamsOnlineListResponseBodyOnlineInfo onlineInfo) {
        this.onlineInfo = onlineInfo;
        return this;
    }
    public DescribeLiveStreamsOnlineListResponseBodyOnlineInfo getOnlineInfo() {
        return this.onlineInfo;
    }

    public static class DescribeLiveStreamsOnlineListResponseBodyOnlineInfoLiveStreamOnlineInfo extends TeaModel {
        @NameInMap("PublishUrl")
        public String publishUrl;

        @NameInMap("StreamName")
        public String streamName;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("PublishDomain")
        public String publishDomain;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("PublishTime")
        public String publishTime;

        public static DescribeLiveStreamsOnlineListResponseBodyOnlineInfoLiveStreamOnlineInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamsOnlineListResponseBodyOnlineInfoLiveStreamOnlineInfo self = new DescribeLiveStreamsOnlineListResponseBodyOnlineInfoLiveStreamOnlineInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamsOnlineListResponseBodyOnlineInfoLiveStreamOnlineInfo setPublishUrl(String publishUrl) {
            this.publishUrl = publishUrl;
            return this;
        }
        public String getPublishUrl() {
            return this.publishUrl;
        }

        public DescribeLiveStreamsOnlineListResponseBodyOnlineInfoLiveStreamOnlineInfo setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

        public DescribeLiveStreamsOnlineListResponseBodyOnlineInfoLiveStreamOnlineInfo setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeLiveStreamsOnlineListResponseBodyOnlineInfoLiveStreamOnlineInfo setPublishDomain(String publishDomain) {
            this.publishDomain = publishDomain;
            return this;
        }
        public String getPublishDomain() {
            return this.publishDomain;
        }

        public DescribeLiveStreamsOnlineListResponseBodyOnlineInfoLiveStreamOnlineInfo setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeLiveStreamsOnlineListResponseBodyOnlineInfoLiveStreamOnlineInfo setPublishTime(String publishTime) {
            this.publishTime = publishTime;
            return this;
        }
        public String getPublishTime() {
            return this.publishTime;
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
