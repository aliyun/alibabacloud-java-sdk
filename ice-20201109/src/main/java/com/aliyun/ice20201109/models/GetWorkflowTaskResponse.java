// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetWorkflowTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWorkflowTaskResponseBody body;

    public static GetWorkflowTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWorkflowTaskResponse self = new GetWorkflowTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetWorkflowTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWorkflowTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWorkflowTaskResponse setBody(GetWorkflowTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWorkflowTaskResponseBody getBody() {
        return this.body;
    }

}
