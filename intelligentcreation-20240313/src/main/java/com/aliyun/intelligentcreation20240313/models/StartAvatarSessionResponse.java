// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class StartAvatarSessionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartAvatarSessionResponseBody body;

    public static StartAvatarSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        StartAvatarSessionResponse self = new StartAvatarSessionResponse();
        return TeaModel.build(map, self);
    }

    public StartAvatarSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartAvatarSessionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartAvatarSessionResponse setBody(StartAvatarSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public StartAvatarSessionResponseBody getBody() {
        return this.body;
    }

}
