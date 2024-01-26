// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DelAuthTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DelAuthTokenResponseBody body;

    public static DelAuthTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        DelAuthTokenResponse self = new DelAuthTokenResponse();
        return TeaModel.build(map, self);
    }

    public DelAuthTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DelAuthTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DelAuthTokenResponse setBody(DelAuthTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public DelAuthTokenResponseBody getBody() {
        return this.body;
    }

}
