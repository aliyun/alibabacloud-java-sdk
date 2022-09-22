// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeNetworkInsightsPathsRequest extends TeaModel {
    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NetworkInsightsPathId")
    public java.util.List<String> networkInsightsPathId;

    @NameInMap("NetworkPathFound")
    public String networkPathFound;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Status")
    public String status;

    public static DescribeNetworkInsightsPathsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkInsightsPathsRequest self = new DescribeNetworkInsightsPathsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkInsightsPathsRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DescribeNetworkInsightsPathsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeNetworkInsightsPathsRequest setNetworkInsightsPathId(java.util.List<String> networkInsightsPathId) {
        this.networkInsightsPathId = networkInsightsPathId;
        return this;
    }
    public java.util.List<String> getNetworkInsightsPathId() {
        return this.networkInsightsPathId;
    }

    public DescribeNetworkInsightsPathsRequest setNetworkPathFound(String networkPathFound) {
        this.networkPathFound = networkPathFound;
        return this;
    }
    public String getNetworkPathFound() {
        return this.networkPathFound;
    }

    public DescribeNetworkInsightsPathsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeNetworkInsightsPathsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeNetworkInsightsPathsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeNetworkInsightsPathsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
