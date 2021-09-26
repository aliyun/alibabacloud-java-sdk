// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class AddScalingConfigItemRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ScalingGroupBizId")
    public String scalingGroupBizId;

    @NameInMap("ConfigItemType")
    public String configItemType;

    @NameInMap("ConfigItemInformation")
    public String configItemInformation;

    public static AddScalingConfigItemRequest build(java.util.Map<String, ?> map) throws Exception {
        AddScalingConfigItemRequest self = new AddScalingConfigItemRequest();
        return TeaModel.build(map, self);
    }

    public AddScalingConfigItemRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AddScalingConfigItemRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddScalingConfigItemRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public AddScalingConfigItemRequest setScalingGroupBizId(String scalingGroupBizId) {
        this.scalingGroupBizId = scalingGroupBizId;
        return this;
    }
    public String getScalingGroupBizId() {
        return this.scalingGroupBizId;
    }

    public AddScalingConfigItemRequest setConfigItemType(String configItemType) {
        this.configItemType = configItemType;
        return this;
    }
    public String getConfigItemType() {
        return this.configItemType;
    }

    public AddScalingConfigItemRequest setConfigItemInformation(String configItemInformation) {
        this.configItemInformation = configItemInformation;
        return this;
    }
    public String getConfigItemInformation() {
        return this.configItemInformation;
    }

}
