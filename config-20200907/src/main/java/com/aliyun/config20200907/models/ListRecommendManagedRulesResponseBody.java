// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListRecommendManagedRulesResponseBody extends TeaModel {
    /**
     * <p>The list of rules.</p>
     */
    @NameInMap("RecommendedManagedRules")
    public ListRecommendManagedRulesResponseBodyRecommendedManagedRules recommendedManagedRules;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DC300244-FCE3-5061-8214-C27ECB66****</p>
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
        /**
         * <p>The rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-bucket-referer-limit</p>
         */
        @NameInMap("ConfigRuleName")
        public String configRuleName;

        /**
         * <p>The description of the managed rule.</p>
         * 
         * <strong>example:</strong>
         * <p>If the hotlink protection feature is enabled for the OSS bucket and the Referer is added to a specified whitelist, the configuration is considered compliant.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The rule identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-bucket-referer-limit</p>
         */
        @NameInMap("Identifier")
        public String identifier;

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS::OSS::Bucket</p>
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
         * <p>The maximum number of entries returned for the request.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <p>The token that is used to initiate the next query.</p>
         * <blockquote>
         * <p>If this parameter is left empty, no more results are returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>zXZXbg4Mra0kOrhpwl21****</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The list of managed rules.</p>
         */
        @NameInMap("RecommendedManagedRuleList")
        public java.util.List<ListRecommendManagedRulesResponseBodyRecommendedManagedRulesRecommendedManagedRuleList> recommendedManagedRuleList;

        /**
         * <p>The total number of rules.</p>
         * 
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
