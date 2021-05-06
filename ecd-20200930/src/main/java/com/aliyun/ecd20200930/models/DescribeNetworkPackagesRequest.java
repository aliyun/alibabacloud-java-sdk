// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeNetworkPackagesRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("NetworkPackageId")
    public java.util.List<String> networkPackageId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    public static DescribeNetworkPackagesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkPackagesRequest self = new DescribeNetworkPackagesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkPackagesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeNetworkPackagesRequest setNetworkPackageId(java.util.List<String> networkPackageId) {
        this.networkPackageId = networkPackageId;
        return this;
    }
    public java.util.List<String> getNetworkPackageId() {
        return this.networkPackageId;
    }

    public DescribeNetworkPackagesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeNetworkPackagesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
