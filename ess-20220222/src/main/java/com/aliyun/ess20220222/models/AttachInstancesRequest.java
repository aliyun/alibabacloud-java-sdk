// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class AttachInstancesRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Entrusted")
    public Boolean entrusted;

    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    @NameInMap("LifecycleHook")
    public Boolean lifecycleHook;

    @NameInMap("LoadBalancerWeights")
    public java.util.List<Integer> loadBalancerWeights;

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

    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    public static AttachInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachInstancesRequest self = new AttachInstancesRequest();
        return TeaModel.build(map, self);
    }

    public AttachInstancesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AttachInstancesRequest setEntrusted(Boolean entrusted) {
        this.entrusted = entrusted;
        return this;
    }
    public Boolean getEntrusted() {
        return this.entrusted;
    }

    public AttachInstancesRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public AttachInstancesRequest setLifecycleHook(Boolean lifecycleHook) {
        this.lifecycleHook = lifecycleHook;
        return this;
    }
    public Boolean getLifecycleHook() {
        return this.lifecycleHook;
    }

    public AttachInstancesRequest setLoadBalancerWeights(java.util.List<Integer> loadBalancerWeights) {
        this.loadBalancerWeights = loadBalancerWeights;
        return this;
    }
    public java.util.List<Integer> getLoadBalancerWeights() {
        return this.loadBalancerWeights;
    }

    public AttachInstancesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AttachInstancesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AttachInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AttachInstancesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AttachInstancesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AttachInstancesRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

}
