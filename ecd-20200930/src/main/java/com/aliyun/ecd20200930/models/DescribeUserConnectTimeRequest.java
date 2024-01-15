// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeUserConnectTimeRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("EndUserId")
    public String endUserId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OversoldGroupId")
    public String oversoldGroupId;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("UserDesktopId")
    public String userDesktopId;

    @NameInMap("UserGroupId")
    public String userGroupId;

    public static DescribeUserConnectTimeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserConnectTimeRequest self = new DescribeUserConnectTimeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserConnectTimeRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeUserConnectTimeRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public DescribeUserConnectTimeRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeUserConnectTimeRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeUserConnectTimeRequest setOversoldGroupId(String oversoldGroupId) {
        this.oversoldGroupId = oversoldGroupId;
        return this;
    }
    public String getOversoldGroupId() {
        return this.oversoldGroupId;
    }

    public DescribeUserConnectTimeRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeUserConnectTimeRequest setUserDesktopId(String userDesktopId) {
        this.userDesktopId = userDesktopId;
        return this;
    }
    public String getUserDesktopId() {
        return this.userDesktopId;
    }

    public DescribeUserConnectTimeRequest setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public String getUserGroupId() {
        return this.userGroupId;
    }

}
