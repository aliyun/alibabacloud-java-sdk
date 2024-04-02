// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeWebsiteInstanceKeyUrlResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("WebsiteInstanceKeyUrlList")
    public java.util.List<String> websiteInstanceKeyUrlList;

    public static DescribeWebsiteInstanceKeyUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebsiteInstanceKeyUrlResponseBody self = new DescribeWebsiteInstanceKeyUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWebsiteInstanceKeyUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWebsiteInstanceKeyUrlResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeWebsiteInstanceKeyUrlResponseBody setWebsiteInstanceKeyUrlList(java.util.List<String> websiteInstanceKeyUrlList) {
        this.websiteInstanceKeyUrlList = websiteInstanceKeyUrlList;
        return this;
    }
    public java.util.List<String> getWebsiteInstanceKeyUrlList() {
        return this.websiteInstanceKeyUrlList;
    }

}
