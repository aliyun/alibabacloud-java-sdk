// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceConnectionStringRequest extends TeaModel {
    /**
     * <p>The current endpoint, which is the endpoint to be modified.</p>
     * 
     * <strong>example:</strong>
     * <p>s-bpxxxxxxxx.mongodb.rds.aliyuncs.com</p>
     */
    @NameInMap("CurrentConnectionString")
    public String currentConnectionString;

    /**
     * <p>The instance ID.</p>
     * <blockquote>
     * <p>If you specify the ID of a sharded cluster instance, you must also specify the <strong>NodeId</strong> parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dds-bpxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("ForceModifySuffix")
    public Boolean forceModifySuffix;

    /**
     * <p>The network type of the connection string when only the port number is modified.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    /**
     * <p>The new endpoint. The endpoint must meet the following requirements:</p>
     * <ul>
     * <li>It must start with a lowercase letter.</li>
     * <li>It must end with a lowercase letter or a digit.</li>
     * <li>It can contain only lowercase letters, digits, and hyphens (-).</li>
     * <li>It must be 8 to 63 characters in length.</li>
     * </ul>
     * <blockquote>
     * <p>Specify only the prefix of the endpoint. The remaining part cannot be modified.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>aliyuntest111</p>
     */
    @NameInMap("NewConnectionString")
    public String newConnectionString;

    /**
     * <p>The new port. Valid values: 1000 to 65535.</p>
     * <blockquote>
     * <p>This parameter is active only when the <strong>DBInstanceId</strong> parameter is set to a cloud disk instance ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3310</p>
     */
    @NameInMap("NewPort")
    public Integer newPort;

    /**
     * <p>Instance ID of the Mongos node in the sharded cluster instance. You can specify only one Mongos node ID in each call.</p>
     * <blockquote>
     * <p>This parameter is valid only when the <strong>DBInstanceId</strong> parameter is set to instance ID of a sharded cluster instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>s-bpxxxxxxxx</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Specifies whether to modify only port numbers. If you modify only port numbers, batch modification is supported.</p>
     */
    @NameInMap("PortModifyOnly")
    public Boolean portModifyOnly;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

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

    public ModifyDBInstanceConnectionStringRequest setForceModifySuffix(Boolean forceModifySuffix) {
        this.forceModifySuffix = forceModifySuffix;
        return this;
    }
    public Boolean getForceModifySuffix() {
        return this.forceModifySuffix;
    }

    public ModifyDBInstanceConnectionStringRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
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

    public ModifyDBInstanceConnectionStringRequest setPortModifyOnly(Boolean portModifyOnly) {
        this.portModifyOnly = portModifyOnly;
        return this;
    }
    public Boolean getPortModifyOnly() {
        return this.portModifyOnly;
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

}
