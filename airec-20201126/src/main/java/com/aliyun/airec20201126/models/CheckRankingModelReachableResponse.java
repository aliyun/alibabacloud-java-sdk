// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class CheckRankingModelReachableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckRankingModelReachableResponseBody body;

    public static CheckRankingModelReachableResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckRankingModelReachableResponse self = new CheckRankingModelReachableResponse();
        return TeaModel.build(map, self);
    }

    public CheckRankingModelReachableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckRankingModelReachableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckRankingModelReachableResponse setBody(CheckRankingModelReachableResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckRankingModelReachableResponseBody getBody() {
        return this.body;
    }

}
