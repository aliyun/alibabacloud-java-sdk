// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTransitRouterVpnAttachmentRequest extends TeaModel {
    /**
     * <p>Specifies whether to allow the transit router to automatically advertise routes to the IPsec-VPN attachment. Valid values:</p>
     * <br>
     * <p>*   **true** (default): yes</p>
     * <p>*   **false**: no</p>
     */
    @NameInMap("AutoPublishRouteEnabled")
    public Boolean autoPublishRouteEnabled;

    /**
     * <p>The ID of the Cloud Enterprise Network (CEN) instance.</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The billing method.</p>
     * <br>
     * <p>Set the value to **POSTPAY**, which is the default value and specifies the pay-as-you-go billing method.</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among all requests. The token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not set this parameter, **ClientToken** is set to the value of **RequestId**. The value of **RequestId** for each API request may be different.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <br>
     * <p>*   **true**: performs a dry run. The system checks the required parameters, request syntax, and limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false** (default): performs a dry run and sends the request.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region where the transit router is deployed.</p>
     * <br>
     * <p>You can call the [DescribeChildInstanceRegions](~~132080~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The tags.</p>
     * <br>
     * <p>You can specify at most 20 tags in each call.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateTransitRouterVpnAttachmentRequestTag> tag;

    /**
     * <p>The description of the VPN attachment.</p>
     * <br>
     * <p>The description must be 2 to 256 characters in length. The description must start with a letter but cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("TransitRouterAttachmentDescription")
    public String transitRouterAttachmentDescription;

    /**
     * <p>The name of the VPN attachment.</p>
     * <br>
     * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (\_), and hyphens (-). It must start with a letter.</p>
     */
    @NameInMap("TransitRouterAttachmentName")
    public String transitRouterAttachmentName;

    /**
     * <p>The ID of the transit router.</p>
     */
    @NameInMap("TransitRouterId")
    public String transitRouterId;

    /**
     * <p>The ID of the IPsec-VPN attachment.</p>
     */
    @NameInMap("VpnId")
    public String vpnId;

    /**
     * <p>The ID of the Alibaba Cloud account to which the IPsec-VPN connection belongs.</p>
     * <br>
     * <p>*   If you do not set this parameter, the ID of the current Alibaba Cloud account is used.</p>
     * <p>*   You must set VpnOwnerId if you want to connect the transit router to an IPsec-VPN connection that belongs to another Alibaba Cloud account.</p>
     */
    @NameInMap("VpnOwnerId")
    public Long vpnOwnerId;

    /**
     * <p>The ID of the zone in the current region.</p>
     * <br>
     * <p>Resources are deployed in the specified zone.</p>
     */
    @NameInMap("Zone")
    public java.util.List<CreateTransitRouterVpnAttachmentRequestZone> zone;

    public static CreateTransitRouterVpnAttachmentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTransitRouterVpnAttachmentRequest self = new CreateTransitRouterVpnAttachmentRequest();
        return TeaModel.build(map, self);
    }

    public CreateTransitRouterVpnAttachmentRequest setAutoPublishRouteEnabled(Boolean autoPublishRouteEnabled) {
        this.autoPublishRouteEnabled = autoPublishRouteEnabled;
        return this;
    }
    public Boolean getAutoPublishRouteEnabled() {
        return this.autoPublishRouteEnabled;
    }

    public CreateTransitRouterVpnAttachmentRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public CreateTransitRouterVpnAttachmentRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateTransitRouterVpnAttachmentRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateTransitRouterVpnAttachmentRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateTransitRouterVpnAttachmentRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateTransitRouterVpnAttachmentRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateTransitRouterVpnAttachmentRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateTransitRouterVpnAttachmentRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateTransitRouterVpnAttachmentRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateTransitRouterVpnAttachmentRequest setTag(java.util.List<CreateTransitRouterVpnAttachmentRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateTransitRouterVpnAttachmentRequestTag> getTag() {
        return this.tag;
    }

    public CreateTransitRouterVpnAttachmentRequest setTransitRouterAttachmentDescription(String transitRouterAttachmentDescription) {
        this.transitRouterAttachmentDescription = transitRouterAttachmentDescription;
        return this;
    }
    public String getTransitRouterAttachmentDescription() {
        return this.transitRouterAttachmentDescription;
    }

    public CreateTransitRouterVpnAttachmentRequest setTransitRouterAttachmentName(String transitRouterAttachmentName) {
        this.transitRouterAttachmentName = transitRouterAttachmentName;
        return this;
    }
    public String getTransitRouterAttachmentName() {
        return this.transitRouterAttachmentName;
    }

    public CreateTransitRouterVpnAttachmentRequest setTransitRouterId(String transitRouterId) {
        this.transitRouterId = transitRouterId;
        return this;
    }
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

    public CreateTransitRouterVpnAttachmentRequest setVpnId(String vpnId) {
        this.vpnId = vpnId;
        return this;
    }
    public String getVpnId() {
        return this.vpnId;
    }

    public CreateTransitRouterVpnAttachmentRequest setVpnOwnerId(Long vpnOwnerId) {
        this.vpnOwnerId = vpnOwnerId;
        return this;
    }
    public Long getVpnOwnerId() {
        return this.vpnOwnerId;
    }

    public CreateTransitRouterVpnAttachmentRequest setZone(java.util.List<CreateTransitRouterVpnAttachmentRequestZone> zone) {
        this.zone = zone;
        return this;
    }
    public java.util.List<CreateTransitRouterVpnAttachmentRequestZone> getZone() {
        return this.zone;
    }

    public static class CreateTransitRouterVpnAttachmentRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * <br>
         * <p>The tag keys cannot be an empty string. The tag key can be up to 64 characters in length, and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.</p>
         * <br>
         * <p>You can specify at most 20 tag keys.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * <br>
         * <p>The tag value can be 0 to 128 characters in length, and cannot start with `aliyun` or `acs:`. It cannot contain `http://` or `https://`.</p>
         * <br>
         * <p>Each tag key must have a unique tag value. You can specify at most 20 tag values in each call.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateTransitRouterVpnAttachmentRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateTransitRouterVpnAttachmentRequestTag self = new CreateTransitRouterVpnAttachmentRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateTransitRouterVpnAttachmentRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateTransitRouterVpnAttachmentRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateTransitRouterVpnAttachmentRequestZone extends TeaModel {
        /**
         * <p>The zone ID of the read-only instance.</p>
         * <br>
         * <p>You can call the [ListTransitRouterAvailableResource](~~261356~~) operation to query the most recent zone list.</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static CreateTransitRouterVpnAttachmentRequestZone build(java.util.Map<String, ?> map) throws Exception {
            CreateTransitRouterVpnAttachmentRequestZone self = new CreateTransitRouterVpnAttachmentRequestZone();
            return TeaModel.build(map, self);
        }

        public CreateTransitRouterVpnAttachmentRequestZone setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
