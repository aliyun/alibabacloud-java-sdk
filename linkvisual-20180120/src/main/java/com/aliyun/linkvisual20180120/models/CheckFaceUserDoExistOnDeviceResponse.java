// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class CheckFaceUserDoExistOnDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckFaceUserDoExistOnDeviceResponseBody body;

    public static CheckFaceUserDoExistOnDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckFaceUserDoExistOnDeviceResponse self = new CheckFaceUserDoExistOnDeviceResponse();
        return TeaModel.build(map, self);
    }

    public CheckFaceUserDoExistOnDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckFaceUserDoExistOnDeviceResponse setBody(CheckFaceUserDoExistOnDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckFaceUserDoExistOnDeviceResponseBody getBody() {
        return this.body;
    }

}
