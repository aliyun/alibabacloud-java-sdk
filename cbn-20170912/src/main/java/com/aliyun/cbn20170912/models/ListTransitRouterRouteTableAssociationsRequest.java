// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterRouteTableAssociationsRequest extends TeaModel {
    /**
     * <p>The number of entries to return on each page. Default value: **50**.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that determines the start point of the query. Valid values:</p>
     * <br>
     * <p>*   If this is your first query or no subsequent query is to be sent, ignore this parameter.</p>
     * <p>*   If a next query is to be sent, set the value to the value of **NextToken** that is returned from the last call.</p>
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

    /**
     * <p>The status of the associated forwarding correlation. Valid values:</p>
     * <br>
     * <p>*   **Active**: The associated forwarding correlation is available.</p>
     * <p>*   **Associating**: The associated forwarding correlation is being created.</p>
     * <p>*   **Dissociating**: The associated forwarding correlation is being deleted.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The ID of the network instance connection.</p>
     */
    @NameInMap("TransitRouterAttachmentId")
    public String transitRouterAttachmentId;

    /**
     * <p>The ID of the next hop.</p>
     */
    @NameInMap("TransitRouterAttachmentResourceId")
    public String transitRouterAttachmentResourceId;

    /**
     * <p>The type of next hop. Valid values:</p>
     * <br>
     * <p>*   **VPC**: virtual private cloud (VPC)</p>
     * <p>*   **VBR**: virtual border router (VBR)</p>
     * <p>*   **TR**: transit router</p>
     * <p>*   **VPN**: VPN attachment</p>
     */
    @NameInMap("TransitRouterAttachmentResourceType")
    public String transitRouterAttachmentResourceType;

    /**
     * <p>The ID of the route table of the Enterprise Edition transit router.</p>
     */
    @NameInMap("TransitRouterRouteTableId")
    public String transitRouterRouteTableId;

    public static ListTransitRouterRouteTableAssociationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTransitRouterRouteTableAssociationsRequest self = new ListTransitRouterRouteTableAssociationsRequest();
        return TeaModel.build(map, self);
    }

    public ListTransitRouterRouteTableAssociationsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTransitRouterRouteTableAssociationsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTransitRouterRouteTableAssociationsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListTransitRouterRouteTableAssociationsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListTransitRouterRouteTableAssociationsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListTransitRouterRouteTableAssociationsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListTransitRouterRouteTableAssociationsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListTransitRouterRouteTableAssociationsRequest setTransitRouterAttachmentId(String transitRouterAttachmentId) {
        this.transitRouterAttachmentId = transitRouterAttachmentId;
        return this;
    }
    public String getTransitRouterAttachmentId() {
        return this.transitRouterAttachmentId;
    }

    public ListTransitRouterRouteTableAssociationsRequest setTransitRouterAttachmentResourceId(String transitRouterAttachmentResourceId) {
        this.transitRouterAttachmentResourceId = transitRouterAttachmentResourceId;
        return this;
    }
    public String getTransitRouterAttachmentResourceId() {
        return this.transitRouterAttachmentResourceId;
    }

    public ListTransitRouterRouteTableAssociationsRequest setTransitRouterAttachmentResourceType(String transitRouterAttachmentResourceType) {
        this.transitRouterAttachmentResourceType = transitRouterAttachmentResourceType;
        return this;
    }
    public String getTransitRouterAttachmentResourceType() {
        return this.transitRouterAttachmentResourceType;
    }

    public ListTransitRouterRouteTableAssociationsRequest setTransitRouterRouteTableId(String transitRouterRouteTableId) {
        this.transitRouterRouteTableId = transitRouterRouteTableId;
        return this;
    }
    public String getTransitRouterRouteTableId() {
        return this.transitRouterRouteTableId;
    }

}
