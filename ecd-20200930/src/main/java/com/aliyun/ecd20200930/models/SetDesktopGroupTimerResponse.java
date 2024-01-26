// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class SetDesktopGroupTimerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetDesktopGroupTimerResponseBody body;

    public static SetDesktopGroupTimerResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDesktopGroupTimerResponse self = new SetDesktopGroupTimerResponse();
        return TeaModel.build(map, self);
    }

    public SetDesktopGroupTimerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDesktopGroupTimerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetDesktopGroupTimerResponse setBody(SetDesktopGroupTimerResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDesktopGroupTimerResponseBody getBody() {
        return this.body;
    }

}
