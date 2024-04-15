// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeNetworkPackagesRequest extends TeaModel {
    /**
     * <p>The charge type of the pay-as-you-go premium bandwidth plan.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   PayByTraffic: charges by data transfer.</p>
     * <br>
     * <p>*   PayByBandwidth: charges by fixed bandwidth.</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>*   Maximum value: 100</p>
     * <p>*   Default value: 10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The ID of the premium bandwidth plan. You can specify 1 to 100 IDs.</p>
     */
    @NameInMap("NetworkPackageId")
    public java.util.List<String> networkPackageId;

    /**
     * <p>The token that determines the start point of the next query.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeNetworkPackagesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkPackagesRequest self = new DescribeNetworkPackagesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkPackagesRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public DescribeNetworkPackagesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeNetworkPackagesRequest setNetworkPackageId(java.util.List<String> networkPackageId) {
        this.networkPackageId = networkPackageId;
        return this;
    }
    public java.util.List<String> getNetworkPackageId() {
        return this.networkPackageId;
    }

    public DescribeNetworkPackagesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeNetworkPackagesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
