// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListCustomPrivacyPoliciesForBrandResponseBody extends TeaModel {
    @NameInMap("BrandCustomPrivacyPolicies")
    public java.util.List<ListCustomPrivacyPoliciesForBrandResponseBodyBrandCustomPrivacyPolicies> brandCustomPrivacyPolicies;

    /**
     * <p>分页查询时每页行数。</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>本次调用返回的查询凭证（Token）值，用于下一次翻页查询。</p>
     * 
     * <strong>example:</strong>
     * <p>NTxxxexample</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>本次调用返回的查询凭证（Token）值，用于上一次翻页查询。</p>
     * 
     * <strong>example:</strong>
     * <p>PTxxxexample</p>
     */
    @NameInMap("PreviousToken")
    public String previousToken;

    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListCustomPrivacyPoliciesForBrandResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCustomPrivacyPoliciesForBrandResponseBody self = new ListCustomPrivacyPoliciesForBrandResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCustomPrivacyPoliciesForBrandResponseBody setBrandCustomPrivacyPolicies(java.util.List<ListCustomPrivacyPoliciesForBrandResponseBodyBrandCustomPrivacyPolicies> brandCustomPrivacyPolicies) {
        this.brandCustomPrivacyPolicies = brandCustomPrivacyPolicies;
        return this;
    }
    public java.util.List<ListCustomPrivacyPoliciesForBrandResponseBodyBrandCustomPrivacyPolicies> getBrandCustomPrivacyPolicies() {
        return this.brandCustomPrivacyPolicies;
    }

    public ListCustomPrivacyPoliciesForBrandResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListCustomPrivacyPoliciesForBrandResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListCustomPrivacyPoliciesForBrandResponseBody setPreviousToken(String previousToken) {
        this.previousToken = previousToken;
        return this;
    }
    public String getPreviousToken() {
        return this.previousToken;
    }

    public ListCustomPrivacyPoliciesForBrandResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCustomPrivacyPoliciesForBrandResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListCustomPrivacyPoliciesForBrandResponseBodyBrandCustomPrivacyPolicies extends TeaModel {
        /**
         * <p>条款ID</p>
         * 
         * <strong>example:</strong>
         * <p>pp_xxxx</p>
         */
        @NameInMap("CustomPrivacyPolicyId")
        public String customPrivacyPolicyId;

        public static ListCustomPrivacyPoliciesForBrandResponseBodyBrandCustomPrivacyPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListCustomPrivacyPoliciesForBrandResponseBodyBrandCustomPrivacyPolicies self = new ListCustomPrivacyPoliciesForBrandResponseBodyBrandCustomPrivacyPolicies();
            return TeaModel.build(map, self);
        }

        public ListCustomPrivacyPoliciesForBrandResponseBodyBrandCustomPrivacyPolicies setCustomPrivacyPolicyId(String customPrivacyPolicyId) {
            this.customPrivacyPolicyId = customPrivacyPolicyId;
            return this;
        }
        public String getCustomPrivacyPolicyId() {
            return this.customPrivacyPolicyId;
        }

    }

}
