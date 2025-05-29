// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianmodelonchip20240816.models;

import com.aliyun.tea.*;

public class DeviceRegisterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeviceRegisterResponseBody body;

    public static DeviceRegisterResponse build(java.util.Map<String, ?> map) throws Exception {
        DeviceRegisterResponse self = new DeviceRegisterResponse();
        return TeaModel.build(map, self);
    }

    public DeviceRegisterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeviceRegisterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeviceRegisterResponse setBody(DeviceRegisterResponseBody body) {
        this.body = body;
        return this;
    }
    public DeviceRegisterResponseBody getBody() {
        return this.body;
    }

}
