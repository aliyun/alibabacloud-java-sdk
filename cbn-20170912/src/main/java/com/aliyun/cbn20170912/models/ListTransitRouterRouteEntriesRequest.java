// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterRouteEntriesRequest extends TeaModel {
    /**
     * <p>The number of entries to return on each page. Valid values: **1** to **100**. Default value: **20**.</p>
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

    @NameInMap("PrefixListId")
    public String prefixListId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RouteFilter")
    public java.util.List<ListTransitRouterRouteEntriesRequestRouteFilter> routeFilter;

    /**
     * <p>The destination CIDR block of the route.</p>
     */
    @NameInMap("TransitRouterRouteEntryDestinationCidrBlock")
    @Deprecated
    public String transitRouterRouteEntryDestinationCidrBlock;

    /**
     * <p>The route entry ID.</p>
     * <br>
     * <p>You can specify at most 20 route IDs in each call.</p>
     * <br>
     * <p>>  You can use only this parameter to query static routes.</p>
     */
    @NameInMap("TransitRouterRouteEntryIds")
    public java.util.List<String> transitRouterRouteEntryIds;

    /**
     * <p>The route name.</p>
     * <br>
     * <p>The name must be 0 to 128 characters in length, and can contain letters, digits, and the following special characters: , . ; / @ \_ -.</p>
     * <br>
     * <p>You can specify at most 20 route names in each call.</p>
     * <br>
     * <p>>  You can use only this parameter to query static routes.</p>
     */
    @NameInMap("TransitRouterRouteEntryNames")
    public java.util.List<String> transitRouterRouteEntryNames;

    @NameInMap("TransitRouterRouteEntryNextHopId")
    public String transitRouterRouteEntryNextHopId;

    @NameInMap("TransitRouterRouteEntryNextHopResourceId")
    public String transitRouterRouteEntryNextHopResourceId;

    @NameInMap("TransitRouterRouteEntryNextHopResourceType")
    public String transitRouterRouteEntryNextHopResourceType;

    @NameInMap("TransitRouterRouteEntryNextHopType")
    public String transitRouterRouteEntryNextHopType;

    @NameInMap("TransitRouterRouteEntryOriginResourceId")
    public String transitRouterRouteEntryOriginResourceId;

    @NameInMap("TransitRouterRouteEntryOriginResourceType")
    public String transitRouterRouteEntryOriginResourceType;

    /**
     * <p>The status of the route. Valid values:</p>
     * <br>
     * <p>*   **Creating**: The route is being created.</p>
     * <p>*   **Active**: The route is available.</p>
     * <p>*   **Deleting**: The route is being deleted.</p>
     */
    @NameInMap("TransitRouterRouteEntryStatus")
    public String transitRouterRouteEntryStatus;

    @NameInMap("TransitRouterRouteEntryType")
    public String transitRouterRouteEntryType;

    /**
     * <p>The ID of the route table of the Enterprise Edition transit router.</p>
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
        @NameInMap("Key")
        public String key;

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
