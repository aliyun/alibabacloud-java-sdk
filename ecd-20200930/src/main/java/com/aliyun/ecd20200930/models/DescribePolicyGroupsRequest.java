// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribePolicyGroupsRequest extends TeaModel {
    /**
     * <p>The number of entries per page.</p>
     * <ul>
     * <li>Valid values: 1 to 100</li>
     * <li>Default value: 10</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The policy IDs. You can specify one or more policy IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>system-all-enabled-policy</p>
     */
    @NameInMap("PolicyGroupId")
    public java.util.List<String> policyGroupId;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The effective scope of the policy. Valid values:</p>
     * <ul>
     * <li>GLOBAL: The policy takes effect globally.</li>
     * <li>IP: The policy takes effect based on the IP address.</li>
     * <li>ALL: The policy takes effect without limits.</li>
     * </ul>
     * <p>Default value: GLOBAL.</p>
     * 
     * <strong>example:</strong>
     * <p>ALL</p>
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
