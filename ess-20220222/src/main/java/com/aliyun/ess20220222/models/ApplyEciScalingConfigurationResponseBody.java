// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ApplyEciScalingConfigurationResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the scaling configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>asc-bp16har3jpj6fjbx****</p>
     */
    @NameInMap("ScalingConfigurationId")
    public String scalingConfigurationId;

    public static ApplyEciScalingConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyEciScalingConfigurationResponseBody self = new ApplyEciScalingConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplyEciScalingConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ApplyEciScalingConfigurationResponseBody setScalingConfigurationId(String scalingConfigurationId) {
        this.scalingConfigurationId = scalingConfigurationId;
        return this;
    }
    public String getScalingConfigurationId() {
        return this.scalingConfigurationId;
    }

}
