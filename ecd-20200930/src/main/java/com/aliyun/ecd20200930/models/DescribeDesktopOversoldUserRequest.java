// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopOversoldUserRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("EndUserId")
    public String endUserId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OversoldGroupId")
    public String oversoldGroupId;

    @NameInMap("UserDesktopIds")
    public java.util.List<String> userDesktopIds;

    @NameInMap("UserGroupId")
    public String userGroupId;

    public static DescribeDesktopOversoldUserRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDesktopOversoldUserRequest self = new DescribeDesktopOversoldUserRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDesktopOversoldUserRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeDesktopOversoldUserRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public DescribeDesktopOversoldUserRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeDesktopOversoldUserRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDesktopOversoldUserRequest setOversoldGroupId(String oversoldGroupId) {
        this.oversoldGroupId = oversoldGroupId;
        return this;
    }
    public String getOversoldGroupId() {
        return this.oversoldGroupId;
    }

    public DescribeDesktopOversoldUserRequest setUserDesktopIds(java.util.List<String> userDesktopIds) {
        this.userDesktopIds = userDesktopIds;
        return this;
    }
    public java.util.List<String> getUserDesktopIds() {
        return this.userDesktopIds;
    }

    public DescribeDesktopOversoldUserRequest setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public String getUserGroupId() {
        return this.userGroupId;
    }

}
