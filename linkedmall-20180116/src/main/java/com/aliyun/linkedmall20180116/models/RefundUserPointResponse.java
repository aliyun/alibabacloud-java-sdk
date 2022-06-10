// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class RefundUserPointResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RefundUserPointResponseBody body;

    public static RefundUserPointResponse build(java.util.Map<String, ?> map) throws Exception {
        RefundUserPointResponse self = new RefundUserPointResponse();
        return TeaModel.build(map, self);
    }

    public RefundUserPointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefundUserPointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RefundUserPointResponse setBody(RefundUserPointResponseBody body) {
        this.body = body;
        return this;
    }
    public RefundUserPointResponseBody getBody() {
        return this.body;
    }

}
