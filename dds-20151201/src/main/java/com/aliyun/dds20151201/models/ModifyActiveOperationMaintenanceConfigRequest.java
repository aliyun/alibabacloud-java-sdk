// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyActiveOperationMaintenanceConfigRequest extends TeaModel {
    /**
     * <p>The day of the cycle.</p>
     * <ul>
     * <li><p>If CycleType is set to Month, enter a number from 1 to 28 to specify the day of the month. Use a comma (,) to separate multiple days.</p>
     * </li>
     * <li><p>If CycleType is set to Week, enter a number from 1 to 7 to specify the day of the week. Use a comma (,) to separate multiple days.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1,2,3</p>
     */
    @NameInMap("CycleTime")
    public String cycleTime;

    /**
     * <p>The cycle type.</p>
     * <ul>
     * <li><p>Month: monthly</p>
     * </li>
     * <li><p>Week: weekly</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Week</p>
     */
    @NameInMap("CycleType")
    public String cycleType;

    /**
     * <p>The end time of the O\&amp;M window for the instance. The time is in the HH:mmZ format and is in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>22:00Z</p>
     */
    @NameInMap("MaintainEndTime")
    public String maintainEndTime;

    /**
     * <p>The start time of the O\&amp;M window for the instance. The time is in the HH:mmZ format and is in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>21:00Z</p>
     */
    @NameInMap("MaintainStartTime")
    public String maintainStartTime;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Specifies whether the configuration is enabled.</p>
     * <ul>
     * <li><p>1: enabled</p>
     * </li>
     * <li><p>2: disabled</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static ModifyActiveOperationMaintenanceConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyActiveOperationMaintenanceConfigRequest self = new ModifyActiveOperationMaintenanceConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyActiveOperationMaintenanceConfigRequest setCycleTime(String cycleTime) {
        this.cycleTime = cycleTime;
        return this;
    }
    public String getCycleTime() {
        return this.cycleTime;
    }

    public ModifyActiveOperationMaintenanceConfigRequest setCycleType(String cycleType) {
        this.cycleType = cycleType;
        return this;
    }
    public String getCycleType() {
        return this.cycleType;
    }

    public ModifyActiveOperationMaintenanceConfigRequest setMaintainEndTime(String maintainEndTime) {
        this.maintainEndTime = maintainEndTime;
        return this;
    }
    public String getMaintainEndTime() {
        return this.maintainEndTime;
    }

    public ModifyActiveOperationMaintenanceConfigRequest setMaintainStartTime(String maintainStartTime) {
        this.maintainStartTime = maintainStartTime;
        return this;
    }
    public String getMaintainStartTime() {
        return this.maintainStartTime;
    }

    public ModifyActiveOperationMaintenanceConfigRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyActiveOperationMaintenanceConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyActiveOperationMaintenanceConfigRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyActiveOperationMaintenanceConfigRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyActiveOperationMaintenanceConfigRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
