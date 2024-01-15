// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopOversoldUserGroupRequest extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OversoldGroupId")
    public String oversoldGroupId;

    @NameInMap("UserGroupIds")
    public java.util.List<String> userGroupIds;

    public static DescribeDesktopOversoldUserGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDesktopOversoldUserGroupRequest self = new DescribeDesktopOversoldUserGroupRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDesktopOversoldUserGroupRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeDesktopOversoldUserGroupRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDesktopOversoldUserGroupRequest setOversoldGroupId(String oversoldGroupId) {
        this.oversoldGroupId = oversoldGroupId;
        return this;
    }
    public String getOversoldGroupId() {
        return this.oversoldGroupId;
    }

    public DescribeDesktopOversoldUserGroupRequest setUserGroupIds(java.util.List<String> userGroupIds) {
        this.userGroupIds = userGroupIds;
        return this;
    }
    public java.util.List<String> getUserGroupIds() {
        return this.userGroupIds;
    }

}
