// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class UpdateTransitRouterVpcAttachmentAttributeRequest extends TeaModel {
    /**
     * <p>Specifies whether to allow the Enterprise Edition transit router to automatically advertise routes to the VPC.</p>
     * <ul>
     * <li><p><strong>false</strong>: The transit router does not automatically advertise routes.</p>
     * </li>
     * <li><p><strong>true</strong>: The transit router automatically advertises routes.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPublishRouteEnabled")
    public Boolean autoPublishRouteEnabled;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can generate the token from your client, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
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
     * <p>Specifies whether to perform a dry run, which checks for issues such as permissions and instance status. Valid values:</p>
     * <ul>
     * <li><p><strong>false</strong> (default): sends a normal request. After the request passes the check, the system modifies the name and description of the VPC connection.</p>
     * </li>
     * <li><p><strong>true</strong>: sends a check request. The system validates the request without modifying the VPC connection. If the check passes, the system returns the ID of the request. Otherwise, the system returns an error.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The billing method.</p>
     */
    @NameInMap("Options")
    public UpdateTransitRouterVpcAttachmentAttributeRequestOptions options;

    /**
     * <p>The billing method.</p>
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
     * <p>The new description of the VPC connection.</p>
     * <p>The description can be empty or 1 to 256 characters in length, and cannot start with http\:// or https\://.</p>
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
     * <p>The new name of the VPC connection.</p>
     * <p>The name can be empty or 1 to 128 characters in length, and cannot start with http\:// or https\://.</p>
     * 
     * <strong>example:</strong>
     * <p>testname</p>
     */
    @NameInMap("TransitRouterAttachmentName")
    public String transitRouterAttachmentName;

    /**
     * <p>The feature properties of the VPC connection. This parameter is deprecated. We recommend that you use the <code>Options</code> parameter.</p>
     */
    @NameInMap("TransitRouterVPCAttachmentOptions")
    public java.util.Map<String, String> transitRouterVPCAttachmentOptions;

    public static UpdateTransitRouterVpcAttachmentAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTransitRouterVpcAttachmentAttributeRequest self = new UpdateTransitRouterVpcAttachmentAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTransitRouterVpcAttachmentAttributeRequest setAutoPublishRouteEnabled(Boolean autoPublishRouteEnabled) {
        this.autoPublishRouteEnabled = autoPublishRouteEnabled;
        return this;
    }
    public Boolean getAutoPublishRouteEnabled() {
        return this.autoPublishRouteEnabled;
    }

    public UpdateTransitRouterVpcAttachmentAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateTransitRouterVpcAttachmentAttributeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateTransitRouterVpcAttachmentAttributeRequest setOptions(UpdateTransitRouterVpcAttachmentAttributeRequestOptions options) {
        this.options = options;
        return this;
    }
    public UpdateTransitRouterVpcAttachmentAttributeRequestOptions getOptions() {
        return this.options;
    }

    public UpdateTransitRouterVpcAttachmentAttributeRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public UpdateTransitRouterVpcAttachmentAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UpdateTransitRouterVpcAttachmentAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateTransitRouterVpcAttachmentAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateTransitRouterVpcAttachmentAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdateTransitRouterVpcAttachmentAttributeRequest setTransitRouterAttachmentDescription(String transitRouterAttachmentDescription) {
        this.transitRouterAttachmentDescription = transitRouterAttachmentDescription;
        return this;
    }
    public String getTransitRouterAttachmentDescription() {
        return this.transitRouterAttachmentDescription;
    }

    public UpdateTransitRouterVpcAttachmentAttributeRequest setTransitRouterAttachmentId(String transitRouterAttachmentId) {
        this.transitRouterAttachmentId = transitRouterAttachmentId;
        return this;
    }
    public String getTransitRouterAttachmentId() {
        return this.transitRouterAttachmentId;
    }

    public UpdateTransitRouterVpcAttachmentAttributeRequest setTransitRouterAttachmentName(String transitRouterAttachmentName) {
        this.transitRouterAttachmentName = transitRouterAttachmentName;
        return this;
    }
    public String getTransitRouterAttachmentName() {
        return this.transitRouterAttachmentName;
    }

    public UpdateTransitRouterVpcAttachmentAttributeRequest setTransitRouterVPCAttachmentOptions(java.util.Map<String, String> transitRouterVPCAttachmentOptions) {
        this.transitRouterVPCAttachmentOptions = transitRouterVPCAttachmentOptions;
        return this;
    }
    public java.util.Map<String, String> getTransitRouterVPCAttachmentOptions() {
        return this.transitRouterVPCAttachmentOptions;
    }

    public static class UpdateTransitRouterVpcAttachmentAttributeRequestOptions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>enable</p>
         */
        @NameInMap("ApplianceModeSupport")
        public String applianceModeSupport;

        /**
         * <strong>example:</strong>
         * <p>enable</p>
         */
        @NameInMap("Ipv6Support")
        public String ipv6Support;

        public static UpdateTransitRouterVpcAttachmentAttributeRequestOptions build(java.util.Map<String, ?> map) throws Exception {
            UpdateTransitRouterVpcAttachmentAttributeRequestOptions self = new UpdateTransitRouterVpcAttachmentAttributeRequestOptions();
            return TeaModel.build(map, self);
        }

        public UpdateTransitRouterVpcAttachmentAttributeRequestOptions setApplianceModeSupport(String applianceModeSupport) {
            this.applianceModeSupport = applianceModeSupport;
            return this;
        }
        public String getApplianceModeSupport() {
            return this.applianceModeSupport;
        }

        public UpdateTransitRouterVpcAttachmentAttributeRequestOptions setIpv6Support(String ipv6Support) {
            this.ipv6Support = ipv6Support;
            return this;
        }
        public String getIpv6Support() {
            return this.ipv6Support;
        }

    }

}
