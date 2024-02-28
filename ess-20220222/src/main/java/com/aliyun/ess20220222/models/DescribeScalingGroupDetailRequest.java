// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeScalingGroupDetailRequest extends TeaModel {
    @NameInMap("OutputFormat")
    public String outputFormat;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    public static DescribeScalingGroupDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeScalingGroupDetailRequest self = new DescribeScalingGroupDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeScalingGroupDetailRequest setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
        return this;
    }
    public String getOutputFormat() {
        return this.outputFormat;
    }

    public DescribeScalingGroupDetailRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeScalingGroupDetailRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeScalingGroupDetailRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

}
