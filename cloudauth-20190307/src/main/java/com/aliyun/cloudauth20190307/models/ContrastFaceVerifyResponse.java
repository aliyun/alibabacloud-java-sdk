// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class ContrastFaceVerifyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ContrastFaceVerifyResponseBody body;

    public static ContrastFaceVerifyResponse build(java.util.Map<String, ?> map) throws Exception {
        ContrastFaceVerifyResponse self = new ContrastFaceVerifyResponse();
        return TeaModel.build(map, self);
    }

    public ContrastFaceVerifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ContrastFaceVerifyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ContrastFaceVerifyResponse setBody(ContrastFaceVerifyResponseBody body) {
        this.body = body;
        return this;
    }
    public ContrastFaceVerifyResponseBody getBody() {
        return this.body;
    }

}
