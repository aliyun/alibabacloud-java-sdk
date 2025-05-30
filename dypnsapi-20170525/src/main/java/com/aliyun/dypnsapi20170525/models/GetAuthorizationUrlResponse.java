// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class GetAuthorizationUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAuthorizationUrlResponseBody body;

    public static GetAuthorizationUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAuthorizationUrlResponse self = new GetAuthorizationUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetAuthorizationUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAuthorizationUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAuthorizationUrlResponse setBody(GetAuthorizationUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAuthorizationUrlResponseBody getBody() {
        return this.body;
    }

}
