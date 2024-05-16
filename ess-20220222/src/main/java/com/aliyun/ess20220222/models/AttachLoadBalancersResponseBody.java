// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class AttachLoadBalancersResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the scaling activity.</p>
     * <br>
     * <p>This parameter is returned only if you set `Async` to `true`. You can call the DescribeScalingActivities operation to query the scaling activity IDs and status.</p>
     */
    @NameInMap("ScalingActivityId")
    public String scalingActivityId;

    public static AttachLoadBalancersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachLoadBalancersResponseBody self = new AttachLoadBalancersResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachLoadBalancersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AttachLoadBalancersResponseBody setScalingActivityId(String scalingActivityId) {
        this.scalingActivityId = scalingActivityId;
        return this;
    }
    public String getScalingActivityId() {
        return this.scalingActivityId;
    }

}
