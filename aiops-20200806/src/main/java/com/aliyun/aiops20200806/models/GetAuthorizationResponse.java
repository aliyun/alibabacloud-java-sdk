// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetAuthorizationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAuthorizationResponseBody body;

    public static GetAuthorizationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAuthorizationResponse self = new GetAuthorizationResponse();
        return TeaModel.build(map, self);
    }

    public GetAuthorizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAuthorizationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAuthorizationResponse setBody(GetAuthorizationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAuthorizationResponseBody getBody() {
        return this.body;
    }

}
