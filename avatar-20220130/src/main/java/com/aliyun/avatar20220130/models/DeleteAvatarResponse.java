// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class DeleteAvatarResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAvatarResponseBody body;

    public static DeleteAvatarResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAvatarResponse self = new DeleteAvatarResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAvatarResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAvatarResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAvatarResponse setBody(DeleteAvatarResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAvatarResponseBody getBody() {
        return this.body;
    }

}
