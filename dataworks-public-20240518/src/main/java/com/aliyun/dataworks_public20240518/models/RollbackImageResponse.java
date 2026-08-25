// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class RollbackImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RollbackImageResponseBody body;

    public static RollbackImageResponse build(java.util.Map<String, ?> map) throws Exception {
        RollbackImageResponse self = new RollbackImageResponse();
        return TeaModel.build(map, self);
    }

    public RollbackImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RollbackImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RollbackImageResponse setBody(RollbackImageResponseBody body) {
        this.body = body;
        return this;
    }
    public RollbackImageResponseBody getBody() {
        return this.body;
    }

}
