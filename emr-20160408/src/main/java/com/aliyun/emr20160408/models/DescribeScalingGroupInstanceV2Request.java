// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DescribeScalingGroupInstanceV2Request extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ScalingGroupBizId")
    public String scalingGroupBizId;

    @NameInMap("HostGroupBizId")
    public String hostGroupBizId;

    public static DescribeScalingGroupInstanceV2Request build(java.util.Map<String, ?> map) throws Exception {
        DescribeScalingGroupInstanceV2Request self = new DescribeScalingGroupInstanceV2Request();
        return TeaModel.build(map, self);
    }

    public DescribeScalingGroupInstanceV2Request setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeScalingGroupInstanceV2Request setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeScalingGroupInstanceV2Request setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeScalingGroupInstanceV2Request setScalingGroupBizId(String scalingGroupBizId) {
        this.scalingGroupBizId = scalingGroupBizId;
        return this;
    }
    public String getScalingGroupBizId() {
        return this.scalingGroupBizId;
    }

    public DescribeScalingGroupInstanceV2Request setHostGroupBizId(String hostGroupBizId) {
        this.hostGroupBizId = hostGroupBizId;
        return this;
    }
    public String getHostGroupBizId() {
        return this.hostGroupBizId;
    }

}
