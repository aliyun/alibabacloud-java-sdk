// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class UntagResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UntagResponseBody body;

    public static UntagResponse build(java.util.Map<String, ?> map) throws Exception {
        UntagResponse self = new UntagResponse();
        return TeaModel.build(map, self);
    }

    public UntagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UntagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UntagResponse setBody(UntagResponseBody body) {
        this.body = body;
        return this;
    }
    public UntagResponseBody getBody() {
        return this.body;
    }

}
