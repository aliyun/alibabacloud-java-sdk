// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DestroyInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DestroyInstanceResponseBody body;

    public static DestroyInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DestroyInstanceResponse self = new DestroyInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DestroyInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DestroyInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DestroyInstanceResponse setBody(DestroyInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DestroyInstanceResponseBody getBody() {
        return this.body;
    }

}
