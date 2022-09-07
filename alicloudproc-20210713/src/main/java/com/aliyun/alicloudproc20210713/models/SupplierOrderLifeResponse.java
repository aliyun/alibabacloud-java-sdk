// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alicloudproc20210713.models;

import com.aliyun.tea.*;

public class SupplierOrderLifeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SupplierOrderLifeResponseBody body;

    public static SupplierOrderLifeResponse build(java.util.Map<String, ?> map) throws Exception {
        SupplierOrderLifeResponse self = new SupplierOrderLifeResponse();
        return TeaModel.build(map, self);
    }

    public SupplierOrderLifeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SupplierOrderLifeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SupplierOrderLifeResponse setBody(SupplierOrderLifeResponseBody body) {
        this.body = body;
        return this;
    }
    public SupplierOrderLifeResponseBody getBody() {
        return this.body;
    }

}
