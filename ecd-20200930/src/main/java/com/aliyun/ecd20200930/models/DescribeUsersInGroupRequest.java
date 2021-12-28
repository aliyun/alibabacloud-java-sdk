// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeUsersInGroupRequest extends TeaModel {
    @NameInMap("ConnectState")
    public Integer connectState;

    @NameInMap("DesktopGroupId")
    public String desktopGroupId;

    @NameInMap("EndUserId")
    public String endUserId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeUsersInGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUsersInGroupRequest self = new DescribeUsersInGroupRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUsersInGroupRequest setConnectState(Integer connectState) {
        this.connectState = connectState;
        return this;
    }
    public Integer getConnectState() {
        return this.connectState;
    }

    public DescribeUsersInGroupRequest setDesktopGroupId(String desktopGroupId) {
        this.desktopGroupId = desktopGroupId;
        return this;
    }
    public String getDesktopGroupId() {
        return this.desktopGroupId;
    }

    public DescribeUsersInGroupRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public DescribeUsersInGroupRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeUsersInGroupRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeUsersInGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
