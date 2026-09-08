// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateCenChildInstanceRouteEntryToAttachmentRequest extends TeaModel {
    /**
     * <p>The Cloud Enterprise Network (CEN) instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cen-bp1n6cbxcszp55vxo****</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-001****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The destination CIDR block of the route entry.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.0.0/24</p>
     */
    @NameInMap("DestinationCidrBlock")
    public String destinationCidrBlock;

    /**
     * <p>Specifies whether to perform a dry run. The dry run checks parameter validity, user permissions, and instance status. Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default): Sends a normal request. If the request passes the check, a route entry is added to the network instance.</li>
     * <li><strong>true</strong>: Sends a check request. No route entry is added to the network instance. The system checks the required parameters, request format, and other conditions. If the check fails, the corresponding error is returned. If the check passes, the error code <code>DryRunOperation</code> is returned.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is not currently in effect.</p>
     * </blockquote>
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
     * <p>The ID of the route table of the network instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vrt-bp1msipdczo9lejup****</p>
     */
    @NameInMap("RouteTableId")
    public String routeTableId;

    /**
     * <p>The ID of the network instance connection.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tr-attach-r1qhupkc19iadz****</p>
     */
    @NameInMap("TransitRouterAttachmentId")
    public String transitRouterAttachmentId;

    public static CreateCenChildInstanceRouteEntryToAttachmentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCenChildInstanceRouteEntryToAttachmentRequest self = new CreateCenChildInstanceRouteEntryToAttachmentRequest();
        return TeaModel.build(map, self);
    }

    public CreateCenChildInstanceRouteEntryToAttachmentRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public CreateCenChildInstanceRouteEntryToAttachmentRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateCenChildInstanceRouteEntryToAttachmentRequest setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
        return this;
    }
    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    public CreateCenChildInstanceRouteEntryToAttachmentRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateCenChildInstanceRouteEntryToAttachmentRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateCenChildInstanceRouteEntryToAttachmentRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateCenChildInstanceRouteEntryToAttachmentRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateCenChildInstanceRouteEntryToAttachmentRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateCenChildInstanceRouteEntryToAttachmentRequest setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }
    public String getRouteTableId() {
        return this.routeTableId;
    }

    public CreateCenChildInstanceRouteEntryToAttachmentRequest setTransitRouterAttachmentId(String transitRouterAttachmentId) {
        this.transitRouterAttachmentId = transitRouterAttachmentId;
        return this;
    }
    public String getTransitRouterAttachmentId() {
        return this.transitRouterAttachmentId;
    }

}
