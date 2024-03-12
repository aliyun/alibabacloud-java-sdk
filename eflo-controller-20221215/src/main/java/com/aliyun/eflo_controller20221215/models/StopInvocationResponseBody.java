// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class StopInvocationResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
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
