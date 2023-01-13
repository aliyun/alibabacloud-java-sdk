// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ModifyScalingConfigurationResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyScalingConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyScalingConfigurationResponseBody self = new ModifyScalingConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyScalingConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
