// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class UnLockIndexVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnLockIndexVersionResponseBody body;

    public static UnLockIndexVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        UnLockIndexVersionResponse self = new UnLockIndexVersionResponse();
        return TeaModel.build(map, self);
    }

    public UnLockIndexVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnLockIndexVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnLockIndexVersionResponse setBody(UnLockIndexVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public UnLockIndexVersionResponseBody getBody() {
        return this.body;
    }

}
