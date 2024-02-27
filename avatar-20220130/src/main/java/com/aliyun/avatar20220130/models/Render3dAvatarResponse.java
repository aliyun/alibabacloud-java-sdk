// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class Render3dAvatarResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public Render3dAvatarResponseBody body;

    public static Render3dAvatarResponse build(java.util.Map<String, ?> map) throws Exception {
        Render3dAvatarResponse self = new Render3dAvatarResponse();
        return TeaModel.build(map, self);
    }

    public Render3dAvatarResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public Render3dAvatarResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public Render3dAvatarResponse setBody(Render3dAvatarResponseBody body) {
        this.body = body;
        return this;
    }
    public Render3dAvatarResponseBody getBody() {
        return this.body;
    }

}
