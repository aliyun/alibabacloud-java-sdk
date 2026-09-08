// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class UpdateTransitRouterVpnAttachmentAttributeRequest extends TeaModel {
    /**
     * <p>Specifies whether to allow the forward routing instance to automatically publish route entries to the IPsec connection. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Allowed.</li>
     * <li><strong>false</strong>: Not allowed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPublishRouteEnabled")
    public Boolean autoPublishRouteEnabled;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs a dry run without modifying the VPN connection configurations. The system checks the required parameters, request format, and service limits. If the check fails, the corresponding error is returned. If the check succeeds, the error code <code>DryRunOperation</code> is returned.</li>
     * <li><strong>false</strong> (default): performs a dry run and then modifies the VPN connection configurations after the request passes the check.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The payer of the network instance. Valid values:</p>
     * <ul>
     * <li><strong>PayByCenOwner</strong>: The connection fee and data transfer fee of the VPN connection are paid by the account that owns the transit router instance.</li>
     * <li><strong>PayByResourceOwner</strong>: The connection fee and data transfer fee of the VPN connection are paid by the account that owns the VPN gateway instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PayByCenOwner</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The new description of the VPN connection.</p>
     * <p>The description can be empty or 1 to 256 characters in length and cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>desctest</p>
     */
    @NameInMap("TransitRouterAttachmentDescription")
    public String transitRouterAttachmentDescription;

    /**
     * <p>The VPN connection ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tr-attach-a6p8voaodog5c0****</p>
     */
    @NameInMap("TransitRouterAttachmentId")
    public String transitRouterAttachmentId;

    /**
     * <p>The new name of the VPN connection.</p>
     * <p>The name can be empty or 1 to 128 characters in length and cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>nametest</p>
     */
    @NameInMap("TransitRouterAttachmentName")
    public String transitRouterAttachmentName;

    public static UpdateTransitRouterVpnAttachmentAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTransitRouterVpnAttachmentAttributeRequest self = new UpdateTransitRouterVpnAttachmentAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTransitRouterVpnAttachmentAttributeRequest setAutoPublishRouteEnabled(Boolean autoPublishRouteEnabled) {
        this.autoPublishRouteEnabled = autoPublishRouteEnabled;
        return this;
    }
    public Boolean getAutoPublishRouteEnabled() {
        return this.autoPublishRouteEnabled;
    }

    public UpdateTransitRouterVpnAttachmentAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateTransitRouterVpnAttachmentAttributeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateTransitRouterVpnAttachmentAttributeRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public UpdateTransitRouterVpnAttachmentAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UpdateTransitRouterVpnAttachmentAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateTransitRouterVpnAttachmentAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateTransitRouterVpnAttachmentAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdateTransitRouterVpnAttachmentAttributeRequest setTransitRouterAttachmentDescription(String transitRouterAttachmentDescription) {
        this.transitRouterAttachmentDescription = transitRouterAttachmentDescription;
        return this;
    }
    public String getTransitRouterAttachmentDescription() {
        return this.transitRouterAttachmentDescription;
    }

    public UpdateTransitRouterVpnAttachmentAttributeRequest setTransitRouterAttachmentId(String transitRouterAttachmentId) {
        this.transitRouterAttachmentId = transitRouterAttachmentId;
        return this;
    }
    public String getTransitRouterAttachmentId() {
        return this.transitRouterAttachmentId;
    }

    public UpdateTransitRouterVpnAttachmentAttributeRequest setTransitRouterAttachmentName(String transitRouterAttachmentName) {
        this.transitRouterAttachmentName = transitRouterAttachmentName;
        return this;
    }
    public String getTransitRouterAttachmentName() {
        return this.transitRouterAttachmentName;
    }

}
