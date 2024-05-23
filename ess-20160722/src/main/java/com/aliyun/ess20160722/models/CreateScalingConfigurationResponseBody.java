// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20160722.models;

import com.aliyun.tea.*;

public class CreateScalingConfigurationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
