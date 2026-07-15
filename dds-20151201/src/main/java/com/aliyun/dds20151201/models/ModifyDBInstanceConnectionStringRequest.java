// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceConnectionStringRequest extends TeaModel {
    /**
     * <p>The current connection address—the address to modify.</p>
     * 
     * <strong>example:</strong>
     * <p>s-bpxxxxxxxx.mongodb.rds.aliyuncs.com</p>
     */
    @NameInMap("CurrentConnectionString")
    public String currentConnectionString;

    /**
     * <p>The ID of the instance.</p>
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
     * <strong>example:</strong>
     * <p>vpc</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    /**
     * <p>The new connection address. It must meet these requirements:</p>
     * <ul>
     * <li><p>Start with a lowercase letter.</p>
     * </li>
     * <li><p>End with a lowercase letter or digit.</p>
     * </li>
     * <li><p>Contain only lowercase letters, digits, and hyphens (-).</p>
     * </li>
     * <li><p>Be 8 to 63 characters long.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Specify only the prefix of the connection address. You cannot change any part beyond the prefix.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>aliyuntest111</p>
     */
    @NameInMap("NewConnectionString")
    public String newConnectionString;

    /**
     * <p>The new port number. Valid values are from 1000 to 65535.</p>
     * <blockquote>
     * <p>This parameter is valid only when <strong>DBInstanceId</strong> specifies the ID of a cloud disk instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3310</p>
     */
    @NameInMap("NewPort")
    public Integer newPort;

    /**
     * <p>The ID of a Mongos node in a sharded cluster instance. You can specify only one Mongos node ID per call.</p>
     * <blockquote>
     * <p>This parameter is valid only when <strong>DBInstanceId</strong> specifies the ID of a sharded cluster instance.</p>
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
