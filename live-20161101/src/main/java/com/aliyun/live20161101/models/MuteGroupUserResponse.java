// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class MuteGroupUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MuteGroupUserResponseBody body;

    public static MuteGroupUserResponse build(java.util.Map<String, ?> map) throws Exception {
        MuteGroupUserResponse self = new MuteGroupUserResponse();
        return TeaModel.build(map, self);
    }

    public MuteGroupUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MuteGroupUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MuteGroupUserResponse setBody(MuteGroupUserResponseBody body) {
        this.body = body;
        return this;
    }
    public MuteGroupUserResponseBody getBody() {
        return this.body;
    }

}
