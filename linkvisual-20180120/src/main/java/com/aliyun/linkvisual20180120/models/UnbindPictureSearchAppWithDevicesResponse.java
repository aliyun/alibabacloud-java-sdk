// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class UnbindPictureSearchAppWithDevicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UnbindPictureSearchAppWithDevicesResponseBody body;

    public static UnbindPictureSearchAppWithDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindPictureSearchAppWithDevicesResponse self = new UnbindPictureSearchAppWithDevicesResponse();
        return TeaModel.build(map, self);
    }

    public UnbindPictureSearchAppWithDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindPictureSearchAppWithDevicesResponse setBody(UnbindPictureSearchAppWithDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindPictureSearchAppWithDevicesResponseBody getBody() {
        return this.body;
    }

}
