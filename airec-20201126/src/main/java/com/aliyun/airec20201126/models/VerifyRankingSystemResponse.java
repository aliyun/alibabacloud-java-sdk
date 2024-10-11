// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class VerifyRankingSystemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VerifyRankingSystemResponseBody body;

    public static VerifyRankingSystemResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyRankingSystemResponse self = new VerifyRankingSystemResponse();
        return TeaModel.build(map, self);
    }

    public VerifyRankingSystemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyRankingSystemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VerifyRankingSystemResponse setBody(VerifyRankingSystemResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyRankingSystemResponseBody getBody() {
        return this.body;
    }

}
