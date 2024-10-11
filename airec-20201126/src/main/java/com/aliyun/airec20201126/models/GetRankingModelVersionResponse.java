// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class GetRankingModelVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRankingModelVersionResponseBody body;

    public static GetRankingModelVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRankingModelVersionResponse self = new GetRankingModelVersionResponse();
        return TeaModel.build(map, self);
    }

    public GetRankingModelVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRankingModelVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRankingModelVersionResponse setBody(GetRankingModelVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRankingModelVersionResponseBody getBody() {
        return this.body;
    }

}
