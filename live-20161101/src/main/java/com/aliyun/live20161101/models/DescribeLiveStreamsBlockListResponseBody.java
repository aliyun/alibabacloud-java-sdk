// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamsBlockListResponseBody extends TeaModel {
    /**
     * <p>The main streaming domain.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
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
     * <p>9D855EC8-CF71-4615-B164-F7DFCB23B41D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StreamUrls")
    public DescribeLiveStreamsBlockListResponseBodyStreamUrls streamUrls;

    /**
     * <p>The total number of live stream URLs that meet the specified conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("TotalNum")
    public Integer totalNum;

    /**
     * <p>The total number of returned pages.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalPage")
    public Integer totalPage;

    public static DescribeLiveStreamsBlockListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamsBlockListResponseBody self = new DescribeLiveStreamsBlockListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamsBlockListResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveStreamsBlockListResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeLiveStreamsBlockListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLiveStreamsBlockListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveStreamsBlockListResponseBody setStreamUrls(DescribeLiveStreamsBlockListResponseBodyStreamUrls streamUrls) {
        this.streamUrls = streamUrls;
        return this;
    }
    public DescribeLiveStreamsBlockListResponseBodyStreamUrls getStreamUrls() {
        return this.streamUrls;
    }

    public DescribeLiveStreamsBlockListResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public DescribeLiveStreamsBlockListResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeLiveStreamsBlockListResponseBodyStreamUrls extends TeaModel {
        @NameInMap("StreamUrl")
        public java.util.List<String> streamUrl;

        public static DescribeLiveStreamsBlockListResponseBodyStreamUrls build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamsBlockListResponseBodyStreamUrls self = new DescribeLiveStreamsBlockListResponseBodyStreamUrls();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamsBlockListResponseBodyStreamUrls setStreamUrl(java.util.List<String> streamUrl) {
            this.streamUrl = streamUrl;
            return this;
        }
        public java.util.List<String> getStreamUrl() {
            return this.streamUrl;
        }

    }

}
