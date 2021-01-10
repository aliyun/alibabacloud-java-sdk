// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class RestartContainerGroupRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ContainerGroupId")
    public String containerGroupId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("VkClientVersion")
    public String vkClientVersion;

    public static RestartContainerGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        RestartContainerGroupRequest self = new RestartContainerGroupRequest();
        return TeaModel.build(map, self);
    }

    public RestartContainerGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RestartContainerGroupRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RestartContainerGroupRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public RestartContainerGroupRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public RestartContainerGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RestartContainerGroupRequest setContainerGroupId(String containerGroupId) {
        this.containerGroupId = containerGroupId;
        return this;
    }
    public String getContainerGroupId() {
        return this.containerGroupId;
    }

    public RestartContainerGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RestartContainerGroupRequest setVkClientVersion(String vkClientVersion) {
        this.vkClientVersion = vkClientVersion;
        return this;
    }
    public String getVkClientVersion() {
        return this.vkClientVersion;
    }

}
