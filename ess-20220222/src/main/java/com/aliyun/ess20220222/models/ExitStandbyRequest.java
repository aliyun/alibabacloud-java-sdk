// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ExitStandbyRequest extends TeaModel {
    /**
     * <p>Specifies whether to put the ECS instance into the Standby state in an asynchronous manner. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("Async")
    public Boolean async;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests.</p>
     * <br>
     * <p>The token can only contain ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25965~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The IDs of the ECS instances.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The ID of the scaling group.</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    public static ExitStandbyRequest build(java.util.Map<String, ?> map) throws Exception {
        ExitStandbyRequest self = new ExitStandbyRequest();
        return TeaModel.build(map, self);
    }

    public ExitStandbyRequest setAsync(Boolean async) {
        this.async = async;
        return this;
    }
    public Boolean getAsync() {
        return this.async;
    }

    public ExitStandbyRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ExitStandbyRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public ExitStandbyRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ExitStandbyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ExitStandbyRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ExitStandbyRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

}
