// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class ModifyActiveOperationMaintainConfRequest extends TeaModel {
    /**
     * <p>The cycle time. </p>
     * <ul>
     * <li>If CycleType is set to Month, the value is one or more numbers from 1 to 28 that indicate the days of the month, separated by commas (,).</li>
     * <li>If CycleType is set to Week, the value is one or more numbers from 1 to 7 that indicate the days of the week, separated by commas (,).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CycleTime")
    public String cycleTime;

    /**
     * <p>The cycle type. Valid values:</p>
     * <ul>
     * <li>Month: Monthly.</li>
     * <li>Week: Weekly.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Week</p>
     */
    @NameInMap("CycleType")
    public String cycleType;

    /**
     * <p>The end time of the maintenance window. Format: HH:mmZ-HH:mmZ (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>20:00Z</p>
     */
    @NameInMap("MaintainEndTime")
    public String maintainEndTime;

    /**
     * <p>The start time of the task. Format: yyyy-MM-ddTHH:mm:ssZ (UTC).</p>
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
     * <p>Specifies whether the configuration takes effect. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Yes.</li>
     * <li><strong>2</strong>: No.</li>
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
