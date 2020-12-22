// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class RecognizeExpressionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public RecognizeExpressionResponse setBody(RecognizeExpressionResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeExpressionResponseBody getBody() {
        return this.body;
    }

}
