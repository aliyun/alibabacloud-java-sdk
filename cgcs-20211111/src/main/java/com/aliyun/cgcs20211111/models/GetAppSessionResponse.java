// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class GetAppSessionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAppSessionResponseBody body;

    public static GetAppSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppSessionResponse self = new GetAppSessionResponse();
        return TeaModel.build(map, self);
    }

    public GetAppSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAppSessionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAppSessionResponse setBody(GetAppSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAppSessionResponseBody getBody() {
        return this.body;
    }

}
