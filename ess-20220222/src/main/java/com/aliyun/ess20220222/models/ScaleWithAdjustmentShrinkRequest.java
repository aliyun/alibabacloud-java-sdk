// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ScaleWithAdjustmentShrinkRequest extends TeaModel {
    /**
     * <p>The metadata of the scaling activity.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;key&quot;:&quot;value&quot;}</p>
     */
    @NameInMap("ActivityMetadata")
    public String activityMetadata;

    /**
     * <p>The type of the scaling policy. Valid values:</p>
     * <ul>
     * <li>QuantityChangeInCapacity: adds the specified number of ECS instances to or removes the specified number of ECS instances from the scaling group.</li>
     * <li>PercentChangeInCapacity: adds the specified percentage of ECS instances to or removes the specified percentage of ECS instances from the scaling group.</li>
     * <li>TotalCapacity: adjusts the number of ECS instances in the scaling group to a specified number.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>QuantityChangeInCapacity</p>
     */
    @NameInMap("AdjustmentType")
    public String adjustmentType;

    /**
     * <p>The number of instances in each adjustment. The number of ECS instances in each adjustment cannot exceed 1,000.</p>
     * <ul>
     * <li>Valid values if you set the AdjustmentType parameter to QuantityChangeInCapacity: -1000 to 1000.</li>
     * <li>Valid values if you set the AdjustmentType parameter to PercentChangeInCapacity: -100 to 10000.</li>
     * <li>Valid values if you set the AdjustmentType parameter to TotalCapacity: 0 to 2000.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("AdjustmentValue")
    public Integer adjustmentValue;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that the value is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The context of the lifecycle hook.</p>
     */
    @NameInMap("LifecycleHookContext")
    public String lifecycleHookContextShrink;

    /**
     * <p>The minimum number of instances allowed in each adjustment. This parameter takes effect only if you set the <code>AdjustmentType</code> parameter to <code>PercentChangeInCapacity</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MinAdjustmentMagnitude")
    public Integer minAdjustmentMagnitude;

    /**
     * <p>The overrides that allow you to adjust the scaling group of the Elastic Container Instance type during a scale-out event.</p>
     */
    @NameInMap("Overrides")
    public String overridesShrink;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The ID of the scaling group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>asg-j6c1o397427hyjdc****</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    /**
     * <p>Specifies whether to trigger the scaling activity in a synchronous manner. This parameter takes effect only on scaling groups for which you specified an expected number of instances. Valid values:</p>
     * <ul>
     * <li>true: triggers the scaling activity in a synchronous manner. The scaling activity is triggered at the time when the scaling rule is executed.</li>
     * <li>false: does not trigger the scaling activity in a synchronous manner. After you change the expected number of instances for the scaling group, Auto Scaling checks whether the total number of instances in the scaling group matches the new expected number of instances and determines whether to trigger the scaling activity based on the check result.</li>
     * </ul>
     * <blockquote>
     * <p>For more information about the Expected Number of Instances feature, see <a href="https://help.aliyun.com/document_detail/146231.html">Expected number of instances</a>.</p>
     * </blockquote>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SyncActivity")
    public Boolean syncActivity;

    public static ScaleWithAdjustmentShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ScaleWithAdjustmentShrinkRequest self = new ScaleWithAdjustmentShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ScaleWithAdjustmentShrinkRequest setActivityMetadata(String activityMetadata) {
        this.activityMetadata = activityMetadata;
        return this;
    }
    public String getActivityMetadata() {
        return this.activityMetadata;
    }

    public ScaleWithAdjustmentShrinkRequest setAdjustmentType(String adjustmentType) {
        this.adjustmentType = adjustmentType;
        return this;
    }
    public String getAdjustmentType() {
        return this.adjustmentType;
    }

    public ScaleWithAdjustmentShrinkRequest setAdjustmentValue(Integer adjustmentValue) {
        this.adjustmentValue = adjustmentValue;
        return this;
    }
    public Integer getAdjustmentValue() {
        return this.adjustmentValue;
    }

    public ScaleWithAdjustmentShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ScaleWithAdjustmentShrinkRequest setLifecycleHookContextShrink(String lifecycleHookContextShrink) {
        this.lifecycleHookContextShrink = lifecycleHookContextShrink;
        return this;
    }
    public String getLifecycleHookContextShrink() {
        return this.lifecycleHookContextShrink;
    }

    public ScaleWithAdjustmentShrinkRequest setMinAdjustmentMagnitude(Integer minAdjustmentMagnitude) {
        this.minAdjustmentMagnitude = minAdjustmentMagnitude;
        return this;
    }
    public Integer getMinAdjustmentMagnitude() {
        return this.minAdjustmentMagnitude;
    }

    public ScaleWithAdjustmentShrinkRequest setOverridesShrink(String overridesShrink) {
        this.overridesShrink = overridesShrink;
        return this;
    }
    public String getOverridesShrink() {
        return this.overridesShrink;
    }

    public ScaleWithAdjustmentShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ScaleWithAdjustmentShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ScaleWithAdjustmentShrinkRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public ScaleWithAdjustmentShrinkRequest setSyncActivity(Boolean syncActivity) {
        this.syncActivity = syncActivity;
        return this;
    }
    public Boolean getSyncActivity() {
        return this.syncActivity;
    }

}
