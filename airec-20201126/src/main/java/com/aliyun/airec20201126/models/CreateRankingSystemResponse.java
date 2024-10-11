// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class CreateRankingSystemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRankingSystemResponseBody body;

    public static CreateRankingSystemResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRankingSystemResponse self = new CreateRankingSystemResponse();
        return TeaModel.build(map, self);
    }

    public CreateRankingSystemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRankingSystemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRankingSystemResponse setBody(CreateRankingSystemResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRankingSystemResponseBody getBody() {
        return this.body;
    }

}
