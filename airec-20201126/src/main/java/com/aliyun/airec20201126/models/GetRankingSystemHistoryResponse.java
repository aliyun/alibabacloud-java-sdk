// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class GetRankingSystemHistoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRankingSystemHistoryResponseBody body;

    public static GetRankingSystemHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRankingSystemHistoryResponse self = new GetRankingSystemHistoryResponse();
        return TeaModel.build(map, self);
    }

    public GetRankingSystemHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRankingSystemHistoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRankingSystemHistoryResponse setBody(GetRankingSystemHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRankingSystemHistoryResponseBody getBody() {
        return this.body;
    }

}
