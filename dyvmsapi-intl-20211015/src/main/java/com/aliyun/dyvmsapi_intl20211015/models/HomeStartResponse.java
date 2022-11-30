// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class HomeStartResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public HomeStartResponseBody body;

    public static HomeStartResponse build(java.util.Map<String, ?> map) throws Exception {
        HomeStartResponse self = new HomeStartResponse();
        return TeaModel.build(map, self);
    }

    public HomeStartResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HomeStartResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public HomeStartResponse setBody(HomeStartResponseBody body) {
        this.body = body;
        return this;
    }
    public HomeStartResponseBody getBody() {
        return this.body;
    }

}
