// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTransitRouterVpnAttachmentRequest extends TeaModel {
    @NameInMap("AutoPublishRouteEnabled")
    public Boolean autoPublishRouteEnabled;

    @NameInMap("CenId")
    public String cenId;

    @NameInMap("ChargeType")
    public String chargeType;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Tag")
    public java.util.List<CreateTransitRouterVpnAttachmentRequestTag> tag;

    @NameInMap("TransitRouterAttachmentDescription")
    public String transitRouterAttachmentDescription;

    @NameInMap("TransitRouterAttachmentName")
    public String transitRouterAttachmentName;

    @NameInMap("TransitRouterId")
    public String transitRouterId;

    @NameInMap("VpnId")
    public String vpnId;

    @NameInMap("VpnOwnerId")
    public Long vpnOwnerId;

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
        @NameInMap("Key")
        public String key;

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
