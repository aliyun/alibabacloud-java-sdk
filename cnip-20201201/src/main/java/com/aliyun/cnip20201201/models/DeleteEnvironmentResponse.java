// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class DeleteEnvironmentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteEnvironmentResponseBody body;

    public static DeleteEnvironmentResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEnvironmentResponse self = new DeleteEnvironmentResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEnvironmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEnvironmentResponse setBody(DeleteEnvironmentResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEnvironmentResponseBody getBody() {
        return this.body;
    }

}
