// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DeleteLifecycleHookRequest extends TeaModel {
    /**
     * <p>The ID of the lifecycle hook.</p>
     * 
     * <strong>example:</strong>
     * <p>ash-bp14g3ee6bt3sc98****</p>
     */
    @NameInMap("LifecycleHookId")
    public String lifecycleHookId;

    /**
     * <p>The name of the lifecycle hook.</p>
     * 
     * <strong>example:</strong>
     * <p>lifecyclehook****</p>
     */
    @NameInMap("LifecycleHookName")
    public String lifecycleHookName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the scaling group.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The ID of the scaling group.</p>
     * 
     * <strong>example:</strong>
     * <p>asg-bp18p2yfxow2dloq****</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    public static DeleteLifecycleHookRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLifecycleHookRequest self = new DeleteLifecycleHookRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLifecycleHookRequest setLifecycleHookId(String lifecycleHookId) {
        this.lifecycleHookId = lifecycleHookId;
        return this;
    }
    public String getLifecycleHookId() {
        return this.lifecycleHookId;
    }

    public DeleteLifecycleHookRequest setLifecycleHookName(String lifecycleHookName) {
        this.lifecycleHookName = lifecycleHookName;
        return this;
    }
    public String getLifecycleHookName() {
        return this.lifecycleHookName;
    }

    public DeleteLifecycleHookRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DeleteLifecycleHookRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteLifecycleHookRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteLifecycleHookRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteLifecycleHookRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

}
