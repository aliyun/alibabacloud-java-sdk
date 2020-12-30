// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ModifyScalingConfigItemV2Request extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ScalingGroupBizId")
    public String scalingGroupBizId;

    @NameInMap("ConfigItemBizId")
    public String configItemBizId;

    @NameInMap("ConfigItemType")
    public String configItemType;

    @NameInMap("ConfigItemInformation")
    public String configItemInformation;

    public static ModifyScalingConfigItemV2Request build(java.util.Map<String, ?> map) throws Exception {
        ModifyScalingConfigItemV2Request self = new ModifyScalingConfigItemV2Request();
        return TeaModel.build(map, self);
    }

    public ModifyScalingConfigItemV2Request setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyScalingConfigItemV2Request setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyScalingConfigItemV2Request setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ModifyScalingConfigItemV2Request setScalingGroupBizId(String scalingGroupBizId) {
        this.scalingGroupBizId = scalingGroupBizId;
        return this;
    }
    public String getScalingGroupBizId() {
        return this.scalingGroupBizId;
    }

    public ModifyScalingConfigItemV2Request setConfigItemBizId(String configItemBizId) {
        this.configItemBizId = configItemBizId;
        return this;
    }
    public String getConfigItemBizId() {
        return this.configItemBizId;
    }

    public ModifyScalingConfigItemV2Request setConfigItemType(String configItemType) {
        this.configItemType = configItemType;
        return this;
    }
    public String getConfigItemType() {
        return this.configItemType;
    }

    public ModifyScalingConfigItemV2Request setConfigItemInformation(String configItemInformation) {
        this.configItemInformation = configItemInformation;
        return this;
    }
    public String getConfigItemInformation() {
        return this.configItemInformation;
    }

}
