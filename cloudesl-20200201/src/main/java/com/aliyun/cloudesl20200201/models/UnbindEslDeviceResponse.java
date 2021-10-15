// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class UnbindEslDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UnbindEslDeviceResponseBody body;

    public static UnbindEslDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindEslDeviceResponse self = new UnbindEslDeviceResponse();
        return TeaModel.build(map, self);
    }

    public UnbindEslDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindEslDeviceResponse setBody(UnbindEslDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindEslDeviceResponseBody getBody() {
        return this.body;
    }

}
