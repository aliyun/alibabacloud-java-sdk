// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csp20201020.models;

import com.aliyun.tea.*;

public class DeleteAclAuthorizationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAclAuthorizationResponseBody body;

    public static DeleteAclAuthorizationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAclAuthorizationResponse self = new DeleteAclAuthorizationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAclAuthorizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAclAuthorizationResponse setBody(DeleteAclAuthorizationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAclAuthorizationResponseBody getBody() {
        return this.body;
    }

}
