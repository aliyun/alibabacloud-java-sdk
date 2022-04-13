// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateActivationRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("InstanceCount")
    public Integer instanceCount;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("IpAddressRange")
    public String ipAddressRange;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("TimeToLiveInHours")
    public Long timeToLiveInHours;

    public static CreateActivationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateActivationRequest self = new CreateActivationRequest();
        return TeaModel.build(map, self);
    }

    public CreateActivationRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateActivationRequest setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }
    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    public CreateActivationRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateActivationRequest setIpAddressRange(String ipAddressRange) {
        this.ipAddressRange = ipAddressRange;
        return this;
    }
    public String getIpAddressRange() {
        return this.ipAddressRange;
    }

    public CreateActivationRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateActivationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateActivationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateActivationRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateActivationRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateActivationRequest setTimeToLiveInHours(Long timeToLiveInHours) {
        this.timeToLiveInHours = timeToLiveInHours;
        return this;
    }
    public Long getTimeToLiveInHours() {
        return this.timeToLiveInHours;
    }

}
