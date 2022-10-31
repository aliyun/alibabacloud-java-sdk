// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamsBlockListResponseBody extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StreamUrls")
    public DescribeLiveStreamsBlockListResponseBodyStreamUrls streamUrls;

    @NameInMap("TotalNum")
    public Integer totalNum;

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
