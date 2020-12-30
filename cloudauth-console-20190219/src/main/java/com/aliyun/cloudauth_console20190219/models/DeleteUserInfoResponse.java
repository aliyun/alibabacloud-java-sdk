// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class DeleteUserInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteUserInfoResponseBody body;

    public static DeleteUserInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserInfoResponse self = new DeleteUserInfoResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUserInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUserInfoResponse setBody(DeleteUserInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUserInfoResponseBody getBody() {
        return this.body;
    }

}
