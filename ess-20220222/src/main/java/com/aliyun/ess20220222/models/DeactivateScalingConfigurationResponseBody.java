// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DeactivateScalingConfigurationResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D09C9E64-7D19-4E1C-8CD6-123D34A4****</p>
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
