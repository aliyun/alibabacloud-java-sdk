// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class AddScalingConfigItemV2Request extends TeaModel {
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

    public static AddScalingConfigItemV2Request build(java.util.Map<String, ?> map) throws Exception {
        AddScalingConfigItemV2Request self = new AddScalingConfigItemV2Request();
        return TeaModel.build(map, self);
    }

    public AddScalingConfigItemV2Request setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AddScalingConfigItemV2Request setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddScalingConfigItemV2Request setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public AddScalingConfigItemV2Request setScalingGroupBizId(String scalingGroupBizId) {
        this.scalingGroupBizId = scalingGroupBizId;
        return this;
    }
    public String getScalingGroupBizId() {
        return this.scalingGroupBizId;
    }

    public AddScalingConfigItemV2Request setConfigItemType(String configItemType) {
        this.configItemType = configItemType;
        return this;
    }
    public String getConfigItemType() {
        return this.configItemType;
    }

    public AddScalingConfigItemV2Request setConfigItemInformation(String configItemInformation) {
        this.configItemInformation = configItemInformation;
        return this;
    }
    public String getConfigItemInformation() {
        return this.configItemInformation;
    }

}
