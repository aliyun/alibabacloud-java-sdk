// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ExitStandbyResponseBody extends TeaModel {
    /**
     * <p>330440</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ScalingActivityId")
    public String scalingActivityId;

    public static ExitStandbyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExitStandbyResponseBody self = new ExitStandbyResponseBody();
        return TeaModel.build(map, self);
    }

    public ExitStandbyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExitStandbyResponseBody setScalingActivityId(String scalingActivityId) {
        this.scalingActivityId = scalingActivityId;
        return this;
    }
    public String getScalingActivityId() {
        return this.scalingActivityId;
    }

}
