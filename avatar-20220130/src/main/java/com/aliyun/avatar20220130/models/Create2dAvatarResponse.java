// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class Create2dAvatarResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public Create2dAvatarResponseBody body;

    public static Create2dAvatarResponse build(java.util.Map<String, ?> map) throws Exception {
        Create2dAvatarResponse self = new Create2dAvatarResponse();
        return TeaModel.build(map, self);
    }

    public Create2dAvatarResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public Create2dAvatarResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public Create2dAvatarResponse setBody(Create2dAvatarResponseBody body) {
        this.body = body;
        return this;
    }
    public Create2dAvatarResponseBody getBody() {
        return this.body;
    }

}
