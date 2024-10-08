// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class TransformMatchToExpressionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TransformMatchToExpressionResponseBody body;

    public static TransformMatchToExpressionResponse build(java.util.Map<String, ?> map) throws Exception {
        TransformMatchToExpressionResponse self = new TransformMatchToExpressionResponse();
        return TeaModel.build(map, self);
    }

    public TransformMatchToExpressionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TransformMatchToExpressionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TransformMatchToExpressionResponse setBody(TransformMatchToExpressionResponseBody body) {
        this.body = body;
        return this;
    }
    public TransformMatchToExpressionResponseBody getBody() {
        return this.body;
    }

}
