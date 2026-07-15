// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceSSLRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dds-bp2235****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>Specifies whether to forcibly enable SSL encryption for connections. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: Forcibly enable SSL encryption.</p>
     * </li>
     * <li><p><strong>0</strong>: Do not forcibly enable SSL encryption.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p>Forced SSL encryption is supported only for MongoDB 7.0 and 8.0 instances that use cloud disks and meet the following minor engine version requirements:</p>
     * </li>
     * <li><ul>
     * <li>For version 7.0, the minor engine version must be 8.0.13 or later.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>For version 8.0, the minor engine version must be 9.0.5 or later.</li>
     * </ul>
     * </li>
     * </ul>
     * </blockquote>
     * <blockquote>
     * <p>Warning: </p>
     * </blockquote>
     * <p>After you enable forced SSL encryption, only SSL connections to the instance are allowed.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ForceEncryption")
    public String forceEncryption;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The operation to perform on the SSL feature. Valid values:</p>
     * <ul>
     * <li><p><strong>Open</strong>: Enable SSL encryption.</p>
     * </li>
     * <li><p><strong>Close</strong>: Disable SSL encryption.</p>
     * </li>
     * <li><p><strong>Update</strong>: Update the SSL certificate.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Open</p>
     */
    @NameInMap("SSLAction")
    public String SSLAction;

    /**
     * <p>The time to modify the SSL configuration of the MongoDB instance. Valid values:</p>
     * <ul>
     * <li><p>0: Modify immediately.</p>
     * </li>
     * <li><p>1: Modify within the maintenance window.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SwitchMode")
    public String switchMode;

    public static ModifyDBInstanceSSLRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceSSLRequest self = new ModifyDBInstanceSSLRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceSSLRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDBInstanceSSLRequest setForceEncryption(String forceEncryption) {
        this.forceEncryption = forceEncryption;
        return this;
    }
    public String getForceEncryption() {
        return this.forceEncryption;
    }

    public ModifyDBInstanceSSLRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyDBInstanceSSLRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDBInstanceSSLRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDBInstanceSSLRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyDBInstanceSSLRequest setSSLAction(String SSLAction) {
        this.SSLAction = SSLAction;
        return this;
    }
    public String getSSLAction() {
        return this.SSLAction;
    }

    public ModifyDBInstanceSSLRequest setSwitchMode(String switchMode) {
        this.switchMode = switchMode;
        return this;
    }
    public String getSwitchMode() {
        return this.switchMode;
    }

}
