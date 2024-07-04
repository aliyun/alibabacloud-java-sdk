// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DetachLoadBalancersResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the scaling activity. The value of this parameter is returned only if you set the Async parameter to true. You can call the describescalingactivities operation to query all scaling activity IDs and use the scaling activity IDs to check the status of the scaling activities.</p>
     * 
     * <strong>example:</strong>
     * <p>asa-bp140qd7mak8k63f****</p>
     */
    @NameInMap("ScalingActivityId")
    public String scalingActivityId;

    public static DetachLoadBalancersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachLoadBalancersResponseBody self = new DetachLoadBalancersResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachLoadBalancersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetachLoadBalancersResponseBody setScalingActivityId(String scalingActivityId) {
        this.scalingActivityId = scalingActivityId;
        return this;
    }
    public String getScalingActivityId() {
        return this.scalingActivityId;
    }

}
