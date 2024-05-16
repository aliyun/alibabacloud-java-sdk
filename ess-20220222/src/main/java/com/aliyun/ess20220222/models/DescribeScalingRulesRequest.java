// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeScalingRulesRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of the page to return. Pages start from page 1.</p>
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Maximum value: 50.</p>
     * <br>
     * <p>Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the scaling group to which the scaling rules that you want to query belong.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the scaling group.</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    /**
     * <p>The unique identifiers of the scaling rules that you want to query.</p>
     */
    @NameInMap("ScalingRuleAris")
    public java.util.List<String> scalingRuleAris;

    /**
     * <p>The IDs of the scaling rules that you want to query.</p>
     */
    @NameInMap("ScalingRuleIds")
    public java.util.List<String> scalingRuleIds;

    /**
     * <p>The names of the scaling rules that you want to query.</p>
     */
    @NameInMap("ScalingRuleNames")
    public java.util.List<String> scalingRuleNames;

    /**
     * <p>The type of the scaling rule. Valid values:</p>
     * <br>
     * <p>*   SimpleScalingRule: adjusts the number of ECS instances based on the values of the AdjustmentType and AdjustmentValue parameters.</p>
     * <p>*   TargetTrackingScalingRule: calculates the number of ECS instances that need to be scaled in a dynamic manner and maintains the value of a predefined metric close to the value of the TargetValue parameter.</p>
     * <p>*   StepScalingRule: scales ECS instances in steps based on the specified thresholds and metric values.</p>
     * <p>*   PredictiveScalingRule: uses machine learning to analyze historical monitoring data of the scaling group and predicts the future values of metrics. In addition, Auto Scaling automatically creates scheduled tasks to adjust the boundary values for the scaling group.</p>
     */
    @NameInMap("ScalingRuleType")
    public String scalingRuleType;

    /**
     * <p>Specifies whether to return CloudMonitor event-triggered tasks associated with scaling rules. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     * <br>
     * <p>Default value: false.</p>
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
