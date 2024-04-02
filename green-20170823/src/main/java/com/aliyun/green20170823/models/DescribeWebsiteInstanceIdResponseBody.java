// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeWebsiteInstanceIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("WebsiteInstanceIdList")
    public java.util.List<String> websiteInstanceIdList;

    public static DescribeWebsiteInstanceIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebsiteInstanceIdResponseBody self = new DescribeWebsiteInstanceIdResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWebsiteInstanceIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWebsiteInstanceIdResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeWebsiteInstanceIdResponseBody setWebsiteInstanceIdList(java.util.List<String> websiteInstanceIdList) {
        this.websiteInstanceIdList = websiteInstanceIdList;
        return this;
    }
    public java.util.List<String> getWebsiteInstanceIdList() {
        return this.websiteInstanceIdList;
    }

}
