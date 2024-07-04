// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class AttachLoadBalancersResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the scaling activity.</p>
     * <p>This parameter is returned only if you set <code>Async</code> to <code>true</code>. You can call the DescribeScalingActivities operation to query the scaling activity IDs and status.</p>
     * 
     * <strong>example:</strong>
     * <p>asa-bp140qd7mak8k63f****</p>
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
