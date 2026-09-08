// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteCenChildInstanceRouteEntryToAttachmentRequest extends TeaModel {
    /**
     * <p>The instance ID of the Cloud Enterprise Network (CEN).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cen-wgcl0ik5o8jakq****</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
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
     * <p>10.0.1.0/24</p>
     */
    @NameInMap("DestinationCidrBlock")
    public String destinationCidrBlock;

    /**
     * <p>Specifies whether to perform a dry run. The dry run checks parameter validity, user permissions, and instance status. Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default): Sends a normal request. If the request passes the check, the route entry of the network instance is deleted.</li>
     * <li><strong>true</strong>: Sends a check request. Only the check is performed. The route entry of the network instance is not deleted. The check items include whether required parameters are specified and the request format. If the check fails, the corresponding error is returned. If the check succeeds, the corresponding request ID is returned.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is not yet available.</p>
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
     * <p>The route table ID of the network instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vtb-bp1osd9opvegfpowc****</p>
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

    public static DeleteCenChildInstanceRouteEntryToAttachmentRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCenChildInstanceRouteEntryToAttachmentRequest self = new DeleteCenChildInstanceRouteEntryToAttachmentRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCenChildInstanceRouteEntryToAttachmentRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public DeleteCenChildInstanceRouteEntryToAttachmentRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteCenChildInstanceRouteEntryToAttachmentRequest setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
        return this;
    }
    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    public DeleteCenChildInstanceRouteEntryToAttachmentRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DeleteCenChildInstanceRouteEntryToAttachmentRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DeleteCenChildInstanceRouteEntryToAttachmentRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteCenChildInstanceRouteEntryToAttachmentRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteCenChildInstanceRouteEntryToAttachmentRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DeleteCenChildInstanceRouteEntryToAttachmentRequest setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }
    public String getRouteTableId() {
        return this.routeTableId;
    }

    public DeleteCenChildInstanceRouteEntryToAttachmentRequest setTransitRouterAttachmentId(String transitRouterAttachmentId) {
        this.transitRouterAttachmentId = transitRouterAttachmentId;
        return this;
    }
    public String getTransitRouterAttachmentId() {
        return this.transitRouterAttachmentId;
    }

}
