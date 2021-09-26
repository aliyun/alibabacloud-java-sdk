// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class RunScalingActionRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ScalingActionType")
    public String scalingActionType;

    @NameInMap("ScalingGroupBizId")
    public String scalingGroupBizId;

    @NameInMap("ActionParam")
    public String actionParam;

    public static RunScalingActionRequest build(java.util.Map<String, ?> map) throws Exception {
        RunScalingActionRequest self = new RunScalingActionRequest();
        return TeaModel.build(map, self);
    }

    public RunScalingActionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public RunScalingActionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RunScalingActionRequest setScalingActionType(String scalingActionType) {
        this.scalingActionType = scalingActionType;
        return this;
    }
    public String getScalingActionType() {
        return this.scalingActionType;
    }

    public RunScalingActionRequest setScalingGroupBizId(String scalingGroupBizId) {
        this.scalingGroupBizId = scalingGroupBizId;
        return this;
    }
    public String getScalingGroupBizId() {
        return this.scalingGroupBizId;
    }

    public RunScalingActionRequest setActionParam(String actionParam) {
        this.actionParam = actionParam;
        return this;
    }
    public String getActionParam() {
        return this.actionParam;
    }

}
