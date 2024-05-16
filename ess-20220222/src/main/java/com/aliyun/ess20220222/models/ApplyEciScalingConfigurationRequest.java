// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ApplyEciScalingConfigurationRequest extends TeaModel {
    /**
     * <p>The content of the configuration file.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>Optional. The format of the configuration file. Default value: YAML. Set the value to YAML.</p>
     */
    @NameInMap("Format")
    public String format;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the scaling configuration that you want to update. If you want to update a scaling configuration based on the value of Content, you must specify ScalingConfigurationId. If you want to create a scaling configuration based on the value of Content, you can leave ScalingConfigurationId empty.</p>
     */
    @NameInMap("ScalingConfigurationId")
    public String scalingConfigurationId;

    /**
     * <p>The ID of the scaling group.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
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
