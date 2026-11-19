// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifySrvNetworkAddressRequest extends TeaModel {
    /**
     * <p>The type of the SRV endpoint to be modified. Valid values:</p>
     * <ul>
     * <li><strong>VPC</strong>: VPC</li>
     * <li><strong>Public</strong>: public network connection</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("ConnectionType")
    public String connectionType;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dds-bp1fd530f271****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The new endpoint. The endpoint must meet the following requirements:</p>
     * <ul>
     * <li>Start with a lowercase letter.</li>
     * <li>End with a lowercase letter or a digit.</li>
     * <li>Contain only lowercase letters, digits, and hyphens (-).</li>
     * <li>Be 8 to 63 characters in length.</li>
     * </ul>
     * <blockquote>
     * <p>Specify only the prefix of the endpoint. The remaining part cannot be modified.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyuntest111</p>
     */
    @NameInMap("NewConnectionString")
    public String newConnectionString;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifySrvNetworkAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySrvNetworkAddressRequest self = new ModifySrvNetworkAddressRequest();
        return TeaModel.build(map, self);
    }

    public ModifySrvNetworkAddressRequest setConnectionType(String connectionType) {
        this.connectionType = connectionType;
        return this;
    }
    public String getConnectionType() {
        return this.connectionType;
    }

    public ModifySrvNetworkAddressRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifySrvNetworkAddressRequest setNewConnectionString(String newConnectionString) {
        this.newConnectionString = newConnectionString;
        return this;
    }
    public String getNewConnectionString() {
        return this.newConnectionString;
    }

    public ModifySrvNetworkAddressRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifySrvNetworkAddressRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifySrvNetworkAddressRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifySrvNetworkAddressRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
