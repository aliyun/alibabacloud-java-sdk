// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class CancelRefundOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RefundOrderResult body;

    public static CancelRefundOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelRefundOrderResponse self = new CancelRefundOrderResponse();
        return TeaModel.build(map, self);
    }

    public CancelRefundOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelRefundOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelRefundOrderResponse setBody(RefundOrderResult body) {
        this.body = body;
        return this;
    }
    public RefundOrderResult getBody() {
        return this.body;
    }

}
