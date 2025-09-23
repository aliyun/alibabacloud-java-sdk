// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetBiddingDocInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBiddingDocInfoResponseBody body;

    public static GetBiddingDocInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBiddingDocInfoResponse self = new GetBiddingDocInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetBiddingDocInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBiddingDocInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBiddingDocInfoResponse setBody(GetBiddingDocInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBiddingDocInfoResponseBody getBody() {
        return this.body;
    }

}
