// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ModifyAlertConfigurationRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the scaling group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The status of the scaling activities that prompt text message or email notifications.</p>
     */
    @NameInMap("ScaleStatuses")
    public java.util.List<String> scaleStatuses;

    /**
     * <p>The ID of the scaling group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>asg-bp1eyv4qn8ssgv43****</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    public static ModifyAlertConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAlertConfigurationRequest self = new ModifyAlertConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAlertConfigurationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyAlertConfigurationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyAlertConfigurationRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyAlertConfigurationRequest setScaleStatuses(java.util.List<String> scaleStatuses) {
        this.scaleStatuses = scaleStatuses;
        return this;
    }
    public java.util.List<String> getScaleStatuses() {
        return this.scaleStatuses;
    }

    public ModifyAlertConfigurationRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

}
