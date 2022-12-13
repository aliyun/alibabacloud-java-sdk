// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeVulOverviewResponseBody extends TeaModel {
    // The number of high-risk vulnerabilities.
    @NameInMap("AsapCount")
    public Integer asapCount;

    // The number of medium-risk vulnerabilities.
    @NameInMap("LaterCount")
    public Integer laterCount;

    // The number of low-risk vulnerabilities.
    @NameInMap("NntfCount")
    public Integer nntfCount;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeVulOverviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVulOverviewResponseBody self = new DescribeVulOverviewResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVulOverviewResponseBody setAsapCount(Integer asapCount) {
        this.asapCount = asapCount;
        return this;
    }
    public Integer getAsapCount() {
        return this.asapCount;
    }

    public DescribeVulOverviewResponseBody setLaterCount(Integer laterCount) {
        this.laterCount = laterCount;
        return this;
    }
    public Integer getLaterCount() {
        return this.laterCount;
    }

    public DescribeVulOverviewResponseBody setNntfCount(Integer nntfCount) {
        this.nntfCount = nntfCount;
        return this;
    }
    public Integer getNntfCount() {
        return this.nntfCount;
    }

    public DescribeVulOverviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
