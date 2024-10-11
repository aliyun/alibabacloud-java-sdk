// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class DecribeRankingModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DecribeRankingModelResponseBody body;

    public static DecribeRankingModelResponse build(java.util.Map<String, ?> map) throws Exception {
        DecribeRankingModelResponse self = new DecribeRankingModelResponse();
        return TeaModel.build(map, self);
    }

    public DecribeRankingModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DecribeRankingModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DecribeRankingModelResponse setBody(DecribeRankingModelResponseBody body) {
        this.body = body;
        return this;
    }
    public DecribeRankingModelResponseBody getBody() {
        return this.body;
    }

}
