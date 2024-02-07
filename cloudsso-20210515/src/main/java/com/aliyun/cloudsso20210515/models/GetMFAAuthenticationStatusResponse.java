// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetMFAAuthenticationStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMFAAuthenticationStatusResponseBody body;

    public static GetMFAAuthenticationStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMFAAuthenticationStatusResponse self = new GetMFAAuthenticationStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetMFAAuthenticationStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMFAAuthenticationStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMFAAuthenticationStatusResponse setBody(GetMFAAuthenticationStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMFAAuthenticationStatusResponseBody getBody() {
        return this.body;
    }

}
