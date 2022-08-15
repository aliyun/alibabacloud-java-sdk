// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class GetDbfsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetDbfsResponseBody body;

    public static GetDbfsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDbfsResponse self = new GetDbfsResponse();
        return TeaModel.build(map, self);
    }

    public GetDbfsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDbfsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDbfsResponse setBody(GetDbfsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDbfsResponseBody getBody() {
        return this.body;
    }

}
