// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class RepayOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RepayOrderResponseBody body;

    public static RepayOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        RepayOrderResponse self = new RepayOrderResponse();
        return TeaModel.build(map, self);
    }

    public RepayOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RepayOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RepayOrderResponse setBody(RepayOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public RepayOrderResponseBody getBody() {
        return this.body;
    }

}
