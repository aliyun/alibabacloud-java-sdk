// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class CreateScalingConfigurationResponseBody extends TeaModel {
    @NameInMap("ScalingConfigurationId")
    public String scalingConfigurationId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateScalingConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateScalingConfigurationResponseBody self = new CreateScalingConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateScalingConfigurationResponseBody setScalingConfigurationId(String scalingConfigurationId) {
        this.scalingConfigurationId = scalingConfigurationId;
        return this;
    }
    public String getScalingConfigurationId() {
        return this.scalingConfigurationId;
    }

    public CreateScalingConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
