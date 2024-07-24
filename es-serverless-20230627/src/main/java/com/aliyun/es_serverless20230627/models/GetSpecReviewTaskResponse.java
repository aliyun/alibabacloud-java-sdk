// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20230627.models;

import com.aliyun.tea.*;

public class GetSpecReviewTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSpecReviewTaskResponseBody body;

    public static GetSpecReviewTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSpecReviewTaskResponse self = new GetSpecReviewTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetSpecReviewTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSpecReviewTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSpecReviewTaskResponse setBody(GetSpecReviewTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSpecReviewTaskResponseBody getBody() {
        return this.body;
    }

}
