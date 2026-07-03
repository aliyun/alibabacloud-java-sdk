// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListNormalizationSecurityDomainsResponseBody extends TeaModel {
    /**
     * <p>The maximum number of entries returned in this query.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next query. Leave this parameter empty for the first query or if no more results exist. If more results exist, set this parameter to the NextToken value returned by the previous API call.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAUqcj6VO4E3ECWIrFczs****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The list of security domains.</p>
     */
    @NameInMap("NormalizationSecurityDomains")
    public java.util.List<ListNormalizationSecurityDomainsResponseBodyNormalizationSecurityDomains> normalizationSecurityDomains;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>57</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListNormalizationSecurityDomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNormalizationSecurityDomainsResponseBody self = new ListNormalizationSecurityDomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNormalizationSecurityDomainsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListNormalizationSecurityDomainsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListNormalizationSecurityDomainsResponseBody setNormalizationSecurityDomains(java.util.List<ListNormalizationSecurityDomainsResponseBodyNormalizationSecurityDomains> normalizationSecurityDomains) {
        this.normalizationSecurityDomains = normalizationSecurityDomains;
        return this;
    }
    public java.util.List<ListNormalizationSecurityDomainsResponseBodyNormalizationSecurityDomains> getNormalizationSecurityDomains() {
        return this.normalizationSecurityDomains;
    }

    public ListNormalizationSecurityDomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNormalizationSecurityDomainsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListNormalizationSecurityDomainsResponseBodyNormalizationSecurityDomains extends TeaModel {
        /**
         * <p>The security domain ID.</p>
         * 
         * <strong>example:</strong>
         * <p>OTHER</p>
         */
        @NameInMap("NormalizationSecurityDomainId")
        public String normalizationSecurityDomainId;

        /**
         * <p>The security domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>net</p>
         */
        @NameInMap("NormalizationSecurityDomainName")
        public String normalizationSecurityDomainName;

        public static ListNormalizationSecurityDomainsResponseBodyNormalizationSecurityDomains build(java.util.Map<String, ?> map) throws Exception {
            ListNormalizationSecurityDomainsResponseBodyNormalizationSecurityDomains self = new ListNormalizationSecurityDomainsResponseBodyNormalizationSecurityDomains();
            return TeaModel.build(map, self);
        }

        public ListNormalizationSecurityDomainsResponseBodyNormalizationSecurityDomains setNormalizationSecurityDomainId(String normalizationSecurityDomainId) {
            this.normalizationSecurityDomainId = normalizationSecurityDomainId;
            return this;
        }
        public String getNormalizationSecurityDomainId() {
            return this.normalizationSecurityDomainId;
        }

        public ListNormalizationSecurityDomainsResponseBodyNormalizationSecurityDomains setNormalizationSecurityDomainName(String normalizationSecurityDomainName) {
            this.normalizationSecurityDomainName = normalizationSecurityDomainName;
            return this;
        }
        public String getNormalizationSecurityDomainName() {
            return this.normalizationSecurityDomainName;
        }

    }

}
