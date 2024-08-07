// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RedeployDedicatedHostResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>FCED4B7A-53D5-4C04-ABE3-26D4F3890D57</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RedeployDedicatedHostResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RedeployDedicatedHostResponseBody self = new RedeployDedicatedHostResponseBody();
        return TeaModel.build(map, self);
    }

    public RedeployDedicatedHostResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
