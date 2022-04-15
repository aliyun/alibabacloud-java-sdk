// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterMulticastDomainsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("TransitRouterMulticastDomains")
    public java.util.List<ListTransitRouterMulticastDomainsResponseBodyTransitRouterMulticastDomains> transitRouterMulticastDomains;

    public static ListTransitRouterMulticastDomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTransitRouterMulticastDomainsResponseBody self = new ListTransitRouterMulticastDomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTransitRouterMulticastDomainsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTransitRouterMulticastDomainsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTransitRouterMulticastDomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTransitRouterMulticastDomainsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListTransitRouterMulticastDomainsResponseBody setTransitRouterMulticastDomains(java.util.List<ListTransitRouterMulticastDomainsResponseBodyTransitRouterMulticastDomains> transitRouterMulticastDomains) {
        this.transitRouterMulticastDomains = transitRouterMulticastDomains;
        return this;
    }
    public java.util.List<ListTransitRouterMulticastDomainsResponseBodyTransitRouterMulticastDomains> getTransitRouterMulticastDomains() {
        return this.transitRouterMulticastDomains;
    }

    public static class ListTransitRouterMulticastDomainsResponseBodyTransitRouterMulticastDomains extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("TransitRouterMulticastDomainDescription")
        public String transitRouterMulticastDomainDescription;

        @NameInMap("TransitRouterMulticastDomainId")
        public String transitRouterMulticastDomainId;

        @NameInMap("TransitRouterMulticastDomainName")
        public String transitRouterMulticastDomainName;

        public static ListTransitRouterMulticastDomainsResponseBodyTransitRouterMulticastDomains build(java.util.Map<String, ?> map) throws Exception {
            ListTransitRouterMulticastDomainsResponseBodyTransitRouterMulticastDomains self = new ListTransitRouterMulticastDomainsResponseBodyTransitRouterMulticastDomains();
            return TeaModel.build(map, self);
        }

        public ListTransitRouterMulticastDomainsResponseBodyTransitRouterMulticastDomains setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListTransitRouterMulticastDomainsResponseBodyTransitRouterMulticastDomains setTransitRouterMulticastDomainDescription(String transitRouterMulticastDomainDescription) {
            this.transitRouterMulticastDomainDescription = transitRouterMulticastDomainDescription;
            return this;
        }
        public String getTransitRouterMulticastDomainDescription() {
            return this.transitRouterMulticastDomainDescription;
        }

        public ListTransitRouterMulticastDomainsResponseBodyTransitRouterMulticastDomains setTransitRouterMulticastDomainId(String transitRouterMulticastDomainId) {
            this.transitRouterMulticastDomainId = transitRouterMulticastDomainId;
            return this;
        }
        public String getTransitRouterMulticastDomainId() {
            return this.transitRouterMulticastDomainId;
        }

        public ListTransitRouterMulticastDomainsResponseBodyTransitRouterMulticastDomains setTransitRouterMulticastDomainName(String transitRouterMulticastDomainName) {
            this.transitRouterMulticastDomainName = transitRouterMulticastDomainName;
            return this;
        }
        public String getTransitRouterMulticastDomainName() {
            return this.transitRouterMulticastDomainName;
        }

    }

}
