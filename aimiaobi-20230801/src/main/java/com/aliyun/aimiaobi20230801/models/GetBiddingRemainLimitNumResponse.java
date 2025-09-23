// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetBiddingRemainLimitNumResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBiddingRemainLimitNumResponseBody body;

    public static GetBiddingRemainLimitNumResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBiddingRemainLimitNumResponse self = new GetBiddingRemainLimitNumResponse();
        return TeaModel.build(map, self);
    }

    public GetBiddingRemainLimitNumResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBiddingRemainLimitNumResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBiddingRemainLimitNumResponse setBody(GetBiddingRemainLimitNumResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBiddingRemainLimitNumResponseBody getBody() {
        return this.body;
    }

}
