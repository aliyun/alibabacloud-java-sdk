// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeAutoSnapshotPolicyRequest extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("PolicyId")
    public String policyId;

    @NameInMap("PolicyName")
    public String policyName;

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
