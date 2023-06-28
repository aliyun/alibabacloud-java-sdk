// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribePolicyGroupsRequest extends TeaModel {
    /**
     * <p>The number of entries per page.</p>
     * <br>
     * <p>*   Valid values: 1 to 100</p>
     * <p>*   Default value: 10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The policy IDs. You can specify one or more policy IDs.</p>
     */
    @NameInMap("PolicyGroupId")
    public java.util.List<String> policyGroupId;

    /**
     * <p>The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The effective scope of the policy. Valid values:</p>
     * <br>
     * <p>*   GLOBAL: The policy takes effect globally.</p>
     * <p>*   IP: The policy takes effect based on the IP address.</p>
     * <p>*   ALL: The policy takes effect without limits.</p>
     * <br>
     * <p>Default value: GLOBAL.</p>
     */
    @NameInMap("Scope")
    public String scope;

    public static DescribePolicyGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePolicyGroupsRequest self = new DescribePolicyGroupsRequest();
        return TeaModel.build(map, self);
    }

    public DescribePolicyGroupsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribePolicyGroupsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribePolicyGroupsRequest setPolicyGroupId(java.util.List<String> policyGroupId) {
        this.policyGroupId = policyGroupId;
        return this;
    }
    public java.util.List<String> getPolicyGroupId() {
        return this.policyGroupId;
    }

    public DescribePolicyGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribePolicyGroupsRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

}
