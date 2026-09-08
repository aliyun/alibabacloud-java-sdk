// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class AssociateTransitRouterAttachmentWithRouteTableRequest extends TeaModel {
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
     * <p>Specifies whether to execute a dry run. The dry run checks parameter validity, instance status, and whether the network instance connection can be associated with the forward route table. Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default): sends a Normal request. If the request passes the check, the route table association is created.</li>
     * <li><strong>true</strong>: sends a check request. No route table association is created after the request passes the check. The system checks the required parameters, request format, and service limits. If the check fails, the corresponding error message is returned. If the check succeeds, the <code>DryRunOperation</code> error code is returned.</li>
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
     * <p>The ID of the network instance connection.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tr-attach-nls9fzkfat8934****</p>
     */
    @NameInMap("TransitRouterAttachmentId")
    public String transitRouterAttachmentId;

    /**
     * <p>The ID of the Enterprise Edition transit router route table.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vtb-bp1dudbh2d5na6b50****</p>
     */
    @NameInMap("TransitRouterRouteTableId")
    public String transitRouterRouteTableId;

    public static AssociateTransitRouterAttachmentWithRouteTableRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateTransitRouterAttachmentWithRouteTableRequest self = new AssociateTransitRouterAttachmentWithRouteTableRequest();
        return TeaModel.build(map, self);
    }

    public AssociateTransitRouterAttachmentWithRouteTableRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AssociateTransitRouterAttachmentWithRouteTableRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public AssociateTransitRouterAttachmentWithRouteTableRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AssociateTransitRouterAttachmentWithRouteTableRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AssociateTransitRouterAttachmentWithRouteTableRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AssociateTransitRouterAttachmentWithRouteTableRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AssociateTransitRouterAttachmentWithRouteTableRequest setTransitRouterAttachmentId(String transitRouterAttachmentId) {
        this.transitRouterAttachmentId = transitRouterAttachmentId;
        return this;
    }
    public String getTransitRouterAttachmentId() {
        return this.transitRouterAttachmentId;
    }

    public AssociateTransitRouterAttachmentWithRouteTableRequest setTransitRouterRouteTableId(String transitRouterRouteTableId) {
        this.transitRouterRouteTableId = transitRouterRouteTableId;
        return this;
    }
    public String getTransitRouterRouteTableId() {
        return this.transitRouterRouteTableId;
    }

}
