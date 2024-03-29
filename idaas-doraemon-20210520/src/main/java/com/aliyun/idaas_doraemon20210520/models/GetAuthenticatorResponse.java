// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class GetAuthenticatorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAuthenticatorResponseBody body;

    public static GetAuthenticatorResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAuthenticatorResponse self = new GetAuthenticatorResponse();
        return TeaModel.build(map, self);
    }

    public GetAuthenticatorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAuthenticatorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAuthenticatorResponse setBody(GetAuthenticatorResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAuthenticatorResponseBody getBody() {
        return this.body;
    }

}
