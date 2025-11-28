// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DisableDeviceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableDeviceResponseBody body;

    public static DisableDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableDeviceResponse self = new DisableDeviceResponse();
        return TeaModel.build(map, self);
    }

    public DisableDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableDeviceResponse setBody(DisableDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableDeviceResponseBody getBody() {
        return this.body;
    }

}
