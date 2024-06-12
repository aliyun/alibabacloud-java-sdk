// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DisableScalingGroupResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DisableScalingGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableScalingGroupResponseBody self = new DisableScalingGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableScalingGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
