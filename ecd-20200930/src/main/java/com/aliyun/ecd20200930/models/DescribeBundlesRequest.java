// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeBundlesRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("BundleId")
    public java.util.List<String> bundleId;

    @NameInMap("BundleType")
    public String bundleType;

    public static DescribeBundlesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBundlesRequest self = new DescribeBundlesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBundlesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeBundlesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeBundlesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeBundlesRequest setBundleId(java.util.List<String> bundleId) {
        this.bundleId = bundleId;
        return this;
    }
    public java.util.List<String> getBundleId() {
        return this.bundleId;
    }

    public DescribeBundlesRequest setBundleType(String bundleType) {
        this.bundleType = bundleType;
        return this;
    }
    public String getBundleType() {
        return this.bundleType;
    }

}
