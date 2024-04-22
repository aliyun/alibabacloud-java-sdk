// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class ApplyCreateDistributionOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ApplyCreateDistributionOrderResponseBody body;

    public static ApplyCreateDistributionOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyCreateDistributionOrderResponse self = new ApplyCreateDistributionOrderResponse();
        return TeaModel.build(map, self);
    }

    public ApplyCreateDistributionOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyCreateDistributionOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyCreateDistributionOrderResponse setBody(ApplyCreateDistributionOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyCreateDistributionOrderResponseBody getBody() {
        return this.body;
    }

}
