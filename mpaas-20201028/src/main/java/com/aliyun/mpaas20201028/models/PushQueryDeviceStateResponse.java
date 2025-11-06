// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class PushQueryDeviceStateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PushQueryDeviceStateResponseBody body;

    public static PushQueryDeviceStateResponse build(java.util.Map<String, ?> map) throws Exception {
        PushQueryDeviceStateResponse self = new PushQueryDeviceStateResponse();
        return TeaModel.build(map, self);
    }

    public PushQueryDeviceStateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushQueryDeviceStateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PushQueryDeviceStateResponse setBody(PushQueryDeviceStateResponseBody body) {
        this.body = body;
        return this;
    }
    public PushQueryDeviceStateResponseBody getBody() {
        return this.body;
    }

}
