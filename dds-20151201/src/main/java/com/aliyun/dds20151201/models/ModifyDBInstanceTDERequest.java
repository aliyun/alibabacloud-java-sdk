// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceTDERequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dds-bpxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The ID of the custom key.
     * Custom keys are supported only in the following regions. In other regions, the default key is used for encryption.</p>
     * <ul>
     * <li>Singapore (ap-southeast-1)</li>
     * <li>Hangzhou (cn-hangzhou)</li>
     * <li>Shanghai (cn-shanghai)</li>
     * <li>Beijing (cn-beijing)</li>
     * <li>Shenzhen (cn-shenzhen)</li>
     * <li>Hong Kong (China) (cn-hongkong)</li>
     * <li>Malaysia (ap-southeast-3)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>749c1df7-xxxx-xxxx-xxxx-xxxxxxxxxxxx</p>
     */
    @NameInMap("EncryptionKey")
    public String encryptionKey;

    /**
     * <p>The encryption method. Valid values: <strong>aes-256-cbc</strong>.</p>
     * <blockquote>
     * <p>This parameter is available only when the <strong>TDEStatus</strong> parameter is set to <strong>enabled</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>aes-256-cbc</p>
     */
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

    /**
     * <p>The ARN of the specified role. Format: <code>acs:ram::$accountID:role/$roleName</code>.</p>
     * <blockquote>
     * <ul>
     * <li><code>$accountID</code>: the ID of the Alibaba Cloud account. You can view the ID by logging on to the Alibaba Cloud Management Console, moving the pointer over the profile picture in the upper-right corner, and clicking Security Settings.</li>
     * <li><code>$roleName</code>: the name of the RAM role. You can view the name by logging on to the Resource Access Management (RAM) console, clicking RAM Roles in the left-side navigation pane, and viewing the RAM role name list.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::123456789012****:role/adminrole</p>
     */
    @NameInMap("RoleARN")
    public String roleARN;

    /**
     * <p>The time to modify the Transparent Data Encryption (TDE) status of the MongoDB instance. Valid values:</p>
     * <ul>
     * <li><p>0: immediately.</p>
     * </li>
     * <li><p>1: within the O&amp;M window.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SwitchMode")
    public String switchMode;

    /**
     * <p>The TDE status. Valid values: <strong>enabled</strong>, which indicates that TDE is enabled.</p>
     * <blockquote>
     * <p>You cannot disable TDE after it is enabled. Proceed with caution.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
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

    public ModifyDBInstanceTDERequest setSwitchMode(String switchMode) {
        this.switchMode = switchMode;
        return this;
    }
    public String getSwitchMode() {
        return this.switchMode;
    }

    public ModifyDBInstanceTDERequest setTDEStatus(String TDEStatus) {
        this.TDEStatus = TDEStatus;
        return this;
    }
    public String getTDEStatus() {
        return this.TDEStatus;
    }

}
