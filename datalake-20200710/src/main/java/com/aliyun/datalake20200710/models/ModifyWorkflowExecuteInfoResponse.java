// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ModifyWorkflowExecuteInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyWorkflowExecuteInfoResponseBody body;

    public static ModifyWorkflowExecuteInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyWorkflowExecuteInfoResponse self = new ModifyWorkflowExecuteInfoResponse();
        return TeaModel.build(map, self);
    }

    public ModifyWorkflowExecuteInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyWorkflowExecuteInfoResponse setBody(ModifyWorkflowExecuteInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyWorkflowExecuteInfoResponseBody getBody() {
        return this.body;
    }

}
