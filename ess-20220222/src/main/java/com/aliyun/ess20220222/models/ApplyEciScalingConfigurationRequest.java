// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ApplyEciScalingConfigurationRequest extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("Format")
    public String format;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ScalingConfigurationId")
    public String scalingConfigurationId;

    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    public static ApplyEciScalingConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyEciScalingConfigurationRequest self = new ApplyEciScalingConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public ApplyEciScalingConfigurationRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ApplyEciScalingConfigurationRequest setFormat(String format) {
        this.format = format;
        return this;
    }
    public String getFormat() {
        return this.format;
    }

    public ApplyEciScalingConfigurationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ApplyEciScalingConfigurationRequest setScalingConfigurationId(String scalingConfigurationId) {
        this.scalingConfigurationId = scalingConfigurationId;
        return this;
    }
    public String getScalingConfigurationId() {
        return this.scalingConfigurationId;
    }

    public ApplyEciScalingConfigurationRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

}
