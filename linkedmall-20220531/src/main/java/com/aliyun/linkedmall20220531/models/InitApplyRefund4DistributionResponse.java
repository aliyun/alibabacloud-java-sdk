// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class InitApplyRefund4DistributionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InitApplyRefund4DistributionResponseBody body;

    public static InitApplyRefund4DistributionResponse build(java.util.Map<String, ?> map) throws Exception {
        InitApplyRefund4DistributionResponse self = new InitApplyRefund4DistributionResponse();
        return TeaModel.build(map, self);
    }

    public InitApplyRefund4DistributionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitApplyRefund4DistributionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InitApplyRefund4DistributionResponse setBody(InitApplyRefund4DistributionResponseBody body) {
        this.body = body;
        return this;
    }
    public InitApplyRefund4DistributionResponseBody getBody() {
        return this.body;
    }

}
