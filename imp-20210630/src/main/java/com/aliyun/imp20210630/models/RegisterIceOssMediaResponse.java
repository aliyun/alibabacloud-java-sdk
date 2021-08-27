// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class RegisterIceOssMediaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RegisterIceOssMediaResponseBody body;

    public static RegisterIceOssMediaResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterIceOssMediaResponse self = new RegisterIceOssMediaResponse();
        return TeaModel.build(map, self);
    }

    public RegisterIceOssMediaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RegisterIceOssMediaResponse setBody(RegisterIceOssMediaResponseBody body) {
        this.body = body;
        return this;
    }
    public RegisterIceOssMediaResponseBody getBody() {
        return this.body;
    }

}
