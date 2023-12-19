// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribePoliciesV2Request extends TeaModel {
    /**
     * <p>The number of results for each query.</p>
     * <br>
     * <p>Valid values: 10 to 100. Default value: 10.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to obtain the next page of backup policies.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the backup policy.</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    public static DescribePoliciesV2Request build(java.util.Map<String, ?> map) throws Exception {
        DescribePoliciesV2Request self = new DescribePoliciesV2Request();
        return TeaModel.build(map, self);
    }

    public DescribePoliciesV2Request setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribePoliciesV2Request setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribePoliciesV2Request setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

}
