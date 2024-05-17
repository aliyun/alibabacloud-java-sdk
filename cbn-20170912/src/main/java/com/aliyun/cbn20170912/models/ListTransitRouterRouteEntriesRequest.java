// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterRouteEntriesRequest extends TeaModel {
    /**
     * <p>The number of entries per page. Valid values: **1** to **100**. Default value: **20**.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
     * <br>
     * <p>*   You do not need to specify this parameter for the first request.</p>
     * <p>*   You must specify the token that is obtained from the previous query as the value of **NextToken**.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The prefix list ID.</p>
     */
    @NameInMap("PrefixListId")
    public String prefixListId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The filter conditions for route CIDR blocks.</p>
     */
    @NameInMap("RouteFilter")
    public java.util.List<ListTransitRouterRouteEntriesRequestRouteFilter> routeFilter;

    /**
     * <p>The destination CIDR block of the route. **This parameter is to be deprecated. We recommend that you use the RouteFilter parameter**.</p>
     */
    @NameInMap("TransitRouterRouteEntryDestinationCidrBlock")
    @Deprecated
    public String transitRouterRouteEntryDestinationCidrBlock;

    /**
     * <p>The route ID.</p>
     * <br>
     * <p>>  You can use this parameter to query only static routes in the specified route table. This parameter is incompatible with query conditions other than TransitRouterRouteEntryNames.</p>
     */
    @NameInMap("TransitRouterRouteEntryIds")
    public java.util.List<String> transitRouterRouteEntryIds;

    /**
     * <p>The name of the route.</p>
     * <br>
     * <p>The name can be empty or 1 to 128 characters in length, and cannot start with http:// or https://.</p>
     * <br>
     * <p>>  You can use this parameter to query only static routes in the specified route table. This parameter conflicts with other query conditions except for TransitRouterRouteEntryIds.</p>
     */
    @NameInMap("TransitRouterRouteEntryNames")
    public java.util.List<String> transitRouterRouteEntryNames;

    /**
     * <p>The ID of the network instance connection that you want to specify as the next hop.</p>
     */
    @NameInMap("TransitRouterRouteEntryNextHopId")
    public String transitRouterRouteEntryNextHopId;

    /**
     * <p>The next hop ID.</p>
     */
    @NameInMap("TransitRouterRouteEntryNextHopResourceId")
    public String transitRouterRouteEntryNextHopResourceId;

    /**
     * <p>The next hop type. Valid values:</p>
     * <br>
     * <p>*   **VPC**</p>
     * <p>*   **VBR**</p>
     * <p>*   **TR**</p>
     * <p>*   **VPN**</p>
     */
    @NameInMap("TransitRouterRouteEntryNextHopResourceType")
    public String transitRouterRouteEntryNextHopResourceType;

    /**
     * <p>The next hop type. Valid values:</p>
     * <br>
     * <p>*   **BlackHole**: routes network traffic to a black hole.</p>
     * <p>*   **Attachment**: routes network traffic to a network instance connection.</p>
     */
    @NameInMap("TransitRouterRouteEntryNextHopType")
    public String transitRouterRouteEntryNextHopType;

    /**
     * <p>The source instance ID.</p>
     */
    @NameInMap("TransitRouterRouteEntryOriginResourceId")
    public String transitRouterRouteEntryOriginResourceId;

    /**
     * <p>The source instance type. Valid values:</p>
     * <br>
     * <p>*   **VPC**</p>
     * <p>*   **VBR**</p>
     * <p>*   **TR**</p>
     * <p>*   **VPN**</p>
     */
    @NameInMap("TransitRouterRouteEntryOriginResourceType")
    public String transitRouterRouteEntryOriginResourceType;

    /**
     * <p>The status of the route. Valid values:</p>
     * <br>
     * <p>*   **All**</p>
     * <p>*   **Active** (default)</p>
     * <p>*   **Rejected**</p>
     * <p>*   **Prohibited**</p>
     * <p>*   **Standby**</p>
     * <p>*   **Candidate**</p>
     * <br>
     * <p>If you do not specify a value, routes in the active state are queried.</p>
     */
    @NameInMap("TransitRouterRouteEntryStatus")
    public String transitRouterRouteEntryStatus;

    /**
     * <p>The route type. Valid values:</p>
     * <br>
     * <p>*   **Propagated**: automatically learned by the route table.</p>
     * <p>*   **Static**: static routes.</p>
     */
    @NameInMap("TransitRouterRouteEntryType")
    public String transitRouterRouteEntryType;

    /**
     * <p>The ID of the route table of the Enterprise Edition transit router.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TransitRouterRouteTableId")
    public String transitRouterRouteTableId;

    public static ListTransitRouterRouteEntriesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTransitRouterRouteEntriesRequest self = new ListTransitRouterRouteEntriesRequest();
        return TeaModel.build(map, self);
    }

    public ListTransitRouterRouteEntriesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTransitRouterRouteEntriesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTransitRouterRouteEntriesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListTransitRouterRouteEntriesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListTransitRouterRouteEntriesRequest setPrefixListId(String prefixListId) {
        this.prefixListId = prefixListId;
        return this;
    }
    public String getPrefixListId() {
        return this.prefixListId;
    }

    public ListTransitRouterRouteEntriesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListTransitRouterRouteEntriesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListTransitRouterRouteEntriesRequest setRouteFilter(java.util.List<ListTransitRouterRouteEntriesRequestRouteFilter> routeFilter) {
        this.routeFilter = routeFilter;
        return this;
    }
    public java.util.List<ListTransitRouterRouteEntriesRequestRouteFilter> getRouteFilter() {
        return this.routeFilter;
    }

    public ListTransitRouterRouteEntriesRequest setTransitRouterRouteEntryDestinationCidrBlock(String transitRouterRouteEntryDestinationCidrBlock) {
        this.transitRouterRouteEntryDestinationCidrBlock = transitRouterRouteEntryDestinationCidrBlock;
        return this;
    }
    public String getTransitRouterRouteEntryDestinationCidrBlock() {
        return this.transitRouterRouteEntryDestinationCidrBlock;
    }

    public ListTransitRouterRouteEntriesRequest setTransitRouterRouteEntryIds(java.util.List<String> transitRouterRouteEntryIds) {
        this.transitRouterRouteEntryIds = transitRouterRouteEntryIds;
        return this;
    }
    public java.util.List<String> getTransitRouterRouteEntryIds() {
        return this.transitRouterRouteEntryIds;
    }

    public ListTransitRouterRouteEntriesRequest setTransitRouterRouteEntryNames(java.util.List<String> transitRouterRouteEntryNames) {
        this.transitRouterRouteEntryNames = transitRouterRouteEntryNames;
        return this;
    }
    public java.util.List<String> getTransitRouterRouteEntryNames() {
        return this.transitRouterRouteEntryNames;
    }

    public ListTransitRouterRouteEntriesRequest setTransitRouterRouteEntryNextHopId(String transitRouterRouteEntryNextHopId) {
        this.transitRouterRouteEntryNextHopId = transitRouterRouteEntryNextHopId;
        return this;
    }
    public String getTransitRouterRouteEntryNextHopId() {
        return this.transitRouterRouteEntryNextHopId;
    }

    public ListTransitRouterRouteEntriesRequest setTransitRouterRouteEntryNextHopResourceId(String transitRouterRouteEntryNextHopResourceId) {
        this.transitRouterRouteEntryNextHopResourceId = transitRouterRouteEntryNextHopResourceId;
        return this;
    }
    public String getTransitRouterRouteEntryNextHopResourceId() {
        return this.transitRouterRouteEntryNextHopResourceId;
    }

    public ListTransitRouterRouteEntriesRequest setTransitRouterRouteEntryNextHopResourceType(String transitRouterRouteEntryNextHopResourceType) {
        this.transitRouterRouteEntryNextHopResourceType = transitRouterRouteEntryNextHopResourceType;
        return this;
    }
    public String getTransitRouterRouteEntryNextHopResourceType() {
        return this.transitRouterRouteEntryNextHopResourceType;
    }

    public ListTransitRouterRouteEntriesRequest setTransitRouterRouteEntryNextHopType(String transitRouterRouteEntryNextHopType) {
        this.transitRouterRouteEntryNextHopType = transitRouterRouteEntryNextHopType;
        return this;
    }
    public String getTransitRouterRouteEntryNextHopType() {
        return this.transitRouterRouteEntryNextHopType;
    }

    public ListTransitRouterRouteEntriesRequest setTransitRouterRouteEntryOriginResourceId(String transitRouterRouteEntryOriginResourceId) {
        this.transitRouterRouteEntryOriginResourceId = transitRouterRouteEntryOriginResourceId;
        return this;
    }
    public String getTransitRouterRouteEntryOriginResourceId() {
        return this.transitRouterRouteEntryOriginResourceId;
    }

    public ListTransitRouterRouteEntriesRequest setTransitRouterRouteEntryOriginResourceType(String transitRouterRouteEntryOriginResourceType) {
        this.transitRouterRouteEntryOriginResourceType = transitRouterRouteEntryOriginResourceType;
        return this;
    }
    public String getTransitRouterRouteEntryOriginResourceType() {
        return this.transitRouterRouteEntryOriginResourceType;
    }

    public ListTransitRouterRouteEntriesRequest setTransitRouterRouteEntryStatus(String transitRouterRouteEntryStatus) {
        this.transitRouterRouteEntryStatus = transitRouterRouteEntryStatus;
        return this;
    }
    public String getTransitRouterRouteEntryStatus() {
        return this.transitRouterRouteEntryStatus;
    }

    public ListTransitRouterRouteEntriesRequest setTransitRouterRouteEntryType(String transitRouterRouteEntryType) {
        this.transitRouterRouteEntryType = transitRouterRouteEntryType;
        return this;
    }
    public String getTransitRouterRouteEntryType() {
        return this.transitRouterRouteEntryType;
    }

    public ListTransitRouterRouteEntriesRequest setTransitRouterRouteTableId(String transitRouterRouteTableId) {
        this.transitRouterRouteTableId = transitRouterRouteTableId;
        return this;
    }
    public String getTransitRouterRouteTableId() {
        return this.transitRouterRouteTableId;
    }

    public static class ListTransitRouterRouteEntriesRequestRouteFilter extends TeaModel {
        /**
         * <p>The match pattern for filtering CIDR blocks. Valid values:</p>
         * <br>
         * <p>*   **PrefixExactMatchCidrs**: exact matching.</p>
         * <p>*   **LongestPrefixMatchCidrs**: longest prefix matching. The specified IP address and CIDR block are considered a match.</p>
         * <p>*   **SubnetOfMatchCidrs**: subnet matching. The specified CIDR block is considered a match.</p>
         * <p>*   **SupernetOfMatchCidrs**: supernet matching. The specified CIDR block is considered a match.</p>
         * <br>
         * <p>By default, the logical operator among filter conditions is **AND**. Information about a route entry is returned only if the route entry matches all filter conditions. Filter conditions must be unique.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The filter value.</p>
         */
        @NameInMap("Value")
        public java.util.List<String> value;

        public static ListTransitRouterRouteEntriesRequestRouteFilter build(java.util.Map<String, ?> map) throws Exception {
            ListTransitRouterRouteEntriesRequestRouteFilter self = new ListTransitRouterRouteEntriesRequestRouteFilter();
            return TeaModel.build(map, self);
        }

        public ListTransitRouterRouteEntriesRequestRouteFilter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListTransitRouterRouteEntriesRequestRouteFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

}
