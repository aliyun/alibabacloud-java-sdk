// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class AuthorizeAndroidInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AuthorizeAndroidInstanceResponseBody body;

    public static AuthorizeAndroidInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeAndroidInstanceResponse self = new AuthorizeAndroidInstanceResponse();
        return TeaModel.build(map, self);
    }

    public AuthorizeAndroidInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AuthorizeAndroidInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AuthorizeAndroidInstanceResponse setBody(AuthorizeAndroidInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public AuthorizeAndroidInstanceResponseBody getBody() {
        return this.body;
    }

}
