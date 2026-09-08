// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class UpdateTransitRouterVpcAttachmentAttributeShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether to allow the Enterprise Edition forward router to automatically publish route entry to the VPC-connected instance.</p>
     * <ul>
     * <li><strong>false</strong>: no.</li>
     * <li><strong>true</strong>: yes.</li>
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
     * <p>02fb3da4-130e-11e9-8e44-001****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run, including permission and instance status verification. Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default): Sends a normal request. If the request passes the check, the name and description of the VPC connection are modified.</li>
     * <li><strong>true</strong>: Sends a check request. Only the verification is performed, and the name and description of the VPC connection are not modified. The system checks whether the required parameters are specified and whether the request format is valid. If the check fails, the corresponding error is returned. If the check passes, the corresponding request ID is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The collection of feature attributes.</p>
     */
    @NameInMap("Options")
    public String optionsShrink;

    /**
     * <p>The payer of the network instance.</p>
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
     * <p>The description of the VPC connection.</p>
     * <p>The description can be empty or 1 to 256 characters in length, and cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>testdesc</p>
     */
    @NameInMap("TransitRouterAttachmentDescription")
    public String transitRouterAttachmentDescription;

    /**
     * <p>The ID of the VPC connection.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tr-attach-nls9fzkfat8934****</p>
     */
    @NameInMap("TransitRouterAttachmentId")
    public String transitRouterAttachmentId;

    /**
     * <p>The name of the VPC connection.</p>
     * <p>The name can be empty or 1 to 128 characters in length, and cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>testname</p>
     */
    @NameInMap("TransitRouterAttachmentName")
    public String transitRouterAttachmentName;

    /**
     * <p>The list of feature attributes of the VPC connection (to be deprecated. Use the new parameter Options instead).</p>
     */
    @NameInMap("TransitRouterVPCAttachmentOptions")
    public String transitRouterVPCAttachmentOptionsShrink;

    public static UpdateTransitRouterVpcAttachmentAttributeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTransitRouterVpcAttachmentAttributeShrinkRequest self = new UpdateTransitRouterVpcAttachmentAttributeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTransitRouterVpcAttachmentAttributeShrinkRequest setAutoPublishRouteEnabled(Boolean autoPublishRouteEnabled) {
        this.autoPublishRouteEnabled = autoPublishRouteEnabled;
        return this;
    }
    public Boolean getAutoPublishRouteEnabled() {
        return this.autoPublishRouteEnabled;
    }

    public UpdateTransitRouterVpcAttachmentAttributeShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateTransitRouterVpcAttachmentAttributeShrinkRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateTransitRouterVpcAttachmentAttributeShrinkRequest setOptionsShrink(String optionsShrink) {
        this.optionsShrink = optionsShrink;
        return this;
    }
    public String getOptionsShrink() {
        return this.optionsShrink;
    }

    public UpdateTransitRouterVpcAttachmentAttributeShrinkRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public UpdateTransitRouterVpcAttachmentAttributeShrinkRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UpdateTransitRouterVpcAttachmentAttributeShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateTransitRouterVpcAttachmentAttributeShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateTransitRouterVpcAttachmentAttributeShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdateTransitRouterVpcAttachmentAttributeShrinkRequest setTransitRouterAttachmentDescription(String transitRouterAttachmentDescription) {
        this.transitRouterAttachmentDescription = transitRouterAttachmentDescription;
        return this;
    }
    public String getTransitRouterAttachmentDescription() {
        return this.transitRouterAttachmentDescription;
    }

    public UpdateTransitRouterVpcAttachmentAttributeShrinkRequest setTransitRouterAttachmentId(String transitRouterAttachmentId) {
        this.transitRouterAttachmentId = transitRouterAttachmentId;
        return this;
    }
    public String getTransitRouterAttachmentId() {
        return this.transitRouterAttachmentId;
    }

    public UpdateTransitRouterVpcAttachmentAttributeShrinkRequest setTransitRouterAttachmentName(String transitRouterAttachmentName) {
        this.transitRouterAttachmentName = transitRouterAttachmentName;
        return this;
    }
    public String getTransitRouterAttachmentName() {
        return this.transitRouterAttachmentName;
    }

    public UpdateTransitRouterVpcAttachmentAttributeShrinkRequest setTransitRouterVPCAttachmentOptionsShrink(String transitRouterVPCAttachmentOptionsShrink) {
        this.transitRouterVPCAttachmentOptionsShrink = transitRouterVPCAttachmentOptionsShrink;
        return this;
    }
    public String getTransitRouterVPCAttachmentOptionsShrink() {
        return this.transitRouterVPCAttachmentOptionsShrink;
    }

}
