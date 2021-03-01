// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertFlowControlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public InsertFlowControlResponseBody body;

    public static InsertFlowControlResponse build(java.util.Map<String, ?> map) throws Exception {
        InsertFlowControlResponse self = new InsertFlowControlResponse();
        return TeaModel.build(map, self);
    }

    public InsertFlowControlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InsertFlowControlResponse setBody(InsertFlowControlResponseBody body) {
        this.body = body;
        return this;
    }
    public InsertFlowControlResponseBody getBody() {
        return this.body;
    }

}
