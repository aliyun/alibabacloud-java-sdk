// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CancelMuteAllGroupUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CancelMuteAllGroupUserResponseBody body;

    public static CancelMuteAllGroupUserResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelMuteAllGroupUserResponse self = new CancelMuteAllGroupUserResponse();
        return TeaModel.build(map, self);
    }

    public CancelMuteAllGroupUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelMuteAllGroupUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelMuteAllGroupUserResponse setBody(CancelMuteAllGroupUserResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelMuteAllGroupUserResponseBody getBody() {
        return this.body;
    }

}
