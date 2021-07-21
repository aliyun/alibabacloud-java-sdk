// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class DeleteAuthorizationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAuthorizationResponseBody body;

    public static DeleteAuthorizationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAuthorizationResponse self = new DeleteAuthorizationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAuthorizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAuthorizationResponse setBody(DeleteAuthorizationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAuthorizationResponseBody getBody() {
        return this.body;
    }

}
