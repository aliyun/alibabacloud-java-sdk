// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class DeleteFlowControlTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteFlowControlTaskResponseBody body;

    public static DeleteFlowControlTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFlowControlTaskResponse self = new DeleteFlowControlTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFlowControlTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFlowControlTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteFlowControlTaskResponse setBody(DeleteFlowControlTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFlowControlTaskResponseBody getBody() {
        return this.body;
    }

}
