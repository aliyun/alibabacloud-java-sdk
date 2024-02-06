// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RescaleDeviceServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RescaleDeviceServiceResponseBody body;

    public static RescaleDeviceServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        RescaleDeviceServiceResponse self = new RescaleDeviceServiceResponse();
        return TeaModel.build(map, self);
    }

    public RescaleDeviceServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RescaleDeviceServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RescaleDeviceServiceResponse setBody(RescaleDeviceServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public RescaleDeviceServiceResponseBody getBody() {
        return this.body;
    }

}
