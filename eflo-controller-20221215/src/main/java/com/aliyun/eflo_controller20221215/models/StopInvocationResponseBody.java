// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class StopInvocationResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A7FD7411-9395-52E8-AF42-EB3A4A55446D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StopInvocationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopInvocationResponseBody self = new StopInvocationResponseBody();
        return TeaModel.build(map, self);
    }

    public StopInvocationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
