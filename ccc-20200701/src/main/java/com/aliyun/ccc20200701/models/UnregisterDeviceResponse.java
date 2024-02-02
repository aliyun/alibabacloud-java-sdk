// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class UnregisterDeviceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnregisterDeviceResponseBody body;

    public static UnregisterDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        UnregisterDeviceResponse self = new UnregisterDeviceResponse();
        return TeaModel.build(map, self);
    }

    public UnregisterDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnregisterDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnregisterDeviceResponse setBody(UnregisterDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public UnregisterDeviceResponseBody getBody() {
        return this.body;
    }

}
