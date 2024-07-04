// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class AttachInstancesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the scaling activity.</p>
     * 
     * <strong>example:</strong>
     * <p>asa-bp1crxor24s28xf1****</p>
     */
    @NameInMap("ScalingActivityId")
    public String scalingActivityId;

    public static AttachInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachInstancesResponseBody self = new AttachInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AttachInstancesResponseBody setScalingActivityId(String scalingActivityId) {
        this.scalingActivityId = scalingActivityId;
        return this;
    }
    public String getScalingActivityId() {
        return this.scalingActivityId;
    }

}
