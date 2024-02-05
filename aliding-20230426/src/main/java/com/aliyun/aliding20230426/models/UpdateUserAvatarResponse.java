// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateUserAvatarResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateUserAvatarResponseBody body;

    public static UpdateUserAvatarResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserAvatarResponse self = new UpdateUserAvatarResponse();
        return TeaModel.build(map, self);
    }

    public UpdateUserAvatarResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateUserAvatarResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateUserAvatarResponse setBody(UpdateUserAvatarResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateUserAvatarResponseBody getBody() {
        return this.body;
    }

}
