// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class DescribeScalingRulesRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    @NameInMap("ScalingRuleType")
    public String scalingRuleType;

    @NameInMap("ShowAlarmRules")
    public Boolean showAlarmRules;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("ScalingRuleId")
    public java.util.List<String> scalingRuleId;

    @NameInMap("ScalingRuleName")
    public java.util.List<String> scalingRuleName;

    @NameInMap("ScalingRuleAri")
    public java.util.List<String> scalingRuleAri;

    public static DescribeScalingRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeScalingRulesRequest self = new DescribeScalingRulesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeScalingRulesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
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

    public DescribeScalingRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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

    public DescribeScalingRulesRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
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

    public DescribeScalingRulesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeScalingRulesRequest setScalingRuleId(java.util.List<String> scalingRuleId) {
        this.scalingRuleId = scalingRuleId;
        return this;
    }
    public java.util.List<String> getScalingRuleId() {
        return this.scalingRuleId;
    }

    public DescribeScalingRulesRequest setScalingRuleName(java.util.List<String> scalingRuleName) {
        this.scalingRuleName = scalingRuleName;
        return this;
    }
    public java.util.List<String> getScalingRuleName() {
        return this.scalingRuleName;
    }

    public DescribeScalingRulesRequest setScalingRuleAri(java.util.List<String> scalingRuleAri) {
        this.scalingRuleAri = scalingRuleAri;
        return this;
    }
    public java.util.List<String> getScalingRuleAri() {
        return this.scalingRuleAri;
    }

}
