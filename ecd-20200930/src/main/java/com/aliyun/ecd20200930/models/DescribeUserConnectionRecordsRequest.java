// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeUserConnectionRecordsRequest extends TeaModel {
    @NameInMap("DesktopGroupId")
    public String desktopGroupId;

    @NameInMap("EndUserId")
    public String endUserId;

    @NameInMap("EndUserType")
    public String endUserType;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeUserConnectionRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserConnectionRecordsRequest self = new DescribeUserConnectionRecordsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserConnectionRecordsRequest setDesktopGroupId(String desktopGroupId) {
        this.desktopGroupId = desktopGroupId;
        return this;
    }
    public String getDesktopGroupId() {
        return this.desktopGroupId;
    }

    public DescribeUserConnectionRecordsRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public DescribeUserConnectionRecordsRequest setEndUserType(String endUserType) {
        this.endUserType = endUserType;
        return this;
    }
    public String getEndUserType() {
        return this.endUserType;
    }

    public DescribeUserConnectionRecordsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeUserConnectionRecordsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeUserConnectionRecordsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
