// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class DetachInstancesResponseBody extends TeaModel {
    @NameInMap("ScalingActivityId")
    public String scalingActivityId;

    @NameInMap("RequestId")
    public String requestId;

    public static DetachInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachInstancesResponseBody self = new DetachInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachInstancesResponseBody setScalingActivityId(String scalingActivityId) {
        this.scalingActivityId = scalingActivityId;
        return this;
    }
    public String getScalingActivityId() {
        return this.scalingActivityId;
    }

    public DetachInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
