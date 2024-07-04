// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class AttachServerGroupsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the scaling activity. During the scaling activity, the server group is attached to the scaling group and the existing ECS instances or elastic container instances in the scaling group are added to the server group.</p>
     * <blockquote>
     * <p> This parameter is returned only if you set ForceAttach to true.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>asa-bp1c9djwrgxjyk31****</p>
     */
    @NameInMap("ScalingActivityId")
    public String scalingActivityId;

    public static AttachServerGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachServerGroupsResponseBody self = new AttachServerGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachServerGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AttachServerGroupsResponseBody setScalingActivityId(String scalingActivityId) {
        this.scalingActivityId = scalingActivityId;
        return this;
    }
    public String getScalingActivityId() {
        return this.scalingActivityId;
    }

}
