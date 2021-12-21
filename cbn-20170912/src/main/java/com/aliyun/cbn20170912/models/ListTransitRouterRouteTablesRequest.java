// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterRouteTablesRequest extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("TransitRouterId")
    public String transitRouterId;

    @NameInMap("TransitRouterRouteTableIds")
    public java.util.List<String> transitRouterRouteTableIds;

    @NameInMap("TransitRouterRouteTableNames")
    public java.util.List<String> transitRouterRouteTableNames;

    @NameInMap("TransitRouterRouteTableStatus")
    public String transitRouterRouteTableStatus;

    @NameInMap("TransitRouterRouteTableType")
    public String transitRouterRouteTableType;

    public static ListTransitRouterRouteTablesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTransitRouterRouteTablesRequest self = new ListTransitRouterRouteTablesRequest();
        return TeaModel.build(map, self);
    }

    public ListTransitRouterRouteTablesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTransitRouterRouteTablesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTransitRouterRouteTablesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListTransitRouterRouteTablesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListTransitRouterRouteTablesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListTransitRouterRouteTablesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListTransitRouterRouteTablesRequest setTransitRouterId(String transitRouterId) {
        this.transitRouterId = transitRouterId;
        return this;
    }
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

    public ListTransitRouterRouteTablesRequest setTransitRouterRouteTableIds(java.util.List<String> transitRouterRouteTableIds) {
        this.transitRouterRouteTableIds = transitRouterRouteTableIds;
        return this;
    }
    public java.util.List<String> getTransitRouterRouteTableIds() {
        return this.transitRouterRouteTableIds;
    }

    public ListTransitRouterRouteTablesRequest setTransitRouterRouteTableNames(java.util.List<String> transitRouterRouteTableNames) {
        this.transitRouterRouteTableNames = transitRouterRouteTableNames;
        return this;
    }
    public java.util.List<String> getTransitRouterRouteTableNames() {
        return this.transitRouterRouteTableNames;
    }

    public ListTransitRouterRouteTablesRequest setTransitRouterRouteTableStatus(String transitRouterRouteTableStatus) {
        this.transitRouterRouteTableStatus = transitRouterRouteTableStatus;
        return this;
    }
    public String getTransitRouterRouteTableStatus() {
        return this.transitRouterRouteTableStatus;
    }

    public ListTransitRouterRouteTablesRequest setTransitRouterRouteTableType(String transitRouterRouteTableType) {
        this.transitRouterRouteTableType = transitRouterRouteTableType;
        return this;
    }
    public String getTransitRouterRouteTableType() {
        return this.transitRouterRouteTableType;
    }

}
