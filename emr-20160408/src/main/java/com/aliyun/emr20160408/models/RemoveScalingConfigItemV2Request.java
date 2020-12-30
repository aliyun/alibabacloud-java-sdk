// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class RemoveScalingConfigItemV2Request extends TeaModel {
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

    public static RemoveScalingConfigItemV2Request build(java.util.Map<String, ?> map) throws Exception {
        RemoveScalingConfigItemV2Request self = new RemoveScalingConfigItemV2Request();
        return TeaModel.build(map, self);
    }

    public RemoveScalingConfigItemV2Request setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public RemoveScalingConfigItemV2Request setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RemoveScalingConfigItemV2Request setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public RemoveScalingConfigItemV2Request setScalingGroupBizId(String scalingGroupBizId) {
        this.scalingGroupBizId = scalingGroupBizId;
        return this;
    }
    public String getScalingGroupBizId() {
        return this.scalingGroupBizId;
    }

    public RemoveScalingConfigItemV2Request setConfigItemType(String configItemType) {
        this.configItemType = configItemType;
        return this;
    }
    public String getConfigItemType() {
        return this.configItemType;
    }

    public RemoveScalingConfigItemV2Request setConfigItemBizId(String configItemBizId) {
        this.configItemBizId = configItemBizId;
        return this;
    }
    public String getConfigItemBizId() {
        return this.configItemBizId;
    }

}
