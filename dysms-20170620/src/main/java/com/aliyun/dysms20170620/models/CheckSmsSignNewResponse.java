// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CheckSmsSignNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckSmsSignNewResponseBody body;

    public static CheckSmsSignNewResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckSmsSignNewResponse self = new CheckSmsSignNewResponse();
        return TeaModel.build(map, self);
    }

    public CheckSmsSignNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckSmsSignNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckSmsSignNewResponse setBody(CheckSmsSignNewResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckSmsSignNewResponseBody getBody() {
        return this.body;
    }

}
