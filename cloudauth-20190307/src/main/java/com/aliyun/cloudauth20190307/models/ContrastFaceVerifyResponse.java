// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class ContrastFaceVerifyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ContrastFaceVerifyResponse setBody(ContrastFaceVerifyResponseBody body) {
        this.body = body;
        return this;
    }
    public ContrastFaceVerifyResponseBody getBody() {
        return this.body;
    }

}
