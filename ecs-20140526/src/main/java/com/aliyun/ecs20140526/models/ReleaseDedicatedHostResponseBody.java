// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ReleaseDedicatedHostResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A1B15AC8-E6F6-49A4-8985-8C07104B9199</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ReleaseDedicatedHostResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReleaseDedicatedHostResponseBody self = new ReleaseDedicatedHostResponseBody();
        return TeaModel.build(map, self);
    }

    public ReleaseDedicatedHostResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
