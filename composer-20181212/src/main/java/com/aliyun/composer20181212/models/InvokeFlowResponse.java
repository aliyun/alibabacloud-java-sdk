// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.composer20181212.models;

import com.aliyun.tea.*;

public class InvokeFlowResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("InvocationId")
    @Validation(required = true)
    public String invocationId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    public static InvokeFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        InvokeFlowResponse self = new InvokeFlowResponse();
        return TeaModel.build(map, self);
    }

    public InvokeFlowResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InvokeFlowResponse setInvocationId(String invocationId) {
        this.invocationId = invocationId;
        return this;
    }
    public String getInvocationId() {
        return this.invocationId;
    }

    public InvokeFlowResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
