// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class RecommendResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecommendResponseBody body;

    public static RecommendResponse build(java.util.Map<String, ?> map) throws Exception {
        RecommendResponse self = new RecommendResponse();
        return TeaModel.build(map, self);
    }

    public RecommendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecommendResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecommendResponse setBody(RecommendResponseBody body) {
        this.body = body;
        return this;
    }
    public RecommendResponseBody getBody() {
        return this.body;
    }

}
