// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DeactivateScalingConfigurationResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeactivateScalingConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeactivateScalingConfigurationResponseBody self = new DeactivateScalingConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public DeactivateScalingConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
