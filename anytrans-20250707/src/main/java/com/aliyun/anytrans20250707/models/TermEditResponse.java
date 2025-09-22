// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.anytrans20250707.models;

import com.aliyun.tea.*;

public class TermEditResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TermEditResponseBody body;

    public static TermEditResponse build(java.util.Map<String, ?> map) throws Exception {
        TermEditResponse self = new TermEditResponse();
        return TeaModel.build(map, self);
    }

    public TermEditResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TermEditResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TermEditResponse setBody(TermEditResponseBody body) {
        this.body = body;
        return this;
    }
    public TermEditResponseBody getBody() {
        return this.body;
    }

}
