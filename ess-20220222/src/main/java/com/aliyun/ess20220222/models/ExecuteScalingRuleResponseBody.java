// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ExecuteScalingRuleResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the scaling activity.</p>
     */
    @NameInMap("ScalingActivityId")
    public String scalingActivityId;

    public static ExecuteScalingRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteScalingRuleResponseBody self = new ExecuteScalingRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteScalingRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecuteScalingRuleResponseBody setScalingActivityId(String scalingActivityId) {
        this.scalingActivityId = scalingActivityId;
        return this;
    }
    public String getScalingActivityId() {
        return this.scalingActivityId;
    }

}
