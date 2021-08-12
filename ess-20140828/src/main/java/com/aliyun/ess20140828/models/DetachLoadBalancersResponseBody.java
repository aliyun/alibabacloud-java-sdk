// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class DetachLoadBalancersResponseBody extends TeaModel {
    @NameInMap("ScalingActivityId")
    public String scalingActivityId;

    @NameInMap("RequestId")
    public String requestId;

    public static DetachLoadBalancersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachLoadBalancersResponseBody self = new DetachLoadBalancersResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachLoadBalancersResponseBody setScalingActivityId(String scalingActivityId) {
        this.scalingActivityId = scalingActivityId;
        return this;
    }
    public String getScalingActivityId() {
        return this.scalingActivityId;
    }

    public DetachLoadBalancersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
