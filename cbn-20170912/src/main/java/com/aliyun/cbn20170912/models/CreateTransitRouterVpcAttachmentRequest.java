// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTransitRouterVpcAttachmentRequest extends TeaModel {
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
    public CreateTransitRouterVpcAttachmentRequestOptions options;

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
    public java.util.List<CreateTransitRouterVpcAttachmentRequestTag> tag;

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
    public java.util.Map<String, String> transitRouterVPCAttachmentOptions;

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
    public java.util.List<CreateTransitRouterVpcAttachmentRequestZoneMappings> zoneMappings;

    public static CreateTransitRouterVpcAttachmentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTransitRouterVpcAttachmentRequest self = new CreateTransitRouterVpcAttachmentRequest();
        return TeaModel.build(map, self);
    }

    public CreateTransitRouterVpcAttachmentRequest setAutoPublishRouteEnabled(Boolean autoPublishRouteEnabled) {
        this.autoPublishRouteEnabled = autoPublishRouteEnabled;
        return this;
    }
    public Boolean getAutoPublishRouteEnabled() {
        return this.autoPublishRouteEnabled;
    }

    public CreateTransitRouterVpcAttachmentRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public CreateTransitRouterVpcAttachmentRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateTransitRouterVpcAttachmentRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateTransitRouterVpcAttachmentRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateTransitRouterVpcAttachmentRequest setOptions(CreateTransitRouterVpcAttachmentRequestOptions options) {
        this.options = options;
        return this;
    }
    public CreateTransitRouterVpcAttachmentRequestOptions getOptions() {
        return this.options;
    }

    public CreateTransitRouterVpcAttachmentRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateTransitRouterVpcAttachmentRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateTransitRouterVpcAttachmentRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateTransitRouterVpcAttachmentRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateTransitRouterVpcAttachmentRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateTransitRouterVpcAttachmentRequest setTag(java.util.List<CreateTransitRouterVpcAttachmentRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateTransitRouterVpcAttachmentRequestTag> getTag() {
        return this.tag;
    }

    public CreateTransitRouterVpcAttachmentRequest setTransitRouterAttachmentDescription(String transitRouterAttachmentDescription) {
        this.transitRouterAttachmentDescription = transitRouterAttachmentDescription;
        return this;
    }
    public String getTransitRouterAttachmentDescription() {
        return this.transitRouterAttachmentDescription;
    }

    public CreateTransitRouterVpcAttachmentRequest setTransitRouterAttachmentName(String transitRouterAttachmentName) {
        this.transitRouterAttachmentName = transitRouterAttachmentName;
        return this;
    }
    public String getTransitRouterAttachmentName() {
        return this.transitRouterAttachmentName;
    }

    public CreateTransitRouterVpcAttachmentRequest setTransitRouterId(String transitRouterId) {
        this.transitRouterId = transitRouterId;
        return this;
    }
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

    public CreateTransitRouterVpcAttachmentRequest setTransitRouterVPCAttachmentOptions(java.util.Map<String, String> transitRouterVPCAttachmentOptions) {
        this.transitRouterVPCAttachmentOptions = transitRouterVPCAttachmentOptions;
        return this;
    }
    public java.util.Map<String, String> getTransitRouterVPCAttachmentOptions() {
        return this.transitRouterVPCAttachmentOptions;
    }

    public CreateTransitRouterVpcAttachmentRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateTransitRouterVpcAttachmentRequest setVpcOwnerId(Long vpcOwnerId) {
        this.vpcOwnerId = vpcOwnerId;
        return this;
    }
    public Long getVpcOwnerId() {
        return this.vpcOwnerId;
    }

    public CreateTransitRouterVpcAttachmentRequest setZoneMappings(java.util.List<CreateTransitRouterVpcAttachmentRequestZoneMappings> zoneMappings) {
        this.zoneMappings = zoneMappings;
        return this;
    }
    public java.util.List<CreateTransitRouterVpcAttachmentRequestZoneMappings> getZoneMappings() {
        return this.zoneMappings;
    }

    public static class CreateTransitRouterVpcAttachmentRequestOptions extends TeaModel {
        /**
         * <p>Specifies whether to enable the network appliance traffic redirection mode.</p>
         * <ul>
         * <li><strong>disable</strong> (default): disabled.</li>
         * <li><strong>enable</strong>: enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        @NameInMap("ApplianceModeSupport")
        public String applianceModeSupport;

        /**
         * <p>Specifies whether to enable IPv6 support.</p>
         * <ul>
         * <li><strong>disable</strong> (default): disabled.</li>
         * <li><strong>enable</strong>: enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        @NameInMap("Ipv6Support")
        public String ipv6Support;

        public static CreateTransitRouterVpcAttachmentRequestOptions build(java.util.Map<String, ?> map) throws Exception {
            CreateTransitRouterVpcAttachmentRequestOptions self = new CreateTransitRouterVpcAttachmentRequestOptions();
            return TeaModel.build(map, self);
        }

        public CreateTransitRouterVpcAttachmentRequestOptions setApplianceModeSupport(String applianceModeSupport) {
            this.applianceModeSupport = applianceModeSupport;
            return this;
        }
        public String getApplianceModeSupport() {
            return this.applianceModeSupport;
        }

        public CreateTransitRouterVpcAttachmentRequestOptions setIpv6Support(String ipv6Support) {
            this.ipv6Support = ipv6Support;
            return this;
        }
        public String getIpv6Support() {
            return this.ipv6Support;
        }

    }

    public static class CreateTransitRouterVpcAttachmentRequestTag extends TeaModel {
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

        public static CreateTransitRouterVpcAttachmentRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateTransitRouterVpcAttachmentRequestTag self = new CreateTransitRouterVpcAttachmentRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateTransitRouterVpcAttachmentRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateTransitRouterVpcAttachmentRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateTransitRouterVpcAttachmentRequestZoneMappings extends TeaModel {
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

        public static CreateTransitRouterVpcAttachmentRequestZoneMappings build(java.util.Map<String, ?> map) throws Exception {
            CreateTransitRouterVpcAttachmentRequestZoneMappings self = new CreateTransitRouterVpcAttachmentRequestZoneMappings();
            return TeaModel.build(map, self);
        }

        public CreateTransitRouterVpcAttachmentRequestZoneMappings setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public CreateTransitRouterVpcAttachmentRequestZoneMappings setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
