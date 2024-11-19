// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class ReleaseLindormInstanceRequest extends TeaModel {
    /**
     * <p>Specifies whether to release the instance immediately. If you set this parameter to false, data in the released instance is retained for seven days before it is completely deleted. If you set this parameter to true, data in the released instance is immediately deleted. The default value is false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Immediately")
    public Boolean immediately;

    /**
     * <p>Instance ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/426069.html">GetLindormInstanceList</a> interface.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ld-bp1z3506imz2f****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

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

    public static ReleaseLindormInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseLindormInstanceRequest self = new ReleaseLindormInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseLindormInstanceRequest setImmediately(Boolean immediately) {
        this.immediately = immediately;
        return this;
    }
    public Boolean getImmediately() {
        return this.immediately;
    }

    public ReleaseLindormInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ReleaseLindormInstanceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ReleaseLindormInstanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ReleaseLindormInstanceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ReleaseLindormInstanceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ReleaseLindormInstanceRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
