// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class CreateFlowControlTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateFlowControlTaskResponseBody body;

    public static CreateFlowControlTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowControlTaskResponse self = new CreateFlowControlTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateFlowControlTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFlowControlTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFlowControlTaskResponse setBody(CreateFlowControlTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFlowControlTaskResponseBody getBody() {
        return this.body;
    }

}
