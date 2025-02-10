// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class UpgradeDBInstanceKernelVersionRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dds-bp2235****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The time when to perform the upgrade. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: immediately performs the upgrade.</li>
     * <li><strong>1</strong>: performs the upgrade during the maintenance window.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SwitchMode")
    public String switchMode;

    public static UpgradeDBInstanceKernelVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeDBInstanceKernelVersionRequest self = new UpgradeDBInstanceKernelVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeDBInstanceKernelVersionRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public UpgradeDBInstanceKernelVersionRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UpgradeDBInstanceKernelVersionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpgradeDBInstanceKernelVersionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpgradeDBInstanceKernelVersionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpgradeDBInstanceKernelVersionRequest setSwitchMode(String switchMode) {
        this.switchMode = switchMode;
        return this;
    }
    public String getSwitchMode() {
        return this.switchMode;
    }

}
