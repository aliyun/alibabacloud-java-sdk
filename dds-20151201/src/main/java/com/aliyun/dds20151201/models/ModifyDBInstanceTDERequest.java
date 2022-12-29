// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceTDERequest extends TeaModel {
    // The ID of an instance.
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    // The custom key.
    @NameInMap("EncryptionKey")
    public String encryptionKey;

    // The encryption method. Set the value to **AES-256-CBC**.
    // 
    // >  This parameter is valid only when you specify the **TEDStatus** parameter to **enabled**.
    @NameInMap("EncryptorName")
    public String encryptorName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // The ARN of the role. It is in the format of `acs:ram::$accountID:role/$roleName`.
    // 
    // > * `$accountID`: indicates the ID of the Alibaba Cloud account that owns the RAM role. To view the account ID, log on to the Alibaba Cloud Management Console, move your pointer over your profile picture in the upper-right corner, and then click Security Settings.
    // > * `$roleName`: indicates the name of the RAM role. To view the RAM role name, perform the following steps: Log on to the RAM console. In the left-side navigation pane, click RAM Roles. In the RAM Role Name column on the page that appears, you can view the name of the RAM role.
    @NameInMap("RoleARN")
    public String roleARN;

    @NameInMap("SecurityToken")
    public String securityToken;

    // The TDE status. Set the value to **Enabled**.
    // 
    // >  Exercise caution when enabling TDE. After TDE is enabled, it cannot be disabled.
    @NameInMap("TDEStatus")
    public String TDEStatus;

    public static ModifyDBInstanceTDERequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceTDERequest self = new ModifyDBInstanceTDERequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceTDERequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDBInstanceTDERequest setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
        return this;
    }
    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    public ModifyDBInstanceTDERequest setEncryptorName(String encryptorName) {
        this.encryptorName = encryptorName;
        return this;
    }
    public String getEncryptorName() {
        return this.encryptorName;
    }

    public ModifyDBInstanceTDERequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyDBInstanceTDERequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDBInstanceTDERequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDBInstanceTDERequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyDBInstanceTDERequest setRoleARN(String roleARN) {
        this.roleARN = roleARN;
        return this;
    }
    public String getRoleARN() {
        return this.roleARN;
    }

    public ModifyDBInstanceTDERequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ModifyDBInstanceTDERequest setTDEStatus(String TDEStatus) {
        this.TDEStatus = TDEStatus;
        return this;
    }
    public String getTDEStatus() {
        return this.TDEStatus;
    }

}
