// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class CreateRefundOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RefundOrderResult body;

    public static CreateRefundOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRefundOrderResponse self = new CreateRefundOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreateRefundOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRefundOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRefundOrderResponse setBody(RefundOrderResult body) {
        this.body = body;
        return this;
    }
    public RefundOrderResult getBody() {
        return this.body;
    }

}
