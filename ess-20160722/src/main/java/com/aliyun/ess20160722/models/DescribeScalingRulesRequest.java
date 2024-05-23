// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20160722.models;

import com.aliyun.tea.*;

public class DescribeScalingRulesRequest extends TeaModel {
    @NameInMap("ScalingRuleAri")
    public java.util.List<String> scalingRuleAri;

    @NameInMap("ScalingRuleId")
    public java.util.List<String> scalingRuleId;

    @NameInMap("ScalingRuleName")
    public java.util.List<String> scalingRuleName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    public static DescribeScalingRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeScalingRulesRequest self = new DescribeScalingRulesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeScalingRulesRequest setScalingRuleAri(java.util.List<String> scalingRuleAri) {
        this.scalingRuleAri = scalingRuleAri;
        return this;
    }
    public java.util.List<String> getScalingRuleAri() {
        return this.scalingRuleAri;
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

}
