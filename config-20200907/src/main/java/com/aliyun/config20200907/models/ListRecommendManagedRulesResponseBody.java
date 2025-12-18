// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListRecommendManagedRulesResponseBody extends TeaModel {
    @NameInMap("RecommendedManagedRules")
    public ListRecommendManagedRulesResponseBodyRecommendedManagedRules recommendedManagedRules;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>DC300244-FCE3-5061-8214-C27ECB668487</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListRecommendManagedRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRecommendManagedRulesResponseBody self = new ListRecommendManagedRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRecommendManagedRulesResponseBody setRecommendedManagedRules(ListRecommendManagedRulesResponseBodyRecommendedManagedRules recommendedManagedRules) {
        this.recommendedManagedRules = recommendedManagedRules;
        return this;
    }
    public ListRecommendManagedRulesResponseBodyRecommendedManagedRules getRecommendedManagedRules() {
        return this.recommendedManagedRules;
    }

    public ListRecommendManagedRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListRecommendManagedRulesResponseBodyRecommendedManagedRulesRecommendedManagedRuleList extends TeaModel {
        @NameInMap("ConfigRuleName")
        public String configRuleName;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>rds-instance-expired-check</p>
         */
        @NameInMap("Identifier")
        public String identifier;

        /**
         * <strong>example:</strong>
         * <p>ACS::RDS::Instance</p>
         */
        @NameInMap("ResourceTypeScope")
        public String resourceTypeScope;

        public static ListRecommendManagedRulesResponseBodyRecommendedManagedRulesRecommendedManagedRuleList build(java.util.Map<String, ?> map) throws Exception {
            ListRecommendManagedRulesResponseBodyRecommendedManagedRulesRecommendedManagedRuleList self = new ListRecommendManagedRulesResponseBodyRecommendedManagedRulesRecommendedManagedRuleList();
            return TeaModel.build(map, self);
        }

        public ListRecommendManagedRulesResponseBodyRecommendedManagedRulesRecommendedManagedRuleList setConfigRuleName(String configRuleName) {
            this.configRuleName = configRuleName;
            return this;
        }
        public String getConfigRuleName() {
            return this.configRuleName;
        }

        public ListRecommendManagedRulesResponseBodyRecommendedManagedRulesRecommendedManagedRuleList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListRecommendManagedRulesResponseBodyRecommendedManagedRulesRecommendedManagedRuleList setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public ListRecommendManagedRulesResponseBodyRecommendedManagedRulesRecommendedManagedRuleList setResourceTypeScope(String resourceTypeScope) {
            this.resourceTypeScope = resourceTypeScope;
            return this;
        }
        public String getResourceTypeScope() {
            return this.resourceTypeScope;
        }

    }

    public static class ListRecommendManagedRulesResponseBodyRecommendedManagedRules extends TeaModel {
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
        public java.util.List<ListRecommendManagedRulesResponseBodyRecommendedManagedRulesRecommendedManagedRuleList> recommendedManagedRuleList;

        /**
         * <strong>example:</strong>
         * <p>39</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListRecommendManagedRulesResponseBodyRecommendedManagedRules build(java.util.Map<String, ?> map) throws Exception {
            ListRecommendManagedRulesResponseBodyRecommendedManagedRules self = new ListRecommendManagedRulesResponseBodyRecommendedManagedRules();
            return TeaModel.build(map, self);
        }

        public ListRecommendManagedRulesResponseBodyRecommendedManagedRules setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ListRecommendManagedRulesResponseBodyRecommendedManagedRules setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListRecommendManagedRulesResponseBodyRecommendedManagedRules setRecommendedManagedRuleList(java.util.List<ListRecommendManagedRulesResponseBodyRecommendedManagedRulesRecommendedManagedRuleList> recommendedManagedRuleList) {
            this.recommendedManagedRuleList = recommendedManagedRuleList;
            return this;
        }
        public java.util.List<ListRecommendManagedRulesResponseBodyRecommendedManagedRulesRecommendedManagedRuleList> getRecommendedManagedRuleList() {
            return this.recommendedManagedRuleList;
        }

        public ListRecommendManagedRulesResponseBodyRecommendedManagedRules setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
