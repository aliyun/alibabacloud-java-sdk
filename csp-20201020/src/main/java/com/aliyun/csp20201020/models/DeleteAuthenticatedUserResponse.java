// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csp20201020.models;

import com.aliyun.tea.*;

public class DeleteAuthenticatedUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAuthenticatedUserResponseBody body;

    public static DeleteAuthenticatedUserResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAuthenticatedUserResponse self = new DeleteAuthenticatedUserResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAuthenticatedUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAuthenticatedUserResponse setBody(DeleteAuthenticatedUserResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAuthenticatedUserResponseBody getBody() {
        return this.body;
    }

}
