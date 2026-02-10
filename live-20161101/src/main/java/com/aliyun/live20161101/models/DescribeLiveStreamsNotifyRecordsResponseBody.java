// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamsNotifyRecordsResponseBody extends TeaModel {
    @NameInMap("NotifyRecordsInfo")
    public DescribeLiveStreamsNotifyRecordsResponseBodyNotifyRecordsInfo notifyRecordsInfo;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F675E4B4-125D-1533-901B-11A724644285</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries that meet the specified conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalNum")
    public Integer totalNum;

    /**
     * <p>The total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalPage")
    public Integer totalPage;

    public static DescribeLiveStreamsNotifyRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamsNotifyRecordsResponseBody self = new DescribeLiveStreamsNotifyRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamsNotifyRecordsResponseBody setNotifyRecordsInfo(DescribeLiveStreamsNotifyRecordsResponseBodyNotifyRecordsInfo notifyRecordsInfo) {
        this.notifyRecordsInfo = notifyRecordsInfo;
        return this;
    }
    public DescribeLiveStreamsNotifyRecordsResponseBodyNotifyRecordsInfo getNotifyRecordsInfo() {
        return this.notifyRecordsInfo;
    }

    public DescribeLiveStreamsNotifyRecordsResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeLiveStreamsNotifyRecordsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLiveStreamsNotifyRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveStreamsNotifyRecordsResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public DescribeLiveStreamsNotifyRecordsResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeLiveStreamsNotifyRecordsResponseBodyNotifyRecordsInfoLiveStreamNotifyRecordsInfo extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("Description")
        public String description;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("NotifyContent")
        public String notifyContent;

        @NameInMap("NotifyHeader")
        public String notifyHeader;

        @NameInMap("NotifyResponse")
        public String notifyResponse;

        @NameInMap("NotifyResult")
        public String notifyResult;

        @NameInMap("NotifyTime")
        public String notifyTime;

        @NameInMap("NotifyType")
        public String notifyType;

        @NameInMap("NotifyUrl")
        public String notifyUrl;

        @NameInMap("StreamName")
        public String streamName;

        public static DescribeLiveStreamsNotifyRecordsResponseBodyNotifyRecordsInfoLiveStreamNotifyRecordsInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamsNotifyRecordsResponseBodyNotifyRecordsInfoLiveStreamNotifyRecordsInfo self = new DescribeLiveStreamsNotifyRecordsResponseBodyNotifyRecordsInfoLiveStreamNotifyRecordsInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamsNotifyRecordsResponseBodyNotifyRecordsInfoLiveStreamNotifyRecordsInfo setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeLiveStreamsNotifyRecordsResponseBodyNotifyRecordsInfoLiveStreamNotifyRecordsInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeLiveStreamsNotifyRecordsResponseBodyNotifyRecordsInfoLiveStreamNotifyRecordsInfo setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeLiveStreamsNotifyRecordsResponseBodyNotifyRecordsInfoLiveStreamNotifyRecordsInfo setNotifyContent(String notifyContent) {
            this.notifyContent = notifyContent;
            return this;
        }
        public String getNotifyContent() {
            return this.notifyContent;
        }

        public DescribeLiveStreamsNotifyRecordsResponseBodyNotifyRecordsInfoLiveStreamNotifyRecordsInfo setNotifyHeader(String notifyHeader) {
            this.notifyHeader = notifyHeader;
            return this;
        }
        public String getNotifyHeader() {
            return this.notifyHeader;
        }

        public DescribeLiveStreamsNotifyRecordsResponseBodyNotifyRecordsInfoLiveStreamNotifyRecordsInfo setNotifyResponse(String notifyResponse) {
            this.notifyResponse = notifyResponse;
            return this;
        }
        public String getNotifyResponse() {
            return this.notifyResponse;
        }

        public DescribeLiveStreamsNotifyRecordsResponseBodyNotifyRecordsInfoLiveStreamNotifyRecordsInfo setNotifyResult(String notifyResult) {
            this.notifyResult = notifyResult;
            return this;
        }
        public String getNotifyResult() {
            return this.notifyResult;
        }

        public DescribeLiveStreamsNotifyRecordsResponseBodyNotifyRecordsInfoLiveStreamNotifyRecordsInfo setNotifyTime(String notifyTime) {
            this.notifyTime = notifyTime;
            return this;
        }
        public String getNotifyTime() {
            return this.notifyTime;
        }

        public DescribeLiveStreamsNotifyRecordsResponseBodyNotifyRecordsInfoLiveStreamNotifyRecordsInfo setNotifyType(String notifyType) {
            this.notifyType = notifyType;
            return this;
        }
        public String getNotifyType() {
            return this.notifyType;
        }

        public DescribeLiveStreamsNotifyRecordsResponseBodyNotifyRecordsInfoLiveStreamNotifyRecordsInfo setNotifyUrl(String notifyUrl) {
            this.notifyUrl = notifyUrl;
            return this;
        }
        public String getNotifyUrl() {
            return this.notifyUrl;
        }

        public DescribeLiveStreamsNotifyRecordsResponseBodyNotifyRecordsInfoLiveStreamNotifyRecordsInfo setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

    }

    public static class DescribeLiveStreamsNotifyRecordsResponseBodyNotifyRecordsInfo extends TeaModel {
        @NameInMap("LiveStreamNotifyRecordsInfo")
        public java.util.List<DescribeLiveStreamsNotifyRecordsResponseBodyNotifyRecordsInfoLiveStreamNotifyRecordsInfo> liveStreamNotifyRecordsInfo;

        public static DescribeLiveStreamsNotifyRecordsResponseBodyNotifyRecordsInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamsNotifyRecordsResponseBodyNotifyRecordsInfo self = new DescribeLiveStreamsNotifyRecordsResponseBodyNotifyRecordsInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamsNotifyRecordsResponseBodyNotifyRecordsInfo setLiveStreamNotifyRecordsInfo(java.util.List<DescribeLiveStreamsNotifyRecordsResponseBodyNotifyRecordsInfoLiveStreamNotifyRecordsInfo> liveStreamNotifyRecordsInfo) {
            this.liveStreamNotifyRecordsInfo = liveStreamNotifyRecordsInfo;
            return this;
        }
        public java.util.List<DescribeLiveStreamsNotifyRecordsResponseBodyNotifyRecordsInfoLiveStreamNotifyRecordsInfo> getLiveStreamNotifyRecordsInfo() {
            return this.liveStreamNotifyRecordsInfo;
        }

    }

}
