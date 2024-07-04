// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class RemoveInstancesRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25965.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to adjust the expected number of ECS instances in the scaling group. Valid values:</p>
     * <ul>
     * <li>true: After ECS instances are removed from the scaling group, the expected number of ECS instances in the scaling group decreases.</li>
     * <li>false: After ECS instances are removed from the scaling group, the expected number of ECS instances in the scaling group remains unchanged.</li>
     * </ul>
     * <p>Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DecreaseDesiredCapacity")
    public Boolean decreaseDesiredCapacity;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IgnoreInvalidInstance")
    public Boolean ignoreInvalidInstance;

    /**
     * <p>The IDs of the ECS instances that you want to remove from the scaling group.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the scaling group.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-qingdao</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The action subsequent to the removal of the Elastic Compute Service (ECS) instances. Valid values:</p>
     * <ul>
     * <li><p>recycle: The ECS instances enter the Economical Mode.</p>
     * <p>**</p>
     * <p><strong>Note</strong> This setting is applicable only if you set <code>ScalingPolicy</code> to <code>recycle</code>.</p>
     * </li>
     * <li><p>release: The ECS instances are released.</p>
     * </li>
     * </ul>
     * <p>ScalingPolicy of the CreateScalingGroup operation specifies the reclaim mode of the scaling group while RemovePolicy of the RemoveInstances operation specifies the subsequent action when an ECS instance is removed from the scaling group. Examples:</p>
     * <ul>
     * <li>If you set ScalingPolicy and RemovePolicy to recycle, the ECS instances enter the Economical Mode when they are removed.</li>
     * <li>If you set ScalingPolicy to recycle and RemovePolicy to release, the ECS instances are released when they are removed.</li>
     * <li>If you set ScalingPolicy to release and RemovePolicy to recycle, the ECS instances are released when they are removed.</li>
     * <li>If you set ScalingPolicy and RemovePolicy to release, the ECS instances are released when they are removed.</li>
     * </ul>
     * <p>Default value: release.</p>
     * 
     * <strong>example:</strong>
     * <p>release</p>
     */
    @NameInMap("RemovePolicy")
    public String removePolicy;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the scaling group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>asg-bp18p2yfxow2dloq****</p>
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

    public RemoveInstancesRequest setIgnoreInvalidInstance(Boolean ignoreInvalidInstance) {
        this.ignoreInvalidInstance = ignoreInvalidInstance;
        return this;
    }
    public Boolean getIgnoreInvalidInstance() {
        return this.ignoreInvalidInstance;
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
