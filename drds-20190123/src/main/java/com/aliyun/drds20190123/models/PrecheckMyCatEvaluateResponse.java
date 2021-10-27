// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class PrecheckMyCatEvaluateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PrecheckMyCatEvaluateResponseBody body;

    public static PrecheckMyCatEvaluateResponse build(java.util.Map<String, ?> map) throws Exception {
        PrecheckMyCatEvaluateResponse self = new PrecheckMyCatEvaluateResponse();
        return TeaModel.build(map, self);
    }

    public PrecheckMyCatEvaluateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PrecheckMyCatEvaluateResponse setBody(PrecheckMyCatEvaluateResponseBody body) {
        this.body = body;
        return this;
    }
    public PrecheckMyCatEvaluateResponseBody getBody() {
        return this.body;
    }

}
