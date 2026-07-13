// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class ListProtectionPoliciesRequest extends TeaModel {
    /**
     * <p>The maximum number of results to return.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The paging token.</p>
     * 
     * <strong>example:</strong>
     * <p>cae**********699</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The protection policy ID.</p>
     * 
     * <strong>example:</strong>
     * <p>p-123***7890</p>
     */
    @NameInMap("ProtectionPolicyId")
    public String protectionPolicyId;

    /**
     * <p>The region ID of the protection policy.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("ProtectionPolicyRegionId")
    public String protectionPolicyRegionId;

    public static ListProtectionPoliciesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProtectionPoliciesRequest self = new ListProtectionPoliciesRequest();
        return TeaModel.build(map, self);
    }

    public ListProtectionPoliciesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListProtectionPoliciesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListProtectionPoliciesRequest setProtectionPolicyId(String protectionPolicyId) {
        this.protectionPolicyId = protectionPolicyId;
        return this;
    }
    public String getProtectionPolicyId() {
        return this.protectionPolicyId;
    }

    public ListProtectionPoliciesRequest setProtectionPolicyRegionId(String protectionPolicyRegionId) {
        this.protectionPolicyRegionId = protectionPolicyRegionId;
        return this;
    }
    public String getProtectionPolicyRegionId() {
        return this.protectionPolicyRegionId;
    }

}
