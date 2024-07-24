// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20230627.models;

import com.aliyun.tea.*;

public class CancelSpecReviewTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelSpecReviewTaskResponseBody body;

    public static CancelSpecReviewTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelSpecReviewTaskResponse self = new CancelSpecReviewTaskResponse();
        return TeaModel.build(map, self);
    }

    public CancelSpecReviewTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelSpecReviewTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelSpecReviewTaskResponse setBody(CancelSpecReviewTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelSpecReviewTaskResponseBody getBody() {
        return this.body;
    }

}
