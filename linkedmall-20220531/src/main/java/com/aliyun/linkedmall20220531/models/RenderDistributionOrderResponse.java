// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class RenderDistributionOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RenderDistributionOrderResponseBody body;

    public static RenderDistributionOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        RenderDistributionOrderResponse self = new RenderDistributionOrderResponse();
        return TeaModel.build(map, self);
    }

    public RenderDistributionOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenderDistributionOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RenderDistributionOrderResponse setBody(RenderDistributionOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public RenderDistributionOrderResponseBody getBody() {
        return this.body;
    }

}
