// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class RenderRefundOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RefundRenderResult body;

    public static RenderRefundOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        RenderRefundOrderResponse self = new RenderRefundOrderResponse();
        return TeaModel.build(map, self);
    }

    public RenderRefundOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenderRefundOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RenderRefundOrderResponse setBody(RefundRenderResult body) {
        this.body = body;
        return this;
    }
    public RefundRenderResult getBody() {
        return this.body;
    }

}
