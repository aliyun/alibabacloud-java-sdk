// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetStackExecutionResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetStackExecutionResultResponseBody body;

    public static GetStackExecutionResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStackExecutionResultResponse self = new GetStackExecutionResultResponse();
        return TeaModel.build(map, self);
    }

    public GetStackExecutionResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStackExecutionResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetStackExecutionResultResponse setBody(GetStackExecutionResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStackExecutionResultResponseBody getBody() {
        return this.body;
    }

}
