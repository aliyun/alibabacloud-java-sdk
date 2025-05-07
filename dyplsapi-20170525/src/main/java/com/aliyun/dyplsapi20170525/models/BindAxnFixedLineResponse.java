// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class BindAxnFixedLineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BindAxnFixedLineResponseBody body;

    public static BindAxnFixedLineResponse build(java.util.Map<String, ?> map) throws Exception {
        BindAxnFixedLineResponse self = new BindAxnFixedLineResponse();
        return TeaModel.build(map, self);
    }

    public BindAxnFixedLineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindAxnFixedLineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindAxnFixedLineResponse setBody(BindAxnFixedLineResponseBody body) {
        this.body = body;
        return this;
    }
    public BindAxnFixedLineResponseBody getBody() {
        return this.body;
    }

}
