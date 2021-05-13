// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RestartDeviceInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RestartDeviceInstanceResponseBody body;

    public static RestartDeviceInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RestartDeviceInstanceResponse self = new RestartDeviceInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RestartDeviceInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestartDeviceInstanceResponse setBody(RestartDeviceInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RestartDeviceInstanceResponseBody getBody() {
        return this.body;
    }

}
