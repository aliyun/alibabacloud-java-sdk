// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20221125.models;

import com.aliyun.tea.*;

public class EntVerifyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EntVerifyResponseBody body;

    public static EntVerifyResponse build(java.util.Map<String, ?> map) throws Exception {
        EntVerifyResponse self = new EntVerifyResponse();
        return TeaModel.build(map, self);
    }

    public EntVerifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EntVerifyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EntVerifyResponse setBody(EntVerifyResponseBody body) {
        this.body = body;
        return this;
    }
    public EntVerifyResponseBody getBody() {
        return this.body;
    }

}
