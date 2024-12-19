// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class RefundPointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RefundPointResponseBody body;

    public static RefundPointResponse build(java.util.Map<String, ?> map) throws Exception {
        RefundPointResponse self = new RefundPointResponse();
        return TeaModel.build(map, self);
    }

    public RefundPointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefundPointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RefundPointResponse setBody(RefundPointResponseBody body) {
        this.body = body;
        return this;
    }
    public RefundPointResponseBody getBody() {
        return this.body;
    }

}
