// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class AttachAlbServerGroupsResponseBody extends TeaModel {
    /**
     * <p>auditing</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("ScalingActivityId")
    public String scalingActivityId;

    public static AttachAlbServerGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachAlbServerGroupsResponseBody self = new AttachAlbServerGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachAlbServerGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AttachAlbServerGroupsResponseBody setScalingActivityId(String scalingActivityId) {
        this.scalingActivityId = scalingActivityId;
        return this;
    }
    public String getScalingActivityId() {
        return this.scalingActivityId;
    }

}
