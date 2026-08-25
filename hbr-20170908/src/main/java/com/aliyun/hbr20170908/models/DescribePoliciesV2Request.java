// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribePoliciesV2Request extends TeaModel {
    @NameInMap("AccountScope")
    public String accountScope;

    @NameInMap("Accounts")
    public java.util.List<DescribePoliciesV2RequestAccounts> accounts;

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

    public static DescribePoliciesV2Request build(java.util.Map<String, ?> map) throws Exception {
        DescribePoliciesV2Request self = new DescribePoliciesV2Request();
        return TeaModel.build(map, self);
    }

    public DescribePoliciesV2Request setAccountScope(String accountScope) {
        this.accountScope = accountScope;
        return this;
    }
    public String getAccountScope() {
        return this.accountScope;
    }

    public DescribePoliciesV2Request setAccounts(java.util.List<DescribePoliciesV2RequestAccounts> accounts) {
        this.accounts = accounts;
        return this;
    }
    public java.util.List<DescribePoliciesV2RequestAccounts> getAccounts() {
        return this.accounts;
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

    public DescribePoliciesV2Request setRuleScope(String ruleScope) {
        this.ruleScope = ruleScope;
        return this;
    }
    public String getRuleScope() {
        return this.ruleScope;
    }

    public static class DescribePoliciesV2RequestAccounts extends TeaModel {
        @NameInMap("CrossAccountRoleName")
        public String crossAccountRoleName;

        @NameInMap("CrossAccountType")
        public String crossAccountType;

        @NameInMap("CrossAccountUserId")
        public Long crossAccountUserId;

        public static DescribePoliciesV2RequestAccounts build(java.util.Map<String, ?> map) throws Exception {
            DescribePoliciesV2RequestAccounts self = new DescribePoliciesV2RequestAccounts();
            return TeaModel.build(map, self);
        }

        public DescribePoliciesV2RequestAccounts setCrossAccountRoleName(String crossAccountRoleName) {
            this.crossAccountRoleName = crossAccountRoleName;
            return this;
        }
        public String getCrossAccountRoleName() {
            return this.crossAccountRoleName;
        }

        public DescribePoliciesV2RequestAccounts setCrossAccountType(String crossAccountType) {
            this.crossAccountType = crossAccountType;
            return this;
        }
        public String getCrossAccountType() {
            return this.crossAccountType;
        }

        public DescribePoliciesV2RequestAccounts setCrossAccountUserId(Long crossAccountUserId) {
            this.crossAccountUserId = crossAccountUserId;
            return this;
        }
        public Long getCrossAccountUserId() {
            return this.crossAccountUserId;
        }

    }

}
