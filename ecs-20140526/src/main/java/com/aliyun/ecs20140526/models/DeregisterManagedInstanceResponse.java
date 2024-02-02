// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeregisterManagedInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeregisterManagedInstanceResponseBody body;

    public static DeregisterManagedInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeregisterManagedInstanceResponse self = new DeregisterManagedInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DeregisterManagedInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeregisterManagedInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeregisterManagedInstanceResponse setBody(DeregisterManagedInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeregisterManagedInstanceResponseBody getBody() {
        return this.body;
    }

}
