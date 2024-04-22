// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class InitModifyRefund4DistributionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InitModifyRefund4DistributionResponseBody body;

    public static InitModifyRefund4DistributionResponse build(java.util.Map<String, ?> map) throws Exception {
        InitModifyRefund4DistributionResponse self = new InitModifyRefund4DistributionResponse();
        return TeaModel.build(map, self);
    }

    public InitModifyRefund4DistributionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitModifyRefund4DistributionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InitModifyRefund4DistributionResponse setBody(InitModifyRefund4DistributionResponseBody body) {
        this.body = body;
        return this;
    }
    public InitModifyRefund4DistributionResponseBody getBody() {
        return this.body;
    }

}
