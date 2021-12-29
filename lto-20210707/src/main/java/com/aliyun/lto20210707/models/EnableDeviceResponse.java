// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class EnableDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableDeviceResponseBody body;

    public static EnableDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableDeviceResponse self = new EnableDeviceResponse();
        return TeaModel.build(map, self);
    }

    public EnableDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableDeviceResponse setBody(EnableDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableDeviceResponseBody getBody() {
        return this.body;
    }

}
