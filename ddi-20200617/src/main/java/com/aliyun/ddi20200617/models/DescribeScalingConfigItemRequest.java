// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class DescribeScalingConfigItemRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ScalingConfigItemId")
    public String scalingConfigItemId;

    @NameInMap("ScalingGroupBizId")
    public String scalingGroupBizId;

    @NameInMap("ConfigItemType")
    public String configItemType;

    public static DescribeScalingConfigItemRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeScalingConfigItemRequest self = new DescribeScalingConfigItemRequest();
        return TeaModel.build(map, self);
    }

    public DescribeScalingConfigItemRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeScalingConfigItemRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeScalingConfigItemRequest setScalingConfigItemId(String scalingConfigItemId) {
        this.scalingConfigItemId = scalingConfigItemId;
        return this;
    }
    public String getScalingConfigItemId() {
        return this.scalingConfigItemId;
    }

    public DescribeScalingConfigItemRequest setScalingGroupBizId(String scalingGroupBizId) {
        this.scalingGroupBizId = scalingGroupBizId;
        return this;
    }
    public String getScalingGroupBizId() {
        return this.scalingGroupBizId;
    }

    public DescribeScalingConfigItemRequest setConfigItemType(String configItemType) {
        this.configItemType = configItemType;
        return this;
    }
    public String getConfigItemType() {
        return this.configItemType;
    }

}
