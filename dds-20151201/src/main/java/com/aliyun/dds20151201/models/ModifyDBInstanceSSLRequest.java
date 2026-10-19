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
     * <p>Specifies whether to force Secure Sockets Layer (SSL) encryption for connections. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Forces Secure Sockets Layer (SSL) encryption.</li>
     * <li><strong>0</strong>: Does not force Secure Sockets Layer (SSL) encryption.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>Forced Secure Sockets Layer (SSL) encryption applies only to MongoDB 7.0 and 8.0 instances that use cloud disks and meet the following minor engine version requirements:<ul>
     * <li>MongoDB 7.0: The minor engine version must be 8.0.13 or later.</li>
     * <li>MongoDB 8.0: The minor engine version must be 9.0.5 or later.</li>
     * </ul>
     * </li>
     * </ul>
     * </blockquote>
     * <blockquote>
     * <p>Warning: After you enable forced Secure Sockets Layer (SSL) encryption, you cannot connect to the instance by using non-SSL connections.</warning></p>
     * </blockquote>
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
     * <li><strong>Open</strong>: Enables Secure Sockets Layer (SSL) encryption.</li>
     * <li><strong>Close</strong>: Disables Secure Sockets Layer (SSL) encryption.</li>
     * <li><strong>Update</strong>: Updates the SSL certificate.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Open</p>
     */
    @NameInMap("SSLAction")
    public String SSLAction;

    /**
     * <p>The time when the SSL configuration of the MongoDB instance is modified. Valid values:</p>
     * <ul>
     * <li><p>0: Modifies the configuration immediately.</p>
     * </li>
     * <li><p>1: Modifies the configuration within the O&amp;M window.</p>
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
