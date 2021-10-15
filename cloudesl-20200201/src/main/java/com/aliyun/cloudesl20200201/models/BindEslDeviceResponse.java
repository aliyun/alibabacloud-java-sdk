// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class BindEslDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BindEslDeviceResponseBody body;

    public static BindEslDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        BindEslDeviceResponse self = new BindEslDeviceResponse();
        return TeaModel.build(map, self);
    }

    public BindEslDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindEslDeviceResponse setBody(BindEslDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public BindEslDeviceResponseBody getBody() {
        return this.body;
    }

}
