// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class RenderRefundOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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
