// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class RemoveScalingConfigItemRequest extends TeaModel {
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

    @NameInMap("ConfigItemBizId")
    public String configItemBizId;

    public static RemoveScalingConfigItemRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveScalingConfigItemRequest self = new RemoveScalingConfigItemRequest();
        return TeaModel.build(map, self);
    }

    public RemoveScalingConfigItemRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public RemoveScalingConfigItemRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RemoveScalingConfigItemRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public RemoveScalingConfigItemRequest setScalingGroupBizId(String scalingGroupBizId) {
        this.scalingGroupBizId = scalingGroupBizId;
        return this;
    }
    public String getScalingGroupBizId() {
        return this.scalingGroupBizId;
    }

    public RemoveScalingConfigItemRequest setConfigItemType(String configItemType) {
        this.configItemType = configItemType;
        return this;
    }
    public String getConfigItemType() {
        return this.configItemType;
    }

    public RemoveScalingConfigItemRequest setConfigItemBizId(String configItemBizId) {
        this.configItemBizId = configItemBizId;
        return this;
    }
    public String getConfigItemBizId() {
        return this.configItemBizId;
    }

}
