// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ei_iot_openapi20211104.models;

import com.aliyun.tea.*;

public class BindDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public Response body;

    public static BindDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        BindDeviceResponse self = new BindDeviceResponse();
        return TeaModel.build(map, self);
    }

    public BindDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindDeviceResponse setBody(Response body) {
        this.body = body;
        return this;
    }
    public Response getBody() {
        return this.body;
    }

}
