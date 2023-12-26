// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyInstanceVpcAuthModeRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The ID of the mongos node in the specified sharded cluster instance.</p>
     * <br>
     * <p>>  This parameter can be used only when the instance type is sharded cluster.</p>
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

    /**
     * <p>Specifies whether to enable authentication to allow access within a VPC. Valid values:</p>
     * <br>
     * <p>*   **Open**: enables password-free access.</p>
     * <p>*   **Close**: disables password-free access.</p>
     */
    @NameInMap("VpcAuthMode")
    public String vpcAuthMode;

    public static ModifyInstanceVpcAuthModeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceVpcAuthModeRequest self = new ModifyInstanceVpcAuthModeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceVpcAuthModeRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyInstanceVpcAuthModeRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public ModifyInstanceVpcAuthModeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyInstanceVpcAuthModeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyInstanceVpcAuthModeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyInstanceVpcAuthModeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyInstanceVpcAuthModeRequest setVpcAuthMode(String vpcAuthMode) {
        this.vpcAuthMode = vpcAuthMode;
        return this;
    }
    public String getVpcAuthMode() {
        return this.vpcAuthMode;
    }

}
