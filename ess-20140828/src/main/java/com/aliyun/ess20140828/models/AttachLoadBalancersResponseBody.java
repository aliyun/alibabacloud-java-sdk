// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class AttachLoadBalancersResponseBody extends TeaModel {
    @NameInMap("ScalingActivityId")
    public String scalingActivityId;

    @NameInMap("RequestId")
    public String requestId;

    public static AttachLoadBalancersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachLoadBalancersResponseBody self = new AttachLoadBalancersResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachLoadBalancersResponseBody setScalingActivityId(String scalingActivityId) {
        this.scalingActivityId = scalingActivityId;
        return this;
    }
    public String getScalingActivityId() {
        return this.scalingActivityId;
    }

    public AttachLoadBalancersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
