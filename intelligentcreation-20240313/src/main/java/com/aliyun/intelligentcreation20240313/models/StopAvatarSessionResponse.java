// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class StopAvatarSessionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopAvatarSessionResponseBody body;

    public static StopAvatarSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        StopAvatarSessionResponse self = new StopAvatarSessionResponse();
        return TeaModel.build(map, self);
    }

    public StopAvatarSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopAvatarSessionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopAvatarSessionResponse setBody(StopAvatarSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public StopAvatarSessionResponseBody getBody() {
        return this.body;
    }

}
