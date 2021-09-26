// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class DescribeScalingGroupRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ScalingGroupBizId")
    public String scalingGroupBizId;

    @NameInMap("HostGroupBizId")
    public String hostGroupBizId;

    public static DescribeScalingGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeScalingGroupRequest self = new DescribeScalingGroupRequest();
        return TeaModel.build(map, self);
    }

    public DescribeScalingGroupRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeScalingGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeScalingGroupRequest setScalingGroupBizId(String scalingGroupBizId) {
        this.scalingGroupBizId = scalingGroupBizId;
        return this;
    }
    public String getScalingGroupBizId() {
        return this.scalingGroupBizId;
    }

    public DescribeScalingGroupRequest setHostGroupBizId(String hostGroupBizId) {
        this.hostGroupBizId = hostGroupBizId;
        return this;
    }
    public String getHostGroupBizId() {
        return this.hostGroupBizId;
    }

}
