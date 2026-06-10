// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeAutoSnapshotPolicyRequest extends TeaModel {
    /**
     * <p>The maximum number of entries to return per page.</p>
     * <ul>
     * <li><p>Maximum value: 50</p>
     * </li>
     * <li><p>Default value: 50</p>
     * </li>
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
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6mqIGdPhID94rjhZFGsvpJo</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the automatic snapshot policy.</p>
     * 
     * <strong>example:</strong>
     * <p>sp-c5tv9d64ebjnj****</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <p>The name of the automatic snapshot policy.</p>
     * 
     * <strong>example:</strong>
     * <p>Test 1201</p>
     */
    @NameInMap("PolicyName")
    public String policyName;

    /**
     * <p>The region ID. To query the regions supported by Elastic Desktop Service, call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeAutoSnapshotPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoSnapshotPolicyRequest self = new DescribeAutoSnapshotPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAutoSnapshotPolicyRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeAutoSnapshotPolicyRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeAutoSnapshotPolicyRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public DescribeAutoSnapshotPolicyRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public DescribeAutoSnapshotPolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
