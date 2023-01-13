// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class CreateScalingConfigurationResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the scaling configuration.</p>
     */
    @NameInMap("ScalingConfigurationId")
    public String scalingConfigurationId;

    public static CreateScalingConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateScalingConfigurationResponseBody self = new CreateScalingConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateScalingConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateScalingConfigurationResponseBody setScalingConfigurationId(String scalingConfigurationId) {
        this.scalingConfigurationId = scalingConfigurationId;
        return this;
    }
    public String getScalingConfigurationId() {
        return this.scalingConfigurationId;
    }

}
