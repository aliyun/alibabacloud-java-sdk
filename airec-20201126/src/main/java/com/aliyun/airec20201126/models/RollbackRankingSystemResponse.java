// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class RollbackRankingSystemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RollbackRankingSystemResponseBody body;

    public static RollbackRankingSystemResponse build(java.util.Map<String, ?> map) throws Exception {
        RollbackRankingSystemResponse self = new RollbackRankingSystemResponse();
        return TeaModel.build(map, self);
    }

    public RollbackRankingSystemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RollbackRankingSystemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RollbackRankingSystemResponse setBody(RollbackRankingSystemResponseBody body) {
        this.body = body;
        return this;
    }
    public RollbackRankingSystemResponseBody getBody() {
        return this.body;
    }

}
