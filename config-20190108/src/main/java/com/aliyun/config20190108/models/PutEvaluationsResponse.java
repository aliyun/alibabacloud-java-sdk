// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class PutEvaluationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PutEvaluationsResponseBody body;

    public static PutEvaluationsResponse build(java.util.Map<String, ?> map) throws Exception {
        PutEvaluationsResponse self = new PutEvaluationsResponse();
        return TeaModel.build(map, self);
    }

    public PutEvaluationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutEvaluationsResponse setBody(PutEvaluationsResponseBody body) {
        this.body = body;
        return this;
    }
    public PutEvaluationsResponseBody getBody() {
        return this.body;
    }

}
