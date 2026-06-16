// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ScaleWithAdjustmentShrinkRequest extends TeaModel {
    /**
     * <p>The metadata for the scaling activity.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;key&quot;:&quot;value&quot;}</p>
     */
    @NameInMap("ActivityMetadata")
    public String activityMetadata;

    /**
     * <p>The method used to adjust the number of instances in a scaling activity. Valid values:</p>
     * <ul>
     * <li><p><code>QuantityChangeInCapacity</code>: Adds or removes a specified number of ECS instances.</p>
     * </li>
     * <li><p><code>PercentChangeInCapacity</code>: Adds or removes a specified percentage of ECS instances.</p>
     * </li>
     * <li><p><code>TotalCapacity</code>: Adjusts the number of ECS instances in the scaling group to a specified number.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>QuantityChangeInCapacity</p>
     */
    @NameInMap("AdjustmentType")
    public String adjustmentType;

    /**
     * <p>The adjustment value for the scaling activity. A single adjustment cannot add or remove more than 1,000 ECS instances. The valid range depends on <code>AdjustmentType</code>:</p>
     * <ul>
     * <li><p><code>QuantityChangeInCapacity</code>: -1000 to 1000.</p>
     * </li>
     * <li><p><code>PercentChangeInCapacity</code>: -100 to 10000.</p>
     * </li>
     * <li><p><code>TotalCapacity</code>: 0 to 2000.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("AdjustmentValue")
    public Integer adjustmentValue;

    /**
     * <p>A client-generated token to ensure the idempotence of the request. This token must be a unique string of up to 64 ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The execution mode. Valid values:</p>
     * <ul>
     * <li><p><code>None</code>: Executes a standard scaling activity.</p>
     * </li>
     * <li><p><code>PlanOnly</code>: Only performs elastic planning and returns the results in <code>PlanResult</code> without triggering the scaling activity. The results include details such as instance types, availability zones, billing methods, and the number of new instances.</p>
     * </li>
     * </ul>
     * <p>Default value: None.</p>
     * 
     * <strong>example:</strong>
     * <p>PlanOnly</p>
     */
    @NameInMap("ExecutionMode")
    public String executionMode;

    /**
     * <p>The lifecycle hook context.</p>
     */
    @NameInMap("LifecycleHookContext")
    public String lifecycleHookContextShrink;

    /**
     * <p>The minimum number of instances to adjust in a scaling activity. This parameter takes effect only when <code>AdjustmentType</code> is set to <code>PercentChangeInCapacity</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MinAdjustmentMagnitude")
    public Integer minAdjustmentMagnitude;

    /**
     * <p>The parameters to override when scaling out an ECI scaling group.</p>
     */
    @NameInMap("Overrides")
    public String overridesShrink;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Specifies whether the current scaling activity supports concurrency.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ParallelTask")
    public Boolean parallelTask;

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
     * <p>Specifies whether to execute the scaling activity synchronously. This parameter applies only to scaling groups that are configured with an expected number of instances. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: Synchronous execution. The scaling activity is triggered immediately.</p>
     * </li>
     * <li><p><code>false</code>: Asynchronous execution. The call updates the expected number of instances without immediately triggering the scaling activity. The activity occurs when the system detects a discrepancy between the new expected number and the current number of instances.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>For more information about the expected number of instances, see <a href="https://help.aliyun.com/document_detail/146231.html">Expected number of instances</a>.</p>
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

    public ScaleWithAdjustmentShrinkRequest setExecutionMode(String executionMode) {
        this.executionMode = executionMode;
        return this;
    }
    public String getExecutionMode() {
        return this.executionMode;
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

    public ScaleWithAdjustmentShrinkRequest setParallelTask(Boolean parallelTask) {
        this.parallelTask = parallelTask;
        return this;
    }
    public Boolean getParallelTask() {
        return this.parallelTask;
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
