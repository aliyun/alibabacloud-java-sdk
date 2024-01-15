// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopOversoldGroupRequest extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OversoldGroupIds")
    public java.util.List<String> oversoldGroupIds;

    public static DescribeDesktopOversoldGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDesktopOversoldGroupRequest self = new DescribeDesktopOversoldGroupRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDesktopOversoldGroupRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeDesktopOversoldGroupRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDesktopOversoldGroupRequest setOversoldGroupIds(java.util.List<String> oversoldGroupIds) {
        this.oversoldGroupIds = oversoldGroupIds;
        return this;
    }
    public java.util.List<String> getOversoldGroupIds() {
        return this.oversoldGroupIds;
    }

}
