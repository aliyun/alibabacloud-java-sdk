// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class InsureOrderCancelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InsureOrderCancelResponseBody body;

    public static InsureOrderCancelResponse build(java.util.Map<String, ?> map) throws Exception {
        InsureOrderCancelResponse self = new InsureOrderCancelResponse();
        return TeaModel.build(map, self);
    }

    public InsureOrderCancelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InsureOrderCancelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InsureOrderCancelResponse setBody(InsureOrderCancelResponseBody body) {
        this.body = body;
        return this;
    }
    public InsureOrderCancelResponseBody getBody() {
        return this.body;
    }

}
