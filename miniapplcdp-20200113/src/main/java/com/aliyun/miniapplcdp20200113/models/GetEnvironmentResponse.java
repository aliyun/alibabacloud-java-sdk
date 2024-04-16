// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GetEnvironmentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEnvironmentResponseBody body;

    public static GetEnvironmentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEnvironmentResponse self = new GetEnvironmentResponse();
        return TeaModel.build(map, self);
    }

    public GetEnvironmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEnvironmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEnvironmentResponse setBody(GetEnvironmentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEnvironmentResponseBody getBody() {
        return this.body;
    }

}
