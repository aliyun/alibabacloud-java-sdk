// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeVulOverviewResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AsapCount")
    @Validation(required = true)
    public Integer asapCount;

    @NameInMap("LaterCount")
    @Validation(required = true)
    public Integer laterCount;

    @NameInMap("NntfCount")
    @Validation(required = true)
    public Integer nntfCount;

    public static DescribeVulOverviewResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVulOverviewResponse self = new DescribeVulOverviewResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVulOverviewResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVulOverviewResponse setAsapCount(Integer asapCount) {
        this.asapCount = asapCount;
        return this;
    }
    public Integer getAsapCount() {
        return this.asapCount;
    }

    public DescribeVulOverviewResponse setLaterCount(Integer laterCount) {
        this.laterCount = laterCount;
        return this;
    }
    public Integer getLaterCount() {
        return this.laterCount;
    }

    public DescribeVulOverviewResponse setNntfCount(Integer nntfCount) {
        this.nntfCount = nntfCount;
        return this;
    }
    public Integer getNntfCount() {
        return this.nntfCount;
    }

}
