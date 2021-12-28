// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeCloudDriveServiceRequest extends TeaModel {
    @NameInMap("CdsIds")
    public java.util.List<String> cdsIds;

    @NameInMap("IsTokenNeeded")
    public Boolean isTokenNeeded;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeCloudDriveServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudDriveServiceRequest self = new DescribeCloudDriveServiceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCloudDriveServiceRequest setCdsIds(java.util.List<String> cdsIds) {
        this.cdsIds = cdsIds;
        return this;
    }
    public java.util.List<String> getCdsIds() {
        return this.cdsIds;
    }

    public DescribeCloudDriveServiceRequest setIsTokenNeeded(Boolean isTokenNeeded) {
        this.isTokenNeeded = isTokenNeeded;
        return this;
    }
    public Boolean getIsTokenNeeded() {
        return this.isTokenNeeded;
    }

    public DescribeCloudDriveServiceRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeCloudDriveServiceRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeCloudDriveServiceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
