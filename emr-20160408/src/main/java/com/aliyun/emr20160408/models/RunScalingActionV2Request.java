// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class RunScalingActionV2Request extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ScalingActionType")
    public String scalingActionType;

    @NameInMap("ScalingGroupBizId")
    public String scalingGroupBizId;

    @NameInMap("ActionParam")
    public String actionParam;

    public static RunScalingActionV2Request build(java.util.Map<String, ?> map) throws Exception {
        RunScalingActionV2Request self = new RunScalingActionV2Request();
        return TeaModel.build(map, self);
    }

    public RunScalingActionV2Request setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public RunScalingActionV2Request setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RunScalingActionV2Request setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public RunScalingActionV2Request setScalingActionType(String scalingActionType) {
        this.scalingActionType = scalingActionType;
        return this;
    }
    public String getScalingActionType() {
        return this.scalingActionType;
    }

    public RunScalingActionV2Request setScalingGroupBizId(String scalingGroupBizId) {
        this.scalingGroupBizId = scalingGroupBizId;
        return this;
    }
    public String getScalingGroupBizId() {
        return this.scalingGroupBizId;
    }

    public RunScalingActionV2Request setActionParam(String actionParam) {
        this.actionParam = actionParam;
        return this;
    }
    public String getActionParam() {
        return this.actionParam;
    }

}
