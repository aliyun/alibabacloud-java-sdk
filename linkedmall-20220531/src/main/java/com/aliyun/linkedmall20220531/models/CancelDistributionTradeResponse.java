// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class CancelDistributionTradeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelDistributionTradeResponseBody body;

    public static CancelDistributionTradeResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelDistributionTradeResponse self = new CancelDistributionTradeResponse();
        return TeaModel.build(map, self);
    }

    public CancelDistributionTradeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelDistributionTradeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelDistributionTradeResponse setBody(CancelDistributionTradeResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelDistributionTradeResponseBody getBody() {
        return this.body;
    }

}
