// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamsBlockListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

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

    @NameInMap("StreamUrls")
    @Validation(required = true)
    public DescribeLiveStreamsBlockListResponseStreamUrls streamUrls;

    public static DescribeLiveStreamsBlockListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamsBlockListResponse self = new DescribeLiveStreamsBlockListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamsBlockListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveStreamsBlockListResponse setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveStreamsBlockListResponse setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeLiveStreamsBlockListResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLiveStreamsBlockListResponse setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public DescribeLiveStreamsBlockListResponse setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public DescribeLiveStreamsBlockListResponse setStreamUrls(DescribeLiveStreamsBlockListResponseStreamUrls streamUrls) {
        this.streamUrls = streamUrls;
        return this;
    }
    public DescribeLiveStreamsBlockListResponseStreamUrls getStreamUrls() {
        return this.streamUrls;
    }

    public static class DescribeLiveStreamsBlockListResponseStreamUrls extends TeaModel {
        @NameInMap("StreamUrl")
        @Validation(required = true)
        public java.util.List<String> streamUrl;

        public static DescribeLiveStreamsBlockListResponseStreamUrls build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamsBlockListResponseStreamUrls self = new DescribeLiveStreamsBlockListResponseStreamUrls();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamsBlockListResponseStreamUrls setStreamUrl(java.util.List<String> streamUrl) {
            this.streamUrl = streamUrl;
            return this;
        }
        public java.util.List<String> getStreamUrl() {
            return this.streamUrl;
        }

    }

}
