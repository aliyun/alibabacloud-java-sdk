// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DetachServerGroupsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6EF9BFEE-FE07-4627-B8FB-14326FB9****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the scaling activity. During the scaling activity, the server group is detached from the scaling group and the existing servers, which are the ECS instances or elastic container instances in the scaling group, are removed from the server group.</p>
     * <blockquote>
     * <p> This parameter is returned only if you set <code>ForceDetach</code> to <code>true</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>asa-bp1gbswjhjrw8tko****</p>
     */
    @NameInMap("ScalingActivityId")
    public String scalingActivityId;

    public static DetachServerGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachServerGroupsResponseBody self = new DetachServerGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachServerGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetachServerGroupsResponseBody setScalingActivityId(String scalingActivityId) {
        this.scalingActivityId = scalingActivityId;
        return this;
    }
    public String getScalingActivityId() {
        return this.scalingActivityId;
    }

}
