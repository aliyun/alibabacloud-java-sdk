// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTransitRouterPeerAttachmentRequest extends TeaModel {
    @NameInMap("AutoPublishRouteEnabled")
    public Boolean autoPublishRouteEnabled;

    @NameInMap("Bandwidth")
    public Integer bandwidth;

    @NameInMap("BandwidthType")
    public String bandwidthType;

    @NameInMap("CenBandwidthPackageId")
    public String cenBandwidthPackageId;

    @NameInMap("CenId")
    public String cenId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PeerTransitRouterId")
    public String peerTransitRouterId;

    @NameInMap("PeerTransitRouterRegionId")
    public String peerTransitRouterRegionId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("TransitRouterAttachmentDescription")
    public String transitRouterAttachmentDescription;

    @NameInMap("TransitRouterAttachmentName")
    public String transitRouterAttachmentName;

    @NameInMap("TransitRouterId")
    public String transitRouterId;

    public static CreateTransitRouterPeerAttachmentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTransitRouterPeerAttachmentRequest self = new CreateTransitRouterPeerAttachmentRequest();
        return TeaModel.build(map, self);
    }

    public CreateTransitRouterPeerAttachmentRequest setAutoPublishRouteEnabled(Boolean autoPublishRouteEnabled) {
        this.autoPublishRouteEnabled = autoPublishRouteEnabled;
        return this;
    }
    public Boolean getAutoPublishRouteEnabled() {
        return this.autoPublishRouteEnabled;
    }

    public CreateTransitRouterPeerAttachmentRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public CreateTransitRouterPeerAttachmentRequest setBandwidthType(String bandwidthType) {
        this.bandwidthType = bandwidthType;
        return this;
    }
    public String getBandwidthType() {
        return this.bandwidthType;
    }

    public CreateTransitRouterPeerAttachmentRequest setCenBandwidthPackageId(String cenBandwidthPackageId) {
        this.cenBandwidthPackageId = cenBandwidthPackageId;
        return this;
    }
    public String getCenBandwidthPackageId() {
        return this.cenBandwidthPackageId;
    }

    public CreateTransitRouterPeerAttachmentRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public CreateTransitRouterPeerAttachmentRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateTransitRouterPeerAttachmentRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateTransitRouterPeerAttachmentRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateTransitRouterPeerAttachmentRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateTransitRouterPeerAttachmentRequest setPeerTransitRouterId(String peerTransitRouterId) {
        this.peerTransitRouterId = peerTransitRouterId;
        return this;
    }
    public String getPeerTransitRouterId() {
        return this.peerTransitRouterId;
    }

    public CreateTransitRouterPeerAttachmentRequest setPeerTransitRouterRegionId(String peerTransitRouterRegionId) {
        this.peerTransitRouterRegionId = peerTransitRouterRegionId;
        return this;
    }
    public String getPeerTransitRouterRegionId() {
        return this.peerTransitRouterRegionId;
    }

    public CreateTransitRouterPeerAttachmentRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateTransitRouterPeerAttachmentRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateTransitRouterPeerAttachmentRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateTransitRouterPeerAttachmentRequest setTransitRouterAttachmentDescription(String transitRouterAttachmentDescription) {
        this.transitRouterAttachmentDescription = transitRouterAttachmentDescription;
        return this;
    }
    public String getTransitRouterAttachmentDescription() {
        return this.transitRouterAttachmentDescription;
    }

    public CreateTransitRouterPeerAttachmentRequest setTransitRouterAttachmentName(String transitRouterAttachmentName) {
        this.transitRouterAttachmentName = transitRouterAttachmentName;
        return this;
    }
    public String getTransitRouterAttachmentName() {
        return this.transitRouterAttachmentName;
    }

    public CreateTransitRouterPeerAttachmentRequest setTransitRouterId(String transitRouterId) {
        this.transitRouterId = transitRouterId;
        return this;
    }
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

}
