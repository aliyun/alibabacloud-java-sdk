// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class RecognizeExpressionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecognizeExpressionResponseBody body;

    public static RecognizeExpressionResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeExpressionResponse self = new RecognizeExpressionResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeExpressionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeExpressionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeExpressionResponse setBody(RecognizeExpressionResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeExpressionResponseBody getBody() {
        return this.body;
    }

}
