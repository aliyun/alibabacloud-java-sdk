// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class TransformExpressionToMatchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TransformExpressionToMatchResponseBody body;

    public static TransformExpressionToMatchResponse build(java.util.Map<String, ?> map) throws Exception {
        TransformExpressionToMatchResponse self = new TransformExpressionToMatchResponse();
        return TeaModel.build(map, self);
    }

    public TransformExpressionToMatchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TransformExpressionToMatchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TransformExpressionToMatchResponse setBody(TransformExpressionToMatchResponseBody body) {
        this.body = body;
        return this;
    }
    public TransformExpressionToMatchResponseBody getBody() {
        return this.body;
    }

}
