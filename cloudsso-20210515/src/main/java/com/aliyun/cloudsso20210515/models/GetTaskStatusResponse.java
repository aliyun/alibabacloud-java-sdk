// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetTaskStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTaskStatusResponseBody body;

    public static GetTaskStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTaskStatusResponse self = new GetTaskStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetTaskStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTaskStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTaskStatusResponse setBody(GetTaskStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTaskStatusResponseBody getBody() {
        return this.body;
    }

}
