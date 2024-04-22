// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class ApplyRefund4DistributionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ApplyRefund4DistributionResponseBody body;

    public static ApplyRefund4DistributionResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyRefund4DistributionResponse self = new ApplyRefund4DistributionResponse();
        return TeaModel.build(map, self);
    }

    public ApplyRefund4DistributionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyRefund4DistributionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyRefund4DistributionResponse setBody(ApplyRefund4DistributionResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyRefund4DistributionResponseBody getBody() {
        return this.body;
    }

}
