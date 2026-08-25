// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribePoliciesV2ShrinkRequest extends TeaModel {
    @NameInMap("AccountScope")
    public String accountScope;

    @NameInMap("Accounts")
    public String accountsShrink;

    /**
     * <p>The number of results per query.</p>
     * <p>Valid values: 10 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token required to retrieve the next page of policies.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The policy ID.</p>
     * 
     * <strong>example:</strong>
     * <p>po-000************2l6</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    @NameInMap("RuleScope")
    public String ruleScope;

    public static DescribePoliciesV2ShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePoliciesV2ShrinkRequest self = new DescribePoliciesV2ShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribePoliciesV2ShrinkRequest setAccountScope(String accountScope) {
        this.accountScope = accountScope;
        return this;
    }
    public String getAccountScope() {
        return this.accountScope;
    }

    public DescribePoliciesV2ShrinkRequest setAccountsShrink(String accountsShrink) {
        this.accountsShrink = accountsShrink;
        return this;
    }
    public String getAccountsShrink() {
        return this.accountsShrink;
    }

    public DescribePoliciesV2ShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribePoliciesV2ShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribePoliciesV2ShrinkRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public DescribePoliciesV2ShrinkRequest setRuleScope(String ruleScope) {
        this.ruleScope = ruleScope;
        return this;
    }
    public String getRuleScope() {
        return this.ruleScope;
    }

}
