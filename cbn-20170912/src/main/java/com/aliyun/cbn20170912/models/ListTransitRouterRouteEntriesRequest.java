// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterRouteEntriesRequest extends TeaModel {
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

    @NameInMap("TransitRouterRouteEntryDestinationCidrBlock")
    public String transitRouterRouteEntryDestinationCidrBlock;

    @NameInMap("TransitRouterRouteEntryIds")
    public java.util.List<String> transitRouterRouteEntryIds;

    @NameInMap("TransitRouterRouteEntryNames")
    public java.util.List<String> transitRouterRouteEntryNames;

    @NameInMap("TransitRouterRouteEntryStatus")
    public String transitRouterRouteEntryStatus;

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

    public ListTransitRouterRouteEntriesRequest setTransitRouterRouteEntryStatus(String transitRouterRouteEntryStatus) {
        this.transitRouterRouteEntryStatus = transitRouterRouteEntryStatus;
        return this;
    }
    public String getTransitRouterRouteEntryStatus() {
        return this.transitRouterRouteEntryStatus;
    }

    public ListTransitRouterRouteEntriesRequest setTransitRouterRouteTableId(String transitRouterRouteTableId) {
        this.transitRouterRouteTableId = transitRouterRouteTableId;
        return this;
    }
    public String getTransitRouterRouteTableId() {
        return this.transitRouterRouteTableId;
    }

}
