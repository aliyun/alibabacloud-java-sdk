// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class MigrateAvailableZoneRequest extends TeaModel {
    // The ID of the instance.
    // 
    // >  If the instance is deployed in a VPC, you must specify the **Vswitch** parameter.
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    // The time when the instance is migrated to the destination zone. Valid values:
    // 
    // *   **Immediately**: The instance is immediately migrated to the destination zone.
    // *   **MaintainTime**: The instance is migrated to the destination zone during the maintenance window of the instance.
    // 
    // Default value: **Immediately**.
    @NameInMap("EffectiveTime")
    public String effectiveTime;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // The ID of the vSwitch in the destination zone.
    // 
    // >  If the instance is deployed in a VPC, you must specify this parameter.
    @NameInMap("Vswitch")
    public String vswitch;

    // The ID of the destination zone.
    // 
    // > * The source zone and the destination zone belong to the same region.
    // > * You can call the [DescribeRegions](~~61933~~) operation to query the most recent zone list.
    @NameInMap("ZoneId")
    public String zoneId;

    public static MigrateAvailableZoneRequest build(java.util.Map<String, ?> map) throws Exception {
        MigrateAvailableZoneRequest self = new MigrateAvailableZoneRequest();
        return TeaModel.build(map, self);
    }

    public MigrateAvailableZoneRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public MigrateAvailableZoneRequest setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    public MigrateAvailableZoneRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public MigrateAvailableZoneRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public MigrateAvailableZoneRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public MigrateAvailableZoneRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public MigrateAvailableZoneRequest setVswitch(String vswitch) {
        this.vswitch = vswitch;
        return this;
    }
    public String getVswitch() {
        return this.vswitch;
    }

    public MigrateAvailableZoneRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
