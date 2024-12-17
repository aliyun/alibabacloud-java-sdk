// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class CreateDiagnoseReportRequest extends TeaModel {
    /**
     * <p>The region ID of the scaling group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the scaling group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>asg-bp1f2f6oxc2*******</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    public static CreateDiagnoseReportRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDiagnoseReportRequest self = new CreateDiagnoseReportRequest();
        return TeaModel.build(map, self);
    }

    public CreateDiagnoseReportRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDiagnoseReportRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

}
