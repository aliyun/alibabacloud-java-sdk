// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class CheckRamAuthResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckRamAuthResponseBody body;

    public static CheckRamAuthResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckRamAuthResponse self = new CheckRamAuthResponse();
        return TeaModel.build(map, self);
    }

    public CheckRamAuthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckRamAuthResponse setBody(CheckRamAuthResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckRamAuthResponseBody getBody() {
        return this.body;
    }

}
