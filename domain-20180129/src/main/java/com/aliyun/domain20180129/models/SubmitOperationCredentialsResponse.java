// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SubmitOperationCredentialsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitOperationCredentialsResponseBody body;

    public static SubmitOperationCredentialsResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitOperationCredentialsResponse self = new SubmitOperationCredentialsResponse();
        return TeaModel.build(map, self);
    }

    public SubmitOperationCredentialsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitOperationCredentialsResponse setBody(SubmitOperationCredentialsResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitOperationCredentialsResponseBody getBody() {
        return this.body;
    }

}
