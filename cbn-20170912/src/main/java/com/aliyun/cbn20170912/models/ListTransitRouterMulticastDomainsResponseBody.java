// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterMulticastDomainsResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results. Valid values:</p>
     * <br>
     * <p>*   If **NextToken** is empty, no next page exists.</p>
     * <p>*   If a value is returned for **NextToken**, the value is the token that determines the start point of the next query.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The information about the multicast domain.</p>
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
        /**
         * <p>The tag key.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         */
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
         * <p>The CEN instance ID.</p>
         */
        @NameInMap("CenId")
        public String cenId;

        /**
         * <p>The region ID of the transit router.</p>
         * <br>
         * <p>You can call the [DescribeChildInstanceRegions](https://help.aliyun.com/document_detail/132080.html) operation to query the most recent region list.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The status of the multicast domain.</p>
         * <br>
         * <p>The valid value is **Active**, which indicates that the multicast domain is available.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListTransitRouterMulticastDomainsResponseBodyTransitRouterMulticastDomainsTags> tags;

        /**
         * <p>The transit router ID.</p>
         */
        @NameInMap("TransitRouterId")
        public String transitRouterId;

        /**
         * <p>The description of the multicast domain.</p>
         */
        @NameInMap("TransitRouterMulticastDomainDescription")
        public String transitRouterMulticastDomainDescription;

        /**
         * <p>The ID of the multicast domain.</p>
         */
        @NameInMap("TransitRouterMulticastDomainId")
        public String transitRouterMulticastDomainId;

        /**
         * <p>The name of the multicast domain.</p>
         */
        @NameInMap("TransitRouterMulticastDomainName")
        public String transitRouterMulticastDomainName;

        public static ListTransitRouterMulticastDomainsResponseBodyTransitRouterMulticastDomains build(java.util.Map<String, ?> map) throws Exception {
            ListTransitRouterMulticastDomainsResponseBodyTransitRouterMulticastDomains self = new ListTransitRouterMulticastDomainsResponseBodyTransitRouterMulticastDomains();
            return TeaModel.build(map, self);
        }

        public ListTransitRouterMulticastDomainsResponseBodyTransitRouterMulticastDomains setCenId(String cenId) {
            this.cenId = cenId;
            return this;
        }
        public String getCenId() {
            return this.cenId;
        }

        public ListTransitRouterMulticastDomainsResponseBodyTransitRouterMulticastDomains setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
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
