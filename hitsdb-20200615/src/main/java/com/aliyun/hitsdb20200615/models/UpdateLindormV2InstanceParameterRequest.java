// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class UpdateLindormV2InstanceParameterRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ParameterKey")
    public String parameterKey;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ParameterValue")
    public String parameterValue;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("UpdateType")
    public String updateType;

    public static UpdateLindormV2InstanceParameterRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLindormV2InstanceParameterRequest self = new UpdateLindormV2InstanceParameterRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLindormV2InstanceParameterRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateLindormV2InstanceParameterRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UpdateLindormV2InstanceParameterRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateLindormV2InstanceParameterRequest setParameterKey(String parameterKey) {
        this.parameterKey = parameterKey;
        return this;
    }
    public String getParameterKey() {
        return this.parameterKey;
    }

    public UpdateLindormV2InstanceParameterRequest setParameterValue(String parameterValue) {
        this.parameterValue = parameterValue;
        return this;
    }
    public String getParameterValue() {
        return this.parameterValue;
    }

    public UpdateLindormV2InstanceParameterRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateLindormV2InstanceParameterRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdateLindormV2InstanceParameterRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public UpdateLindormV2InstanceParameterRequest setUpdateType(String updateType) {
        this.updateType = updateType;
        return this;
    }
    public String getUpdateType() {
        return this.updateType;
    }

}
