// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class UpdateTransitRouterVpcAttachmentZonesRequest extends TeaModel {
    /**
     * <p>The zone mappings that you want to add to the VPC connection.</p>
     */
    @NameInMap("AddZoneMappings")
    public java.util.List<UpdateTransitRouterVpcAttachmentZonesRequestAddZoneMappings> addZoneMappings;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must make sure that it is unique among different requests. ClientToken can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not set this parameter, ClientToken is set to the value of RequestId. The value of RequestId for each API request may be different.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether only to check the request. Valid values:</p>
     * <br>
     * <p>*   **true**: prechecks the request but does not modify the zones or vSwitches of the VPC connection. The system checks the required parameters, request syntax, and limits. If the request fails the check, an error message is returned. If the request passes the check, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false** (default): sends the request. If the request passes the precheck, the zones and vSwitches of the VPC connection are modified.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The zone mappings that you want to remove from the VPC connection.</p>
     */
    @NameInMap("RemoveZoneMappings")
    public java.util.List<UpdateTransitRouterVpcAttachmentZonesRequestRemoveZoneMappings> removeZoneMappings;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the VPC connection.</p>
     */
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
        /**
         * <p>The ID of the vSwitch that you want to add to the VPC connection.</p>
         * <br>
         * <p>You can specify at most 10 vSwitches in each call.</p>
         * <br>
         * <p>*   If the VPC connection belongs to the current Alibaba Cloud account, you can call the [DescribeVSwitches](~~35748~~) operation to query the IDs of the vSwitches zones of the VPC.</p>
         * <p>*   If the VPC connection belongs to another Alibaba Cloud account, you can call the [ListGrantVSwitchesToCen](~~427599~~) operation to query the IDs of the vSwitches zones of the VPC.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the zone where the vSwitch that you want to add to the VPC connection is deployed.</p>
         * <br>
         * <p>You can specify at most 10 vSwitches in each call.</p>
         */
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
        /**
         * <p>The ID of the vSwitch that you want to remove from the VPC connection.</p>
         * <br>
         * <p>You can remove at most 10 vSwitches from a VPC in each call.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the zone where the vSwitch that you want to remove from the VPC connection is deployed.</p>
         * <br>
         * <p>You can remove at most 10 vSwitches from a VPC in each call.</p>
         */
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
