// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class PutDcdnKvResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PutDcdnKvResponseBody body;

    public static PutDcdnKvResponse build(java.util.Map<String, ?> map) throws Exception {
        PutDcdnKvResponse self = new PutDcdnKvResponse();
        return TeaModel.build(map, self);
    }

    public PutDcdnKvResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutDcdnKvResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutDcdnKvResponse setBody(PutDcdnKvResponseBody body) {
        this.body = body;
        return this;
    }
    public PutDcdnKvResponseBody getBody() {
        return this.body;
    }

}
