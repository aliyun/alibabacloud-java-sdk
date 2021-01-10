// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class UnbindAIPlanWithDevicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UnbindAIPlanWithDevicesResponseBody body;

    public static UnbindAIPlanWithDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindAIPlanWithDevicesResponse self = new UnbindAIPlanWithDevicesResponse();
        return TeaModel.build(map, self);
    }

    public UnbindAIPlanWithDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindAIPlanWithDevicesResponse setBody(UnbindAIPlanWithDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindAIPlanWithDevicesResponseBody getBody() {
        return this.body;
    }

}
