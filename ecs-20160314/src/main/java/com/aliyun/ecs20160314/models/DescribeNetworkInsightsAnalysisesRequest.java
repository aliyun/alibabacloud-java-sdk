// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeNetworkInsightsAnalysisesRequest extends TeaModel {
    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NetworkInsightsAnalysisId")
    public java.util.List<String> networkInsightsAnalysisId;

    @NameInMap("NetworkInsightsPathId")
    public String networkInsightsPathId;

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

    public static DescribeNetworkInsightsAnalysisesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkInsightsAnalysisesRequest self = new DescribeNetworkInsightsAnalysisesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkInsightsAnalysisesRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DescribeNetworkInsightsAnalysisesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeNetworkInsightsAnalysisesRequest setNetworkInsightsAnalysisId(java.util.List<String> networkInsightsAnalysisId) {
        this.networkInsightsAnalysisId = networkInsightsAnalysisId;
        return this;
    }
    public java.util.List<String> getNetworkInsightsAnalysisId() {
        return this.networkInsightsAnalysisId;
    }

    public DescribeNetworkInsightsAnalysisesRequest setNetworkInsightsPathId(String networkInsightsPathId) {
        this.networkInsightsPathId = networkInsightsPathId;
        return this;
    }
    public String getNetworkInsightsPathId() {
        return this.networkInsightsPathId;
    }

    public DescribeNetworkInsightsAnalysisesRequest setNetworkPathFound(String networkPathFound) {
        this.networkPathFound = networkPathFound;
        return this;
    }
    public String getNetworkPathFound() {
        return this.networkPathFound;
    }

    public DescribeNetworkInsightsAnalysisesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeNetworkInsightsAnalysisesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeNetworkInsightsAnalysisesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeNetworkInsightsAnalysisesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
