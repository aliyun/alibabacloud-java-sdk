// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class LockResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public LockResourceResponseBody body;

    public static LockResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        LockResourceResponse self = new LockResourceResponse();
        return TeaModel.build(map, self);
    }

    public LockResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LockResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LockResourceResponse setBody(LockResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public LockResourceResponseBody getBody() {
        return this.body;
    }

}
