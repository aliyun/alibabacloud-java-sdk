// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DetachInstancesRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25965.html">Ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to adjust the expected number of instances in the scaling group. Valid values:</p>
     * <ul>
     * <li>true: After a specific number of instances are removed from the scaling group, the expected number of instances in the scaling group decreases.</li>
     * <li>false: After a specific number of instances are removed from the scaling group, the expected number of instances in the scaling group remains unchanged.</li>
     * </ul>
     * <p>Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DecreaseDesiredCapacity")
    public Boolean decreaseDesiredCapacity;

    /**
     * <p>Specifies whether to detach the ECS instances or elastic container instances that are marked for removal from the associated load balancers, and whether to remove the private IP addresses of these instances from the IP address whitelists of the associated ApsaraDB RDS instances.</p>
     * <p>Both: detaches the ECS instances or elastic container instances that are marked for removal from the associated load balancers and removes the private IP addresses of these instances from the IP address whitelists of the associated ApsaraDB RDS instances.</p>
     * <blockquote>
     * <p> This parameter is not supported if you want to remove Alibaba Cloud-hosted third-party instances from a scaling group.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>both</p>
     */
    @NameInMap("DetachOption")
    public String detachOption;

    /**
     * <p>从伸缩组移出一批实例时，是否忽略其中无效的实例。取值范围：</p>
     * <ul>
     * <li>true：从伸缩组中移出一批实例时，会忽略其中无效的实例。如果存在无效的实例，并且有效的实例被成功移除时，伸缩活动执行状态也会显示为警告状态，可以从伸缩活动详情查看无效的实例。</li>
     * <li>false：从伸缩组中移出一批实例时，不会忽略无效的实例。如果一批实例中存在无效的实例，请求会报错。</li>
     * </ul>
     * <p>默认值：false。</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IgnoreInvalidInstance")
    public Boolean ignoreInvalidInstance;

    /**
     * <p>The IDs of the ECS instances, elastic container instances, or Aliababa Cloud-managed third-party instances that you want to remove from a scaling group.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>Specifies whether to trigger a lifecycle hook for scale-in purposes when ECS instances or elastic container instances are removed from the scaling group. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <blockquote>
     * <p> This parameter is not supported if you want to remove Alibaba Cloud-hosted third-party instances from a scaling group.</p>
     * </blockquote>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("LifecycleHook")
    public Boolean lifecycleHook;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the scaling group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>asg-bp1igpak5ft1flyp****</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    public static DetachInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachInstancesRequest self = new DetachInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DetachInstancesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DetachInstancesRequest setDecreaseDesiredCapacity(Boolean decreaseDesiredCapacity) {
        this.decreaseDesiredCapacity = decreaseDesiredCapacity;
        return this;
    }
    public Boolean getDecreaseDesiredCapacity() {
        return this.decreaseDesiredCapacity;
    }

    public DetachInstancesRequest setDetachOption(String detachOption) {
        this.detachOption = detachOption;
        return this;
    }
    public String getDetachOption() {
        return this.detachOption;
    }

    public DetachInstancesRequest setIgnoreInvalidInstance(Boolean ignoreInvalidInstance) {
        this.ignoreInvalidInstance = ignoreInvalidInstance;
        return this;
    }
    public Boolean getIgnoreInvalidInstance() {
        return this.ignoreInvalidInstance;
    }

    public DetachInstancesRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public DetachInstancesRequest setLifecycleHook(Boolean lifecycleHook) {
        this.lifecycleHook = lifecycleHook;
        return this;
    }
    public Boolean getLifecycleHook() {
        return this.lifecycleHook;
    }

    public DetachInstancesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DetachInstancesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DetachInstancesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DetachInstancesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DetachInstancesRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

}
