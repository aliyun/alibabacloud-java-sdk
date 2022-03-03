// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GisQueryDeviceLocationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GisQueryDeviceLocationResponse setBody(GisQueryDeviceLocationResponseBody body) {
        this.body = body;
        return this;
    }
    public GisQueryDeviceLocationResponseBody getBody() {
        return this.body;
    }

}
