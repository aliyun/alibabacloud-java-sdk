// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ClearDeviceDesiredPropertyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ClearDeviceDesiredPropertyResponseBody body;

    public static ClearDeviceDesiredPropertyResponse build(java.util.Map<String, ?> map) throws Exception {
        ClearDeviceDesiredPropertyResponse self = new ClearDeviceDesiredPropertyResponse();
        return TeaModel.build(map, self);
    }

    public ClearDeviceDesiredPropertyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClearDeviceDesiredPropertyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ClearDeviceDesiredPropertyResponse setBody(ClearDeviceDesiredPropertyResponseBody body) {
        this.body = body;
        return this;
    }
    public ClearDeviceDesiredPropertyResponseBody getBody() {
        return this.body;
    }

}
