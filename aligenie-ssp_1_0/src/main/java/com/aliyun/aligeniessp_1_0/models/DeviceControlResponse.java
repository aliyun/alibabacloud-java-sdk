// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class DeviceControlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeviceControlResponseBody body;

    public static DeviceControlResponse build(java.util.Map<String, ?> map) throws Exception {
        DeviceControlResponse self = new DeviceControlResponse();
        return TeaModel.build(map, self);
    }

    public DeviceControlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeviceControlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeviceControlResponse setBody(DeviceControlResponseBody body) {
        this.body = body;
        return this;
    }
    public DeviceControlResponseBody getBody() {
        return this.body;
    }

}
