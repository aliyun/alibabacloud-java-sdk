// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class CreateRankingModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRankingModelResponseBody body;

    public static CreateRankingModelResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRankingModelResponse self = new CreateRankingModelResponse();
        return TeaModel.build(map, self);
    }

    public CreateRankingModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRankingModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRankingModelResponse setBody(CreateRankingModelResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRankingModelResponseBody getBody() {
        return this.body;
    }

}
