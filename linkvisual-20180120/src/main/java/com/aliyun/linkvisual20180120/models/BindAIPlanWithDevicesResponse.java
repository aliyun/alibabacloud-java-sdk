// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class BindAIPlanWithDevicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BindAIPlanWithDevicesResponseBody body;

    public static BindAIPlanWithDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        BindAIPlanWithDevicesResponse self = new BindAIPlanWithDevicesResponse();
        return TeaModel.build(map, self);
    }

    public BindAIPlanWithDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindAIPlanWithDevicesResponse setBody(BindAIPlanWithDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public BindAIPlanWithDevicesResponseBody getBody() {
        return this.body;
    }

}
