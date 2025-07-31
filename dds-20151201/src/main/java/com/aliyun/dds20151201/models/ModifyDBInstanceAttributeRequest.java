// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceAttributeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dds-7xv0912d85924194</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DBInstanceReleaseProtection")
    public Boolean DBInstanceReleaseProtection;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyDBInstanceAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceAttributeRequest self = new ModifyDBInstanceAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceAttributeRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDBInstanceAttributeRequest setDBInstanceReleaseProtection(Boolean DBInstanceReleaseProtection) {
        this.DBInstanceReleaseProtection = DBInstanceReleaseProtection;
        return this;
    }
    public Boolean getDBInstanceReleaseProtection() {
        return this.DBInstanceReleaseProtection;
    }

    public ModifyDBInstanceAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyDBInstanceAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDBInstanceAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDBInstanceAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
