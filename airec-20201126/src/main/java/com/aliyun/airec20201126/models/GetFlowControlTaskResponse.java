// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class GetFlowControlTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetFlowControlTaskResponseBody body;

    public static GetFlowControlTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFlowControlTaskResponse self = new GetFlowControlTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetFlowControlTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFlowControlTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFlowControlTaskResponse setBody(GetFlowControlTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFlowControlTaskResponseBody getBody() {
        return this.body;
    }

}
