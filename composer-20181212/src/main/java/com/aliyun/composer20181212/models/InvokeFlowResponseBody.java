// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.composer20181212.models;

import com.aliyun.tea.*;

public class InvokeFlowResponseBody extends TeaModel {
    @NameInMap("InvocationId")
    public String invocationId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static InvokeFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InvokeFlowResponseBody self = new InvokeFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public InvokeFlowResponseBody setInvocationId(String invocationId) {
        this.invocationId = invocationId;
        return this;
    }
    public String getInvocationId() {
        return this.invocationId;
    }

    public InvokeFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InvokeFlowResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
