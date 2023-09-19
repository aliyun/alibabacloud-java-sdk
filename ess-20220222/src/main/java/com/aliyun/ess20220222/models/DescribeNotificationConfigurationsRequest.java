// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeNotificationConfigurationsRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the scaling group.</p>
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

    public static DescribeNotificationConfigurationsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNotificationConfigurationsRequest self = new DescribeNotificationConfigurationsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNotificationConfigurationsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeNotificationConfigurationsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeNotificationConfigurationsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeNotificationConfigurationsRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

}
