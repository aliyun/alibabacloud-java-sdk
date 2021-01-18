// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20200910.models;

import com.aliyun.tea.*;

public class ExecuteServerSideVerificationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecuteServerSideVerificationResponseBody body;

    public static ExecuteServerSideVerificationResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteServerSideVerificationResponse self = new ExecuteServerSideVerificationResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteServerSideVerificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteServerSideVerificationResponse setBody(ExecuteServerSideVerificationResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteServerSideVerificationResponseBody getBody() {
        return this.body;
    }

}
