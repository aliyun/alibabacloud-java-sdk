// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class MuteAllGroupUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MuteAllGroupUserResponseBody body;

    public static MuteAllGroupUserResponse build(java.util.Map<String, ?> map) throws Exception {
        MuteAllGroupUserResponse self = new MuteAllGroupUserResponse();
        return TeaModel.build(map, self);
    }

    public MuteAllGroupUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MuteAllGroupUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MuteAllGroupUserResponse setBody(MuteAllGroupUserResponseBody body) {
        this.body = body;
        return this;
    }
    public MuteAllGroupUserResponseBody getBody() {
        return this.body;
    }

}
