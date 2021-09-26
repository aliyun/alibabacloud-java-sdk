// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ModifyScalingConfigItemRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    @NameInMap("ConfigItemInformation")
    public String configItemInformation;

    @NameInMap("ConfigItemType")
    public String configItemType;

    @NameInMap("ConfigItemBizId")
    public String configItemBizId;

    @NameInMap("ScalingGroupBizId")
    public String scalingGroupBizId;

    public static ModifyScalingConfigItemRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyScalingConfigItemRequest self = new ModifyScalingConfigItemRequest();
        return TeaModel.build(map, self);
    }

    public ModifyScalingConfigItemRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyScalingConfigItemRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyScalingConfigItemRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ModifyScalingConfigItemRequest setConfigItemInformation(String configItemInformation) {
        this.configItemInformation = configItemInformation;
        return this;
    }
    public String getConfigItemInformation() {
        return this.configItemInformation;
    }

    public ModifyScalingConfigItemRequest setConfigItemType(String configItemType) {
        this.configItemType = configItemType;
        return this;
    }
    public String getConfigItemType() {
        return this.configItemType;
    }

    public ModifyScalingConfigItemRequest setConfigItemBizId(String configItemBizId) {
        this.configItemBizId = configItemBizId;
        return this;
    }
    public String getConfigItemBizId() {
        return this.configItemBizId;
    }

    public ModifyScalingConfigItemRequest setScalingGroupBizId(String scalingGroupBizId) {
        this.scalingGroupBizId = scalingGroupBizId;
        return this;
    }
    public String getScalingGroupBizId() {
        return this.scalingGroupBizId;
    }

}
