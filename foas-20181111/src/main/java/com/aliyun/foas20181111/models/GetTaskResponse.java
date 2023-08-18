// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class GetTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetTaskResponseBody body;

    public static GetTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTaskResponse self = new GetTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTaskResponse setBody(GetTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTaskResponseBody getBody() {
        return this.body;
    }

}
