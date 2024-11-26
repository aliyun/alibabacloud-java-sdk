// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class RollbackServiceInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RollbackServiceInstanceResponseBody body;

    public static RollbackServiceInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RollbackServiceInstanceResponse self = new RollbackServiceInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RollbackServiceInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RollbackServiceInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RollbackServiceInstanceResponse setBody(RollbackServiceInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RollbackServiceInstanceResponseBody getBody() {
        return this.body;
    }

}
