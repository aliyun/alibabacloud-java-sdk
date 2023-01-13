// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class CreateEciScalingConfigurationResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the elastic container instance.</p>
     */
    @NameInMap("ScalingConfigurationId")
    public String scalingConfigurationId;

    public static CreateEciScalingConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEciScalingConfigurationResponseBody self = new CreateEciScalingConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEciScalingConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateEciScalingConfigurationResponseBody setScalingConfigurationId(String scalingConfigurationId) {
        this.scalingConfigurationId = scalingConfigurationId;
        return this;
    }
    public String getScalingConfigurationId() {
        return this.scalingConfigurationId;
    }

}
