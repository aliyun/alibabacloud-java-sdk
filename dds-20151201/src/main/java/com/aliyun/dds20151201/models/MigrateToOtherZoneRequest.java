// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class MigrateToOtherZoneRequest extends TeaModel {
    /**
     * <p>The time when the instance is migrated to the destination zone. Valid values:</p>
     * <ul>
     * <li><strong>Immediately</strong> (default): The instance is migrated immediately.</li>
     * <li><strong>MaintainTime</strong>: The instance is migrated during its maintenance window.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Immediately</p>
     */
    @NameInMap("EffectiveTime")
    public String effectiveTime;

    /**
     * <p>The ID of the instance.</p>
     * <blockquote>
     * <p> If the network type of the instance is VPC, you must specify the <strong>Vswitch</strong> parameter .</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dds-bp2658****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the vSwitch in the destination zone.</p>
     * <blockquote>
     * <p> This parameter is valid and required only when the network type of the instance is VPC.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp67ac****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the destination zone to which you want to migrate the ApsaraDB for MongoDB instance.</p>
     * <blockquote>
     * <ul>
     * <li>The destination and source zones must be in one region.</li>
     * <li>You can call <a href="https://help.aliyun.com/document_detail/61933.html">DescribeRegions</a> to query the zone IDs.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-b</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static MigrateToOtherZoneRequest build(java.util.Map<String, ?> map) throws Exception {
        MigrateToOtherZoneRequest self = new MigrateToOtherZoneRequest();
        return TeaModel.build(map, self);
    }

    public MigrateToOtherZoneRequest setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    public MigrateToOtherZoneRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public MigrateToOtherZoneRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public MigrateToOtherZoneRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public MigrateToOtherZoneRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public MigrateToOtherZoneRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public MigrateToOtherZoneRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public MigrateToOtherZoneRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
