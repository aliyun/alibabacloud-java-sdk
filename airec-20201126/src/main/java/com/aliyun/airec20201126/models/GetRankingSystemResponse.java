// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class GetRankingSystemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRankingSystemResponseBody body;

    public static GetRankingSystemResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRankingSystemResponse self = new GetRankingSystemResponse();
        return TeaModel.build(map, self);
    }

    public GetRankingSystemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRankingSystemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRankingSystemResponse setBody(GetRankingSystemResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRankingSystemResponseBody getBody() {
        return this.body;
    }

}
