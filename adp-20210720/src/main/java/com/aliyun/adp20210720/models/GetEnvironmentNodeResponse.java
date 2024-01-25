// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GetEnvironmentNodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEnvironmentNodeResponseBody body;

    public static GetEnvironmentNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEnvironmentNodeResponse self = new GetEnvironmentNodeResponse();
        return TeaModel.build(map, self);
    }

    public GetEnvironmentNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEnvironmentNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEnvironmentNodeResponse setBody(GetEnvironmentNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEnvironmentNodeResponseBody getBody() {
        return this.body;
    }

}
