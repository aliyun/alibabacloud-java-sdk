// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alicloudproc20210713.models;

import com.aliyun.tea.*;

public class SupplierOrderVerifyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SupplierOrderVerifyResponseBody body;

    public static SupplierOrderVerifyResponse build(java.util.Map<String, ?> map) throws Exception {
        SupplierOrderVerifyResponse self = new SupplierOrderVerifyResponse();
        return TeaModel.build(map, self);
    }

    public SupplierOrderVerifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SupplierOrderVerifyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SupplierOrderVerifyResponse setBody(SupplierOrderVerifyResponseBody body) {
        this.body = body;
        return this;
    }
    public SupplierOrderVerifyResponseBody getBody() {
        return this.body;
    }

}
