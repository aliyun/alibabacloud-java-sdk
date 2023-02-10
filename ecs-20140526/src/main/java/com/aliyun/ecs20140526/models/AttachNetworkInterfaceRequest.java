// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AttachNetworkInterfaceRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>网卡指定的物理网卡索引。</p>
     * <br>
     * <p>>NetworkCardIndex 取值与实例规格族有关。如果实例规格不支持NetworkCard则不能指定；如果支持，取值请参见[实例规格族](~~25378~~)。</p>
     */
    @NameInMap("NetworkCardIndex")
    public Integer networkCardIndex;

    /**
     * <p>The ID of the ENI.</p>
     */
    @NameInMap("NetworkInterfaceId")
    public String networkInterfaceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the instance. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the trunk ENI.</p>
     * <br>
     * <p>> This parameter is unavailable for use.</p>
     */
    @NameInMap("TrunkNetworkInstanceId")
    public String trunkNetworkInstanceId;

    /**
     * <p>> This parameter is no longer used.</p>
     */
    @NameInMap("WaitForNetworkConfigurationReady")
    public Boolean waitForNetworkConfigurationReady;

    public static AttachNetworkInterfaceRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachNetworkInterfaceRequest self = new AttachNetworkInterfaceRequest();
        return TeaModel.build(map, self);
    }

    public AttachNetworkInterfaceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AttachNetworkInterfaceRequest setNetworkCardIndex(Integer networkCardIndex) {
        this.networkCardIndex = networkCardIndex;
        return this;
    }
    public Integer getNetworkCardIndex() {
        return this.networkCardIndex;
    }

    public AttachNetworkInterfaceRequest setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    public AttachNetworkInterfaceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AttachNetworkInterfaceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AttachNetworkInterfaceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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
