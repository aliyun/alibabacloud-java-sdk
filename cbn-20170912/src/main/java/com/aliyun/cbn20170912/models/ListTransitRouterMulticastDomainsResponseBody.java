// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterMulticastDomainsResponseBody extends TeaModel {
    /**
     * <p>$.parameters[8].schema.example</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>$.parameters[8].schema.enumValueTitles</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>$.parameters[7].schema.enumValueTitles</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>$.parameters[8].schema.description</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>{</p>
     * <p>    "RequestId": "8A0F93D1-FD6C-56FC-B6D2-668FC92D12D2",</p>
     * <p>    "TotalCount": 1,</p>
     * <p>    "MaxResults": 20,</p>
     * <p>    "NextToken": "FFmyTO70tTpLG6I3FmYAXGKPd****",</p>
     * <p>    "TransitRouterMulticastDomains": [</p>
     * <p>        {</p>
     * <p>            "TransitRouterMulticastDomainId": "tr-mcast-domain-3r3bvbypxqheej****",</p>
     * <p>            "TransitRouterMulticastDomainName": "nametest",</p>
     * <p>            "TransitRouterMulticastDomainDescription": "desctest",</p>
     * <p>            "Status": "Active"</p>
     * <p>        }</p>
     * <p>    ]</p>
     * <p>}</p>
     */
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

    public static class ListTransitRouterMulticastDomainsResponseBodyTransitRouterMulticastDomainsTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListTransitRouterMulticastDomainsResponseBodyTransitRouterMulticastDomainsTags build(java.util.Map<String, ?> map) throws Exception {
            ListTransitRouterMulticastDomainsResponseBodyTransitRouterMulticastDomainsTags self = new ListTransitRouterMulticastDomainsResponseBodyTransitRouterMulticastDomainsTags();
            return TeaModel.build(map, self);
        }

        public ListTransitRouterMulticastDomainsResponseBodyTransitRouterMulticastDomainsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListTransitRouterMulticastDomainsResponseBodyTransitRouterMulticastDomainsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListTransitRouterMulticastDomainsResponseBodyTransitRouterMulticastDomains extends TeaModel {
        /**
         * <p>WB656982</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("Tags")
        public java.util.List<ListTransitRouterMulticastDomainsResponseBodyTransitRouterMulticastDomainsTags> tags;

        @NameInMap("TransitRouterId")
        public String transitRouterId;

        /**
         * <p>ListTransitRouterMulticastDomains</p>
         */
        @NameInMap("TransitRouterMulticastDomainDescription")
        public String transitRouterMulticastDomainDescription;

        /**
         * <p><ListTransitRouterMulticastDomainsResponse></p>
         * <p>    <RequestId>8A0F93D1-FD6C-56FC-B6D2-668FC92D12D2</RequestId></p>
         * <p>    <TotalCount>1</TotalCount></p>
         * <p>    <MaxResults>20</MaxResults></p>
         * <p>    <NextToken>FFmyTO70tTpLG6I3FmYAXGKPd****</NextToken></p>
         * <p>    <TransitRouterMulticastDomains></p>
         * <p>        <TransitRouterMulticastDomainId>tr-mcast-domain-3r3bvbypxqheej****</TransitRouterMulticastDomainId></p>
         * <p>        <TransitRouterMulticastDomainName>nametest</TransitRouterMulticastDomainName></p>
         * <p>        <TransitRouterMulticastDomainDescription>desctest</TransitRouterMulticastDomainDescription></p>
         * <p>        <Status>Active</Status></p>
         * <p>    </TransitRouterMulticastDomains></p>
         * <p></ListTransitRouterMulticastDomainsResponse></p>
         */
        @NameInMap("TransitRouterMulticastDomainId")
        public String transitRouterMulticastDomainId;

        /**
         * <p>Queries the information about a multicast domain.</p>
         */
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

        public ListTransitRouterMulticastDomainsResponseBodyTransitRouterMulticastDomains setTags(java.util.List<ListTransitRouterMulticastDomainsResponseBodyTransitRouterMulticastDomainsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListTransitRouterMulticastDomainsResponseBodyTransitRouterMulticastDomainsTags> getTags() {
            return this.tags;
        }

        public ListTransitRouterMulticastDomainsResponseBodyTransitRouterMulticastDomains setTransitRouterId(String transitRouterId) {
            this.transitRouterId = transitRouterId;
            return this;
        }
        public String getTransitRouterId() {
            return this.transitRouterId;
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
