// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class UnbindPictureSearchAppWithDevicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public UnbindPictureSearchAppWithDevicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnbindPictureSearchAppWithDevicesResponse setBody(UnbindPictureSearchAppWithDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindPictureSearchAppWithDevicesResponseBody getBody() {
        return this.body;
    }

}
