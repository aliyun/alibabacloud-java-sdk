// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ScaleWithAdjustmentRequest extends TeaModel {
    /**
     * <p>The type of the scaling policy. Valid values:</p>
     * <br>
     * <p>*   QuantityChangeInCapacity: adds the specified number of ECS instances to or removes the specified number of ECS instances from the scaling group.</p>
     * <p>*   PercentChangeInCapacity: adds the specified percentage of ECS instances to or removes the specified percentage of ECS instances from the scaling group.</p>
     * <p>*   TotalCapacity: adjusts the number of ECS instances in the scaling group to a specified number.</p>
     */
    @NameInMap("AdjustmentType")
    public String adjustmentType;

    /**
     * <p>The number of instances in each adjustment. The number of ECS instances in each adjustment cannot exceed 1,000.</p>
     * <br>
     * <p>*   Valid values if you set the AdjustmentType parameter to QuantityChangeInCapacity: -1000 to 1000.</p>
     * <p>*   Valid values if you set the AdjustmentType parameter to PercentChangeInCapacity: -100 to 10000.</p>
     * <p>*   Valid values if you set the AdjustmentType parameter to TotalCapacity: 0 to 2000.</p>
     */
    @NameInMap("AdjustmentValue")
    public Integer adjustmentValue;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that the value is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The minimum number of instances allowed in each adjustment. This parameter takes effect only if you set the `AdjustmentType` parameter to `PercentChangeInCapacity`.</p>
     */
    @NameInMap("MinAdjustmentMagnitude")
    public Integer minAdjustmentMagnitude;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The ID of the scaling group.</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    /**
     * <p>Specifies whether to trigger the scaling activity in a synchronous manner. This parameter takes effect only on scaling groups for which you specified an expected number of instances. Valid values:</p>
     * <br>
     * <p>*   true: triggers the scaling activity in a synchronous manner. The scaling activity is triggered at the time when the scaling rule is executed.</p>
     * <p>*   false: does not trigger the scaling activity in a synchronous manner. After you change the expected number of instances for the scaling group, Auto Scaling checks whether the total number of instances in the scaling group matches the new expected number of instances and determines whether to trigger the scaling activity based on the check result.</p>
     * <br>
     * <p>> For more information about the Expected Number of Instances feature, see [Expected number of instances](~~146231~~).</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("SyncActivity")
    public Boolean syncActivity;

    public static ScaleWithAdjustmentRequest build(java.util.Map<String, ?> map) throws Exception {
        ScaleWithAdjustmentRequest self = new ScaleWithAdjustmentRequest();
        return TeaModel.build(map, self);
    }

    public ScaleWithAdjustmentRequest setAdjustmentType(String adjustmentType) {
        this.adjustmentType = adjustmentType;
        return this;
    }
    public String getAdjustmentType() {
        return this.adjustmentType;
    }

    public ScaleWithAdjustmentRequest setAdjustmentValue(Integer adjustmentValue) {
        this.adjustmentValue = adjustmentValue;
        return this;
    }
    public Integer getAdjustmentValue() {
        return this.adjustmentValue;
    }

    public ScaleWithAdjustmentRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ScaleWithAdjustmentRequest setMinAdjustmentMagnitude(Integer minAdjustmentMagnitude) {
        this.minAdjustmentMagnitude = minAdjustmentMagnitude;
        return this;
    }
    public Integer getMinAdjustmentMagnitude() {
        return this.minAdjustmentMagnitude;
    }

    public ScaleWithAdjustmentRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ScaleWithAdjustmentRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ScaleWithAdjustmentRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public ScaleWithAdjustmentRequest setSyncActivity(Boolean syncActivity) {
        this.syncActivity = syncActivity;
        return this;
    }
    public Boolean getSyncActivity() {
        return this.syncActivity;
    }

}
