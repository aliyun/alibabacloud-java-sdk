// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ApplyEciScalingConfigurationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
