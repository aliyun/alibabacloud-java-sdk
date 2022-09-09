// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ModifyEciScalingConfigurationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyEciScalingConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyEciScalingConfigurationResponseBody self = new ModifyEciScalingConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyEciScalingConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
