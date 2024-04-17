// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class RemoveInstancesRequest extends TeaModel {
    /**
     * <p>保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。只支持ASCII字符，且不能超过64个字符。更多信息，请参见[如何保证幂等性](~~25965~~)。</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to adjust the expected number of ECS instances in the scaling group. Valid values:</p>
     * <br>
     * <p>*   true: After ECS instances are removed from the scaling group, the expected number of ECS instances in the scaling group decreases.</p>
     * <p>*   false: After ECS instances are removed from the scaling group, the expected number of ECS instances in the scaling group remains unchanged.</p>
     * <br>
     * <p>Default value: true.</p>
     */
    @NameInMap("DecreaseDesiredCapacity")
    public Boolean decreaseDesiredCapacity;

    /**
     * <p>The IDs of the ECS instances that you want to remove from the scaling group.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the scaling group.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The action that you want Auto Scaling to perform after the ECS instance is removed from the scaling group. Valid values:</p>
     * <br>
     * <p>*   recycle: puts the ECS instance into economical mode.</p>
     * <br>
     * <p>    **Note** This setting takes effect only if you set the ScalingPolicy parameter to recycle.</p>
     * <br>
     * <p>*   release: releases the ECS instance.</p>
     * <br>
     * <p>The ScalingPolicy parameter that you specify when you call the CreateScalingGroup operation specifies the reclaim mode of the scaling group. The RemovePolicy parameter that you specify when you call the RemoveInstances operation specifies the action to be performed on ECS instances after the ECS instances are removed. Example:</p>
     * <br>
     * <p>*   If you set both the ScalingPolicy parameter and the RemovePolicy parameter to recycle, the ECS instances are put into economical mode after the ECS instances are removed from the scaling group.</p>
     * <p>*   If you set the ScalingPolicy parameter to recycle and the RemovePolicy parameter to release, the ECS instances are released after the ECS instances are removed from the scaling group.</p>
     * <p>*   If you set the ScalingPolicy parameter to release and the RemovePolicy parameter to recycle, the ECS instances are released after the ECS instances are removed from the scaling group.</p>
     * <p>*   If you set both the ScalingPolicy parameter and the RemovePolicy parameter to release, the ECS instances are released after the ECS instances are removed from the scaling group.</p>
     * <br>
     * <p>Default value: release.</p>
     */
    @NameInMap("RemovePolicy")
    public String removePolicy;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the scaling group.</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    public static RemoveInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveInstancesRequest self = new RemoveInstancesRequest();
        return TeaModel.build(map, self);
    }

    public RemoveInstancesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RemoveInstancesRequest setDecreaseDesiredCapacity(Boolean decreaseDesiredCapacity) {
        this.decreaseDesiredCapacity = decreaseDesiredCapacity;
        return this;
    }
    public Boolean getDecreaseDesiredCapacity() {
        return this.decreaseDesiredCapacity;
    }

    public RemoveInstancesRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public RemoveInstancesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public RemoveInstancesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RemoveInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RemoveInstancesRequest setRemovePolicy(String removePolicy) {
        this.removePolicy = removePolicy;
        return this;
    }
    public String getRemovePolicy() {
        return this.removePolicy;
    }

    public RemoveInstancesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RemoveInstancesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public RemoveInstancesRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

}
