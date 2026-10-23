// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTransitRouterVpcAttachmentShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether the Enterprise Edition transit router automatically publishes route entries to the VPC instance.</p>
     * <ul>
     * <li><strong>false</strong> (default): does not automatically publish route entries.</li>
     * <li><strong>true</strong>: automatically publishes route entries.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPublishRouteEnabled")
    public Boolean autoPublishRouteEnabled;

    /**
     * <p>The instance ID of the Cloud Enterprise Network (CEN).</p>
     * 
     * <strong>example:</strong>
     * <p>cen-j3jzhw1zpau2km****</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The billing method. Default value: <strong>POSTPAY</strong>, which indicates the pay-as-you-go billing method.</p>
     * 
     * <strong>example:</strong>
     * <p>POSTPAY</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>Generate a unique value from your client for this parameter. ClientToken supports only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system uses the RequestId of the API request as the ClientToken. The RequestId of each API request is different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-001****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run on the request, including permission checks and instance status validation. Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default): sends a normal request and creates a VPC after the check passes. Use this value to create a VPC.</li>
     * <li><strong>true</strong>: sends a dry run request for validation only without creating the VPC attachment. The check includes whether required parameters are specified and whether the request format is valid. If the check fails, the corresponding error is returned. If the check passes, the error code <code>DryRunOperation</code> is returned.</li>
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

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region where the VPC instance is deployed.</p>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/132080.html">DescribeChildInstanceRegions</a> to query region IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The list of tags.</p>
     * <p>You can specify up to 20 tags at a time.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateTransitRouterVpcAttachmentShrinkRequestTag> tag;

    /**
     * <p>The description of the VPC attachment.</p>
     * <p>The description can be left empty or can contain 1 to 256 characters. It cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>testname</p>
     */
    @NameInMap("TransitRouterAttachmentDescription")
    public String transitRouterAttachmentDescription;

    /**
     * <p>The name of the VPC attachment.</p>
     * <p>The name can be left empty or can contain 1 to 128 characters. It cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>testname</p>
     */
    @NameInMap("TransitRouterAttachmentName")
    public String transitRouterAttachmentName;

    /**
     * <p>The instance ID of the Enterprise Edition transit router.</p>
     * 
     * <strong>example:</strong>
     * <p>tr-bp1su1ytdxtataupl****</p>
     */
    @NameInMap("TransitRouterId")
    public String transitRouterId;

    /**
     * <p>The list of feature attributes for the VPC attachment (to be deprecated — use the new Options parameter instead).</p>
     */
    @NameInMap("TransitRouterVPCAttachmentOptions")
    public String transitRouterVPCAttachmentOptionsShrink;

    /**
     * <p>The instance ID of the VPC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1kbjcre9vtsebo1****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The ID of the Alibaba Cloud account to which the VPC instance belongs. The default value is the ID of the current logon Alibaba Cloud account.</p>
     * <blockquote>
     * <p>This parameter is required if you want to attach a network instance that belongs to a different account.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1250123456123456</p>
     */
    @NameInMap("VpcOwnerId")
    public Long vpcOwnerId;

    /**
     * <p>Select a vSwitch instance in a zone supported by the Enterprise Edition transit router.</p>
     * <p>You can add up to 10 entries at a time.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ZoneMappings")
    public java.util.List<CreateTransitRouterVpcAttachmentShrinkRequestZoneMappings> zoneMappings;

    public static CreateTransitRouterVpcAttachmentShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTransitRouterVpcAttachmentShrinkRequest self = new CreateTransitRouterVpcAttachmentShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateTransitRouterVpcAttachmentShrinkRequest setAutoPublishRouteEnabled(Boolean autoPublishRouteEnabled) {
        this.autoPublishRouteEnabled = autoPublishRouteEnabled;
        return this;
    }
    public Boolean getAutoPublishRouteEnabled() {
        return this.autoPublishRouteEnabled;
    }

    public CreateTransitRouterVpcAttachmentShrinkRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public CreateTransitRouterVpcAttachmentShrinkRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateTransitRouterVpcAttachmentShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateTransitRouterVpcAttachmentShrinkRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateTransitRouterVpcAttachmentShrinkRequest setOptionsShrink(String optionsShrink) {
        this.optionsShrink = optionsShrink;
        return this;
    }
    public String getOptionsShrink() {
        return this.optionsShrink;
    }

    public CreateTransitRouterVpcAttachmentShrinkRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateTransitRouterVpcAttachmentShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateTransitRouterVpcAttachmentShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateTransitRouterVpcAttachmentShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateTransitRouterVpcAttachmentShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateTransitRouterVpcAttachmentShrinkRequest setTag(java.util.List<CreateTransitRouterVpcAttachmentShrinkRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateTransitRouterVpcAttachmentShrinkRequestTag> getTag() {
        return this.tag;
    }

    public CreateTransitRouterVpcAttachmentShrinkRequest setTransitRouterAttachmentDescription(String transitRouterAttachmentDescription) {
        this.transitRouterAttachmentDescription = transitRouterAttachmentDescription;
        return this;
    }
    public String getTransitRouterAttachmentDescription() {
        return this.transitRouterAttachmentDescription;
    }

    public CreateTransitRouterVpcAttachmentShrinkRequest setTransitRouterAttachmentName(String transitRouterAttachmentName) {
        this.transitRouterAttachmentName = transitRouterAttachmentName;
        return this;
    }
    public String getTransitRouterAttachmentName() {
        return this.transitRouterAttachmentName;
    }

    public CreateTransitRouterVpcAttachmentShrinkRequest setTransitRouterId(String transitRouterId) {
        this.transitRouterId = transitRouterId;
        return this;
    }
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

    public CreateTransitRouterVpcAttachmentShrinkRequest setTransitRouterVPCAttachmentOptionsShrink(String transitRouterVPCAttachmentOptionsShrink) {
        this.transitRouterVPCAttachmentOptionsShrink = transitRouterVPCAttachmentOptionsShrink;
        return this;
    }
    public String getTransitRouterVPCAttachmentOptionsShrink() {
        return this.transitRouterVPCAttachmentOptionsShrink;
    }

    public CreateTransitRouterVpcAttachmentShrinkRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateTransitRouterVpcAttachmentShrinkRequest setVpcOwnerId(Long vpcOwnerId) {
        this.vpcOwnerId = vpcOwnerId;
        return this;
    }
    public Long getVpcOwnerId() {
        return this.vpcOwnerId;
    }

    public CreateTransitRouterVpcAttachmentShrinkRequest setZoneMappings(java.util.List<CreateTransitRouterVpcAttachmentShrinkRequestZoneMappings> zoneMappings) {
        this.zoneMappings = zoneMappings;
        return this;
    }
    public java.util.List<CreateTransitRouterVpcAttachmentShrinkRequestZoneMappings> getZoneMappings() {
        return this.zoneMappings;
    }

    public static class CreateTransitRouterVpcAttachmentShrinkRequestTag extends TeaModel {
        /**
         * <p>The tag key of the resource.</p>
         * <p>If this parameter is specified, it cannot be an empty string. The tag key can be up to 64 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <p>You can specify up to 20 tag keys at a time.</p>
         * 
         * <strong>example:</strong>
         * <p>tagtest</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the resource.</p>
         * <p>If this parameter is specified, it cannot be empty. The tag value can be up to 128 characters in length and cannot start with aliyun or acs:. It cannot contain http:// or https://.</p>
         * <p>Each tag key corresponds to one tag value. You can specify up to 20 tag key-value pairs at a time.</p>
         * 
         * <strong>example:</strong>
         * <p>tagtest</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateTransitRouterVpcAttachmentShrinkRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateTransitRouterVpcAttachmentShrinkRequestTag self = new CreateTransitRouterVpcAttachmentShrinkRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateTransitRouterVpcAttachmentShrinkRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateTransitRouterVpcAttachmentShrinkRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateTransitRouterVpcAttachmentShrinkRequestZoneMappings extends TeaModel {
        /**
         * <p>The vSwitch instance in a zone supported by the Enterprise Edition transit router.</p>
         * <p>You can select vSwitch instances for up to 10 zones at a time.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1a214sbus8z3b54****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of a zone supported by the Enterprise Edition transit router.</p>
         * <p>You can call <a href="https://help.aliyun.com/document_detail/36064.html">DescribeZones</a> to query zone IDs.</p>
         * <p>You can select up to 10 zones at a time.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static CreateTransitRouterVpcAttachmentShrinkRequestZoneMappings build(java.util.Map<String, ?> map) throws Exception {
            CreateTransitRouterVpcAttachmentShrinkRequestZoneMappings self = new CreateTransitRouterVpcAttachmentShrinkRequestZoneMappings();
            return TeaModel.build(map, self);
        }

        public CreateTransitRouterVpcAttachmentShrinkRequestZoneMappings setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public CreateTransitRouterVpcAttachmentShrinkRequestZoneMappings setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
