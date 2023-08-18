// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class DeleteWhitelistUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteWhitelistUserResponseBody body;

    public static DeleteWhitelistUserResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWhitelistUserResponse self = new DeleteWhitelistUserResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWhitelistUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWhitelistUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteWhitelistUserResponse setBody(DeleteWhitelistUserResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWhitelistUserResponseBody getBody() {
        return this.body;
    }

}
