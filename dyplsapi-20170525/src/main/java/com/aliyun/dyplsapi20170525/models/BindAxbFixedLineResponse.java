// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class BindAxbFixedLineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BindAxbFixedLineResponseBody body;

    public static BindAxbFixedLineResponse build(java.util.Map<String, ?> map) throws Exception {
        BindAxbFixedLineResponse self = new BindAxbFixedLineResponse();
        return TeaModel.build(map, self);
    }

    public BindAxbFixedLineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindAxbFixedLineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindAxbFixedLineResponse setBody(BindAxbFixedLineResponseBody body) {
        this.body = body;
        return this;
    }
    public BindAxbFixedLineResponseBody getBody() {
        return this.body;
    }

}
