// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CancelMuteGroupUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelMuteGroupUserResponseBody body;

    public static CancelMuteGroupUserResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelMuteGroupUserResponse self = new CancelMuteGroupUserResponse();
        return TeaModel.build(map, self);
    }

    public CancelMuteGroupUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelMuteGroupUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelMuteGroupUserResponse setBody(CancelMuteGroupUserResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelMuteGroupUserResponseBody getBody() {
        return this.body;
    }

}
