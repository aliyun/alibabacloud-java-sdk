// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetAuthorizationServerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAuthorizationServerResponseBody body;

    public static GetAuthorizationServerResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAuthorizationServerResponse self = new GetAuthorizationServerResponse();
        return TeaModel.build(map, self);
    }

    public GetAuthorizationServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAuthorizationServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAuthorizationServerResponse setBody(GetAuthorizationServerResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAuthorizationServerResponseBody getBody() {
        return this.body;
    }

}
