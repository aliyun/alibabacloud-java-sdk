// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alicloudproc20210713.models;

import com.aliyun.tea.*;

public class SupplierOrderProduceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SupplierOrderProduceResponseBody body;

    public static SupplierOrderProduceResponse build(java.util.Map<String, ?> map) throws Exception {
        SupplierOrderProduceResponse self = new SupplierOrderProduceResponse();
        return TeaModel.build(map, self);
    }

    public SupplierOrderProduceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SupplierOrderProduceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SupplierOrderProduceResponse setBody(SupplierOrderProduceResponseBody body) {
        this.body = body;
        return this;
    }
    public SupplierOrderProduceResponseBody getBody() {
        return this.body;
    }

}
