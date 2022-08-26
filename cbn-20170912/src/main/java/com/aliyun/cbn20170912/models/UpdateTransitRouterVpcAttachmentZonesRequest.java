// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class UpdateTransitRouterVpcAttachmentZonesRequest extends TeaModel {
    @NameInMap("AddZoneMappings")
    public java.util.List<UpdateTransitRouterVpcAttachmentZonesRequestAddZoneMappings> addZoneMappings;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RemoveZoneMappings")
    public java.util.List<UpdateTransitRouterVpcAttachmentZonesRequestRemoveZoneMappings> removeZoneMappings;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("TransitRouterAttachmentId")
    public String transitRouterAttachmentId;

    public static UpdateTransitRouterVpcAttachmentZonesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTransitRouterVpcAttachmentZonesRequest self = new UpdateTransitRouterVpcAttachmentZonesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTransitRouterVpcAttachmentZonesRequest setAddZoneMappings(java.util.List<UpdateTransitRouterVpcAttachmentZonesRequestAddZoneMappings> addZoneMappings) {
        this.addZoneMappings = addZoneMappings;
        return this;
    }
    public java.util.List<UpdateTransitRouterVpcAttachmentZonesRequestAddZoneMappings> getAddZoneMappings() {
        return this.addZoneMappings;
    }

    public UpdateTransitRouterVpcAttachmentZonesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateTransitRouterVpcAttachmentZonesRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateTransitRouterVpcAttachmentZonesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UpdateTransitRouterVpcAttachmentZonesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateTransitRouterVpcAttachmentZonesRequest setRemoveZoneMappings(java.util.List<UpdateTransitRouterVpcAttachmentZonesRequestRemoveZoneMappings> removeZoneMappings) {
        this.removeZoneMappings = removeZoneMappings;
        return this;
    }
    public java.util.List<UpdateTransitRouterVpcAttachmentZonesRequestRemoveZoneMappings> getRemoveZoneMappings() {
        return this.removeZoneMappings;
    }

    public UpdateTransitRouterVpcAttachmentZonesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateTransitRouterVpcAttachmentZonesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdateTransitRouterVpcAttachmentZonesRequest setTransitRouterAttachmentId(String transitRouterAttachmentId) {
        this.transitRouterAttachmentId = transitRouterAttachmentId;
        return this;
    }
    public String getTransitRouterAttachmentId() {
        return this.transitRouterAttachmentId;
    }

    public static class UpdateTransitRouterVpcAttachmentZonesRequestAddZoneMappings extends TeaModel {
        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static UpdateTransitRouterVpcAttachmentZonesRequestAddZoneMappings build(java.util.Map<String, ?> map) throws Exception {
            UpdateTransitRouterVpcAttachmentZonesRequestAddZoneMappings self = new UpdateTransitRouterVpcAttachmentZonesRequestAddZoneMappings();
            return TeaModel.build(map, self);
        }

        public UpdateTransitRouterVpcAttachmentZonesRequestAddZoneMappings setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public UpdateTransitRouterVpcAttachmentZonesRequestAddZoneMappings setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class UpdateTransitRouterVpcAttachmentZonesRequestRemoveZoneMappings extends TeaModel {
        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static UpdateTransitRouterVpcAttachmentZonesRequestRemoveZoneMappings build(java.util.Map<String, ?> map) throws Exception {
            UpdateTransitRouterVpcAttachmentZonesRequestRemoveZoneMappings self = new UpdateTransitRouterVpcAttachmentZonesRequestRemoveZoneMappings();
            return TeaModel.build(map, self);
        }

        public UpdateTransitRouterVpcAttachmentZonesRequestRemoveZoneMappings setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public UpdateTransitRouterVpcAttachmentZonesRequestRemoveZoneMappings setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
