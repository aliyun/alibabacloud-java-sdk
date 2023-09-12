// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class GetRefundOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RefundResult body;

    public static GetRefundOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRefundOrderResponse self = new GetRefundOrderResponse();
        return TeaModel.build(map, self);
    }

    public GetRefundOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRefundOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRefundOrderResponse setBody(RefundResult body) {
        this.body = body;
        return this;
    }
    public RefundResult getBody() {
        return this.body;
    }

}
