// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class Update2dAvatarResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public Update2dAvatarResponseBody body;

    public static Update2dAvatarResponse build(java.util.Map<String, ?> map) throws Exception {
        Update2dAvatarResponse self = new Update2dAvatarResponse();
        return TeaModel.build(map, self);
    }

    public Update2dAvatarResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public Update2dAvatarResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public Update2dAvatarResponse setBody(Update2dAvatarResponseBody body) {
        this.body = body;
        return this;
    }
    public Update2dAvatarResponseBody getBody() {
        return this.body;
    }

}
