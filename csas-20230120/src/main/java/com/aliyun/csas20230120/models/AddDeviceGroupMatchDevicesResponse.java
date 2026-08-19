// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class AddDeviceGroupMatchDevicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddDeviceGroupMatchDevicesResponseBody body;

    public static AddDeviceGroupMatchDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDeviceGroupMatchDevicesResponse self = new AddDeviceGroupMatchDevicesResponse();
        return TeaModel.build(map, self);
    }

    public AddDeviceGroupMatchDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddDeviceGroupMatchDevicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddDeviceGroupMatchDevicesResponse setBody(AddDeviceGroupMatchDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDeviceGroupMatchDevicesResponseBody getBody() {
        return this.body;
    }

}
