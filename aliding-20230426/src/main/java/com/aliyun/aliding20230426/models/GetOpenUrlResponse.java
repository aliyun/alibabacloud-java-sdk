// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetOpenUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetOpenUrlResponseBody body;

    public static GetOpenUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOpenUrlResponse self = new GetOpenUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetOpenUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOpenUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOpenUrlResponse setBody(GetOpenUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOpenUrlResponseBody getBody() {
        return this.body;
    }

}
