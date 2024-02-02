// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GisQueryDeviceLocationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GisQueryDeviceLocationResponseBody body;

    public static GisQueryDeviceLocationResponse build(java.util.Map<String, ?> map) throws Exception {
        GisQueryDeviceLocationResponse self = new GisQueryDeviceLocationResponse();
        return TeaModel.build(map, self);
    }

    public GisQueryDeviceLocationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GisQueryDeviceLocationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GisQueryDeviceLocationResponse setBody(GisQueryDeviceLocationResponseBody body) {
        this.body = body;
        return this;
    }
    public GisQueryDeviceLocationResponseBody getBody() {
        return this.body;
    }

}
