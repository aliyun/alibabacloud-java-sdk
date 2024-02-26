// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class GetTaskStatusByIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTaskStatusByIdResponseBody body;

    public static GetTaskStatusByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTaskStatusByIdResponse self = new GetTaskStatusByIdResponse();
        return TeaModel.build(map, self);
    }

    public GetTaskStatusByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTaskStatusByIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTaskStatusByIdResponse setBody(GetTaskStatusByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTaskStatusByIdResponseBody getBody() {
        return this.body;
    }

}
