// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTransitRouterVpcAttachmentShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the Enterprise Edition transit router to automatically advertise routes to the VPC.</p>
     * <ul>
     * <li><p><strong>false</strong> (default): Do not automatically advertise routes.</p>
     * </li>
     * <li><p><strong>true</strong>: Automatically advertise routes.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPublishRouteEnabled")
    public Boolean autoPublishRouteEnabled;

    /**
     * <p>The ID of the CEN instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cen-j3jzhw1zpau2km****</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The billing method. The default value is <strong>POSTPAY</strong> (pay-as-you-go).</p>
     * 
     * <strong>example:</strong>
     * <p>POSTPAY</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The client token used to ensure request idempotency.</p>
     * <p>You must generate a value on your client that is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the request ID as the client token, which is unique for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-001****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run to check the validity of the request without creating the resource. The check includes permissions and instance status. Valid values:</p>
     * <ul>
     * <li><p><strong>false</strong> (default): Sends a normal request. The system creates the VPC connection if the request is valid.</p>
     * </li>
     * <li><p><strong>true</strong>: Sends only a check request. The system checks required parameters, request format, and permissions. The VPC connection is not created. If the check fails, an error is returned. If the check succeeds, the <code>DryRunOperation</code> error code is returned.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("Options")
    public String optionsShrink;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region where the VPC is located.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/132080.html">DescribeChildInstanceRegions</a> operation to query region IDs.</p>
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
     * <p>The tags to add to the VPC connection.</p>
     * <p>You can add up to 20 tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateTransitRouterVpcAttachmentShrinkRequestTag> tag;

    /**
     * <p>The description of the VPC connection.</p>
     * <p>The description can be empty or 1 to 256 characters long, and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>testname</p>
     */
    @NameInMap("TransitRouterAttachmentDescription")
    public String transitRouterAttachmentDescription;

    /**
     * <p>The name of the VPC connection.</p>
     * <p>The name can be empty or 1 to 128 characters long, and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>testname</p>
     */
    @NameInMap("TransitRouterAttachmentName")
    public String transitRouterAttachmentName;

    /**
     * <p>The ID of the Enterprise Edition transit router.</p>
     * 
     * <strong>example:</strong>
     * <p>tr-bp1su1ytdxtataupl****</p>
     */
    @NameInMap("TransitRouterId")
    public String transitRouterId;

    /**
     * <p>The properties of the VPC connection. This parameter is deprecated. We recommend that you use the <code>Options</code> parameter instead.</p>
     */
    @NameInMap("TransitRouterVPCAttachmentOptions")
    public String transitRouterVPCAttachmentOptionsShrink;

    /**
     * <p>The ID of the VPC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1kbjcre9vtsebo1****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The ID of the Alibaba Cloud account that owns the VPC. By default, this is the ID of the current Alibaba Cloud account.</p>
     * <blockquote>
     * <p>This parameter is required if you want to attach a cross-account network instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1250123456123456</p>
     */
    @NameInMap("VpcOwnerId")
    public Long vpcOwnerId;

    /**
     * <p>The zone mappings for the VPC connection. For each mapping, you must specify a vSwitch in a zone that is supported by the Enterprise Edition transit router.</p>
     * <p>You can specify up to 10 zone mappings.</p>
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
         * <p>The key of the tag.</p>
         * <p>The tag key cannot be an empty string. The key can be up to 64 characters long and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>tagtest</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * <p>The tag value can be an empty string or a string up to 128 characters long. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
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
         * <p>The ID of the vSwitch.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1a214sbus8z3b54****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the zone. The zone must be supported by the Enterprise Edition transit router.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36064.html">DescribeZones</a> operation to query available zones.</p>
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
