// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class QuickInitInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuickInitInstanceResponseBody body;

    public static QuickInitInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        QuickInitInstanceResponse self = new QuickInitInstanceResponse();
        return TeaModel.build(map, self);
    }

    public QuickInitInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuickInitInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuickInitInstanceResponse setBody(QuickInitInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public QuickInitInstanceResponseBody getBody() {
        return this.body;
    }

}
