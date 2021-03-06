// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RunCommandResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("InvokeId")
    @Validation(required = true)
    public String invokeId;

    public static RunCommandResponse build(java.util.Map<String, ?> map) throws Exception {
        RunCommandResponse self = new RunCommandResponse();
        return TeaModel.build(map, self);
    }

    public RunCommandResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RunCommandResponse setInvokeId(String invokeId) {
        this.invokeId = invokeId;
        return this;
    }
    public String getInvokeId() {
        return this.invokeId;
    }

}
