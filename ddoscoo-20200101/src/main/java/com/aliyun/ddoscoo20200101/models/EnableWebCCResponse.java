// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class EnableWebCCResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableWebCCResponseBody body;

    public static EnableWebCCResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableWebCCResponse self = new EnableWebCCResponse();
        return TeaModel.build(map, self);
    }

    public EnableWebCCResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableWebCCResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableWebCCResponse setBody(EnableWebCCResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableWebCCResponseBody getBody() {
        return this.body;
    }

}
