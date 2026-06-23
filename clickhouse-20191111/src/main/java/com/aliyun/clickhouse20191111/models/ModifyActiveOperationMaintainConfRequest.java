// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class ModifyActiveOperationMaintainConfRequest extends TeaModel {
    /**
     * <p>The day of the recurrence cycle.</p>
     * <ul>
     * <li><p>If CycleType is set to Month, this parameter specifies the day of the month. Valid values are 1 to 28. Use a comma (,) to separate multiple days.</p>
     * </li>
     * <li><p>If CycleType is set to Week, this parameter specifies the day of the week. Valid values are 1 to 7. Use a comma (,) to separate multiple days.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CycleTime")
    public String cycleTime;

    /**
     * <p>The recurrence cycle. Valid values:</p>
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
     * <p>The end time of the maintenance window. Use the HH:mmZ format. The time is in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>20:00Z</p>
     */
    @NameInMap("MaintainEndTime")
    public String maintainEndTime;

    /**
     * <p>The start time of the maintenance window. Use the HH:mmZ format. The time is in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>07:00Z</p>
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

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>Specifies whether the configuration is enabled. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: Enabled.</p>
     * </li>
     * <li><p><strong>2</strong>: Disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static ModifyActiveOperationMaintainConfRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyActiveOperationMaintainConfRequest self = new ModifyActiveOperationMaintainConfRequest();
        return TeaModel.build(map, self);
    }

    public ModifyActiveOperationMaintainConfRequest setCycleTime(String cycleTime) {
        this.cycleTime = cycleTime;
        return this;
    }
    public String getCycleTime() {
        return this.cycleTime;
    }

    public ModifyActiveOperationMaintainConfRequest setCycleType(String cycleType) {
        this.cycleType = cycleType;
        return this;
    }
    public String getCycleType() {
        return this.cycleType;
    }

    public ModifyActiveOperationMaintainConfRequest setMaintainEndTime(String maintainEndTime) {
        this.maintainEndTime = maintainEndTime;
        return this;
    }
    public String getMaintainEndTime() {
        return this.maintainEndTime;
    }

    public ModifyActiveOperationMaintainConfRequest setMaintainStartTime(String maintainStartTime) {
        this.maintainStartTime = maintainStartTime;
        return this;
    }
    public String getMaintainStartTime() {
        return this.maintainStartTime;
    }

    public ModifyActiveOperationMaintainConfRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyActiveOperationMaintainConfRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyActiveOperationMaintainConfRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyActiveOperationMaintainConfRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyActiveOperationMaintainConfRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ModifyActiveOperationMaintainConfRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
