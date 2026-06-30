// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteTransitRouterRouteEntryRequest extends TeaModel {
    /**
     * <p>A client token that is used to ensure the idempotence of the request.</p>
     * <p>The token must be unique for each request and can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-001****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run. A dry run checks for potential issues, such as missing parameter values, incorrect request syntax, and service limits. Valid values:</p>
     * <ul>
     * <li><p><strong>false</strong> (default): Sends the request. If the request passes the check, the route entry is deleted.</p>
     * </li>
     * <li><p><strong>true</strong>: Performs only a dry run. The system checks the request for potential issues. If the request fails the dry run, an error message is returned. If the request passes the dry run, the DryRunOperation error code is returned.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The destination CIDR block of the route.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.0.0/24</p>
     */
    @NameInMap("TransitRouterRouteEntryDestinationCidrBlock")
    public String transitRouterRouteEntryDestinationCidrBlock;

    /**
     * <p>The ID of the route entry.</p>
     * 
     * <strong>example:</strong>
     * <p>rte-75eg4jprkvk0pw****</p>
     */
    @NameInMap("TransitRouterRouteEntryId")
    public String transitRouterRouteEntryId;

    /**
     * <p>The ID of the network instance connection that serves as the next hop.</p>
     * 
     * <strong>example:</strong>
     * <p>tr-attach-nls9fzkfat8934****</p>
     */
    @NameInMap("TransitRouterRouteEntryNextHopId")
    public String transitRouterRouteEntryNextHopId;

    /**
     * <p>The type of the next hop. Valid values:</p>
     * <ul>
     * <li><p><strong>BlackHole</strong>: The route is a blackhole route. You do not need to specify a next hop.</p>
     * </li>
     * <li><p><strong>Attachment</strong>: The next hop is a network instance connection. You must specify the ID of the network instance connection.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>BlackHole</p>
     */
    @NameInMap("TransitRouterRouteEntryNextHopType")
    public String transitRouterRouteEntryNextHopType;

    /**
     * <p>The ID of the route table of the Enterprise Edition transit router.</p>
     * 
     * <strong>example:</strong>
     * <p>vtb-bp1dudbh2d5na6b50****</p>
     */
    @NameInMap("TransitRouterRouteTableId")
    public String transitRouterRouteTableId;

    public static DeleteTransitRouterRouteEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTransitRouterRouteEntryRequest self = new DeleteTransitRouterRouteEntryRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTransitRouterRouteEntryRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteTransitRouterRouteEntryRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DeleteTransitRouterRouteEntryRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DeleteTransitRouterRouteEntryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteTransitRouterRouteEntryRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteTransitRouterRouteEntryRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DeleteTransitRouterRouteEntryRequest setTransitRouterRouteEntryDestinationCidrBlock(String transitRouterRouteEntryDestinationCidrBlock) {
        this.transitRouterRouteEntryDestinationCidrBlock = transitRouterRouteEntryDestinationCidrBlock;
        return this;
    }
    public String getTransitRouterRouteEntryDestinationCidrBlock() {
        return this.transitRouterRouteEntryDestinationCidrBlock;
    }

    public DeleteTransitRouterRouteEntryRequest setTransitRouterRouteEntryId(String transitRouterRouteEntryId) {
        this.transitRouterRouteEntryId = transitRouterRouteEntryId;
        return this;
    }
    public String getTransitRouterRouteEntryId() {
        return this.transitRouterRouteEntryId;
    }

    public DeleteTransitRouterRouteEntryRequest setTransitRouterRouteEntryNextHopId(String transitRouterRouteEntryNextHopId) {
        this.transitRouterRouteEntryNextHopId = transitRouterRouteEntryNextHopId;
        return this;
    }
    public String getTransitRouterRouteEntryNextHopId() {
        return this.transitRouterRouteEntryNextHopId;
    }

    public DeleteTransitRouterRouteEntryRequest setTransitRouterRouteEntryNextHopType(String transitRouterRouteEntryNextHopType) {
        this.transitRouterRouteEntryNextHopType = transitRouterRouteEntryNextHopType;
        return this;
    }
    public String getTransitRouterRouteEntryNextHopType() {
        return this.transitRouterRouteEntryNextHopType;
    }

    public DeleteTransitRouterRouteEntryRequest setTransitRouterRouteTableId(String transitRouterRouteTableId) {
        this.transitRouterRouteTableId = transitRouterRouteTableId;
        return this;
    }
    public String getTransitRouterRouteTableId() {
        return this.transitRouterRouteTableId;
    }

}
