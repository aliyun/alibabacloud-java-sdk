// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class NumberEnableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public NumberEnableResponseBody body;

    public static NumberEnableResponse build(java.util.Map<String, ?> map) throws Exception {
        NumberEnableResponse self = new NumberEnableResponse();
        return TeaModel.build(map, self);
    }

    public NumberEnableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public NumberEnableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public NumberEnableResponse setBody(NumberEnableResponseBody body) {
        this.body = body;
        return this;
    }
    public NumberEnableResponseBody getBody() {
        return this.body;
    }

}
