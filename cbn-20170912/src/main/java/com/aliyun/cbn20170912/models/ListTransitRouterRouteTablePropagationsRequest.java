// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterRouteTablePropagationsRequest extends TeaModel {
    /**
     * <p>The number of entries to return on each page. Default value: **50**.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for returning the next page when the data is returned in more than one page.</p>
     */
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

    @NameInMap("Status")
    public String status;

    /**
     * <p>The ID of the network instance connection.</p>
     */
    @NameInMap("TransitRouterAttachmentId")
    public String transitRouterAttachmentId;

    @NameInMap("TransitRouterAttachmentResourceId")
    public String transitRouterAttachmentResourceId;

    @NameInMap("TransitRouterAttachmentResourceType")
    public String transitRouterAttachmentResourceType;

    /**
     * <p>The ID of the route table of the Enterprise Edition transit router.</p>
     */
    @NameInMap("TransitRouterRouteTableId")
    public String transitRouterRouteTableId;

    public static ListTransitRouterRouteTablePropagationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTransitRouterRouteTablePropagationsRequest self = new ListTransitRouterRouteTablePropagationsRequest();
        return TeaModel.build(map, self);
    }

    public ListTransitRouterRouteTablePropagationsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTransitRouterRouteTablePropagationsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTransitRouterRouteTablePropagationsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListTransitRouterRouteTablePropagationsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListTransitRouterRouteTablePropagationsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListTransitRouterRouteTablePropagationsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListTransitRouterRouteTablePropagationsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListTransitRouterRouteTablePropagationsRequest setTransitRouterAttachmentId(String transitRouterAttachmentId) {
        this.transitRouterAttachmentId = transitRouterAttachmentId;
        return this;
    }
    public String getTransitRouterAttachmentId() {
        return this.transitRouterAttachmentId;
    }

    public ListTransitRouterRouteTablePropagationsRequest setTransitRouterAttachmentResourceId(String transitRouterAttachmentResourceId) {
        this.transitRouterAttachmentResourceId = transitRouterAttachmentResourceId;
        return this;
    }
    public String getTransitRouterAttachmentResourceId() {
        return this.transitRouterAttachmentResourceId;
    }

    public ListTransitRouterRouteTablePropagationsRequest setTransitRouterAttachmentResourceType(String transitRouterAttachmentResourceType) {
        this.transitRouterAttachmentResourceType = transitRouterAttachmentResourceType;
        return this;
    }
    public String getTransitRouterAttachmentResourceType() {
        return this.transitRouterAttachmentResourceType;
    }

    public ListTransitRouterRouteTablePropagationsRequest setTransitRouterRouteTableId(String transitRouterRouteTableId) {
        this.transitRouterRouteTableId = transitRouterRouteTableId;
        return this;
    }
    public String getTransitRouterRouteTableId() {
        return this.transitRouterRouteTableId;
    }

}
