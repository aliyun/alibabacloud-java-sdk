// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceTDERequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dds-bpxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The ID of the custom key.
     * Custom keys are supported only in the following regions. In other regions, the default key is used.</p>
     * <ul>
     * <li><p>Singapore (ap-southeast-1)</p>
     * </li>
     * <li><p>Hangzhou (cn-hangzhou)</p>
     * </li>
     * <li><p>Shanghai (cn-shanghai)</p>
     * </li>
     * <li><p>Beijing (cn-beijing)</p>
     * </li>
     * <li><p>Shenzhen (cn-shenzhen)</p>
     * </li>
     * <li><p>Hong Kong (cn-hongkong)</p>
     * </li>
     * <li><p>Malaysia (ap-southeast-3)</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>749c1df7-xxxx-xxxx-xxxx-xxxxxxxxxxxx</p>
     */
    @NameInMap("EncryptionKey")
    public String encryptionKey;

    /**
     * <p>The encryption method. Set the value to <strong>aes-256-cbc</strong>.</p>
     * <blockquote>
     * <p>This parameter is available only when <strong>TDEStatus</strong> is set to <strong>enabled</strong>.</p>
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
     * <p>The Alibaba Cloud Resource Name (ARN) of the RAM role. The format is <code>acs:ram::$accountID:role/$roleName </code>.</p>
     * <blockquote>
     * <ul>
     * <li><p><code>$accountID</code>: The ID of your Alibaba Cloud account. To view the ID, log on to the Alibaba Cloud Management Console, move the pointer over your profile picture in the upper-right corner, and then click Security Settings.</p>
     * </li>
     * <li><p><code>$roleName</code>: The name of the RAM role. To view the name, log on to the RAM console, click RAM Role Management in the navigation pane on the left, and then view the role name in the RAM Role Name list.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::123456789012****:role/adminrole</p>
     */
    @NameInMap("RoleARN")
    public String roleARN;

    /**
     * <p>Specifies when to enable TDE. Valid values:</p>
     * <ul>
     * <li><p>0: Enables TDE immediately.</p>
     * </li>
     * <li><p>1: Enables TDE during the maintenance window.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SwitchMode")
    public String switchMode;

    /**
     * <p>The TDE status. Set the value to <strong>enabled</strong> to enable TDE.</p>
     * <blockquote>
     * <p>You cannot disable TDE after you enable it. Enable this feature with caution.</p>
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
