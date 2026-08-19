// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class RemoveDeviceGroupMatchDevicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveDeviceGroupMatchDevicesResponseBody body;

    public static RemoveDeviceGroupMatchDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveDeviceGroupMatchDevicesResponse self = new RemoveDeviceGroupMatchDevicesResponse();
        return TeaModel.build(map, self);
    }

    public RemoveDeviceGroupMatchDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveDeviceGroupMatchDevicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveDeviceGroupMatchDevicesResponse setBody(RemoveDeviceGroupMatchDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveDeviceGroupMatchDevicesResponseBody getBody() {
        return this.body;
    }

}
