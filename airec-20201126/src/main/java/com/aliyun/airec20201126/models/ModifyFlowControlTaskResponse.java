// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ModifyFlowControlTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyFlowControlTaskResponseBody body;

    public static ModifyFlowControlTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyFlowControlTaskResponse self = new ModifyFlowControlTaskResponse();
        return TeaModel.build(map, self);
    }

    public ModifyFlowControlTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyFlowControlTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyFlowControlTaskResponse setBody(ModifyFlowControlTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyFlowControlTaskResponseBody getBody() {
        return this.body;
    }

}
