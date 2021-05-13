// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RescaleDeviceServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public RescaleDeviceServiceResponse setBody(RescaleDeviceServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public RescaleDeviceServiceResponseBody getBody() {
        return this.body;
    }

}
