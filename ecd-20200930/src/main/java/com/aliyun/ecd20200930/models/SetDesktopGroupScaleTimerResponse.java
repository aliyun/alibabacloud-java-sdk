// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class SetDesktopGroupScaleTimerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetDesktopGroupScaleTimerResponseBody body;

    public static SetDesktopGroupScaleTimerResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDesktopGroupScaleTimerResponse self = new SetDesktopGroupScaleTimerResponse();
        return TeaModel.build(map, self);
    }

    public SetDesktopGroupScaleTimerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDesktopGroupScaleTimerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetDesktopGroupScaleTimerResponse setBody(SetDesktopGroupScaleTimerResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDesktopGroupScaleTimerResponseBody getBody() {
        return this.body;
    }

}
