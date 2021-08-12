// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class ExecuteScalingRuleResponseBody extends TeaModel {
    @NameInMap("ScalingActivityId")
    public String scalingActivityId;

    @NameInMap("RequestId")
    public String requestId;

    public static ExecuteScalingRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteScalingRuleResponseBody self = new ExecuteScalingRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteScalingRuleResponseBody setScalingActivityId(String scalingActivityId) {
        this.scalingActivityId = scalingActivityId;
        return this;
    }
    public String getScalingActivityId() {
        return this.scalingActivityId;
    }

    public ExecuteScalingRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
