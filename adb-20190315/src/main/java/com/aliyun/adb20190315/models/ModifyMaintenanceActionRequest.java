// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class ModifyMaintenanceActionRequest extends TeaModel {
    /**
     * <p>The ID of the pending O\&M event. You can specify multiple IDs to batch change the switchover time. Separate multiple IDs with commas (,).</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   You can call the [DescribeMaintenanceAction](~~271738~~) operation to query the information about pending O\&M events, including the event ID.</p>
     * <br>
     * <p>*   You can change the switchover time only for pending O\&M events. The switchover time of historical O\&M events cannot be changed. For more information about the status of pending and historical O\&M events, see [DescribeMaintenanceAction](~~271738~~).</p>
     */
    @NameInMap("Ids")
    public String ids;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region where the pending O\&M event occurs.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   You can call the [DescribeRegions](~~143074~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The point in time when you want the system to perform operations on the pending O\&M event. Specify the time in the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time must be in UTC.</p>
     */
    @NameInMap("SwitchTime")
    public String switchTime;

    public static ModifyMaintenanceActionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyMaintenanceActionRequest self = new ModifyMaintenanceActionRequest();
        return TeaModel.build(map, self);
    }

    public ModifyMaintenanceActionRequest setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

    public ModifyMaintenanceActionRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyMaintenanceActionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyMaintenanceActionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyMaintenanceActionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyMaintenanceActionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyMaintenanceActionRequest setSwitchTime(String switchTime) {
        this.switchTime = switchTime;
        return this;
    }
    public String getSwitchTime() {
        return this.switchTime;
    }

}
