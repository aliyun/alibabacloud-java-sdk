// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetAsyncTaskStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAsyncTaskStatusResponseBody body;

    public static GetAsyncTaskStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAsyncTaskStatusResponse self = new GetAsyncTaskStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetAsyncTaskStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAsyncTaskStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAsyncTaskStatusResponse setBody(GetAsyncTaskStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAsyncTaskStatusResponseBody getBody() {
        return this.body;
    }

}
