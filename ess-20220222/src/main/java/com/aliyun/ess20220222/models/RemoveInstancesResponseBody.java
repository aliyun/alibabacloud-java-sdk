// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class RemoveInstancesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ScalingActivityId")
    public String scalingActivityId;

    public static RemoveInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveInstancesResponseBody self = new RemoveInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveInstancesResponseBody setScalingActivityId(String scalingActivityId) {
        this.scalingActivityId = scalingActivityId;
        return this;
    }
    public String getScalingActivityId() {
        return this.scalingActivityId;
    }

}
