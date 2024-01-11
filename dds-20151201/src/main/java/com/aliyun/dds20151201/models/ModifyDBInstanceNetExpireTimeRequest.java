// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceNetExpireTimeRequest extends TeaModel {
    /**
     * <p>The retention period of the classic network endpoint of the instance. Valid values: **14**, **30**, **60**, and **120**. Unit: day.</p>
     */
    @NameInMap("ClassicExpendExpiredDays")
    public Integer classicExpendExpiredDays;

    /**
     * <p>The endpoint of the instance.</p>
     */
    @NameInMap("ConnectionString")
    public String connectionString;

    /**
     * <p>The instance ID.</p>
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

    public static ModifyDBInstanceNetExpireTimeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceNetExpireTimeRequest self = new ModifyDBInstanceNetExpireTimeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceNetExpireTimeRequest setClassicExpendExpiredDays(Integer classicExpendExpiredDays) {
        this.classicExpendExpiredDays = classicExpendExpiredDays;
        return this;
    }
    public Integer getClassicExpendExpiredDays() {
        return this.classicExpendExpiredDays;
    }

    public ModifyDBInstanceNetExpireTimeRequest setConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }
    public String getConnectionString() {
        return this.connectionString;
    }

    public ModifyDBInstanceNetExpireTimeRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDBInstanceNetExpireTimeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyDBInstanceNetExpireTimeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDBInstanceNetExpireTimeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDBInstanceNetExpireTimeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
