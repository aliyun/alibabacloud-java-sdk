// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class UpdateTransitRouterVpcAttachmentZonesRequest extends TeaModel {
    /**
     * <p>The list of zones and vSwitches to add to the VPC connection.</p>
     */
    @NameInMap("AddZoneMappings")
    public java.util.List<UpdateTransitRouterVpcAttachmentZonesRequestAddZoneMappings> addZoneMappings;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs a dry run. The system checks the required parameters, request syntax, and business restrictions. If the request fails the dry run, the corresponding error message is returned. If the request passes the dry run, the error code <code>DryRunOperation</code> is returned. The zones and vSwitches of the VPC connection are not modified.</li>
     * <li><strong>false</strong> (default): performs a dry run and sends the request. If the request passes the dry run, the zones and vSwitches of the VPC connection are modified.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The list of zones and vSwitches to remove from the VPC connection.</p>
     */
    @NameInMap("RemoveZoneMappings")
    public java.util.List<UpdateTransitRouterVpcAttachmentZonesRequestRemoveZoneMappings> removeZoneMappings;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the VPC connection.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tr-attach-9bbqyygouv4cpn****</p>
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
         * <p>The ID of the vSwitch to add to the VPC connection.</p>
         * <p>You can add up to 10 vSwitches at a time.</p>
         * <ul>
         * <li>If the Alibaba Cloud account that you use to log on and the VPC-connected instance belong to the same account, you can invoke the <a href="https://help.aliyun.com/document_detail/35748.html">DescribeVSwitches</a> operation to query the vSwitch IDs and the IDs of the zones to which the vSwitches belong in the VPC-connected instance.</li>
         * <li>If the Alibaba Cloud account that you use to log on and the VPC-connected instance belong to different accounts, you can invoke the <a href="https://help.aliyun.com/document_detail/427599.html">ListGrantVSwitchesToCen</a> operation to query the vSwitch IDs and the IDs of the zones to which the vSwitches belong in the VPC-connected instance.</li>
         * </ul>
         * <p>If you set <strong>VSwitchId</strong>, you must also set <strong>ZoneId</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-wz988dda8ldm4uvmx****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the zone to which the vSwitch to add to the VPC connection belongs.</p>
         * <p>You can add up to 10 vSwitches at a time.</p>
         * <p>If you set <strong>ZoneId</strong>, you must also set <strong>VSwitchId</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
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
         * <p>The ID of the vSwitch to remove from the VPC connection.</p>
         * <p>You can remove up to 10 vSwitches at a time.</p>
         * <p>If you set <strong>VSwitchId</strong>, you must also set <strong>ZoneId</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-wz9f5izl6wshndmta****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the zone to which the vSwitch to remove from the VPC connection belongs.</p>
         * <p>You can remove up to 10 vSwitches at a time.</p>
         * <p>If you set <strong>ZoneId</strong>, you must also set <strong>VSwitchId</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
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
