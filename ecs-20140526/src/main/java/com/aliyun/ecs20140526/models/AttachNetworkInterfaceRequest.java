// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AttachNetworkInterfaceRequest extends TeaModel {
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

    @NameInMap("NetworkInterfaceId")
    public String networkInterfaceId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TrunkNetworkInstanceId")
    public String trunkNetworkInstanceId;

    @NameInMap("WaitForNetworkConfigurationReady")
    public Boolean waitForNetworkConfigurationReady;

    public static AttachNetworkInterfaceRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachNetworkInterfaceRequest self = new AttachNetworkInterfaceRequest();
        return TeaModel.build(map, self);
    }

    public AttachNetworkInterfaceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AttachNetworkInterfaceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AttachNetworkInterfaceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AttachNetworkInterfaceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AttachNetworkInterfaceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AttachNetworkInterfaceRequest setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    public AttachNetworkInterfaceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AttachNetworkInterfaceRequest setTrunkNetworkInstanceId(String trunkNetworkInstanceId) {
        this.trunkNetworkInstanceId = trunkNetworkInstanceId;
        return this;
    }
    public String getTrunkNetworkInstanceId() {
        return this.trunkNetworkInstanceId;
    }

    public AttachNetworkInterfaceRequest setWaitForNetworkConfigurationReady(Boolean waitForNetworkConfigurationReady) {
        this.waitForNetworkConfigurationReady = waitForNetworkConfigurationReady;
        return this;
    }
    public Boolean getWaitForNetworkConfigurationReady() {
        return this.waitForNetworkConfigurationReady;
    }

}
