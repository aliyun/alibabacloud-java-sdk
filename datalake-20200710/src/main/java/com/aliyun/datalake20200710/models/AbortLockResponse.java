// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class AbortLockResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AbortLockResponseBody body;

    public static AbortLockResponse build(java.util.Map<String, ?> map) throws Exception {
        AbortLockResponse self = new AbortLockResponse();
        return TeaModel.build(map, self);
    }

    public AbortLockResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AbortLockResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AbortLockResponse setBody(AbortLockResponseBody body) {
        this.body = body;
        return this;
    }
    public AbortLockResponseBody getBody() {
        return this.body;
    }

}
