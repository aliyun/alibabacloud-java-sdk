// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class RollbackApplicationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RollbackApplicationResponseBody body;

    public static RollbackApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        RollbackApplicationResponse self = new RollbackApplicationResponse();
        return TeaModel.build(map, self);
    }

    public RollbackApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RollbackApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RollbackApplicationResponse setBody(RollbackApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public RollbackApplicationResponseBody getBody() {
        return this.body;
    }

}
