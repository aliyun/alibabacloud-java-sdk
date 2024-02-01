// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class BindPictureSearchAppWithDevicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BindPictureSearchAppWithDevicesResponseBody body;

    public static BindPictureSearchAppWithDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        BindPictureSearchAppWithDevicesResponse self = new BindPictureSearchAppWithDevicesResponse();
        return TeaModel.build(map, self);
    }

    public BindPictureSearchAppWithDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindPictureSearchAppWithDevicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindPictureSearchAppWithDevicesResponse setBody(BindPictureSearchAppWithDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public BindPictureSearchAppWithDevicesResponseBody getBody() {
        return this.body;
    }

}
