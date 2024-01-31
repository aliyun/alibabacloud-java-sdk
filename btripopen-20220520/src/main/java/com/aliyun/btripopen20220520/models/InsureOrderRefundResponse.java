// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class InsureOrderRefundResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InsureOrderRefundResponseBody body;

    public static InsureOrderRefundResponse build(java.util.Map<String, ?> map) throws Exception {
        InsureOrderRefundResponse self = new InsureOrderRefundResponse();
        return TeaModel.build(map, self);
    }

    public InsureOrderRefundResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InsureOrderRefundResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InsureOrderRefundResponse setBody(InsureOrderRefundResponseBody body) {
        this.body = body;
        return this;
    }
    public InsureOrderRefundResponseBody getBody() {
        return this.body;
    }

}
