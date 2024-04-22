// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class CancelRefund4DistributionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelRefund4DistributionResponseBody body;

    public static CancelRefund4DistributionResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelRefund4DistributionResponse self = new CancelRefund4DistributionResponse();
        return TeaModel.build(map, self);
    }

    public CancelRefund4DistributionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelRefund4DistributionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelRefund4DistributionResponse setBody(CancelRefund4DistributionResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelRefund4DistributionResponseBody getBody() {
        return this.body;
    }

}
