// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class InvokeCommandResponseBody extends TeaModel {
    // The ID of the command task.
    @NameInMap("InvokeId")
    public String invokeId;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static InvokeCommandResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InvokeCommandResponseBody self = new InvokeCommandResponseBody();
        return TeaModel.build(map, self);
    }

    public InvokeCommandResponseBody setInvokeId(String invokeId) {
        this.invokeId = invokeId;
        return this;
    }
    public String getInvokeId() {
        return this.invokeId;
    }

    public InvokeCommandResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
