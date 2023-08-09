// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceConnectionStringRequest extends TeaModel {
    /**
     * <p>The current connection string, which is to be modified.</p>
     */
    @NameInMap("CurrentConnectionString")
    public String currentConnectionString;

    /**
     * <p>The ID of the instance.</p>
     * <br>
     * <p>>  If you set this parameter to the ID of a sharded cluster instance, you must also specify the **NodeId** parameter.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The new connection string. It must be 8 to 64 characters in length and can contain letters and digits. It must start with a lowercase letter.</p>
     * <br>
     * <p>>  You need only to specify the prefix of the connection string. The content other than the prefix cannot be modified.</p>
     */
    @NameInMap("NewConnectionString")
    public String newConnectionString;

    /**
     * <p>this parameter can be used. The new port should be within the range of 1000 to 65535.</p>
     * <p>>When the DBInstanceId parameter is passed in as a cloud disk instance ID</p>
     */
    @NameInMap("NewPort")
    public Integer newPort;

    /**
     * <p>The ID of the mongos in the specified sharded cluster instance. Only one mongos ID can be specified in each call.</p>
     * <br>
     * <p>>  This parameter is valid only if you set the **DBInstanceId** parameter to the ID of a sharded cluster instance.</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

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

    public static ModifyDBInstanceConnectionStringRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceConnectionStringRequest self = new ModifyDBInstanceConnectionStringRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceConnectionStringRequest setCurrentConnectionString(String currentConnectionString) {
        this.currentConnectionString = currentConnectionString;
        return this;
    }
    public String getCurrentConnectionString() {
        return this.currentConnectionString;
    }

    public ModifyDBInstanceConnectionStringRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDBInstanceConnectionStringRequest setNewConnectionString(String newConnectionString) {
        this.newConnectionString = newConnectionString;
        return this;
    }
    public String getNewConnectionString() {
        return this.newConnectionString;
    }

    public ModifyDBInstanceConnectionStringRequest setNewPort(Integer newPort) {
        this.newPort = newPort;
        return this;
    }
    public Integer getNewPort() {
        return this.newPort;
    }

    public ModifyDBInstanceConnectionStringRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public ModifyDBInstanceConnectionStringRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyDBInstanceConnectionStringRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDBInstanceConnectionStringRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDBInstanceConnectionStringRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyDBInstanceConnectionStringRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
