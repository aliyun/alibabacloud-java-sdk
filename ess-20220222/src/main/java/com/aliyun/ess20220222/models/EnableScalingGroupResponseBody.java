// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class EnableScalingGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EnableScalingGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableScalingGroupResponseBody self = new EnableScalingGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableScalingGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
