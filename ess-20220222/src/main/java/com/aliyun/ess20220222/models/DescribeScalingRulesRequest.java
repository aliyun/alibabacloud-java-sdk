// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeScalingRulesRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    @NameInMap("ScalingRuleAris")
    public java.util.List<String> scalingRuleAris;

    @NameInMap("ScalingRuleIds")
    public java.util.List<String> scalingRuleIds;

    @NameInMap("ScalingRuleNames")
    public java.util.List<String> scalingRuleNames;

    @NameInMap("ScalingRuleType")
    public String scalingRuleType;

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
