// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class CancelRefundResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelRefundResponseBody body;

    public static CancelRefundResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelRefundResponse self = new CancelRefundResponse();
        return TeaModel.build(map, self);
    }

    public CancelRefundResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelRefundResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelRefundResponse setBody(CancelRefundResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelRefundResponseBody getBody() {
        return this.body;
    }

}
