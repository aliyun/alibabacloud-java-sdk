// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeEciScalingConfigurationDetailRequest extends TeaModel {
    /**
     * <p>The output format. Set the value to YAML.</p>
     * 
     * <strong>example:</strong>
     * <p>yaml</p>
     */
    @NameInMap("OutputFormat")
    public String outputFormat;

    /**
     * <p>The region ID of the scaling group to which the scaling configuration belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the scaling configuration based on which elastic container instances are created.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>asc-bp1ffogfdauy0nu5****</p>
     */
    @NameInMap("ScalingConfigurationId")
    public String scalingConfigurationId;

    /**
     * <p>The ID of the scaling group to which the scaling configuration belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>asg-bp1ffogfdauy0jw0****</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    public static DescribeEciScalingConfigurationDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEciScalingConfigurationDetailRequest self = new DescribeEciScalingConfigurationDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEciScalingConfigurationDetailRequest setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
        return this;
    }
    public String getOutputFormat() {
        return this.outputFormat;
    }

    public DescribeEciScalingConfigurationDetailRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeEciScalingConfigurationDetailRequest setScalingConfigurationId(String scalingConfigurationId) {
        this.scalingConfigurationId = scalingConfigurationId;
        return this;
    }
    public String getScalingConfigurationId() {
        return this.scalingConfigurationId;
    }

    public DescribeEciScalingConfigurationDetailRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

}
