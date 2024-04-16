// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class MigrateAvailableZoneRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * <br>
     * <p>> If the instance is deployed in a VPC, you must specify the **Vswitch** parameter.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The time when the instance is migrated to the destination zone. Valid values:</p>
     * <br>
     * <p>*   **Immediately**: The instance is immediately migrated to the destination zone.</p>
     * <p>*   **MaintainTime**: The instance is migrated to the destination zone during the maintenance window of the instance.</p>
     * <br>
     * <p>Default value: **Immediately**.</p>
     */
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

    /**
     * <p>The ID of the vSwitch in the destination zone.</p>
     * <br>
     * <p>> If the instance is deployed in a VPC, you must specify this parameter.</p>
     */
    @NameInMap("Vswitch")
    public String vswitch;

    /**
     * <p>The ID of the destination zone.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   The source zone and the destination zone belong to the same region.</p>
     * <br>
     * <p>*   You can call the [DescribeRegions](~~61933~~) operation to query the zone ID.</p>
     */
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
