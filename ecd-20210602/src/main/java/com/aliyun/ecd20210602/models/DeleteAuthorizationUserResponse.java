// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class DeleteAuthorizationUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAuthorizationUserResponseBody body;

    public static DeleteAuthorizationUserResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAuthorizationUserResponse self = new DeleteAuthorizationUserResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAuthorizationUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAuthorizationUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAuthorizationUserResponse setBody(DeleteAuthorizationUserResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAuthorizationUserResponseBody getBody() {
        return this.body;
    }

}
