// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class SetDesktopGroupTimerStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetDesktopGroupTimerStatusResponseBody body;

    public static SetDesktopGroupTimerStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDesktopGroupTimerStatusResponse self = new SetDesktopGroupTimerStatusResponse();
        return TeaModel.build(map, self);
    }

    public SetDesktopGroupTimerStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDesktopGroupTimerStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetDesktopGroupTimerStatusResponse setBody(SetDesktopGroupTimerStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDesktopGroupTimerStatusResponseBody getBody() {
        return this.body;
    }

}
