// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteDedicatedHostClusterResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>11B55F58-D3A4-4A9B-9596-342420D02FF8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDedicatedHostClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDedicatedHostClusterResponseBody self = new DeleteDedicatedHostClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDedicatedHostClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
