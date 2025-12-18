// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListAggregateRecommendManagedRulesResponseBody extends TeaModel {
    @NameInMap("RecommendedManagedRules")
    public ListAggregateRecommendManagedRulesResponseBodyRecommendedManagedRules recommendedManagedRules;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6CE4ABA1-9A57-41A9-8EA9-E8B17D4671CD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListAggregateRecommendManagedRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAggregateRecommendManagedRulesResponseBody self = new ListAggregateRecommendManagedRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAggregateRecommendManagedRulesResponseBody setRecommendedManagedRules(ListAggregateRecommendManagedRulesResponseBodyRecommendedManagedRules recommendedManagedRules) {
        this.recommendedManagedRules = recommendedManagedRules;
        return this;
    }
    public ListAggregateRecommendManagedRulesResponseBodyRecommendedManagedRules getRecommendedManagedRules() {
        return this.recommendedManagedRules;
    }

    public ListAggregateRecommendManagedRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAggregateRecommendManagedRulesResponseBodyRecommendedManagedRulesRecommendedManagedRuleList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>TagPolicy-1759141226889097</p>
         */
        @NameInMap("ConfigRuleName")
        public String configRuleName;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>ram-user-last-login-expired-check</p>
         */
        @NameInMap("Identifier")
        public String identifier;

        /**
         * <strong>example:</strong>
         * <p>ACS::RAM::User</p>
         */
        @NameInMap("ResourceTypeScope")
        public String resourceTypeScope;

        public static ListAggregateRecommendManagedRulesResponseBodyRecommendedManagedRulesRecommendedManagedRuleList build(java.util.Map<String, ?> map) throws Exception {
            ListAggregateRecommendManagedRulesResponseBodyRecommendedManagedRulesRecommendedManagedRuleList self = new ListAggregateRecommendManagedRulesResponseBodyRecommendedManagedRulesRecommendedManagedRuleList();
            return TeaModel.build(map, self);
        }

        public ListAggregateRecommendManagedRulesResponseBodyRecommendedManagedRulesRecommendedManagedRuleList setConfigRuleName(String configRuleName) {
            this.configRuleName = configRuleName;
            return this;
        }
        public String getConfigRuleName() {
            return this.configRuleName;
        }

        public ListAggregateRecommendManagedRulesResponseBodyRecommendedManagedRulesRecommendedManagedRuleList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAggregateRecommendManagedRulesResponseBodyRecommendedManagedRulesRecommendedManagedRuleList setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public ListAggregateRecommendManagedRulesResponseBodyRecommendedManagedRulesRecommendedManagedRuleList setResourceTypeScope(String resourceTypeScope) {
            this.resourceTypeScope = resourceTypeScope;
            return this;
        }
        public String getResourceTypeScope() {
            return this.resourceTypeScope;
        }

    }

    public static class ListAggregateRecommendManagedRulesResponseBodyRecommendedManagedRules extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <strong>example:</strong>
         * <p>zXZXbg4Mra0kOrhpwl21Lw==</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        @NameInMap("RecommendedManagedRuleList")
        public java.util.List<ListAggregateRecommendManagedRulesResponseBodyRecommendedManagedRulesRecommendedManagedRuleList> recommendedManagedRuleList;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListAggregateRecommendManagedRulesResponseBodyRecommendedManagedRules build(java.util.Map<String, ?> map) throws Exception {
            ListAggregateRecommendManagedRulesResponseBodyRecommendedManagedRules self = new ListAggregateRecommendManagedRulesResponseBodyRecommendedManagedRules();
            return TeaModel.build(map, self);
        }

        public ListAggregateRecommendManagedRulesResponseBodyRecommendedManagedRules setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ListAggregateRecommendManagedRulesResponseBodyRecommendedManagedRules setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListAggregateRecommendManagedRulesResponseBodyRecommendedManagedRules setRecommendedManagedRuleList(java.util.List<ListAggregateRecommendManagedRulesResponseBodyRecommendedManagedRulesRecommendedManagedRuleList> recommendedManagedRuleList) {
            this.recommendedManagedRuleList = recommendedManagedRuleList;
            return this;
        }
        public java.util.List<ListAggregateRecommendManagedRulesResponseBodyRecommendedManagedRulesRecommendedManagedRuleList> getRecommendedManagedRuleList() {
            return this.recommendedManagedRuleList;
        }

        public ListAggregateRecommendManagedRulesResponseBodyRecommendedManagedRules setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
