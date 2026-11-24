// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeScalingRulesRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number of the scaling rule list. Pages start from 1.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The Settings for the number of entries per page during a paged query. Maximum value: 50.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the scaling group to which the scaling rules belong.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-qingdao</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the scaling group.</p>
     * 
     * <strong>example:</strong>
     * <p>asg-bp1ffogfdauy0jw0****</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    /**
     * <p>The unique identifiers of the scaling rules to be queried.</p>
     */
    @NameInMap("ScalingRuleAris")
    public java.util.List<String> scalingRuleAris;

    /**
     * <p>The IDs of the scaling rules to be queried.</p>
     */
    @NameInMap("ScalingRuleIds")
    public java.util.List<String> scalingRuleIds;

    /**
     * <p>The names of the scaling rules to be queried.</p>
     */
    @NameInMap("ScalingRuleNames")
    public java.util.List<String> scalingRuleNames;

    /**
     * <p>The type of the scaling rule. Valid values: </p>
     * <ul>
     * <li>SimpleScalingRule: simple scaling rule. Adjusts the number of ECS instances based on the adjustment type (AdjustmentType) and adjustment value (AdjustmentValue).</li>
     * <li>TargetTrackingScalingRule: target tracking scaling rule. Dynamically calculates the number of ECS instances to scale out or scale-in based on a predefined metric (MetricName) and attempts to maintain the metric value near the target value (TargetValue).</li>
     * <li>StepScalingRule: step scaling rule. Provides a step-by-step extension method based on thresholds and metric values.</li>
     * <li>PredictiveScalingRule: predictive scaling rule. Analyzes the historical monitoring data of the scaling group based on machine learning capabilities to predict future monitoring metrics, and supports the automatic creation of scheduled tasks to set the boundaries of the scaling group.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SimpleScalingRule</p>
     */
    @NameInMap("ScalingRuleType")
    public String scalingRuleType;

    /**
     * <p>Specifies whether to return the CloudMonitor event-triggered tasks associated with the scaling rules. Valid values:</p>
     * <ul>
     * <li>true: returns the CloudMonitor event-triggered tasks associated with the scaling rules.</li>
     * <li>false: does not return the CloudMonitor event-triggered tasks associated with the scaling rules.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ShowAlarmRules")
    public Boolean showAlarmRules;

    public static DescribeScalingRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeScalingRulesRequest self = new DescribeScalingRulesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeScalingRulesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeScalingRulesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeScalingRulesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeScalingRulesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeScalingRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeScalingRulesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeScalingRulesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeScalingRulesRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public DescribeScalingRulesRequest setScalingRuleAris(java.util.List<String> scalingRuleAris) {
        this.scalingRuleAris = scalingRuleAris;
        return this;
    }
    public java.util.List<String> getScalingRuleAris() {
        return this.scalingRuleAris;
    }

    public DescribeScalingRulesRequest setScalingRuleIds(java.util.List<String> scalingRuleIds) {
        this.scalingRuleIds = scalingRuleIds;
        return this;
    }
    public java.util.List<String> getScalingRuleIds() {
        return this.scalingRuleIds;
    }

    public DescribeScalingRulesRequest setScalingRuleNames(java.util.List<String> scalingRuleNames) {
        this.scalingRuleNames = scalingRuleNames;
        return this;
    }
    public java.util.List<String> getScalingRuleNames() {
        return this.scalingRuleNames;
    }

    public DescribeScalingRulesRequest setScalingRuleType(String scalingRuleType) {
        this.scalingRuleType = scalingRuleType;
        return this;
    }
    public String getScalingRuleType() {
        return this.scalingRuleType;
    }

    public DescribeScalingRulesRequest setShowAlarmRules(Boolean showAlarmRules) {
        this.showAlarmRules = showAlarmRules;
        return this;
    }
    public Boolean getShowAlarmRules() {
        return this.showAlarmRules;
    }

}
