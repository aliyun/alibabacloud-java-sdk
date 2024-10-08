// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class PutKvAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PutKvAccountResponseBody body;

    public static PutKvAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        PutKvAccountResponse self = new PutKvAccountResponse();
        return TeaModel.build(map, self);
    }

    public PutKvAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutKvAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutKvAccountResponse setBody(PutKvAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public PutKvAccountResponseBody getBody() {
        return this.body;
    }

}
