// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class InvokeCommandResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("InvokeId")
    public String invokeId;

    public static InvokeCommandResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InvokeCommandResponseBody self = new InvokeCommandResponseBody();
        return TeaModel.build(map, self);
    }

    public InvokeCommandResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InvokeCommandResponseBody setInvokeId(String invokeId) {
        this.invokeId = invokeId;
        return this;
    }
    public String getInvokeId() {
        return this.invokeId;
    }

}
